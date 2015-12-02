// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.dialog:
//            d, DialogButtons

public class j extends Dialog
    implements com.qihoo.security.dialog.d
{

    private DialogButtons a;
    private LocaleTextView b;
    private LocaleTextView c;
    private ImageView d;
    private final d e = com.qihoo.security.locale.d.a();
    private ListView f;
    private BaseAdapter g;
    private Context h;
    private View i;

    public j(Context context)
    {
        super(context, 0x7f0d00f5);
        a = null;
        c = null;
        d = null;
        f = null;
        h = null;
        h = context;
        setContentView(0x7f030070);
        a();
    }

    private void a()
    {
        i = findViewById(0x7f0b017d);
        a = (DialogButtons)findViewById(0x7f0b0100);
        b = (LocaleTextView)findViewById(0x7f0b00fd);
        c = (LocaleTextView)findViewById(0x7f0b00fe);
        d = (ImageView)findViewById(0x7f0b00fc);
        f = (ListView)findViewById(0x7f0b0146);
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)i.getLayoutParams();
        layoutparams.width = com.qihoo360.mobilesafe.b.a.a(getContext()) - com.qihoo360.mobilesafe.b.a.a(getContext(), 40F);
        i.setLayoutParams(layoutparams);
    }

    protected BaseAdapter a(String as[])
    {
        return new ArrayAdapter(h, 0x7f030091, as);
    }

    public void a(String as[], int k, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        g = a(as);
        f.setAdapter(g);
        f.setChoiceMode(1);
        if (onitemclicklistener != null)
        {
            f.setOnItemClickListener(onitemclicklistener);
            f.setVisibility(8);
        }
        if (k >= 0)
        {
            f.setItemChecked(k, true);
            f.setVisibility(0);
        }
    }

    public void a(String as[], android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        if (as == null || as.length == 0)
        {
            f.setVisibility(8);
            return;
        } else
        {
            f.setVisibility(0);
            g = new ArrayAdapter(h, 0x7f0300a2, 0x7f0b0219, as);
            f.setAdapter(g);
            f.setOnItemClickListener(onitemclicklistener);
            return;
        }
    }

    public LocaleButton[] getShownButtons()
    {
        return a.getShownButtons();
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        a.setButtonOnClickListener(aonclicklistener);
    }

    public transient void setButtonText(int ai[])
    {
        a.setButtonText(ai);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        a.setButtonText(acharsequence);
    }

    public void setDialogMessage(int k)
    {
        setDialogMessage(((CharSequence) (e.a(k))));
    }

    public void setDialogMessage(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence))
        {
            c.setVisibility(8);
            return;
        } else
        {
            c.setVisibility(0);
            c.setLocalText(charsequence);
            return;
        }
    }

    public void setDialogTitle(int k)
    {
        setDialogTitle(((CharSequence) (e.a(k))));
    }

    public void setDialogTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence) && d.getVisibility() == 8)
        {
            b.setVisibility(8);
            return;
        } else
        {
            b.setLocalText(charsequence);
            b.setVisibility(0);
            return;
        }
    }
}
