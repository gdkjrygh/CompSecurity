// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.achievement.AchievementEntityCreator;
import com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.internal.request.GameRequestClusterCreator;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesCallbacks

public interface IGamesService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGamesService
    {

        public static IGamesService aB(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
            if (iinterface != null && (iinterface instanceof IGamesService))
            {
                return (IGamesService)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object aobj[] = null;
            Object obj = null;
            boolean flag1 = false;
            boolean flag73 = false;
            boolean flag74 = false;
            boolean flag67 = false;
            boolean flag70 = false;
            boolean flag75 = false;
            int k1 = 0;
            boolean flag76 = false;
            boolean flag77 = false;
            boolean flag78 = false;
            boolean flag79 = false;
            boolean flag71 = false;
            boolean flag72 = false;
            boolean flag69 = false;
            boolean flag80 = false;
            boolean flag81 = false;
            boolean flag82 = false;
            boolean flag83 = false;
            boolean flag84 = false;
            boolean flag85 = false;
            boolean flag86 = false;
            boolean flag87 = false;
            boolean flag88 = false;
            boolean flag89 = false;
            boolean flag90 = false;
            boolean flag = false;
            boolean flag91 = false;
            boolean flag92 = false;
            boolean flag93 = false;
            boolean flag94 = false;
            boolean flag95 = false;
            boolean flag96 = false;
            boolean flag97 = false;
            boolean flag98 = false;
            boolean flag99 = false;
            boolean flag51 = false;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.internal.IGamesService");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                q(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kp();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = fC();
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
                obj = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((IBinder) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                kx();
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = ka();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5064: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bE(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5065: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                u(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kb();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kz();
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
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                i1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag51 = true;
                }
                a(((IGamesCallbacks) (obj)), i1, flag1, flag51);
                parcel1.writeNoException();
                return true;

            case 5016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, j1, k1, flag1);
                parcel1.writeNoException();
                return true;

            case 5020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, j1, k1, flag1);
                parcel1.writeNoException();
                return true;

            case 5021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                a(((IGamesCallbacks) (obj1)), ((Bundle) (obj)), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), ((IBinder) (obj2)), parcel);
                parcel1.writeNoException();
                return true;

            case 5024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), ((IBinder) (obj2)), parcel);
                parcel1.writeNoException();
                return true;

            case 5025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
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
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, ((IBinder) (obj2)), parcel);
                parcel1.writeNoException();
                return true;

            case 5026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                p(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                o(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5058: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5059: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                r(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj2 = parcel.readStrongBinder();
                i1 = parcel.readInt();
                aobj = parcel.createStringArray();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                }
                a(((IGamesCallbacks) (obj1)), ((IBinder) (obj2)), i1, ((String []) (aobj)), ((Bundle) (obj)), flag1, parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readStrongBinder();
                obj2 = parcel.readString();
                boolean flag2;
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                a(((IGamesCallbacks) (obj)), ((IBinder) (obj1)), ((String) (obj2)), flag2, parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
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
                parcel = bF(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                dC(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5037: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5038: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5039: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                boolean flag3 = flag73;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), i1, j1, k1, flag3);
                parcel1.writeNoException();
                return true;

            case 5040: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                boolean flag4 = flag74;
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), i1, j1, k1, flag4);
                parcel1.writeNoException();
                return true;

            case 5041: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5042: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5043: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5044: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                boolean flag5;
                boolean flag52;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag52 = true;
                } else
                {
                    flag52 = false;
                }
                a(((IGamesCallbacks) (obj)), i1, j1, flag5, flag52);
                parcel1.writeNoException();
                return true;

            case 5045: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag6;
                boolean flag53;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag53 = true;
                } else
                {
                    flag53 = false;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag6, flag53);
                parcel1.writeNoException();
                return true;

            case 5046: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag7;
                boolean flag54;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                flag54 = flag67;
                if (parcel.readInt() != 0)
                {
                    flag54 = true;
                }
                b(((IGamesCallbacks) (obj)), i1, flag7, flag54);
                parcel1.writeNoException();
                return true;

            case 5047: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5048: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag8;
                boolean flag55;
                if (parcel.readInt() != 0)
                {
                    flag8 = true;
                } else
                {
                    flag8 = false;
                }
                flag55 = flag70;
                if (parcel.readInt() != 0)
                {
                    flag55 = true;
                }
                c(((IGamesCallbacks) (obj)), i1, flag8, flag55);
                parcel1.writeNoException();
                return true;

            case 5049: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5050: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                bG(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5051: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5052: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5053: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = h(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
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

            case 5060: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = bH(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 5054: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag9 = flag75;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), flag9);
                parcel1.writeNoException();
                return true;

            case 5061: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5055: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                r(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5067: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag10 = kA();
                parcel1.writeNoException();
                i1 = k1;
                if (flag10)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 5068: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag11 = flag76;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                }
                N(flag11);
                parcel1.writeNoException();
                return true;

            case 5056: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5057: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                j(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5062: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5063: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag12 = flag77;
                if (parcel.readInt() != 0)
                {
                    flag12 = true;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((IGamesCallbacks) (obj)), flag12, parcel);
                parcel1.writeNoException();
                return true;

            case 5066: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bI(parcel.readString());
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
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag13;
                boolean flag56;
                if (parcel.readInt() != 0)
                {
                    flag13 = true;
                } else
                {
                    flag13 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag56 = true;
                } else
                {
                    flag56 = false;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag13, flag56);
                parcel1.writeNoException();
                return true;

            case 5502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kB();
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
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag14 = flag78;
                if (parcel.readInt() != 0)
                {
                    flag14 = true;
                }
                a(((IGamesCallbacks) (obj)), flag14);
                parcel1.writeNoException();
                return true;

            case 6002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                boolean flag15 = flag79;
                if (parcel.readInt() != 0)
                {
                    flag15 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), flag15);
                parcel1.writeNoException();
                return true;

            case 6003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag16;
                boolean flag57;
                if (parcel.readInt() != 0)
                {
                    flag16 = true;
                } else
                {
                    flag16 = false;
                }
                flag57 = flag71;
                if (parcel.readInt() != 0)
                {
                    flag57 = true;
                }
                d(((IGamesCallbacks) (obj)), i1, flag16, flag57);
                parcel1.writeNoException();
                return true;

            case 6004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag17;
                boolean flag58;
                if (parcel.readInt() != 0)
                {
                    flag17 = true;
                } else
                {
                    flag17 = false;
                }
                flag58 = flag72;
                if (parcel.readInt() != 0)
                {
                    flag58 = true;
                }
                e(((IGamesCallbacks) (obj)), i1, flag17, flag58);
                parcel1.writeNoException();
                return true;

            case 6501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag18;
                boolean flag59;
                boolean flag68;
                if (parcel.readInt() != 0)
                {
                    flag18 = true;
                } else
                {
                    flag18 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag59 = true;
                } else
                {
                    flag59 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag68 = true;
                } else
                {
                    flag68 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag69 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag18, flag59, flag68, flag69);
                parcel1.writeNoException();
                return true;

            case 6502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag19 = flag80;
                if (parcel.readInt() != 0)
                {
                    flag19 = true;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), flag19);
                parcel1.writeNoException();
                return true;

            case 6503: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag20 = flag81;
                if (parcel.readInt() != 0)
                {
                    flag20 = true;
                }
                b(((IGamesCallbacks) (obj)), flag20);
                parcel1.writeNoException();
                return true;

            case 6504: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag21 = flag82;
                if (parcel.readInt() != 0)
                {
                    flag21 = true;
                }
                c(((IGamesCallbacks) (obj)), ((String) (obj1)), flag21);
                parcel1.writeNoException();
                return true;

            case 6505: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag22 = flag83;
                if (parcel.readInt() != 0)
                {
                    flag22 = true;
                }
                d(((IGamesCallbacks) (obj)), ((String) (obj1)), flag22);
                parcel1.writeNoException();
                return true;

            case 6506: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                boolean flag23 = flag84;
                if (parcel.readInt() != 0)
                {
                    flag23 = true;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), flag23);
                parcel1.writeNoException();
                return true;

            case 6507: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = h(parcel);
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
                k(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
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
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, ((IBinder) (obj2)), parcel);
                parcel1.writeNoException();
                return true;

            case 8001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                bJ(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 8004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                obj1 = parcel.createStringArray();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((IGamesCallbacks) (obj)), i1, j1, ((String []) (obj1)), parcel);
                parcel1.writeNoException();
                return true;

            case 8005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                l(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                m(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readString(), (ParticipantResult[])parcel.createTypedArray(ParticipantResult.CREATOR));
                parcel1.writeNoException();
                return true;

            case 8008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), (ParticipantResult[])parcel.createTypedArray(ParticipantResult.CREATOR));
                parcel1.writeNoException();
                return true;

            case 8009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                n(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                o(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 8013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                s(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 8014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                p(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = kq();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 8025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                v(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 8026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                kC();
                parcel1.writeNoException();
                return true;

            case 8023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag24 = flag85;
                if (parcel.readInt() != 0)
                {
                    flag24 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag24);
                parcel1.writeNoException();
                return true;

            case 8027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag25 = flag86;
                if (parcel.readInt() != 0)
                {
                    flag25 = true;
                }
                c(((IGamesCallbacks) (obj)), flag25);
                parcel1.writeNoException();
                return true;

            case 9001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag26;
                boolean flag60;
                if (parcel.readInt() != 0)
                {
                    flag26 = true;
                } else
                {
                    flag26 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag60 = true;
                } else
                {
                    flag60 = false;
                }
                c(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag26, flag60);
                parcel1.writeNoException();
                return true;

            case 9002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                q(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 9003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = ke();
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

            case 9004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bx(parcel.readString());
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

            case 9005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kf();
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

            case 9006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kg();
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

            case 9007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kh();
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

            case 9008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                boolean flag27;
                if (parcel.readInt() != 0)
                {
                    flag27 = true;
                } else
                {
                    flag27 = false;
                }
                parcel = a(i1, j1, flag27);
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

            case 9009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                boolean flag28;
                if (parcel.readInt() != 0)
                {
                    flag28 = true;
                } else
                {
                    flag28 = false;
                }
                parcel = b(i1, j1, flag28);
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

            case 9010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = km();
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

            case 9011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0)
                {
                    obj = (RoomEntity)RoomEntity.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                parcel = a(((RoomEntity) (obj)), parcel.readInt());
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

            case 9012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kn();
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

            case 9013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kD();
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

            case 9031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = (ParticipantEntity[])parcel.createTypedArray(ParticipantEntity.CREATOR);
                obj2 = parcel.readString();
                aobj = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = a(((ParticipantEntity []) (obj1)), ((String) (obj2)), ((String) (aobj)), ((Uri) (obj)), parcel);
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

            case 9019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = ko();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 9020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag29;
                boolean flag61;
                if (parcel.readInt() != 0)
                {
                    flag29 = true;
                } else
                {
                    flag29 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag61 = true;
                } else
                {
                    flag61 = false;
                }
                d(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag29, flag61);
                parcel1.writeNoException();
                return true;

            case 9028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag30;
                boolean flag62;
                if (parcel.readInt() != 0)
                {
                    flag30 = true;
                } else
                {
                    flag30 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag62 = true;
                } else
                {
                    flag62 = false;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), i1, flag30, flag62);
                parcel1.writeNoException();
                return true;

            case 9030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bK(parcel.readString());
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

            case 10001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                t(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 10004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 10005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = a(parcel.readInt(), parcel.createByteArray(), parcel.readInt(), parcel.readString());
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

            case 10013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = ks();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 10023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = kt();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 10015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = kr();
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

            case 10022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = GameRequestCluster.CREATOR.ck(parcel);
                }
                parcel = a(((GameRequestCluster) (obj)), parcel.readString());
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

            case 10014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                s(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag31 = flag87;
                if (parcel.readInt() != 0)
                {
                    flag31 = true;
                }
                b(((IGamesCallbacks) (obj)), s1, i1, flag31);
                parcel1.writeNoException();
                return true;

            case 10021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = ZInvitationCluster.CREATOR.ci(parcel);
                }
                parcel = a(((ZInvitationCluster) (obj)), parcel.readString(), parcel.readString());
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

            case 10018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readInt(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 10019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 10020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 11001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                j(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 11002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                kE();
                parcel1.writeNoException();
                return true;

            case 12001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = parcel.readString();
                boolean flag32;
                boolean flag63;
                if (parcel.readInt() != 0)
                {
                    flag32 = true;
                } else
                {
                    flag32 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag63 = true;
                } else
                {
                    flag63 = false;
                }
                parcel = a(((String) (obj)), flag32, flag63, parcel.readInt());
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

            case 12002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag33 = flag88;
                if (parcel.readInt() != 0)
                {
                    flag33 = true;
                }
                d(((IGamesCallbacks) (obj)), flag33);
                parcel1.writeNoException();
                return true;

            case 12003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s2 = parcel.readString();
                String s9 = parcel.readString();
                boolean flag34 = flag89;
                if (parcel.readInt() != 0)
                {
                    flag34 = true;
                }
                c(((IGamesCallbacks) (obj)), s2, s9, flag34);
                parcel1.writeNoException();
                return true;

            case 12006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s3 = parcel.readString();
                boolean flag35 = flag90;
                if (parcel.readInt() != 0)
                {
                    flag35 = true;
                }
                e(((IGamesCallbacks) (obj)), s3, flag35);
                parcel1.writeNoException();
                return true;

            case 12007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s10 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = SnapshotMetadataChange.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(igamescallbacks, s10, ((SnapshotMetadataChange) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 12019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 12020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                r(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IGamesCallbacks igamescallbacks1 = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s11 = parcel.readString();
                aobj = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = SnapshotMetadataChange.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(igamescallbacks1, s11, ((String) (aobj)), ((SnapshotMetadataChange) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 12035: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = ku();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 12036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = kv();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 12005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                s(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s4 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag36;
                boolean flag64;
                if (parcel.readInt() != 0)
                {
                    flag36 = true;
                } else
                {
                    flag36 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag64 = true;
                } else
                {
                    flag64 = false;
                }
                e(((IGamesCallbacks) (obj)), s4, i1, flag36, flag64);
                parcel1.writeNoException();
                return true;

            case 12022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s5 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag37;
                boolean flag65;
                if (parcel.readInt() != 0)
                {
                    flag37 = true;
                } else
                {
                    flag37 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag65 = true;
                } else
                {
                    flag65 = false;
                }
                f(((IGamesCallbacks) (obj)), s5, i1, flag37, flag65);
                parcel1.writeNoException();
                return true;

            case 12025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag38 = kF();
                parcel1.writeNoException();
                i1 = ((flag) ? 1 : 0);
                if (flag38)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 12026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag39 = flag91;
                if (parcel.readInt() != 0)
                {
                    flag39 = true;
                }
                O(flag39);
                parcel1.writeNoException();
                return true;

            case 12027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                t(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag40 = flag92;
                if (parcel.readInt() != 0)
                {
                    flag40 = true;
                }
                e(((IGamesCallbacks) (obj)), flag40);
                parcel1.writeNoException();
                return true;

            case 12016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag41 = flag93;
                if (parcel.readInt() != 0)
                {
                    flag41 = true;
                }
                f(((IGamesCallbacks) (obj)), flag41);
                parcel1.writeNoException();
                return true;

            case 12031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag42 = flag94;
                if (parcel.readInt() != 0)
                {
                    flag42 = true;
                }
                a(((IGamesCallbacks) (obj)), flag42, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 12017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                n(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                u(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                int ai[] = parcel.createIntArray();
                i1 = parcel.readInt();
                boolean flag43 = flag95;
                if (parcel.readInt() != 0)
                {
                    flag43 = true;
                }
                a(((IGamesCallbacks) (obj)), ai, i1, flag43);
                parcel1.writeNoException();
                return true;

            case 12029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String as[] = parcel.createStringArray();
                boolean flag44 = flag96;
                if (parcel.readInt() != 0)
                {
                    flag44 = true;
                }
                a(((IGamesCallbacks) (obj)), as, flag44);
                parcel1.writeNoException();
                return true;

            case 12015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s6 = parcel.readString();
                String s12 = parcel.readString();
                aobj = parcel.createIntArray();
                i1 = parcel.readInt();
                boolean flag45;
                if (parcel.readInt() != 0)
                {
                    flag45 = true;
                } else
                {
                    flag45 = false;
                }
                a(((IGamesCallbacks) (obj)), s6, s12, ((int []) (aobj)), i1, flag45);
                parcel1.writeNoException();
                return true;

            case 12028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s7 = parcel.readString();
                String s13 = parcel.readString();
                aobj = parcel.createStringArray();
                boolean flag46;
                if (parcel.readInt() != 0)
                {
                    flag46 = true;
                } else
                {
                    flag46 = false;
                }
                a(((IGamesCallbacks) (obj)), s7, s13, ((String []) (aobj)), flag46);
                parcel1.writeNoException();
                return true;

            case 12011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 12013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aA(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                u(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 12014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = b(parcel.createIntArray());
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

            case 12034: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bC(parcel.readString());
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

            case 12018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                String s8 = parcel.readString();
                String s14 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag47;
                boolean flag66;
                if (parcel.readInt() != 0)
                {
                    flag47 = true;
                } else
                {
                    flag47 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag66 = true;
                } else
                {
                    flag66 = false;
                }
                b(((IGamesCallbacks) (obj)), s8, s14, i1, flag47, flag66);
                parcel1.writeNoException();
                return true;

            case 13001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag48 = flag97;
                if (parcel.readInt() != 0)
                {
                    flag48 = true;
                }
                P(flag48);
                parcel1.writeNoException();
                return true;

            case 13002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = parcel.readString();
                IBinder ibinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((String) (obj)), ibinder, parcel);
                parcel1.writeNoException();
                return true;

            case 13003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag49 = flag98;
                if (parcel.readInt() != 0)
                {
                    flag49 = true;
                }
                g(((IGamesCallbacks) (obj)), flag49);
                parcel1.writeNoException();
                return true;

            case 13004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aA(parcel.readStrongBinder());
                boolean flag50 = flag99;
                if (parcel.readInt() != 0)
                {
                    flag50 = true;
                }
                h(((IGamesCallbacks) (obj)), flag50);
                parcel1.writeNoException();
                return true;

            case 13005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = ((Object) (aobj));
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = AchievementEntity.CREATOR.createFromParcel(parcel);
            }
            parcel = a(((AchievementEntity) (obj)));
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
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesService");
        }
    }

    private static class Stub.Proxy
        implements IGamesService
    {

        private IBinder lb;

        public void N(boolean flag)
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
            lb.transact(5068, parcel, parcel1, 0);
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

        public void O(boolean flag)
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
            lb.transact(12026, parcel, parcel1, 0);
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

        public void P(boolean flag)
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
            lb.transact(13001, parcel, parcel1, 0);
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

        public int a(IGamesCallbacks igamescallbacks, byte abyte0[], String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            int i1;
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeByteArray(abyte0);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(5033, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public Intent a(int i1, int j1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(9008, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent a(int i1, byte abyte0[], int j1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i1);
            parcel.writeByteArray(abyte0);
            parcel.writeInt(j1);
            parcel.writeString(s1);
            lb.transact(10012, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            abyte0 = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return abyte0;
_L2:
            abyte0 = null;
            if (true) goto _L4; else goto _L3
_L3:
            abyte0;
            parcel1.recycle();
            parcel.recycle();
            throw abyte0;
        }

        public Intent a(AchievementEntity achievemententity)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (achievemententity == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            achievemententity.writeToParcel(parcel, 0);
_L3:
            lb.transact(13005, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            achievemententity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return achievemententity;
_L2:
            parcel.writeInt(0);
              goto _L3
            achievemententity;
            parcel1.recycle();
            parcel.recycle();
            throw achievemententity;
            achievemententity = null;
              goto _L4
        }

        public Intent a(ZInvitationCluster zinvitationcluster, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (zinvitationcluster == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            zinvitationcluster.writeToParcel(parcel, 0);
_L3:
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(10021, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_125;
            }
            zinvitationcluster = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return zinvitationcluster;
_L2:
            parcel.writeInt(0);
              goto _L3
            zinvitationcluster;
            parcel1.recycle();
            parcel.recycle();
            throw zinvitationcluster;
            zinvitationcluster = null;
              goto _L4
        }

        public Intent a(GameRequestCluster gamerequestcluster, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (gamerequestcluster == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            gamerequestcluster.writeToParcel(parcel, 0);
_L3:
            parcel.writeString(s1);
            lb.transact(10022, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            gamerequestcluster = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return gamerequestcluster;
_L2:
            parcel.writeInt(0);
              goto _L3
            gamerequestcluster;
            parcel1.recycle();
            parcel.recycle();
            throw gamerequestcluster;
            gamerequestcluster = null;
              goto _L4
        }

        public Intent a(RoomEntity roomentity, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (roomentity == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            roomentity.writeToParcel(parcel, 0);
_L3:
            parcel.writeInt(i1);
            lb.transact(9011, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            roomentity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return roomentity;
_L2:
            parcel.writeInt(0);
              goto _L3
            roomentity;
            parcel1.recycle();
            parcel.recycle();
            throw roomentity;
            roomentity = null;
              goto _L4
        }

        public Intent a(String s1, boolean flag, boolean flag1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            int j1;
            if (flag)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
            if (flag1)
            {
                j1 = ((flag2) ? 1 : 0);
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
            parcel.writeInt(i1);
            lb.transact(12001, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s1 = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s1;
_L2:
            s1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public Intent a(ParticipantEntity aparticipantentity[], String s1, String s2, Uri uri, Uri uri1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeTypedArray(aparticipantentity, 0);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L5:
            if (uri1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri1.writeToParcel(parcel, 0);
_L6:
            lb.transact(9031, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_162;
            }
            aparticipantentity = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L7:
            parcel1.recycle();
            parcel.recycle();
            return aparticipantentity;
_L2:
            parcel.writeInt(0);
              goto _L5
            aparticipantentity;
            parcel1.recycle();
            parcel.recycle();
            throw aparticipantentity;
_L4:
            parcel.writeInt(0);
              goto _L6
            aparticipantentity = null;
              goto _L7
        }

        public void a(long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(8019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
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
            lb.transact(5005, parcel, parcel1, 0);
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

        public void a(Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L1:
            lb.transact(12019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            contents;
            parcel1.recycle();
            parcel.recycle();
            throw contents;
        }

        public void a(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i1);
            lb.transact(10016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, int i1, int j1, int k1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            lb.transact(10009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, int i1, int j1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(5044, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, int i1, int j1, String as[], Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeStringArray(as);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(8004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void a(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(5015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, int i1, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i1);
            parcel.writeIntArray(ai);
            lb.transact(10018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            lb.transact(5058, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(8018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, Bundle bundle, int i1, int j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            lb.transact(5021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void a(IGamesCallbacks igamescallbacks, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L6:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(5030, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L6
_L4:
            parcel.writeInt(0);
              goto _L5
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
_L9:
            i1 = 0;
              goto _L7
_L5:
            if (!flag) goto _L9; else goto _L8
_L8:
            i1 = ((flag1) ? 1 : 0);
              goto _L7
        }

        public void a(IGamesCallbacks igamescallbacks, IBinder ibinder, String s1, boolean flag, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            parcel.writeLong(l1);
            lb.transact(5031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(10011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(5019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int i1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(5025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(8023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
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
            lb.transact(5045, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag4;
            flag4 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
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
            lb.transact(6501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int i1, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            parcel.writeIntArray(ai);
            lb.transact(10019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeLong(l1);
            lb.transact(5016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, long l1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeLong(l1);
            parcel.writeString(s2);
            lb.transact(7002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(5023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, SnapshotMetadataChange snapshotmetadatachange, Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            if (snapshotmetadatachange == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            snapshotmetadatachange.writeToParcel(parcel, 0);
_L6:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L7:
            lb.transact(12007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(5038, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            lb.transact(8001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            lb.transact(10010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(5039, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
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
            lb.transact(9028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, SnapshotMetadataChange snapshotmetadatachange, Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (snapshotmetadatachange == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            snapshotmetadatachange.writeToParcel(parcel, 0);
_L6:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_145;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L7:
            lb.transact(12033, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(6002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, int ai[], int i1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeIntArray(ai);
            parcel.writeInt(i1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            lb.transact(10008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, String as[], boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(5054, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, byte abyte0[], String s2, ParticipantResult aparticipantresult[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            parcel.writeString(s2);
            parcel.writeTypedArray(aparticipantresult, 0);
            lb.transact(8007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, byte abyte0[], ParticipantResult aparticipantresult[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            parcel.writeTypedArray(aparticipantresult, 0);
            lb.transact(8008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeIntArray(ai);
            lb.transact(8017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String s1, String as[], int i1, byte abyte0[], int j1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            parcel.writeInt(i1);
            parcel.writeByteArray(abyte0);
            parcel.writeInt(j1);
            lb.transact(10005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(6001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, boolean flag, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            if (!flag)
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(5063, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void a(IGamesCallbacks igamescallbacks, boolean flag, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            parcel.writeStringArray(as);
            lb.transact(12031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeIntArray(ai);
            lb.transact(8003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, int ai[], int i1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeIntArray(ai);
            parcel.writeInt(i1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            lb.transact(10006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(IGamesCallbacks igamescallbacks, String as[], boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void a(String s1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            lb.transact(13002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        public int b(byte abyte0[], String s1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeByteArray(abyte0);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            lb.transact(5034, parcel, parcel1, 0);
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

        public Intent b(int i1, int j1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(9009, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent b(int ai[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeIntArray(ai);
            lb.transact(12030, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            ai = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ai;
_L2:
            ai = null;
            if (true) goto _L4; else goto _L3
_L3:
            ai;
            parcel1.recycle();
            parcel.recycle();
            throw ai;
        }

        public void b(long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(8021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void b(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(5046, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            lb.transact(8012, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(8020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(12023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(5020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, int i1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(7003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(10017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
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
            lb.transact(5501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null) goto _L2; else goto _L1
_L1:
            igamescallbacks = igamescallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(5024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igamescallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
              goto _L5
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(5041, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeInt(k1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(5040, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
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
            lb.transact(12018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(6506, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(6502, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(6503, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(IGamesCallbacks igamescallbacks, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            lb.transact(10007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void b(String s1, String s2, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i1);
            lb.transact(5051, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public Intent bC(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(12034, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s1 = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s1;
_L2:
            s1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public String bE(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(5064, parcel, parcel1, 0);
            parcel1.readException();
            s1 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s1;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public String bF(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(5035, parcel, parcel1, 0);
            parcel1.readException();
            s1 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s1;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void bG(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(5050, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public int bH(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(5060, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public Uri bI(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(5066, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s1 = (Uri)Uri.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s1;
_L2:
            s1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void bJ(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(8002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public ParcelFileDescriptor bK(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(9030, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s1;
_L2:
            s1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public Intent bx(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            lb.transact(9004, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s1 = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return s1;
_L2:
            s1 = null;
            if (true) goto _L4; else goto _L3
_L3:
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void c(long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(10004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void c(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(5048, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            lb.transact(10001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(10003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5032, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(12024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
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
            lb.transact(9001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(8011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(6504, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(8027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(IGamesCallbacks igamescallbacks, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeStringArray(as);
            lb.transact(10020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void c(String s1, String s2, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i1);
            lb.transact(8026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void d(long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(12014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void d(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(6003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            lb.transact(12011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, long l1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeLong(l1);
            parcel.writeString(s1);
            lb.transact(12013, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5037, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
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
            lb.transact(9020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(8015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(6505, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void d(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void dC(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i1);
            lb.transact(5036, parcel, parcel1, 0);
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

        public void e(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void e(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
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
            lb.transact(6004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void e(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5042, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void e(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
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
            lb.transact(12021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void e(IGamesCallbacks igamescallbacks, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(8016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void e(IGamesCallbacks igamescallbacks, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void e(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12032, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void f(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5047, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void f(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5043, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void f(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
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
            lb.transact(12022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void f(IGamesCallbacks igamescallbacks, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(12009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void f(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(12016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public Bundle fC()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(5004, parcel, parcel1, 0);
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

        public void g(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5049, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void g(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5052, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void g(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(13003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public ParcelFileDescriptor h(Uri uri)
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
            lb.transact(6507, parcel, parcel1, 0);
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

        public RoomEntity h(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5053, parcel, parcel1, 0);
            parcel1.readException();
            igamescallbacks = obj;
            if (parcel1.readInt() != 0)
            {
                igamescallbacks = (RoomEntity)RoomEntity.CREATOR.createFromParcel(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return igamescallbacks;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void h(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5056, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void h(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            lb.transact(13004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void i(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(5062, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void i(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5061, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void j(IGamesCallbacks igamescallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            lb.transact(11001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void j(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(5057, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void k(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(7001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public boolean kA()
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
            lb.transact(5067, parcel, parcel1, 0);
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

        public DataHolder kB()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(5502, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            DataHolder dataholder = DataHolder.CREATOR.z(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return dataholder;
_L2:
            dataholder = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void kC()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(8022, parcel, parcel1, 0);
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

        public Intent kD()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9013, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void kE()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(11002, parcel, parcel1, 0);
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

        public boolean kF()
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
            lb.transact(12025, parcel, parcel1, 0);
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

        public String ka()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            s1 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String kb()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(5012, parcel, parcel1, 0);
            parcel1.readException();
            s1 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent ke()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9003, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent kf()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9005, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent kg()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9006, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent kh()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9007, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent km()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9010, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent kn()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9012, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int ko()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(9019, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String kp()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            s1 = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int kq()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(8024, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public Intent kr()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(10015, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return intent;
_L2:
            intent = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int ks()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(10013, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int kt()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(10023, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int ku()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(12035, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int kv()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(12036, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void kx()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(5006, parcel, parcel1, 0);
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

        public DataHolder kz()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            lb.transact(5013, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            DataHolder dataholder = DataHolder.CREATOR.z(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return dataholder;
_L2:
            dataholder = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void l(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(8005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void m(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(8006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void n(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(8009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void n(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(12017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void o(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(8010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void o(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(5029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void p(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(8014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void p(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(5028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void q(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            lb.transact(5001, parcel, parcel1, 0);
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

        public void q(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(9002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void r(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            lb.transact(5059, parcel, parcel1, 0);
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

        public void r(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(12020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void r(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(5055, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void s(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            lb.transact(8013, parcel, parcel1, 0);
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

        public void s(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(12005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void s(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            lb.transact(10014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void t(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            lb.transact(10002, parcel, parcel1, 0);
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

        public void t(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(12027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void u(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            lb.transact(12012, parcel, parcel1, 0);
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

        public void u(IGamesCallbacks igamescallbacks, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (igamescallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeString(s1);
            lb.transact(12008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igamescallbacks = null;
              goto _L1
            igamescallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igamescallbacks;
        }

        public void u(String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(5065, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void v(String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(8025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        Stub.Proxy(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public abstract void N(boolean flag)
        throws RemoteException;

    public abstract void O(boolean flag)
        throws RemoteException;

    public abstract void P(boolean flag)
        throws RemoteException;

    public abstract int a(IGamesCallbacks igamescallbacks, byte abyte0[], String s1, String s2)
        throws RemoteException;

    public abstract Intent a(int i1, int j1, boolean flag)
        throws RemoteException;

    public abstract Intent a(int i1, byte abyte0[], int j1, String s1)
        throws RemoteException;

    public abstract Intent a(AchievementEntity achievemententity)
        throws RemoteException;

    public abstract Intent a(ZInvitationCluster zinvitationcluster, String s1, String s2)
        throws RemoteException;

    public abstract Intent a(GameRequestCluster gamerequestcluster, String s1)
        throws RemoteException;

    public abstract Intent a(RoomEntity roomentity, int i1)
        throws RemoteException;

    public abstract Intent a(String s1, boolean flag, boolean flag1, int i1)
        throws RemoteException;

    public abstract Intent a(ParticipantEntity aparticipantentity[], String s1, String s2, Uri uri, Uri uri1)
        throws RemoteException;

    public abstract void a(long l1, String s1)
        throws RemoteException;

    public abstract void a(IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(Contents contents)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int i1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int i1, int j1, int k1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int i1, int j1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int i1, int j1, String as[], Bundle bundle)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int i1, int ai[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, long l1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, long l1, String s1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, Bundle bundle, int i1, int j1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, IBinder ibinder, String s1, boolean flag, long l1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int i1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int i1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int i1, int ai[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, long l1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, long l1, String s2)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, SnapshotMetadataChange snapshotmetadatachange, Contents contents)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, SnapshotMetadataChange snapshotmetadatachange, Contents contents)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, int ai[], int i1, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, String as[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, String as[], boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, byte abyte0[], String s2, ParticipantResult aparticipantresult[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, byte abyte0[], ParticipantResult aparticipantresult[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, int ai[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String as[], int i1, byte abyte0[], int j1)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, boolean flag, Bundle bundle)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, boolean flag, String as[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int ai[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, int ai[], int i1, boolean flag)
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException;

    public abstract void a(IGamesCallbacks igamescallbacks, String as[], boolean flag)
        throws RemoteException;

    public abstract void a(String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract int b(byte abyte0[], String s1, String as[])
        throws RemoteException;

    public abstract Intent b(int i1, int j1, boolean flag)
        throws RemoteException;

    public abstract Intent b(int ai[])
        throws RemoteException;

    public abstract void b(long l1, String s1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, long l1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, long l1, String s1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, int i1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, int i1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, String s2)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, int j1, int k1, boolean flag)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, String s2, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void b(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException;

    public abstract void b(String s1, String s2, int i1)
        throws RemoteException;

    public abstract Intent bC(String s1)
        throws RemoteException;

    public abstract String bE(String s1)
        throws RemoteException;

    public abstract String bF(String s1)
        throws RemoteException;

    public abstract void bG(String s1)
        throws RemoteException;

    public abstract int bH(String s1)
        throws RemoteException;

    public abstract Uri bI(String s1)
        throws RemoteException;

    public abstract void bJ(String s1)
        throws RemoteException;

    public abstract ParcelFileDescriptor bK(String s1)
        throws RemoteException;

    public abstract Intent bx(String s1)
        throws RemoteException;

    public abstract void c(long l1, String s1)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, long l1)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, long l1, String s1)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, String s1, int i1)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, String s1, String s2)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, String s1, String s2, boolean flag)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void c(IGamesCallbacks igamescallbacks, String as[])
        throws RemoteException;

    public abstract void c(String s1, String s2, int i1)
        throws RemoteException;

    public abstract void d(long l1, String s1)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, long l1)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, long l1, String s1)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, String s1, String s2)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException;

    public abstract void d(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void dC(int i1)
        throws RemoteException;

    public abstract void e(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void e(IGamesCallbacks igamescallbacks, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void e(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void e(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void e(IGamesCallbacks igamescallbacks, String s1, String s2)
        throws RemoteException;

    public abstract void e(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException;

    public abstract void e(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void f(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void f(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void f(IGamesCallbacks igamescallbacks, String s1, int i1, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract void f(IGamesCallbacks igamescallbacks, String s1, String s2)
        throws RemoteException;

    public abstract void f(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract Bundle fC()
        throws RemoteException;

    public abstract void g(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void g(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void g(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract ParcelFileDescriptor h(Uri uri)
        throws RemoteException;

    public abstract RoomEntity h(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void h(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void h(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract void i(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void i(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void j(IGamesCallbacks igamescallbacks)
        throws RemoteException;

    public abstract void j(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void k(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract boolean kA()
        throws RemoteException;

    public abstract DataHolder kB()
        throws RemoteException;

    public abstract void kC()
        throws RemoteException;

    public abstract Intent kD()
        throws RemoteException;

    public abstract void kE()
        throws RemoteException;

    public abstract boolean kF()
        throws RemoteException;

    public abstract String ka()
        throws RemoteException;

    public abstract String kb()
        throws RemoteException;

    public abstract Intent ke()
        throws RemoteException;

    public abstract Intent kf()
        throws RemoteException;

    public abstract Intent kg()
        throws RemoteException;

    public abstract Intent kh()
        throws RemoteException;

    public abstract Intent km()
        throws RemoteException;

    public abstract Intent kn()
        throws RemoteException;

    public abstract int ko()
        throws RemoteException;

    public abstract String kp()
        throws RemoteException;

    public abstract int kq()
        throws RemoteException;

    public abstract Intent kr()
        throws RemoteException;

    public abstract int ks()
        throws RemoteException;

    public abstract int kt()
        throws RemoteException;

    public abstract int ku()
        throws RemoteException;

    public abstract int kv()
        throws RemoteException;

    public abstract void kx()
        throws RemoteException;

    public abstract DataHolder kz()
        throws RemoteException;

    public abstract void l(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void m(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void n(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void n(String s1, int i1)
        throws RemoteException;

    public abstract void o(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void o(String s1, int i1)
        throws RemoteException;

    public abstract void p(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void p(String s1, int i1)
        throws RemoteException;

    public abstract void q(long l1)
        throws RemoteException;

    public abstract void q(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void r(long l1)
        throws RemoteException;

    public abstract void r(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void r(String s1, int i1)
        throws RemoteException;

    public abstract void s(long l1)
        throws RemoteException;

    public abstract void s(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void s(String s1, int i1)
        throws RemoteException;

    public abstract void t(long l1)
        throws RemoteException;

    public abstract void t(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void u(long l1)
        throws RemoteException;

    public abstract void u(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void u(String s1, String s2)
        throws RemoteException;

    public abstract void v(String s1, String s2)
        throws RemoteException;
}
