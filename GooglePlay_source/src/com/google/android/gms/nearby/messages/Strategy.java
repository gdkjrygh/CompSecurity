// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            StrategyCreator

public class Strategy
    implements SafeParcelable
{
    public static final class Builder
    {

        int discoveryMedium;
        private int discoveryMode;
        private int distanceType;
        int ttlSeconds;

        public final Strategy build()
        {
            return new Strategy(2, 0, ttlSeconds, 0, false, discoveryMedium, discoveryMode);
        }

        public Builder()
        {
            discoveryMode = 3;
            ttlSeconds = 300;
            distanceType = 0;
            discoveryMedium = 6;
        }
    }


    public static final Strategy BLE_BEACON;
    public static final Strategy BLE_ONLY;
    public static final android.os.Parcelable.Creator CREATOR = new StrategyCreator();
    public static final Strategy DEFAULT = (new Builder()).build();
    final int mBroadcastScanStrategy;
    final int mDiscoveryMedium;
    final int mDiscoveryMode;
    final int mDistanceType;
    final boolean mIsBleBeaconStrategy;
    final int mTtlSeconds;
    final int mVersionCode;

    Strategy(int i, int j, int k, int l, boolean flag, int i1, int j1)
    {
        mVersionCode = i;
        mBroadcastScanStrategy = j;
        if (j == 0)
        {
            mDiscoveryMode = j1;
            break MISSING_BLOCK_LABEL_24;
        } else
        {
            switch (j)
            {
            default:
                mDiscoveryMode = 3;
                break;

            case 2: // '\002'
                mDiscoveryMode = 1;
                break;

            case 3: // '\003'
                mDiscoveryMode = 2;
                break;
            }
            continue;
        }
        do
        {
            mDistanceType = l;
            mIsBleBeaconStrategy = flag;
            if (flag)
            {
                mDiscoveryMedium = 2;
                mTtlSeconds = 0x7fffffff;
                return;
            }
            if (i1 == 0)
            {
                mDiscoveryMedium = 6;
                mTtlSeconds = k;
                return;
            }
            mDiscoveryMedium = i1;
            mTtlSeconds = k;
            break;
        } while (true);
        return;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Strategy))
            {
                return false;
            }
            obj = (Strategy)obj;
            if (mVersionCode != ((Strategy) (obj)).mVersionCode || mDiscoveryMode != ((Strategy) (obj)).mDiscoveryMode || mTtlSeconds != ((Strategy) (obj)).mTtlSeconds || mDistanceType != ((Strategy) (obj)).mDistanceType || mDiscoveryMedium != ((Strategy) (obj)).mDiscoveryMedium)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (((mVersionCode * 31 + mDiscoveryMode) * 31 + mTtlSeconds) * 31 + mDistanceType) * 31 + mDiscoveryMedium;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Strategy{ttlSeconds=")).append(mTtlSeconds).append(", distanceType=");
        mDistanceType;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 114
    //                   1 120;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_120;
_L1:
        Object obj = "UNKNOWN";
_L4:
        stringbuilder = stringbuilder.append(((String) (obj))).append(", discoveryMedium=");
        int i = mDiscoveryMedium;
        if (i == 6)
        {
            obj = "DEFAULT";
        } else
        {
            obj = new ArrayList();
            if ((i & 4) > 0)
            {
                ((List) (obj)).add("AUDIO");
            }
            if ((i & 2) > 0)
            {
                ((List) (obj)).add("BLE");
            }
            obj = obj.toString();
        }
        stringbuilder = stringbuilder.append(((String) (obj))).append(", discoveryMode=");
        i = mDiscoveryMode;
        if (i == 3)
        {
            obj = "DEFAULT";
        } else
        {
            obj = new ArrayList();
            if ((i & 1) > 0)
            {
                ((List) (obj)).add("BROADCAST");
            }
            if ((i & 2) > 0)
            {
                ((List) (obj)).add("SCAN");
            }
            obj = obj.toString();
        }
        return stringbuilder.append(((String) (obj))).append('}').toString();
_L2:
        obj = "DEFAULT";
          goto _L4
        obj = "EARSHOT";
          goto _L4
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StrategyCreator.writeToParcel$1d51236e(this, parcel);
    }

    static 
    {
        Object obj = new Builder();
        obj.discoveryMedium = 2;
        Preconditions.checkArgument(true, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[] {
            Integer.valueOf(0x7fffffff), Integer.valueOf(0x15180)
        });
        obj.ttlSeconds = 0x7fffffff;
        obj = ((Builder) (obj)).build();
        BLE_ONLY = ((Strategy) (obj));
        BLE_BEACON = ((Strategy) (obj));
    }
}
