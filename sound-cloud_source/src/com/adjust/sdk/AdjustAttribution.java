// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            Util

public class AdjustAttribution
    implements Serializable
{

    private static final ObjectStreamField serialPersistentFields[] = {
        new ObjectStreamField("trackerToken", java/lang/String), new ObjectStreamField("trackerName", java/lang/String), new ObjectStreamField("network", java/lang/String), new ObjectStreamField("campaign", java/lang/String), new ObjectStreamField("adgroup", java/lang/String), new ObjectStreamField("creative", java/lang/String), new ObjectStreamField("clickLabel", java/lang/String)
    };
    private static final long serialVersionUID = 1L;
    public String adgroup;
    public String campaign;
    public String clickLabel;
    public String creative;
    public String network;
    public String trackerName;
    public String trackerToken;

    public AdjustAttribution()
    {
    }

    public static AdjustAttribution fromJson(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            AdjustAttribution adjustattribution = new AdjustAttribution();
            adjustattribution.trackerToken = jsonobject.optString("tracker_token", null);
            adjustattribution.trackerName = jsonobject.optString("tracker_name", null);
            adjustattribution.network = jsonobject.optString("network", null);
            adjustattribution.campaign = jsonobject.optString("campaign", null);
            adjustattribution.adgroup = jsonobject.optString("adgroup", null);
            adjustattribution.creative = jsonobject.optString("creative", null);
            adjustattribution.clickLabel = jsonobject.optString("click_label", null);
            return adjustattribution;
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws ClassNotFoundException, IOException
    {
        objectinputstream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdjustAttribution)obj;
            if (!Util.equalString(trackerToken, ((AdjustAttribution) (obj)).trackerToken))
            {
                return false;
            }
            if (!Util.equalString(trackerName, ((AdjustAttribution) (obj)).trackerName))
            {
                return false;
            }
            if (!Util.equalString(network, ((AdjustAttribution) (obj)).network))
            {
                return false;
            }
            if (!Util.equalString(campaign, ((AdjustAttribution) (obj)).campaign))
            {
                return false;
            }
            if (!Util.equalString(adgroup, ((AdjustAttribution) (obj)).adgroup))
            {
                return false;
            }
            if (!Util.equalString(creative, ((AdjustAttribution) (obj)).creative))
            {
                return false;
            }
            if (!Util.equalString(clickLabel, ((AdjustAttribution) (obj)).clickLabel))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((((((Util.hashString(trackerToken) + 629) * 37 + Util.hashString(trackerName)) * 37 + Util.hashString(network)) * 37 + Util.hashString(campaign)) * 37 + Util.hashString(adgroup)) * 37 + Util.hashString(creative)) * 37 + Util.hashString(clickLabel);
    }

    public String toString()
    {
        return String.format(Locale.US, "tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s", new Object[] {
            trackerToken, trackerName, network, campaign, adgroup, creative, clickLabel
        });
    }

}
