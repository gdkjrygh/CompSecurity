// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;

import java.util.Map;

// Referenced classes of package com.stripe.net:
//            RequestOptions

public interface StripeResponseGetter
{

    public abstract Object request(APIResource.RequestMethod requestmethod, String s, Map map, Class class1, APIResource.RequestType requesttype, RequestOptions requestoptions);
}
