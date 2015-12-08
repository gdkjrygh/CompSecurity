// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            az, c, cm, cj

final class d extends az
{

    private c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final void a()
    {
        try
        {
            c.a(a);
            return;
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Problem encountered during Crashlytics initialization.", exception);
        }
    }
}
