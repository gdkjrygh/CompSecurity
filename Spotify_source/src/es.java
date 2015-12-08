// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;

public abstract class es extends Binder
    implements er
{

    public es()
    {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    public static er a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iinterface != null && (iinterface instanceof er))
        {
            return (er)iinterface;
        } else
        {
            return new et(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("android.support.v4.media.session.IMediaSession");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            String s3 = parcel.readString();
            Bundle bundle;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper)android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(s3, bundle, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            boolean flag1;
            if (parcel.readInt() != 0)
            {
                parcel = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            flag1 = a(parcel);
            parcel1.writeNoException();
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            a(ep.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            b(ep.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            boolean flag2 = a();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag2)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = c();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = d();
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

        case 9: // '\t'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            long l = e();
            parcel1.writeNoException();
            parcel1.writeLong(l);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = f();
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

        case 11: // '\013'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            a(parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            b(parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            g();
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(s, parcel);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            String s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(s1, parcel);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            Uri uri;
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                uri = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(uri, parcel);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            a(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            h();
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            i();
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            j();
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            k();
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            l();
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            m();
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            b(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            if (parcel.readInt() != 0)
            {
                parcel = (RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            String s2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            c(s2, parcel);
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = n();
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

        case 28: // '\034'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = o();
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

        case 29: // '\035'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = p();
            parcel1.writeNoException();
            parcel1.writeTypedList(parcel);
            return true;

        case 30: // '\036'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = q();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                TextUtils.writeToParcel(parcel, parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 31: // '\037'
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel = r();
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

        case 32: // ' '
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            i = s();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;
        }
    }
}
