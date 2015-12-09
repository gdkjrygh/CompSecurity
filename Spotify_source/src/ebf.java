// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ebf
{

    private static final ebi d = new ebi() {

        public final void a()
        {
        }

        public final void a(String s, ebg ebg1, Flags flags)
        {
            ebg1.a(Collections.emptyList());
        }

        public final boolean a(String s)
        {
            return false;
        }

    };
    public List a;
    public Flags b;
    private final Handler c;

    public ebf(Handler handler)
    {
        a = new LinkedList();
        c = handler;
    }

    static Flags a(ebf ebf1)
    {
        return ebf1.b;
    }

    public final void a(String s, ebg ebg)
    {
        Iterator iterator = a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ebi ebi1 = (ebi)iterator.next();
        if (!ebi1.a(s)) goto _L4; else goto _L3
_L3:
        c.post(new Runnable(ebi1, s, ebg) {

            private ebi a;
            private String b;
            private ebg c;
            private ebf d;

            public final void run()
            {
                a.a(b, c, ebf.a(d));
            }

            
            {
                d = ebf.this;
                a = ebi1;
                b = s;
                c = ebg;
                super();
            }
        });
        return;
_L2:
        ebi1 = d;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final transient void a(ebi aebi[])
    {
        a.addAll(Arrays.asList(aebi));
    }

    public final transient void b(ebi aebi[])
    {
        int j = aebi.length;
        for (int i = 0; i < j; i++)
        {
            aebi[i].a();
        }

        a.removeAll(Arrays.asList(aebi));
    }

}
