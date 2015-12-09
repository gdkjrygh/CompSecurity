// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Button;
import android.widget.ProgressBar;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final class dye
    implements dyp
{

    final dyc a;
    private final boolean b;

    dye(dyc dyc1, boolean flag)
    {
        a = dyc1;
        super();
        b = flag;
    }

    public final void a()
    {
        while (!dyc.g(a) || dyc.k(a).getVisibility() != 0) 
        {
            return;
        }
        dyc.a(a, false);
        dyc.u(a);
    }

    public final void a(ArrayList arraylist, dyw dyw)
    {
        if (dyc.g(a))
        {
            dyc.a(dyc.e(a));
            dyc.a(dyc.n(a));
            dyc.a(a, ImmutableList.a(arraylist));
            dyc.a(a, arraylist);
            dyc.a(a, false);
            if (b)
            {
                dyc.j(a).setEnabled(false);
                arraylist = ((giq)dmz.a(giq)).a(a.k());
                int i = arraylist.a(dyc.F(), 0x80000000);
                if (i != 0x80000000)
                {
                    dyc.a(a, "Test it!");
                    dyw = new HashMap();
                    String s = arraylist.a(dyc.M(), null);
                    String s1 = arraylist.a(dyc.L(), null);
                    String s2 = arraylist.a(dyc.K(), null);
                    String s3 = arraylist.a(dyc.I(), null);
                    if (s != null)
                    {
                        dyw.put("email", s);
                    }
                    if (s1 != null)
                    {
                        dyw.put("username", s1);
                    }
                    if (s2 != null)
                    {
                        dyw.put("birthdate", s2);
                    }
                    if (s3 != null)
                    {
                        dyw.put("gender", s3);
                    }
                    arraylist.b().a(dyc.F()).a(dyc.M()).a(dyc.L()).a(dyc.K()).a(dyc.I()).a();
                    dyc.s(a).a(i, dyw);
                    return;
                } else
                {
                    dyc.a(a, dyw, new dyk() {

                        private dye a;

                        public final void a()
                        {
                            dyc.t(a.a);
                        }

                        public final void b()
                        {
                            dyc.a(a.a, false);
                        }

                        public final void c()
                        {
                            dyc.a(a.a, false);
                        }

            
            {
                a = dye.this;
                super();
            }
                    });
                    return;
                }
            }
        }
    }

    public final void a(ArrayList arraylist, Map map)
    {
        if (!dyc.g(a))
        {
            return;
        } else
        {
            dyc.a(a, dyc.e(a), (CharSequence)map.get("email"));
            dyc.a(a, dyc.n(a), (CharSequence)map.get("username"));
            dyc.a(a, ImmutableList.a(arraylist));
            dyc.a(a, arraylist);
            dyc.a(a, false);
            return;
        }
    }
}
