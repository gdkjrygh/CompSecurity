// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.qihoo.security.app.BaseSimpleActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.dialog:
//            d, DialogButtons

public abstract class AbsDialogListActivity extends BaseSimpleActivity
    implements com.qihoo.security.dialog.d
{

    protected final d a = com.qihoo.security.locale.d.a();
    protected Context b;
    private DialogButtons c;
    private LocaleTextView d;
    private LocaleTextView e;
    private ImageView f;
    private ListView g;
    private BaseAdapter h;
    private View i;

    public AbsDialogListActivity()
    {
        b = null;
        c = null;
        e = null;
        f = null;
        g = null;
    }

    private void b()
    {
        i = findViewById(0x7f0b017d);
        c = (DialogButtons)findViewById(0x7f0b0100);
        d = (LocaleTextView)findViewById(0x7f0b00fd);
        e = (LocaleTextView)findViewById(0x7f0b00fe);
        f = (ImageView)findViewById(0x7f0b00fc);
        g = (ListView)findViewById(0x7f0b0146);
        android.view.ViewGroup.LayoutParams layoutparams = i.getLayoutParams();
        layoutparams.width = com.qihoo360.mobilesafe.b.a.a(b) - com.qihoo360.mobilesafe.b.a.a(b, 40F);
        i.setLayoutParams(layoutparams);
    }

    protected int a()
    {
        return 0x7f030070;
    }

    public void a(int j)
    {
        a(b.getResources().getDrawable(j));
    }

    public void a(Drawable drawable)
    {
        if (drawable == null && d.getVisibility() == 8)
        {
            f.setVisibility(8);
            return;
        } else
        {
            f.setImageDrawable(drawable);
            f.setVisibility(0);
            return;
        }
    }

    public void a(BaseAdapter baseadapter, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        h = baseadapter;
        g.setAdapter(h);
        g.setChoiceMode(1);
        g.setOnItemClickListener(onitemclicklistener);
        if (h == null)
        {
            g.setVisibility(8);
            return;
        } else
        {
            g.setVisibility(0);
            return;
        }
    }

    public LocaleButton[] getShownButtons()
    {
        return c.getShownButtons();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = getApplicationContext();
        setContentView(a());
        b();
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        c.setButtonOnClickListener(aonclicklistener);
    }

    public transient void setButtonText(int ai[])
    {
        c.setButtonText(ai);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        c.setButtonText(acharsequence);
    }

    public void setDialogMessage(int j)
    {
        setDialogMessage(((CharSequence) (a.a(j))));
    }

    public void setDialogMessage(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence))
        {
            e.setVisibility(8);
            return;
        } else
        {
            e.setVisibility(0);
            e.setLocalText(charsequence);
            return;
        }
    }

    public void setDialogTitle(int j)
    {
        setDialogTitle(((CharSequence) (a.a(j))));
    }

    public void setDialogTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence) && f.getVisibility() == 8)
        {
            d.setVisibility(8);
            return;
        } else
        {
            d.setLocalText(charsequence);
            d.setVisibility(0);
            return;
        }
    }
}
