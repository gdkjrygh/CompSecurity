// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.e.d;

// Referenced classes of package com.google.android.apps.translate.pref:
//            y, v, w, x

public class SubPrefsFragment extends PreferenceFragment
{

    private v a;

    public SubPrefsFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = new y(this, getArguments().getInt("settings"), getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (a.a)
        {
            layoutinflater = layoutinflater.inflate(o.pref_about, viewgroup, false);
            bundle = a;
            viewgroup = getActivity();
            ((TextView)layoutinflater.findViewById(m.tos_link)).setMovementMethod(LinkMovementMethod.getInstance());
            ((TextView)layoutinflater.findViewById(m.privacy_link)).setMovementMethod(LinkMovementMethod.getInstance());
            Object obj = (TextView)layoutinflater.findViewById(m.feedback_link);
            Object obj1 = String.valueOf(((TextView) (obj)).getText());
            ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder(String.valueOf(obj1).length() + 16)).append("<a href=\"#\">").append(((String) (obj1))).append("</a>").toString()));
            ((TextView) (obj)).setOnClickListener(new w(bundle, viewgroup));
            obj = (TextView)layoutinflater.findViewById(m.osl_link);
            obj1 = String.valueOf(((TextView) (obj)).getText());
            ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder(String.valueOf(obj1).length() + 16)).append("<a href=\"#\">").append(((String) (obj1))).append("</a>").toString()));
            ((TextView) (obj)).setOnClickListener(new x(bundle, viewgroup));
            obj1 = d.d();
            bundle = (TextView)layoutinflater.findViewById(m.txt_version);
            int i = r.label_version_info;
            obj = (String)((Pair) (obj1)).first;
            obj1 = String.valueOf(((Pair) (obj1)).second);
            bundle.setText(viewgroup.getString(i, new Object[] {
                (new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(obj1).length())).append(((String) (obj))).append("-").append(((String) (obj1))).toString()
            }));
            return layoutinflater;
        } else
        {
            return super.onCreateView(layoutinflater, viewgroup, bundle);
        }
    }
}
