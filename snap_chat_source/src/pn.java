// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class pn
{
    public final class a
    {

        final byte mContentBytes[];
        final String mContentType;
        final pn this$0;

        a(String s, byte abyte0[])
        {
            this$0 = pn.this;
            super();
            mContentType = s;
            mContentBytes = abyte0;
        }
    }


    public static final Xu BYTE_STREAM_MEDIA_TYPE = Xu.a("application/octet-stream");
    public static final String REQ_TOKEN = "req_token";
    public static final String TAG = "RequestPayload";
    public static final String UTF_8 = "UTF-8";

    public pn()
    {
    }

    public abstract boolean a();

    public abstract Xz b();

    public a c()
    {
        String s = null;
        Object obj = b();
        if (obj == null)
        {
            return null;
        }
        ahX ahx = new ahX();
        ((Xz) (obj)).a(ahx);
        obj = ((Xz) (obj)).a();
        if (obj != null)
        {
            s = ((Xu) (obj)).toString();
        }
        return new a(s, ahx.o());
    }

    public boolean d()
    {
        return true;
    }

}
