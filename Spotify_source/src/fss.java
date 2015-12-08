// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobile.android.ui.activity.upsell.consumables.ConsumablePeriod;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import java.lang.ref.WeakReference;

public final class fss
{

    public static String a(Offer offer, fry fry1)
    {
        Object obj = (Context)fry1.a.get();
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.values().length];
                try
                {
                    a[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PREMIUM.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PLUS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.ui.activity.upsell.model.Offer.ProductType.PLUS_CONSUMABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj1;
        int i;
        if (obj != null)
        {
            obj = ((Context) (obj)).getString(0x7f08040e);
        } else
        {
            obj = "";
        }
        obj1 = obj;
        if (offer == null) goto _L2; else goto _L1
_L1:
        _cls1.a[offer.getProductType().ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 68
    //                   2 280
    //                   3 305;
           goto _L3 _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_280;
_L6:
        break MISSING_BLOCK_LABEL_305;
_L3:
        obj1 = obj;
_L2:
        return ((String) (obj1));
_L4:
        if (!offer.isTrial() || offer.getDurationType() != com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.DAY)
        {
            break; /* Loop/switch isn't completed */
        }
        i = offer.getDuration();
        if (i == 7)
        {
            offer = (Context)fry1.a.get();
            if (offer != null)
            {
                return offer.getResources().getQuantityString(0x7f090018, i, new Object[] {
                    Integer.valueOf(i)
                });
            }
            break MISSING_BLOCK_LABEL_377;
        }
        offer = (Context)fry1.a.get();
        if (offer == null)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        offer.getResources().getString(0x7f08040f, new Object[] {
            Integer.toString(i)
        });
        offer = offer.getResources().getString(0x7f08040d);
        obj1 = offer;
        if (i != 30)
        {
            return offer.replace("30", Integer.toString(i));
        }
        if (true) goto _L2; else goto _L7
_L7:
        obj1 = obj;
        if (offer.isTrial()) goto _L2; else goto _L8
_L8:
        obj1 = obj;
        if (offer.getDurationType() != com.spotify.mobile.android.ui.activity.upsell.model.Offer.DurationType.MONTH) goto _L2; else goto _L9
_L9:
        i = offer.getDuration();
        offer = offer.getFormattedPrice();
        fry1 = (Context)fry1.a.get();
        if (fry1 != null)
        {
            return fry1.getResources().getQuantityString(0x7f090013, i, new Object[] {
                Integer.valueOf(i), offer
            });
        }
        break MISSING_BLOCK_LABEL_377;
        offer = (Context)fry1.a.get();
        if (offer == null)
        {
            return "";
        } else
        {
            return offer.getString(0x7f0805b0);
        }
        i = offer.getDuration();
        offer = offer.getConsumablePeriod();
        fry1 = (Context)fry1.a.get();
        if (fry1 == null)
        {
            return "";
        }
        fry1 = fry1.getResources();
        if (i == 1)
        {
            return fry1.getString(((ConsumablePeriod) (offer)).mCallToActionOneId);
        } else
        {
            return fry1.getQuantityString(((ConsumablePeriod) (offer)).mCallToActionId, i, new Object[] {
                Integer.valueOf(i)
            });
        }
        return "";
    }
}
