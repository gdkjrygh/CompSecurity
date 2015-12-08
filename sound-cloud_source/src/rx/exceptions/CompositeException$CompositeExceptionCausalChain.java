// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;


// Referenced classes of package rx.exceptions:
//            CompositeException

static final class  extends RuntimeException
{

    static String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
    private static final long serialVersionUID = 0x35c7853e403cebd2L;

    public final String getMessage()
    {
        return MESSAGE;
    }


    ()
    {
    }
}
