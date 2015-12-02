// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.common.w.n;
import com.facebook.contacts.picker.a;
import com.facebook.contacts.picker.l;
import com.facebook.contacts.picker.v;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.aq;
import com.facebook.orca.protocol.methods.ah;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.widget.a.i;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ac extends a
{

    private final aq b;
    private final ah c;

    public ac(aq aq1, ah ah)
    {
        b = aq1;
        c = ah;
    }

    private void a(String s, Map map)
    {
        if (s.length() >= 3)
        {
            try
            {
                s = ((List)b.a(c, s)).iterator();
                while (s.hasNext()) 
                {
                    User user = (User)s.next();
                    if (!n.a(user.A()))
                    {
                        map.put(user.c(), user);
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.facebook.debug.log.b.a("orca:ContactPickerFriendsOfFriendsFilter", "Failed to get result", s);
                return;
            }
        }
    }

    private void a(List list, et et1)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (User)list.next();
            com.facebook.user.UserFbidIdentifier userfbididentifier = ((User) (obj)).i();
            if (userfbididentifier == null)
            {
                com.facebook.debug.log.b.b("orca:ContactPickerFriendsOfFriendsFilter", (new StringBuilder()).append("Skipping user with no FBID: ").append(obj).toString());
            } else
            if (!a(userfbididentifier.c()))
            {
                obj = new UserWithIdentifier(((User) (obj)), userfbididentifier);
                et1.b(a.a(obj));
            }
        } while (true);
    }

    protected i b(CharSequence charsequence)
    {
        e e1;
        i j;
        e.b(10L);
        e1 = e.a("ContactPickerFriendFilter.Filtering");
        j = new i();
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        Object obj = charsequence.toString().trim();
_L5:
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        Object obj1 = ik.b();
        a(((String) (obj)), ((Map) (obj1)));
        obj = hq.a(((Map) (obj1)).values());
        obj1 = es.e();
        a(((List) (obj)), ((et) (obj1)));
        obj = l.a(charsequence, ((et) (obj1)).b());
        j.a = obj;
        j.b = ((l) (obj)).c();
_L6:
        e1.a();
        e.c("orca:ContactPickerFriendsOfFriendsFilter");
        return j;
_L2:
        obj = "";
          goto _L5
_L4:
        j.a = l.a(charsequence);
        j.b = -1;
          goto _L6
        Exception exception;
        exception;
        com.facebook.debug.log.b.c("orca:ContactPickerFriendsOfFriendsFilter", "Exception during filtering", exception);
        j.a = l.b(charsequence);
        j.b = 0;
        e1.a();
        e.c("orca:ContactPickerFriendsOfFriendsFilter");
        return j;
        charsequence;
        e1.a();
        e.c("orca:ContactPickerFriendsOfFriendsFilter");
        throw charsequence;
          goto _L5
    }
}
