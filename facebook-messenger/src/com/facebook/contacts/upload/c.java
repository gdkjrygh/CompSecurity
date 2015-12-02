// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.a.e;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.f.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.ops.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.contacts.upload:
//            ContactsUploadState, k, a, ContactsUploadProgressMode, 
//            d, e

public class c
    implements b
{

    private static final String a = com/facebook/contacts/upload/c.getName();
    private final k b;
    private final e c;
    private final d d;
    private final av e;
    private boolean f;
    private ContactsUploadState g;
    private ContactsUploadProgressMode h;
    private n i;

    public c(k k1, e e1, d d1, av av1)
    {
        b = k1;
        c = e1;
        d = d1;
        e = av1;
    }

    static n a(c c1, n n1)
    {
        c1.i = n1;
        return n1;
    }

    static String a(c c1)
    {
        return c1.h();
    }

    private void a(ContactsUploadState contactsuploadstate, ContactsUploadProgressMode contactsuploadprogressmode)
    {
        Intent intent = new Intent();
        intent.setAction("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        intent.putExtra("state", contactsuploadstate);
        intent.putExtra("progress_mode", contactsuploadprogressmode);
        c.a(intent);
    }

    static void a(c c1, ContactsUploadState contactsuploadstate)
    {
        c1.b(contactsuploadstate);
    }

    private void a(ae ae, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = a(ae);
        if (flag != flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.facebook.prefs.shared.e e1 = d.b();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        e1.a(ae, true);
_L4:
        e1.a();
        if (true) goto _L1; else goto _L3
        ae;
        throw ae;
_L3:
        e1.a(ae);
          goto _L4
    }

    private boolean a(ContactsUploadState contactsuploadstate)
    {
        return contactsuploadstate.a() == k.SUCCEEDED || contactsuploadstate.a() == k.FAILED;
    }

    private boolean a(ae ae)
    {
        return d.a(ae, false);
    }

    static av b(c c1)
    {
        return c1.e;
    }

    private void b(ContactsUploadState contactsuploadstate)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        g = contactsuploadstate;
        this;
        JVM INSTR monitorexit ;
        if (!a(contactsuploadstate)) goto _L2; else goto _L1
_L1:
        a(com.facebook.contacts.upload.a.b, false);
        ae ae = a.c;
        boolean flag;
        if (contactsuploadstate.a() == k.SUCCEEDED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(ae, flag);
        ae = com.facebook.contacts.upload.a.d;
        if (contactsuploadstate.a() == k.FAILED)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(ae, flag);
        this;
        JVM INSTR monitorenter ;
        h = null;
        this;
        JVM INSTR monitorexit ;
_L2:
        a(contactsuploadstate, c());
        return;
        contactsuploadstate;
        this;
        JVM INSTR monitorexit ;
        throw contactsuploadstate;
        contactsuploadstate;
        this;
        JVM INSTR monitorexit ;
        throw contactsuploadstate;
    }

    static String f()
    {
        return a;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = true;
        if (!a(com.facebook.contacts.upload.a.d) && !a(com.facebook.contacts.upload.a.b))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        b(ContactsUploadState.g());
          goto _L1
        Exception exception;
        exception;
        throw exception;
        a();
          goto _L1
    }

    private String h()
    {
        return "contacts_upload";
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        ContactsUploadState contactsuploadstate;
        g();
        h = null;
        contactsuploadstate = b();
        if (contactsuploadstate == null) goto _L2; else goto _L1
_L1:
        if (!a(contactsuploadstate)) goto _L3; else goto _L2
_L2:
        b(com.facebook.contacts.upload.ContactsUploadState.e());
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Ignoring reset state request (current state: ").append(contactsuploadstate).append(")").toString());
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(ContactsUploadProgressMode contactsuploadprogressmode)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(contactsuploadprogressmode);
        g();
        if (!e()) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.a(a, "Already uploading, not uploading again");
        if (h == ContactsUploadProgressMode.SHOW_IN_DIVE_BAR_ONLY && contactsuploadprogressmode == ContactsUploadProgressMode.SHOW_IN_THREAD_LIST_AND_DIVE_BAR)
        {
            com.facebook.debug.log.b.a(a, "Upgrading progress mode to show both in thread list and in dive bar.");
            h = contactsuploadprogressmode;
            a(b(), c());
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        h = contactsuploadprogressmode;
        a(com.facebook.contacts.upload.a.b, true);
        contactsuploadprogressmode = new Bundle();
        i = b.a(com.facebook.contacts.server.d.m, contactsuploadprogressmode).a();
        i.a(new com.facebook.contacts.upload.d(this));
        com.google.common.d.a.i.a(i, new com.facebook.contacts.upload.e(this));
        e.a((new cb("contacts_upload_started")).e(h()));
        b(ContactsUploadState.f());
        if (true) goto _L4; else goto _L3
_L3:
        contactsuploadprogressmode;
        throw contactsuploadprogressmode;
    }

    public ContactsUploadState b()
    {
        this;
        JVM INSTR monitorenter ;
        ContactsUploadState contactsuploadstate;
        g();
        contactsuploadstate = g;
        this;
        JVM INSTR monitorexit ;
        return contactsuploadstate;
        Exception exception;
        exception;
        throw exception;
    }

    public ContactsUploadProgressMode c()
    {
        this;
        JVM INSTR monitorenter ;
        ContactsUploadProgressMode contactsuploadprogressmode = h;
        this;
        JVM INSTR monitorexit ;
        return contactsuploadprogressmode;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        com.facebook.debug.log.b.b(a, "Clearing cached user data.");
        a();
        a(com.facebook.contacts.upload.a.b, false);
        a(a.c, false);
        a(com.facebook.contacts.upload.a.d, false);
    }

    public boolean e()
    {
        return i != null;
    }

}
