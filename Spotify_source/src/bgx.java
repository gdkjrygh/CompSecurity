// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Bundle;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class bgx
{

    public final HashSet a = new HashSet();
    final Bundle b = new Bundle();
    final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    final Bundle e = new Bundle();
    final HashSet f = new HashSet();
    public Date g;
    public int h;
    public Location i;
    public String j;
    int k;

    public bgx()
    {
        h = -1;
        k = -1;
    }

    public final void a(Class class1, Bundle bundle)
    {
        b.putBundle(class1.getName(), bundle);
    }

    public final void a(String s)
    {
        d.add(s);
    }

    public final void a(boolean flag)
    {
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k = l;
    }
}
