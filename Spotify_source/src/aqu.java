// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.internal.LikeActionController;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class aqu
    implements Runnable
{

    private static ArrayList a = new ArrayList();
    private String b;
    private boolean c;

    public aqu(String s, boolean flag)
    {
        b = s;
        c = flag;
    }

    public final void run()
    {
        if (b != null)
        {
            a.remove(b);
            a.add(0, b);
        }
        if (c && a.size() >= 128)
        {
            String s;
            for (; 64 < a.size(); LikeActionController.e().remove(s))
            {
                s = (String)a.remove(a.size() - 1);
            }

        }
    }

}
