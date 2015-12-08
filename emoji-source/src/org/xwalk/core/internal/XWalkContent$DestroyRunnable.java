// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkContent

private static final class <init>
    implements Runnable
{

    private final long mNativeContent;

    public void run()
    {
        XWalkContent.access$000(mNativeContent);
    }

    private (long l)
    {
        mNativeContent = l;
    }

    mNativeContent(long l, mNativeContent mnativecontent)
    {
        this(l);
    }
}
