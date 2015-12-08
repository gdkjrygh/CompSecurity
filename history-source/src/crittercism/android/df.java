// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package crittercism.android:
//            di, br, cz, dh, 
//            db, dg, au, cx

public final class df
{

    private Context a;
    private List b;

    public df(Context context)
    {
        a = context;
        b = new ArrayList();
    }

    public final void a()
    {
        Object obj = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(new Thread((di)iterator.next()))) { }
        for (Iterator iterator1 = ((ArrayList) (obj)).iterator(); iterator1.hasNext(); ((Thread)iterator1.next()).start()) { }
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Thread)((Iterator) (obj)).next()).join()) { }
    }

    public final void a(br br1, cz cz1, String s, String s1, String s2, au au, cx cx)
    {
        this;
        JVM INSTR monitorenter ;
        if (br1.b() > 0)
        {
            br br2 = br1.a(a);
            cz1 = cz1.a(br2, br1, s2, a, au);
            br1 = new dh(br2, br1, au, (new db(s, s1)).a(), cz1, cx);
            b.add(br1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        br1;
        throw br1;
    }

    public final void a(dg dg1, ExecutorService executorservice)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            di di1 = (di)iterator.next();
            if (!dg1.a(di1))
            {
                executorservice.execute(di1);
            }
        } while (true);
    }
}
