// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public class drz
{

    private final gcf a;
    private final noz b;

    public drz(Context context)
    {
        a = (gcf)olm.a(context, gcf);
        b = noz.a(context, 3, "AllMediaSourceChecker", new String[0]);
    }

    public static gaw a(String s, String s1)
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (TextUtils.isEmpty(s1))
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            return gaw.c;
        }
        if (flag)
        {
            return gaw.b;
        }
        if (flag1)
        {
            return gaw.a;
        } else
        {
            throw new IllegalArgumentException("Cannot have an item that originates neither remotely nor locally");
        }
    }

    public final gaw a(int i)
    {
        if (a.a(i))
        {
            return gaw.c;
        }
        if (b.a())
        {
            noy.a(i);
        }
        return gaw.a;
    }
}
