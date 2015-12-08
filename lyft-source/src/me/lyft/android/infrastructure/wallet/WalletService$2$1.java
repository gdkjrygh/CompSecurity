// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.wallet;

import android.content.Intent;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;
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
        if (activityresult.getRequestCode() == 19)
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

    // Unreferenced inner class me/lyft/android/infrastructure/wallet/WalletService$2

/* anonymous class */
    class WalletService._cls2
        implements Func1
    {

        final WalletService this$0;

        public volatile Object call(Object obj)
        {
            return call((ActivityResult)obj);
        }

        public Observable call(ActivityResult activityresult)
        {
            if (activityresult.getResultCode() == -1)
            {
                activityresult = (MaskedWallet)activityresult.getIntent().getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                activityresult = FullWalletRequest.a().a(activityresult.b()).a();
                Wallet.b.a(WalletService.access$100(WalletService.this).getApi(), activityresult, 19);
                return WalletService.access$200(WalletService.this).first(new WalletService._cls2._cls1());
            }
            if (activityresult.getResultCode() == 0)
            {
                return Observable.empty();
            } else
            {
                return Observable.error(WalletService.access$000(WalletService.this, activityresult.getIntent()));
            }
        }

            
            {
                this$0 = WalletService.this;
                super();
            }
    }

}
