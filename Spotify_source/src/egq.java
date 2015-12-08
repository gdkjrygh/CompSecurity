// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.ford.syncV4.proxy.rpc.enums.Language;

public final class egq
{

    public final Context a;

    public egq(Context context)
    {
        a = context;
    }

    public final String a()
    {
        return a.getString(0x7f080096);
    }

    public final String b()
    {
        return a.getString(0x7f080097);
    }

    public final Language c()
    {
        Object obj = a.getResources().getString(0x7f08009b);
        try
        {
            obj = Language.valueOf(((String) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return Language.a;
        }
        return ((Language) (obj));
    }

    public final String d()
    {
        return a.getString(0x7f08008a);
    }

    public final String e()
    {
        return a.getString(0x7f08008b);
    }

    public final String f()
    {
        return a.getString(0x7f080092);
    }

    public final String g()
    {
        return a.getString(0x7f080093);
    }

    public final String h()
    {
        return a.getString(0x7f08008e);
    }

    public final String i()
    {
        return a.getString(0x7f08008f);
    }
}
