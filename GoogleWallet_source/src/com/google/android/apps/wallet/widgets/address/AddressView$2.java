// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            AddressView, AddressSource, AddressSourceResult

final class esult
    implements Callable
{

    final AddressView this$0;
    final AddressSourceResult val$addressSourceResult;

    private com.google.location.country.ess.PostalAddress call()
        throws Exception
    {
        for (Iterator iterator = AddressView.access$200(AddressView.this).iterator(); iterator.hasNext();)
        {
            AddressSource addresssource = (AddressSource)iterator.next();
            if (val$addressSourceResult.getSourceName().equals(addresssource.getName()))
            {
                return addresssource.getAddress(val$addressSourceResult.getReference(), "en");
            }
        }

        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    esult()
    {
        this$0 = final_addressview;
        val$addressSourceResult = AddressSourceResult.this;
        super();
    }
}
