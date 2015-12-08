// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.skype.android.util.chained.AbstractChainedRetriever;
import com.skype.android.util.chained.ChainSmith;
import com.skype.android.util.chained.LinkSmith;
import com.skype.android.util.chained.Retriever;

// Referenced classes of package com.skype.android.config.partner:
//            BuildConfigCobrandIDRetriever, SharedPrefsCobrandIDRetriever

public abstract class CobrandIdSource extends Enum
    implements LinkSmith
{

    private static final CobrandIdSource $VALUES[];
    public static final CobrandIdSource BUILD_CONFIG;
    public static final String COBRAND_ID_PLACEHOLDER = "0";
    public static final CobrandIdSource SHARED_PREFS;

    private CobrandIdSource(String s, int i)
    {
        super(s, i);
    }


    public static Retriever chainTogether(Application application)
    {
        return ChainSmith.a(application, values());
    }

    public static boolean isPlaceholder(String s)
    {
        return TextUtils.isEmpty(s) || "0".equals(s);
    }

    public static CobrandIdSource valueOf(String s)
    {
        return (CobrandIdSource)Enum.valueOf(com/skype/android/config/partner/CobrandIdSource, s);
    }

    public static CobrandIdSource[] values()
    {
        return (CobrandIdSource[])$VALUES.clone();
    }

    public abstract AbstractChainedRetriever createRetriever(Context context);

    public volatile AbstractChainedRetriever createRetriever(Object obj)
    {
        return createRetriever((Context)obj);
    }

    public boolean isApplicable(Context context)
    {
        return true;
    }

    public volatile boolean isApplicable(Object obj)
    {
        return isApplicable((Context)obj);
    }

    static 
    {
        BUILD_CONFIG = new CobrandIdSource("BUILD_CONFIG", 0) {

            public final AbstractChainedRetriever createRetriever(Context context)
            {
                return new BuildConfigCobrandIDRetriever();
            }

            public final volatile AbstractChainedRetriever createRetriever(Object obj)
            {
                return createRetriever((Context)obj);
            }

            public final volatile boolean isApplicable(Object obj)
            {
                return isApplicable((Context)obj);
            }

        };
        SHARED_PREFS = new CobrandIdSource("SHARED_PREFS", 1) {

            public final AbstractChainedRetriever createRetriever(Context context)
            {
                return new SharedPrefsCobrandIDRetriever(context);
            }

            public final volatile AbstractChainedRetriever createRetriever(Object obj)
            {
                return createRetriever((Context)obj);
            }

            public final volatile boolean isApplicable(Object obj)
            {
                return isApplicable((Context)obj);
            }

        };
        $VALUES = (new CobrandIdSource[] {
            BUILD_CONFIG, SHARED_PREFS
        });
    }
}
