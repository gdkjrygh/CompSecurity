// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Wn extends Wl
{

    private final Wg e;

    public Wn(Wg wg)
    {
        e = wg;
    }

    protected final String a()
    {
        return "VideoDecoderRunnable";
    }

    public final void run()
    {
        try
        {
            while (!b) 
            {
                if (a)
                {
                    c();
                    d();
                }
                e.a();
            }
        }
        catch (Wy wy)
        {
            if (!b)
            {
                c = false;
            }
            d = (new StringBuilder("TranscodingException, ")).append(wy.toString()).toString();
            (new StringBuilder("TranscodingException: ")).append(wy.toString());
            wy.printStackTrace();
        }
        catch (Throwable throwable)
        {
            c = false;
            d = (new StringBuilder("General Exception, ")).append(throwable.toString()).toString();
            (new StringBuilder("General Exception: ")).append(throwable.toString());
            throwable.printStackTrace();
            return;
        }
    }
}
