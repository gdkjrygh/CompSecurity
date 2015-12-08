// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.h;
import com.google.android.gms.wearable.i;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.o;
import com.skype.android.app.common.Emoticon;
import com.skype.android.app.common.EmoticonPack;
import com.skype.android.app.common.EmoticonPackList;
import com.skype.android.app.wear.ProtocolCommonCommands;
import com.skype.android.app.wear.WearDataRequestCache;
import com.skype.android.app.wear.util.AsyncIterator;
import com.skype.android.app.wear.util.WearDataLayerUtil;
import com.skype.android.concurrent.FutureListener;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.PackInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.skype.android.app.wear.command:
//            CompletionWearCommand

public class NotifyEmoticonsUpdatedCommand extends CompletionWearCommand
{
    private static final class a
        implements com.google.android.gms.common.api.h
    {

        private final com.google.android.gms.common.api.h resultCallback;
        private final WearDataRequestCache wearCache;

        public final volatile void onResult(g g)
        {
            onResult((com.google.android.gms.wearable.c.a)g);
        }

        public final void onResult(com.google.android.gms.wearable.c.a a1)
        {
            if (a1.getStatus().d())
            {
                wearCache.putEmoticonListCacheDataUrl(a1.a().b().toString());
            }
            resultCallback.onResult(a1);
        }

        public a(WearDataRequestCache weardatarequestcache, com.google.android.gms.common.api.h h1)
        {
            wearCache = weardatarequestcache;
            resultCallback = h1;
        }
    }


    private static final String TAG = "EmoticonsUpdatedCommand";
    private String emoticonListUri;
    private final Map packsAndContents;
    private WearDataRequestCache wearCache;

    public NotifyEmoticonsUpdatedCommand(WearDataRequestCache weardatarequestcache)
    {
        packsAndContents = new TreeMap(new Comparator() {

            final NotifyEmoticonsUpdatedCommand this$0;

            public final int compare(PackInfo packinfo, PackInfo packinfo1)
            {
                return packinfo.c() - packinfo1.c();
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((PackInfo)obj, (PackInfo)obj1);
            }

            
            {
                this$0 = NotifyEmoticonsUpdatedCommand.this;
                super();
            }
        });
        wearCache = weardatarequestcache;
    }

    public NotifyEmoticonsUpdatedCommand(WearDataRequestCache weardatarequestcache, String s)
    {
        packsAndContents = new TreeMap(new _cls1());
        wearCache = weardatarequestcache;
        emoticonListUri = s;
    }

