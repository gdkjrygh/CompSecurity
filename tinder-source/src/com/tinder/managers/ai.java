// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.SharedPreferences;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.managers:
//            ae, ManagerApp

public final class ai
{

    public boolean a;
    public int b;
    public int c;
    private ae d;

    public ai(ae ae1)
    {
        d = ae1;
    }

    public final void a()
    {
        boolean flag1 = false;
        b = ae.a.getInt("KEY_VERSION_CODE", 0);
        c = o.a(ManagerApp.c());
        boolean flag = flag1;
        if (c > b)
        {
            flag = flag1;
            if (b != 0)
            {
                flag = true;
            }
        }
        a = flag;
        int i = c;
        ae.b.putInt("KEY_VERSION_CODE", i).commit();
    }
}
