// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerServiceListener, VideoPlayerStreamFormat, MediaRenderer, VideoPlayerStreamEvaluation

class a
    implements VideoPlayerServiceListener
{

    private IBinder a;

    public final void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(int i, int j, float f)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeFloat(f);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(int i, VideoPlayerStreamFormat videoplayerstreamformat, int j, int k, long l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        parcel.writeInt(i);
        if (videoplayerstreamformat == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        parcel.writeInt(1);
        videoplayerstreamformat.writeToParcel(parcel, 0);
_L1:
        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeLong(l);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        videoplayerstreamformat;
        parcel1.recycle();
        parcel.recycle();
        throw videoplayerstreamformat;
    }

    public final void a(MediaRenderer mediarenderer, MediaRenderer mediarenderer1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        if (mediarenderer == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        mediarenderer.writeToParcel(parcel, 0);
_L3:
        if (mediarenderer1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        parcel.writeInt(1);
        mediarenderer1.writeToParcel(parcel, 0);
_L4:
        parcel.writeString(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        mediarenderer;
        parcel1.recycle();
        parcel.recycle();
        throw mediarenderer;
        parcel.writeInt(0);
          goto _L4
    }

    public final void a(String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void a(List list, long l, VideoPlayerStreamFormat avideoplayerstreamformat[], VideoPlayerStreamEvaluation videoplayerstreamevaluation)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        parcel.writeTypedList(list);
        parcel.writeLong(l);
        parcel.writeTypedArray(avideoplayerstreamformat, 0);
        if (videoplayerstreamevaluation == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        parcel.writeInt(1);
        videoplayerstreamevaluation.writeToParcel(parcel, 0);
_L1:
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() != 0)
        {
            videoplayerstreamevaluation.a(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
    }

    public final void a(boolean flag, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        if (!flag)
        {
            k = 0;
        }
        parcel.writeInt(k);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public final void b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
