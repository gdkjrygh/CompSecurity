// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class gps
    implements dmx
{

    public List a;
    public Optional b;
    private List c;

    public transient gps(gpr agpr[])
    {
        a = new ArrayList();
        b = Optional.e();
        c = Arrays.asList(agpr);
    }

    public final void a(Intent intent)
    {
        if (!b.b())
        {
            a.add(intent);
        } else
        {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                gpr gpr1 = (gpr)iterator.next();
                if (gpr1.a((Flags)b.c()))
                {
                    gpr1.a();
                    gpr1.a(intent);
                }
            }
        }
    }
}
