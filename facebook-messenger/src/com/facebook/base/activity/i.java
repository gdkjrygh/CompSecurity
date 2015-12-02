// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.activity;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.base.h;
import com.facebook.common.d.c;
import com.facebook.common.d.e;
import com.facebook.common.executors.a;
import com.facebook.inject.t;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.base.activity:
//            h, q, j, k, 
//            f, b

public class i extends android.support.v4.app.i
    implements com.facebook.base.activity.h, com.facebook.base.activity.q, h, c
{

    private final com.facebook.base.i p = new com.facebook.base.i();
    private a q;
    private Set r;
    private String s;
    private boolean t;
    private Set u;
    private boolean v;

    public i()
    {
    }

    static void a(i l, e e1)
    {
        l.b(e1);
    }

    private void b(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!t)
        {
            u.remove(e1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    public Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = p.a(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    protected void a(Intent intent)
    {
        v = true;
    }

    protected void a(Bundle bundle)
    {
    }

    public void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(e1);
        if (!t) goto _L2; else goto _L1
_L1:
        q.d(new j(this, e1));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (u == null)
        {
            u = kl.a();
        }
        u.add(e1);
        e1.a(new k(this));
        if (true) goto _L4; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public void a(Object obj, Object obj1)
    {
        p.a(obj, obj1);
    }

    public void a(String s1, Fragment fragment)
    {
        ad ad1 = f().a();
        ad1.a(fragment, s1);
        ad1.a();
    }

    public boolean a(Exception exception)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).a(this, exception))
            {
                return true;
            }
        }

        return false;
    }

    protected View b(int l)
    {
        return findViewById(l);
    }

    protected void b(Bundle bundle)
    {
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, motionevent)) { }
        return super.dispatchTouchEvent(motionevent);
    }

    public void finish()
    {
        super.finish();
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).i(this)) { }
    }

    public String h()
    {
        return s;
    }

    public t i()
    {
        return com.facebook.inject.t.a(this);
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, l, i1, intent)) { }
    }

    public void onBackPressed()
    {
        if (!f().c())
        {
            return;
        }
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
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
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, configuration)) { }
    }

    public void onContentChanged()
    {
        super.onContentChanged();
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).j(this)) { }
    }

    protected final void onCreate(Bundle bundle)
    {
        Object obj;
        obj = i();
        q = (a)((t) (obj)).a(com/facebook/common/executors/a);
        r = ((t) (obj)).c(com/facebook/base/activity/f);
        super.onCreate(bundle);
        a(bundle);
        obj = r.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        ((f)((Iterator) (obj)).next()).f(this);
        if (!isFinishing()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        b(bundle);
        bundle = r.iterator();
        while (bundle.hasNext()) 
        {
            ((f)bundle.next()).g(this);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected Dialog onCreateDialog(int l)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
        {
            Dialog dialog = ((f)iterator.next()).a(this, l);
            if (dialog != null)
            {
                return dialog;
            }
        }

        return super.onCreateDialog(l);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).a(menu)) { }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        t = true;
        this;
        JVM INSTR monitorexit ;
        if (u == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        for (Iterator iterator = u.iterator(); iterator.hasNext(); ((e)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        super.onDestroy();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        u.clear();
        for (Iterator iterator1 = r.iterator(); iterator1.hasNext(); ((f)iterator1.next()).h(this)) { }
        super.onDestroy();
        return;
    }

    public boolean onKeyDown(int l, KeyEvent keyevent)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
        {
            Boolean boolean1 = ((f)iterator.next()).a(this, l, keyevent);
            if (boolean1 != null)
            {
                return boolean1.booleanValue();
            }
        }

        return super.onKeyDown(l, keyevent);
    }

    public boolean onKeyUp(int l, KeyEvent keyevent)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
        {
            Boolean boolean1 = ((f)iterator.next()).b(this, l, keyevent);
            if (boolean1 != null)
            {
                return boolean1.booleanValue();
            }
        }

        return super.onKeyUp(l, keyevent);
    }

    protected final void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (isFinishing())
        {
            return;
        }
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, intent)) { }
        v = false;
        a(intent);
        Preconditions.checkState(v, "onActivityNewIntent didn't call super.onActivityNewIntent()");
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
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
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).c(this)) { }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, bundle)) { }
    }

    protected void onPrepareDialog(int l, Dialog dialog)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).a(this, l, dialog))
            {
                return;
            }
        }

        super.onPrepareDialog(l, dialog);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).b(menu)) { }
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        s = com.facebook.base.activity.b.a();
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).b(this)) { }
    }

    public boolean onSearchRequested()
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext();)
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
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this)) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).d(this)) { }
    }

    public void onUserInteraction()
    {
        super.onUserInteraction();
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((f)iterator.next()).e(this)) { }
    }
}
