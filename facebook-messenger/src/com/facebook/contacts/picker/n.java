// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.debug.log.b;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.e;
import com.facebook.widget.a.i;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.a;

// Referenced classes of package com.facebook.contacts.picker:
//            a, o, v, l

public class n extends com.facebook.contacts.picker.a
{

    private final a b;

    public n(a a1)
    {
        b = a1;
    }

    private void a(String s, Map map)
    {
        e e1;
        e1 = (e)b.b();
        e1.a(s, 30);
_L1:
        s = e1.c();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        map.put(s.c(), s);
          goto _L1
        s;
        e1.d();
        throw s;
        e1.d();
        return;
    }

    private void a(List list)
    {
        Collections.sort(list, new o(this));
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
            User user = (User)list.next();
            com.facebook.user.UserFbidIdentifier userfbididentifier = user.i();
            if (userfbididentifier == null)
            {
                com.facebook.debug.log.b.b("orca:ContactPickerFriendFilter", (new StringBuilder()).append("Skipping user with no FBID: ").append(user).toString());
            } else
            if (!a(userfbididentifier.c()))
            {
                et1.b(a.a(new UserWithIdentifier(user, userfbididentifier)));
            }
        } while (true);
    }

    protected i b(CharSequence charsequence)
    {
        com.facebook.debug.d.e e1;
        i j;
        com.facebook.debug.d.e.b(10L);
        e1 = com.facebook.debug.d.e.a("ContactPickerFriendFilter.Filtering");
        j = new i();
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        Object obj = charsequence.toString().trim();
_L5:
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        Object obj1 = ik.a();
        a(((String) (obj)), ((Map) (obj1)));
        obj = hq.a(((Map) (obj1)).values());
        a(((List) (obj)));
        obj1 = es.e();
        a(((List) (obj)), ((et) (obj1)));
        obj = com.facebook.contacts.picker.l.a(charsequence, ((et) (obj1)).b());
        j.a = obj;
        j.b = ((l) (obj)).c();
_L6:
        e1.a();
        com.facebook.debug.d.e.c("orca:ContactPickerFriendFilter");
        return j;
_L2:
        obj = "";
          goto _L5
_L4:
        j.a = com.facebook.contacts.picker.l.a(charsequence);
        j.b = -1;
          goto _L6
        Exception exception;
        exception;
        com.facebook.debug.log.b.c("orca:ContactPickerFriendFilter", "Exception during filtering", exception);
        j.a = com.facebook.contacts.picker.l.b(charsequence);
        j.b = 0;
        e1.a();
        com.facebook.debug.d.e.c("orca:ContactPickerFriendFilter");
        return j;
        charsequence;
        e1.a();
        com.facebook.debug.d.e.c("orca:ContactPickerFriendFilter");
        throw charsequence;
          goto _L5
    }
}
