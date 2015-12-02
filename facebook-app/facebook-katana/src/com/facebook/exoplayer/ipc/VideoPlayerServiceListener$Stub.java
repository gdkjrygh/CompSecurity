// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerServiceListener, MediaRenderer, VideoPlayerStreamFormat, VideoPlayerMediaChunk, 
//            VideoPlayerStreamEvaluation

public abstract class attachInterface extends Binder
    implements VideoPlayerServiceListener
{

    public static VideoPlayerServiceListener a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
        class Proxy
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

            Proxy(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof VideoPlayerServiceListener))
        {
            return (VideoPlayerServiceListener)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        java.util.ArrayList arraylist;
        VideoPlayerStreamFormat avideoplayerstreamformat[];
        long l;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag, parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            MediaRenderer mediarenderer;
            if (parcel.readInt() != 0)
            {
                obj = (MediaRenderer)MediaRenderer.CREATOR.cel(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                mediarenderer = (MediaRenderer)MediaRenderer.CREATOR.cel(parcel);
            } else
            {
                mediarenderer = null;
            }
            a(((MediaRenderer) (obj)), mediarenderer, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            a(parcel.readInt(), parcel.readInt(), parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            i = parcel.readInt();
            if (parcel.readInt() != 0)
            {
                obj = (VideoPlayerStreamFormat)VideoPlayerStreamFormat.CREATOR.cel(parcel);
            } else
            {
                obj = null;
            }
            a(i, ((VideoPlayerStreamFormat) (obj)), parcel.readInt(), parcel.readInt(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            a();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            b();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
            arraylist = parcel.createTypedArrayList(VideoPlayerMediaChunk.CREATOR);
            l = parcel.readLong();
            avideoplayerstreamformat = (VideoPlayerStreamFormat[])parcel.createTypedArray(VideoPlayerStreamFormat.CREATOR);
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (VideoPlayerStreamEvaluation)VideoPlayerStreamEvaluation.CREATOR.cel(parcel);
        }
        a(arraylist, l, avideoplayerstreamformat, ((VideoPlayerStreamEvaluation) (obj)));
        parcel1.writeNoException();
        if (obj != null)
        {
            parcel1.writeInt(1);
            ((VideoPlayerStreamEvaluation) (obj)).writeToParcel(parcel1, 1);
            return true;
        } else
        {
            parcel1.writeInt(0);
            return true;
        }
    }

    public Proxy()
    {
        attachInterface(this, "com.facebook.exoplayer.ipc.VideoPlayerServiceListener");
    }
}
