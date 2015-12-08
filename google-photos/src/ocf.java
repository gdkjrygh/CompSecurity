// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public final class ocf
    implements mru
{

    private static Boolean b = null;
    public final int a;

    public ocf(int i)
    {
        a = i;
    }

    public final String a(Context context, mrw mrw)
    {
        return null;
    }

    public final void a(Context context)
    {
    }

    public final void b(Context context)
    {
        Context context1 = context.getApplicationContext();
        boolean flag;
        if (context1 == context1.getApplicationContext())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must pass an application context");
        if (b == null)
        {
            b = Boolean.valueOf(lvd.a(context1.getContentResolver(), "ozexperiment:enable_memory_logging", false));
        }
        if (b.booleanValue())
        {
            ((mrv)olm.a(context, mrv)).a(context, this);
        }
    }

    public final String toString()
    {
        return String.format(Locale.US, "MemoryEvent eventCode = %d.", new Object[] {
            Integer.valueOf(a)
        });
    }

}
