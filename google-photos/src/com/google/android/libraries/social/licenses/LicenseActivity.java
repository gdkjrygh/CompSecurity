// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import b;
import ndy;
import nea;
import rv;
import rz;
import ss;
import su;

public final class LicenseActivity extends rz
{

    public LicenseActivity()
    {
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.Gf);
        Object obj = (ndy)getIntent().getParcelableExtra("license");
        e().a().a(((ndy) (obj)).a);
        e().a().a(true);
        e().a().b(true);
        e().a().a(null);
        bundle = (TextView)findViewById(b.Gc);
        obj = b.a(this, ((ndy) (obj)));
        if (obj == null)
        {
            finish();
            return;
        } else
        {
            bundle.setText(((CharSequence) (obj)));
            return;
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollview = (ScrollView)findViewById(b.Gb);
        scrollview.post(new nea(this, bundle.getInt("scroll_pos"), scrollview));
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        ScrollView scrollview = (ScrollView)findViewById(b.Gb);
        TextView textview = (TextView)findViewById(b.Gc);
        int i = textview.getLayout().getLineForVertical(scrollview.getScrollY());
        bundle.putInt("scroll_pos", textview.getLayout().getLineStart(i));
    }
}
