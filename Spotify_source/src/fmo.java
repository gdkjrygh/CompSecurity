// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class fmo extends fni
{

    private edz b;

    public fmo(fni fni1, fni fni2, fni fni3)
    {
        super("ComScoreNotification");
        b = (edz)dmz.a(edz);
        fnl fnl = new fnl() {

            private fmo a;

            public final void a()
            {
                edz edz1 = fmo.a(a);
                edz1.a();
                edz1.a.sendEmptyMessage(3);
                fmo.b(a);
            }

            public final void b()
            {
                edz edz1 = fmo.a(a);
                edz1.a();
                edz1.a.sendEmptyMessage(4);
                fmo.b(a);
            }

            
            {
                a = fmo.this;
                super();
            }
        };
        fnl fnl1 = new fnl() {

            private fmo a;

            public final void a()
            {
                edz edz1 = fmo.a(a);
                if (!edz1.b)
                {
                    edz1.a();
                    edz1.a.sendEmptyMessage(1);
                }
                fmo.b(a);
            }

            public final void b()
            {
                edz edz1 = fmo.a(a);
                if (edz1.b)
                {
                    edz1.a();
                    edz1.a.sendEmptyMessage(2);
                }
                fmo.b(a);
            }

            
            {
                a = fmo.this;
                super();
            }
        };
        fni1.a(fnl1);
        fni2.a(fnl1);
        fni3.a(fnl);
    }

    static edz a(fmo fmo1)
    {
        return fmo1.b;
    }

    static void b(fmo fmo1)
    {
        if (fmo1.b.b)
        {
            fmo1.J_();
            return;
        } else
        {
            fmo1.c();
            return;
        }
    }
}
