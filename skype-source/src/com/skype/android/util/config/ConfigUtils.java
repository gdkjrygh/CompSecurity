// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config;

import com.skype.android.util.Log;
import com.skype.android.util.config.impl.ConfigParseException;
import com.skype.android.util.config.impl.JsonConfigParser;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

// Referenced classes of package com.skype.android.util.config:
//            ConfigParams

public final class ConfigUtils
{

    public static final int MIN_VERSION = 1;
    public static final String TAG = "Utils";
    public static final int VERSION = 2;
    static final Pattern WINDOWS_LINE_ENDING = Pattern.compile("\r\n");

    public ConfigUtils()
    {
    }

    private static void close(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static ConfigParams evaluateFromJson(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        s = WINDOWS_LINE_ENDING.matcher(s).replaceAll("\n");
        JsonConfigParser jsonconfigparser = new JsonConfigParser();
        if (!jsonconfigparser.parse(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = jsonconfigparser.getResult();
        return s;
        s;
        if (Log.isLoggable("Utils", 6))
        {
            Log.e("Utils", "Exception caught", s);
            return null;
        }
        continue; /* Loop/switch isn't completed */
        s;
        if (Log.isLoggable("Utils", 6))
        {
            Log.e("Utils", "Exception caught", s);
            return null;
        }
        continue; /* Loop/switch isn't completed */
        s;
        if (Log.isLoggable("Utils", 6))
        {
            Log.e("Utils", "Exception caught", s);
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static ConfigParams loadFromFile(String s)
        throws IOException, ClassNotFoundException
    {
        String s1 = null;
        s = openFileForReading(s);
        s1 = s;
        ConfigParams configparams = (ConfigParams)com/skype/android/util/config/ConfigParams.cast(s.readObject());
        close(s);
        return configparams;
        s;
        close(s1);
        throw s;
    }

    private static ObjectInputStream openFileForReading(String s)
        throws IOException
    {
        s = new FileInputStream(s);
        ObjectInputStream objectinputstream;
        try
        {
            objectinputstream = new ObjectInputStream(s);
        }
        catch (IOException ioexception)
        {
            close(s);
            throw ioexception;
        }
        return objectinputstream;
    }

    private static ObjectOutputStream openFileForWriting(String s)
        throws IOException
    {
        s = new FileOutputStream(s);
        ObjectOutputStream objectoutputstream;
        try
        {
            objectoutputstream = new ObjectOutputStream(s);
        }
        catch (IOException ioexception)
        {
            close(s);
            throw ioexception;
        }
        return objectoutputstream;
    }

    public static void storeToFile(String s, ConfigParams configparams)
        throws IOException
    {
        String s1 = null;
        s = openFileForWriting(s);
        s1 = s;
        s.writeObject(configparams);
        close(s);
        return;
        s;
        close(s1);
        throw s;
    }

}
