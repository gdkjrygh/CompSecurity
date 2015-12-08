// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.sdk.usermanager;

import android.content.Context;
import android.graphics.Bitmap;
import com.cleanmaster.sdk.cmloginsdkjar.Request;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmRawObject;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.sdk.usermanager:
//            IUserManager, q, r, s, 
//            d, g, h, m, 
//            b, j, n, o, 
//            e, t, f, i, 
//            a, l, c, k, 
//            p

public class UserManagerImpl
    implements IUserManager
{

    private static UserManagerImpl mInstance = null;

    public UserManagerImpl()
    {
    }

    public static final UserManagerImpl getInstance(Context context)
    {
        if (mInstance == null)
        {
            mInstance = new UserManagerImpl();
        }
        return mInstance;
    }

    public CmRawObject allLogout(String s1, String s2, String s3, String s4, String s5)
    {
        if (s3 == null)
        {
            return null;
        } else
        {
            CmRawObject acmrawobject[] = new CmRawObject[1];
            Request.newRevokeRequest(s1, s2, s3, s4, s5, new q(this, acmrawobject)).executeAndWait();
            return acmrawobject[0];
        }
    }

    public CmRawObject allUpAvatar(String s1, String s2, String s3, Bitmap bitmap, String s4, String s5)
    {
        if (s3 == null)
        {
            return null;
        } else
        {
            CmRawObject acmrawobject[] = new CmRawObject[1];
            Request.newUpAvatarRequest(s1, s2, s3, bitmap, s4, s5, new r(this, acmrawobject)).executeAndWait();
            return acmrawobject[0];
        }
    }

    public CmRawObject allUpNickname(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        if (s3 == null)
        {
            return null;
        } else
        {
            CmRawObject acmrawobject[] = new CmRawObject[1];
            Request.newUpNicknameRequest(s1, s2, s3, s4, s5, s6, new s(this, acmrawobject)).executeAndWait();
            return acmrawobject[0];
        }
    }

    public CmRawObject allUserinfo(String s1, String s2, String s3, String s4, String s5)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newUserinfoRequest(s1, s2, s3, s4, s5, new d(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmCmbToken(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String s9)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newCmbTokenRequest(s1, s2, s3, s4, s5, s6, s7, false, s8, s9, new g(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmCmbTokenWithExtra(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String s9)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newCmbTokenRequest(s1, s2, s3, s4, s5, s6, s7, true, s8, s9, new h(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmEmailActive(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newEmailActiveRequest(s1, s2, s3, s4, s5, s6, new m(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmFindPasswordByMail(String s1, String s2, String s3, String s4, String s5)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newForgetRequest(s1, s2, s3, s4, s5, new b(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmIsAccountExist(String s1, String s2, String s3, String s4, String s5)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newIsExistRequest(s1, s2, s3, s4, s5, new j(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmLogin(String s1, String s2, String s3, String s4, String s5, String s6, String s7)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newLoginRequest(s1, s2, s3, s4, s5, false, s6, s7, new n(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmLoginWithExtra(String s1, String s2, String s3, String s4, String s5, String s6, String s7)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newLoginRequest(s1, s2, s3, s4, s5, true, s6, s7, new o(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmMe(String s1, String s2, String s3, String s4, String s5)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newMeRequest(s1, s2, s3, s4, s5, new e(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmModifyPassword(String s1, String s2, String s3, String s4, String s5, String s6, String s7)
    {
        if (s3 == null)
        {
            return null;
        } else
        {
            CmRawObject acmrawobject[] = new CmRawObject[1];
            Request.newPasswordRequest(s1, s2, s3, s4, s5, s6, s7, new t(this, acmrawobject)).executeAndWait();
            return acmrawobject[0];
        }
    }

    public CmRawObject cmReauth(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("com.ijinshan.kbackup", "c09763c733c26804185642a8c9d8b7a6");
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newReauthRequest(s1, s2, s3, s4, (String)hashmap.get(s4), s5, s6, new f(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmRefreshToken(String s1, String s2, String s3, String s4, String s5)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newReFreshRequest(s1, s2, s3, s4, s5, new i(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmRegist(String s1, String s2, String s3, String s4, String s5, String s6, String s7)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newRegisterRequest(s1, s2, s3, s4, s5, false, s6, s7, new a(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmRegistWithExtra(String s1, String s2, String s3, String s4, String s5, String s6, String s7)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newRegisterRequest(s1, s2, s3, s4, s5, true, s6, s7, new l(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmResetPassword(String s1, String s2, String s3, String s4, String s5, String s6, String s7)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newResetRequest(s1, s2, s3, s4, s5, s6, s7, new c(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject cmSendMail(String s1, String s2, String s3, int i1, String s4, String s5, String s6)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newSendMailRequest(s1, s2, s3, i1, s4, s5, s6, new k(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

    public CmRawObject googleLogin(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        return thirdPartyLogin(s1, s2, s3, s4, "104", false, s5, s6);
    }

    public CmRawObject googleLoginWithExtra(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        return thirdPartyLogin(s1, s2, s3, s4, "104", true, s5, s6);
    }

    public CmRawObject instagramLogin(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        return thirdPartyLogin(s1, s2, s3, s4, "110", false, s5, s6);
    }

    public CmRawObject instagramLoginWithExtra(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        return thirdPartyLogin(s1, s2, s3, s4, "110", true, s5, s6);
    }

    public CmRawObject thirdPartyLogin(String s1, String s2, String s3, String s4, String s5, boolean flag, String s6, 
            String s7)
    {
        CmRawObject acmrawobject[] = new CmRawObject[1];
        Request.newThirdRequest(s1, s2, s3, s4, s5, flag, s6, s7, new p(this, acmrawobject)).executeAndWait();
        return acmrawobject[0];
    }

}
