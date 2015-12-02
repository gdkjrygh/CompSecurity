// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            p, i, ai, Fragment, 
//            q, s

public class n extends p
{

    private final i a;

    public n(i k)
    {
        a = k;
    }

    public Context a()
    {
        return a;
    }

    ai a(String s, boolean flag, boolean flag1)
    {
        return a.a(s, flag, flag1);
    }

    public View a(int k)
    {
        return a.findViewById(k);
    }

    void a(Fragment fragment)
    {
        a.a(fragment);
    }

    void a(Fragment fragment, Intent intent, int k)
    {
        a.a(fragment, intent, k);
    }

    void a(q q)
    {
        a.a(q);
    }

    void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        a.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    void a(String s)
    {
        a.a(s);
    }

    void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a.dump(s, filedescriptor, printwriter, as);
    }

    public Handler b()
    {
        return a.a;
    }

    public Window c()
    {
        return a.getWindow();
    }

    public Resources d()
    {
        return a.getResources();
    }

    public LayoutInflater e()
    {
        return a.getLayoutInflater();
    }

    public boolean f()
    {
        return a.isFinishing();
    }

    s g()
    {
        return a.b;
    }

    boolean h()
    {
        return a.i;
    }

    q i()
    {
        return a.b_();
    }

    void j()
    {
        a.d();
    }
}
