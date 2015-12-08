// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.proximity.data;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.firstparty.proximity.data:
//            PermitCreator, PermitAccess

public class Permit
    implements SafeParcelable
{

    public static final PermitCreator CREATOR = new PermitCreator();
    final String mAccountId;
    final Set mAllowedChannels;
    List mAllowedChannelsCache;
    final String mId;
    final PermitAccess mLicense;
    final Map mRequesterAccesses;
    List mRequesterAccessesCache;
    final String mType;
    final int mVersion;

    Permit(int i, String s, String s1, String s2, PermitAccess permitaccess, List list, List list1)
    {
        this(i, s, s1, s2, permitaccess, getPermitAccessesFromCache(list), ((Set) (new HashSet(list1))));
    }

    private Permit(int i, String s, String s1, String s2, PermitAccess permitaccess, Map map, Set set)
    {
        mVersion = i;
        mId = Preconditions.checkNotEmpty(s);
        mAccountId = Preconditions.checkNotEmpty(s1);
        mType = Preconditions.checkNotEmpty(s2);
        mLicense = (PermitAccess)Preconditions.checkNotNull(permitaccess);
        if (map == null)
        {
            s = new HashMap();
        } else
        {
            s = new HashMap(map);
        }
        mRequesterAccesses = s;
        mAllowedChannels = new HashSet(set);
    }

    private static Map getPermitAccessesFromCache(List list)
    {
        HashMap hashmap = new HashMap();
        PermitAccess permitaccess;
        for (list = list.iterator(); list.hasNext(); hashmap.put(permitaccess.mId, permitaccess))
        {
            permitaccess = (PermitAccess)list.next();
        }

        return hashmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj instanceof Permit)
            {
                obj = (Permit)obj;
                if (TextUtils.equals(mAccountId, ((Permit) (obj)).mAccountId) && TextUtils.equals(mId, ((Permit) (obj)).mId) && TextUtils.equals(mType, ((Permit) (obj)).mType) && mLicense.equals(((Permit) (obj)).mLicense) && mAllowedChannels.equals(((Permit) (obj)).mAllowedChannels) && mRequesterAccesses.equals(((Permit) (obj)).mRequesterAccesses))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (((((mId.hashCode() + 527) * 31 + mAccountId.hashCode()) * 31 + mType.hashCode()) * 31 + mAllowedChannels.hashCode()) * 31 + mLicense.hashCode()) * 31 + mRequesterAccesses.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mRequesterAccessesCache = new ArrayList(mRequesterAccesses.values());
        mAllowedChannelsCache = new ArrayList(mAllowedChannels);
        PermitCreator.writeToParcel(this, parcel, i);
    }

}
