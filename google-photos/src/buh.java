// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Locale;

public final class buh
{

    private Intent a;

    public buh(buf buf, Intent intent)
    {
        a = intent;
        super();
    }

    public final String toString()
    {
        Locale locale = Locale.US;
        Intent intent = a;
        Object obj;
        if (a.getExtras() != null)
        {
            obj = a.getExtras();
        } else
        {
            obj = "null";
        }
        return String.format(locale, "%s with extras %s", new Object[] {
            intent, obj
        });
    }
}
