// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.j;
import java.util.List;

// Referenced classes of package p.cx:
//            c

class .String extends Thread
{

    final c a;

    public void run()
    {
        List list = a.f();
        int k = list.size();
        String as[] = new String[k];
        for (int i = 0; i < k; i++)
        {
            as[i] = ((j)list.get(i)).a();
        }

        a.b(0, as);
    }

    .String(c c1, String s)
    {
        a = c1;
        super(s);
    }
}
