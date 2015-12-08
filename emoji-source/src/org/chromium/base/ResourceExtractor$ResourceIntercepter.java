// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.io.InputStream;
import java.util.Set;

// Referenced classes of package org.chromium.base:
//            ResourceExtractor

public static interface 
{

    public abstract Set getInterceptableResourceList();

    public abstract InputStream interceptLoadingForResource(String s);
}
