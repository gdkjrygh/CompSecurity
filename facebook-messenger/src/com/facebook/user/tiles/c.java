// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.tiles;

import com.facebook.debug.log.b;
import com.facebook.http.c.i;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.ui.images.cache.e;
import com.facebook.ui.images.cache.g;
import com.facebook.ui.images.d.d;
import com.facebook.ui.images.d.f;
import com.facebook.ui.images.d.h;
import com.facebook.user.PicCropInfo;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.facebook.user.p;
import com.facebook.widget.images.UrlImage;
import com.google.common.base.Objects;
import javax.inject.a;

// Referenced classes of package com.facebook.user.tiles:
//            d, e, f

public class c
{

    private static final Class a = com/facebook/user/tiles/c;
    private final a b;
    private final a c;

    public c(a a1, a a2)
    {
        b = a1;
        c = a2;
    }

    private m a(PicCropInfo piccropinfo, int j, int k)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Fetching tile data from crop info: ").append(piccropinfo).toString());
        if (piccropinfo == null || piccropinfo.b() == null)
        {
            return UrlImage.a;
        } else
        {
            h h1 = b(piccropinfo, j, k);
            return m.a(piccropinfo.b()).a(h1).a(e.newBuilder().a(h1.e(), h1.f()).d()).a();
        }
    }

    private m a(User user, UserKey userkey, int j, int k)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (user == null) goto _L2; else goto _L1
_L1:
        if (user.s() == null || !user.s().i()) goto _L4; else goto _L3
_L3:
        obj = a(user.s(), j, k);
_L2:
        user = ((User) (obj));
        if (obj == null)
        {
            if (userkey == null || userkey.a() != n.FACEBOOK || Objects.equal(userkey.b(), "0"))
            {
                break; /* Loop/switch isn't completed */
            }
            user = ((i)c.b()).b().appendEncodedPath(userkey.b()).appendEncodedPath("picture").appendQueryParameter("type", "large").build();
            userkey = a(j, k);
            user = m.a(user).a(userkey).a(e.newBuilder().a(userkey.e(), userkey.f()).d()).a();
        }
        return user;
_L4:
        obj = obj1;
        if (user.r() != null)
        {
            obj = a(j, k);
            obj = m.a(user.r()).a(((h) (obj))).a(e.newBuilder().a(((h) (obj)).e(), ((h) (obj)).f()).d()).a();
        }
        if (true) goto _L2; else goto _L5
_L5:
        return UrlImage.a;
    }

    private m a(UserKey userkey, int j, int k)
    {
        return a(((p)b.b()).a(userkey), userkey, j, k);
    }

    private h a(int j, int k)
    {
        return (new com.facebook.ui.images.d.i()).a((new d()).a((float)j / (float)k).b(1.0F).c(1.0F).e()).a(j / 2).b(k / 2).c(j).d(k).j();
    }

    private h b(PicCropInfo piccropinfo, int j, int k)
    {
        return (new com.facebook.ui.images.d.i()).a(new f(piccropinfo.j(), (float)j / (float)k)).a((new d()).a((float)j / (float)k).b(1.0F).c(1.0F).a(com.facebook.ui.images.d.c.CENTER).e()).a(j / 2).b(k / 2).c(j).d(k).j();
    }

    public m a(com.facebook.user.tiles.e e1, int j, int k)
    {
        if (e1 == null)
        {
            return null;
        }
        switch (com.facebook.user.tiles.d.a[e1.a().ordinal()])
        {
        default:
            throw new IllegalStateException("not reached");

        case 1: // '\001'
            return a(e1.b(), j, k);

        case 2: // '\002'
            return a(e1.c(), j, k);
        }
    }

}
