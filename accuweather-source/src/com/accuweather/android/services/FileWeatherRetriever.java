// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.alert.AlertResults;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.news.NewsResults;
import com.accuweather.android.parsers.NewsParser;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.InputStreamReader;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

// Referenced classes of package com.accuweather.android.services:
//            IWeatherRetriever, DmaFeedParser, VideoFeedParser

public class FileWeatherRetriever
    implements IWeatherRetriever
{

    private static Gson gson = new Gson();
    private InputSource alertsInputSource;
    private InputSource currentConditionsInputSource;
    private InputSource dailyInputSource;
    private InputSource hourlyInputSource;
    private boolean isPaid;
    private InputSource minuteCastInputSource;
    private InputSource newsInputSource;
    private InputSource videoInputSource;

    public FileWeatherRetriever()
    {
        currentConditionsInputSource = null;
        hourlyInputSource = null;
        dailyInputSource = null;
        alertsInputSource = null;
        videoInputSource = null;
        newsInputSource = null;
        minuteCastInputSource = null;
        isPaid = false;
    }

    private XMLReader buildXmlReader()
        throws ParserConfigurationException, SAXException
    {
        return SAXParserFactory.newInstance().newSAXParser().getXMLReader();
    }

    private Object parseInputSource(InputSource inputsource, Class class1)
    {
        java.io.InputStream inputstream = inputsource.getByteStream();
        if (inputstream != null)
        {
            return gson.fromJson(new InputStreamReader(inputstream), class1);
        } else
        {
            return gson.fromJson(inputsource.getCharacterStream(), class1);
        }
    }

    public boolean isPaid()
    {
        return isPaid;
    }

    public AlertResults retrieveAlerts(String s, String s1)
        throws Exception
    {
        return (AlertResults)parseInputSource(alertsInputSource, com/accuweather/android/models/alert/AlertResults);
    }

    public CurrentConditionsResults retrieveCurrentConditions(String s, String s1, boolean flag)
        throws Exception
    {
        return (CurrentConditionsResults)parseInputSource(currentConditionsInputSource, com/accuweather/android/models/current/CurrentConditionsResults);
    }

    public List retrieveDMAs(InputSource inputsource)
        throws Exception
    {
        DmaFeedParser dmafeedparser = new DmaFeedParser();
        XMLReader xmlreader = buildXmlReader();
        xmlreader.setContentHandler(dmafeedparser);
        xmlreader.parse(inputsource);
        return dmafeedparser.getDmaModels();
    }

    public ForecastResult retrieveForecast(String s, String s1, boolean flag)
        throws Exception
    {
        return (ForecastResult)parseInputSource(dailyInputSource, com/accuweather/android/models/daily/ForecastResult);
    }

    public HourlyResults retrieveHourly(String s, String s1, boolean flag)
        throws Exception
    {
        return (HourlyResults)parseInputSource(hourlyInputSource, com/accuweather/android/models/hourly/HourlyResults);
    }

    public MinuteCastResult retrieveMinuteCast(Double double1, Double double2, String s, boolean flag, boolean flag1)
        throws Exception
    {
        return (MinuteCastResult)parseInputSource(minuteCastInputSource, com/accuweather/android/models/minutecast/MinuteCastResult);
    }

    public NewsResults retrieveNews(String s, String s1, boolean flag, String s2)
        throws Exception
    {
        return (new NewsParser()).parse(new JsonReader(new InputStreamReader(newsInputSource.getByteStream())));
    }

    public List retrieveVideos(String s, String s1, String s2)
        throws Exception
    {
        s = new VideoFeedParser();
        s1 = buildXmlReader();
        s1.setContentHandler(s);
        s1.parse(videoInputSource);
        return s.getVideosList();
    }

    public void setAlertsInputSource(InputSource inputsource)
    {
        alertsInputSource = inputsource;
    }

    public void setCurrentConditionsInputSource(InputSource inputsource)
    {
        currentConditionsInputSource = inputsource;
    }

    public void setDailyInputSource(InputSource inputsource)
    {
        dailyInputSource = inputsource;
    }

    public void setHourlyInputSource(InputSource inputsource)
    {
        hourlyInputSource = inputsource;
    }

    public void setMinuteCastInputSource(InputSource inputsource)
    {
        minuteCastInputSource = inputsource;
    }

    public void setNewsInputSource(InputSource inputsource)
    {
        newsInputSource = inputsource;
    }

    public void setPaid(boolean flag)
    {
        isPaid = flag;
    }

    public void setVideoInputSource(InputSource inputsource)
    {
        videoInputSource = inputsource;
    }

}
