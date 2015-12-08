// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import java.util.List;
import java.util.Map;

final class ipe
    implements Runnable
{

    private Animator a;
    private ipd b;

    ipe(ipd ipd1, Animator animator)
    {
        b = ipd1;
        a = animator;
        super();
    }

    public final void run()
    {
        List list = (List)b.b.b.get(Integer.valueOf(b.a));
        if (list != null)
        {
            list.remove(a);
            if (list.size() == 0)
            {
                b.b.b.remove(Integer.valueOf(b.a));
            }
        }
    }
}
