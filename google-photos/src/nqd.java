// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class nqd
{

    final List a = Collections.synchronizedList(new ArrayList(50));
    Long b[];
    String c;

    public nqd()
    {
    }

    final boolean a(Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b == null)
        {
            flag = flag1;
            if (c != null)
            {
                Object obj = (myf)olm.a(context, myf);
                List list = ((myf) (obj)).b();
                ArrayList arraylist = new ArrayList();
                int k = list.size();
                int i = 0;
                do
                {
                    if (i >= k)
                    {
                        break;
                    }
                    myc myc1 = (myc)list.get(i);
                    if (((myf) (obj)).a(myc1, c))
                    {
                        try
                        {
                            arraylist.add(Long.valueOf(Long.parseLong(myc1.d.toUpperCase(), 16)));
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            if (Log.isLoggable("LogSinkImpl", 6))
                            {
                                String s = String.valueOf(myc1.d);
                                if (s.length() != 0)
                                {
                                    s = "Number cannot be parsed from experiment: ".concat(s);
                                } else
                                {
                                    s = new String("Number cannot be parsed from experiment: ");
                                }
                                Log.e("LogSinkImpl", s);
                            }
                        }
                    }
                    i++;
                } while (true);
                olu olu1 = new olu(context, npv);
                obj = olu1.a();
                for (int j = 0; j < olu1.a().size(); j++)
                {
                    context = (npv)olu1.a(((ArrayList) (obj)).get(j));
                    if (lvd.a(null, null, false))
                    {
                        throw new NullPointerException();
                    }
                }

                b = (Long[])arraylist.toArray(new Long[arraylist.size()]);
                flag = true;
            }
        }
        return flag;
    }

    final rbm[] a()
    {
        return (rbm[])a.toArray(new rbm[a.size()]);
    }
}
