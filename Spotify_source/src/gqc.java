// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

public class gqc
    implements dmx
{

    public com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel a;
    public int b;
    public String c;
    public Offer d;
    public String e;

    public gqc()
    {
    }

    // Unreferenced inner class gqc$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.values().length];
            try
            {
                a[com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
