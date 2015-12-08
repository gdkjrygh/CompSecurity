// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class hpb
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private final Context b;
    private final noz c;

    public hpb(Context context)
    {
        b = context;
        c = noz.a(context, 3, "MediaResolver", new String[] {
            "perf"
        });
    }

    private List b(ekp ekp1)
    {
        if (ekp1.b(hpg) != null)
        {
            return ((hpg)ekp1.a(hpg)).a;
        }
        ekv ekv1 = b.a(b, ekp1);
        List list = Collections.emptyList();
        try
        {
            ekp1 = ((hpg)((ekp)ekv1.a(ekp1, a).a()).a(hpg)).a;
        }
        // Misplaced declaration of an exception variable
        catch (ekp ekp1)
        {
            if (Log.isLoggable("MediaResolver", 5))
            {
                ekp1 = String.valueOf(ekp1);
                Log.w("MediaResolver", (new StringBuilder(String.valueOf(ekp1).length() + 24)).append("Couldn't resolve media: ").append(ekp1).toString());
            }
            return list;
        }
        return ekp1;
    }

    public final List a(ekp ekp1)
    {
        long l = noy.a();
        List list = b(ekp1);
        if (c.a())
        {
            noy.a("media", ekp1);
            noy.a("resolved media count", Integer.valueOf(list.size()));
            noy.a("duration", l);
        }
        return list;
    }

    public final List a(Collection collection)
    {
        long l = noy.a();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); arraylist.addAll(b((ekp)iterator.next()))) { }
        if (c.a())
        {
            noy.a("media count", Integer.valueOf(collection.size()));
            noy.a("resolved media count", Integer.valueOf(arraylist.size()));
            noy.a("duration", l);
        }
        return arraylist;
    }

}
