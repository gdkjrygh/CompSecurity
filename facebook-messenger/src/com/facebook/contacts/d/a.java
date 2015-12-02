// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.d;

import com.facebook.contacts.data.i;
import com.facebook.contacts.data.k;
import com.facebook.contacts.server.UsersInviteParams;
import com.facebook.contacts.server.d;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.aq;
import com.facebook.user.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.HashSet;
import java.util.Set;

public class a
    implements e
{

    private static final String a = com/facebook/contacts/d/a.getName();
    private final javax.inject.a b;
    private final javax.inject.a c;
    private final javax.inject.a d;
    private final k e;
    private final com.facebook.contacts.g.a.k f;
    private final ObjectMapper g;

    public a(javax.inject.a a1, javax.inject.a a2, javax.inject.a a3, k k1, com.facebook.contacts.g.a.k k2, ObjectMapper objectmapper)
    {
        b = a1;
        c = a2;
        d = a3;
        e = k1;
        f = k2;
        g = objectmapper;
    }

    private OperationResult b(ad ad1)
    {
        com.facebook.debug.log.b.b(a, "Starting Invite All");
        ad1 = e.a(i.e);
        if (ad1 == null || ad1.length() == 0)
        {
            com.facebook.debug.log.b.b(a, "No one to invite");
            return OperationResult.b();
        }
        ad1 = (HashSet)g.readValue(ad1, java/util/HashSet);
        com.facebook.contacts.e.e e1 = (com.facebook.contacts.e.e)b.b();
        e1.a();
        et et1 = es.e();
        do
        {
            User user = e1.e();
            if (user == null)
            {
                break;
            }
            if (ad1.contains(user.b()))
            {
                et1.b(user);
            }
        } while (true);
        ad1 = et1.b();
        if (ad1.size() > 0)
        {
            ad1 = new UsersInviteParams(ad1, (String)d.b());
            ((aq)c.b()).a(f, ad1);
        }
        com.facebook.debug.log.b.b(a, "Done Invite All");
        return OperationResult.b();
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (d.n.equals(operationtype))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}
