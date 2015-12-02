// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.camera:
//            z

public class x extends Activity
{

    private final ArrayList a = new ArrayList();

    public x()
    {
    }

    public void a(z z1)
    {
        if (a.contains(z1))
        {
            return;
        } else
        {
            a.add(z1);
            return;
        }
    }

    public void b(z z1)
    {
        a.remove(z1);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        for (bundle = a.iterator(); bundle.hasNext(); ((z)bundle.next()).a(this)) { }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((z)iterator.next()).b(this)) { }
    }

    protected void onStart()
    {
        super.onStart();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((z)iterator.next()).c(this)) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((z)iterator.next()).d(this)) { }
    }
}
