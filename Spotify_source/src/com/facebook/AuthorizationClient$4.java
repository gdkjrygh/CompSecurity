// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import aoo;
import aoz;
import apc;
import java.util.ArrayList;

// Referenced classes of package com.facebook:
//            AuthorizationClient, Session

final class b
    implements aoo
{

    private ArrayList a;
    private ArrayList b;

    public final void a(aoz aoz)
    {
        try
        {
            aoz = Session.a(aoz);
        }
        // Misplaced declaration of an exception variable
        catch (aoz aoz)
        {
            return;
        }
        if (aoz == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        a.addAll(((apc) (aoz)).a);
        b.addAll(((apc) (aoz)).b);
    }

    (ArrayList arraylist, ArrayList arraylist1)
    {
        a = arraylist;
        b = arraylist1;
        super();
    }
}
