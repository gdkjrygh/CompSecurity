// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.phunware.nbc.sochi.NBCSportsApplication;
import rx.Subscriber;
import rx.Subscription;
import timber.log.Timber;

// Referenced classes of package air.com.nbcuni.com.nbcsports.liveextra:
//            MainSupportWrapperActivity

class this._cls0 extends Subscriber
{

    final MainSupportWrapperActivity this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.i(throwable, throwable.getMessage(), new Object[0]);
        if (isFinishing())
        {
            return;
        } else
        {
            runOnUiThread(new Runnable() {

                final MainSupportWrapperActivity._cls1 this$1;

                public void run()
                {
                    (new android.app.AlertDialog.Builder(this$0)).setTitle(getString(0x7f0700b6)).setMessage(0x7f0700b7).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$2;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            if (isFinishing())
                            {
                                return;
                            } else
                            {
                                finish();
                                return;
                            }
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    }).create().show();
                }

            
            {
                this$1 = MainSupportWrapperActivity._cls1.this;
                super();
            }
            });
            return;
        }
    }

    public void onNext(Boolean boolean1)
    {
        if (!boolean1.booleanValue())
        {
            onError(new Exception());
            return;
        }
        boolean1 = NBCSportsApplication.component().entitlementService();
        boolean1.setDefaultRequestor();
        if (configuration.get().isInitAdobePassOnAppStart())
        {
            boolean1.start();
        }
        MainSupportWrapperActivity.access$000(MainSupportWrapperActivity.this).unsubscribe();
        MainSupportWrapperActivity.access$100(MainSupportWrapperActivity.this);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Boolean)obj);
    }

    _cls1.this._cls1()
    {
        this$0 = MainSupportWrapperActivity.this;
        super();
    }
}
