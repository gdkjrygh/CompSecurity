// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            x, v

public final class bb
{

    public static int a(com.google.ads.AdRequest.ErrorCode errorcode)
    {
        static class _cls1
        {

            static final int fw[];
            static final int fx[];

            static 
            {
                fx = new int[com.google.ads.AdRequest.ErrorCode.values().length];
                try
                {
                    fx[com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    fx[com.google.ads.AdRequest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    fx[com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    fx[com.google.ads.AdRequest.ErrorCode.NO_FILL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                fw = new int[com.google.ads.AdRequest.Gender.values().length];
                try
                {
                    fw[com.google.ads.AdRequest.Gender.FEMALE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    fw[com.google.ads.AdRequest.Gender.MALE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    fw[com.google.ads.AdRequest.Gender.UNKNOWN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.fx[errorcode.ordinal()])
        {
        default:
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 2;

        case 4: // '\004'
            return 3;
        }
    }

    public static int a(com.google.ads.AdRequest.Gender gender)
    {
        switch (_cls1.fw[gender.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 2;

        case 2: // '\002'
            return 1;
        }
    }

    public static AdSize a(x x1)
    {
        return new AdSize(new com.google.android.gms.ads.AdSize(x1.width, x1.height, x1.ew));
    }

    public static com.google.ads.AdRequest.Gender e(int i)
    {
        switch (i)
        {
        default:
            return com.google.ads.AdRequest.Gender.UNKNOWN;

        case 2: // '\002'
            return com.google.ads.AdRequest.Gender.FEMALE;

        case 1: // '\001'
            return com.google.ads.AdRequest.Gender.MALE;
        }
    }

    public static MediationAdRequest e(v v1)
    {
        HashSet hashset;
        if (v1.eu != null)
        {
            hashset = new HashSet(v1.eu);
        } else
        {
            hashset = null;
        }
        return new MediationAdRequest(new Date(v1.es), e(v1.et), hashset, v1.ev);
    }

    public static final com.google.ads.AdRequest.ErrorCode f(int i)
    {
        switch (i)
        {
        default:
            return com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;

        case 1: // '\001'
            return com.google.ads.AdRequest.ErrorCode.INVALID_REQUEST;

        case 2: // '\002'
            return com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR;

        case 3: // '\003'
            return com.google.ads.AdRequest.ErrorCode.NO_FILL;
        }
    }
}
