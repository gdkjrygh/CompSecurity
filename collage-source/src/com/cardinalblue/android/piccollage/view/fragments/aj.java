// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.androidquery.a;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.j;
import com.squareup.a.b;
import java.io.File;

public class aj extends DialogFragment
{

    private EditText a;

    public aj()
    {
    }

    static EditText a(aj aj1)
    {
        return aj1.a;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        com.cardinalblue.android.piccollage.events.j.a a1 = com.cardinalblue.android.piccollage.events.j.a.values()[getArguments().getInt("key_target", 0)];
        String s = getArguments().getString("key_file_path", "");
        android.app.AlertDialog.Builder builder;
        View view;
        a a2;
        if (bundle == null)
        {
            bundle = getArguments().getString("key_caption", "");
        } else
        {
            bundle = bundle.getString("key_caption", "");
        }
        if (TextUtils.isEmpty(s))
        {
            dismiss();
        }
        builder = new android.app.AlertDialog.Builder(getActivity());
        view = LayoutInflater.from(getActivity()).inflate(0x7f0300a0, null);
        a2 = new a(view);
        ((a)a2.a(0x7f1001a6)).a(new android.view.View.OnClickListener(a1) {

            final com.cardinalblue.android.piccollage.events.j.a a;
            final aj b;

            public void onClick(View view1)
            {
                d.a().c(new j(com.cardinalblue.android.piccollage.view.fragments.aj.a(b).getText().toString(), a));
            }

            
            {
                b = aj.this;
                a = a1;
                super();
            }
        });
        a = (EditText)view.findViewById(0x7f1001a4);
        a.setText(bundle);
        ((a)a2.a(0x7f1001a3)).c(a1.a());
        ((a)a2.a(0x7f1001a5)).a(new File(s), 0);
        return builder.setView(view).setCancelable(true).create();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("key_caption", a.getText().toString());
    }
}
