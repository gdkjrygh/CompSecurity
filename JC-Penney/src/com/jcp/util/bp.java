// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import com.jcp.JCP;
import com.jcp.fragments.s;
import com.jcp.model.ItemFulfillmentDetails;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;

public final class bp
{

    public bp()
    {
    }

    private int a()
    {
label0:
        {
            Object obj = JCP.h();
            int i;
            try
            {
                obj = ((List) (obj)).iterator();
                HttpCookie httpcookie;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    httpcookie = (HttpCookie)((Iterator) (obj)).next();
                } while (!httpcookie.getName().equalsIgnoreCase("itemCount"));
                i = Integer.parseInt(httpcookie.getValue());
            }
            catch (Exception exception)
            {
                return 0;
            }
            return i;
        }
        return 0;
    }

    public static boolean a(ItemFulfillmentDetails aitemfulfillmentdetails[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (aitemfulfillmentdetails == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = aitemfulfillmentdetails.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        ItemFulfillmentDetails itemfulfillmentdetails = aitemfulfillmentdetails[i];
        if (!"2".equalsIgnoreCase(itemfulfillmentdetails.getId())) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (!"notOffered".equalsIgnoreCase(itemfulfillmentdetails.getStatus()))
        {
            flag = true;
        }
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(s s1)
    {
        if (s1 != null)
        {
            JCP.d().a(a());
            s1.P();
        }
    }
}
