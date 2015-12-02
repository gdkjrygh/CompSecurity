// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import com.facebook.contacts.server.UsersInviteParams;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class k
    implements f
{

    public k()
    {
    }

    private String a(String s)
    {
        return s.replaceAll("<", "").replaceAll(">", "").replaceAll(",", "");
    }

    public n a(UsersInviteParams usersinviteparams)
    {
        java.util.ArrayList arraylist = hq.a();
        Object obj = usersinviteparams.a();
        StringBuilder stringbuilder = new StringBuilder();
        for (obj = ((es) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = (User)((Iterator) (obj)).next();
            String s = a(((User) (obj1)).h().toString());
            obj1 = ((User) (obj1)).v().iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                String s1 = a(((UserIdentifier)((Iterator) (obj1)).next()).toString());
                stringbuilder.append(s).append(" <").append(s1).append(">,");
            }
        }

        arraylist.add(new BasicNameValuePair("emails", stringbuilder.toString()));
        arraylist.add(new BasicNameValuePair("country_code", usersinviteparams.b()));
        return new n("usersInvite", "POST", "method/users.invite", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((UsersInviteParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((UsersInviteParams)obj, r1);
    }

    public Void a(UsersInviteParams usersinviteparams, r r1)
    {
        r1.f();
        return null;
    }
}
