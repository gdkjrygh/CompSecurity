// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class at extends ax
{

    private ar i;

    public at(ar ar1)
    {
        i = ar1;
        super(ar1);
    }

    public final View a(int j)
    {
        return i.findViewById(j);
    }

    public final void a(am am)
    {
        i.a(am);
    }

    public final void a(am am, Intent intent, int j)
    {
        i.a(am, intent, j);
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        i.dump(s, null, printwriter, as);
    }

    public final boolean a()
    {
        Window window = i.getWindow();
        return window != null && window.peekDecorView() != null;
    }

    public final boolean b()
    {
        return !i.isFinishing();
    }

    public final LayoutInflater c()
    {
        return i.getLayoutInflater().cloneInContext(i);
    }

    public final void d()
    {
        i.ab_();
    }

    public final boolean e()
    {
        return i.getWindow() != null;
    }

    public final int f()
    {
        Window window = i.getWindow();
        if (window == null)
        {
            return 0;
        } else
        {
            return window.getAttributes().windowAnimations;
        }
    }
}
