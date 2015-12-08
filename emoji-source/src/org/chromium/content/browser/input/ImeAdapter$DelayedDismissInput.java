// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;


// Referenced classes of package org.chromium.content.browser.input:
//            ImeAdapter

private class mNativeImeAdapter
    implements Runnable
{

    private long mNativeImeAdapter;
    final ImeAdapter this$0;

    void detach()
    {
        mNativeImeAdapter = 0L;
    }

    public void run()
    {
        if (mNativeImeAdapter != 0L)
        {
            attach(mNativeImeAdapter, ImeAdapter.sTextInputTypeNone, ImeAdapter.sTextInputFlagNone);
        }
        ImeAdapter.access$000(ImeAdapter.this, true);
    }

    (long l)
    {
        this$0 = ImeAdapter.this;
        super();
        mNativeImeAdapter = l;
    }
}
