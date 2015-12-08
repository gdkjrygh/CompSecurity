// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import b;
import neb;
import rz;

public final class LicenseMenuActivity extends rz
{

    public LicenseMenuActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.Gg);
        bundle = b.q(this);
        bundle = new ArrayAdapter(this, b.Ge, b.Ga, bundle);
        ListView listview = (ListView)findViewById(b.Gd);
        listview.setAdapter(bundle);
        listview.setOnItemClickListener(new neb(this));
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
}
