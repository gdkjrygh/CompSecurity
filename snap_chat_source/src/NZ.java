// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class NZ
{

    public final AA mMediabryo;
    public final boolean mShouldGoToSendTo;

    public NZ(AA aa)
    {
        this(aa, false);
    }

    public NZ(AA aa, boolean flag)
    {
        if (aa == null)
        {
            throw new NullPointerException();
        } else
        {
            mMediabryo = aa;
            mShouldGoToSendTo = flag;
            return;
        }
    }
}
