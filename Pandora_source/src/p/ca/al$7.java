// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Handler;
import android.widget.ImageButton;

// Referenced classes of package p.ca:
//            al

class Object
    implements p.bx.Object
{

    final al a;

    private void a(boolean flag)
    {
        al.g(a).post(new Runnable(flag) {

            final boolean a;
            final al._cls7 b;

            public void run()
            {
                al.a(b.a, a);
                al.f(b.a).setSelected(a);
            }

            
            {
                b = al._cls7.this;
                a = flag;
                super();
            }
        });
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

    Object(al al1)
    {
        a = al1;
        super();
    }
}
