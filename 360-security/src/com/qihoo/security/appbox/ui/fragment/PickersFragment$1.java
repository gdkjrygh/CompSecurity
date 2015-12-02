// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.fragment;

import android.widget.Toast;
import com.qihoo.security.appbox.b.c;
import com.qihoo.security.appbox.core.AppBoxResponse;

// Referenced classes of package com.qihoo.security.appbox.ui.fragment:
//            PickersFragment

class a
    implements c
{

    final PickersFragment a;

    public void a()
    {
    }

    public void a(int i, String s)
    {
        Toast.makeText(a.r, "message", 0).show();
    }

    public void a(AppBoxResponse appboxresponse)
    {
        while (a.getActivity() == null || appboxresponse.faceBookItems == null) 
        {
            return;
        }
        PickersFragment.a(a, appboxresponse.faceBookItems);
    }

    public void b()
    {
    }

    (PickersFragment pickersfragment)
    {
        a = pickersfragment;
        super();
    }
}
