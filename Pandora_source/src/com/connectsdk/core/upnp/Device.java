// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp;

import com.connectsdk.core.upnp.service.Service;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Device
{
    static class Icon
    {

        static final String TAG = "icon";
        static final String TAG_DEPTH = "depth";
        static final String TAG_HEIGHT = "height";
        static final String TAG_MIME_TYPE = "mimetype";
        static final String TAG_URL = "url";
        static final String TAG_WIDTH = "width";
        String depth;
        String height;
        String mimetype;
        String url;
        String width;

        Icon()
        {
        }
    }


    public static final String HEADER_SERVER = "Server";
    public static final String TAG = "device";
    public static final String TAG_DEVICE_TYPE = "deviceType";
    public static final String TAG_FRIENDLY_NAME = "friendlyName";
    public static final String TAG_ICON_LIST = "iconList";
    public static final String TAG_MANUFACTURER = "manufacturer";
    public static final String TAG_MANUFACTURER_URL = "manufacturerURL";
    public static final String TAG_MODEL_DESCRIPTION = "modelDescription";
    public static final String TAG_MODEL_NAME = "modelName";
    public static final String TAG_MODEL_NUMBER = "modelNumber";
    public static final String TAG_MODEL_URL = "modelURL";
    public static final String TAG_SERIAL_NUMBER = "serialNumber";
    public static final String TAG_SERVICE_LIST = "serviceList";
    public static final String TAG_UDN = "UDN";
    public static final String TAG_UPC = "UPC";
    public String UDN;
    public String UPC;
    public String UUID;
    public String applicationURL;
    public String baseURL;
    public String deviceType;
    public String friendlyName;
    public Map headers;
    List iconList;
    public String ipAddress;
    public String manufacturer;
    public String manufacturerURL;
    public String modelDescription;
    public String modelName;
    public String modelNumber;
    public String modelURL;
    public int port;
    public String searchTarget;
    public String serialNumber;
    public List serviceList;

    public Device(String s, String s1)
        throws IOException
    {
        iconList = new ArrayList();
        serviceList = new ArrayList();
        URL url = new URL(s);
        if (url.getPort() == -1)
        {
            baseURL = String.format("%s://%s", new Object[] {
                url.getProtocol(), url.getHost()
            });
        } else
        {
            baseURL = String.format("%s://%s:%d", new Object[] {
                url.getProtocol(), url.getHost(), Integer.valueOf(url.getPort())
            });
        }
        ipAddress = url.getHost();
        port = url.getPort();
        searchTarget = s1;
        UUID = null;
        if (s1.equalsIgnoreCase("urn:dial-multiscreen-org:service:dial:1"))
        {
            applicationURL = getApplicationURL(s);
        }
    }

    public static Device createInstanceFromXML(String s, String s1)
    {
        DefaultHandler defaulthandler;
        SAXParserFactory saxparserfactory;
        URLConnection urlconnection;
        try
        {
            s1 = new Device(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        defaulthandler = new DefaultHandler(s1) {

            Icon currentIcon;
            Service currentService;
            String currentValue;
            final Device val$device;

            public void characters(char ac[], int i, int j)
                throws SAXException
            {
                currentValue = new String(ac, i, j);
            }

            public void endElement(String s2, String s3, String s4)
                throws SAXException
            {
                if ("deviceType".equals(s4))
                {
                    device.deviceType = currentValue;
                } else
                {
                    if ("friendlyName".equals(s4))
                    {
                        device.friendlyName = currentValue;
                        return;
                    }
                    if ("manufacturer".equals(s4))
                    {
                        device.manufacturer = currentValue;
                        return;
                    }
                    if ("manufacturerURL".equals(s4))
                    {
                        device.manufacturerURL = currentValue;
                        return;
                    }
                    if ("modelDescription".equals(s4))
                    {
                        device.modelDescription = currentValue;
                        return;
                    }
                    if ("modelName".equals(s4))
                    {
                        device.modelName = currentValue;
                        return;
                    }
                    if ("modelNumber".equals(s4))
                    {
                        device.modelNumber = currentValue;
                        return;
                    }
                    if ("modelURL".equals(s4))
                    {
                        device.modelURL = currentValue;
                        return;
                    }
                    if ("serialNumber".equals(s4))
                    {
                        device.serialNumber = currentValue;
                        return;
                    }
                    if ("UDN".equals(s4))
                    {
                        device.UDN = currentValue;
                        return;
                    }
                    if ("UPC".equals(s4))
                    {
                        device.UPC = currentValue;
                        return;
                    }
                    if ("mimetype".equals(s4))
                    {
                        currentIcon.mimetype = currentValue;
                        return;
                    }
                    if ("width".equals(s4))
                    {
                        currentIcon.width = currentValue;
                        return;
                    }
                    if ("height".equals(s4))
                    {
                        currentIcon.height = currentValue;
                        return;
                    }
                    if ("depth".equals(s4))
                    {
                        currentIcon.depth = currentValue;
                        return;
                    }
                    if ("url".equals(s4))
                    {
                        currentIcon.url = currentValue;
                        return;
                    }
                    if ("icon".equals(s4))
                    {
                        device.iconList.add(currentIcon);
                        return;
                    }
                    if ("serviceType".equals(s4))
                    {
                        currentService.serviceType = currentValue;
                        return;
                    }
                    if ("serviceId".equals(s4))
                    {
                        currentService.serviceId = currentValue;
                        return;
                    }
                    if ("SCPDURL".equals(s4))
                    {
                        currentService.SCPDURL = currentValue;
                        return;
                    }
                    if ("controlURL".equals(s4))
                    {
                        currentService.controlURL = currentValue;
                        return;
                    }
                    if ("eventSubURL".equals(s4))
                    {
                        currentService.eventSubURL = currentValue;
                        return;
                    }
                    if ("service".equals(s4))
                    {
                        device.serviceList.add(currentService);
                        return;
                    }
                }
            }

            public void startElement(String s2, String s3, String s4, Attributes attributes)
                throws SAXException
            {
                if ("icon".equals(s4))
                {
                    currentIcon = new Icon();
                } else
                if ("service".equals(s4))
                {
                    currentService = new Service();
                    currentService.baseURL = device.baseURL;
                    return;
                }
            }

            
            {
                device = device1;
                super();
                currentValue = null;
            }
        };
        saxparserfactory = SAXParserFactory.newInstance();
        urlconnection = (new URL(s)).openConnection();
        s = new BufferedInputStream(urlconnection.getInputStream());
        saxparserfactory.newSAXParser().parse(s, defaulthandler);
        s.close();
        s1.headers = urlconnection.getHeaderFields();
        return s1;
        s1;
        try
        {
            s.close();
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return null;
    }

    private String getApplicationURL(String s)
    {
        Object obj1 = new DefaultHttpClient();
        s = new HttpGet(s);
        Object obj = null;
        String s2 = null;
        String s1 = obj;
        try
        {
            obj1 = ((HttpClient) (obj1)).execute(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        s = s2;
        s1 = obj;
        if (((HttpResponse) (obj1)).getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s = s2;
        s1 = obj;
        if (((HttpResponse) (obj1)).getFirstHeader("Application-URL") == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s1 = obj;
        s2 = ((HttpResponse) (obj1)).getFirstHeader("Application-URL").getValue();
        s = s2;
        s1 = s2;
        if (s2.substring(s2.length() - 1).equals("/"))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s1 = s2;
        s = s2.concat("/");
        return s;
    }

    protected static String parseUUID(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            int i = s.indexOf("uuid:");
            s1 = s;
            if (i != -1)
            {
                i = "uuid:".length() + i;
                int j = s.indexOf("::");
                if (j != -1)
                {
                    return s.substring(i, j);
                } else
                {
                    return s.substring(i);
                }
            }
        }
        return s1;
    }

    public String toString()
    {
        return friendlyName;
    }
}
