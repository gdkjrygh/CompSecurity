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
import com.google.android.gms.internal.gh;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gp;
import com.google.android.gms.internal.gq;
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
        implements gp
    {

        final RemoteMediaPlayer Ba;
        private GoogleApiClient Bm;
        private long Bn;

        public void a(String s, String s1, long l, String s2)
            throws IOException
        {
            if (Bm == null)
            {
                throw new IOException("No GoogleApiClient available");
            } else
            {
                Cast.CastApi.sendMessage(Bm, s, s1).setResultCallback(new a(this, l));
                return;
            }
        }

        public void b(GoogleApiClient googleapiclient)
        {
            Bm = googleapiclient;
        }

        public long eb()
        {
            long l = Bn + 1L;
            Bn = l;
            return l;
        }

        public a()
        {
            Ba = RemoteMediaPlayer.this;
            super();
            Bn = 0L;
        }
    }

    private final class a.a
        implements ResultCallback
    {

        private final long Bo;
        final a Bp;

        public void k(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(Bp.Ba).a(Bo, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            k((Status)result);
        }

        a.a(a a1, long l)
        {
            Bp = a1;
            super();
            Bo = l;
        }
    }

    private static abstract class b extends Cast.a
    {

        gq Bq;

        public Result c(Status status)
        {
            return l(status);
        }

        public MediaChannelResult l(Status status)
        {
            return new MediaChannelResult(this, status) {

                final b Br;
                final Status yJ;

                public JSONObject getCustomData()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                Br = b1;
                yJ = status;
                super();
            }
            };
        }

        b()
        {
            Bq = new _cls1(this);
        }
    }

    private static final class c
        implements MediaChannelResult
    {

        private final JSONObject AA;
        private final Status yz;

        public JSONObject getCustomData()
        {
            return AA;
        }

        public Status getStatus()
        {
            return yz;
        }

        c(Status status, JSONObject jsonobject)
        {
            yz = status;
            AA = jsonobject;
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
    private final go AW = new go() {

        final RemoteMediaPlayer Ba;

        protected void onMetadataUpdated()
        {
            RemoteMediaPlayer.b(Ba);
        }

        protected void onStatusUpdated()
        {
            RemoteMediaPlayer.a(Ba);
        }

            
            {
                Ba = RemoteMediaPlayer.this;
                super();
            }
    };
    private final a AX = new a();
    private OnMetadataUpdatedListener AY;
    private OnStatusUpdatedListener AZ;
    private final Object ls = new Object();

    public RemoteMediaPlayer()
    {
        AW.a(AX);
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
        return remotemediaplayer.ls;
    }

    static a d(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.AX;
    }

    static go e(RemoteMediaPlayer remotemediaplayer)
    {
        return remotemediaplayer.AW;
    }

    private void onMetadataUpdated()
    {
        if (AY != null)
        {
            AY.onMetadataUpdated();
        }
    }

    private void onStatusUpdated()
    {
        if (AZ != null)
        {
            AZ.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition()
    {
        long l;
        synchronized (ls)
        {
            l = AW.getApproximateStreamPosition();
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
        synchronized (ls)
        {
            mediainfo = AW.getMediaInfo();
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
        synchronized (ls)
        {
            mediastatus = AW.getMediaStatus();
        }
        return mediastatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getNamespace()
    {
        return AW.getNamespace();
    }

    public long getStreamDuration()
    {
        long l;
        synchronized (ls)
        {
            l = AW.getStreamDuration();
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

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final MediaInfo Be;
            final boolean Bf;
            final long Bg;
            final JSONObject Bh;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).a(Bq, Be, Bf, Bg, Bh);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Be = mediainfo;
                Bf = flag;
                Bg = l;
                Bh = jsonobject;
                super();
            }
        });
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        AW.ai(s1);
    }

    public PendingResult pause(GoogleApiClient googleapiclient)
    {
        return pause(googleapiclient, null);
    }

    public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, jsonobject) {

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final JSONObject Bh;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).a(Bq, Bh);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bh = jsonobject;
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

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final JSONObject Bh;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).c(Bq, Bh);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bh = jsonobject;
                super();
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new b(googleapiclient) {

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).a(Bq);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
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

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final JSONObject Bh;
            final long Bi;
            final int Bj;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).a(Bq, Bi, Bj, Bh);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bi = l;
                Bj = i;
                Bh = jsonobject;
                super();
            }
        });
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
    {
        return googleapiclient.b(new b(googleapiclient, al) {

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final long Bc[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).a(Bq, Bc);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bc = al;
                super();
            }
        });
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
    {
        AY = onmetadataupdatedlistener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
    {
        AZ = onstatusupdatedlistener;
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
    {
        return setStreamMute(googleapiclient, flag, null);
    }

    public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
    {
        return googleapiclient.b(new b(googleapiclient, flag, jsonobject) {

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final JSONObject Bh;
            final boolean Bl;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).a(Bq, Bl, Bh);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bl = flag;
                Bh = jsonobject;
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

                final RemoteMediaPlayer Ba;
                final GoogleApiClient Bb;
                final JSONObject Bh;
                final double Bk;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                {
                    gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                    gh1;
                    JVM INSTR monitorenter ;
                    RemoteMediaPlayer.d(Ba).b(Bb);
                    RemoteMediaPlayer.e(Ba).a(Bq, Bk, Bh);
                    RemoteMediaPlayer.d(Ba).b(null);
_L1:
                    gh1;
                    JVM INSTR monitorexit ;
                    return;
                    Object obj;
                    obj;
                    b(l(new Status(1)));
                    RemoteMediaPlayer.d(Ba).b(null);
                      goto _L1
                    obj;
                    gh1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    b(l(new Status(1)));
                    RemoteMediaPlayer.d(Ba).b(null);
                      goto _L1
                    obj;
                    b(l(new Status(1)));
                    RemoteMediaPlayer.d(Ba).b(null);
                      goto _L1
                    obj;
                    RemoteMediaPlayer.d(Ba).b(null);
                    throw obj;
                }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bk = d1;
                Bh = jsonobject;
                super();
            }
            });
        }
    }

    public PendingResult setTextTrackStyle(GoogleApiClient googleapiclient, TextTrackStyle texttrackstyle)
    {
        return googleapiclient.b(new b(googleapiclient, texttrackstyle) {

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final TextTrackStyle Bd;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).a(Bq, Bd);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bd = texttrackstyle;
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

            final RemoteMediaPlayer Ba;
            final GoogleApiClient Bb;
            final JSONObject Bh;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((gh)a1);
            }

            protected void a(gh gh1)
            {
                gh1 = ((gh) (RemoteMediaPlayer.c(Ba)));
                gh1;
                JVM INSTR monitorenter ;
                RemoteMediaPlayer.d(Ba).b(Bb);
                RemoteMediaPlayer.e(Ba).b(Bq, Bh);
                RemoteMediaPlayer.d(Ba).b(null);
_L1:
                gh1;
                JVM INSTR monitorexit ;
                return;
                Object obj;
                obj;
                b(l(new Status(1)));
                RemoteMediaPlayer.d(Ba).b(null);
                  goto _L1
                obj;
                gh1;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                RemoteMediaPlayer.d(Ba).b(null);
                throw obj;
            }

            
            {
                Ba = RemoteMediaPlayer.this;
                Bb = googleapiclient;
                Bh = jsonobject;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/cast/RemoteMediaPlayer$b$1

/* anonymous class */
    class b._cls1
        implements gq
    {

        final b Br;

        public void a(long l, int i, JSONObject jsonobject)
        {
            Br.b(new c(new Status(i), jsonobject));
        }

        public void n(long l)
        {
            Br.b(Br.l(new Status(4)));
        }

            
            {
                Br = b1;
                super();
            }
    }

}
