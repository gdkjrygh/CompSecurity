// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Pair;
import android.widget.TextView;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.ui.player.PlayerActivity;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.phunware.nbc.sochi.system.NBCSystem;
import dagger.Lazy;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.subscriptions.CompositeSubscription;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AuthDelegate, BlackoutService, AnvatoService, MvpdLookups, 
//            Channel, AuthService, AnvatoResponse

public class PlaybackDelegate extends AuthDelegate
{
    public static interface Callback
    {

        public abstract void authenticate();

        public abstract void onPlaybackDismiss();
    }

    private class NullCallback
        implements Callback
    {

        final PlaybackDelegate this$0;

        public void authenticate()
        {
        }

        public void onPlaybackDismiss()
        {
        }

        private NullCallback()
        {
            this$0 = PlaybackDelegate.this;
            super();
        }

    }


    Lazy anvatoService;
    private final Asset asset;
    Lazy blackoutService;
    private Callback callback;
    Configuration config;
    private final Context context;
    private Handler handler;
    MvpdLookups lookups;
    private final com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageInfo;
    AuthService pass;
    private ProgressDialog progressDialog;
    private String resource;
    private final CompositeSubscription subscriptions = new CompositeSubscription();
    private String token;
    TrackingHelper trackingHelper;

    public PlaybackDelegate(Context context1, Asset asset1, com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageinfo, Callback callback1)
    {
        callback = new NullCallback();
        handler = new Handler(Looper.getMainLooper());
        asset = asset1;
        MainNavigationContentActivity.component().inject(this);
        context = context1;
        pageInfo = pageinfo;
        callback = callback1;
    }

