// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import java.util.Map;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerServiceApi, VideoPlayerSession, VideoPlayRequest, MediaRenderer, 
//            VideoPlayerServiceListener

class a
    implements VideoPlayerServiceApi
{

    private IBinder a;

    public final int a(VideoPlayerSession videoplayersession)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        int i;
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    public final VideoPlayerSession a(String s, VideoPlayRequest videoplayrequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        parcel.writeString(s);
        if (videoplayrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayrequest.writeToParcel(parcel, 0);
_L3:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s = (VideoPlayerSession)VideoPlayerSession.CREATOR.el(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        s = null;
          goto _L4
    }

    public final void a(Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        uri;
        parcel1.recycle();
        parcel.recycle();
        throw uri;
    }

    public final void a(VideoPlayerSession videoplayersession, long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        parcel.writeLong(l);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    public final void a(VideoPlayerSession videoplayersession, Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L3:
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L4:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, float f1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L3:
        if (mediarenderer == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        parcel.writeInt(1);
        mediarenderer.writeToParcel(parcel, 0);
_L4:
        parcel.writeFloat(f1);
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, Surface surface)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L5:
        if (mediarenderer == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        mediarenderer.writeToParcel(parcel, 0);
_L6:
        if (surface == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        parcel.writeInt(1);
        surface.writeToParcel(parcel, 0);
_L7:
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, MediaRenderer mediarenderer1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L5:
        if (mediarenderer == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        mediarenderer.writeToParcel(parcel, 0);
_L6:
        if (mediarenderer1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        parcel.writeInt(1);
        mediarenderer1.writeToParcel(parcel, 0);
_L7:
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
_L4:
        parcel.writeInt(0);
          goto _L6
        parcel.writeInt(0);
          goto _L7
    }

    public final void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L5:
        if (mediarenderer == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        mediarenderer.writeToParcel(parcel, 0);
        break MISSING_BLOCK_LABEL_128;
_L6:
        parcel.writeInt(i);
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
_L4:
        parcel.writeInt(0);
        while (!flag) 
        {
            i = 0;
            break;
        }
          goto _L6
    }

    public final void a(VideoPlayerSession videoplayersession, VideoPlayerServiceListener videoplayerservicelistener)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L3:
        if (videoplayerservicelistener == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        videoplayersession = videoplayerservicelistener.asBinder();
_L4:
        parcel.writeStrongBinder(videoplayersession);
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
        videoplayersession = null;
          goto _L4
    }

    public final void a(VideoPlayerSession videoplayersession, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
          goto _L3
_L5:
        parcel.writeInt(i);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        break; /* Loop/switch isn't completed */
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
_L6:
        i = 0;
        if (true) goto _L4; else goto _L3
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        if (!flag) goto _L6; else goto _L5
    }

    public final void a(Map map)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        parcel.writeMap(map);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        map;
        parcel1.recycle();
        parcel.recycle();
        throw map;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public final void b(VideoPlayerSession videoplayersession, VideoPlayerServiceListener videoplayerservicelistener)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L3:
        if (videoplayerservicelistener == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        videoplayersession = videoplayerservicelistener.asBinder();
_L4:
        parcel.writeStrongBinder(videoplayersession);
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
        videoplayersession = null;
          goto _L4
    }

    public final void b(VideoPlayerSession videoplayersession, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
          goto _L3
_L5:
        parcel.writeInt(i);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
        break; /* Loop/switch isn't completed */
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
_L6:
        i = 0;
        if (true) goto _L4; else goto _L3
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        if (!flag) goto _L6; else goto _L5
    }

    public final boolean b(VideoPlayerSession videoplayersession)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        int i;
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    public final void c(VideoPlayerSession videoplayersession)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    public final long d(VideoPlayerSession videoplayersession)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        long l;
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readLong();
        parcel1.recycle();
        parcel.recycle();
        return l;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    public final long e(VideoPlayerSession videoplayersession)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        long l;
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readLong();
        parcel1.recycle();
        parcel.recycle();
        return l;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    public final long f(VideoPlayerSession videoplayersession)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        long l;
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readLong();
        parcel1.recycle();
        parcel.recycle();
        return l;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    public final int g(VideoPlayerSession videoplayersession)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        if (videoplayersession == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        videoplayersession.writeToParcel(parcel, 0);
_L1:
        int i;
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        parcel.writeInt(0);
          goto _L1
        videoplayersession;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayersession;
    }

    A(IBinder ibinder)
    {
        a = ibinder;
    }
}
