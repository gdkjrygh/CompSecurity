// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.Locale;

// Referenced classes of package com.arist.model.skin:
//            k, ColorPickerView, ColorPickerPanelView, h, 
//            ColorPickerPreference, i

public final class g extends Dialog
    implements android.view.View.OnClickListener, k
{

    private ColorPickerView a;
    private ColorPickerPanelView b;
    private ColorPickerPanelView c;
    private EditText d;
    private boolean e;
    private ColorStateList f;
    private i g;

    public g(Context context, int j)
    {
        super(context, 0x1030075);
        e = false;
        getWindow().setFormat(1);
        context = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030011, null);
        setContentView(context);
        a = (ColorPickerView)context.findViewById(0x7f06005c);
        b = (ColorPickerPanelView)context.findViewById(0x7f06005f);
        c = (ColorPickerPanelView)context.findViewById(0x7f060060);
        d = (EditText)context.findViewById(0x7f06005e);
        d.setInputType(0x80000);
        f = d.getTextColors();
        d.setOnEditorActionListener(new h(this));
        ((LinearLayout)b.getParent()).setPadding(Math.round(a.b()), 0, Math.round(a.b()), 0);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        a.a(this);
        b.a(j);
        a.a(j);
    }

    static EditText a(g g1)
    {
        return g1.d;
    }

    static ColorPickerView b(g g1)
    {
        return g1.a;
    }

    private void b(int j)
    {
        if (a.d())
        {
            d.setText(ColorPickerPreference.b(j).toUpperCase(Locale.getDefault()));
        } else
        {
            d.setText(ColorPickerPreference.c(j).toUpperCase(Locale.getDefault()));
        }
        d.setTextColor(f);
    }

    static ColorStateList c(g g1)
    {
        return g1.f;
    }

    private void c()
    {
        if (a.d())
        {
            d.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(9)
            });
            return;
        } else
        {
            d.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(7)
            });
            return;
        }
    }

    public final void a()
    {
        e = true;
        d.setVisibility(0);
        c();
        b(a.a());
    }

    public final void a(int j)
    {
        c.a(j);
        if (e)
        {
            b(j);
        }
    }

    public final void a(i j)
    {
        g = j;
    }

    public final void b()
    {
        a.c();
        if (e)
        {
            c();
            b(a.a());
        }
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f060060 && g != null)
        {
            g.a(c.a());
        }
        dismiss();
    }

    public final void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        b.a(bundle.getInt("old_color"));
        a.a(bundle.getInt("new_color"));
    }

    public final Bundle onSaveInstanceState()
    {
        Bundle bundle = super.onSaveInstanceState();
        bundle.putInt("old_color", b.a());
        bundle.putInt("new_color", c.a());
        return bundle;
    }
}
