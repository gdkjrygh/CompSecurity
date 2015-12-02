// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.orca.dialog.MenuDialogItem;
import com.facebook.orca.dialog.e;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMessageFragment

class cz
    implements e
{

    final ThreadViewMessageFragment a;

    cz(ThreadViewMessageFragment threadviewmessagefragment)
    {
        a = threadviewmessagefragment;
        super();
    }

    public boolean a(MenuDialogItem menudialogitem, Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            int i = ((Bundle)parcelable).getInt("message_position");
            return ThreadViewMessageFragment.a(a, menudialogitem, Integer.valueOf(i));
        } else
        {
            return false;
        }
    }
}
