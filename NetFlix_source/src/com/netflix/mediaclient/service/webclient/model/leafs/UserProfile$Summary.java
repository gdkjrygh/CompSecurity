// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.mediaclient.servicemgr.ProfileType;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            UserProfile

public class this._cls0
{

    private String avatarUrl;
    private String email;
    public ProfileType enumType;
    private String experienceType;
    private String firstName;
    private String geoCountry;
    private boolean isAutoPlayEnabled;
    private boolean isIqEnabled;
    private boolean isPrimaryProfile;
    public List languages;
    private String lastName;
    private String profileId;
    private String profileName;
    private String reqCountry;
    private this._cls0 social;
    final UserProfile this$0;
    private String userId;



/*
    static String access$002( , String s)
    {
        .email = s;
        return s;
    }

*/




/*
    static String access$1002(email email1, String s)
    {
        email1.profileId = s;
        return s;
    }

*/


/*
    static String access$102(profileId profileid, String s)
    {
        profileid.profileName = s;
        return s;
    }

*/



/*
    static String access$1102(profileName profilename, String s)
    {
        profilename.avatarUrl = s;
        return s;
    }

*/





/*
    static String access$202(avatarUrl avatarurl, String s)
    {
        avatarurl.firstName = s;
        return s;
    }

*/



/*
    static String access$302(firstName firstname, String s)
    {
        firstname.lastName = s;
        return s;
    }

*/



/*
    static boolean access$402(lastName lastname, boolean flag)
    {
        lastname.isIqEnabled = flag;
        return flag;
    }

*/



/*
    static boolean access$502(isIqEnabled isiqenabled, boolean flag)
    {
        isiqenabled.isPrimaryProfile = flag;
        return flag;
    }

*/



/*
    static isPrimaryProfile access$602(isPrimaryProfile isprimaryprofile, isPrimaryProfile isprimaryprofile1)
    {
        isprimaryprofile.social = isprimaryprofile1;
        return isprimaryprofile1;
    }

*/



/*
    static boolean access$702(social social1, boolean flag)
    {
        social1.isAutoPlayEnabled = flag;
        return flag;
    }

*/



/*
    static String access$802(isAutoPlayEnabled isautoplayenabled, String s)
    {
        isautoplayenabled.experienceType = s;
        return s;
    }

*/



/*
    static String access$902(experienceType experiencetype, String s)
    {
        experiencetype.userId = s;
        return s;
    }

*/

    public userId()
    {
        this$0 = UserProfile.this;
        super();
    }
}
