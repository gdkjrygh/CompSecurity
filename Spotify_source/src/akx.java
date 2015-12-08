// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.answers.SessionEvent;
import java.util.Set;

public final class akx
    implements akt
{

    private static Set b = new com.crashlytics.android.answers.SamplingEventFilter._cls1();
    private int a;

    public akx(int i)
    {
        a = i;
    }

    public final boolean a(SessionEvent sessionevent)
    {
        boolean flag;
        boolean flag1;
        if (b.contains(sessionevent.c) && sessionevent.a.g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Math.abs(sessionevent.a.c.hashCode() % a) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

}
