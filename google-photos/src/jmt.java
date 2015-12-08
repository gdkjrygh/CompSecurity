// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

public final class jmt
    implements jmr
{

    private final jmr a;
    private final jmr b = new jmu(null);
    private final jmr c;
    private final jmr d;
    private jmr e;

    public jmt(Context context, k k, jmr jmr1)
    {
        a = (jmr)c.a(jmr1);
        c = new jmp(context, null);
        d = new jmq(context, null);
    }

    public final int a(byte abyte0[], int i, int j)
    {
        return e.a(abyte0, i, j);
    }

    public final long a(jms jms1)
    {
        String s;
        boolean flag;
        if (e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        s = jms1.a.getScheme();
        if ("file".equals(s) || TextUtils.isEmpty(s))
        {
            if (jms1.a.getPath().startsWith("/android_asset/"))
            {
                e = c;
            } else
            {
                e = b;
            }
        } else
        if ("asset".equals(s))
        {
            e = c;
        } else
        if ("content".equals(s))
        {
            e = d;
        } else
        {
            e = a;
        }
        return e.a(jms1);
    }

    public final void a()
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        e.a();
        e = null;
        return;
        Exception exception;
        exception;
        e = null;
        throw exception;
    }
}
