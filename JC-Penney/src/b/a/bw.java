// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

// Referenced classes of package b.a:
//            bj, bk

public final class bw
    implements bj
{

    public String a;

    public bw()
    {
        a = null;
        bk.b();
        a = bk.b().getResources().getConfiguration().locale.getLanguage();
        if (a == null || a.length() == 0)
        {
            a = "en";
        }
    }

    public final String a()
    {
        return "locale";
    }

    public final volatile Object b()
    {
        return a;
    }
}
