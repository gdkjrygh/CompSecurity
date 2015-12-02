// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.fbservice.ops.c;
import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaContactsPreferenceActivity, y

class r extends h
{

    final OrcaContactsPreferenceActivity a;

    r(OrcaContactsPreferenceActivity orcacontactspreferenceactivity)
    {
        a = orcacontactspreferenceactivity;
        super();
    }

    public void a(OperationResult operationresult)
    {
        OrcaContactsPreferenceActivity.a(a).d();
        OrcaContactsPreferenceActivity.a(a, y.FINISHED_SUCCESS);
    }

    public void a(ServiceException serviceexception)
    {
        OrcaContactsPreferenceActivity.a(a).d();
        OrcaContactsPreferenceActivity.a(a, y.FINISHED_ERROR);
    }
}
