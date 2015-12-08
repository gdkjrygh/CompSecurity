// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.android;

import android.util.Log;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import fs.ch.qos.logback.core.AppenderBase;
import fs.ch.qos.logback.core.Layout;

public class LogcatAppender extends AppenderBase
{

    private static final int MAX_TAG_LENGTH = 23;
    private boolean checkLoggable;
    private PatternLayoutEncoder encoder;
    private PatternLayoutEncoder tagEncoder;

    public LogcatAppender()
    {
        encoder = null;
        tagEncoder = null;
        checkLoggable = false;
    }

    public void append(ILoggingEvent iloggingevent)
    {
        if (isStarted()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        String s;
        if (tagEncoder != null)
        {
            s = tagEncoder.getLayout().doLayout(iloggingevent);
        } else
        {
            s = iloggingevent.getLoggerName();
        }
        s1 = s;
        if (checkLoggable)
        {
            s1 = s;
            if (s.length() > 23)
            {
                s1 = (new StringBuilder()).append(s.substring(0, 22)).append("*").toString();
            }
        }
        iloggingevent.getLevel().levelInt;
        JVM INSTR lookupswitch 6: default 144
    //                   -2147483648: 145
    //                   5000: 145
    //                   10000: 189
    //                   20000: 223
    //                   30000: 257
    //                   40000: 291;
           goto _L3 _L4 _L4 _L5 _L6 _L7 _L8
_L8:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (checkLoggable && !Log.isLoggable(s1, 2)) goto _L1; else goto _L9
_L9:
        Log.v(s1, encoder.getLayout().doLayout(iloggingevent));
        return;
_L5:
        if (checkLoggable && !Log.isLoggable(s1, 3)) goto _L1; else goto _L10
_L10:
        Log.d(s1, encoder.getLayout().doLayout(iloggingevent));
        return;
_L6:
        if (checkLoggable && !Log.isLoggable(s1, 4)) goto _L1; else goto _L11
_L11:
        Log.i(s1, encoder.getLayout().doLayout(iloggingevent));
        return;
_L7:
        if (checkLoggable && !Log.isLoggable(s1, 5)) goto _L1; else goto _L12
_L12:
        Log.w(s1, encoder.getLayout().doLayout(iloggingevent));
        return;
        if (checkLoggable && !Log.isLoggable(s1, 6)) goto _L1; else goto _L13
_L13:
        Log.e(s1, encoder.getLayout().doLayout(iloggingevent));
        return;
    }

    public volatile void append(Object obj)
    {
        append((ILoggingEvent)obj);
    }

    public boolean getCheckLoggable()
    {
        return checkLoggable;
    }

    public PatternLayoutEncoder getEncoder()
    {
        return encoder;
    }

    public PatternLayoutEncoder getTagEncoder()
    {
        return tagEncoder;
    }

    public void setCheckLoggable(boolean flag)
    {
        checkLoggable = flag;
    }

    public void setEncoder(PatternLayoutEncoder patternlayoutencoder)
    {
        encoder = patternlayoutencoder;
    }

    public void setTagEncoder(PatternLayoutEncoder patternlayoutencoder)
    {
        tagEncoder = patternlayoutencoder;
    }

    public void start()
    {
        if (encoder == null || encoder.getLayout() == null)
        {
            addError((new StringBuilder()).append("No layout set for the appender named [").append(name).append("].").toString());
            return;
        }
        if (tagEncoder != null)
        {
            Layout layout = tagEncoder.getLayout();
            if (layout == null)
            {
                addError((new StringBuilder()).append("No tag layout set for the appender named [").append(name).append("].").toString());
                return;
            }
            if (layout instanceof PatternLayout)
            {
                ((PatternLayout)layout).setPostCompileProcessor(null);
            }
        }
        super.start();
    }
}
