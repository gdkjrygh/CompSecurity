// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.DialogInterface;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.r;

// Referenced classes of package com.fitbit.home.ui:
//            HomeActivity

protected static final class  extends SimpleConfirmDialogFragment
{

    public static  a(String s)
    {
          = new <init>();
        .setArguments(r.a(0x7f0801c0, s));
        return ;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onClick(dialoginterface, -3);
    }

    public ()
    {
        super(0x7f08048c, 0x7f08048a, 0x7f08048b);
    }
}
