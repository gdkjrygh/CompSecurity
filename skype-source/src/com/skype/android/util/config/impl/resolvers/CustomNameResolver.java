// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl.resolvers;

import com.skype.android.util.Log;
import com.skype.android.util.config.impl.ConfigParseException;
import com.skype.android.util.config.impl.NameResolver;
import com.skype.android.video.common.PlatformInfo;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomNameResolver
    implements NameResolver
{
    private static class CpuFileNameFilter
        implements FileFilter
    {

        private final Pattern CpuPattern;

        public boolean accept(File file)
        {
            return CpuPattern.matcher(file.getName()).matches();
        }

        private CpuFileNameFilter()
        {
            CpuPattern = Pattern.compile("cpu[0-9]+");
        }

    }

    private static final class KnownNames extends Enum
    {

        private static final KnownNames $VALUES[];
        public static final KnownNames numCpuCores;
        public static final KnownNames screenSize;

        public static KnownNames valueOf(String s)
        {
            return (KnownNames)Enum.valueOf(com/skype/android/util/config/impl/resolvers/CustomNameResolver$KnownNames, s);
        }

        public static KnownNames[] values()
        {
            return (KnownNames[])$VALUES.clone();
        }

        static 
        {
            numCpuCores = new KnownNames("numCpuCores", 0);
            screenSize = new KnownNames("screenSize", 1);
            $VALUES = (new KnownNames[] {
                numCpuCores, screenSize
            });
        }

        private KnownNames(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String PREFIX = "custom/";

    public CustomNameResolver()
    {
    }

    private static int getNumCpuCores()
    {
        int i;
        try
        {
            i = (new File("/sys/devices/system/cpu/")).listFiles(new CpuFileNameFilter()).length;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Utils", 6))
            {
                Log.e("Utils", "Could not get number of CPU cores", runtimeexception);
            }
            return 0;
        }
        return i;
    }

    private static float getScreenDiagonalInches()
    {
        PlatformInfo platforminfo = PlatformInfo.getInstance();
        return (float)Math.sqrt(platforminfo.getScreenWidthDp() * platforminfo.getScreenWidthDp() + platforminfo.getScreenHeightDp() * platforminfo.getScreenHeightDp()) / 160F;
    }

    public String getPrefix()
    {
        return "custom/";
    }

    public String getValue(String s)
        throws ConfigParseException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$skype$android$util$config$impl$resolvers$CustomNameResolver$KnownNames[];

            static 
            {
                $SwitchMap$com$skype$android$util$config$impl$resolvers$CustomNameResolver$KnownNames = new int[KnownNames.values().length];
                try
                {
                    $SwitchMap$com$skype$android$util$config$impl$resolvers$CustomNameResolver$KnownNames[KnownNames.numCpuCores.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$util$config$impl$resolvers$CustomNameResolver$KnownNames[KnownNames.screenSize.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.util.config.impl.resolvers.CustomNameResolver.KnownNames[KnownNames.valueOf(s).ordinal()])
        {
        default:
            throw new ConfigParseException((new StringBuilder("Name 'custom/")).append(s).append("' in unknown").toString());

        case 1: // '\001'
            return Integer.toString(getNumCpuCores());

        case 2: // '\002'
            return String.format("%.1f", new Object[] {
                Float.valueOf(getScreenDiagonalInches())
            });
        }
    }
}
