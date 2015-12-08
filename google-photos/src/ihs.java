// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public final class ihs extends mtf
{

    private final int a;
    private final String b;

    public ihs(int i, String s, int j)
    {
        super(a(j));
        a = i;
        b = s;
    }

    public static String a(int i)
    {
        String s = String.valueOf("ReadMediaCollectionShortenedUrl:");
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    protected final mue a(Context context)
    {
        context = new ihr(context, a, null, b);
        context.d();
        if (context.l())
        {
            return new mue(((nxx) (context)).l, ((nxx) (context)).n, null);
        }
        context = ((ihr) (context)).a;
        if (TextUtils.isEmpty(context))
        {
            return new mue(false);
        } else
        {
            mue mue1 = new mue(true);
            mue1.a().putString("url", context);
            return mue1;
        }
    }
}
