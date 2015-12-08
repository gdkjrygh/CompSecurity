// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton

protected class anC
    implements android.view.eClickListener, anC
{

    private final anD anC;
    final PlusOneButton anD;

    public void onClick(View view)
    {
        view = (Intent)PlusOneButton.a(anD).getTag();
        if (anC != null)
        {
            anC.neClick(view);
            return;
        } else
        {
            onPlusOneClick(view);
            return;
        }
    }

    public void onPlusOneClick(Intent intent)
    {
        android.content.Context context = anD.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(anD));
        }
    }

    public (PlusOneButton plusonebutton,  )
    {
        anD = plusonebutton;
        super();
        anC = ;
    }
}
