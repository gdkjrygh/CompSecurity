// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton

protected class ri
    implements android.view.eClickListener, ri
{

    private final rj ri;
    final PlusOneButton rj;

    public void onClick(View view)
    {
        view = (Intent)PlusOneButton.a(rj).getTag();
        if (ri != null)
        {
            ri.neClick(view);
            return;
        } else
        {
            onPlusOneClick(view);
            return;
        }
    }

    public void onPlusOneClick(Intent intent)
    {
        android.content.Context context = rj.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(rj));
        }
    }

    public (PlusOneButton plusonebutton,  )
    {
        rj = plusonebutton;
        super();
        ri = ;
    }
}
