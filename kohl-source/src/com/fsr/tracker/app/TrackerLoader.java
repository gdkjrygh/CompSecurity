// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.content.SharedPreferences;
import com.fsr.tracker.PersistedState;
import com.fsr.tracker.TrackerStateSerializer;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrackerLoader
{

    public static final String TRACKER_STATE_KEY = "com.fsr.tracker.TRACKER_STATE_KEY";
    private static Logger logger = LoggerFactory.getLogger("ForeSee Trigger Code");

    public TrackerLoader()
    {
    }

    public static PersistedState LoadState(SharedPreferences sharedpreferences)
        throws Exception
    {
        if (sharedpreferences != null)
        {
            sharedpreferences = sharedpreferences.getString("com.fsr.tracker.TRACKER_STATE_KEY", "");
            if (!sharedpreferences.equals(""))
            {
                Matcher matcher = Pattern.compile("(xmlns:fsr=\"[\\w:/.]*v)([\\d])").matcher(sharedpreferences);
                if (matcher.find())
                {
                    int i = Integer.parseInt(matcher.group(matcher.groupCount()));
                    if (i == 2)
                    {
                        return TrackerStateSerializer.deserialize(sharedpreferences);
                    }
                    logger.warn("PersistedState, version= %s found, re-initializing", Integer.valueOf(i));
                }
            }
        }
        return new PersistedState(UUID.randomUUID().toString());
    }

    public static void SaveState(SharedPreferences sharedpreferences, PersistedState persistedstate)
        throws Exception
    {
        persistedstate = TrackerStateSerializer.serialize(persistedstate);
        logger.debug("Saving persistedState: {}", persistedstate);
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.putString("com.fsr.tracker.TRACKER_STATE_KEY", persistedstate);
        sharedpreferences.commit();
    }

}
