// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

final class bng
    implements caa
{

    private bne a;

    bng(bne bne1)
    {
        a = bne1;
        super();
    }

    public final void a()
    {
        bne bne1 = a;
        if (bne1.c.b.ae || bne1.c.b.af)
        {
            Object obj = bne1.c.s();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            bne1.b.a(((Uri) (obj)));
        }
    }
}
