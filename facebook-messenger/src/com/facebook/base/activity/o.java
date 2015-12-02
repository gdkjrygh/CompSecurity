// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.activity;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.base.h;
import com.facebook.base.i;
import com.facebook.inject.t;
import com.google.android.maps.MapActivity;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.base.activity:
//            h, f, b

public abstract class o extends MapActivity
    implements com.facebook.base.activity.h, h
{

    private final i a = new i();
    private Set b;
    private String c;

    public o()
    {
    }

    protected View a(int j)
    {
        return findViewById(j);
    }

    public Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = a.a(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    protected void a(Bundle bundle)
    {
    }

    public void a(Object obj, Object obj1)
    {
        a.a(obj, obj1);
    }

    public boolean a(Exception exception)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).a(this, exception))
            {
                return true;
            }
        }

        return false;
    }

    public t b()
    {
        return t.a(this);
    }

    protected void b(Bundle bundle)
    {
    }

    public void finish()
    {
        super.finish();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).i(this)) { }
    }

    public String h()
    {
        return c;
    }

    protected void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, j, k, intent)) { }
    }

    public void onBackPressed()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).l(this))
            {
                return;
            }
        }

        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, configuration)) { }
    }

    public void onContentChanged()
    {
        super.onContentChanged();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).j(this)) { }
    }

    protected final void onCreate(Bundle bundle)
    {
        Iterator iterator;
        b = b().c(com/facebook/base/activity/f);
        super.onCreate(bundle);
        a(bundle);
        iterator = b.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ((f)iterator.next()).f(this);
        if (!isFinishing()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        b(bundle);
        bundle = b.iterator();
        while (bundle.hasNext()) 
        {
            ((f)bundle.next()).g(this);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected Dialog onCreateDialog(int j)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Dialog dialog = ((f)iterator.next()).a(this, j);
            if (dialog != null)
            {
                return dialog;
            }
        }

        return super.onCreateDialog(j);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).a(menu)) { }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).h(this)) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        super.onDestroy();
        throw exception;
        super.onDestroy();
        return;
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Boolean boolean1 = ((f)iterator.next()).a(this, j, keyevent);
            if (boolean1 != null)
            {
                return boolean1.booleanValue();
            }
        }

        return super.onKeyDown(j, keyevent);
    }

    public boolean onKeyUp(int j, KeyEvent keyevent)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Boolean boolean1 = ((f)iterator.next()).b(this, j, keyevent);
            if (boolean1 != null)
            {
                return boolean1.booleanValue();
            }
        }

        return super.onKeyUp(j, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).a(menuitem))
            {
                return true;
            }
        }

        return super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        super.onPause();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).c(this)) { }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, bundle)) { }
    }

    protected void onPrepareDialog(int j, Dialog dialog)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).a(this, j, dialog))
            {
                return;
            }
        }

        super.onPrepareDialog(j, dialog);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).b(menu)) { }
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        c = com.facebook.base.activity.b.a();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).b(this)) { }
    }

    public Object onRetainNonConfigurationInstance()
    {
        return null;
    }

    public boolean onSearchRequested()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Boolean boolean1 = ((f)iterator.next()).k(this);
            if (boolean1 != null)
            {
                return boolean1.booleanValue();
            }
        }

        return super.onSearchRequested();
    }

    protected void onStart()
    {
        super.onStart();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this)) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).d(this)) { }
    }

    public void onUserInteraction()
    {
        super.onUserInteraction();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).e(this)) { }
    }
}
