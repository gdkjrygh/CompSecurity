// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.MdxSubtitle;
import com.netflix.mediaclient.ui.player.NccpSubtitle;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Subtitle
    implements Comparable
{

    protected static final String ATTR_CAN_DEVICE_RENDER = "canDeviceRender";
    protected static final String ATTR_ID = "id";
    protected static final String ATTR_LANGUAGE = "language";
    protected static final String ATTR_LANGUAGE_DESCRIPTION = "languageDescription";
    protected static final String ATTR_ORDER = "order";
    protected static final String ATTR_SELECTED = "selected";
    protected static final String ATTR_TRACK_TYPE = "trackType";
    public static final int CLOSED_CAPTION_SUBTITLE = 1;
    protected static final String IMPL = "impl";
    public static final int PRIMARY_SUBTITLE = 0;
    public static final int UNKNOWN_SUBTITLE = -1;
    protected boolean canDeviceRender;
    protected String id;
    protected String languageCodeIso639_1;
    protected String languageCodeIso639_2;
    protected String languageDescription;
    protected int nccpOrderNumber;
    protected int trackType;

    protected Subtitle()
    {
    }

    public static void dumpLog(Subtitle asubtitle[], String s)
    {
        if (asubtitle != null)
        {
            if (Log.isLoggable(s, 3))
            {
                Log.d(s, (new StringBuilder()).append("Subtitles: ").append(asubtitle.length).toString());
                for (int i = 0; i < asubtitle.length; i++)
                {
                    Log.d(s, (new StringBuilder()).append(i).append(" ").append(asubtitle[i]).toString());
                }

            }
        } else
        {
            Log.e(s, "Subtitles are null!");
        }
    }

    static Subtitle restore(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        }
        int i = jsonobject.optInt("impl", -1);
        if (i == 2)
        {
            return MdxSubtitle.newInstance(jsonobject, jsonobject.getInt("order"));
        }
        if (i == 1)
        {
            return NccpSubtitle.newInstance(jsonobject, jsonobject.getInt("order"));
        } else
        {
            throw new JSONException((new StringBuilder()).append("Implementation does not support restore ").append(i).toString());
        }
    }

    public boolean canDeviceRender()
    {
        return canDeviceRender;
    }

    public int compareTo(Subtitle subtitle)
    {
        if (subtitle != null)
        {
            if (nccpOrderNumber == subtitle.nccpOrderNumber)
            {
                return 0;
            }
            if (nccpOrderNumber > subtitle.nccpOrderNumber)
            {
                return 1;
            }
        }
        return -1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Subtitle)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof Subtitle))
            {
                return false;
            }
            obj = (Subtitle)obj;
            if (nccpOrderNumber != ((Subtitle) (obj)).nccpOrderNumber)
            {
                return false;
            }
        }
        return true;
    }

    public String getId()
    {
        return id;
    }

    public String getLanguageCodeIso639_1()
    {
        return languageCodeIso639_1;
    }

    public String getLanguageCodeIso639_2()
    {
        return languageCodeIso639_2;
    }

    public String getLanguageDescription()
    {
        return languageDescription;
    }

    public int getNccpOrderNumber()
    {
        return nccpOrderNumber;
    }

    public int getTrackType()
    {
        return trackType;
    }

    public int hashCode()
    {
        return nccpOrderNumber + 31;
    }

    public boolean isCC()
    {
        return trackType == 1;
    }

    public abstract JSONObject toJson()
        throws JSONException;

    public String toString()
    {
        return (new StringBuilder()).append("Subtitle [id=").append(id).append(", languageCodeIso639_1=").append(languageCodeIso639_1).append(", languageCodeIso639_2=").append(languageCodeIso639_2).append(", languageDescription=").append(languageDescription).append(", trackType=").append(trackType).append(", canDeviceRender=").append(canDeviceRender).append(", nccpOrderNumber=").append(nccpOrderNumber).append("]").toString();
    }
}
