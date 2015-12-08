// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.dialog.trialactivation.TrialActivationActivity;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.consumables.ConfirmConsumablePurchaseActivity;
import com.spotify.mobile.android.ui.activity.upsell.consumables.ConsumablePeriod;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class fri
{

    ClientInfo a;
    com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel b;
    fsg c;
    boolean d;
    boolean e;
    boolean f;
    String g;
    ConsumablePeriod h;
    int i;
    private frx j;
    private UserEligibilityRepository k;

    public fri(UserEligibilityRepository usereligibilityrepository, frx frx1, fsg fsg1)
    {
        a = (ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo);
        cvp.a(usereligibilityrepository);
        cvp.a(frx1);
        cvp.a(fsg1);
        k = usereligibilityrepository;
        j = frx1;
        c = fsg1;
    }

    private void a(Offer offer, Reason reason, String s, String s1, String s2, String s3, Verified verified)
    {
        boolean flag = false;
        if (!Arrays.asList(new String[] {
    "close", "get"
}).contains(s2))
        {
            Assertion.b(String.format(Locale.US, "Attempted to log invalid offer interaction: %s", new Object[] {
                s2
            }));
        } else
        {
            flag = fst.a(reason, s1, s3);
        }
        if (!flag)
        {
            offer = Optional.e();
        } else
        {
            offer = Optional.b(new dns(String.valueOf(offer), s, reason.mMappedReason, s1, s2, s3, verified.toString()));
        }
        if (offer.b())
        {
            j.a((dnj)offer.c());
        }
    }

    public void a()
    {
        k.b();
        c.a();
        k = null;
        j = null;
        a = null;
        d = true;
    }

    public void a(SessionState sessionstate)
    {
        if (k instanceof eda)
        {
            ((eda)k).a(sessionstate);
        }
    }

    public final void a(Reason reason, String s, String s1, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, Offer offer, String s2)
    {
        a(offer, reason, s, s1, "get", s2, verified);
        s = j;
        if (offer != null) goto _L2; else goto _L1
_L1:
        s.a(verified, subview, Uri.parse(String.format("https://www.spotify.com/redirect/generic/?redirect_key=android_%s&utm_source=Spotify&utm_medium=website_mobile", new Object[] {
            "premium"
        })), null, ((frx) (s)).c);
_L4:
        return;
_L2:
        int l;
        switch (frx._cls1.a[offer.getProductType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            reason = Uri.parse(String.format("https://www.spotify.com/redirect/generic/?redirect_key=android_%s&utm_source=Spotify&utm_medium=website_mobile", new Object[] {
                "premium"
            }));
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (offer.isTrial() && offer.getDurationType() == com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.DAY)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!offer.isTrial() && offer.getDurationType() == com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.MONTH && offer.getDuration() == 3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (offer.getDuration() == 7 && flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2)
            {
                reason = (Context)((frx) (s)).a.get();
                if (reason != null)
                {
                    if (((frx) (s)).b)
                    {
                        reason.startActivity(new Intent(reason, com/spotify/mobile/android/ui/activity/dialog/trialactivation/TrialActivationActivity));
                        return;
                    } else
                    {
                        fop.a(reason, verified, subview);
                        return;
                    }
                }
            } else
            {
                if (flag)
                {
                    s.a(verified, subview, reason, null, ((frx) (s)).c);
                    return;
                }
                if (flag1)
                {
                    s.a(verified, subview, Uri.parse((new StringBuilder()).append(reason.toString()).append("&intro-offer=1").toString()), null, ((frx) (s)).c);
                    return;
                } else
                {
                    s.a(verified, subview, reason, null, ((frx) (s)).c);
                    return;
                }
            }
            break;

        case 2: // '\002'
            s1 = Uri.parse(String.format("https://www.spotify.com/redirect/generic/?redirect_key=android_%s&utm_source=Spotify&utm_medium=website_mobile", new Object[] {
                "plus"
            }));
            reason = (Context)((frx) (s)).a.get();
            if (reason == null)
            {
                reason = "";
            } else
            {
                reason = reason.getString(0x7f08040c);
            }
            s.a(verified, subview, s1, reason, ((frx) (s)).c);
            return;

        case 3: // '\003'
            reason = offer.getFormattedPrice();
            l = offer.getDuration();
            s1 = offer.getConsumablePeriod();
            s = (Context)((frx) (s)).a.get();
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s == null) goto _L4; else goto _L5
_L5:
        s.startActivity(ConfirmConsumablePurchaseActivity.a(s, reason, l, s1));
        return;
    }

    public final void a(Offer offer, Reason reason, String s, String s1, String s2, Verified verified)
    {
        a(offer, reason, s, s1, "close", s2, verified);
    }

    public final void a(Offer offer, String s, Reason reason, String s1, String s2, Verified verified)
    {
        fst.a(reason, s1, s2);
        offer = Optional.b(new dnq(String.valueOf(offer), s, reason.mMappedReason, s1, s2, verified.toString()));
        if (offer.b())
        {
            j.a((dnj)offer.c());
        }
    }

    public final void a(frj frj)
    {
        k.a(new fsk(frj) {

            private frj a;
            private fri b;

            public final void a(com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel eligibilitylevel)
            {
                boolean flag1 = false;
                if (!b.d) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Object obj1;
                frj frj1;
                obj1 = b;
                frj1 = a;
                if (!((fri) (obj1)).f || TextUtils.isEmpty(((fri) (obj1)).g)) goto _L4; else goto _L3
_L3:
                ConsumablePeriod consumableperiod = (ConsumablePeriod)cvp.a(((fri) (obj1)).h);
                final class _cls3
                {

                    static final int a[];
                    static final int b[];

                    static 
                    {
                        b = new int[ConsumablePeriod.values().length];
                        try
                        {
                            b[ConsumablePeriod.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            b[ConsumablePeriod.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            b[ConsumablePeriod.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        a = new int[com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.values().length];
                        try
                        {
                            a[com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls3.b[consumableperiod.ordinal()];
                JVM INSTR tableswitch 1 3: default 88
            //                           1 216
            //                           2 274
            //                           3 281;
                   goto _L5 _L6 _L7 _L8
_L5:
                boolean flag;
                Assertion.a(String.format("mConsumablePeriod value not mapped: %s. You must create a mapping between ConsumablePeriod and Offer.DurationType", new Object[] {
                    consumableperiod.name()
                }));
                flag = true;
_L11:
                if (flag) goto _L1; else goto _L9
_L9:
                fri fri1 = b;
                obj1 = a;
                flag = flag1;
                if (fri1.e)
                {
                    ((frj) (obj1)).a(new Offer(0, com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.DAY, false, com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PLUS, null));
                    flag = true;
                }
                if (flag) goto _L1; else goto _L10
_L6:
                obj = com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.HOUR;
_L12:
                HashMap hashmap = new HashMap();
                hashmap.put("formatted", ((fri) (obj1)).g);
                frj1.a(new Offer(((fri) (obj1)).i, ((com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType) (obj)), false, com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PLUS_CONSUMABLE, hashmap, consumableperiod));
                flag = true;
                  goto _L11
_L7:
                obj = com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.DAY;
                  goto _L12
_L8:
                obj = com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.WEEK;
                  goto _L12
_L4:
                flag = false;
                  goto _L11
_L10:
                b.b = eligibilitylevel;
                Object obj;
                if (b.b == com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.a)
                {
                    a.a(new Offer(CheckOptInTrialEligibilityTask.b(), com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.DAY, true, com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PREMIUM, null));
                    return;
                }
                if (!b.a.a())
                {
                    a.a();
                    return;
                }
                switch (_cls3.a[b.b.ordinal()])
                {
                default:
                    a.a(null);
                    return;

                case 1: // '\001'
                    eligibilitylevel = b;
                    break;
                }
                obj = a;
                ((fri) (eligibilitylevel)).c.a(eligibilitylevel. new fsh(((frj) (obj))) {

                    private frj a;
                    private fri b;

                    public final void a()
                    {
                        if (b.d)
                        {
                            return;
                        } else
                        {
                            a.a(null);
                            return;
                        }
                    }

                    public final void a(Offer offer)
                    {
                        if (b.d)
                        {
                            return;
                        } else
                        {
                            a.a(offer);
                            return;
                        }
                    }

            
            {
                b = fri.this;
                a = frj1;
                super();
            }
                });
                return;
            }

            
            {
                b = fri.this;
                a = frj1;
                super();
            }
        });
    }
}
