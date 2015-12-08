// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import fs.ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationWatchList extends ContextAwareBase
{

    List fileWatchList;
    List lastModifiedList;
    URL mainURL;

    public ConfigurationWatchList()
    {
        fileWatchList = new ArrayList();
        lastModifiedList = new ArrayList();
    }

    private void addAsFileToWatch(URL url)
    {
        url = convertToFile(url);
        if (url != null)
        {
            fileWatchList.add(url);
            lastModifiedList.add(Long.valueOf(url.lastModified()));
        }
    }

    public void addToWatchList(URL url)
    {
        addAsFileToWatch(url);
    }

    public boolean changeDetected()
    {
        int j = fileWatchList.size();
        for (int i = 0; i < j; i++)
        {
            if (((Long)lastModifiedList.get(i)).longValue() != ((File)fileWatchList.get(i)).lastModified())
            {
                return true;
            }
        }

        return false;
    }

    public void clear()
    {
        mainURL = null;
        lastModifiedList.clear();
        fileWatchList.clear();
    }

    File convertToFile(URL url)
    {
        if ("file".equals(url.getProtocol()))
        {
            return new File(URLDecoder.decode(url.getFile()));
        } else
        {
            addInfo((new StringBuilder()).append("URL [").append(url).append("] is not of type file").toString());
            return null;
        }
    }

    public List getCopyOfFileWatchList()
    {
        return new ArrayList(fileWatchList);
    }

    public URL getMainURL()
    {
        return mainURL;
    }

    public void setMainURL(URL url)
    {
        mainURL = url;
        if (url != null)
        {
            addAsFileToWatch(url);
        }
    }
}
