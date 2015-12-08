// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

public class dbw
{

    private final ArrayList a = new ArrayList();

    public dbw()
    {
    }

    public final dbw a(String s, String s1)
    {
        a.add(new BasicNameValuePair(s, s1));
        return this;
    }

    public final dbw a(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); a.add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return this;
    }

    public final UrlEncodedFormEntity a(String s)
    {
        return new UrlEncodedFormEntity(a, s);
    }
}
