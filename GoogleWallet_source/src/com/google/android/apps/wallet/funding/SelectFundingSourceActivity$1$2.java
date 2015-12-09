// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.common.base.Optional;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            SelectFundingSourceActivity

final class this._cls1
    implements AsyncCallback
{

    final onSuccess this$1;

    private void onSuccess(Void void1)
    {
        SelectFundingSourceActivity.access$000(_fld0).setEnabled(true);
    }

    public final void onFailure(Exception exception)
    {
        SelectFundingSourceActivity.access$000(_fld0).toggle();
        SelectFundingSourceActivity.access$000(_fld0).setEnabled(true);
        CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.ored_balance_title, com.google.android.apps.walletnfcrel.ored_balance_message).d().show(getSupportFragmentManager());
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Void)obj);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/funding/SelectFundingSourceActivity$1

/* anonymous class */
    final class SelectFundingSourceActivity._cls1
        implements android.view.View.OnClickListener
    {

        final SelectFundingSourceActivity this$0;

        public final void onClick(View view)
        {
            SelectFundingSourceActivity.access$000(SelectFundingSourceActivity.this).setEnabled(false);
            actionExecutor.executeAction(new SelectFundingSourceActivity._cls1._cls1(), new SelectFundingSourceActivity._cls1._cls2());
        }

            
            {
                this$0 = SelectFundingSourceActivity.this;
                super();
            }

        // Unreferenced inner class com/google/android/apps/wallet/funding/SelectFundingSourceActivity$1$1

/* anonymous class */
        final class SelectFundingSourceActivity._cls1._cls1
            implements Callable
        {

            final SelectFundingSourceActivity._cls1 this$1;

            private Void call()
                throws Exception
            {
                tapAndPayModelPublisher.enableStoredValue(((StoredValueEvent)SelectFundingSourceActivity.access$100(this$0).get()).getModel().getStoredValue(), ((PaymentCardModelEvent)SelectFundingSourceActivity.access$200(this$0).get()).getModel().getAllCredentials(), SelectFundingSourceActivity.access$000(this$0).isChecked());
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

                    
                    {
                        this$1 = SelectFundingSourceActivity._cls1.this;
                        super();
                    }
        }

    }

}
