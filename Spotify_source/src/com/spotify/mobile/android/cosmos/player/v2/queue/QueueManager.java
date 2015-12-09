// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;

import android.content.Context;
import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.queue:
//            ExplicitQueue

public class QueueManager
{

    private static final String PLAY_QUEUE_URI = "sp://playqueue/v2/";
    public static final String REVISION_HEADER = "x-spotify-revision";
    private ObjectMapper mObjectMapper;
    private final Resolver mResolver;

    public QueueManager(Resolver resolver, ObjectMapper objectmapper)
    {
        mResolver = resolver;
        mObjectMapper = objectmapper;
    }

    public static boolean isExplicitlyQueued(PlayerTrack playertrack)
    {
        return "queue".equalsIgnoreCase(playertrack.provider());
    }

    private void makeQueueRequest(GetObserver getobserver)
    {
        mResolver.resolve(new Request("GET", "sp://playqueue/v2/"), new JsonCallbackReceiver(com/spotify/mobile/android/cosmos/player/v2/queue/ExplicitQueue, getobserver) {

            final QueueManager this$0;
            final GetObserver val$observer;

            protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                observer.onError(throwable);
            }

            protected void onResolved(Response response, ExplicitQueue explicitqueue)
            {
                response = (String)response.getHeaders().get("x-spotify-revision");
                observer.onQueueReceived(explicitqueue, response);
            }

            protected volatile void onResolved(Response response, Object obj)
            {
                onResolved(response, (ExplicitQueue)obj);
            }

            
            {
                this$0 = QueueManager.this;
                observer = getobserver;
                super(final_handler, class1);
            }

            private class GetObserver
            {

                public abstract void onError(Throwable throwable);

                public abstract void onQueueReceived(ExplicitQueue explicitqueue, String s);
            }

        });
    }

    private void onRemoveResult(int i)
    {
    }

    private void removeItemFromQueue(ExplicitQueue explicitqueue, String s, int i)
    {
        if (i >= explicitqueue.tracks.length || i < 0)
        {
            Logger.b("Attempt to remove the track that does not belong to the explicit queue", new Object[0]);
            return;
        } else
        {
            explicitqueue.removeItem(i);
            updateQueueRequest(explicitqueue, s, new UpdateObserver() {

                final QueueManager this$0;

                public void onError(Throwable throwable)
                {
                    Logger.b(throwable, "Failed to update queue.", new Object[0]);
                }

                public void onSuccess(Response response)
                {
                    onRemoveResult(response.getStatus());
                }

            
            {
                this$0 = QueueManager.this;
                super();
            }
            });
            return;
        }
    }

    private void updateQueueRequest(ExplicitQueue explicitqueue, String s, UpdateObserver updateobserver)
    {
        try
        {
            explicitqueue = mObjectMapper.writeValueAsBytes(explicitqueue);
            explicitqueue = new Request("PUT", (new StringBuilder("sp://playqueue/v2/?revision=")).append(s).toString(), null, explicitqueue);
            mResolver.resolve(explicitqueue, new com.spotify.cosmos.android.Resolver.CallbackReceiver(updateobserver) {

                final QueueManager this$0;
                final UpdateObserver val$updateObserver;

                protected void onError(Throwable throwable)
                {
                    if (updateObserver != null)
                    {
                        updateObserver.onError(throwable);
                    }
                }

                protected void onResolved(Response response)
                {
                    if (updateObserver != null)
                    {
                        updateObserver.onSuccess(response);
                    }
                }

            
            {
                this$0 = QueueManager.this;
                updateObserver = updateobserver;
                super(final_handler);
            }

                private class UpdateObserver
                {

                    public abstract void onError(Throwable throwable);

                    public abstract void onSuccess(Response response);
                }

            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ExplicitQueue explicitqueue)
        {
            Logger.a(explicitqueue, "Failed to write play queue to JSON", new Object[0]);
        }
    }

    public void addTrack(Context context, PlayerTrack playertrack, final QueueObserver queueObserver)
    {
        mResolver.connect();
        (new QueueManager(mResolver, mObjectMapper)).addTrack(playertrack, new UpdateObserver() {

            final QueueManager this$0;
            final QueueObserver val$queueObserver;

            public void onError(Throwable throwable)
            {
                mResolver.destroy();
                class QueueObserver.ErrorCause extends Enum
                {

                    private static final QueueObserver.ErrorCause $VALUES[];
                    public static final QueueObserver.ErrorCause CONFLICT;
                    public static final QueueObserver.ErrorCause SERVER_ERROR;
                    public static final QueueObserver.ErrorCause UNSUPPORTED_MEDIA_TPYE;

                    public static QueueObserver.ErrorCause valueOf(String s)
                    {
                        return (QueueObserver.ErrorCause)Enum.valueOf(com/spotify/mobile/android/cosmos/player/v2/queue/QueueManager$QueueObserver$ErrorCause, s);
                    }

                    public static QueueObserver.ErrorCause[] values()
                    {
                        return (QueueObserver.ErrorCause[])$VALUES.clone();
                    }

                    static 
                    {
                        CONFLICT = new QueueObserver.ErrorCause("CONFLICT", 0);
                        UNSUPPORTED_MEDIA_TPYE = new QueueObserver.ErrorCause("UNSUPPORTED_MEDIA_TPYE", 1);
                        SERVER_ERROR = new QueueObserver.ErrorCause("SERVER_ERROR", 2);
                        $VALUES = (new QueueObserver.ErrorCause[] {
                            CONFLICT, UNSUPPORTED_MEDIA_TPYE, SERVER_ERROR
                        });
                    }

                        private QueueObserver.ErrorCause(String s, int i)
                        {
                            super(s, i);
                        }
                }

                if (queueObserver != null)
                {
                    queueObserver.onError(QueueObserver.ErrorCause.SERVER_ERROR);
                }
            }

            public void onSuccess(Response response)
            {
label0:
                {
label1:
                    {
label2:
                        {
                            mResolver.destroy();
                            if (queueObserver != null)
                            {
                                switch (response.getStatus())
                                {
                                default:
                                    queueObserver.onError(QueueObserver.ErrorCause.SERVER_ERROR);
                                    break;

                                case 204: 
                                    break label2;

                                case 409: 
                                    break label1;

                                case 415: 
                                    break label0;
                                }
                            }
                            return;
                        }
                        queueObserver.onSuccess();
                        return;
                    }
                    queueObserver.onError(QueueObserver.ErrorCause.CONFLICT);
                    return;
                }
                queueObserver.onError(QueueObserver.ErrorCause.UNSUPPORTED_MEDIA_TPYE);
            }

            
            {
                this$0 = QueueManager.this;
                queueObserver = queueobserver;
                super();
            }

            private class QueueObserver
            {

                public abstract void onError(ErrorCause errorcause);

                public abstract void onSuccess();
            }

        });
    }

    public void addTrack(PlayerTrack playertrack)
    {
        addTrack(playertrack, null);
    }

    public void addTrack(final PlayerTrack playerTrack, final UpdateObserver updateObserver)
    {
        makeQueueRequest(new GetObserver() {

            final QueueManager this$0;
            final PlayerTrack val$playerTrack;
            final UpdateObserver val$updateObserver;

            public void onError(Throwable throwable)
            {
                if (updateObserver != null)
                {
                    updateObserver.onError(throwable);
                }
            }

            public void onQueueReceived(ExplicitQueue explicitqueue, String s)
            {
                explicitqueue.addItem(playerTrack);
                updateQueueRequest(explicitqueue, s, updateObserver);
            }

            
            {
                this$0 = QueueManager.this;
                playerTrack = playertrack;
                updateObserver = updateobserver;
                super();
            }
        });
    }

    public void removeTrack(PlayerTrack aplayertrack[], int i)
    {
        int j = 0;
        if (aplayertrack == null || aplayertrack.length == 0)
        {
            return;
        }
        if (!isExplicitlyQueued(aplayertrack[0]))
        {
            j = 1;
        }
        makeQueueRequest(new GetObserver() {

            final QueueManager this$0;
            final int val$indexToRemove;

            public void onError(Throwable throwable)
            {
                Logger.b(throwable, "Failed to remove track from queue.", new Object[0]);
            }

            public void onQueueReceived(ExplicitQueue explicitqueue, String s)
            {
                removeItemFromQueue(explicitqueue, s, indexToRemove);
            }

            
            {
                this$0 = QueueManager.this;
                indexToRemove = i;
                super();
            }
        });
    }




}
