// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive;

import com.addlive.impl.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Constants
{
    public static final class AECModes
    {

        public static final int DISABLED = 0;
        public static final int EARPIECE = 2;
        public static final int HEADSET = 1;
        public static final int LOUD_EARPIECE = 3;
        public static final int LOUD_SPEAKERPHONE = 5;
        public static final int SPEAKERPHONE = 4;

        public AECModes()
        {
        }
    }

    public static final class MediaIssue
    {

        public static final int CONNECTION_FROZEN = 1;
        public static final int CPU_LOAD_HIGH = 2;
        public static final int LOW_BANDWIDTH = 4;
        public static final int NETWORK_PROBLEM = 3;

        public MediaIssue()
        {
        }
    }

    public static final class MediaStatsDirection
    {

        public static final int DOWNLINK = 1;
        public static final int UPLINK = 0;

        public MediaStatsDirection()
        {
        }
    }

    public static final class NSModes
    {

        public static final int CONFERENCE = 2;
        public static final int DEFAULT = 1;
        public static final int DISABLED = 0;
        public static final int HIGH_SUPPRESSION = 5;
        public static final int LOW_SUPPRESSION = 3;
        public static final int MODERATE_SUPPRESSION = 4;
        public static final int VERY_HIGH_SUPPRESSION = 6;

        public NSModes()
        {
        }
    }

    public static final class NetworkTest
    {

        public static final int AVERAGE = 1;
        public static final int BAD = 2;
        public static final int FINE = 0;

        public NetworkTest()
        {
        }
    }


    public static final String LOG_TAG = "AddLive_SDK";
    public static final int MAX_SIZE_MESSAGE = 5120;
    private static Properties compileTimeProps = null;

    public Constants()
    {
    }

    public static String SDK_VERSION()
    {
        if (compileTimeProps == null)
        {
            try
            {
                compileTimeProps = new Properties();
                InputStream inputstream = com/addlive/Constants.getClassLoader().getResourceAsStream("consts.properties");
                compileTimeProps.load(inputstream);
                inputstream.close();
            }
            catch (IOException ioexception)
            {
                Log.e("AddLive_SDK", "Failed to read the compile time properties", ioexception);
            }
        }
        return compileTimeProps.getProperty("nativeSdk.version");
    }

}
