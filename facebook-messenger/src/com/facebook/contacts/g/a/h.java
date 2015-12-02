// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import android.os.Bundle;
import com.facebook.common.w.e;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.user.User;
import com.facebook.user.o;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import javax.inject.a;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.contacts.g.a:
//            i

public class h
    implements f
{

    private static final Class a = com/facebook/contacts/g/a/h;
    private final PhoneNumberUtil b;
    private final a c;

    public h(PhoneNumberUtil phonenumberutil, a a1)
    {
        b = phonenumberutil;
        c = a1;
    }

    private String a(String s, String s1)
    {
        Object obj;
        obj = b.parse(s, s1);
        obj = b.format(((com.facebook.phonenumbers.Phonenumber.PhoneNumber) (obj)), com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
        s = ((String) (obj));
_L2:
        s1 = new JSONArray();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("cell", s);
        s1.put(jsonobject);
        return s1.toString();
        NumberParseException numberparseexception;
        numberparseexception;
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Cannot parse number: [").append(s).append("] in region: ").append(s1).toString(), numberparseexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public n a(i j)
    {
        java.util.ArrayList arraylist = hq.a();
        String s = (String)c.b();
        arraylist.add(new BasicNameValuePair("entries", a(com.facebook.contacts.g.a.i.a(j), s)));
        arraylist.add(new BasicNameValuePair("format", "json"));
        if (s != null)
        {
            arraylist.add(new BasicNameValuePair("country_code", s));
        }
        return new n("searchPhoneNumberMethod", "GET", "method/phonebook.lookup", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((i)obj);
    }

    public User a(i j, r r1)
    {
        j = r1.c();
        new Bundle();
        if (j.size() > 0)
        {
            Object obj = j.get(0);
            j = e.b(((JsonNode) (obj)).get("name"));
            r1 = e.b(((JsonNode) (obj)).get("uid"));
            obj = e.b(((JsonNode) (obj)).get("pic_square_with_logo"));
            o o1 = new o();
            o1.a(com.facebook.user.n.FACEBOOK, r1);
            o1.a(j);
            if (obj != null)
            {
                o1.b(((String) (obj)));
            }
            return o1.x();
        } else
        {
            return null;
        }
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((i)obj, r1);
    }

}
