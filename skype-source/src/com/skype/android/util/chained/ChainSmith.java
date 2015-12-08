// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.chained;


// Referenced classes of package com.skype.android.util.chained:
//            LinkSmith, AbstractChainedRetriever, Retriever

public class ChainSmith
{

    public ChainSmith()
    {
    }

    public static transient Retriever a(Object obj, LinkSmith alinksmith[])
    {
        new ChainSmith();
        Object obj1 = null;
        int j = alinksmith.length;
        for (int i = 0; i < j; i++)
        {
            Object obj2 = alinksmith[i];
            if (((LinkSmith) (obj2)).isApplicable(obj))
            {
                obj2 = ((LinkSmith) (obj2)).createRetriever(obj);
                ((AbstractChainedRetriever) (obj2)).setDelegate(((Retriever) (obj1)));
                obj1 = obj2;
            }
        }

        return ((Retriever) (obj1));
    }
}
