// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.pandora.android.fordsync.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import java.io.ByteArrayInputStream;
import p.cx.c;
import p.dd.ac;
import p.dd.e;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, a

public class AndroidLinkActivity extends BaseFragmentActivity
{

    private boolean o;

    public AndroidLinkActivity()
    {
        o = false;
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected void a(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return;
        } else
        {
            abyte0 = Drawable.createFromStream(new ByteArrayInputStream(abyte0), "brandingImage");
            ((ImageView)findViewById(0x7f10008c)).setImageDrawable(abyte0);
            return;
        }
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void onAutomotiveAccessory(e e1)
    {
label0:
        {
            if (e1.a == p.dd.e.a.b)
            {
                c.a().a(this, "ACTION_DISMISS_PANDORA_LINK_ACCESSORY");
                if (!o)
                {
                    break label0;
                }
                c.a().a(this, "AndroidLinkActivity - already dismissing activity");
            }
            return;
        }
        o = true;
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        if (!s.u())
        {
            setTheme(0x7f0d007a);
        }
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView(0x7f040018);
        b.a.i(true);
        g(false);
        setTitle("");
        Z();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        android.view.MenuInflater menuinflater = getMenuInflater();
        if (b.a.x())
        {
            com.pandora.android.activity.a.b(menu, menuinflater);
        }
        com.pandora.android.activity.a.a(menu, menuinflater);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        b.a.i(false);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        if (b.a.x())
        {
            flag = com.pandora.android.activity.a.c(this, menuitem.getItemId());
        }
        if (flag)
        {
            return flag;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPandoraLinkBrandingImageLoaded(ac ac)
    {
        a(c.a().g());
    }

    public void onResume()
    {
        super.onResume();
        if (!b.a.b().C() && !c.a().W())
        {
            finish();
        }
        if (com.pandora.android.fordsync.a.a().G() && c.a().g() == null)
        {
            com.pandora.android.fordsync.a.a().s();
        }
        if (c.a().g() != null)
        {
            a(c.a().g());
        }
    }
}
