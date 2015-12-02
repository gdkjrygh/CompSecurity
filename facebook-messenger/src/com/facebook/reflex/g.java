// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.base.activity.b;
import com.facebook.base.activity.f;
import com.facebook.base.activity.h;
import com.facebook.base.activity.q;
import com.facebook.common.d.c;
import com.facebook.common.d.e;
import com.facebook.common.executors.a;
import com.facebook.inject.t;
import com.facebook.reflex.a.d;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.reflex:
//            j, h, i

public class g extends j
    implements h, q, c
{

    private a c;
    private Set d;
    private String e;
    private d f;
    private boolean g;
    private Set h;
    private boolean i;

    public g()
    {
    }

    static void a(g g1, e e1)
    {
        g1.b(e1);
    }

    private void b(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!g)
        {
            h.remove(e1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    protected View a(int k)
    {
        return findViewById(k);
    }

    protected void a(Intent intent)
    {
        i = true;
    }

    protected void a(Bundle bundle)
    {
    }

    public void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(e1);
        if (!g) goto _L2; else goto _L1
_L1:
        c.d(new com.facebook.reflex.h(this, e1));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h == null)
        {
            h = kl.a();
        }
        h.add(e1);
        e1.a(new i(this));
        if (true) goto _L4; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public void a(String s, Fragment fragment)
    {
        ad ad1 = f().a();
        ad1.a(fragment, s);
        ad1.a();
    }

    public boolean a(Exception exception)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).a(this, exception))
            {
                return true;
            }
        }

        return false;
    }

    protected void b(Bundle bundle)
    {
    }

    public t d()
    {
        return t.a(this);
    }

    protected void didReceiveDriverInformation(String s, String s1, String s2, String s3)
    {
        f.a(s, s1, s2, s3);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, motionevent)) { }
        return super.dispatchTouchEvent(motionevent);
    }

    public void finish()
    {
        super.finish();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).i(this)) { }
    }

    public String h()
    {
        return e;
    }

    public void onBackPressed()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
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
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, configuration)) { }
    }

    public void onContentChanged()
    {
        super.onContentChanged();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).j(this)) { }
    }

    protected final void onCreate(Bundle bundle)
    {
        Object obj;
        obj = d();
        c = (a)((t) (obj)).a(com/facebook/common/executors/a);
        d = ((t) (obj)).c(com/facebook/base/activity/f);
        f = (d)((t) (obj)).a(com/facebook/reflex/a/d);
        super.onCreate(bundle);
        b(bundle);
        obj = d.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        ((f)((Iterator) (obj)).next()).f(this);
        if (!isFinishing()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        a(bundle);
        bundle = d.iterator();
        while (bundle.hasNext()) 
        {
            ((f)bundle.next()).g(this);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected Dialog onCreateDialog(int k)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            Dialog dialog = ((f)iterator.next()).a(this, k);
            if (dialog != null)
            {
                return dialog;
            }
        }

        return super.onCreateDialog(k);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).a(menu)) { }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        g = true;
        this;
        JVM INSTR monitorexit ;
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((e)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        super.onDestroy();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        h.clear();
        for (Iterator iterator1 = d.iterator(); iterator1.hasNext(); ((f)iterator1.next()).h(this)) { }
        super.onDestroy();
        return;
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            Boolean boolean1 = ((f)iterator.next()).a(this, k, keyevent);
            if (boolean1 != null)
            {
                return boolean1.booleanValue();
            }
        }

        return super.onKeyDown(k, keyevent);
    }

    public boolean onKeyUp(int k, KeyEvent keyevent)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            Boolean boolean1 = ((f)iterator.next()).b(this, k, keyevent);
            if (boolean1 != null)
            {
                return boolean1.booleanValue();
            }
        }

        return super.onKeyUp(k, keyevent);
    }

    protected final void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (isFinishing())
        {
            return;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, intent)) { }
        i = false;
        a(intent);
        Preconditions.checkState(i, "onActivityNewIntent didn't call super.onActivityNewIntent()");
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
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
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).c(this)) { }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this, bundle)) { }
    }

    protected void onPrepareDialog(int k, Dialog dialog)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            if (((f)iterator.next()).a(this, k, dialog))
            {
                return;
            }
        }

        super.onPrepareDialog(k, dialog);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).b(menu)) { }
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        e = com.facebook.base.activity.b.a();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).b(this)) { }
    }

    public boolean onSearchRequested()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
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
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).a(this)) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).d(this)) { }
    }

    public void onUserInteraction()
    {
        super.onUserInteraction();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((f)iterator.next()).e(this)) { }
    }
}
