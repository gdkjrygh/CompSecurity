// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class mRequestBody extends oV
{

    private final String mRequestBody;

    public final pn getRequestPayload()
    {
        return new pu(mRequestBody);
    }

    public final String getUrl()
    {
        return "";
    }

    public >(String s)
    {
        mRequestBody = s;
    }
}
