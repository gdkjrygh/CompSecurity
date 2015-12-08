// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fnk extends mtf
{

    private static final onh a = new onh("debug.photos.dogfood");
    private static final TimeUnit b;
    private final String c;
    private final ekq j;

    fnk(String s, int i)
    {
        super("com.google.android.apps.photos.help.FetchPhotosSpecificDataTask");
        c = s;
        j = iyw.a(i);
    }

    private static mhl a(Context context, String s)
    {
        context = ((mhh)olm.a(context, mhh)).a(context, s);
        boolean flag;
        context.a(2000L, b);
        flag = context.c();
        if (!flag)
        {
            context.b();
            return null;
        }
        s = (mhl)context.d().a(2000L, b);
        context.b();
        return s;
        s;
        context.b();
        throw s;
    }

    protected final mue a(Context context)
    {
        fnu fnu1 = new fnu(c);
        Object obj = a(context, c);
        boolean flag;
        if (obj != null && !((mhl) (obj)).a().isEmpty())
        {
            obj = (mhj)((mhl) (obj)).a().get(0);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            String s = ((mhj) (obj)).a;
            if (s != null && s.equals(fnu1.a))
            {
                fnu1.b = Boolean.valueOf(((mhj) (obj)).b);
                fnu1.c = Boolean.valueOf(((mhj) (obj)).g);
            } else
            {
                fnu1.b = Boolean.valueOf(false);
                fnu1.c = Boolean.valueOf(false);
            }
        }
        if (b.a(context, j).a(j, ekw.a) == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fnu1.d = Boolean.valueOf(flag);
        fnu1.e = Boolean.valueOf(false);
        context = new mue(true);
        context.a().putParcelable("PhotosSpecificData", fnu1);
        return context;
    }

    static 
    {
        b = TimeUnit.MILLISECONDS;
    }
}
