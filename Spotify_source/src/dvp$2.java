// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.service.ForceInCollection;

final class ang.Object
    implements eol
{

    private String a;
    private dvp b;

    public final void a(String s)
    {
    }

    public final void a(String s, boolean flag)
    {
        if (TextUtils.equals(a, s))
        {
            dvp dvp1 = b;
            if (flag)
            {
                s = ForceInCollection.a;
            } else
            {
                s = ForceInCollection.b;
            }
            dvp1.d = s;
            b.a(b.d);
        }
    }

    (dvp dvp1, String s)
    {
        b = dvp1;
        a = s;
        super();
    }
}
