// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;

final class ang.Object
    implements fhw
{

    private fht a;

    public final void a(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        a.a(intent);
        a.dismiss();
    }

    (fht fht1)
    {
        a = fht1;
        super();
    }
}
