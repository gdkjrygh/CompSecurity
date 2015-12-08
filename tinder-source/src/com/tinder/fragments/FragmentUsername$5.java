// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.widget.Toast;
import com.tinder.managers.ManagerApp;

// Referenced classes of package com.tinder.fragments:
//            FragmentUsername

final class a
    implements Runnable
{

    final String a;
    final FragmentUsername b;

    public final void run()
    {
        Toast.makeText(ManagerApp.c(), a, 0).show();
    }

    (FragmentUsername fragmentusername, String s)
    {
        b = fragmentusername;
        a = s;
        super();
    }
}
