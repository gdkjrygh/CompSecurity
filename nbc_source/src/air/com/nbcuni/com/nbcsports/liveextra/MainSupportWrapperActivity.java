// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.nbcsports.liveextra.ui.core.BaseActivity;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.phunware.nbc.sochi.utils.DialogUtil;
import com.squareup.okhttp.OkHttpClient;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

public class MainSupportWrapperActivity extends BaseActivity
{

    public static boolean IS_DEEPLINKING_PGA = false;
    OkHttpClient client;
    RuntimeConfiguration configuration;
    private boolean deepLinkingEnabled;
    private Handler handler;
    MvpdLookups lookups;
    private String sport;
    private long startTime;
    private Subscription subscription;
    TrackingHelper trackingHelper;

    public MainSupportWrapperActivity()
    {
        handler = new Handler();
    }

    private void handleSportAliases()
    {
        String s;
        byte byte0;
        s = sport.toLowerCase();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 1664951171 1664951171: default 32
    //                   1664951171 53;
           goto _L1 _L2
_L2:
        if (s.equals("pga-2013"))
        {
            byte0 = 0;
        }
_L1:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            sport = "nbc-pga";
            break;
        }
        return;
    }

    private void start()
    {
        final Intent intent;
        if (NBCSystem.isForcedUpdateRequred(getApplicationContext()))
        {
            DialogUtil.showForcedUpdateDialog(this);
            return;
        }
        intent = new Intent(this, com/phunware/nbc/sochi/MainNavigationContentActivity);
        if (!deepLinkingEnabled) goto _L2; else goto _L1
_L1:
        intent.putExtra("DEEP_LINKING_ENABLED", true);
        if (!"home-nbcsports".equals(sport)) goto _L4; else goto _L3
_L3:
        intent.putExtra("args_deeplink_home_bool", true);
        intent.putExtra("args_deeplink_home", true);
_L2:
        long l = Math.max(5000L - (SystemClock.currentThreadTimeMillis() - startTime), 0L);
        handler.postDelayed(new Runnable() {

            final MainSupportWrapperActivity this$0;
            final Intent val$intent;

            public void run()
            {
                startActivity(intent);
                overridePendingTransition(0x10a0000, 0x10a0001);
            }

            
            {
                this$0 = MainSupportWrapperActivity.this;
                intent = intent1;
                super();
            }
        }, l);
        return;
_L4:
        if ("home-olympics".equals(sport))
        {
            intent.putExtra("args_deeplink_home_bool", true);
            continue; /* Loop/switch isn't completed */
        }
        if ("schedule".equals(sport))
        {
            intent.putExtra("args_deeplink_schedule_ontv_bool", true);
            intent.putExtra("args_deeplink_schedule_ontv", true);
            continue; /* Loop/switch isn't completed */
        }
        if ("ontv".equals(sport))
        {
            intent.putExtra("args_deeplink_schedule_ontv_bool", true);
            intent.putExtra("args_deeplink_schedule_ontv", false);
            continue; /* Loop/switch isn't completed */
        }
        intent.putExtra("args_deeplink_sports_bool", false);
        intent.putExtra("args_deeplink_schedule_ontv_bool", false);
        intent.putExtra("args_deeplink_home_bool", true);
        intent.putExtra("args_deeplink_home", false);
        Object obj = configuration.get().getSports();
        if (obj == null || ((List) (obj)).size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((List) (obj)).iterator();
        Sport sport1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            sport1 = (Sport)((Iterator) (obj)).next();
        } while (!sport1.getCode().equalsIgnoreCase(sport) && !sport1.getName().equalsIgnoreCase(sport) && !sport1.getAdCode().contains(sport));
        intent.putExtra("args_deeplink_sports_bool", true);
        intent.putExtra("args_deeplink_sport", sport1);
        intent.putExtra("args_deeplink_home_bool", false);
        if (sport.contains("PGA"))
        {
            IS_DEEPLINKING_PGA = true;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setOrientation();
        setContentView(0x7f04009e);
        bundle = getIntent().getData();
        IS_DEEPLINKING_PGA = false;
        if (bundle != null)
        {
            deepLinkingEnabled = true;
            if (!TextUtils.isEmpty(bundle.getPath()))
            {
                sport = bundle.getPath().substring(1).trim();
            } else
            if (!TextUtils.isEmpty(bundle.getHost()))
            {
                sport = bundle.getHost().trim();
            } else
            {
                sport = "";
                deepLinkingEnabled = false;
            }
            handleSportAliases();
        }
        if (!NBCSystem.isNetworkAvailable(getApplicationContext()))
        {
            DialogUtil.showNetworkNotAvailableDialog(this);
            return;
        }
        if (NBCSystem.IS_DEBUG)
        {
            Toast.makeText(getApplicationContext(), (new StringBuilder()).append("DEBUG MODE IS ON. LOCATION SERVICES ARE: ").append(NBCSystem.IS_GEO_LOCATION_ENABLED).toString(), 1).show();
        }
        startTime = SystemClock.currentThreadTimeMillis();
        bundle = (ImageView)findViewById(0x7f0f01e6);
        Animation animation = AnimationUtils.loadAnimation(this, 0x7f05000c);
        animation.setDuration(2000L);
        bundle.startAnimation(animation);
        NBCSportsApplication.component().inject(this);
        trackingHelper.trackAppLaunch(getIntent(), new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Splash", "Splash", "Splash", null));
    }

    protected void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (!NBCSystem.isNetworkAvailable(this))
        {
            return;
        }
        if (lookups == null || configuration == null)
        {
            NBCSportsApplication.component().inject(this);
            return;
        }
        if (configuration != null && configuration.get().isLoaded() && lookups.getChannels().size() > 0)
        {
            start();
            return;
        } else
        {
            subscription = lookups.checkLookups().observeOn(AndroidSchedulers.mainThread()).timeout(30L, TimeUnit.SECONDS, Observable.just(Boolean.valueOf(false))).subscribe(new Subscriber() {

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

                            final _cls1 this$1;

                            public void run()
                            {
                                (new android.app.AlertDialog.Builder(_fld0)).setTitle(getString(0x7f0700b6)).setMessage(0x7f0700b7).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

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
                this$1 = _cls1.this;
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
                    subscription.unsubscribe();
                    start();
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Boolean)obj);
                }

            
            {
                this$0 = MainSupportWrapperActivity.this;
                super();
            }
            });
            return;
        }
    }



}
