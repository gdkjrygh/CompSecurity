// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import adf;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONObject;

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

    public static AdjustAttribution a(JSONObject jsonobject)
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
    {
        objectinputstream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
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
            if (!adf.a(trackerToken, ((AdjustAttribution) (obj)).trackerToken))
            {
                return false;
            }
            if (!adf.a(trackerName, ((AdjustAttribution) (obj)).trackerName))
            {
                return false;
            }
            if (!adf.a(network, ((AdjustAttribution) (obj)).network))
            {
                return false;
            }
            if (!adf.a(campaign, ((AdjustAttribution) (obj)).campaign))
            {
                return false;
            }
            if (!adf.a(adgroup, ((AdjustAttribution) (obj)).adgroup))
            {
                return false;
            }
            if (!adf.a(creative, ((AdjustAttribution) (obj)).creative))
            {
                return false;
            }
            if (!adf.a(clickLabel, ((AdjustAttribution) (obj)).clickLabel))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((((((adf.a(trackerToken) + 629) * 37 + adf.a(trackerName)) * 37 + adf.a(network)) * 37 + adf.a(campaign)) * 37 + adf.a(adgroup)) * 37 + adf.a(creative)) * 37 + adf.a(clickLabel);
    }

    public String toString()
    {
        return String.format(Locale.US, "tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s", new Object[] {
            trackerToken, trackerName, network, campaign, adgroup, creative, clickLabel
        });
    }

}
