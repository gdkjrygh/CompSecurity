// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.e;

// Referenced classes of package com.google.android.gms.internal:
//            eq

public interface er
    extends IInterface
{
    public static abstract class a extends Binder
        implements er
    {

        public static er C(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
            if (iinterface != null && (iinterface instanceof er))
            {
                return (er)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            Object obj3 = null;
            Object obj = null;
            Object obj1 = null;
            IBinder ibinder1 = null;
            Object obj2 = null;
            boolean flag = false;
            boolean flag36 = false;
            boolean flag30 = false;
            boolean flag33 = false;
            boolean flag37 = false;
            int k1 = 0;
            boolean flag38 = false;
            boolean flag39 = false;
            boolean flag40 = false;
            boolean flag41 = false;
            boolean flag34 = false;
            boolean flag35 = false;
            boolean flag32 = false;
            boolean flag42 = false;
            boolean flag43 = false;
            boolean flag44 = false;
            boolean flag45 = false;
            boolean flag46 = false;
            boolean flag21 = false;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.internal.IGamesService");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = getAppId();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = ba();
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

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = parcel.readStrongBinder();
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                a(((IBinder) (obj1)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                bT();
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = getCurrentAccountName();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5064: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = L(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5065: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(eq.a.B(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(((eq) (obj)), ((String) (obj1)), flag, parcel.createLongArray());
                parcel1.writeNoException();
                return true;

            case 5012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = getCurrentPlayerId();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bU();
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

            case 5014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                i1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag21 = true;
                }
                a(((eq) (obj)), i1, flag, flag21);
                parcel1.writeNoException();
                return true;

            case 5016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(eq.a.B(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(((eq) (obj)), ((String) (obj1)), i1, j1, k1, flag);
                parcel1.writeNoException();
                return true;

            case 5020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b(((eq) (obj)), ((String) (obj1)), i1, j1, k1, flag);
                parcel1.writeNoException();
                return true;

            case 5021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = eq.a.B(parcel.readStrongBinder());
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                a(((eq) (obj1)), ((Bundle) (obj)), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = eq.a.B(parcel.readStrongBinder());
                obj2 = parcel.readString();
                IBinder ibinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                a(((eq) (obj1)), ((String) (obj2)), ibinder, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 5024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj2 = eq.a.B(parcel.readStrongBinder());
                String s = parcel.readString();
                ibinder1 = parcel.readStrongBinder();
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                b(((eq) (obj2)), s, ibinder1, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 5025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                obj2 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((eq) (obj)), ((String) (obj1)), i1, ((IBinder) (obj2)), parcel);
                parcel1.writeNoException();
                return true;

            case 5026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                j(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5058: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(eq.a.B(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5059: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = eq.a.B(parcel.readStrongBinder());
                obj2 = parcel.readStrongBinder();
                i1 = parcel.readInt();
                String as[] = parcel.createStringArray();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(((eq) (obj1)), ((IBinder) (obj2)), i1, as, ((Bundle) (obj)), flag, parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readStrongBinder();
                obj2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(((eq) (obj)), ((IBinder) (obj1)), ((String) (obj2)), flag, parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = a(eq.a.B(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 5034: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = b(parcel.createByteArray(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 5035: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = M(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                clearNotifications(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5037: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5038: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(eq.a.B(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5039: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag = true;
                }
                a(((eq) (obj)), ((String) (obj1)), ((String) (obj2)), i1, j1, k1, flag);
                parcel1.writeNoException();
                return true;

            case 5040: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                boolean flag1 = flag36;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                }
                b(((eq) (obj)), ((String) (obj1)), ((String) (obj2)), i1, j1, k1, flag1);
                parcel1.writeNoException();
                return true;

            case 5041: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(eq.a.B(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5042: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5043: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5044: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                boolean flag2;
                boolean flag22;
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag22 = true;
                } else
                {
                    flag22 = false;
                }
                a(((eq) (obj)), i1, j1, flag2, flag22);
                parcel1.writeNoException();
                return true;

            case 5045: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag3;
                boolean flag23;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag23 = true;
                } else
                {
                    flag23 = false;
                }
                a(((eq) (obj)), ((String) (obj1)), i1, flag3, flag23);
                parcel1.writeNoException();
                return true;

            case 5046: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag4;
                boolean flag24;
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                flag24 = flag30;
                if (parcel.readInt() != 0)
                {
                    flag24 = true;
                }
                b(((eq) (obj)), i1, flag4, flag24);
                parcel1.writeNoException();
                return true;

            case 5047: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5048: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag5;
                boolean flag25;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                flag25 = flag33;
                if (parcel.readInt() != 0)
                {
                    flag25 = true;
                }
                c(((eq) (obj)), i1, flag5, flag25);
                parcel1.writeNoException();
                return true;

            case 5049: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5050: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                N(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5051: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5052: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5053: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = j(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 5060: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = O(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 5054: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag6 = flag37;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                }
                a(((eq) (obj)), ((String) (obj1)), flag6);
                parcel1.writeNoException();
                return true;

            case 5061: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                k(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5055: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                k(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5067: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag7 = bV();
                parcel1.writeNoException();
                i1 = k1;
                if (flag7)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 5068: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag8 = flag38;
                if (parcel.readInt() != 0)
                {
                    flag8 = true;
                }
                setUseNewPlayerNotificationsFirstParty(flag8);
                parcel1.writeNoException();
                return true;

            case 5056: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5057: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                l(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5062: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(eq.a.B(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5063: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                boolean flag9 = flag39;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                a(((eq) (obj)), flag9);
                parcel1.writeNoException();
                return true;

            case 5066: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = P(parcel.readString());
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

            case 5501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag10;
                boolean flag26;
                if (parcel.readInt() != 0)
                {
                    flag10 = true;
                } else
                {
                    flag10 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag26 = true;
                } else
                {
                    flag26 = false;
                }
                b(((eq) (obj)), ((String) (obj1)), i1, flag10, flag26);
                parcel1.writeNoException();
                return true;

            case 5502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bW();
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

            case 6001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                boolean flag11 = flag40;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                }
                b(((eq) (obj)), flag11);
                parcel1.writeNoException();
                return true;

            case 6002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                boolean flag12 = flag41;
                if (parcel.readInt() != 0)
                {
                    flag12 = true;
                }
                a(((eq) (obj)), ((String) (obj1)), ((String) (obj2)), flag12);
                parcel1.writeNoException();
                return true;

            case 6003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag13;
                boolean flag27;
                if (parcel.readInt() != 0)
                {
                    flag13 = true;
                } else
                {
                    flag13 = false;
                }
                flag27 = flag34;
                if (parcel.readInt() != 0)
                {
                    flag27 = true;
                }
                d(((eq) (obj)), i1, flag13, flag27);
                parcel1.writeNoException();
                return true;

            case 6004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag14;
                boolean flag28;
                if (parcel.readInt() != 0)
                {
                    flag14 = true;
                } else
                {
                    flag14 = false;
                }
                flag28 = flag35;
                if (parcel.readInt() != 0)
                {
                    flag28 = true;
                }
                e(((eq) (obj)), i1, flag14, flag28);
                parcel1.writeNoException();
                return true;

            case 6501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag15;
                boolean flag29;
                boolean flag31;
                if (parcel.readInt() != 0)
                {
                    flag15 = true;
                } else
                {
                    flag15 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag29 = true;
                } else
                {
                    flag29 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag31 = true;
                } else
                {
                    flag31 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag32 = true;
                }
                a(((eq) (obj)), ((String) (obj1)), i1, flag15, flag29, flag31, flag32);
                parcel1.writeNoException();
                return true;

            case 6502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag16 = flag42;
                if (parcel.readInt() != 0)
                {
                    flag16 = true;
                }
                b(((eq) (obj)), ((String) (obj1)), flag16);
                parcel1.writeNoException();
                return true;

            case 6503: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                boolean flag17 = flag43;
                if (parcel.readInt() != 0)
                {
                    flag17 = true;
                }
                c(((eq) (obj)), flag17);
                parcel1.writeNoException();
                return true;

            case 6504: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag18 = flag44;
                if (parcel.readInt() != 0)
                {
                    flag18 = true;
                }
                c(((eq) (obj)), ((String) (obj1)), flag18);
                parcel1.writeNoException();
                return true;

            case 6505: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag19 = flag45;
                if (parcel.readInt() != 0)
                {
                    flag19 = true;
                }
                d(((eq) (obj)), ((String) (obj1)), flag19);
                parcel1.writeNoException();
                return true;

            case 6506: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                boolean flag20 = flag46;
                if (parcel.readInt() != 0)
                {
                    flag20 = true;
                }
                b(((eq) (obj)), ((String) (obj1)), ((String) (obj2)), flag20);
                parcel1.writeNoException();
                return true;

            case 6507: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = ibinder1;
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                }
                parcel = e(((Uri) (obj)));
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

            case 7001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                m(eq.a.B(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(eq.a.B(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = eq.a.B(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                obj2 = parcel.readStrongBinder();
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(((eq) (obj)), ((String) (obj1)), i1, ((IBinder) (obj2)), parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static class a.a
        implements er
    {

        private IBinder dG;

        public String L(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            dG.transact(5064, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public String M(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            dG.transact(5035, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void N(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            dG.transact(5050, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int O(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            dG.transact(5060, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public Uri P(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            dG.transact(5066, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Uri)Uri.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s;
_L2:
            s = null;
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int a(eq eq1, byte abyte0[], String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            eq1 = eq1.asBinder();
_L1:
            int i1;
            parcel.writeStrongBinder(eq1);
            parcel.writeByteArray(abyte0);
            parcel.writeString(s);
            parcel.writeString(s1);
            dG.transact(5033, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeStrongBinder(ibinder);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            dG.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ibinder;
            parcel1.recycle();
            parcel.recycle();
            throw ibinder;
        }

        public void a(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, int i1, int j1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(5044, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(5015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeLong(l1);
            dG.transact(5058, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, Bundle bundle, int i1, int j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null) goto _L2; else goto _L1
_L1:
            eq1 = eq1.asBinder();
_L5:
            parcel.writeStrongBinder(eq1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            dG.transact(5021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            eq1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
              goto _L5
        }

        public void a(eq eq1, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null) goto _L2; else goto _L1
_L1:
            eq1 = eq1.asBinder();
_L6:
            parcel.writeStrongBinder(eq1);
            parcel.writeStrongBinder(ibinder);
            parcel.writeInt(i1);
            parcel.writeStringArray(as);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
              goto _L5
_L7:
            parcel.writeInt(i1);
            parcel.writeLong(l1);
            dG.transact(5030, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            eq1 = null;
              goto _L6
_L4:
            parcel.writeInt(0);
              goto _L5
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
_L9:
            i1 = 0;
              goto _L7
_L5:
            if (!flag) goto _L9; else goto _L8
_L8:
            i1 = ((flag1) ? 1 : 0);
              goto _L7
        }

        public void a(eq eq1, IBinder ibinder, String s, boolean flag, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            parcel.writeLong(l1);
            dG.transact(5031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, int i1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null) goto _L2; else goto _L1
_L1:
            eq1 = eq1.asBinder();
_L5:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(5025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            eq1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
              goto _L5
        }

        public void a(eq eq1, String s, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(5045, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag4;
            flag4 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag3)
            {
                i1 = ((flag4) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(6501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeLong(l1);
            dG.transact(5016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeLong(l1);
            parcel.writeString(s1);
            dG.transact(7002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null) goto _L2; else goto _L1
_L1:
            eq1 = eq1.asBinder();
_L5:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(5023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            eq1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
              goto _L5
        }

        public void a(eq eq1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeString(s1);
            dG.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, String s1, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5039, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(6002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5054, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, String s, boolean flag, long al[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            parcel.writeLongArray(al);
            dG.transact(5011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(eq eq1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5063, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void a(String s, String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            dG.transact(5051, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public IBinder asBinder()
        {
            return dG;
        }

        public int b(byte abyte0[], String s, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeByteArray(abyte0);
            parcel.writeString(s);
            parcel.writeStringArray(as);
            dG.transact(5034, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            abyte0;
            parcel1.recycle();
            parcel.recycle();
            throw abyte0;
        }

        public void b(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(5046, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, String s, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, String s, int i1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null) goto _L2; else goto _L1
_L1:
            eq1 = eq1.asBinder();
_L5:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(7003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            eq1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
              goto _L5
        }

        public void b(eq eq1, String s, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(5501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, String s, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null) goto _L2; else goto _L1
_L1:
            eq1 = eq1.asBinder();
_L5:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(5024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            eq1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
              goto _L5
        }

        public void b(eq eq1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeString(s1);
            dG.transact(5038, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, String s, String s1, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5040, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, String s, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(6506, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(6502, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void b(eq eq1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(6001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void bT()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5006, parcel, parcel1, 0);
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

        public d bU()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5013, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            d d1 = d.CREATOR.h(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return d1;
_L2:
            d1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public boolean bV()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5067, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public d bW()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5502, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            d d1 = d.CREATOR.h(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return d1;
_L2:
            d1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Bundle ba()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return bundle;
_L2:
            bundle = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void c(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void c(eq eq1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(5048, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void c(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void c(eq eq1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            parcel.writeString(s1);
            dG.transact(5041, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void c(eq eq1, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(6504, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void c(eq eq1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(6503, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void clearNotifications(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i1);
            dG.transact(5036, parcel, parcel1, 0);
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

        public void d(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void d(eq eq1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(6003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void d(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void d(eq eq1, String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(6505, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public ParcelFileDescriptor e(Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L3:
            dG.transact(6507, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            uri = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return uri;
_L2:
            parcel.writeInt(0);
              goto _L3
            uri;
            parcel1.recycle();
            parcel.recycle();
            throw uri;
            uri = null;
              goto _L4
        }

        public void e(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void e(eq eq1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeInt(i1);
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (flag1)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            dG.transact(6004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void e(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5032, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void f(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            dG.transact(5001, parcel, parcel1, 0);
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

        public void f(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5047, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void f(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5037, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void f(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeString(s1);
            dG.transact(5065, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void g(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            dG.transact(5059, parcel, parcel1, 0);
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

        public void g(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5049, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void g(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5042, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public String getAppId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getCurrentAccountName()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getCurrentPlayerId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            dG.transact(5012, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void h(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5056, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void h(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5043, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void i(eq eq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            dG.transact(5062, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void i(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5052, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void i(String s, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            dG.transact(5029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public int j(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            eq1 = eq1.asBinder();
_L1:
            int i1;
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5053, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void j(String s, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            dG.transact(5028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void k(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5061, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void k(String s, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s);
            parcel.writeInt(i1);
            dG.transact(5055, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void l(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(5057, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void m(eq eq1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (eq1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            eq1 = eq1.asBinder();
_L1:
            parcel.writeStrongBinder(eq1);
            parcel.writeString(s);
            dG.transact(7001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            eq1 = null;
              goto _L1
            eq1;
            parcel1.recycle();
            parcel.recycle();
            throw eq1;
        }

        public void setUseNewPlayerNotificationsFirstParty(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5068, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public abstract String L(String s)
        throws RemoteException;

    public abstract String M(String s)
        throws RemoteException;

    public abstract void N(String s)
        throws RemoteException;

    public abstract int O(String s)
        throws RemoteException;

    public abstract Uri P(String s)
        throws RemoteException;

    public abstract int a(eq eq, byte abyte0[], String s, String s1)
        throws RemoteException;

    public abstract void a(IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(eq eq)
        throws RemoteException;

    public abstract void a(eq eq, int i1, int j1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void a(eq eq, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void a(eq eq, long l1)
        throws RemoteException;

    public abstract void a(eq eq, Bundle bundle, int i1, int j1)
        throws RemoteException;

    public abstract void a(eq eq, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1)
        throws RemoteException;

    public abstract void a(eq eq, IBinder ibinder, String s, boolean flag, long l1)
        throws RemoteException;

    public abstract void a(eq eq, String s)
        throws RemoteException;

    public abstract void a(eq eq, String s, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void a(eq eq, String s, int i1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(eq eq, String s, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void a(eq eq, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        throws RemoteException;

    public abstract void a(eq eq, String s, long l1)
        throws RemoteException;

    public abstract void a(eq eq, String s, long l1, String s1)
        throws RemoteException;

    public abstract void a(eq eq, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(eq eq, String s, String s1)
        throws RemoteException;

    public abstract void a(eq eq, String s, String s1, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void a(eq eq, String s, String s1, boolean flag)
        throws RemoteException;

    public abstract void a(eq eq, String s, boolean flag)
        throws RemoteException;

    public abstract void a(eq eq, String s, boolean flag, long al[])
        throws RemoteException;

    public abstract void a(eq eq, boolean flag)
        throws RemoteException;

    public abstract void a(String s, String s1, int i1)
        throws RemoteException;

    public abstract int b(byte abyte0[], String s, String as[])
        throws RemoteException;

    public abstract void b(eq eq)
        throws RemoteException;

    public abstract void b(eq eq, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void b(eq eq, String s)
        throws RemoteException;

    public abstract void b(eq eq, String s, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void b(eq eq, String s, int i1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void b(eq eq, String s, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void b(eq eq, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void b(eq eq, String s, String s1)
        throws RemoteException;

    public abstract void b(eq eq, String s, String s1, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void b(eq eq, String s, String s1, boolean flag)
        throws RemoteException;

    public abstract void b(eq eq, String s, boolean flag)
        throws RemoteException;

    public abstract void b(eq eq, boolean flag)
        throws RemoteException;

    public abstract void bT()
        throws RemoteException;

    public abstract d bU()
        throws RemoteException;

    public abstract boolean bV()
        throws RemoteException;

    public abstract d bW()
        throws RemoteException;

    public abstract Bundle ba()
        throws RemoteException;

    public abstract void c(eq eq)
        throws RemoteException;

    public abstract void c(eq eq, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void c(eq eq, String s)
        throws RemoteException;

    public abstract void c(eq eq, String s, String s1)
        throws RemoteException;

    public abstract void c(eq eq, String s, boolean flag)
        throws RemoteException;

    public abstract void c(eq eq, boolean flag)
        throws RemoteException;

    public abstract void clearNotifications(int i1)
        throws RemoteException;

    public abstract void d(eq eq)
        throws RemoteException;

    public abstract void d(eq eq, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void d(eq eq, String s)
        throws RemoteException;

    public abstract void d(eq eq, String s, boolean flag)
        throws RemoteException;

    public abstract ParcelFileDescriptor e(Uri uri)
        throws RemoteException;

    public abstract void e(eq eq)
        throws RemoteException;

    public abstract void e(eq eq, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void e(eq eq, String s)
        throws RemoteException;

    public abstract void f(long l1)
        throws RemoteException;

    public abstract void f(eq eq)
        throws RemoteException;

    public abstract void f(eq eq, String s)
        throws RemoteException;

    public abstract void f(String s, String s1)
        throws RemoteException;

    public abstract void g(long l1)
        throws RemoteException;

    public abstract void g(eq eq)
        throws RemoteException;

    public abstract void g(eq eq, String s)
        throws RemoteException;

    public abstract String getAppId()
        throws RemoteException;

    public abstract String getCurrentAccountName()
        throws RemoteException;

    public abstract String getCurrentPlayerId()
        throws RemoteException;

    public abstract void h(eq eq)
        throws RemoteException;

    public abstract void h(eq eq, String s)
        throws RemoteException;

    public abstract void i(eq eq)
        throws RemoteException;

    public abstract void i(eq eq, String s)
        throws RemoteException;

    public abstract void i(String s, int i1)
        throws RemoteException;

    public abstract int j(eq eq, String s)
        throws RemoteException;

    public abstract void j(String s, int i1)
        throws RemoteException;

    public abstract void k(eq eq, String s)
        throws RemoteException;

    public abstract void k(String s, int i1)
        throws RemoteException;

    public abstract void l(eq eq, String s)
        throws RemoteException;

    public abstract void m(eq eq, String s)
        throws RemoteException;

    public abstract void setUseNewPlayerNotificationsFirstParty(boolean flag)
        throws RemoteException;
}
