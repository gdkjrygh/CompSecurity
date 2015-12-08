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
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesCallbacks

public interface IGamesService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGamesService
    {

        public static IGamesService aE(IBinder ibinder)
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
            boolean flag75 = false;
            boolean flag76 = false;
            boolean flag69 = false;
            boolean flag72 = false;
            boolean flag77 = false;
            int k1 = 0;
            boolean flag78 = false;
            boolean flag79 = false;
            boolean flag80 = false;
            boolean flag81 = false;
            boolean flag73 = false;
            boolean flag74 = false;
            boolean flag71 = false;
            boolean flag82 = false;
            boolean flag83 = false;
            boolean flag84 = false;
            boolean flag85 = false;
            boolean flag86 = false;
            boolean flag87 = false;
            boolean flag88 = false;
            boolean flag89 = false;
            boolean flag90 = false;
            boolean flag91 = false;
            boolean flag92 = false;
            boolean flag = false;
            boolean flag93 = false;
            boolean flag94 = false;
            boolean flag95 = false;
            boolean flag96 = false;
            boolean flag97 = false;
            boolean flag98 = false;
            boolean flag99 = false;
            boolean flag100 = false;
            boolean flag101 = false;
            boolean flag102 = false;
            boolean flag53 = false;
            ParticipantEntity aparticipantentity[];
            String s7;
            String s8;
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
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = lw();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = fX();
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
                lE();
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = lh();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5064: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bG(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5065: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                t(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = li();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = lG();
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
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                    flag53 = true;
                }
                a(((IGamesCallbacks) (obj)), i1, flag1, flag53);
                parcel1.writeNoException();
                return true;

            case 5016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                obj1 = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                c(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                d(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                q(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                p(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5058: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5059: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                r(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                c(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
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
                parcel = bH(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 5036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                dT(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5037: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5038: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5039: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                boolean flag3 = flag75;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), i1, j1, k1, flag3);
                parcel1.writeNoException();
                return true;

            case 5040: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                k1 = parcel.readInt();
                boolean flag4 = flag76;
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), i1, j1, k1, flag4);
                parcel1.writeNoException();
                return true;

            case 5041: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5042: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5043: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5044: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                i1 = parcel.readInt();
                j1 = parcel.readInt();
                boolean flag5;
                boolean flag54;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag54 = true;
                } else
                {
                    flag54 = false;
                }
                a(((IGamesCallbacks) (obj)), i1, j1, flag5, flag54);
                parcel1.writeNoException();
                return true;

            case 5045: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag6;
                boolean flag55;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag55 = true;
                } else
                {
                    flag55 = false;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag6, flag55);
                parcel1.writeNoException();
                return true;

            case 5046: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag7;
                boolean flag56;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                flag56 = flag69;
                if (parcel.readInt() != 0)
                {
                    flag56 = true;
                }
                b(((IGamesCallbacks) (obj)), i1, flag7, flag56);
                parcel1.writeNoException();
                return true;

            case 5047: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5048: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag8;
                boolean flag57;
                if (parcel.readInt() != 0)
                {
                    flag8 = true;
                } else
                {
                    flag8 = false;
                }
                flag57 = flag72;
                if (parcel.readInt() != 0)
                {
                    flag57 = true;
                }
                c(((IGamesCallbacks) (obj)), i1, flag8, flag57);
                parcel1.writeNoException();
                return true;

            case 5049: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5050: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                bI(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5051: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5052: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5053: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = h(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
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
                i1 = bJ(parcel.readString());
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 5054: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag9 = flag77;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), flag9);
                parcel1.writeNoException();
                return true;

            case 5061: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5055: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                s(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5067: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag10 = lH();
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
                boolean flag11 = flag78;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                }
                O(flag11);
                parcel1.writeNoException();
                return true;

            case 5056: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5057: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                j(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5062: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5063: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag12 = flag79;
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

            case 5501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag13;
                boolean flag58;
                if (parcel.readInt() != 0)
                {
                    flag13 = true;
                } else
                {
                    flag13 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag58 = true;
                } else
                {
                    flag58 = false;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag13, flag58);
                parcel1.writeNoException();
                return true;

            case 5502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = lI();
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
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag14 = flag80;
                if (parcel.readInt() != 0)
                {
                    flag14 = true;
                }
                a(((IGamesCallbacks) (obj)), flag14);
                parcel1.writeNoException();
                return true;

            case 6002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                boolean flag15 = flag81;
                if (parcel.readInt() != 0)
                {
                    flag15 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), flag15);
                parcel1.writeNoException();
                return true;

            case 6003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag16;
                boolean flag59;
                if (parcel.readInt() != 0)
                {
                    flag16 = true;
                } else
                {
                    flag16 = false;
                }
                flag59 = flag73;
                if (parcel.readInt() != 0)
                {
                    flag59 = true;
                }
                d(((IGamesCallbacks) (obj)), i1, flag16, flag59);
                parcel1.writeNoException();
                return true;

            case 6004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                i1 = parcel.readInt();
                boolean flag17;
                boolean flag60;
                if (parcel.readInt() != 0)
                {
                    flag17 = true;
                } else
                {
                    flag17 = false;
                }
                flag60 = flag74;
                if (parcel.readInt() != 0)
                {
                    flag60 = true;
                }
                e(((IGamesCallbacks) (obj)), i1, flag17, flag60);
                parcel1.writeNoException();
                return true;

            case 6501: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag18;
                boolean flag61;
                boolean flag70;
                if (parcel.readInt() != 0)
                {
                    flag18 = true;
                } else
                {
                    flag18 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag61 = true;
                } else
                {
                    flag61 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag70 = true;
                } else
                {
                    flag70 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag71 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag18, flag61, flag70, flag71);
                parcel1.writeNoException();
                return true;

            case 6502: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag19 = flag82;
                if (parcel.readInt() != 0)
                {
                    flag19 = true;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), flag19);
                parcel1.writeNoException();
                return true;

            case 6503: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag20 = flag83;
                if (parcel.readInt() != 0)
                {
                    flag20 = true;
                }
                b(((IGamesCallbacks) (obj)), flag20);
                parcel1.writeNoException();
                return true;

            case 6504: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag21 = flag84;
                if (parcel.readInt() != 0)
                {
                    flag21 = true;
                }
                c(((IGamesCallbacks) (obj)), ((String) (obj1)), flag21);
                parcel1.writeNoException();
                return true;

            case 6505: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag22 = flag85;
                if (parcel.readInt() != 0)
                {
                    flag22 = true;
                }
                d(((IGamesCallbacks) (obj)), ((String) (obj1)), flag22);
                parcel1.writeNoException();
                return true;

            case 6506: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                boolean flag23 = flag86;
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
                k(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                bL(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 8004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
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
                l(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                m(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readString(), (ParticipantResult[])parcel.createTypedArray(ParticipantResult.CREATOR));
                parcel1.writeNoException();
                return true;

            case 8008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), (ParticipantResult[])parcel.createTypedArray(ParticipantResult.CREATOR));
                parcel1.writeNoException();
                return true;

            case 8009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                n(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                o(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 8013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                s(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 8014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                p(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = lx();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 8025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                u(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 8026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 8018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                lJ();
                parcel1.writeNoException();
                return true;

            case 8023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag24 = flag87;
                if (parcel.readInt() != 0)
                {
                    flag24 = true;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag24);
                parcel1.writeNoException();
                return true;

            case 8027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag25 = flag88;
                if (parcel.readInt() != 0)
                {
                    flag25 = true;
                }
                c(((IGamesCallbacks) (obj)), flag25);
                parcel1.writeNoException();
                return true;

            case 9001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag26;
                boolean flag62;
                if (parcel.readInt() != 0)
                {
                    flag26 = true;
                } else
                {
                    flag26 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag62 = true;
                } else
                {
                    flag62 = false;
                }
                c(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag26, flag62);
                parcel1.writeNoException();
                return true;

            case 9002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                q(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 9003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = ll();
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
                parcel = bM(parcel.readString());
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
                parcel = lm();
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
                parcel = ln();
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
                parcel = lo();
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
                parcel = lt();
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
                parcel = lu();
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
                parcel = lK();
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
                i1 = lv();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 9020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag29;
                boolean flag63;
                if (parcel.readInt() != 0)
                {
                    flag29 = true;
                } else
                {
                    flag29 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag63 = true;
                } else
                {
                    flag63 = false;
                }
                d(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag29, flag63);
                parcel1.writeNoException();
                return true;

            case 9028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag30;
                boolean flag64;
                if (parcel.readInt() != 0)
                {
                    flag30 = true;
                } else
                {
                    flag30 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag64 = true;
                } else
                {
                    flag64 = false;
                }
                a(((IGamesCallbacks) (obj)), ((String) (obj1)), ((String) (obj2)), i1, flag30, flag64);
                parcel1.writeNoException();
                return true;

            case 9030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = bN(parcel.readString());
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
                c(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                t(parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 10003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 10004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readLong(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 10005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 10009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
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
                i1 = lz();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 10023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = lA();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 10015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = ly();
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
                    obj = GameRequestCluster.CREATOR.cy(parcel);
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
                t(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag31 = flag89;
                if (parcel.readInt() != 0)
                {
                    flag31 = true;
                }
                b(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag31);
                parcel1.writeNoException();
                return true;

            case 10021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = ZInvitationCluster.CREATOR.cw(parcel);
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
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readInt(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 10019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.createIntArray());
                parcel1.writeNoException();
                return true;

            case 10020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 11001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                j(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 11002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                lL();
                parcel1.writeNoException();
                return true;

            case 12001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = parcel.readString();
                boolean flag32;
                boolean flag65;
                if (parcel.readInt() != 0)
                {
                    flag32 = true;
                } else
                {
                    flag32 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag65 = true;
                } else
                {
                    flag65 = false;
                }
                parcel = a(((String) (obj)), flag32, flag65, parcel.readInt());
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
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag33 = flag90;
                if (parcel.readInt() != 0)
                {
                    flag33 = true;
                }
                d(((IGamesCallbacks) (obj)), flag33);
                parcel1.writeNoException();
                return true;

            case 12003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                String s1 = parcel.readString();
                boolean flag34 = flag91;
                if (parcel.readInt() != 0)
                {
                    flag34 = true;
                }
                c(((IGamesCallbacks) (obj)), ((String) (obj1)), s1, flag34);
                parcel1.writeNoException();
                return true;

            case 12006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                boolean flag35 = flag92;
                if (parcel.readInt() != 0)
                {
                    flag35 = true;
                }
                e(((IGamesCallbacks) (obj)), ((String) (obj1)), flag35);
                parcel1.writeNoException();
                return true;

            case 12007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                String s2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = SnapshotMetadataChangeEntity.CREATOR.cE(parcel);
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
                a(((IGamesCallbacks) (obj1)), s2, ((SnapshotMetadataChangeEntity) (obj)), parcel);
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
                r(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj1 = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                String s3 = parcel.readString();
                aobj = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = SnapshotMetadataChangeEntity.CREATOR.cE(parcel);
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
                a(((IGamesCallbacks) (obj1)), s3, ((String) (aobj)), ((SnapshotMetadataChangeEntity) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 12035: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = lB();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 12036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i1 = lC();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 12005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                s(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag36;
                boolean flag66;
                if (parcel.readInt() != 0)
                {
                    flag36 = true;
                } else
                {
                    flag36 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag66 = true;
                } else
                {
                    flag66 = false;
                }
                e(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag36, flag66);
                parcel1.writeNoException();
                return true;

            case 12022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                obj1 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag37;
                boolean flag67;
                if (parcel.readInt() != 0)
                {
                    flag37 = true;
                } else
                {
                    flag37 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag67 = true;
                } else
                {
                    flag67 = false;
                }
                f(((IGamesCallbacks) (obj)), ((String) (obj1)), i1, flag37, flag67);
                parcel1.writeNoException();
                return true;

            case 12025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag38 = lM();
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
                boolean flag39 = flag93;
                if (parcel.readInt() != 0)
                {
                    flag39 = true;
                }
                P(flag39);
                parcel1.writeNoException();
                return true;

            case 12027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                t(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag40 = flag94;
                if (parcel.readInt() != 0)
                {
                    flag40 = true;
                }
                e(((IGamesCallbacks) (obj)), flag40);
                parcel1.writeNoException();
                return true;

            case 12016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag41 = flag95;
                if (parcel.readInt() != 0)
                {
                    flag41 = true;
                }
                f(((IGamesCallbacks) (obj)), flag41);
                parcel1.writeNoException();
                return true;

            case 12031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag42 = flag96;
                if (parcel.readInt() != 0)
                {
                    flag42 = true;
                }
                a(((IGamesCallbacks) (obj)), flag42, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 12017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                o(parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                u(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                int ai[] = parcel.createIntArray();
                i1 = parcel.readInt();
                boolean flag43 = flag97;
                if (parcel.readInt() != 0)
                {
                    flag43 = true;
                }
                a(((IGamesCallbacks) (obj)), ai, i1, flag43);
                parcel1.writeNoException();
                return true;

            case 12029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                String as[] = parcel.createStringArray();
                boolean flag44 = flag98;
                if (parcel.readInt() != 0)
                {
                    flag44 = true;
                }
                a(((IGamesCallbacks) (obj)), as, flag44);
                parcel1.writeNoException();
                return true;

            case 12015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                as = parcel.readString();
                String s4 = parcel.readString();
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
                a(((IGamesCallbacks) (obj)), as, s4, ((int []) (aobj)), i1, flag45);
                parcel1.writeNoException();
                return true;

            case 12028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                as = parcel.readString();
                String s5 = parcel.readString();
                aobj = parcel.createStringArray();
                boolean flag46;
                if (parcel.readInt() != 0)
                {
                    flag46 = true;
                } else
                {
                    flag46 = false;
                }
                a(((IGamesCallbacks) (obj)), as, s5, ((String []) (aobj)), flag46);
                parcel1.writeNoException();
                return true;

            case 12011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 12013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(IGamesCallbacks.Stub.aD(parcel.readStrongBinder()), parcel.readLong(), parcel.readString());
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
                parcel = bE(parcel.readString());
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
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                as = parcel.readString();
                String s6 = parcel.readString();
                i1 = parcel.readInt();
                boolean flag47;
                boolean flag68;
                if (parcel.readInt() != 0)
                {
                    flag47 = true;
                } else
                {
                    flag47 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag68 = true;
                } else
                {
                    flag68 = false;
                }
                b(((IGamesCallbacks) (obj)), as, s6, i1, flag47, flag68);
                parcel1.writeNoException();
                return true;

            case 13001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean flag48 = flag99;
                if (parcel.readInt() != 0)
                {
                    flag48 = true;
                }
                Q(flag48);
                parcel1.writeNoException();
                return true;

            case 13002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = parcel.readString();
                as = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((String) (obj)), as, parcel);
                parcel1.writeNoException();
                return true;

            case 13003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag49 = flag100;
                if (parcel.readInt() != 0)
                {
                    flag49 = true;
                }
                g(((IGamesCallbacks) (obj)), flag49);
                parcel1.writeNoException();
                return true;

            case 13004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                boolean flag50 = flag101;
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

            case 13006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                as = parcel.readString();
                boolean flag51 = flag102;
                if (parcel.readInt() != 0)
                {
                    flag51 = true;
                }
                f(((IGamesCallbacks) (obj)), as, flag51);
                parcel1.writeNoException();
                return true;

            case 14001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                parcel = u(parcel.readString(), parcel.readInt());
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

            case 14002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                obj = IGamesCallbacks.Stub.aD(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                String as1[] = parcel.createStringArray();
                boolean flag52;
                if (parcel.readInt() != 0)
                {
                    flag52 = true;
                } else
                {
                    flag52 = false;
                }
                a(((IGamesCallbacks) (obj)), i1, as, as1, flag52);
                parcel1.writeNoException();
                return true;

            case 14003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                aparticipantentity = (ParticipantEntity[])parcel.createTypedArray(ParticipantEntity.CREATOR);
                s7 = parcel.readString();
                s8 = parcel.readString();
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                as = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                as = null;
            }
            parcel = a(aparticipantentity, s7, s8, ((Uri) (obj)), as, parcel.readString());
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

        private IBinder le;

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
            le.transact(5068, parcel, parcel1, 0);
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
            le.transact(12026, parcel, parcel1, 0);
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

        public void Q(boolean flag)
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
            le.transact(13001, parcel, parcel1, 0);
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
            le.transact(5033, parcel, parcel1, 0);
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
            le.transact(9008, parcel, parcel1, 0);
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
            le.transact(10012, parcel, parcel1, 0);
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
            le.transact(13005, parcel, parcel1, 0);
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
            le.transact(10021, parcel, parcel1, 0);
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
            le.transact(10022, parcel, parcel1, 0);
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
            le.transact(9011, parcel, parcel1, 0);
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
            le.transact(12001, parcel, parcel1, 0);
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
            le.transact(9031, parcel, parcel1, 0);
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

        public Intent a(ParticipantEntity aparticipantentity[], String s1, String s2, Uri uri, Uri uri1, String s3)
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
            parcel.writeString(s3);
            le.transact(14003, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_169;
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
            le.transact(8019, parcel, parcel1, 0);
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
            le.transact(5005, parcel, parcel1, 0);
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
            le.transact(12019, parcel, parcel1, 0);
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
            le.transact(5002, parcel, parcel1, 0);
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
            le.transact(10016, parcel, parcel1, 0);
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
            le.transact(10009, parcel, parcel1, 0);
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
            le.transact(5044, parcel, parcel1, 0);
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
            le.transact(8004, parcel, parcel1, 0);
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

        public void a(IGamesCallbacks igamescallbacks, int i1, String s1, String as[], boolean flag)
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
                break MISSING_BLOCK_LABEL_106;
            }
            igamescallbacks = igamescallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igamescallbacks);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            le.transact(14002, parcel, parcel1, 0);
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
            le.transact(5015, parcel, parcel1, 0);
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
            le.transact(10018, parcel, parcel1, 0);
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
            le.transact(5058, parcel, parcel1, 0);
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
            le.transact(8018, parcel, parcel1, 0);
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
            le.transact(5021, parcel, parcel1, 0);
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
            le.transact(5030, parcel, parcel1, 0);
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
            le.transact(5031, parcel, parcel1, 0);
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
            le.transact(5014, parcel, parcel1, 0);
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
            le.transact(10011, parcel, parcel1, 0);
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
            le.transact(5019, parcel, parcel1, 0);
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
            le.transact(5025, parcel, parcel1, 0);
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
            le.transact(8023, parcel, parcel1, 0);
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
            le.transact(5045, parcel, parcel1, 0);
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
            le.transact(6501, parcel, parcel1, 0);
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
            le.transact(10019, parcel, parcel1, 0);
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
            le.transact(5016, parcel, parcel1, 0);
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
            le.transact(7002, parcel, parcel1, 0);
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
            le.transact(5023, parcel, parcel1, 0);
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

        public void a(IGamesCallbacks igamescallbacks, String s1, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
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
            if (snapshotmetadatachangeentity == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            snapshotmetadatachangeentity.writeToParcel(parcel, 0);
_L6:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L7:
            le.transact(12007, parcel, parcel1, 0);
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
            le.transact(5038, parcel, parcel1, 0);
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
            le.transact(8001, parcel, parcel1, 0);
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
            le.transact(10010, parcel, parcel1, 0);
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
            le.transact(5039, parcel, parcel1, 0);
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
            le.transact(9028, parcel, parcel1, 0);
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

        public void a(IGamesCallbacks igamescallbacks, String s1, String s2, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
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
            if (snapshotmetadatachangeentity == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            snapshotmetadatachangeentity.writeToParcel(parcel, 0);
_L6:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_145;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L7:
            le.transact(12033, parcel, parcel1, 0);
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
            le.transact(6002, parcel, parcel1, 0);
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
            le.transact(12015, parcel, parcel1, 0);
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
            le.transact(10008, parcel, parcel1, 0);
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
            le.transact(12028, parcel, parcel1, 0);
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
            le.transact(5054, parcel, parcel1, 0);
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
            le.transact(8007, parcel, parcel1, 0);
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
            le.transact(8008, parcel, parcel1, 0);
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
            le.transact(8017, parcel, parcel1, 0);
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
            le.transact(10005, parcel, parcel1, 0);
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
            le.transact(6001, parcel, parcel1, 0);
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
            le.transact(5063, parcel, parcel1, 0);
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
            le.transact(12031, parcel, parcel1, 0);
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
            le.transact(8003, parcel, parcel1, 0);
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
            le.transact(12010, parcel, parcel1, 0);
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
            le.transact(10006, parcel, parcel1, 0);
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
            le.transact(12029, parcel, parcel1, 0);
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
            le.transact(13002, parcel, parcel1, 0);
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
            return le;
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
            le.transact(5034, parcel, parcel1, 0);
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
            le.transact(9009, parcel, parcel1, 0);
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
            le.transact(12030, parcel, parcel1, 0);
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
            le.transact(8021, parcel, parcel1, 0);
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
            le.transact(5017, parcel, parcel1, 0);
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
            le.transact(5046, parcel, parcel1, 0);
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
            le.transact(8012, parcel, parcel1, 0);
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
            le.transact(8020, parcel, parcel1, 0);
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
            le.transact(5018, parcel, parcel1, 0);
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
            le.transact(12023, parcel, parcel1, 0);
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
            le.transact(5020, parcel, parcel1, 0);
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
            le.transact(7003, parcel, parcel1, 0);
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
            le.transact(10017, parcel, parcel1, 0);
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
            le.transact(5501, parcel, parcel1, 0);
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
            le.transact(5024, parcel, parcel1, 0);
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
            le.transact(5041, parcel, parcel1, 0);
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
            le.transact(5040, parcel, parcel1, 0);
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
            le.transact(12018, parcel, parcel1, 0);
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
            le.transact(6506, parcel, parcel1, 0);
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
            le.transact(6502, parcel, parcel1, 0);
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
            le.transact(6503, parcel, parcel1, 0);
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
            le.transact(10007, parcel, parcel1, 0);
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
            le.transact(5051, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public Intent bE(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(12034, parcel, parcel1, 0);
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

        public String bG(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(5064, parcel, parcel1, 0);
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

        public String bH(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(5035, parcel, parcel1, 0);
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

        public void bI(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(5050, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public int bJ(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(5060, parcel, parcel1, 0);
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

        public Uri bK(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(5066, parcel, parcel1, 0);
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

        public void bL(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(8002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public Intent bM(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(9004, parcel, parcel1, 0);
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

        public ParcelFileDescriptor bN(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            le.transact(9030, parcel, parcel1, 0);
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
            le.transact(10004, parcel, parcel1, 0);
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
            le.transact(5022, parcel, parcel1, 0);
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
            le.transact(5048, parcel, parcel1, 0);
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
            le.transact(10001, parcel, parcel1, 0);
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
            le.transact(10003, parcel, parcel1, 0);
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
            le.transact(5032, parcel, parcel1, 0);
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
            le.transact(12024, parcel, parcel1, 0);
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
            le.transact(9001, parcel, parcel1, 0);
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
            le.transact(8011, parcel, parcel1, 0);
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
            le.transact(12003, parcel, parcel1, 0);
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
            le.transact(6504, parcel, parcel1, 0);
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
            le.transact(8027, parcel, parcel1, 0);
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
            le.transact(10020, parcel, parcel1, 0);
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
            le.transact(8026, parcel, parcel1, 0);
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
            le.transact(12014, parcel, parcel1, 0);
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
            le.transact(5026, parcel, parcel1, 0);
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
            le.transact(6003, parcel, parcel1, 0);
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
            le.transact(12011, parcel, parcel1, 0);
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
            le.transact(12013, parcel, parcel1, 0);
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
            le.transact(5037, parcel, parcel1, 0);
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
            le.transact(9020, parcel, parcel1, 0);
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
            le.transact(8015, parcel, parcel1, 0);
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
            le.transact(6505, parcel, parcel1, 0);
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
            le.transact(12002, parcel, parcel1, 0);
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

        public void dT(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeInt(i1);
            le.transact(5036, parcel, parcel1, 0);
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
            le.transact(5027, parcel, parcel1, 0);
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
            le.transact(6004, parcel, parcel1, 0);
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
            le.transact(5042, parcel, parcel1, 0);
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
            le.transact(12021, parcel, parcel1, 0);
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
            le.transact(8016, parcel, parcel1, 0);
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
            le.transact(12006, parcel, parcel1, 0);
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
            le.transact(12032, parcel, parcel1, 0);
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
            le.transact(5047, parcel, parcel1, 0);
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
            le.transact(5043, parcel, parcel1, 0);
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
            le.transact(12022, parcel, parcel1, 0);
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
            le.transact(12009, parcel, parcel1, 0);
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

        public void f(IGamesCallbacks igamescallbacks, String s1, boolean flag)
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
            le.transact(13006, parcel, parcel1, 0);
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
            le.transact(12016, parcel, parcel1, 0);
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

        public Bundle fX()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(5004, parcel, parcel1, 0);
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
            le.transact(5049, parcel, parcel1, 0);
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
            le.transact(5052, parcel, parcel1, 0);
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
            le.transact(13003, parcel, parcel1, 0);
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
            le.transact(6507, parcel, parcel1, 0);
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
            le.transact(5053, parcel, parcel1, 0);
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
            le.transact(5056, parcel, parcel1, 0);
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
            le.transact(13004, parcel, parcel1, 0);
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
            le.transact(5062, parcel, parcel1, 0);
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
            le.transact(5061, parcel, parcel1, 0);
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
            le.transact(11001, parcel, parcel1, 0);
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
            le.transact(5057, parcel, parcel1, 0);
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
            le.transact(7001, parcel, parcel1, 0);
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
            le.transact(8005, parcel, parcel1, 0);
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

        public int lA()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(10023, parcel, parcel1, 0);
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

        public int lB()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(12035, parcel, parcel1, 0);
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

        public int lC()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(12036, parcel, parcel1, 0);
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

        public void lE()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(5006, parcel, parcel1, 0);
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

        public DataHolder lG()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(5013, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            DataHolder dataholder = DataHolder.CREATOR.B(parcel1);
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

        public boolean lH()
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
            le.transact(5067, parcel, parcel1, 0);
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

        public DataHolder lI()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(5502, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            DataHolder dataholder = DataHolder.CREATOR.B(parcel1);
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

        public void lJ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(8022, parcel, parcel1, 0);
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

        public Intent lK()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9013, parcel, parcel1, 0);
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

        public void lL()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(11002, parcel, parcel1, 0);
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

        public boolean lM()
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
            le.transact(12025, parcel, parcel1, 0);
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

        public String lh()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(5007, parcel, parcel1, 0);
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

        public String li()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(5012, parcel, parcel1, 0);
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

        public Intent ll()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9003, parcel, parcel1, 0);
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

        public Intent lm()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9005, parcel, parcel1, 0);
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

        public Intent ln()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9006, parcel, parcel1, 0);
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

        public Intent lo()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9007, parcel, parcel1, 0);
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

        public Intent lt()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9010, parcel, parcel1, 0);
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

        public Intent lu()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9012, parcel, parcel1, 0);
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

        public int lv()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(9019, parcel, parcel1, 0);
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

        public String lw()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(5003, parcel, parcel1, 0);
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

        public int lx()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(8024, parcel, parcel1, 0);
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

        public Intent ly()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(10015, parcel, parcel1, 0);
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

        public int lz()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            le.transact(10013, parcel, parcel1, 0);
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
            le.transact(8006, parcel, parcel1, 0);
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
            le.transact(8009, parcel, parcel1, 0);
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
            le.transact(8010, parcel, parcel1, 0);
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
            le.transact(12017, parcel, parcel1, 0);
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
            le.transact(8014, parcel, parcel1, 0);
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
            le.transact(5029, parcel, parcel1, 0);
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
            le.transact(5001, parcel, parcel1, 0);
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
            le.transact(9002, parcel, parcel1, 0);
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

        public void q(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            le.transact(5028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
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
            le.transact(5059, parcel, parcel1, 0);
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
            le.transact(12020, parcel, parcel1, 0);
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

        public void s(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            le.transact(8013, parcel, parcel1, 0);
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
            le.transact(12005, parcel, parcel1, 0);
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
            le.transact(5055, parcel, parcel1, 0);
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
            le.transact(10002, parcel, parcel1, 0);
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
            le.transact(12027, parcel, parcel1, 0);
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

        public void t(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            le.transact(10014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void t(String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeString(s2);
            le.transact(5065, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public Intent u(String s1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeString(s1);
            parcel.writeInt(i1);
            le.transact(14001, parcel, parcel1, 0);
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

        public void u(long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcel.writeLong(l1);
            le.transact(12012, parcel, parcel1, 0);
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
            le.transact(12008, parcel, parcel1, 0);
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
            le.transact(8025, parcel, parcel1, 0);
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
            le = ibinder;
        }
    }


    public abstract void O(boolean flag)
        throws RemoteException;

    public abstract void P(boolean flag)
        throws RemoteException;

    public abstract void Q(boolean flag)
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

    public abstract Intent a(ParticipantEntity aparticipantentity[], String s1, String s2, Uri uri, Uri uri1, String s3)
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

    public abstract void a(IGamesCallbacks igamescallbacks, int i1, String s1, String as[], boolean flag)
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

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
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

    public abstract void a(IGamesCallbacks igamescallbacks, String s1, String s2, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
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

    public abstract Intent bE(String s1)
        throws RemoteException;

    public abstract String bG(String s1)
        throws RemoteException;

    public abstract String bH(String s1)
        throws RemoteException;

    public abstract void bI(String s1)
        throws RemoteException;

    public abstract int bJ(String s1)
        throws RemoteException;

    public abstract Uri bK(String s1)
        throws RemoteException;

    public abstract void bL(String s1)
        throws RemoteException;

    public abstract Intent bM(String s1)
        throws RemoteException;

    public abstract ParcelFileDescriptor bN(String s1)
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

    public abstract void dT(int i1)
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

    public abstract void f(IGamesCallbacks igamescallbacks, String s1, boolean flag)
        throws RemoteException;

    public abstract void f(IGamesCallbacks igamescallbacks, boolean flag)
        throws RemoteException;

    public abstract Bundle fX()
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

    public abstract void l(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract int lA()
        throws RemoteException;

    public abstract int lB()
        throws RemoteException;

    public abstract int lC()
        throws RemoteException;

    public abstract void lE()
        throws RemoteException;

    public abstract DataHolder lG()
        throws RemoteException;

    public abstract boolean lH()
        throws RemoteException;

    public abstract DataHolder lI()
        throws RemoteException;

    public abstract void lJ()
        throws RemoteException;

    public abstract Intent lK()
        throws RemoteException;

    public abstract void lL()
        throws RemoteException;

    public abstract boolean lM()
        throws RemoteException;

    public abstract String lh()
        throws RemoteException;

    public abstract String li()
        throws RemoteException;

    public abstract Intent ll()
        throws RemoteException;

    public abstract Intent lm()
        throws RemoteException;

    public abstract Intent ln()
        throws RemoteException;

    public abstract Intent lo()
        throws RemoteException;

    public abstract Intent lt()
        throws RemoteException;

    public abstract Intent lu()
        throws RemoteException;

    public abstract int lv()
        throws RemoteException;

    public abstract String lw()
        throws RemoteException;

    public abstract int lx()
        throws RemoteException;

    public abstract Intent ly()
        throws RemoteException;

    public abstract int lz()
        throws RemoteException;

    public abstract void m(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void n(IGamesCallbacks igamescallbacks, String s1)
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

    public abstract void q(String s1, int i1)
        throws RemoteException;

    public abstract void r(long l1)
        throws RemoteException;

    public abstract void r(IGamesCallbacks igamescallbacks, String s1)
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

    public abstract void t(String s1, int i1)
        throws RemoteException;

    public abstract void t(String s1, String s2)
        throws RemoteException;

    public abstract Intent u(String s1, int i1)
        throws RemoteException;

    public abstract void u(long l1)
        throws RemoteException;

    public abstract void u(IGamesCallbacks igamescallbacks, String s1)
        throws RemoteException;

    public abstract void u(String s1, String s2)
        throws RemoteException;
}
