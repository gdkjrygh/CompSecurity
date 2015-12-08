// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Application;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            BaseShareActivity, o

public class l extends DialogFragment
    implements android.view.View.OnClickListener
{

    private String a;
    private CheckBox b;

    public l()
    {
    }

    public void onClick(View view)
    {
        BaseShareActivity baseshareactivity = (BaseShareActivity)getActivity();
        if (baseshareactivity != null && !baseshareactivity.isFinishing())
        {
            String s;
            if (b != null)
            {
                view = a;
                if (b.isChecked())
                {
                    view = (new StringBuilder()).append(view).append("#PhotoGrid").toString();
                }
                Object obj;
                if (n.d())
                {
                    ((ClipboardManager)aj.a().getSystemService("clipboard")).setText(view);
                } else
                {
                    ((android.text.ClipboardManager)aj.a().getSystemService("clipboard")).setText(view);
                }
            }
            if (getArguments() != null)
            {
                s = getArguments().getString("path");
                view = getArguments().getString("mime");
            } else
            {
                view = null;
                s = null;
            }
            if (s == null)
            {
                s = baseshareactivity.f;
            }
            obj = view;
            if (view == null)
            {
                obj = baseshareactivity.h;
            }
            if (b != null && b.isChecked())
            {
                view = (new StringBuilder()).append(a).append("#PhotoGrid").toString();
            } else
            {
                view = a;
            }
            BaseShareActivity.a(baseshareactivity, s, ((String) (obj)), view);
        }
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = BaseShareActivity.b((BaseShareActivity)getActivity()).e();
        if (a == null)
        {
            a = "";
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (getActivity() == null || getActivity().isFinishing())
        {
            setShowsDialog(false);
            return super.onCreateDialog(bundle);
        }
        bundle = LayoutInflater.from(getActivity()).inflate(0x7f030025, null);
        b = (CheckBox)bundle.findViewById(0x7f0d00d9);
        TextView textview = (TextView)bundle.findViewById(0x7f0d00d8);
        if (a.toLowerCase(Locale.ENGLISH).contains("#photogrid"))
        {
            b.setVisibility(8);
        } else
        {
            b.setChecked(true);
        }
        textview.setText(a);
        bundle.findViewById(0x7f0d00da).setOnClickListener(this);
        return (new android.app.AlertDialog.Builder(getActivity())).setView(bundle).create();
    }
}
