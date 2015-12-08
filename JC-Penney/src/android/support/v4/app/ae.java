// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            ai, ac, Fragment

class ae extends ai
{

    final ac a;

    public ae(ac ac1)
    {
        a = ac1;
        super(ac1);
    }

    public View a(int i)
    {
        return a.findViewById(i);
    }

    public void a(Fragment fragment, Intent intent, int i)
    {
        a.a(fragment, intent, i);
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a.dump(s, filedescriptor, printwriter, as);
    }

    public boolean a()
    {
        Window window = a.getWindow();
        return window != null && window.peekDecorView() != null;
    }

    public boolean a(Fragment fragment)
    {
        return !a.isFinishing();
    }

    public LayoutInflater b()
    {
        return a.getLayoutInflater().cloneInContext(a);
    }

    public void b(Fragment fragment)
    {
        a.a(fragment);
    }

    public void c()
    {
        a.d();
    }

    public boolean d()
    {
        return a.getWindow() != null;
    }

    public int e()
    {
        Window window = a.getWindow();
        if (window == null)
        {
            return 0;
        } else
        {
            return window.getAttributes().windowAnimations;
        }
    }
}
