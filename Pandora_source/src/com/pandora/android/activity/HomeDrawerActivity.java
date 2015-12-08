// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.RadioGroup;

// Referenced classes of package com.pandora.android.activity:
//            BaseHomeActivity, a

public class HomeDrawerActivity extends BaseHomeActivity
{

    public HomeDrawerActivity()
    {
    }

    public void ah()
    {
        ((RadioGroup)findViewById(0x7f100194)).setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            final HomeDrawerActivity a;

            public void onCheckedChanged(RadioGroup radiogroup, int i)
            {
                radiogroup = null;
                i;
                JVM INSTR tableswitch 2131755413 2131755416: default 32
            //                           2131755413 41
            //                           2131755414 48
            //                           2131755415 55
            //                           2131755416 62;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                a.a(radiogroup);
                return;
_L2:
                radiogroup = BaseHomeActivity.a.a;
                continue; /* Loop/switch isn't completed */
_L3:
                radiogroup = BaseHomeActivity.a.b;
                continue; /* Loop/switch isn't completed */
_L4:
                radiogroup = BaseHomeActivity.a.c;
                continue; /* Loop/switch isn't completed */
_L5:
                radiogroup = BaseHomeActivity.a.d;
                if (true) goto _L1; else goto _L6
_L6:
            }

            
            {
                a = HomeDrawerActivity.this;
                super();
            }
        });
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04005d);
        getWindow().setBackgroundDrawable(null);
        ah();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuinflater = getMenuInflater();
        menuinflater.inflate(0x7f12000a, menu);
        menuinflater.inflate(0x7f120007, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 38
    //                   2131755023: 44;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        onBackPressed();
        return true;
_L3:
        a.a(null);
        if (true) goto _L1; else goto _L4
_L4:
    }
}
