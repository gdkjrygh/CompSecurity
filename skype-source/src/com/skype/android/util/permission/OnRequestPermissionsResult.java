// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package com.skype.android.util.permission:
//            Permission

public class OnRequestPermissionsResult
{

    private final int a;
    private Set b;
    private Set c;

    public OnRequestPermissionsResult(int i, Set set, Set set1)
    {
        a = i;
        b = set;
        c = set1;
    }

    public OnRequestPermissionsResult(int i, String as[], int ai[])
    {
        a = i;
        b = EnumSet.noneOf(com/skype/android/util/permission/Permission);
        c = EnumSet.noneOf(com/skype/android/util/permission/Permission);
        i = 0;
        while (i < as.length) 
        {
            Permission permission = Permission.a(as[i]);
            boolean flag;
            if (ai[i] == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                b.add(permission);
            } else
            {
                c.add(permission);
            }
            i++;
        }
    }

    final Set a()
    {
        return c;
    }

    public final void a(OnRequestPermissionsResult onrequestpermissionsresult)
    {
        b.addAll(onrequestpermissionsresult.b);
        c.addAll(onrequestpermissionsresult.c);
    }

    public final int b()
    {
        return a;
    }
}
