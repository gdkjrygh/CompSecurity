// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.android.a;
import com.kik.g.i;
import java.util.List;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.r;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class y extends i
{

    final KikApplication a;

    y(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        obj = kik.android.chat.KikApplication.a(a).a(((String) (obj)));
        obj1 = KikApplication.b(a).a(((f) (obj)).b(), true);
        com.kik.android.a.f f1 = a.b.b("Unmuted").a("Is Verified", ((k) (obj1)).i()).a("Source", "Expired");
        long l;
        if (((f) (obj)).p() == -1L)
        {
            obj = "Forever";
        } else
        {
            obj = "Limited Time Duration";
        }
        obj = f1.a("Duration", obj).a("Is Group", obj1 instanceof n);
        if (obj1 instanceof n)
        {
            l = ((n)obj1).w().size();
        } else
        {
            l = 1L;
        }
        ((com.kik.android.a.f) (obj)).a("Participants Count", l).b();
    }
}
