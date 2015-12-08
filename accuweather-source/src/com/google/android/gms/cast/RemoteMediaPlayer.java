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
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gp;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaStatus, CastDevice, TextTrackStyle, 
//            Cast

public class RemoteMediaPlayer
    implements Cast.MessageReceivedCallback
{
    public static interface MediaChannelResult
        extends Result
    {

        public abstract JSONObject getCustomData();
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
        implements gq
    {

        final RemoteMediaPlayer AX;
        private GoogleApiClient Bj;
        private long Bk;

        public void a(String s, String s1, long l, String s2)
            throws IOException
        {
            if (Bj == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(Bj, s, s1).setResultCallback(new a(this, l));
                return;
            }
        }

        public void b(GoogleApiClient googleapiclient)
        {
            Bj = googleapiclient;
        }

        public long dW()
        {
            long l = Bk + 1L;
            Bk = l;
            return l;
        }

        public a()
        {
            AX = RemoteMediaPlayer.this;
            super();
            Bk = 0L;
        }
    }

    private final class a.a
        implements ResultCallback
    {

        private final long Bl;
        final a Bm;

        public void k(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(Bm.AX).a(Bl, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            k((Status)result);
        }

        a.a(a a1, long l)
        {
            Bm = a1;
            super();
            Bl = l;
        }
    }

    private static abstract class b extends Cast.a
    {

        gr Bn;

        public Result c(Status status)
        {
            return l(status);
        }

        public MediaChannelResult l(Status status)
        {
            return new MediaChannelResult(this, status) {

                final b Bo;
                final Status yG;

                public JSONObject getCustomData()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Bo = b1;
                yG = status;
                super();
            }
            };
        }

        b()
        {
            Bn = new _cls1(this);
        }
    }

    private static final class c
        implements MediaChannelResult
    {

        private final JSONObject Ax;
        private final Status yw;

        public JSONObject getCustomData()
        {
            return Ax;
        }

        public Status getStatus()
        {
            return yw;
        }

        c(Status status, JSONObject jsonobject)
        {
            yw = status;
            Ax = jsonobject;
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
    private final gp AT = new gp() {

        final RemoteMediaPlayer AX;

        protected void onMetadataUpdated()
        {
            RemoteMediaPlayer.b(AX);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.a(AX);
        }

            
            {
                AX = RemoteMediaPlayer.this;
                super();
            }
    };
    private final a AU = new a();
    private OnMetadataUpdatedListener AV;
    private OnStatusUpdatedListener AW;
    private final Object lq = new Object();

    public RemoteMediaPlayer()
    {
        AT.a(AU);
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
        return remotemediaplayer.lq;
    }

    static a d(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.AU;
    }

    static gp e(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.AT;
    }

    private void onMetadataUpdated()
    {
        if (AV != null)
        {
            AV.onMetadataUpdated();
        }
    }

    private void onStatusUpdated()
    {
        if (AW != null)
        {
            AW.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized (lq)
        {
            l = AT.getApproximateStreamPosition();
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
        synchronized (lq)
        {
            mediainfo = AT.getMediaInfo();
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
        synchronized (lq)
        {
            mediastatus = AT.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return AT.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized (lq)
        {
            l = AT.getStreamDuration();
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

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final MediaInfo Bb;
            final boolean Bc;
            final long Bd;
            final JSONObject Be;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).a(Bn, Bb, Bc, Bd, Be);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Bb = mediainfo;
                Bc = flag;
                Bd = l;
                Be = jsonobject;
                super();
            }
        });
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        AT.ai(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final JSONObject Be;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).a(Bn, Be);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Be = jsonobject;
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

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final JSONObject Be;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).c(Bn, Be);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Be = jsonobject;
                super();
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new b(googleapiclient) {

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).a(Bn);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
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

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final JSONObject Be;
            final long Bf;
            final int Bg;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).a(Bn, Bf, Bg, Be);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Bf = l;
                Bg = i;
                Be = jsonobject;
                super();
            }
        });
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
    {
        return googleapiclient.b(new b(googleapiclient, al) {

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final long AZ[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).a(Bn, AZ);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                AZ = al;
                super();
            }
        });
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        AV = onmetadataupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        AW = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, flag, jsonobject) {

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final JSONObject Be;
            final boolean Bi;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).a(Bn, Bi, Be);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Bi = flag;
                Be = jsonobject;
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

                final RemoteMediaPlayer AX;
                final GoogleApiClient AY;
                final JSONObject Be;
                final double Bh;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                {
                    gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                    gi1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(AX).b(AY);
                    RemoteMediaPlayer.e(AX).a(Bn, Bh, Be);
                    RemoteMediaPlayer.d(AX).b(null);
_L1:
                    gi1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    b(l(new Status(1)));
                    RemoteMediaPlayer.d(AX).b(null);
                      goto _L1
                    obj;
                    gi1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    b(l(new Status(1)));
                    RemoteMediaPlayer.d(AX).b(null);
                      goto _L1
                    obj;
                    b(l(new Status(1)));
                    RemoteMediaPlayer.d(AX).b(null);
                      goto _L1
                    obj;
                    RemoteMediaPlayer.d(AX).b(null);
                    throw obj;
                }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Bh = d1;
                Be = jsonobject;
                super();
            }
            });
        }
    }

    public PendingResult setTextTrackStyle(GoogleApiClient googleapiclient, TextTrackStyle texttrackstyle)
    {
        return googleapiclient.b(new b(googleapiclient, texttrackstyle) {

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final TextTrackStyle Ba;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).a(Bn, Ba);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Ba = texttrackstyle;
                super();
            }
        });
    }

    public PendingResult stop(GoogleApiClient googleapiclient)
    {
        return stop(googleapiclient, null);
    }

    public PendingResult stop(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer AX;
            final GoogleApiClient AY;
            final JSONObject Be;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gi)a1);
            }

            protected void a(gi gi1)
            {
                gi1 = ((gi) (RemoteMediaPlayer.c(AX)));
                gi1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(AX).b(AY);
                RemoteMediaPlayer.e(AX).b(Bn, Be);
                RemoteMediaPlayer.d(AX).b(null);
_L1:
                gi1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(AX).b(null);
                  goto _L1
                obj;
                gi1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(AX).b(null);
                throw obj;
            }

            
            {
                AX = RemoteMediaPlayer.this;
                AY = googleapiclient;
                Be = jsonobject;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$b$1

/* anonymous class */
    class b._cls1
        implements gr
    {

        final b Bo;

        public void a(long l, int i, JSONObject jsonobject)
        {
            Bo.b(new c(new Status(i), jsonobject));
        }

        public void n(long l)
        {
            Bo.b(Bo.l(new Status(4)));
        }

            
            {
                Bo = b1;
                super();
            }
    }

}
