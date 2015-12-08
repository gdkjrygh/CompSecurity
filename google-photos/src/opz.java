// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class opz extends rz
    implements opc
{

    private int d;
    public final oqd g = new oqd();

    public opz()
    {
    }

    private void a(Intent intent)
    {
        int i = d;
        d = i + 1;
        if (i == 0)
        {
            g.b(intent);
        }
    }

    private void f()
    {
        d = d - 1;
    }

    public final void a(aav aav)
    {
        g.h();
        super.a(aav);
    }

    public final void a(am am)
    {
        g.a(am);
        super.a(am);
    }

    public final void a(am am, Intent intent, int i)
    {
        a(intent);
        super.a(am, intent, i);
        f();
    }

    public final void b(aav aav)
    {
        g.i();
        super.b(aav);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (g.a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public void finish()
    {
        g.g();
        super.finish();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        g.a(i, j, intent);
        super.onActivityResult(i, j, intent);
    }

    public void onAttachedToWindow()
    {
        g.d();
        super.onAttachedToWindow();
    }

    public void onBackPressed()
    {
        if (!g.j())
        {
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (g.a(menuitem))
        {
            return true;
        } else
        {
            return super.onContextItemSelected(menuitem);
        }
    }

    public void onCreate(Bundle bundle)
    {
        g.c(bundle);
        super.onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        g.a(contextmenu, view, contextmenuinfo);
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (g.a(menu))
        {
            return true;
        } else
        {
            return super.onCreateOptionsMenu(menu);
        }
    }

    public void onDestroy()
    {
        g.c();
        super.onDestroy();
    }

    public void onDetachedFromWindow()
    {
        g.e();
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (g.a(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (g.b(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        g.n();
        super.onLowMemory();
    }

    public void onNewIntent(Intent intent)
    {
        g.a(intent);
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (g.b(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        g.b();
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        g.a(bundle);
        super.onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        g.a();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (g.b(menu))
        {
            return true;
        } else
        {
            return super.onPrepareOptionsMenu(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        g.a(i, as, ai);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        g.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume()
    {
        c.a(c());
        g.l();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        g.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        c.a(c());
        g.k();
        super.onStart();
    }

    public void onStop()
    {
        g.m();
        super.onStop();
    }

    protected void onUserLeaveHint()
    {
        g.f();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        g.a(flag);
        super.onWindowFocusChanged(flag);
    }

    public void startActivity(Intent intent)
    {
        a(intent);
        super.startActivity(intent);
        f();
    }

    public void startActivity(Intent intent, Bundle bundle)
    {
        a(intent);
        super.startActivity(intent, bundle);
        f();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        a(intent);
        super.startActivityForResult(intent, i);
        f();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityForResult(intent, i, bundle);
        f();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        f();
    }

    public final opd x_()
    {
        return g;
    }
}
