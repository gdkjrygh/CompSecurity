// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import aoo;
import aoz;
import com.facebook.model.GraphUser;
import java.util.ArrayList;

// Referenced classes of package com.facebook:
//            AuthorizationClient

final class a
    implements aoo
{

    private ArrayList a;

    public final void a(aoz aoz1)
    {
        try
        {
            aoz1 = (GraphUser)aoz1.a(com/facebook/model/GraphUser);
        }
        // Misplaced declaration of an exception variable
        catch (aoz aoz1)
        {
            return;
        }
        if (aoz1 == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        a.add(aoz1.getId());
    }

    (ArrayList arraylist)
    {
        a = arraylist;
        super();
    }
}
