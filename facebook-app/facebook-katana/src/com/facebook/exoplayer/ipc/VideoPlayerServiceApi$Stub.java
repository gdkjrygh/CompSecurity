// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerServiceApi, VideoPlayRequest, VideoPlayerSession, MediaRenderer

public abstract class attachInterface extends Binder
    implements VideoPlayerServiceApi
{

    public static VideoPlayerServiceApi a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
        class Proxy
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
                s = (VideoPlayerSession)VideoPlayerSession.CREATOR.createFromParcel(parcel1);
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

            Proxy(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof VideoPlayerServiceApi))
        {
            return (VideoPlayerServiceApi)iinterface;
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
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayRequest)VideoPlayRequest.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = a(s, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 2: // '\002'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            a(parcel.readHashMap(getClass().getClassLoader()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession;
            if (parcel.readInt() != 0)
            {
                videoplayersession = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Uri)Uri.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(videoplayersession, parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            if (parcel.readInt() != 0)
            {
                parcel = (Uri)Uri.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession1;
            MediaRenderer mediarenderer;
            if (parcel.readInt() != 0)
            {
                videoplayersession1 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession1 = null;
            }
            if (parcel.readInt() != 0)
            {
                mediarenderer = (MediaRenderer)MediaRenderer.CREATOR.omParcel(parcel);
            } else
            {
                mediarenderer = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (MediaRenderer)MediaRenderer.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(videoplayersession1, mediarenderer, parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            i = a(parcel);
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            flag = b(parcel);
            parcel1.writeNoException();
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession2;
            if (parcel.readInt() != 0)
            {
                videoplayersession2 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession2 = null;
            }
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(videoplayersession2, flag);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession3;
            if (parcel.readInt() != 0)
            {
                videoplayersession3 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession3 = null;
            }
            a(videoplayersession3, parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            c(parcel);
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession4;
            boolean flag1;
            if (parcel.readInt() != 0)
            {
                videoplayersession4 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession4 = null;
            }
            flag1 = flag3;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            }
            b(videoplayersession4, flag1);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession5;
            MediaRenderer mediarenderer1;
            boolean flag2;
            if (parcel.readInt() != 0)
            {
                videoplayersession5 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession5 = null;
            }
            if (parcel.readInt() != 0)
            {
                mediarenderer1 = (MediaRenderer)MediaRenderer.CREATOR.omParcel(parcel);
            } else
            {
                mediarenderer1 = null;
            }
            flag2 = flag4;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            }
            a(videoplayersession5, mediarenderer1, flag2);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession6;
            MediaRenderer mediarenderer2;
            if (parcel.readInt() != 0)
            {
                videoplayersession6 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession6 = null;
            }
            if (parcel.readInt() != 0)
            {
                mediarenderer2 = (MediaRenderer)MediaRenderer.CREATOR.omParcel(parcel);
            } else
            {
                mediarenderer2 = null;
            }
            a(videoplayersession6, mediarenderer2, parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession7;
            MediaRenderer mediarenderer3;
            if (parcel.readInt() != 0)
            {
                videoplayersession7 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession7 = null;
            }
            if (parcel.readInt() != 0)
            {
                mediarenderer3 = (MediaRenderer)MediaRenderer.CREATOR.omParcel(parcel);
            } else
            {
                mediarenderer3 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Surface)Surface.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(videoplayersession7, mediarenderer3, parcel);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            long l;
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            l = d(parcel);
            parcel1.writeNoException();
            parcel1.writeLong(l);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            long l1;
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            l1 = e(parcel);
            parcel1.writeNoException();
            parcel1.writeLong(l1);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            long l2;
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            l2 = f(parcel);
            parcel1.writeNoException();
            parcel1.writeLong(l2);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            if (parcel.readInt() != 0)
            {
                parcel = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            i = g(parcel);
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            VideoPlayerSession videoplayersession8;
            if (parcel.readInt() != 0)
            {
                videoplayersession8 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
            } else
            {
                videoplayersession8 = null;
            }
            a(videoplayersession8, Stub.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
            break;
        }
        VideoPlayerSession videoplayersession9;
        if (parcel.readInt() != 0)
        {
            videoplayersession9 = (VideoPlayerSession)VideoPlayerSession.CREATOR.omParcel(parcel);
        } else
        {
            videoplayersession9 = null;
        }
        b(videoplayersession9, Stub.a(parcel.readStrongBinder()));
        parcel1.writeNoException();
        return true;
    }

    public Stub()
    {
        attachInterface(this, "com.facebook.exoplayer.ipc.VideoPlayerServiceApi");
    }
}
