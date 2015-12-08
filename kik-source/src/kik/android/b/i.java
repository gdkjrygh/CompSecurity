// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.content.Intent;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.g.as;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.s;
import kik.android.util.ae;

// Referenced classes of package kik.android.b:
//            g

final class i
    implements as
{

    final s a;
    final kik.android.b.g b;

    i(kik.android.b.g g1, s s1)
    {
        b = g1;
        a = s1;
        super();
    }

    public final Object a(Object obj)
    {
        Intent intent = (Intent)obj;
        obj = a;
        a a1 = (a)g.a(((s) (obj)), kik/a/d/a/a);
        if (a1 != null)
        {
            KikMessageParcelable kikmessageparcelable = new KikMessageParcelable(a1.g("title"), a1.g("text"), null, null, ((s) (obj)).i(), null, null, ae.a(a1), a1.h("card-url"), a1.g("card-icon"), a1.g("allow-forward"), a1.g("fallbackUrl"), a1.g("pngImage"), a1.g("attribution"), a1.h(), String.valueOf(a1.y()), String.valueOf(a1.A()), String.valueOf(a1.z()), String.valueOf(a1.x()));
            Iterator iterator = a1.q().keySet().iterator();
            do
            {
                obj = kikmessageparcelable;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = iterator.next();
                kikmessageparcelable.t.put((String)obj, ((String)a1.q().get(obj)).toString());
            } while (true);
        } else
        {
            obj = null;
        }
        intent.putExtra("CardLauncher.EXTRA_KIK_MESSAGE", ((android.os.Parcelable) (obj)));
        return intent;
    }
}
