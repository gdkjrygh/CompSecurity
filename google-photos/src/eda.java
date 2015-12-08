// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

final class eda
    implements dwg
{

    private String a;
    private noz b;

    eda(ecz ecz, String s, noz noz)
    {
        a = s;
        b = noz;
        super();
    }

    public final void a(Context context)
    {
        Uri uri = null;
        Uri uri1 = Uri.parse(a);
        uri = uri1;
_L2:
        if (uri != null)
        {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
