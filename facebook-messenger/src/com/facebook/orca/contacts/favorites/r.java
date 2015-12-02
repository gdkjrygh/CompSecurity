// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            EditFavoritesActivity

class r extends ac
{

    final EditFavoritesActivity a;

    r(EditFavoritesActivity editfavoritesactivity)
    {
        a = editfavoritesactivity;
        super();
    }

    public void a(OperationResult operationresult)
    {
        EditFavoritesActivity.a(a, null);
        EditFavoritesActivity.g(a).b();
        EditFavoritesActivity.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        EditFavoritesActivity.a(a, null);
        EditFavoritesActivity.g(a).b();
        EditFavoritesActivity.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
