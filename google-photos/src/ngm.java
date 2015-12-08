// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class ngm
{

    public String a;
    private boolean b;
    private boolean c;
    private boolean d;

    public ngm()
    {
        b = true;
        c = false;
        d = true;
    }

    public final Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", a);
        bundle.putBoolean("add_account", b);
        bundle.putBoolean("add_account_button_shown", false);
        bundle.putBoolean("auto_select_single_logged_out_account", d);
        bundle.putParcelable("account_filter", null);
        return bundle;
    }
}
