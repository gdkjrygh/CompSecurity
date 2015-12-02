// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.telephony.PhoneNumberUtils;
import com.facebook.contacts.e.e;
import com.facebook.contacts.picker.a;
import com.facebook.contacts.picker.l;
import com.facebook.contacts.picker.t;
import com.facebook.contacts.picker.v;
import com.facebook.debug.log.b;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.user.User;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserPhoneNumber;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.s;
import com.facebook.widget.a.i;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            n, j

public class m extends a
{

    private static final Class b = com/facebook/orca/contacts/picker/m;
    private final javax.inject.a c;
    private final javax.inject.a d;

    public m(javax.inject.a a1, javax.inject.a a2)
    {
        c = a1;
        d = a2;
    }

    private void a(String s1, Map map)
    {
        e e1;
        e1 = (e)c.b();
        e1.a(s1, 30);
_L2:
        s1 = e1.e();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (!s1.n()) goto _L2; else goto _L1
_L1:
        map.put(s1.c(), s1);
          goto _L2
        s1;
        e1.c();
        throw s1;
        e1.c();
        return;
    }

    private void a(List list)
    {
        Collections.sort(list, new n(this));
    }

    private void a(List list, et et1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            User user = (User)list.next();
            Iterator iterator = user.k().iterator();
            while (iterator.hasNext()) 
            {
                UserPhoneNumber userphonenumber = (UserPhoneNumber)iterator.next();
                if (!a(userphonenumber.c()))
                {
                    et1.b(a.a(new UserWithIdentifier(user, userphonenumber)));
                }
            }
        }

    }

    protected i b(CharSequence charsequence)
    {
        com.facebook.debug.d.e e1;
        i k;
        com.facebook.debug.d.e.b(10L);
        e1 = com.facebook.debug.d.e.a("ContactPickerAddressBookFilter.Filtering");
        k = new i();
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        Object obj = charsequence.toString().trim();
_L5:
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        Object obj1;
        et et1;
        boolean flag;
        obj1 = ik.a();
        a(((String) (obj)), ((Map) (obj1)));
        obj1 = hq.a(((Map) (obj1)).values());
        a(((List) (obj1)));
        et1 = es.e();
        flag = PhoneNumberUtils.isWellFormedSmsAddress(((String) (obj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        obj = PhoneNumberUtil.convertAlphaCharactersInNumber(((String) (obj)));
        et1.b(new j(((String) (obj)), s.PHONE));
_L7:
        a(((List) (obj1)), et1);
        if (!((Boolean)d.b()).booleanValue() || !flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        et1.b(new t(((String) (obj))));
        obj = l.a(charsequence, et1.b());
        k.a = obj;
        k.b = ((l) (obj)).c();
_L6:
        e1.a();
        com.facebook.debug.d.e.a(b);
        return k;
_L2:
        obj = "";
          goto _L5
_L4:
        k.a = l.a(charsequence);
        k.b = -1;
          goto _L6
        obj;
        com.facebook.debug.log.b.d(b, "Exception during filtering", ((Throwable) (obj)));
        k.a = l.b(charsequence);
        k.b = 0;
        e1.a();
        com.facebook.debug.d.e.a(b);
        return k;
        charsequence;
        e1.a();
        com.facebook.debug.d.e.a(b);
        throw charsequence;
        obj = null;
          goto _L7
    }

}
