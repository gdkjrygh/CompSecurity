// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class oqc extends ar
    implements opc
{

    private int d;
    public final oqd e = new oqd();

    public oqc()
    {
    }

    private void a(Intent intent)
    {
        int i = d;
        d = i + 1;
        if (i == 0)
        {
            e.b(intent);
        }
    }

    private void e()
    {
        d = d - 1;
    }

    public final void a(am am)
    {
        e.a(am);
        super.a(am);
    }

    public final void a(am am, Intent intent, int i)
    {
        a(intent);
        super.a(am, intent, i);
        e();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (e.a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public void finish()
    {
        e.g();
        super.finish();
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        e.i();
        super.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        e.h();
        super.onActionModeStarted(actionmode);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        e.a(i, j, intent);
        super.onActivityResult(i, j, intent);
    }

    public void onAttachedToWindow()
    {
        e.d();
        super.onAttachedToWindow();
    }

    public void onBackPressed()
    {
        if (!e.j())
        {
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (e.a(menuitem))
        {
            return true;
        } else
        {
            return super.onContextItemSelected(menuitem);
        }
    }

    public void onCreate(Bundle bundle)
    {
        e.c(bundle);
        super.onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        e.a(contextmenu, view, contextmenuinfo);
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (e.a(menu))
        {
            return true;
        } else
        {
            return super.onCreateOptionsMenu(menu);
        }
    }

    public void onDestroy()
    {
        e.c();
        super.onDestroy();
    }

    public void onDetachedFromWindow()
    {
        e.e();
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (e.a(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (e.b(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        e.n();
        super.onLowMemory();
    }

    protected void onNewIntent(Intent intent)
    {
        e.a(intent);
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (e.b(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        e.b();
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        e.a(bundle);
        super.onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        e.a();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (e.b(menu))
        {
            return true;
        } else
        {
            return super.onPrepareOptionsMenu(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        e.a(i, as, ai);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        e.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume()
    {
        c.a(c());
        e.l();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        e.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        c.a(c());
        e.k();
        super.onStart();
    }

    public void onStop()
    {
        e.m();
        super.onStop();
    }

    protected void onUserLeaveHint()
    {
        e.f();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        e.a(flag);
        super.onWindowFocusChanged(flag);
    }

    public void startActivity(Intent intent)
    {
        a(intent);
        super.startActivity(intent);
        e();
    }

    public void startActivity(Intent intent, Bundle bundle)
    {
        a(intent);
        super.startActivity(intent, bundle);
        e();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        a(intent);
        super.startActivityForResult(intent, i);
        e();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityForResult(intent, i, bundle);
        e();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        e();
    }

    public final opd x_()
    {
        return e;
    }
}
