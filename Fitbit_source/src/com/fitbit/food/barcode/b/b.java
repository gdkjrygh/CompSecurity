// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.b;

import android.os.AsyncTask;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public class b extends AsyncTask
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(ServerCommunicationException servercommunicationexception);

        public abstract void a(FoodItem fooditem);
    }


    private a a;
    private ServerCommunicationException b;

    public b(a a1)
    {
        a = a1;
    }

    private boolean b(List list)
    {
        return list == null || list.size() < 1;
    }

    protected transient List a(String as[])
    {
        b = null;
        ArrayList arraylist = new ArrayList();
        Object obj = arraylist;
        if (as != null)
        {
            obj = arraylist;
            if (as.length > 0)
            {
                as = as[0];
                obj = r.a();
                try
                {
                    obj = ((r) (obj)).b(as);
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    b = as;
                    return arraylist;
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    b = new ServerCommunicationException(as);
                    return arraylist;
                }
            }
        }
        return ((List) (obj));
    }

    protected void a(List list)
    {
        if (a != null)
        {
            if (b != null)
            {
                a.a(b);
            } else
            {
                if (b(list))
                {
                    a.a();
                    return;
                }
                list = (FoodItem)list.get(0);
                if (list != null)
                {
                    a.a(list);
                    return;
                }
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
