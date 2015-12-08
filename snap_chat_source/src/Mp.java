// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Mp
{

    public final String mId;
    public final String mMessageId;
    public final boolean mScrollToBottom;

    public Mp(String s)
    {
        this(s, null, false);
    }

    public Mp(String s, String s1)
    {
        this(s, s1, false);
    }

    private Mp(String s, String s1, boolean flag)
    {
        mId = s;
        mScrollToBottom = flag;
        mMessageId = s1;
    }

    public Mp(String s, boolean flag)
    {
        this(s, null, flag);
    }
}
