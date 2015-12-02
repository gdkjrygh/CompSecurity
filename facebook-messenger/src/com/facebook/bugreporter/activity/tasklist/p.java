// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.view.View;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            ViewTaskActivity

class p
    implements android.view.View.OnClickListener
{

    final ViewTaskActivity a;

    p(ViewTaskActivity viewtaskactivity)
    {
        a = viewtaskactivity;
        super();
    }

    public void onClick(View view)
    {
        a.setResult(0);
        a.finish();
    }
}
