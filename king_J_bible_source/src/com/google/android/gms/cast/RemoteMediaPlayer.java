// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.eu;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaStatus, CastDevice, Cast

public class RemoteMediaPlayer
    implements Cast.MessageReceivedCallback
{
    public static interface MediaChannelResult
        extends Result
    {
    }

    public static interface OnMetadataUpdatedListener
    {

        public abstract void onMetadataUpdated();
    }

    public static interface OnStatusUpdatedListener
    {

        public abstract void onStatusUpdated();
    }

    private class a
        implements et
    {

        final RemoteMediaPlayer yI;
        private GoogleApiClient yS;
        private long yT;

        public void a(String s, String s1, long l, String s2)
            throws IOException
        {
            if (yS == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(yS, s, s1).setResultCallback(new a(this, l));
                return;
            }
        }

        public void b(GoogleApiClient googleapiclient)
        {
            yS = googleapiclient;
        }

        public long dD()
        {
            long l = yT + 1L;
            yT = l;
            return l;
        }

        public a()
        {
            yI = RemoteMediaPlayer.this;
            super();
            yT = 0L;
        }
    }

    private final class a.a
        implements ResultCallback
    {

        private final long yU;
        final a yV;

        public void i(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(yV.yI).a(yU, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            i((Status)result);
        }

        a.a(a a1, long l)
        {
            yV = a1;
            super();
            yU = l;
        }
    }

    private static abstract class b extends Cast.a
    {

        eu yW;

        public Result d(Status status)
        {
            return j(status);
        }

        public MediaChannelResult j(Status status)
        {
            return new MediaChannelResult(this, status) {

                final Status wz;
                final b yX;

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                yX = b1;
                wz = status;
                super();
            }
            };
        }

        b()
        {
            yW = new _cls1(this);
        }
    }

    private static final class c
        implements MediaChannelResult
    {

        private final Status wJ;
        private final JSONObject yn;

        public Status getStatus()
        {
            return wJ;
        }

        c(Status status, JSONObject jsonobject)
        {
            wJ = status;
            yn = jsonobject;
        }
    }


    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2;
    public static final int STATUS_FAILED = 1;
    public static final int STATUS_REPLACED = 4;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 3;
    private final Object li = new Object();
    private final es yE = new es() {

        final RemoteMediaPlayer yI;

        protected void onMetadataUpdated()
        {
            RemoteMediaPlayer.b(yI);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.a(yI);
        }

            
            {
                yI = RemoteMediaPlayer.this;
                super();
            }
    };
    private final a yF = new a();
    private OnMetadataUpdatedListener yG;
    private OnStatusUpdatedListener yH;

    public RemoteMediaPlayer()
    {
        yE.a(yF);
    }

    static void a(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onStatusUpdated();
    }

    static void b(RemoteMediaPlayer remotemediaplayer)
    {
        remotemediaplayer.onMetadataUpdated();
    }

    static Object c(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.li;
    }

    static a d(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.yF;
    }

    static es e(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.yE;
    }

    private void onMetadataUpdated()
    {
        if (yG != null)
        {
            yG.onMetadataUpdated();
        }
    }

    private void onStatusUpdated()
    {
        if (yH != null)
        {
            yH.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized (li)
        {
            l = yE.getApproximateStreamPosition();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaInfo getMediaInfo()
    {
        MediaInfo mediainfo;
        synchronized (li)
        {
            mediainfo = yE.getMediaInfo();
        }
        return mediainfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaStatus getMediaStatus()
    {
        MediaStatus mediastatus;
        synchronized (li)
        {
            mediastatus = yE.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return yE.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized (li)
        {
            l = yE.getStreamDuration();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo)
    {
        return load(googleapiclient, mediainfo, true, 0L, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag)
    {
        return load(googleapiclient, mediainfo, flag, 0L, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l)
    {
        return load(googleapiclient, mediainfo, flag, l, null);
    }

    public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, mediainfo, flag, l, jsonobject) {

            final RemoteMediaPlayer yI;
            final GoogleApiClient yJ;
            final MediaInfo yK;
            final boolean yL;
            final long yM;
            final JSONObject yN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
            {
                en1 = ((en) (RemoteMediaPlayer.c(yI)));
                en1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(yI).b(yJ);
                RemoteMediaPlayer.e(yI).a(yW, yK, yL, yM, yN);
                RemoteMediaPlayer.d(yI).b(null);
_L1:
                en1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                en1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(yI).b(null);
                throw obj;
            }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                yK = mediainfo;
                yL = flag;
                yM = l;
                yN = jsonobject;
                super();
            }
        });
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        yE.U(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer yI;
            final GoogleApiClient yJ;
            final JSONObject yN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
            {
                en1 = ((en) (RemoteMediaPlayer.c(yI)));
                en1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(yI).b(yJ);
                RemoteMediaPlayer.e(yI).a(yW, yN);
                RemoteMediaPlayer.d(yI).b(null);
_L1:
                en1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                en1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(yI).b(null);
                throw obj;
            }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                yN = jsonobject;
                super();
            }
        });
    }

    public PendingResult play(GoogleApiClient googleapiclient)
    {
        return play(googleapiclient, null);
    }

    public PendingResult play(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer yI;
            final GoogleApiClient yJ;
            final JSONObject yN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
            {
                en1 = ((en) (RemoteMediaPlayer.c(yI)));
                en1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(yI).b(yJ);
                RemoteMediaPlayer.e(yI).c(yW, yN);
                RemoteMediaPlayer.d(yI).b(null);
_L1:
                en1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                en1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(yI).b(null);
                throw obj;
            }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                yN = jsonobject;
                super();
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new b(googleapiclient) {

            final RemoteMediaPlayer yI;
            final GoogleApiClient yJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
            {
                en1 = ((en) (RemoteMediaPlayer.c(yI)));
                en1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(yI).b(yJ);
                RemoteMediaPlayer.e(yI).a(yW);
                RemoteMediaPlayer.d(yI).b(null);
_L1:
                en1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                en1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(yI).b(null);
                throw obj;
            }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                super();
            }
        });
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l)
    {
        return seek(googleapiclient, l, 0, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i)
    {
        return seek(googleapiclient, l, i, null);
    }

    public PendingResult seek(GoogleApiClient googleapiclient, long l, int i, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, l, i, jsonobject) {

            final RemoteMediaPlayer yI;
            final GoogleApiClient yJ;
            final JSONObject yN;
            final long yO;
            final int yP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
            {
                en1 = ((en) (RemoteMediaPlayer.c(yI)));
                en1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(yI).b(yJ);
                RemoteMediaPlayer.e(yI).a(yW, yO, yP, yN);
                RemoteMediaPlayer.d(yI).b(null);
_L1:
                en1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                en1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(yI).b(null);
                throw obj;
            }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                yO = l;
                yP = i;
                yN = jsonobject;
                super();
            }
        });
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        yG = onmetadataupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        yH = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, flag, jsonobject) {

            final RemoteMediaPlayer yI;
            final GoogleApiClient yJ;
            final JSONObject yN;
            final boolean yR;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
            {
                en1 = ((en) (RemoteMediaPlayer.c(yI)));
                en1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(yI).b(yJ);
                RemoteMediaPlayer.e(yI).a(yW, yR, yN);
                RemoteMediaPlayer.d(yI).b(null);
_L1:
                en1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                en1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                RemoteMediaPlayer.d(yI).b(null);
                throw obj;
            }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                yR = flag;
                yN = jsonobject;
                super();
            }
        });
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d1)
        throws IllegalArgumentException
    {
        return setStreamVolume(googleapiclient, d1, null);
    }

    public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d1, JSONObject jsonobject)
        throws IllegalArgumentException
    {
        if (Double.isInfinite(d1) || Double.isNaN(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Volume cannot be ").append(d1).toString());
        } else
        {
            return googleapiclient.b(new b(googleapiclient, d1, jsonobject) {

                final RemoteMediaPlayer yI;
                final GoogleApiClient yJ;
                final JSONObject yN;
                final double yQ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((en)a1);
                }

                protected void a(en en1)
                {
                    en1 = ((en) (RemoteMediaPlayer.c(yI)));
                    en1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(yI).b(yJ);
                    RemoteMediaPlayer.e(yI).a(yW, yQ, yN);
                    RemoteMediaPlayer.d(yI).b(null);
_L1:
                    en1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    a(((Result) (j(new Status(1)))));
                    RemoteMediaPlayer.d(yI).b(null);
                      goto _L1
                    obj;
                    en1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    a(((Result) (j(new Status(1)))));
                    RemoteMediaPlayer.d(yI).b(null);
                      goto _L1
                    obj;
                    a(((Result) (j(new Status(1)))));
                    RemoteMediaPlayer.d(yI).b(null);
                      goto _L1
                    obj;
                    RemoteMediaPlayer.d(yI).b(null);
                    throw obj;
                }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                yQ = d1;
                yN = jsonobject;
                super();
            }
            });
        }
    }

    public PendingResult stop(GoogleApiClient googleapiclient)
    {
        return stop(googleapiclient, null);
    }

    public PendingResult stop(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer yI;
            final GoogleApiClient yJ;
            final JSONObject yN;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
            {
                en1 = ((en) (RemoteMediaPlayer.c(yI)));
                en1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(yI).b(yJ);
                RemoteMediaPlayer.e(yI).b(yW, yN);
                RemoteMediaPlayer.d(yI).b(null);
_L1:
                en1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                a(((Result) (j(new Status(1)))));
                RemoteMediaPlayer.d(yI).b(null);
                  goto _L1
                obj;
                en1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(yI).b(null);
                throw obj;
            }

            
            {
                yI = RemoteMediaPlayer.this;
                yJ = googleapiclient;
                yN = jsonobject;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$b$1

/* anonymous class */
    class b._cls1
        implements eu
    {

        final b yX;

        public void a(long l1, int i, JSONObject jsonobject)
        {
            yX.a(new c(new Status(i), jsonobject));
        }

        public void l(long l1)
        {
            yX.a(yX.j(new Status(4)));
        }

            
            {
                yX = b1;
                super();
            }
    }

}
