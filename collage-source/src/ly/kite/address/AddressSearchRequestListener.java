// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import java.util.List;

// Referenced classes of package ly.kite.address:
//            AddressSearchRequest, Address

public interface AddressSearchRequestListener
{

    public abstract void onError(AddressSearchRequest addresssearchrequest, Exception exception);

    public abstract void onMultipleChoices(AddressSearchRequest addresssearchrequest, List list);

    public abstract void onUniqueAddress(AddressSearchRequest addresssearchrequest, Address address);
}