    private Subscription checkBlackout()
    {
        return ((BlackoutService)blackoutService.get()).getBlackoutStatus(asset.getBlackoutId()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlaybackDelegate this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    subscriptions.add(checkEntitlement());
                    return;
                }
                if (!NBCSystem.IS_GEO_LOCATION_ENABLED)
                {
                    showLocationErrorDialog();
                    return;
                } else
                {
                    showErrorDialog(context.getString(0x7f07017a), context.getString(0x7f07006b));
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((Boolean)obj);
            }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }
        });
    }

    private Subscription checkEntitlement()
    {
        return ((AnvatoService)anvatoService.get()).getEntitlementStatus(asset.getEntitlementId(), asset.getChannel()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlaybackDelegate this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d("Error while checking anvato entitlement", new Object[] {
                    throwable
                });
                handler.post(new Runnable() {

                    final _cls5 this$1;

                    public void run()
                    {
                        showErrorDialog(context.getString(0x7f070179), context.getString(0x7f070178));
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
            }

            public volatile void onNext(Object obj)
            {
                onNext((String)obj);
            }

            public void onNext(String s)
            {
                handler.post(s. new Runnable() {

                    final _cls5 this$1;
                    final String val$entitled;

                    public void run()
                    {
                        if (TextUtils.isEmpty(entitled))
                        {
                            sendSuccess(token, resource);
                            return;
                        } else
                        {
                            showErrorDialog(context.getString(0x7f07017a), context.getString(0x7f07006b));
                            return;
                        }
                    }

            
            {
                this$1 = final__pcls5;
                entitled = String.this;
                super();
            }
                });
            }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }
        });
    }

    private Subscription checkMvpdBlackout()
    {
        return ((AnvatoService)anvatoService.get()).getMvpdBlackoutStatus(asset.getBlackoutId(), asset.getChannel()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PlaybackDelegate this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
                Timber.d("Error while checking blackout restriction", new Object[] {
                    throwable
                });
                pass.checkAuthorization(asset.getChannel());
            }

            public void onNext(AnvatoResponse anvatoresponse)
            {
                if (anvatoresponse == null)
                {
                    subscriptions.add(checkEntitlement());
                    return;
                } else
                {
                    handler.post(anvatoresponse. new Runnable() {

                        final _cls4 this$1;
                        final AnvatoResponse val$response;

                        public void run()
                        {
                            Pair pair = response.getError(config, context.getResources());
                            if (pair != null)
                            {
                                showErrorDialog((String)pair.first, (String)pair.second);
                                return;
                            } else
                            {
                                showErrorDialog(context.getString(0x7f07017a), context.getString(0x7f07006b));
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls4;
                response = AnvatoResponse.this;
                super();
            }
                    });
                    return;
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((AnvatoResponse)obj);
            }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }
        });
    }

    private void createProgressDialog()
    {
        progressDialog = ProgressDialog.show(context, context.getString(0x7f070067), "");
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final PlaybackDelegate this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                callback.onPlaybackDismiss();
            }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }
        });
        progressDialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final PlaybackDelegate this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                subscriptions.unsubscribe();
            }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }
        });
    }

    private void showErrorDialog(final String title, String s)
    {
        if (context == null || ((Activity)context).isFinishing())
        {
            return;
        } else
        {
            final TextView messageView = new TextView(context);
            int i = context.getResources().getDimensionPixelSize(0x7f090071);
            messageView.setPadding(i, i, i, i);
            s = new SpannableString(s);
            Linkify.addLinks(s, 1);
            messageView.setText(s);
            messageView.setMovementMethod(LinkMovementMethod.getInstance());
            progressDialog.dismiss();
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final PlaybackDelegate this$0;
                final TextView val$messageView;
                final String val$title;

                public void run()
                {
                    (new android.app.AlertDialog.Builder(context)).setTitle(title).setView(messageView).setCancelable(false).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                        final _cls6 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            callback.onPlaybackDismiss();
                            NBCSystem.GEO_LOCATION_RETRY = true;
                        }

            
            {
                this$1 = _cls6.this;
                super();
            }
                    }).create().show();
                }

            
            {
                this$0 = PlaybackDelegate.this;
                title = s;
                messageView = textview;
                super();
            }
            });
            return;
        }
    }

    private void showLocationErrorDialog()
    {
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            final PlaybackDelegate this$0;

            public void run()
            {
                progressDialog.dismiss();
                callback.onPlaybackDismiss();
                NBCSystem.GEO_LOCATION_RETRY = true;
                (new android.app.AlertDialog.Builder(context)).setTitle(0x7f07017a).setMessage(0x7f070069).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final _cls7 this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                    final _cls7 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                }).setPositiveButton("Open Location Settings", new android.content.DialogInterface.OnClickListener() {

                    final _cls7 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                }).create().show();
            }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }
        });
    }

    public void authorize()
    {
        if (asset.isFree())
        {
            sendSuccess(null, null);
            return;
        }
        createProgressDialog();
        Channel channel = (Channel)lookups.getChannels().get(asset.getChannel().toLowerCase());
        if (!pass.setRequestor(channel))
        {
            showErrorDialog(context.getString(0x7f070064), context.getString(0x7f070063));
            return;
        } else
        {
            pass.checkAuthorization(asset.getChannel());
            return;
        }
    }

    public void sendSuccess(String s, String s1)
    {
        if (progressDialog != null)
        {
            progressDialog.dismiss();
        }
        Intent intent = new Intent(context, com/nbcsports/liveextra/ui/player/PlayerActivity);
        intent.putExtra("asset", asset);
        if (s != null)
        {
            intent.putExtra("token", s);
            intent.putExtra("resource", s1);
        }
        context.startActivity(intent);
        if (pageInfo != null)
        {
            trackingHelper.trackPageEvent(pageInfo);
            trackingHelper.trackEventLink(pageInfo, asset.getCoalescedEventId(), asset.getTitle());
        }
        callback.onPlaybackDismiss();
    }

    public void setToken(String s, String s1)
    {
        token = s;
        resource = s1;
        super.setToken(s, s1);
        if (TextUtils.equals(asset.getSport(), "nbc-nascar"))
        {
            subscriptions.add(checkMvpdBlackout());
            return;
        } else
        {
            subscriptions.add(checkBlackout());
            return;
        }
    }

    public void tokenRequestFailed(String s, String s1, String s2)
    {
        byte byte0;
        super.tokenRequestFailed(s, s1, s2);
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 72
    //                   -1798052747: 125
    //                   -1463613947: 141
    //                   -1082188897: 157
    //                   -330798807: 189
    //                   411962232: 205
    //                   1528439253: 173;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        String s3;
        s = s1;
        s3 = s2;
        byte0;
        JVM INSTR tableswitch 0 4: default 112
    //                   0 221
    //                   1 238
    //                   2 117
    //                   3 117
    //                   4 117;
           goto _L8 _L9 _L10 _L11 _L11 _L11
_L10:
        break MISSING_BLOCK_LABEL_238;
_L11:
        break; /* Loop/switch isn't completed */
_L8:
        s3 = s2;
        s = s1;
_L12:
        showErrorDialog(s, s3);
        return;
_L2:
        if (s1.equals("User Not Authenticated Error"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s1.equals("User not Authorized Error"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (s1.equals("Provider not Selected Error"))
        {
            byte0 = 2;
        }
          goto _L1
_L7:
        if (s1.equals("Provider not Available Error"))
        {
            byte0 = 3;
        }
          goto _L1
_L5:
        if (s1.equals("Generic Authentication Error"))
        {
            byte0 = 4;
        }
          goto _L1
_L6:
        if (s1.equals("Generic Authorization Error"))
        {
            byte0 = 5;
        }
          goto _L1
_L9:
        callback.authenticate();
        progressDialog.dismiss();
        return;
        s1 = context.getString(0x7f070066);
        s = s1;
        s3 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s3 = context.getString(0x7f070061);
            s = s1;
        }
          goto _L12
    }











}
