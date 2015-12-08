// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;

public class eu.janmuller.android.simplecropimage.b extends ActionBarActivity
{
    public static class a
        implements b
    {

        public void a()
        {
        }

        public void b()
        {
        }

        public void c()
        {
        }

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    final ArrayList f = new ArrayList();

    public eu.janmuller.android.simplecropimage.b()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        for (bundle = f.iterator(); bundle.hasNext(); bundle.next()) { }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((b)iterator.next()).a()) { }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 24
    //                   16908332 26;
           goto _L1 _L2
_L1:
        return true;
_L2:
        onBackPressed();
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onStart()
    {
        super.onStart();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((b)iterator.next()).b()) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((b)iterator.next()).c()) { }
    }
}
