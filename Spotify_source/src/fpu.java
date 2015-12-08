// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellLoggerService;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public final class fpu
    implements fqa
{

    final ObjectMapper a;
    final fpt b;
    final Resolver c;
    final Handler d = new Handler();
    final de e;
    boolean f;
    final Set g = new HashSet();
    private final WeakReference h;
    private BroadcastReceiver i;

    public fpu(Context context, Resolver resolver, fpt fpt1)
    {
        h = new WeakReference(context);
        c = resolver;
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL).a();
        b = fpt1;
        e = de.a(context);
    }

    static Request a(String s, String s1, boolean flag, boolean flag1, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup)
    {
        s = Uri.parse("hm://upsell-service").buildUpon().appendPath("v1").appendPath("upsell").appendQueryParameter("locale", s1).appendQueryParameter("device_id", s).appendQueryParameter("eligible_optin_trial", String.valueOf(flag)).appendQueryParameter("purchase_allowed", String.valueOf(flag1));
        s1 = reasongroup.mReasons;
        int k = s1.length;
        for (int j = 0; j < k; j++)
        {
            reasongroup = s1[j];
            if (reasongroup.a())
            {
                s.appendQueryParameter("ad_slot", ((Reason) (reasongroup)).mAdSlotName);
            }
        }

        return new Request("GET", s.build().toString());
    }

    public final void a()
    {
        c.destroy();
        d.removeCallbacksAndMessages(null);
        g.clear();
        e.a(i);
    }

    public final void a(com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration)
    {
        Context context = (Context)h.get();
        if (context == null)
        {
            Assertion.b("Attempted to log impression without context.");
            return;
        }
        adslotconfiguration = adslotconfiguration.mImpression;
        if (TextUtils.isEmpty(adslotconfiguration))
        {
            Assertion.b("Attempted to log to empty target or with empty action.");
            return;
        } else
        {
            DynamicUpsellLoggerService.a(context, com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellLoggerService.Action.a, adslotconfiguration);
            return;
        }
    }

    final void a(DynamicUpsellConfig dynamicupsellconfig, fpx fpx)
    {
        Object obj = dynamicupsellconfig.values();
        dynamicupsellconfig = ((gft)dmz.a(gft)).a();
        fpx = new fpw(new HashSet(((Collection) (obj))), fpx);
        obj = ((Collection) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration = (com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration)((Iterator) (obj)).next();
            if (!TextUtils.isEmpty(adslotconfiguration.mBackgroundImage))
            {
                Uri uri = Uri.parse(adslotconfiguration.mBackgroundImage);
                gwi gwi = new gwi(adslotconfiguration, fpx) {

                    private com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration a;
                    private fpw b;
                    private fpu c;

                    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
                    {
                        sv.a(bitmap).a(new fpy(a, b));
                        c.g.remove(this);
                    }

                    public final void a(Drawable drawable)
                    {
                        c.g.remove(this);
                        b.a(a);
                    }

                    public final void b(Drawable drawable)
                    {
                    }

            
            {
                c = fpu.this;
                a = adslotconfiguration;
                b = fpw1;
                super();
            }
                };
                g.add(gwi);
                dynamicupsellconfig.a(uri).a(gwi);
            } else
            {
                fpx.a(adslotconfiguration);
            }
            if (!TextUtils.isEmpty(adslotconfiguration.mIcon))
            {
                dynamicupsellconfig.a(Uri.parse(adslotconfiguration.mIcon)).e();
            }
        } while (true);
    }

    public final void a(fqb fqb1, boolean flag, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup)
    {
        Optional optional;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        optional = b.a();
        if (optional.b()) goto _L2; else goto _L1
_L1:
        int j = 0;
_L3:
        if (j != 0)
        {
            DynamicUpsellConfig dynamicupsellconfig;
            Reason areason[];
            int k;
            if (((DynamicUpsellConfig)optional.c()).findEarliestExpiry(reasongroup) < System.currentTimeMillis())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j == 0)
            {
                a((DynamicUpsellConfig)optional.c(), new fpx() {

                    public final void a()
                    {
                    }

                });
                fqb1.a(optional);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_157;
_L2:
        dynamicupsellconfig = (DynamicUpsellConfig)optional.c();
        areason = reasongroup.mReasons;
        k = areason.length;
        j = 0;
_L4:
label0:
        {
            if (j >= k)
            {
                break MISSING_BLOCK_LABEL_145;
            }
            if (dynamicupsellconfig.getConfigForType(areason[j]) != null)
            {
                break label0;
            }
            j = 0;
        }
          goto _L3
        j++;
          goto _L4
        j = 1;
          goto _L3
        fpv fpv1 = new fpv(fqb1, reasongroup) {

            private fqb a;
            private com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup b;
            private fpu c;

            public final void a(Request request)
            {
                request.getUri();
                Resolver resolver = c.c;
                fpu fpu1 = c;
                fqb fqb2 = a;
                com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup1 = b;
                resolver.resolve(request, fpu1. new JsonCallbackReceiver(fpu1.d, com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig, fpu1.a, reasongroup1, fqb2) {

                    final com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup a;
                    final fqb b;
                    final fpu c;

                    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                    {
                        Logger.b(throwable, "(upsell) Unable to retreive from upsell service", new Object[0]);
                        c.b.b();
                        b.a(Optional.e());
                    }

                    protected final void onResolved(Response response, Object obj)
                    {
                        response = (DynamicUpsellConfig)obj;
                        c.a(response, new fpx(this, response) {

                            private DynamicUpsellConfig a;
                            private _cls3 b;

                            public final void a()
                            {
                                DynamicUpsellConfig dynamicupsellconfig = b.c.b.a(a, b.a);
                                fpu fpu1 = b.c;
                                DynamicUpsellConfig dynamicupsellconfig1 = a;
                                Iterator iterator = dynamicupsellconfig1.keySet().iterator();
                                do
                                {
                                    if (!iterator.hasNext())
                                    {
                                        break;
                                    }
                                    Reason reason = Reason.a((String)iterator.next());
                                    if (reason != null && reason.mImpressionOnLoad)
                                    {
                                        fpu1.a(dynamicupsellconfig1.getConfigForType(reason));
                                    }
                                } while (true);
                                b.b.a(dynamicupsellconfig);
                            }

            
            {
                b = _pcls3;
                a = dynamicupsellconfig;
                super();
            }
                        });
                    }

            
            {
                c = fpu.this;
                a = reasongroup;
                b = fqb1;
                super(handler, class1, objectmapper);
            }
                });
            }

            
            {
                c = fpu.this;
                a = fqb1;
                b = reasongroup;
                super();
            }
        };
        String s = ((gcz)dmz.a(gcz)).e();
        com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State state;
        if (gcl.j)
        {
            fqb1 = Locale.getDefault().toLanguageTag();
        } else
        {
            fqb1 = Locale.getDefault().getLanguage();
        }
        state = CheckOptInTrialEligibilityTask.a();
        if (state == com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a)
        {
            if (!f)
            {
                i = new BroadcastReceiver(s, fqb1, reasongroup, fpv1) {

                    private String a;
                    private String b;
                    private com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup c;
                    private fpv d;
                    private fpu e;

                    public final void onReceive(Context context, Intent intent)
                    {
                        e.e.a(this);
                        e.f = false;
                        context = CheckOptInTrialEligibilityTask.a();
                        boolean flag2 = ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a();
                        intent = a;
                        String s1 = b;
                        boolean flag1;
                        if (context == com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.b)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        context = fpu.a(intent, s1, flag1, flag2, c);
                        d.a(context);
                    }

            
            {
                e = fpu.this;
                a = s;
                b = s1;
                c = reasongroup;
                d = fpv1;
                super();
            }
                };
                e.a(i, new IntentFilter("opt-in-trial-eligibility-received"));
                f = true;
                return;
            } else
            {
                return;
            }
        }
        if (state == com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fpv1.a(a(s, ((String) (fqb1)), flag, ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a(), reasongroup));
        return;
    }

    public final void b(com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration)
    {
        Context context = (Context)h.get();
        if (context == null)
        {
            Assertion.b("Attempted to log impression without context.");
            return;
        }
        if (adslotconfiguration.mActionButton != null)
        {
            adslotconfiguration = adslotconfiguration.mActionButton.mTrackingUrl;
        } else
        {
            adslotconfiguration = "";
        }
        if (TextUtils.isEmpty(adslotconfiguration))
        {
            Assertion.b("Attempted to log to empty target or with empty action.");
            return;
        } else
        {
            DynamicUpsellLoggerService.a(context, com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellLoggerService.Action.b, adslotconfiguration);
            return;
        }
    }

    public final void c(com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration)
    {
        Context context = (Context)h.get();
        if (context == null)
        {
            Assertion.b("Attempted to execute callback without context.");
            return;
        }
        if (adslotconfiguration.mActionButton != null)
        {
            adslotconfiguration = adslotconfiguration.mActionButton.mUrl;
        } else
        {
            adslotconfiguration = null;
        }
        if (TextUtils.isEmpty(adslotconfiguration))
        {
            Assertion.b("Attempted to execute callback without valid url");
            return;
        } else
        {
            DynamicUpsellLoggerService.a(context, com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellLoggerService.Action.c, adslotconfiguration);
            return;
        }
    }
}
