// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.content.ContentValues;
import android.database.sqlite.SQLiteStatement;
import com.facebook.contacts.database.g;
import com.facebook.debug.log.b;
import com.facebook.user.a.i;
import com.facebook.user.a.l;
import com.google.common.a.es;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.facebook.contacts.data:
//            b, m

public class n extends i
{

    private static final Class a = com/facebook/contacts/data/n;
    private final com.facebook.contacts.data.b b;
    private String c;
    private Map d;

    public n(com.facebook.contacts.data.b b1, l l, com.facebook.user.a.n n1)
    {
        super(l, n1);
        b = b1;
        d = ik.a();
    }

    public void a(String s)
    {
        c = s;
        d.clear();
    }

    protected void a(String s, int j, String s1)
    {
        ContentValues contentvalues;
        if (!Objects.equal(c, s))
        {
            throw new IllegalStateException((new StringBuilder()).append("trying to insert lookup tokens ").append(s).append(" while ").append("processing names for user ").append(c).toString());
        }
        if (d.containsKey(s1))
        {
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("User ").append(s).append(" already inserted token: ").append(s1).toString());
            return;
        }
        contentvalues = new ContentValues();
        contentvalues.put("type", "name");
        contentvalues.put("contact_id", s);
        contentvalues.put("indexed_data", s1);
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Inserting name lookup: ").append(contentvalues).toString());
        s = g.a(b.e());
        m.a(s, contentvalues);
        s.close();
        d.put(s1, Boolean.valueOf(true));
        return;
        s1;
        s.close();
        throw s1;
    }

    public void a(String s, es es1)
    {
        for (es1 = es1.iterator(); es1.hasNext(); a(s, 1, c((String)es1.next()))) { }
    }

    protected String[] b(String s)
    {
        return new String[0];
    }

}
