// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.tiles;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.facebook.h;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.facebook.widget.tiles.b;

// Referenced classes of package com.facebook.user.tiles:
//            b

public class a
{

    public static int a;
    public static com.facebook.widget.tiles.a b;
    public static com.facebook.widget.tiles.a c;
    public static com.facebook.widget.tiles.a d;
    private final b e;

    public a(b b1)
    {
        e = b1;
    }

    public Drawable a(int i, int j)
    {
        return e.a(b, i, j);
    }

    public Drawable a(UserKey userkey, int i, int j)
    {
        if (userkey != null)
        {
            if (userkey.a() == n.FACEBOOK)
            {
                return a(i, j);
            }
            if (userkey.a() == n.PHONE_NUMBER || userkey.a() == n.ADDRESS_BOOK)
            {
                return c(i, j);
            }
            if (userkey.a() == n.EMAIL)
            {
                return b(i, j);
            }
        }
        return a(i, j);
    }

    public com.facebook.widget.tiles.a a(n n1)
    {
        switch (b.a[n1.ordinal()])
        {
        default:
            return b;

        case 1: // '\001'
        case 2: // '\002'
            return d;

        case 3: // '\003'
            return c;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return b;
        }
    }

    public Drawable b(int i, int j)
    {
        return e.a(c, i, j);
    }

    public Drawable c(int i, int j)
    {
        return e.a(d, i, j);
    }

    static 
    {
        a = Color.argb(255, 204, 211, 224);
        b = new com.facebook.widget.tiles.a("user", h.orca_default_user_tile, a);
        c = new com.facebook.widget.tiles.a("email", h.orca_default_email_tile, a);
        d = new com.facebook.widget.tiles.a("sms", h.orca_default_sms_tile, a);
    }
}
