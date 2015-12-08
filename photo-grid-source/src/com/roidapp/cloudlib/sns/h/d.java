// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.widget.EditText;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            a

final class d
    implements android.widget.PopupWindow.OnDismissListener
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public final void onDismiss()
    {
        com.roidapp.cloudlib.sns.h.a.e(a).setFocusableInTouchMode(true);
    }
}
