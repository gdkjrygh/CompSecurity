// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Collection;
import java.util.Iterator;

public final class gdm extends gcd
{

    public gdm()
    {
    }

    public final void a()
    {
        Flags flags = FeatureService.a();
        alu alu1 = akk.d().a;
        boolean flag;
        if (flags != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        alu1.a("flags-loaded", flag);
        if (flags != null)
        {
            new fys();
            Iterator iterator = fys.d().iterator();
            while (iterator.hasNext()) 
            {
                Object obj1 = (fyu)iterator.next();
                alu alu2 = akk.d().a;
                String s = (new StringBuilder("flag-")).append(((fyu) (obj1)).b).toString();
                Object obj = flags.a(((fyu) (obj1)));
                obj1 = flags.b(((fyu) (obj1)));
                if (!obj.equals(obj1))
                {
                    obj = (new StringBuilder()).append(obj).append(" (overridden, provided: ").append(obj1).append(")").toString();
                } else
                {
                    obj = obj.toString();
                }
                alu2.a(s, ((String) (obj)));
            }
        }
    }
}
