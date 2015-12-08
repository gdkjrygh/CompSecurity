// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import com.pandora.android.provider.b;
import com.pandora.android.util.Switch;
import com.pandora.android.view.RoundLinearLayout;
import com.pandora.radio.data.o;
import p.cw.c;

// Referenced classes of package com.pandora.android.daydream:
//            DaydreamService

public class SettingsActivity extends Activity
{

    private Switch a;
    private Switch b;
    private o c;
    private android.widget.CompoundButton.OnCheckedChangeListener d;
    private android.widget.CompoundButton.OnCheckedChangeListener e;

    public SettingsActivity()
    {
        d = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                SettingsActivity.a(a).c(flag);
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        };
        e = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SettingsActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                SettingsActivity.a(a).d(flag);
            }

            
            {
                a = SettingsActivity.this;
                super();
            }
        };
    }

    static o a(SettingsActivity settingsactivity)
    {
        return settingsactivity.c;
    }

    private void b()
    {
        if (a != null)
        {
            a.setChecked(c.r());
        }
        if (b != null)
        {
            b.setChecked(c.s());
        }
    }

    protected void a()
    {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setLogo(0x7f030000);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04004b);
        a();
        bundle = b.a.b();
        if (bundle != null)
        {
            c = bundle.j();
        } else
        {
            finish();
        }
        if (DaydreamService.a())
        {
            a = (Switch)findViewById(0x7f10014f);
            a.setOnCheckedChangeListener(d);
        } else
        {
            ((RoundLinearLayout)findViewById(0x7f10014e)).setVisibility(8);
            ((RoundLinearLayout)findViewById(0x7f100151)).setRoundedCorners(15);
            findViewById(0x7f100150).setVisibility(8);
        }
        b = (Switch)findViewById(0x7f100152);
        b.setOnCheckedChangeListener(e);
        b();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }
}
