// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

class cfm extends cgu
{

    final Context a;

    cfm(Context context)
    {
        a = context;
    }

    public boolean a(cgr cgr1)
    {
        return "content".equals(cgr1.d.getScheme());
    }

    public cgv b(cgr cgr1)
    {
        return new cgv(c(cgr1), cgl.b);
    }

    final InputStream c(cgr cgr1)
    {
        return a.getContentResolver().openInputStream(cgr1.d);
    }
}
