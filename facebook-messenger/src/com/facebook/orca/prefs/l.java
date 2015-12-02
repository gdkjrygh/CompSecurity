// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.Context;
import android.preference.DialogPreference;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.prefs:
//            n, m

public class l extends DialogPreference
{

    private final d a;
    private final LayoutInflater b;
    private Boolean c;

    public l(Context context)
    {
        super(context, null);
        setKey(n.x.a());
        context = t.a(context);
        a = (d)context.a(com/facebook/prefs/shared/d);
        b = (LayoutInflater)context.a(android/view/LayoutInflater);
        setSummary(a());
    }

    static Boolean a(l l1, Boolean boolean1)
    {
        l1.c = boolean1;
        return boolean1;
    }

    private String a()
    {
        if (a.a(n.x, true))
        {
            return getContext().getString(o.preference_location_services_enabled_summary);
        } else
        {
            return getContext().getString(o.preference_location_services_disabled_summary);
        }
    }

    private void a(View view)
    {
        int j = 0;
        if (view instanceof ViewGroup)
        {
            for (view = (ViewGroup)view; j < view.getChildCount(); j++)
            {
                a(view.getChildAt(j));
            }

        } else
        if (view instanceof TextView)
        {
            view = (TextView)view;
            view.setSingleLine(false);
            view.setEllipsize(null);
        }
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        a(view);
    }

    protected void onDialogClosed(boolean flag)
    {
        super.onDialogClosed(flag);
        if (flag && c != null)
        {
            e e1 = a.b();
            e1.a(n.x, c.booleanValue());
            e1.a();
            setSummary(a());
            notifyChanged();
        }
    }

    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
    {
        builder.setInverseBackgroundForced(true);
        boolean flag = a.a(n.x, true);
        builder.setTitle(o.preference_location_services_dialog_title);
        View view = b.inflate(k.orca_location_services_dialog_content, null);
        Object obj = (TextView)view.findViewById(i.location_services_text);
        String s = (new StringBuilder()).append(getContext().getString(o.preference_location_services_dialog_description1)).append("\n\n").append(getContext().getString(o.preference_location_services_dialog_description2)).toString();
        ImageSpan imagespan = new ImageSpan(getContext(), h.orca_composer_location_on_normal_cropped);
        SpannableString spannablestring = new SpannableString(s);
        int j = s.indexOf("[[location_icon]]");
        spannablestring.setSpan(imagespan, j, "[[location_icon]]".length() + j, 0);
        ((TextView) (obj)).setText(spannablestring);
        obj = (CheckBox)view.findViewById(i.location_services_enable_checkbox);
        ((CheckBox) (obj)).setChecked(flag);
        ((CheckBox) (obj)).setOnCheckedChangeListener(new m(this));
        builder.setView(view);
    }
}
