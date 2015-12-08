// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.chained;


// Referenced classes of package com.skype.android.util.chained:
//            AbstractChainedRetriever

public interface LinkSmith
{

    public abstract AbstractChainedRetriever createRetriever(Object obj);

    public abstract boolean isApplicable(Object obj);
}
