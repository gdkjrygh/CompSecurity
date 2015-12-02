// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import com.facebook.contacts.b.a;
import com.facebook.contacts.data.i;
import com.facebook.contacts.data.k;
import com.facebook.contacts.data.m;
import com.facebook.contacts.data.o;
import com.facebook.contacts.server.FetchContactsParams;
import com.facebook.contacts.server.FetchContactsResult;
import com.facebook.contacts.server.UploadBulkContactChange;
import com.facebook.contacts.server.UploadBulkContactChangeResult;
import com.facebook.contacts.server.UploadBulkContactsParams;
import com.facebook.contacts.server.UploadBulkContactsResult;
import com.facebook.contacts.server.af;
import com.facebook.contacts.server.ag;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.g;
import com.facebook.http.protocol.aq;
import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.prefs.shared.d;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.UserPhoneNumber;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.ex;
import com.google.common.a.ey;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.upload:
//            g, h, i, ContactsUploadState, 
//            a

public class f
    implements e
{

    private static final String a = com/facebook/contacts/upload/f.getName();
    private final javax.inject.a b;
    private final javax.inject.a c;
    private final com.facebook.contacts.g.k d;
    private final com.facebook.contacts.g.i e;
    private final m f;
    private final d g;
    private final k h;
    private final PhoneNumberUtil i;
    private final a j;
    private final javax.inject.a k;
    private final ObjectMapper l;

    public f(javax.inject.a a1, javax.inject.a a2, com.facebook.contacts.g.k k1, com.facebook.contacts.g.i i1, m m1, d d1, k k2, 
            PhoneNumberUtil phonenumberutil, a a3, javax.inject.a a4, ObjectMapper objectmapper)
    {
        b = a1;
        c = a2;
        d = k1;
        e = i1;
        f = m1;
        g = d1;
        h = k2;
        i = phonenumberutil;
        j = a3;
        k = a4;
        l = objectmapper;
    }

    private es a(UploadBulkContactsResult uploadbulkcontactsresult)
    {
        et et1 = es.e();
        uploadbulkcontactsresult = uploadbulkcontactsresult.b().iterator();
        do
        {
            if (uploadbulkcontactsresult.hasNext())
            {
                UploadBulkContactChangeResult uploadbulkcontactchangeresult = (UploadBulkContactChangeResult)uploadbulkcontactsresult.next();
                switch (com.facebook.contacts.upload.g.a[uploadbulkcontactchangeresult.a().ordinal()])
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    af af1 = uploadbulkcontactchangeresult.d();
                    if (a(af1))
                    {
                        et1.b(uploadbulkcontactchangeresult);
                    } else
                    {
                        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Not including contact ").append(uploadbulkcontactchangeresult).append(", confidence ").append(af1).append(" too low.").toString());
                    }
                    break;
                }
            } else
            {
                return et1.b();
            }
        } while (true);
    }

    private ex a(ev ev1, es es1)
    {
        ey ey1 = ex.j();
        for (es1 = es1.iterator(); es1.hasNext();)
        {
            UploadBulkContactChangeResult uploadbulkcontactchangeresult = (UploadBulkContactChangeResult)es1.next();
            Object obj = uploadbulkcontactchangeresult.b();
            String s = uploadbulkcontactchangeresult.c();
            obj = (UploadBulkContactChange)ev1.get(obj);
            if (obj == null)
            {
                com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Got change result that did not match a local contact ID, skipping: ").append(uploadbulkcontactchangeresult).toString());
            } else
            {
                Iterator iterator = ((UploadBulkContactChange) (obj)).b().k().iterator();
                while (iterator.hasNext()) 
                {
                    String s1 = ((UserPhoneNumber)iterator.next()).b();
                    try
                    {
                        ey1.a(s, i.parse(s1, null));
                    }
                    catch (NumberParseException numberparseexception)
                    {
                        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Error parsing invalid phone number: ").append(s1).append(" Error: ").append(numberparseexception).toString());
                    }
                }
            }
        }

        return ey1.a();
    }

    private fi a(UploadBulkContactsResult uploadbulkcontactsresult, h h1)
    {
        fk fk1;
        Iterator iterator;
        uploadbulkcontactsresult = a(uploadbulkcontactsresult);
        fk1 = fi.e();
        iterator = uploadbulkcontactsresult.iterator();
_L4:
        UploadBulkContactChangeResult uploadbulkcontactchangeresult;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        uploadbulkcontactchangeresult = (UploadBulkContactChangeResult)iterator.next();
        uploadbulkcontactsresult = null;
        com.facebook.contacts.upload.g.b[h1.ordinal()];
        JVM INSTR tableswitch 1 2: default 72
    //                   1 93
    //                   2 102;
           goto _L1 _L2 _L3
_L1:
        boolean flag;
        if (uploadbulkcontactsresult != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        fk1.b(uploadbulkcontactsresult);
        if (true) goto _L4; else goto _L2
_L2:
        uploadbulkcontactsresult = uploadbulkcontactchangeresult.b();
          goto _L1
_L3:
        uploadbulkcontactsresult = uploadbulkcontactchangeresult.c();
          goto _L1
        return fk1.b();
    }

    private String a(ad ad1, com.facebook.contacts.e.e e1, com.facebook.contacts.upload.i i1, int j1, String s, boolean flag, fk fk1)
    {
        HashSet hashset;
        HashSet hashset1;
        HashSet hashset2;
        g g1;
        int k1;
        ew ew1 = ev.k();
        g1 = ad1.c();
        hashset = new HashSet();
        hashset1 = new HashSet();
        hashset2 = new HashSet();
        k1 = 0;
        ad1 = s;
        s = ew1;
_L3:
        Object obj1 = e1.e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        i1.a = i1.a + 1;
        if (!a(((User) (obj1))))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        Object obj;
        obj = j.a(((User) (obj1)).k(), 20);
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got contact events for user: ").append(obj1).append(": ").append(obj).toString());
_L1:
        s.b(((User) (obj1)).b(), new UploadBulkContactChange(((User) (obj1)).b(), ((User) (obj1)), com.facebook.contacts.server.ad.ADD, ((java.util.List) (obj))));
        int l1 = k1 + 1;
        k1 = l1;
        obj = s;
        obj1 = ad1;
        if (l1 < j1)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        s = s.b();
        ad1 = a(((String) (ad1)), ((ev) (s)));
        hashset2.addAll(s.i_());
        s = a(((UploadBulkContactsResult) (ad1)), h.LOCAL_CONTACT_IDS);
        hashset.addAll(s);
        hashset1.addAll(a(((UploadBulkContactsResult) (ad1)), ((Set) (s))));
        ad1 = ad1.a();
        k1 = i1.b;
        i1.b = s.size() + k1;
        boolean flag1 = false;
        s = ev.k();
        k1 = ((flag1) ? 1 : 0);
        obj = s;
        obj1 = ad1;
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        g1.a(OperationResult.a(com.facebook.contacts.upload.ContactsUploadState.a(i1.a, i1.b, i1.c)));
        k1 = ((flag1) ? 1 : 0);
        obj = s;
        obj1 = ad1;
        break MISSING_BLOCK_LABEL_524;
        obj = es.d();
          goto _L1
        obj = ad1;
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        s = s.b();
        ad1 = a(((String) (ad1)), ((ev) (s)));
        hashset2.addAll(s.i_());
        s = a(((UploadBulkContactsResult) (ad1)), h.LOCAL_CONTACT_IDS);
        hashset.addAll(s);
        hashset1.addAll(a(((UploadBulkContactsResult) (ad1)), ((Set) (s))));
        ad1 = ad1.a();
        j1 = i1.b;
        i1.b = s.size() + j1;
        obj = ad1;
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        g1.a(OperationResult.a(com.facebook.contacts.upload.ContactsUploadState.a(i1.a, i1.b, i1.c)));
        obj = ad1;
        e1.c();
        fk1.b(a(((Set) (hashset2)), ((Set) (hashset)), ((Set) (hashset1))));
        return ((String) (obj));
        ad1;
        e1.c();
        fk1.b(a(((Set) (hashset2)), ((Set) (hashset)), ((Set) (hashset1))));
        throw ad1;
        s = ((String) (obj));
        ad1 = ((ad) (obj1));
        if (true) goto _L3; else goto _L2
_L2:
    }

    private Set a(UploadBulkContactsResult uploadbulkcontactsresult, Set set)
    {
        fk fk1 = fi.e();
        uploadbulkcontactsresult = uploadbulkcontactsresult.b().iterator();
        while (uploadbulkcontactsresult.hasNext()) 
        {
            String s = ((UploadBulkContactChangeResult)uploadbulkcontactsresult.next()).b();
            boolean flag;
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            fk1.b(s);
        }
        return kl.a(fk1.b(), set);
    }

    private Set a(Set set, Set set1, Set set2)
    {
        HashSet hashset = new HashSet();
        hashset.addAll(set);
        hashset.removeAll(set1);
        hashset.removeAll(set2);
        return hashset;
    }

    private void a(ev ev1, UploadBulkContactsResult uploadbulkcontactsresult)
    {
        ev1 = a(ev1, a(uploadbulkcontactsresult));
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Inserting phone indexes for contacts: ").append(ev1).toString());
        f.a(ev1);
    }

    private void a(Set set)
    {
        set = l.writeValueAsString(set);
        h.b(i.e, set);
    }

    private boolean a(af af1)
    {
        switch (g.c[af1.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    private boolean a(User user)
    {
        Object obj;
        boolean flag;
        if (user.a() == n.ADDRESS_BOOK)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        obj = user.d();
        if (obj == null || ((Name) (obj)).f().length() == 0)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Skipping contact: ").append(user).append(" (no name)").toString());
            return false;
        }
        obj = user.j();
        es es1 = user.k();
        if (((es) (obj)).isEmpty() && es1.isEmpty())
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Skipping contact: ").append(user).append(" (no emails or phones)").toString());
            return false;
        } else
        {
            return true;
        }
    }

    private OperationResult b(ad ad1)
    {
        Object obj = (com.facebook.contacts.e.e)b.b();
        Object obj1 = ((com.facebook.contacts.e.e) (obj)).b();
        com.facebook.contacts.e.e e1 = (com.facebook.contacts.e.e)b.b();
        e1.a(((java.util.Collection) (obj1)));
        int i1 = ((com.facebook.contacts.e.e) (obj)).d() + e1.d();
        obj1 = ad1.c();
        if (obj1 != null)
        {
            ((g) (obj1)).a(OperationResult.a(com.facebook.contacts.upload.ContactsUploadState.a(0, 0, i1)));
        }
        obj1 = new com.facebook.contacts.upload.i(i1);
        int j1 = Integer.valueOf(g.a(com.facebook.contacts.upload.a.g, "-1")).intValue();
        i1 = j1;
        if (j1 == -1)
        {
            i1 = 100;
        }
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Starting upload of ").append(((com.facebook.contacts.upload.i) (obj1)).c).append(" contacts ").append("(batch size ").append(i1).append(")").toString());
        boolean flag = ((Boolean)k.b()).booleanValue();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Contacts interaction events upload permitted: ").append(flag).toString());
        fk fk1 = fi.e();
        com.facebook.debug.log.b.b(a, "Starting frequent contacts upload...");
        obj = a(ad1, ((com.facebook.contacts.e.e) (obj)), ((com.facebook.contacts.upload.i) (obj1)), i1, null, flag, fk1);
        com.facebook.debug.log.b.b(a, "Starting remaining contacts upload...");
        a(ad1, e1, ((com.facebook.contacts.upload.i) (obj1)), i1, ((String) (obj)), flag, fk1);
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Done uploading contacts (import ID ").append(((String) (obj))).append(")").toString());
        ad1 = fk1.b();
        a(ad1);
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Invitable contacts stored: ").append(ad1.size()).toString());
        if (flag)
        {
            g.b().a(com.facebook.contacts.upload.a.e, true).a();
        }
        return OperationResult.b();
    }

    UploadBulkContactsResult a(String s, ev ev1)
    {
        Object obj;
        Object obj1;
        com.facebook.debug.d.e e1;
        int i1;
        com.facebook.debug.d.e.b(7L);
        e1 = com.facebook.debug.d.e.a((new StringBuilder()).append("uploadUserBatch (").append(ev1.size()).append(" changes)").toString());
        String s1;
        aq aq1;
        boolean flag;
        if (s == null)
        {
            s1 = "(new import)";
        } else
        {
            s1 = s;
        }
        i1 = 0;
        flag = false;
        obj = null;
_L2:
        if (flag || i1 >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Uploading user batch ").append(s1).append(" (").append(ev1.size()).append(" changes)").toString());
        obj1 = new UploadBulkContactsParams(s, es.a(ev1.c()));
        aq1 = (aq)c.b();
        obj1 = (UploadBulkContactsResult)aq1.a(d, obj1);
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got upload result: ").append(obj1).toString());
        obj = a(((UploadBulkContactsResult) (obj1)), h.REMOTE_CONTACT_IDS);
        if (((fi) (obj)).size() > 0)
        {
            obj = new FetchContactsParams(((fi) (obj)));
            obj = (FetchContactsResult)aq1.a(e, obj);
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got fetch result: ").append(obj).toString());
            f.a(((FetchContactsResult) (obj)).a(), o.INSERT);
            a(ev1, ((UploadBulkContactsResult) (obj1)));
        }
        flag = true;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        IOException ioexception1;
        ioexception1;
        IOException ioexception;
        obj = obj1;
        ioexception = ioexception1;
_L3:
        i1++;
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Failed to upload user batch, (try ").append(i1).append(" of ").append(3).append("), error: ").append(ioexception).toString());
        if (i1 >= 3)
        {
            com.facebook.debug.log.b.e(a, "Giving up uploading user batch.");
            throw ioexception;
        }
        if (true) goto _L2; else goto _L1
_L1:
        e1.a(0L);
        com.facebook.debug.d.e.c(a);
        boolean flag1;
        if (obj != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1);
        return ((UploadBulkContactsResult) (obj));
        ioexception;
          goto _L3
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (com.facebook.contacts.server.d.m.equals(operationtype))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}