    private void serializeAndSendEmoticonData(final com.google.android.gms.common.api.c googleApiClient, final com.google.android.gms.common.api.h resultCallback)
    {
        serializeEmoticonData(googleApiClient, new FutureListener() {

            final NotifyEmoticonsUpdatedCommand this$0;
            final com.google.android.gms.common.api.c val$googleApiClient;
            final com.google.android.gms.common.api.h val$resultCallback;

            public final void onError(Throwable throwable)
            {
            }

            public final void onResult(EmoticonPackList emoticonpacklist)
            {
                emoticonpacklist = emoticonpacklist.serializeAsAsset();
                n n1 = n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.NOTIFY_CONTENT_PACK_JSON_DEFINITION_UPDATED.getCommandPath(new Object[0]));
                h h1 = n1.a();
                ProtocolCommonCommands.putTimestamp(h1, SystemClock.uptimeMillis());
                ProtocolCommonCommands.putEmoticonBitmapJson(h1, emoticonpacklist);
                emoticonpacklist = n1.b();
                o.a.a(googleApiClient, emoticonpacklist).a(new a(wearCache, resultCallback));
            }

            public final volatile void onResult(Object obj)
            {
                onResult((EmoticonPackList)obj);
            }

            
            {
                this$0 = NotifyEmoticonsUpdatedCommand.this;
                googleApiClient = c1;
                resultCallback = h1;
                super();
            }
        });
    }

    private void serializeEmoticonData(final com.google.android.gms.common.api.c googleApiClient, final FutureListener listener)
    {
        final EmoticonPackList list = new EmoticonPackList();
        (new AsyncIterator(packsAndContents.entrySet().iterator())).startIteration(new com.skype.android.app.wear.util.AsyncIterator.Callback() {

            final NotifyEmoticonsUpdatedCommand this$0;
            final com.google.android.gms.common.api.c val$googleApiClient;
            final EmoticonPackList val$list;
            final FutureListener val$listener;

            public final void onDone()
            {
                listener.onResult(list);
            }

            public final volatile void onItem(Object obj, com.skype.android.app.wear.util.AsyncIterator.Iteration iteration)
            {
                onItem((java.util.Map.Entry)obj, iteration);
            }

            public final void onItem(final java.util.Map.Entry emoticonPack, com.skype.android.app.wear.util.AsyncIterator.Iteration iteration)
            {
                final PackInfo pack = (PackInfo)emoticonPack.getKey();
                n n1 = n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.NOTIFY_CONTENT_PACK_STATIC_BITMAPS_UPDATED.getCommandPath(new Object[] {
                    Integer.valueOf(pack.c())
                }));
                h h1 = n1.a();
                emoticonPack = serializePack(pack, (List)emoticonPack.getValue(), h1);
                o.a.a(googleApiClient, n1.b()).a(iteration. new com.google.android.gms.common.api.h() {

                    final _cls4 this$1;
                    final EmoticonPack val$emoticonPack;
                    final com.skype.android.app.wear.util.AsyncIterator.Iteration val$iteration;
                    final PackInfo val$pack;

                    public final volatile void onResult(g g)
                    {
                        onResult((com.google.android.gms.wearable.c.a)g);
                    }

                    public final void onResult(com.google.android.gms.wearable.c.a a1)
                    {
                        if (a1.getStatus().d())
                        {
                            Log.i("EmoticonsUpdatedCommand", (new StringBuilder("Successfully stored bitmap assets for pack ")).append(pack.h()).append(".").toString());
                            emoticonPack.setBitmapsDataUri(a1.a().b());
                            list.add(emoticonPack);
                        } else
                        {
                            Log.i("EmoticonsUpdatedCommand", (new StringBuilder("Failed to store bitmap assets for pack ")).append(pack.h()).append(".").toString());
                        }
                        iteration.nextElement();
                    }

            
            {
                this$1 = final__pcls4;
                pack = packinfo;
                emoticonPack = emoticonpack;
                iteration = com.skype.android.app.wear.util.AsyncIterator.Iteration.this;
                super();
            }
                });
            }

            
            {
                this$0 = NotifyEmoticonsUpdatedCommand.this;
                googleApiClient = c1;
                list = emoticonpacklist;
                listener = futurelistener;
                super();
            }
        });
    }

    private EmoticonPack serializePack(PackInfo packinfo, List list, h h1)
    {
        packinfo = new EmoticonPack(packinfo.h(), packinfo.e().toString());
        Collections.sort(list);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (MediaContent)list.next();
            String s = ((MediaContent) (obj)).e();
            Emoticon emoticon = new Emoticon(((MediaContent) (obj)).k(), s, ((MediaContent) (obj)).o(), s);
            obj = WearDataLayerUtil.createAssetFromBitmap(((MediaContent) (obj)).c());
            if (obj != null)
            {
                h1.a(s, ((com.google.android.gms.wearable.Asset) (obj)));
                packinfo.add(emoticon);
            }
        } while (true);
        return packinfo;
    }

    public void addContent(PackInfo packinfo, MediaContent mediacontent)
    {
        this;
        JVM INSTR monitorenter ;
        List list = (List)packsAndContents.get(packinfo);
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw new IllegalStateException((new StringBuilder("Pack info ")).append(packinfo.h()).append(" has not been registered. This is likely a bug in MediaContentRoster not calling the callback events in the right order.").toString());
        packinfo;
        this;
        JVM INSTR monitorexit ;
        throw packinfo;
        list.add(mediacontent);
        this;
        JVM INSTR monitorexit ;
    }

    public void addPackInfo(PackInfo packinfo)
    {
        this;
        JVM INSTR monitorenter ;
        if ((List)packsAndContents.get(packinfo) == null)
        {
            ArrayList arraylist = new ArrayList();
            packsAndContents.put(packinfo, arraylist);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        packinfo;
        throw packinfo;
    }

    public void send(final com.google.android.gms.common.api.c googleApiClient, final com.google.android.gms.common.api.h resultCallback)
    {
        if (emoticonListUri == null)
        {
            serializeAndSendEmoticonData(googleApiClient, resultCallback);
            return;
        } else
        {
            o.a.a(googleApiClient, Uri.parse(emoticonListUri)).a(new com.google.android.gms.common.api.h() {

                final NotifyEmoticonsUpdatedCommand this$0;
                final com.google.android.gms.common.api.c val$googleApiClient;
                final com.google.android.gms.common.api.h val$resultCallback;

                public final volatile void onResult(g g)
                {
                    onResult((com.google.android.gms.wearable.c.a)g);
                }

                public final void onResult(com.google.android.gms.wearable.c.a a1)
                {
                    if (a1.getStatus().d())
                    {
                        a1 = i.a(a1.a()).a();
                        n n1 = n.a(com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.NOTIFY_CONTENT_PACK_JSON_DEFINITION_UPDATED.getCommandPath(new Object[0]));
                        h h1 = n1.a();
                        h1.a(a1);
                        ProtocolCommonCommands.putTimestamp(h1, SystemClock.uptimeMillis());
                        a1 = n1.b();
                        o.a.a(googleApiClient, a1).a(new a(wearCache, resultCallback));
                        return;
                    } else
                    {
                        serializeAndSendEmoticonData(googleApiClient, resultCallback);
                        return;
                    }
                }

            
            {
                this$0 = NotifyEmoticonsUpdatedCommand.this;
                googleApiClient = c1;
                resultCallback = h1;
                super();
            }
            });
            return;
        }
    }



}
