// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.addressbook:
//            ContactIngestionJNI

public static class configuration
{

    private List configuration;

    public void addConfiguration(configuration configuration1, String s)
    {
        configuration.add(Pair.create(configuration1, s));
    }

    public configuration getConfigurationKey(int i)
    {
        configuration configuration1 = D;
        Pair pair = (Pair)configuration.get(i);
        if (pair != null)
        {
            configuration1 = (configuration)pair.first;
        }
        return configuration1;
    }

    public int getConfigurationKeyInt(int i)
    {
        return getConfigurationKey(i).getConfigurationKey();
    }

    public String getConfigurationValue(Integer integer)
    {
        Object obj1 = null;
        Iterator iterator = configuration.iterator();
        Object obj;
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (Pair)iterator.next();
            if (((configuration)((Pair) (obj)).first).configuration() != integer.intValue())
            {
                continue;
            }
            obj = (String)((Pair) (obj)).second;
            break;
        } while (true);
        return ((String) (obj));
    }

    public String getConfigurationValueInt(int i)
    {
        return getConfigurationValue(Integer.valueOf(i));
    }

    public int size()
    {
        return configuration.size();
    }

    public ()
    {
        configuration = new ArrayList();
    }
}
