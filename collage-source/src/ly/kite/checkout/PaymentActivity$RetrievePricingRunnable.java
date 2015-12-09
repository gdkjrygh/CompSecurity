// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;


// Referenced classes of package ly.kite.checkout:
//            PaymentActivity

private class <init>
    implements Runnable
{

    final PaymentActivity this$0;

    public void run()
    {
        requestPrices();
    }

    private ()
    {
        this$0 = PaymentActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
