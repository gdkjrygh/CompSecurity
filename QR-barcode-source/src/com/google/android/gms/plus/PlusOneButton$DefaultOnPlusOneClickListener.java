// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton

protected class alp
    implements android.view.eClickListener, alp
{

    private final alq alp;
    final PlusOneButton alq;

    public void onClick(View view)
    {
        view = (Intent)PlusOneButton.a(alq).getTag();
        if (alp != null)
        {
            alp.neClick(view);
            return;
        } else
        {
            onPlusOneClick(view);
            return;
        }
    }

    public void onPlusOneClick(Intent intent)
    {
        android.content.Context context = alq.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(alq));
        }
    }

    public (PlusOneButton plusonebutton,  )
    {
        alq = plusonebutton;
        super();
        alp = ;
    }
}
