// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.creation;

import android.content.DialogInterface;
import com.facebook.orca.activity.d;

// Referenced classes of package com.facebook.orca.creation:
//            CreateThreadActivity

class g
    implements android.content.DialogInterface.OnClickListener
{

    final d a;
    final CreateThreadActivity b;

    g(CreateThreadActivity createthreadactivity, d d1)
    {
        b = createthreadactivity;
        a = d1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.a(false);
    }
}
