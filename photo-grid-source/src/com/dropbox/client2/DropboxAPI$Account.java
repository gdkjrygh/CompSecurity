// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.util.Map;

// Referenced classes of package com.dropbox.client2:
//            VersionedSerializable, DropboxAPI

public class apAsLong extends VersionedSerializable
{

    private static int MY_VERSION = 0;
    private static final long serialVersionUID = 0x1d1be5b63d0357f4L;
    public final String country;
    public final String displayName;
    public final String email;
    public final boolean emailVerified;
    public final boolean isPaired;
    public final String locale;
    public final ils nameDetails;
    public final long quota;
    public final long quotaNormal;
    public final long quotaShared;
    public final String referralLink;
    public final  teamInfo;
    public final long uid;

    public int getLatestVersion()
    {
        return MY_VERSION;
    }

    boolean isOverQuota()
    {
        return quotaNormal + quotaShared > quota;
    }

    static 
    {
        MY_VERSION = 2;
    }

    protected (String s, String s1, String s2, boolean flag, long l, String s3, 
            boolean flag1, String s4, ils ils,  , long l1, long l2, long l3)
    {
        country = s;
        displayName = s1;
        email = s2;
        emailVerified = flag;
        uid = l;
        referralLink = s3;
        isPaired = flag1;
        locale = s4;
        nameDetails = ils;
        teamInfo = ;
        quota = l1;
        quotaNormal = l2;
        quotaShared = l3;
    }

    protected quotaShared(Map map)
    {
        country = (String)map.get("country");
        displayName = (String)map.get("display_name");
        email = (String)map.get("email");
        emailVerified = DropboxAPI.getFromMapAsBoolean(map, "email_verified");
        uid = DropboxAPI.getFromMapAsLong(map, "uid");
        referralLink = (String)map.get("referral_link");
        isPaired = DropboxAPI.getFromMapAsBoolean(map, "is_paired");
        locale = (String)map.get("locale");
        Object obj = map.get("name_details");
        if (obj != null && (obj instanceof Map))
        {
            nameDetails = new ils((Map)obj);
        } else
        {
            nameDetails = null;
        }
        obj = map.get("team");
        if (obj != null && (obj instanceof Map))
        {
            teamInfo = new ((Map)obj);
        } else
        {
            teamInfo = null;
        }
        map = (Map)map.get("quota_info");
        quota = DropboxAPI.getFromMapAsLong(map, "quota");
        quotaNormal = DropboxAPI.getFromMapAsLong(map, "normal");
        quotaShared = DropboxAPI.getFromMapAsLong(map, "shared");
    }
}
