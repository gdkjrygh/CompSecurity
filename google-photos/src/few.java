// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;

public final class few extends mtf
{

    private final int a;
    private final String b;
    private final String c;

    public few(int i, String s)
    {
        this(i, s, null);
    }

    public few(int i, String s, String s1)
    {
        super("RequestVideoDownloadUrlTask");
        a = i;
        b = s;
        c = s1;
    }

    protected final mue a(Context context)
    {
        Object obj = null;
        int i = a;
        String s = b;
        String s1 = c;
        context = djh.a(context, i, Collections.singletonList(djf.a(s)), s1);
        context.d();
        if (context.l())
        {
            s = null;
        } else
        {
            context = ((djh) (context)).a.b;
            if (context == null || context.length == 0)
            {
                s = null;
            } else
            {
                s = context[0];
            }
        }
        if (s == null)
        {
            return new mue(false);
        }
        context = obj;
        if (((qgg) (s)).d != null)
        {
            if (((qgg) (s)).d.c != null)
            {
                context = ((qgg) (s)).d.c.e;
            } else
            {
                context = obj;
                if (((qgg) (s)).d.b != null)
                {
                    context = ((qgg) (s)).d.b.c;
                }
            }
        }
        if (TextUtils.isEmpty(context))
        {
            return new mue(false);
        } else
        {
            mue mue1 = new mue(true);
            mue1.a().putString("downloadUrl", context);
            return mue1;
        }
    }
}
