// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.payment;


// Referenced classes of package ly.kite.payment:
//            PayPalCard

public interface PayPalCardVaultStorageListener
{

    public abstract void onError(PayPalCard paypalcard, Exception exception);

    public abstract void onStoreSuccess(PayPalCard paypalcard);
}
