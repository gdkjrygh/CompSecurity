// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.support.v4.b.d;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.content:
//            d

public final class c
{

    int a;
    android.support.v4.content.d b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;

    public final void a()
    {
        c = true;
        e = false;
        d = false;
    }

    public final void a(int i, android.support.v4.content.d d1)
    {
        if (b != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            b = d1;
            a = i;
            return;
        }
    }

    public final void a(android.support.v4.content.d d1)
    {
        if (b == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (b != d1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            b = null;
            return;
        }
    }

    public final void a(String s, PrintWriter printwriter)
    {
        printwriter.print(s);
        printwriter.print("mId=");
        printwriter.print(a);
        printwriter.print(" mListener=");
        printwriter.println(b);
        if (c || f || g)
        {
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(c);
            printwriter.print(" mContentChanged=");
            printwriter.print(f);
            printwriter.print(" mProcessingChange=");
            printwriter.println(g);
        }
        if (d || e)
        {
            printwriter.print(s);
            printwriter.print("mAbandoned=");
            printwriter.print(d);
            printwriter.print(" mReset=");
            printwriter.println(e);
        }
    }

    public final void b()
    {
        c = false;
    }

    public final void c()
    {
        e = true;
        c = false;
        d = false;
        f = false;
        g = false;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        android.support.v4.b.d.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
