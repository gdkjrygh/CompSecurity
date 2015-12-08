// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.PriorityBlockingQueue;

final class ang.Object
    implements Runnable
{

    private asr a;

    public final void run()
    {
        Object obj = a;
        try
        {
            while (!((asr) (obj)).c.booleanValue()) 
            {
                Object obj1 = ((asr) (obj)).a.take();
                ((asr) (obj)).b.a(obj1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        catch (Exception exception)
        {
            axt.a("Error occurred dispating message.", exception);
            ((asr) (obj)).b.a("Error occurred dispating message.", exception);
            return;
        }
    }

    (asr asr1)
    {
        a = asr1;
        super();
    }
}
