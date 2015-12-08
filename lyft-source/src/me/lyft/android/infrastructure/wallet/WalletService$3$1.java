// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.wallet;

import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import rx.Observable;
import rx.functions.Func1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.infrastructure.wallet:
//            WalletService

class this._cls1
    implements Func1
{

    final call this$1;

    public Boolean call(ActivityResult activityresult)
    {
        boolean flag;
        if (activityresult.getRequestCode() == 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((ActivityResult)obj);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/infrastructure/wallet/WalletService$3

/* anonymous class */
    class WalletService._cls3
        implements Func1
    {

        final WalletService this$0;

        public volatile Object call(Object obj)
        {
            return call((Unit)obj);
        }

        public Observable call(Unit unit)
        {
            unit = WalletService.access$400(WalletService.access$300(WalletService.this).getStripeKey());
            Wallet.b.a(WalletService.access$100(WalletService.this).getApi(), unit, 18);
            return WalletService.access$200(WalletService.this).first(new WalletService._cls3._cls1());
        }

            
            {
                this$0 = WalletService.this;
                super();
            }
    }

}
