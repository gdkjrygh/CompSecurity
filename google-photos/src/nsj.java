// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

public final class nsj
{

    private static final String a = ntn.a(nsj);

    private nsj()
    {
    }

    public static void a(Context context, int i, oyc aoyc[], nqx nqx)
    {
        ArrayList arraylist = new ArrayList();
        if (aoyc != null && aoyc.length > 0)
        {
            for (int j = 0; j < aoyc.length; j++)
            {
                oyc oyc1 = aoyc[j];
                if (oyc1.i != null || "df".equals(oyc1.b))
                {
                    arraylist.add(oyc1);
                }
            }

        }
        if (!arraylist.isEmpty())
        {
            aoyc = a;
            int k = arraylist.size();
            ntn.a(aoyc, (new StringBuilder(42)).append("Reporting notifications, size: ").append(k).toString());
            Iterator iterator = arraylist.iterator();
            while (iterator.hasNext()) 
            {
                aoyc = (oyc)iterator.next();
                String s = a;
                aoyc = String.valueOf(((oyc) (aoyc)).a);
                if (aoyc.length() != 0)
                {
                    aoyc = "NotificationKey: ".concat(aoyc);
                } else
                {
                    aoyc = new String("NotificationKey: ");
                }
                ntn.a(s, aoyc);
            }
            mtj.a(context, new nsi(context, i, arraylist, nqx));
        }
    }

    public static oyc[] a(oyc aoyc[])
    {
        ArrayList arraylist = new ArrayList();
        if (aoyc != null && aoyc.length > 0)
        {
            for (int i = 0; i < aoyc.length; i++)
            {
                oyc oyc1 = aoyc[i];
                if (!"df".equals(oyc1.b))
                {
                    arraylist.add(oyc1);
                }
            }

        }
        return (oyc[])arraylist.toArray(new oyc[arraylist.size()]);
    }

}
