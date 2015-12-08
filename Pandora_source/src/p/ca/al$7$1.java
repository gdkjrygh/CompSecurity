// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Handler;
import android.widget.ImageButton;

// Referenced classes of package p.ca:
//            al

class ject
    implements Runnable
{

    final boolean a;
    final a b;

    public void run()
    {
        al.a(b.b, a);
        al.f(b.b).setSelected(a);
    }

    ject(ject ject, boolean flag)
    {
        b = ject;
        a = flag;
        super();
    }

    // Unreferenced inner class p/ca/al$7

/* anonymous class */
    class al._cls7
        implements p.bx.b.b
    {

        final al a;

        private void a(boolean flag)
        {
            al.g(a).post(new al._cls7._cls1(this, flag));
        }

        public void a()
        {
            a(true);
        }

        public void b()
        {
            a(false);
        }

        public void c()
        {
            a(false);
        }

            
            {
                a = al1;
                super();
            }
    }

}
