// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.web;

import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.config.UpdateConfig;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.skype.android.config.web:
//            SamsungGalaxyStoreUpdater

final class buffer extends DefaultHandler
{

    private int RESULT_CODE_OK;
    StringBuilder buffer;
    private boolean inResultCode;
    private boolean inVersionName;
    private boolean resultCodeOk;
    final SamsungGalaxyStoreUpdater this$0;

    public final void characters(char ac[], int i, int j)
        throws SAXException
    {
        buffer.append(ac, i, j);
    }

    public final void endElement(String s, String s1, String s2)
        throws SAXException
    {
        if ("resultCode".equals(s1))
        {
            inResultCode = false;
            resultCodeOk = isResultCodeOkAvailable(buffer.toString());
        } else
        if ("versionName".equals(s1))
        {
            inVersionName = false;
            updateConfig(buffer.toString());
            return;
        }
    }

    public final boolean isResultCodeOkAvailable(String s)
    {
        int i = -1;
        int j = Integer.parseInt(s);
        i = j;
_L2:
        return i == RESULT_CODE_OK;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        if ("resultCode".equals(s1))
        {
            inResultCode = true;
            buffer.setLength(0);
        } else
        if (resultCodeOk && "versionName".equals(s1))
        {
            inVersionName = true;
            buffer.setLength(0);
            return;
        }
    }

    public final void updateConfig(String s)
    {
        UpdateConfig updateconfig = SamsungGalaxyStoreUpdater.access$000(SamsungGalaxyStoreUpdater.this).getUpdateConfig();
        updateconfig.setSuggestedUpgradeVersion(s);
        updateconfig.setStoreName("GALAXY_STORE");
        updateconfig.setAlwaysShow(true);
        updateconfig.setLastUpdateTimestamp(System.currentTimeMillis());
        updateconfig.setUpdateConfigurationRefreshed(true);
        SamsungGalaxyStoreUpdater.access$100(SamsungGalaxyStoreUpdater.this).saveLocalConfig();
        SamsungGalaxyStoreUpdater.access$000(SamsungGalaxyStoreUpdater.this).sendConfigUpdatedEvent();
    }

    ()
    {
        this$0 = SamsungGalaxyStoreUpdater.this;
        super();
        inResultCode = false;
        inVersionName = false;
        RESULT_CODE_OK = 2;
        resultCodeOk = false;
        buffer = new StringBuilder();
    }
}
