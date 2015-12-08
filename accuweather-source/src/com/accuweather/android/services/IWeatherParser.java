// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.alert.AlertResults;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public interface IWeatherParser
{

    public abstract WeatherDataModel parse(WeatherUpdateRequest weatherupdaterequest, Data data)
        throws IOException, ParserConfigurationException, SAXException, URISyntaxException;

    public abstract AlertResults parseAlerts(WeatherUpdateRequest weatherupdaterequest)
        throws Exception;
}
