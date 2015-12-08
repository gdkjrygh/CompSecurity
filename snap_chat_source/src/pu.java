// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pu extends pn
{

    private final String mPayload;

    public pu(String s)
    {
        mPayload = s;
    }

    public final boolean a()
    {
        return mPayload != null && mPayload.contains("req_token");
    }

    public final Xz b()
    {
        if (mPayload == null)
        {
            return null;
        } else
        {
            return Xz.a(BYTE_STREAM_MEDIA_TYPE, mPayload.getBytes());
        }
    }
}
