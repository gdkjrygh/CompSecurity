// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import java.util.Map;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod

public interface 
{

    public static final String METADATA_KEY = "_meta";

    public abstract PaymentMethod build();

    public abstract PaymentMethod fromJson(String s);

    public abstract String getApiPath();

    public abstract String getApiResource();

    public abstract  integration(String s);

    public abstract  source(String s);

    public abstract Map toJson();

    public abstract String toJsonString();

    public abstract  validate(boolean flag);
}
