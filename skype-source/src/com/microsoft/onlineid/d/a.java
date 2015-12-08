// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.d;

import android.accounts.Account;
import android.content.Context;
import android.util.Patterns;
import com.microsoft.onlineid.a.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

// Referenced classes of package com.microsoft.onlineid.d:
//            b

public final class a
{

    private final com.microsoft.onlineid.d.b a;

    public a(Context context)
    {
        this(new com.microsoft.onlineid.d.b(context));
    }

    private a(com.microsoft.onlineid.d.b b1)
    {
        a = b1;
    }

    public final Set a()
    {
        HashSet hashset = new HashSet();
        Account aaccount[] = a.a();
        int j = aaccount.length;
        for (int i = 0; i < j; i++)
        {
            Account account = aaccount[i];
            if (Patterns.EMAIL_ADDRESS.matcher(account.name).matches())
            {
                hashset.add(account.name);
            }
        }

        com.microsoft.onlineid.a.a.a().a("User data", "Unique email count", "Exists in Account Manager", Long.valueOf(hashset.size()));
        return hashset;
    }

    public final String b()
    {
        Object obj = a();
        JSONArray jsonarray = new JSONArray();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); jsonarray.put((String)((Iterator) (obj)).next())) { }
        return jsonarray.toString();
    }

    public final String c()
    {
        Account aaccount[] = a.a("com.google");
        b b1 = com.microsoft.onlineid.a.a.a();
        String s;
        if (aaccount.length == 0)
        {
            s = "Does not exist in Account Manager";
        } else
        {
            s = "Exists in Account Manager";
        }
        b1.a("User data", "Google email", s);
        if (aaccount.length == 0)
        {
            return null;
        } else
        {
            com.microsoft.onlineid.a.a.a().a("User data", "Google email count", "Exists in Account Manager", Long.valueOf(aaccount.length));
            return aaccount[0].name;
        }
    }
}
