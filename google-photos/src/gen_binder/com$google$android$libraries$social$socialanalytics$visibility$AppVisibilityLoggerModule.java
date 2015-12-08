// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import ofz;
import olm;
import olv;

public final class i
    implements olv
{

    private HashMap a;

    public final void a(Context context, Class class1, olm olm)
    {
        if (a == null)
        {
            a = new HashMap(2);
            a.put(ofz.a, Integer.valueOf(0));
            a.put(ofz.b, Integer.valueOf(1));
        }
        context = (Integer)a.get(class1.getName());
        if (context == null)
        {
            return;
        }
        switch (context.intValue())
        {
        default:
            return;

        case 0: // '\0'
            ofz.a(olm);
            return;

        case 1: // '\001'
            ofz.b(olm);
            break;
        }
    }

    public i()
    {
    }
}
