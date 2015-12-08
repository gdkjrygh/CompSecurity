// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton

protected class abC
    implements android.view.eClickListener, abC
{

    private final abD abC;
    final PlusOneButton abD;

    public void onClick(View view)
    {
        view = (Intent)PlusOneButton.a(abD).getTag();
        if (abC != null)
        {
            abC.neClick(view);
            return;
        } else
        {
            onPlusOneClick(view);
            return;
        }
    }

    public void onPlusOneClick(Intent intent)
    {
        android.content.Context context = abD.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(abD));
        }
    }

    public (PlusOneButton plusonebutton,  )
    {
        abD = plusonebutton;
        super();
        abC = ;
    }
}
