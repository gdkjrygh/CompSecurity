// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton

protected class TX
    implements android.view.eClickListener, TX
{

    private final TY TX;
    final PlusOneButton TY;

    public void onClick(View view)
    {
        view = (Intent)PlusOneButton.a(TY).getTag();
        if (TX != null)
        {
            TX.neClick(view);
            return;
        } else
        {
            onPlusOneClick(view);
            return;
        }
    }

    public void onPlusOneClick(Intent intent)
    {
        android.content.Context context = TY.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(TY));
        }
    }

    public (PlusOneButton plusonebutton,  )
    {
        TY = plusonebutton;
        super();
        TX = ;
    }
}
