// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import java.util.List;
import java.util.Map;
import me.lyft.android.common.INullable;

// Referenced classes of package me.lyft.android.infrastructure.lyft.constants:
//            Constants

public class AppInfo
    implements INullable
{

    String assetsUrl;
    Constants constants;
    List hints;
    String revision;
    List rideTypes;
    Map tests;

    public AppInfo()
    {
    }

    public static AppInfo empty()
    {
        return NullAppInfo.getInstance();
    }

    public String getAssetsUrl()
    {
        return assetsUrl;
    }

    public Constants getConstants()
    {
        return constants;
    }

    public List getHints()
    {
        return hints;
    }

    public String getRevision()
    {
        return revision;
    }

    public List getRideTypeMetas()
    {
        return rideTypes;
    }

    public Map getTests()
    {
        return tests;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullAppInfo extends AppInfo
    {

        private static final NullAppInfo INSTANCE = new NullAppInfo();

        static AppInfo getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        public NullAppInfo()
        {
        }
    }

}
