// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.sdk.usermanager;

import android.graphics.Bitmap;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmRawObject;

public interface IUserManager
{

    public abstract CmRawObject allLogout(String s, String s1, String s2, String s3, String s4);

    public abstract CmRawObject allUpAvatar(String s, String s1, String s2, Bitmap bitmap, String s3, String s4);

    public abstract CmRawObject allUpNickname(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract CmRawObject allUserinfo(String s, String s1, String s2, String s3, String s4);

    public abstract CmRawObject cmCmbToken(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8);

    public abstract CmRawObject cmCmbTokenWithExtra(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8);

    public abstract CmRawObject cmEmailActive(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract CmRawObject cmFindPasswordByMail(String s, String s1, String s2, String s3, String s4);

    public abstract CmRawObject cmIsAccountExist(String s, String s1, String s2, String s3, String s4);

    public abstract CmRawObject cmLogin(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract CmRawObject cmLoginWithExtra(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract CmRawObject cmMe(String s, String s1, String s2, String s3, String s4);

    public abstract CmRawObject cmModifyPassword(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract CmRawObject cmReauth(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract CmRawObject cmRefreshToken(String s, String s1, String s2, String s3, String s4);

    public abstract CmRawObject cmRegist(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract CmRawObject cmRegistWithExtra(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract CmRawObject cmResetPassword(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract CmRawObject cmSendMail(String s, String s1, String s2, int i, String s3, String s4, String s5);

    public abstract CmRawObject googleLogin(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract CmRawObject googleLoginWithExtra(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract CmRawObject instagramLogin(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract CmRawObject instagramLoginWithExtra(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract CmRawObject thirdPartyLogin(String s, String s1, String s2, String s3, String s4, boolean flag, String s5, 
            String s6);
}
