// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.view.View;
import android.widget.AdapterView;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            AccountPickerActivity, b

final class a
    implements android.widget.istener
{

    final AccountPickerActivity a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        com.microsoft.onlineid.a.a.a().a("SDK", "Pick an account", "via account picker");
        adapterview = (com.microsoft.onlineid.sts.b)com.microsoft.onlineid.internal.ui.AccountPickerActivity.b(a).getItem(i);
        com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, adapterview);
        a.finish();
    }

    (AccountPickerActivity accountpickeractivity)
    {
        a = accountpickeractivity;
        super();
    }
}
