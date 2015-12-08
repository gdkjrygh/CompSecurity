// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.plus.PlusOneButton;

public final class cpk
    implements android.view.View.OnClickListener, cpl
{

    private final cpl a;
    private PlusOneButton b;

    public cpk(PlusOneButton plusonebutton, cpl cpl1)
    {
        b = plusonebutton;
        super();
        a = cpl1;
    }

    public final void a(Intent intent)
    {
        android.content.Context context = b.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(b));
        }
    }

    public final void onClick(View view)
    {
        view = (Intent)PlusOneButton.a(b).getTag();
        if (a != null)
        {
            a.a(view);
            return;
        } else
        {
            a(view);
            return;
        }
    }
}
