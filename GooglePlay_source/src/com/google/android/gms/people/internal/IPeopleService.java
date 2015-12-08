// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.FavaDiagnosticsEntityCreator;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.AccountTokenCreator;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableGetOptionsCreator;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptionsCreator;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.model.ParcelableAvatarReference;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.internal:
//            IPeopleCallbacks, ParcelableLoadImageOptions, ParcelableLoadImageOptionsCreator

public interface IPeopleService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IPeopleService
    {

        public static IPeopleService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
            if (iinterface != null && (iinterface instanceof IPeopleService))
            {
                return (IPeopleService)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            IPeopleCallbacks ipeoplecallbacks24;
            String s21;
            String s39;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.people.internal.IPeopleService");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                boolean flag;
                boolean flag25;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag25 = true;
                } else
                {
                    flag25 = false;
                }
                loadOwners1(ipeoplecallbacks, flag, flag25, parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 305: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks1 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                boolean flag1;
                boolean flag26;
                if (parcel.readInt() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag26 = true;
                } else
                {
                    flag26 = false;
                }
                loadOwners(ipeoplecallbacks1, flag1, flag26, parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadCirclesOld(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks2 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s2 = parcel.readString();
                String s22 = parcel.readString();
                String s40 = parcel.readString();
                java.util.ArrayList arraylist1 = parcel.createStringArrayList();
                i = parcel.readInt();
                boolean flag2;
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                loadPeopleOld(ipeoplecallbacks2, s2, s22, s40, arraylist1, i, flag2, parcel.readLong());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadAvatarLegacy(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks3 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                long l1 = parcel.readLong();
                boolean flag3;
                if (parcel.readInt() != 0)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                loadContactImageLegacy(ipeoplecallbacks3, l1, flag3);
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks4 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s3 = parcel.readString();
                String s23 = parcel.readString();
                String s41 = parcel.readString();
                boolean flag4;
                if (parcel.readInt() != 0)
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                blockPerson(ipeoplecallbacks4, s3, s23, s41, flag4);
                parcel1.writeNoException();
                return true;

            case 603: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks5 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s4 = parcel.readString();
                String s24 = parcel.readString();
                String s42 = parcel.readString();
                boolean flag5;
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                starPerson(ipeoplecallbacks5, s4, s24, s42, flag5);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                if (parcel.readInt() != 0)
                {
                    parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = syncRawContact(parcel);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks6 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s5 = parcel.readString();
                String s25 = parcel.readString();
                String s43 = parcel.readString();
                boolean flag6;
                if (parcel.readInt() != 0)
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
                loadPeopleForAggregation8(ipeoplecallbacks6, s5, s25, s43, flag6, parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 201: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks7 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s6 = parcel.readString();
                String s26 = parcel.readString();
                String s44 = parcel.readString();
                boolean flag7;
                if (parcel.readInt() != 0)
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                loadPeopleForAggregation200(ipeoplecallbacks7, s6, s26, s44, flag7, parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 202: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks8 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s7 = parcel.readString();
                String s27 = parcel.readString();
                String s45 = parcel.readString();
                i = parcel.readInt();
                boolean flag8;
                if (parcel.readInt() != 0)
                {
                    flag8 = true;
                } else
                {
                    flag8 = false;
                }
                loadPeopleForAggregation201(ipeoplecallbacks8, s7, s27, s45, i, flag8, parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 203: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks9 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s8 = parcel.readString();
                String s28 = parcel.readString();
                String s46 = parcel.readString();
                i = parcel.readInt();
                String s56;
                int k;
                boolean flag9;
                boolean flag27;
                if (parcel.readInt() != 0)
                {
                    flag9 = true;
                } else
                {
                    flag9 = false;
                }
                j = parcel.readInt();
                k = parcel.readInt();
                s56 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    flag27 = true;
                } else
                {
                    flag27 = false;
                }
                loadPeopleForAggregation202(ipeoplecallbacks9, s8, s28, s46, i, flag9, j, k, s56, flag27);
                parcel1.writeNoException();
                return true;

            case 402: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks10 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s9 = parcel.readString();
                String s29 = parcel.readString();
                String s47 = parcel.readString();
                i = parcel.readInt();
                String s57;
                int l;
                boolean flag10;
                boolean flag28;
                if (parcel.readInt() != 0)
                {
                    flag10 = true;
                } else
                {
                    flag10 = false;
                }
                j = parcel.readInt();
                l = parcel.readInt();
                s57 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    flag28 = true;
                } else
                {
                    flag28 = false;
                }
                loadPeopleForAggregation(ipeoplecallbacks10, s9, s29, s47, i, flag10, j, l, s57, flag28, parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks11 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s10 = parcel.readString();
                boolean flag11;
                if (parcel.readInt() != 0)
                {
                    flag11 = true;
                } else
                {
                    flag11 = false;
                }
                setSyncToContactsSettings(ipeoplecallbacks11, s10, flag11, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks12 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                boolean flag12;
                if (parcel.readInt() != 0)
                {
                    flag12 = true;
                } else
                {
                    flag12 = false;
                }
                parcel = registerDataChangedListener(ipeoplecallbacks12, flag12, parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = startSync(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks13 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s11 = parcel.readString();
                String s30 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                setAvatarOld(ipeoplecallbacks13, s11, s30, parcel);
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                updatePersonCirclesOld(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                boolean flag13;
                if (parcel.readInt() != 0)
                {
                    flag13 = true;
                } else
                {
                    flag13 = false;
                }
                setSyncToContactsEnabled(flag13);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                boolean flag14 = isSyncToContactsEnabled();
                parcel1.writeNoException();
                if (flag14)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = requestSyncOld(parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks25 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s31 = parcel.readString();
                String s48 = parcel.readString();
                Uri uri;
                boolean flag15;
                if (parcel.readInt() != 0)
                {
                    uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
                } else
                {
                    uri = null;
                }
                if (parcel.readInt() != 0)
                {
                    flag15 = true;
                } else
                {
                    flag15 = false;
                }
                setAvatar(ipeoplecallbacks25, s31, s48, uri, flag15);
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks14 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s12 = parcel.readString();
                String s32 = parcel.readString();
                String s49 = parcel.readString();
                i = parcel.readInt();
                String s58 = parcel.readString();
                boolean flag16;
                if (parcel.readInt() != 0)
                {
                    flag16 = true;
                } else
                {
                    flag16 = false;
                }
                loadCircles(ipeoplecallbacks14, s12, s32, s49, i, s58, flag16);
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = requestSyncOld19(parcel.readString(), parcel.readString(), parcel.readLong());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks15 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s13 = parcel.readString();
                String s33 = parcel.readString();
                String s50 = parcel.readString();
                java.util.ArrayList arraylist2 = parcel.createStringArrayList();
                i = parcel.readInt();
                boolean flag17;
                if (parcel.readInt() != 0)
                {
                    flag17 = true;
                } else
                {
                    flag17 = false;
                }
                loadPeople20(ipeoplecallbacks15, s13, s33, s50, arraylist2, i, flag17, parcel.readLong(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 401: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks16 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s14 = parcel.readString();
                String s34 = parcel.readString();
                String s51 = parcel.readString();
                java.util.ArrayList arraylist3 = parcel.createStringArrayList();
                i = parcel.readInt();
                boolean flag18;
                if (parcel.readInt() != 0)
                {
                    flag18 = true;
                } else
                {
                    flag18 = false;
                }
                loadPeople400(ipeoplecallbacks16, s14, s34, s51, arraylist3, i, flag18, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 404: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks17 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s15 = parcel.readString();
                String s35 = parcel.readString();
                String s52 = parcel.readString();
                java.util.ArrayList arraylist4 = parcel.createStringArrayList();
                i = parcel.readInt();
                boolean flag19;
                if (parcel.readInt() != 0)
                {
                    flag19 = true;
                } else
                {
                    flag19 = false;
                }
                loadPeople(ipeoplecallbacks17, s15, s35, s52, arraylist4, i, flag19, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadPeopleLive(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks18 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s16 = parcel.readString();
                String s36 = parcel.readString();
                String s53 = parcel.readString();
                java.util.ArrayList arraylist5 = parcel.createStringArrayList();
                java.util.ArrayList arraylist6 = parcel.createStringArrayList();
                if (parcel.readInt() != 0)
                {
                    FavaDiagnosticsEntityCreator favadiagnosticsentitycreator = FavaDiagnosticsEntity.CREATOR;
                    parcel = FavaDiagnosticsEntityCreator.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                updatePersonCircles(ipeoplecallbacks18, s16, s36, s53, arraylist5, arraylist6, parcel);
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadRemoteImageLegacy(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadContactsGaiaIds24(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 403: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadContactsGaiaIds(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                String s = parcel.readString();
                String s17 = parcel.readString();
                long l2 = parcel.readLong();
                boolean flag20;
                if (parcel.readInt() != 0)
                {
                    flag20 = true;
                } else
                {
                    flag20 = false;
                }
                parcel = requestSyncOld25(s, s17, l2, flag20);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 205: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                String s1 = parcel.readString();
                String s18 = parcel.readString();
                long l3 = parcel.readLong();
                boolean flag21;
                boolean flag29;
                if (parcel.readInt() != 0)
                {
                    flag21 = true;
                } else
                {
                    flag21 = false;
                }
                if (parcel.readInt() != 0)
                {
                    flag29 = true;
                } else
                {
                    flag29 = false;
                }
                parcel = requestSync(s1, s18, l3, flag21, flag29);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                } else
                {
                    parcel1.writeInt(0);
                }
                return true;

            case 101: // 'e'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadAddToCircleConsent(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 102: // 'f'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                setHasShownAddToCircleConsent(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                addCircle26(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 701: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks19 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s19 = parcel.readString();
                String s37 = parcel.readString();
                String s54 = parcel.readString();
                String s59 = parcel.readString();
                boolean flag22;
                if (parcel.readInt() != 0)
                {
                    flag22 = true;
                } else
                {
                    flag22 = false;
                }
                addCircle(ipeoplecallbacks19, s19, s37, s54, s59, flag22);
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                addPeopleToCircle(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadOwnerAvatarLegacy(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 204: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                removeCircle(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 301: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                loadOwnerCoverPhotoLegacy(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 302: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks20 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                loadLog(ipeoplecallbacks20, parcel);
                parcel1.writeNoException();
                return true;

            case 303: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                updateCircle(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 304: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks21 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                internalCall(ipeoplecallbacks21, parcel);
                parcel1.writeNoException();
                return true;

            case 501: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks26 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Object obj;
                java.util.ArrayList arraylist;
                if (parcel.readInt() != 0)
                {
                    obj = AccountToken.CREATOR;
                    obj = AccountTokenCreator.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                arraylist = parcel.createStringArrayList();
                if (parcel.readInt() != 0)
                {
                    ParcelableGetOptionsCreator parcelablegetoptionscreator = ParcelableGetOptions.CREATOR;
                    parcel = ParcelableGetOptionsCreator.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                identityGetByIds(ipeoplecallbacks26, ((AccountToken) (obj)), arraylist, parcel);
                parcel1.writeNoException();
                return true;

            case 502: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = loadAvatar(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 503: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks22 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                long l4 = parcel.readLong();
                boolean flag23;
                if (parcel.readInt() != 0)
                {
                    flag23 = true;
                } else
                {
                    flag23 = false;
                }
                parcel = loadContactImage(ipeoplecallbacks22, l4, flag23);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 504: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = loadRemoteImage(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 505: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = loadOwnerAvatar(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 506: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = loadOwnerCoverPhoto(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 507: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks23 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String s20 = parcel.readString();
                String s38 = parcel.readString();
                String s55;
                String s60;
                int i1;
                boolean flag24;
                boolean flag30;
                if (parcel.readInt() != 0)
                {
                    flag24 = true;
                } else
                {
                    flag24 = false;
                }
                s55 = parcel.readString();
                s60 = parcel.readString();
                i = parcel.readInt();
                j = parcel.readInt();
                i1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    flag30 = true;
                } else
                {
                    flag30 = false;
                }
                parcel = loadAutocompleteList(ipeoplecallbacks23, s20, s38, flag24, s55, s60, i, j, i1, flag30);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 508: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks27 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Object obj1;
                if (parcel.readInt() != 0)
                {
                    obj1 = AvatarReference.CREATOR;
                    obj1 = ParcelableAvatarReference.createFromParcel(parcel);
                } else
                {
                    obj1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    ParcelableLoadImageOptionsCreator parcelableloadimageoptionscreator = ParcelableLoadImageOptions.CREATOR;
                    parcel = ParcelableLoadImageOptionsCreator.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = loadAvatarByReference(ipeoplecallbacks27, ((AvatarReference) (obj1)), parcel);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 509: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                parcel = sendInteractionFeedback(IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 601: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks28 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Object obj2;
                if (parcel.readInt() != 0)
                {
                    obj2 = AccountToken.CREATOR;
                    obj2 = AccountTokenCreator.createFromParcel(parcel);
                } else
                {
                    obj2 = null;
                }
                if (parcel.readInt() != 0)
                {
                    ParcelableListOptionsCreator parcelablelistoptionscreator = ParcelableListOptions.CREATOR;
                    parcel = ParcelableListOptionsCreator.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                parcel = identityList(ipeoplecallbacks28, ((AccountToken) (obj2)), parcel);
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 602: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                IPeopleCallbacks ipeoplecallbacks29 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Object obj3;
                if (parcel.readInt() != 0)
                {
                    obj3 = DataHolder.CREATOR;
                    obj3 = DataHolderCreator.createFromParcel(parcel);
                } else
                {
                    obj3 = null;
                }
                parcel = sendAutocompleteFeedback(ipeoplecallbacks29, ((DataHolder) (obj3)), parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 1201: 
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                ipeoplecallbacks24 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                s21 = parcel.readString();
                s39 = parcel.readString();
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = loadPhoneNumbers(ipeoplecallbacks24, s21, s39, parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static final class Stub.Proxy
        implements IPeopleService
    {

        private IBinder mRemote;

        public final void addCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(701, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void addCircle26(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            mRemote.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void addPeopleToCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            mRemote.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void blockPerson(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_104;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void identityGetByIds(IPeopleCallbacks ipeoplecallbacks, AccountToken accounttoken, List list, ParcelableGetOptions parcelablegetoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            if (accounttoken == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            accounttoken.writeToParcel(parcel, 0);
_L6:
            parcel.writeStringList(list);
            if (parcelablegetoptions == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            parcel.writeInt(1);
            parcelablegetoptions.writeToParcel(parcel, 0);
_L7:
            mRemote.transact(501, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public final ICancelToken identityList(IPeopleCallbacks ipeoplecallbacks, AccountToken accounttoken, ParcelableListOptions parcelablelistoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            if (accounttoken == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            accounttoken.writeToParcel(parcel, 0);
_L6:
            if (parcelablelistoptions == null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            parcel.writeInt(1);
            parcelablelistoptions.writeToParcel(parcel, 0);
_L7:
            mRemote.transact(601, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public final void internalCall(IPeopleCallbacks ipeoplecallbacks, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(304, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
              goto _L5
        }

        public final boolean isSyncToContactsEnabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            mRemote.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
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

        public final void loadAddToCircleConsent(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(101, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final ICancelToken loadAutocompleteList(IPeopleCallbacks ipeoplecallbacks, String s, String s1, boolean flag, String s2, String s3, int i, 
                int j, int k, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_155;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            int l;
            if (flag)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            parcel.writeInt(l);
            parcel.writeString(s2);
            parcel.writeString(s3);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            mRemote.transact(507, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final ICancelToken loadAvatar(IPeopleCallbacks ipeoplecallbacks, String s, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(502, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final ICancelToken loadAvatarByReference(IPeopleCallbacks ipeoplecallbacks, AvatarReference avatarreference, ParcelableLoadImageOptions parcelableloadimageoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            if (avatarreference == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            avatarreference.writeToParcel(parcel, 0);
_L6:
            if (parcelableloadimageoptions == null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            parcel.writeInt(1);
            parcelableloadimageoptions.writeToParcel(parcel, 0);
_L7:
            mRemote.transact(508, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
            parcel.writeInt(0);
              goto _L7
        }

        public final void loadAvatarLegacy(IPeopleCallbacks ipeoplecallbacks, String s, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadCircles(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_122;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            parcel.writeString(s3);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadCirclesOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            parcel.writeString(s3);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final ICancelToken loadContactImage(IPeopleCallbacks ipeoplecallbacks, long l, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeLong(l);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(503, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadContactImageLegacy(IPeopleCallbacks ipeoplecallbacks, long l, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeLong(l);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadContactsGaiaIds(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            mRemote.transact(403, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadContactsGaiaIds24(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadLog(IPeopleCallbacks ipeoplecallbacks, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(302, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
              goto _L5
        }

        public final ICancelToken loadOwnerAvatar(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_104;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(505, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadOwnerAvatarLegacy(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            mRemote.transact(506, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadOwnerCoverPhotoLegacy(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            mRemote.transact(301, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadOwners(IPeopleCallbacks ipeoplecallbacks, boolean flag, boolean flag1, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            int j;
            if (flag)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (flag1)
            {
                j = ((flag2) ? 1 : 0);
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            mRemote.transact(305, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadOwners1(IPeopleCallbacks ipeoplecallbacks, boolean flag, boolean flag1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeople(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
                long l, String s3, int j, int k, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_151;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeLong(l);
            parcel.writeString(s3);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeInt(i1);
            mRemote.transact(404, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeople20(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
                long l, String s3, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeLong(l);
            parcel.writeString(s3);
            parcel.writeInt(j);
            mRemote.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeople400(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
                long l, String s3, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeLong(l);
            parcel.writeString(s3);
            parcel.writeInt(j);
            parcel.writeInt(k);
            mRemote.transact(401, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeopleForAggregation(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
                int k, String s3, boolean flag1, int l, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeString(s3);
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeInt(l);
            parcel.writeInt(i1);
            mRemote.transact(402, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeopleForAggregation200(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int k;
            k = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                k = 1;
            }
            parcel.writeInt(k);
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(201, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeopleForAggregation201(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
                int k, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeString(s3);
            mRemote.transact(202, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeopleForAggregation202(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
                int k, String s3, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_149;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeString(s3);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            mRemote.transact(203, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeopleForAggregation8(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            parcel.writeInt(i);
            mRemote.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeopleLive(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeInt(i);
            parcel.writeString(s3);
            mRemote.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadPeopleOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
                long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            parcel.writeLong(l);
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final ICancelToken loadPhoneNumbers(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(1201, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
              goto _L5
        }

        public final ICancelToken loadRemoteImage(IPeopleCallbacks ipeoplecallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            mRemote.transact(504, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void loadRemoteImageLegacy(IPeopleCallbacks ipeoplecallbacks, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            mRemote.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final Bundle registerDataChangedListener(IPeopleCallbacks ipeoplecallbacks, boolean flag, String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int j;
            j = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            if (flag)
            {
                j = 1;
            }
            parcel.writeInt(j);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            mRemote.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L4; else goto _L3
_L3:
            ipeoplecallbacks = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L6:
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            ipeoplecallbacks = null;
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
              goto _L5
        }

        public final void removeCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            mRemote.transact(204, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final Bundle requestSync(String s, String s1, long l, boolean flag, boolean flag1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag2;
            flag2 = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeLong(l);
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            mRemote.transact(205, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final Bundle requestSyncOld(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final Bundle requestSyncOld19(String s, String s1, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeLong(l);
            mRemote.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final Bundle requestSyncOld25(String s, String s1, long l, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeLong(l);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final ICancelToken sendAutocompleteFeedback(IPeopleCallbacks ipeoplecallbacks, DataHolder dataholder, int i, int j, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            if (dataholder == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L6:
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeLong(l);
            mRemote.transact(602, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
              goto _L5
        }

        public final ICancelToken sendInteractionFeedback(IPeopleCallbacks ipeoplecallbacks, String s, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeInt(i);
            mRemote.transact(509, parcel, parcel1, 0);
            parcel1.readException();
            ipeoplecallbacks = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return ipeoplecallbacks;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void setAvatar(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Uri uri, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
            break MISSING_BLOCK_LABEL_138;
_L6:
            parcel.writeInt(i);
            mRemote.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
            break MISSING_BLOCK_LABEL_138;
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
            while (!flag) 
            {
                i = 0;
                break;
            }
              goto _L6
        }

        public final void setAvatarOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
              goto _L5
        }

        public final void setHasShownAddToCircleConsent(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(102, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void setSyncToContactsEnabled(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(15, parcel, parcel1, 0);
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

        public final void setSyncToContactsSettings(IPeopleCallbacks ipeoplecallbacks, String s, boolean flag, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            parcel.writeStringArray(as);
            mRemote.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void starPerson(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(603, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final Bundle startSync(String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            parcel.writeString(s);
            parcel.writeString(s1);
            mRemote.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final Bundle syncRawContact(Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L3:
            mRemote.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            uri = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
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

        public final void updateCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3, int i, String s4)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            parcel.writeInt(i);
            parcel.writeString(s4);
            mRemote.transact(303, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        public final void updatePersonCircles(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, List list1, FavaDiagnosticsEntity favadiagnosticsentity)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null) goto _L2; else goto _L1
_L1:
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            if (favadiagnosticsentity == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            favadiagnosticsentity.writeToParcel(parcel, 0);
_L6:
            mRemote.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ipeoplecallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
              goto _L5
        }

        public final void updatePersonCirclesOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, List list1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (ipeoplecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            ipeoplecallbacks = ipeoplecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(ipeoplecallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringList(list);
            parcel.writeStringList(list1);
            mRemote.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ipeoplecallbacks = null;
              goto _L1
            ipeoplecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw ipeoplecallbacks;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void addCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3, boolean flag)
        throws RemoteException;

    public abstract void addCircle26(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3)
        throws RemoteException;

    public abstract void addPeopleToCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list)
        throws RemoteException;

    public abstract void blockPerson(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag)
        throws RemoteException;

    public abstract void identityGetByIds(IPeopleCallbacks ipeoplecallbacks, AccountToken accounttoken, List list, ParcelableGetOptions parcelablegetoptions)
        throws RemoteException;

    public abstract ICancelToken identityList(IPeopleCallbacks ipeoplecallbacks, AccountToken accounttoken, ParcelableListOptions parcelablelistoptions)
        throws RemoteException;

    public abstract void internalCall(IPeopleCallbacks ipeoplecallbacks, Bundle bundle)
        throws RemoteException;

    public abstract boolean isSyncToContactsEnabled()
        throws RemoteException;

    public abstract void loadAddToCircleConsent(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
        throws RemoteException;

    public abstract ICancelToken loadAutocompleteList(IPeopleCallbacks ipeoplecallbacks, String s, String s1, boolean flag, String s2, String s3, int i, 
            int j, int k, boolean flag1)
        throws RemoteException;

    public abstract ICancelToken loadAvatar(IPeopleCallbacks ipeoplecallbacks, String s, int i, int j)
        throws RemoteException;

    public abstract ICancelToken loadAvatarByReference(IPeopleCallbacks ipeoplecallbacks, AvatarReference avatarreference, ParcelableLoadImageOptions parcelableloadimageoptions)
        throws RemoteException;

    public abstract void loadAvatarLegacy(IPeopleCallbacks ipeoplecallbacks, String s, int i, int j)
        throws RemoteException;

    public abstract void loadCircles(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3, boolean flag)
        throws RemoteException;

    public abstract void loadCirclesOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3)
        throws RemoteException;

    public abstract ICancelToken loadContactImage(IPeopleCallbacks ipeoplecallbacks, long l, boolean flag)
        throws RemoteException;

    public abstract void loadContactImageLegacy(IPeopleCallbacks ipeoplecallbacks, long l, boolean flag)
        throws RemoteException;

    public abstract void loadContactsGaiaIds(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
        throws RemoteException;

    public abstract void loadContactsGaiaIds24(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
        throws RemoteException;

    public abstract void loadLog(IPeopleCallbacks ipeoplecallbacks, Bundle bundle)
        throws RemoteException;

    public abstract ICancelToken loadOwnerAvatar(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i, int j)
        throws RemoteException;

    public abstract void loadOwnerAvatarLegacy(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i, int j)
        throws RemoteException;

    public abstract ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
        throws RemoteException;

    public abstract void loadOwnerCoverPhotoLegacy(IPeopleCallbacks ipeoplecallbacks, String s, String s1, int i)
        throws RemoteException;

    public abstract void loadOwners(IPeopleCallbacks ipeoplecallbacks, boolean flag, boolean flag1, String s, String s1, int i)
        throws RemoteException;

    public abstract void loadOwners1(IPeopleCallbacks ipeoplecallbacks, boolean flag, boolean flag1, String s, String s1)
        throws RemoteException;

    public abstract void loadPeople(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k, int i1)
        throws RemoteException;

    public abstract void loadPeople20(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j)
        throws RemoteException;

    public abstract void loadPeople400(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l, String s3, int j, int k)
        throws RemoteException;

    public abstract void loadPeopleForAggregation(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1, int l, int i1)
        throws RemoteException;

    public abstract void loadPeopleForAggregation200(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag, int i, int j)
        throws RemoteException;

    public abstract void loadPeopleForAggregation201(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3)
        throws RemoteException;

    public abstract void loadPeopleForAggregation202(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, boolean flag, int j, 
            int k, String s3, boolean flag1)
        throws RemoteException;

    public abstract void loadPeopleForAggregation8(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag, int i)
        throws RemoteException;

    public abstract void loadPeopleLive(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, int i, String s3)
        throws RemoteException;

    public abstract void loadPeopleOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, int i, boolean flag, 
            long l)
        throws RemoteException;

    public abstract ICancelToken loadPhoneNumbers(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Bundle bundle)
        throws RemoteException;

    public abstract ICancelToken loadRemoteImage(IPeopleCallbacks ipeoplecallbacks, String s)
        throws RemoteException;

    public abstract void loadRemoteImageLegacy(IPeopleCallbacks ipeoplecallbacks, String s)
        throws RemoteException;

    public abstract Bundle registerDataChangedListener(IPeopleCallbacks ipeoplecallbacks, boolean flag, String s, String s1, int i)
        throws RemoteException;

    public abstract void removeCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2)
        throws RemoteException;

    public abstract Bundle requestSync(String s, String s1, long l, boolean flag, boolean flag1)
        throws RemoteException;

    public abstract Bundle requestSyncOld(String s, String s1)
        throws RemoteException;

    public abstract Bundle requestSyncOld19(String s, String s1, long l)
        throws RemoteException;

    public abstract Bundle requestSyncOld25(String s, String s1, long l, boolean flag)
        throws RemoteException;

    public abstract ICancelToken sendAutocompleteFeedback(IPeopleCallbacks ipeoplecallbacks, DataHolder dataholder, int i, int j, long l)
        throws RemoteException;

    public abstract ICancelToken sendInteractionFeedback(IPeopleCallbacks ipeoplecallbacks, String s, int i)
        throws RemoteException;

    public abstract void setAvatar(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Uri uri, boolean flag)
        throws RemoteException;

    public abstract void setAvatarOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, Uri uri)
        throws RemoteException;

    public abstract void setHasShownAddToCircleConsent(IPeopleCallbacks ipeoplecallbacks, String s, String s1)
        throws RemoteException;

    public abstract void setSyncToContactsEnabled(boolean flag)
        throws RemoteException;

    public abstract void setSyncToContactsSettings(IPeopleCallbacks ipeoplecallbacks, String s, boolean flag, String as[])
        throws RemoteException;

    public abstract void starPerson(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, boolean flag)
        throws RemoteException;

    public abstract Bundle startSync(String s, String s1)
        throws RemoteException;

    public abstract Bundle syncRawContact(Uri uri)
        throws RemoteException;

    public abstract void updateCircle(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, String s3, int i, String s4)
        throws RemoteException;

    public abstract void updatePersonCircles(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, List list1, FavaDiagnosticsEntity favadiagnosticsentity)
        throws RemoteException;

    public abstract void updatePersonCirclesOld(IPeopleCallbacks ipeoplecallbacks, String s, String s1, String s2, List list, List list1)
        throws RemoteException;
}
