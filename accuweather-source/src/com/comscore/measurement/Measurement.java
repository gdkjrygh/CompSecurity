// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.measurement;

import com.comscore.analytics.Core;
import com.comscore.utils.Constants;
import com.comscore.utils.Date;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.comscore.measurement:
//            Label, PrivilegedLabel

public class Measurement
{

    protected HashMap a;
    protected String b;
    protected long c;

    protected Measurement(Core core)
    {
        a = new HashMap();
        setPixelURL(core.getPixelURL());
        c = Date.unixTime();
    }

    protected Boolean a(String s, long l)
    {
        return a(s, Long.toString(l));
    }

    protected Boolean a(String s, String s1)
    {
        s = (Label)a.get(s);
        if (s != null)
        {
            return Boolean.valueOf(((Label) (s)).value.equals(s1));
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    protected void a(Label label)
    {
        if (a.get(label.name) == null)
        {
            a.put(label.name, label);
        }
    }

    protected void a(String s, String s1, Boolean boolean1, Boolean boolean2)
    {
        if (boolean2.booleanValue())
        {
            a(((Label) (new PrivilegedLabel(s, s1, boolean1))));
            return;
        } else
        {
            a(new Label(s, s1, boolean1));
            return;
        }
    }

    protected void a(HashMap hashmap)
    {
        a(hashmap, false);
    }

    protected void a(HashMap hashmap, boolean flag)
    {
        if (hashmap != null)
        {
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); setLabel(s, (String)hashmap.get(s), Boolean.valueOf(flag)))
            {
                s = (String)iterator.next();
            }

        }
    }

    protected void b(String s, String s1, Boolean boolean1, Boolean boolean2)
    {
        removeLabel(s, boolean1, boolean2);
        a(s, s1, boolean1, boolean2);
    }

    public Label getLabel(String s)
    {
        return (Label)a.get(s);
    }

    public String getPixelURL()
    {
        return b;
    }

    public Boolean hasLabel(String s)
    {
        return Boolean.valueOf(a.containsKey(s));
    }

    public void removeLabel(String s, Boolean boolean1, Boolean boolean2)
    {
        Label label = (Label)a.get(s);
        if (label != null && (!(label instanceof PrivilegedLabel) || boolean2.booleanValue() || boolean1.booleanValue()))
        {
            a.remove(s);
        }
    }

    public String retrieveLabelsAsString(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        HashMap hashmap = new HashMap(a);
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s = as[i];
            Label label = (Label)hashmap.get(s);
            if (label != null)
            {
                stringbuilder.append(label.pack());
                hashmap.remove(s);
            }
        }

        if (as != Constants.LABELS_ORDER)
        {
            as = Constants.LABELS_ORDER;
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                String s1 = as[j];
                Label label1 = (Label)hashmap.get(s1);
                if (label1 != null)
                {
                    stringbuilder.append(label1.pack());
                    hashmap.remove(s1);
                }
            }

        }
        for (as = hashmap.values().iterator(); as.hasNext(); stringbuilder.append(((Label)as.next()).pack())) { }
        if (stringbuilder.length() > 0 && stringbuilder.charAt(0) == '&')
        {
            return stringbuilder.substring(1);
        } else
        {
            return stringbuilder.toString();
        }
    }

    public void setLabel(Label label)
    {
        removeLabel(label.name, label.aggregate, Boolean.valueOf(label instanceof PrivilegedLabel));
        a(label);
    }

    public void setLabel(String s, String s1)
    {
        setLabel(s, s1, Boolean.valueOf(false));
    }

    public void setLabel(String s, String s1, Boolean boolean1)
    {
        removeLabel(s, boolean1, Boolean.valueOf(false));
        a(s, s1, boolean1, Boolean.valueOf(false));
    }

    public void setPixelURL(String s)
    {
        b = s;
    }
}
