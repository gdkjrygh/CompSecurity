// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.tiles;

import com.facebook.debug.log.b;
import com.facebook.user.PicCropInfo;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.user.tiles:
//            f

public final class e
{

    private static final Class a = com/facebook/user/tiles/e;
    private final f b;
    private final PicCropInfo c;
    private final UserKey d;

    private e(f f1, PicCropInfo piccropinfo, UserKey userkey)
    {
        b = f1;
        c = piccropinfo;
        d = userkey;
    }

    public static e a(PicCropInfo piccropinfo)
    {
        return a(piccropinfo, null);
    }

    public static e a(PicCropInfo piccropinfo, UserKey userkey)
    {
        return new e(f.PIC_CROP_INFO, piccropinfo, userkey);
    }

    public static e a(User user)
    {
        PicCropInfo piccropinfo = user.s();
        if (piccropinfo != null)
        {
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Using pic crop info for user (").append(user).append("): ").append(piccropinfo).toString());
            return a(piccropinfo, user.c());
        } else
        {
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Using user key for user (").append(user).append("): ").append(piccropinfo).toString());
            return a(user.c());
        }
    }

    public static e a(UserKey userkey)
    {
        return new e(f.USER_KEY, null, userkey);
    }

    public f a()
    {
        return b;
    }

    public PicCropInfo b()
    {
        return c;
    }

    public UserKey c()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (e)obj;
            if (!a().equals(((e) (obj)).a()))
            {
                return false;
            }
            if (!Objects.equal(b(), ((e) (obj)).b()))
            {
                return false;
            }
            if (!Objects.equal(c(), ((e) (obj)).c()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a(), b(), c()
        });
    }

}
