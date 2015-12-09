// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.android.slyce.crop:
//            w

public class u extends Activity
{

    private final ArrayList a = new ArrayList();

    public u()
    {
    }

    public void a(w w1)
    {
        if (a.contains(w1))
        {
            return;
        } else
        {
            a.add(w1);
            return;
        }
    }

    public void b(w w1)
    {
        a.remove(w1);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        for (bundle = a.iterator(); bundle.hasNext(); ((w)bundle.next()).a(this)) { }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((w)iterator.next()).b(this)) { }
    }

    protected void onStart()
    {
        super.onStart();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((w)iterator.next()).c(this)) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((w)iterator.next()).d(this)) { }
    }
}
