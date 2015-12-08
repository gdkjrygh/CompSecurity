// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ah, ad

class aj
    implements Runnable
{

    final ah a;

    private aj(ah ah1)
    {
        a = ah1;
        super();
    }

    aj(ah ah1, ad ad)
    {
        this(ah1);
    }

    public void run()
    {
        ah.b(a);
    }
}
