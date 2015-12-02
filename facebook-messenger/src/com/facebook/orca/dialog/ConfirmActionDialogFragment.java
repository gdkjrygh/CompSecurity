// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.base.b.a;
import com.facebook.k;
import com.facebook.orca.activity.i;
import com.facebook.p;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.dialog:
//            a, b, c

public abstract class ConfirmActionDialogFragment extends DialogFragment
{

    private i Z;

    public ConfirmActionDialogFragment()
    {
    }

    private void a(TextView textview, String s)
    {
        if (s != null)
        {
            textview.setText(s);
            return;
        } else
        {
            textview.setVisibility(8);
            return;
        }
    }

    protected void O()
    {
    }

    protected void P()
    {
    }

    protected void Q()
    {
        a();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (Z == null)
        {
            throw new IllegalStateException("ConfirmActionDialogFragment needs ConfirmActionParams before its view is created");
        }
        bundle = Z.a();
        String s = Z.b();
        String s1 = Z.c();
        String s2 = Z.d();
        if (bundle == null)
        {
            throw new IllegalArgumentException("ConfirmActionDialogFragment requires a title");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("ConfirmActionDialogFragment requires okay text");
        } else
        {
            layoutinflater = layoutinflater.inflate(k.orca_confirm_action, viewgroup, false);
            viewgroup = (TextView)layoutinflater.findViewById(com.facebook.i.confirm_title);
            TextView textview = (TextView)layoutinflater.findViewById(com.facebook.i.confirm_message);
            Button button = (Button)layoutinflater.findViewById(com.facebook.i.confirm_okay_button);
            Button button1 = (Button)layoutinflater.findViewById(com.facebook.i.confirm_neutral_button);
            Button button2 = (Button)layoutinflater.findViewById(com.facebook.i.confirm_cancel_button);
            viewgroup.setText(bundle);
            a(textview, s);
            button.setText(s1);
            a(((TextView) (button1)), s2);
            button.setOnClickListener(new com.facebook.orca.dialog.a(this));
            button1.setOnClickListener(new b(this));
            button2.setOnClickListener(new c(this));
            return layoutinflater;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a(2, p.Theme_OrcaDialog);
    }

    protected void a(i j)
    {
        Z = j;
    }

    public Dialog c(Bundle bundle)
    {
        Preconditions.checkNotNull(Z);
        String s = Z.a();
        if (s == null)
        {
            throw new IllegalArgumentException("ConfirmActionDialogFragment requires a title");
        } else
        {
            bundle = super.c(bundle);
            bundle.setCanceledOnTouchOutside(true);
            bundle.setTitle(s);
            com.facebook.base.b.a.a(bundle);
            return bundle;
        }
    }
}
