// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import android.graphics.Bitmap;
import android.net.Uri;
import bo.app.bx;
import bo.app.ct;
import bo.app.eo;
import bo.app.ep;
import com.appboy.Constants;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.support.AppboyLogger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//            IInAppMessage, IPutIntoJson

public abstract class InAppMessageBase
    implements IInAppMessage, IPutIntoJson
{

    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String TYPE = "type";
    protected static final String a;
    protected String b;
    protected String c;
    protected bx d;
    private String e;
    private Map f;
    private boolean g;
    private boolean h;
    private ClickAction i;
    private Uri j;
    private DismissType k;
    private int l;
    private JSONObject m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private String t;
    private String u;
    private Bitmap v;
    private boolean w;

    protected InAppMessageBase()
    {
        g = true;
        h = true;
        i = ClickAction.NONE;
        k = DismissType.AUTO_DISMISS;
        l = 5000;
        n = false;
        o = false;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        w = false;
    }

    private InAppMessageBase(String s1, Map map, ClickAction clickaction, String s2, int i1, int j1, int k1, 
            int l1, String s3, String s4, DismissType dismisstype, int i2, String s5, String s6, 
            JSONObject jsonobject, bx bx1)
    {
        g = true;
        h = true;
        i = ClickAction.NONE;
        k = DismissType.AUTO_DISMISS;
        l = 5000;
        n = false;
        o = false;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        w = false;
        e = s1;
        f = map;
        g = true;
        h = true;
        i = clickaction;
        if (i == ClickAction.URI && !ep.c(s2))
        {
            j = Uri.parse(s2);
        }
        if (dismisstype == DismissType.SWIPE)
        {
            k = DismissType.MANUAL;
        } else
        {
            k = dismisstype;
        }
        setDurationInMilliseconds(i2);
        p = i1;
        r = j1;
        s = k1;
        q = l1;
        t = s3;
        u = s4;
        b = s5;
        c = s6;
        m = jsonobject;
        n = false;
        o = false;
        d = bx1;
    }

    public InAppMessageBase(JSONObject jsonobject, bx bx1)
    {
        this(jsonobject.optString("message"), eo.a(jsonobject.optJSONObject("extras"), new HashMap()), (ClickAction)eo.a(jsonobject, "click_action", com/appboy/enums/inappmessage/ClickAction, ClickAction.NONE), jsonobject.optString("uri"), jsonobject.optInt("bg_color"), jsonobject.optInt("icon_color"), jsonobject.optInt("icon_bg_color"), jsonobject.optInt("text_color"), jsonobject.optString("icon"), jsonobject.optString("image_url"), (DismissType)eo.a(jsonobject, "message_close", com/appboy/enums/inappmessage/DismissType, DismissType.AUTO_DISMISS), jsonobject.optInt("duration"), jsonobject.optString("campaign_id"), jsonobject.optString("card_id"), jsonobject, bx1);
    }

    public volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public JSONObject forJsonPut()
    {
        return m;
    }

    public boolean getAnimateIn()
    {
        return g;
    }

    public boolean getAnimateOut()
    {
        return h;
    }

    public int getBackgroundColor()
    {
        return p;
    }

    public Bitmap getBitmap()
    {
        return v;
    }

    public String getCampaignId()
    {
        return b;
    }

    public String getCardId()
    {
        return c;
    }

    public ClickAction getClickAction()
    {
        return i;
    }

    public DismissType getDismissType()
    {
        return k;
    }

    public int getDurationInMilliseconds()
    {
        return l;
    }

    public Map getExtras()
    {
        return f;
    }

    public String getIcon()
    {
        return t;
    }

    public int getIconBackgroundColor()
    {
        return s;
    }

    public int getIconColor()
    {
        return r;
    }

    public boolean getImageDownloadSuccessful()
    {
        return w;
    }

    public String getImageUrl()
    {
        return u;
    }

    public String getMessage()
    {
        return e;
    }

    public int getMessageTextColor()
    {
        return q;
    }

    public Uri getUri()
    {
        return j;
    }

    public boolean logClick()
    {
        if (ep.b(b) && ep.b(c))
        {
            return false;
        }
        if (o)
        {
            AppboyLogger.i(a, "Click already logged for this in-app message. Ignoring.");
            return false;
        }
        if (d == null)
        {
            AppboyLogger.e(a, "Cannot log a in-app message click because the AppboyManager is null.");
            return false;
        }
        try
        {
            ct ct1 = ct.d(b, c);
            d.a(ct1);
            o = true;
        }
        catch (JSONException jsonexception)
        {
            d.a(jsonexception);
            return false;
        }
        return true;
    }

    public boolean logImpression()
    {
        while (ep.b(b) && ep.b(c) || n) 
        {
            return false;
        }
        if (d == null)
        {
            AppboyLogger.e(a, "Cannot log an in-app message impression because the AppboyManager is null.");
            return false;
        }
        try
        {
            ct ct1 = ct.c(b, c);
            d.a(ct1);
            n = true;
        }
        catch (JSONException jsonexception)
        {
            d.a(jsonexception);
            return false;
        }
        return true;
    }

    public void setAnimateIn(boolean flag)
    {
        g = flag;
    }

    public void setAnimateOut(boolean flag)
    {
        h = flag;
    }

    public void setBackgroundColor(int i1)
    {
        p = i1;
    }

    public void setBitmap(Bitmap bitmap)
    {
        v = bitmap;
    }

    public boolean setClickAction(ClickAction clickaction)
    {
        if (clickaction != ClickAction.URI)
        {
            i = clickaction;
            j = null;
            return true;
        } else
        {
            AppboyLogger.e(a, "A non-null URI is required in order to set the message ClickAction to URI.");
            return false;
        }
    }

    public boolean setClickAction(ClickAction clickaction, Uri uri)
    {
        if (uri == null && clickaction == ClickAction.URI)
        {
            AppboyLogger.e(a, "A non-null URI is required in order to set the message ClickAction to URI.");
            return false;
        }
        if (uri != null && clickaction == ClickAction.URI)
        {
            i = clickaction;
            j = uri;
            return true;
        } else
        {
            return setClickAction(clickaction);
        }
    }

    public void setDismissType(DismissType dismisstype)
    {
        k = dismisstype;
    }

    public void setDurationInMilliseconds(int i1)
    {
        if (i1 < 999)
        {
            l = 5000;
            AppboyLogger.w(a, (new StringBuilder("Requested in-app message duration ")).append(i1).append(" is lower than the minimum of 999. Defaulting to ").append(l).append(" milliseconds.").toString());
            return;
        } else
        {
            l = i1;
            AppboyLogger.i(a, (new StringBuilder("Set in-app message duration to ")).append(l).append(" milliseconds.").toString());
            return;
        }
    }

    public void setIcon(String s1)
    {
        t = s1;
    }

    public void setIconBackgroundColor(int i1)
    {
        s = i1;
    }

    public void setIconColor(int i1)
    {
        r = i1;
    }

    public void setImageDownloadSuccessful(boolean flag)
    {
        w = flag;
    }

    public void setImageUrl(String s1)
    {
        u = s1;
    }

    public void setMessage(String s1)
    {
        e = s1;
    }

    public void setMessageTextColor(int i1)
    {
        q = i1;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/InAppMessageBase.getName()
        });
    }
}
