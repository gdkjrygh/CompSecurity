// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.view.View;

// Referenced classes of package com.facebook.orca.dialog:
//            MenuDialogFragment, MenuDialogParams, e, MenuDialogItem

class d
    implements android.view.View.OnClickListener
{

    final MenuDialogItem a;
    final MenuDialogFragment b;

    d(MenuDialogFragment menudialogfragment, MenuDialogItem menudialogitem)
    {
        b = menudialogfragment;
        a = menudialogitem;
        super();
    }

    public void onClick(View view)
    {
        if (MenuDialogFragment.a(b) != null)
        {
            view = MenuDialogFragment.b(b).d();
            if (MenuDialogFragment.a(b).a(a, view))
            {
                b.a();
            }
        }
    }
}
