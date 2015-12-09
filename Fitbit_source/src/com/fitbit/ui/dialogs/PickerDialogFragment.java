// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;

public abstract class PickerDialogFragment extends DialogFragment
{

    protected TextView a;
    protected ViewStub b;

    public PickerDialogFragment()
    {
    }

    protected abstract void a();

    protected final void a(int i)
    {
        if (b != null)
        {
            b.setLayoutResource(i);
            a(b.inflate());
        }
    }

    protected void a(View view)
    {
    }

    protected final void a(CharSequence charsequence)
    {
        if (a != null)
        {
            a.setText(charsequence);
        }
    }

    protected abstract void b();

    protected final void b(int i)
    {
        if (a != null)
        {
            a.setText(i);
        }
    }

    public int d()
    {
        return 0x7f0400c0;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f0c01da);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.getWindow().setBackgroundDrawableResource(0x7f0f0167);
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(d(), viewgroup, false);
        a = (TextView)layoutinflater.findViewById(0x7f11011f);
        b = (ViewStub)layoutinflater.findViewById(0x7f11006c);
        viewgroup = layoutinflater.findViewById(0x7f11005e);
    /* block-local class not found */
    class a {}

        if (viewgroup != null)
        {
            viewgroup.setOnClickListener(new a(this));
        }
        a();
        return layoutinflater;
    }
}
