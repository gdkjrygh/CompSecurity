// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import android.net.Uri;
import com.soundcloud.android.commands.Command;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.json.JSONException;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformConnectionFactory, WaveformParser, WaveformData

public class WaveformFetchCommand extends Command
{
    public class WaveformFetchException extends RuntimeException
    {

        final WaveformFetchCommand this$0;

        public WaveformFetchException(String s)
        {
            this$0 = WaveformFetchCommand.this;
            super(s);
        }

        public WaveformFetchException(Throwable throwable)
        {
            this$0 = WaveformFetchCommand.this;
            super(throwable);
        }
    }


    private static final String WAVEFORM_URL_PREFIX = "http://wis.sndcdn.com/%s";
    private final WaveformConnectionFactory waveformConnectionFactory;
    private final WaveformParser waveformParser;

    WaveformFetchCommand(WaveformConnectionFactory waveformconnectionfactory, WaveformParser waveformparser)
    {
        waveformConnectionFactory = waveformconnectionfactory;
        waveformParser = waveformparser;
    }

    private static String transformWaveformUrl(String s)
    {
        if (s == null)
        {
            throw new IllegalStateException("Waveform URL is null");
        } else
        {
            return String.format("http://wis.sndcdn.com/%s", new Object[] {
                Uri.parse(s).getLastPathSegment()
            });
        }
    }

    public WaveformData call(String s)
    {
        s = transformWaveformUrl(s);
        try
        {
            s = waveformConnectionFactory.create(s);
            if (s.getResponseCode() == 200)
            {
                return waveformParser.parse(s.getInputStream());
            } else
            {
                throw new WaveformFetchException("Invalid response code");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw new WaveformFetchException(s);
    }

    public volatile Object call(Object obj)
    {
        return call((String)obj);
    }
}
