// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.chained;


// Referenced classes of package com.skype.android.util.chained:
//            Retriever

public abstract class AbstractChainedRetriever
    implements Retriever
{

    Retriever _flddelegate;

    public AbstractChainedRetriever()
    {
    }

    public Retriever getDelegate()
    {
        return _flddelegate;
    }

    public final Object getValue()
    {
        Object obj1 = tryGetValue();
        Object obj = obj1;
        if (needFurtherInquiry(obj1))
        {
            obj = _flddelegate.getValue();
            onInquiryResult(obj);
        }
        return obj;
    }

    protected abstract boolean needFurtherInquiry(Object obj);

    protected void onInquiryResult(Object obj)
    {
    }

    public void setDelegate(Retriever retriever)
    {
        _flddelegate = retriever;
    }

    protected abstract Object tryGetValue();
}
