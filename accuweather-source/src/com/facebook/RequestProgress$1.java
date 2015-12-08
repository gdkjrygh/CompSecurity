// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            RequestProgress

class val.maxProgressCopy
    implements Runnable
{

    final RequestProgress this$0;
    final Callback val$callbackCopy;
    final long val$currentCopy;
    final long val$maxProgressCopy;

    public void run()
    {
        val$callbackCopy.onProgress(val$currentCopy, val$maxProgressCopy);
    }

    Callback()
    {
        this$0 = final_requestprogress;
        val$callbackCopy = callback;
        val$currentCopy = l;
        val$maxProgressCopy = J.this;
        super();
    }
}
