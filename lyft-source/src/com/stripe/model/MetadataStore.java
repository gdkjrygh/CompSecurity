// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.RequestOptions;
import java.util.Map;

public interface MetadataStore
{

    public abstract Map getMetadata();

    public abstract MetadataStore update(Map map);

    public abstract MetadataStore update(Map map, RequestOptions requestoptions);
}
