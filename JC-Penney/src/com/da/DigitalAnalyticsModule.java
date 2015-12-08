// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da;

import android.app.Application;
import android.content.Context;
import com.da.model.DAModel;
import com.da.util.SystemUtil;
import com.ibm.eo.EOCore;
import com.ibm.eo.EOLifecycleObject;
import com.ibm.eo.util.LogInternal;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.da:
//            LoggingUtil, SessionManager, QueueBuffer, SizeValidator, 
//            TagUtil

public final class DigitalAnalyticsModule
    implements EOLifecycleObject
{

    static final String ACTIONTYPE = "ACTIONTYPE";
    static final String APP_NAME = "AppName";
    static final String ATTRIBUTE = "ATTRIBUTE";
    static final String BOOTSTRAP_FAILED_MESSAGE = "Module Load Failure";
    static final String CAPTURE_ALL_OFFLINE_TAGS = "CaptureAllOfflineTags";
    static final String CATEGORYID = "CATEGORYID";
    static final String CITY = "CITY";
    static final String CLIENT_ID = "ClientId";
    static final int CMMMC_MAX_LENGTH = 4;
    static final String CONSTRAINTS = "constraints";
    static final String CONVERSIONEVENT = "CONVERSIONEVENT";
    static final String COUNTRY = "COUNTRY";
    static final String DISPLAY_LOGGING = "DisplayLogging";
    static final String ELEMENT = "ELEMENT";
    static final String ELEMENTCATEGORY = "ELEMENTCATEGORY";
    static final String ELEMENTID = "ELEMENTID";
    static final String EMAIL = "EMAIL";
    static final String EVENTCATEGORYID = "EVENTCATEGORYID";
    static final String EVENTID = "EVENTID";
    static final String HREF = "HREF";
    static final String ILLEGAL_STATE_MESSAGE = "Module is uninitialized. Please use startup(Application) to initialize the Module first";
    static final String IMPRESSION = "IMPRESSION";
    static final String LIBRARY_VERSION = "LibraryVersion";
    static final String LIBRARY_VERSION_VALUE = "1.0.1.0";
    static final String LINKCLICK = "LINKCLICK";
    static final String LINKNAME = "LINKNAME";
    static final String MANUAL_POST_ENABLED = "ManualPostEnabled";
    static final int MS_FACTOR = 1000;
    static final String ORDER = "ORDER";
    static final String ORDERID = "ORDERID";
    static final String ORDERSUBTOTAL = "ORDERSUBTOTAL";
    static final String PAGEID = "PAGEID";
    static final String PAGEVIEW = "PAGEVIEW";
    static final String POINTS = "POINTS";
    static final String POST_MESSAGE_URL = "PostMessageUrl";
    static final String PRODUCTID = "PRODUCTID";
    static final String PRODUCTNAME = "PRODUCTNAME";
    static final String PRODUCTVIEW = "PRODUCTVIEW";
    static final String QUANTITY = "QUANTITY";
    static final String REALESTATE = "REALESTATE";
    static final String REGISTRATION = "REGISTRATION";
    static final String REGISTRATIONID = "REGISTRATIONID";
    static final String SEARCHRESULTS = "SEARCHRESULTS";
    static final String SEARCHTERM = "SEARCHTERM";
    static final String SHIPPING = "SHIPPING";
    static final String SHOPACTION5 = "SHOPACTION5";
    static final String SHOPACTION9 = "SHOPACTION9";
    static final String SITEPROMOTION = "SITEPROMOTION";
    static final String STATE = "STATE";
    static final int TID_CONVERSION_EVENT = 14;
    static final int TID_ELEMENT = 15;
    static final int TID_IMPRESSION = 9;
    static final int TID_LINK_CLICK = 8;
    static final int TID_ORDER = 3;
    static final int TID_PAGE_VIEW = 1;
    static final int TID_PRODUCT_VIEW = 5;
    static final int TID_REGISTRATION = 2;
    static final int TID_SHOPACTION = 4;
    static final int TID_TECH_PROPERTIES = 6;
    static final String UNITPRICE = "UNITPRICE";
    static final String ZIP = "ZIP";
    private static volatile DigitalAnalyticsModule _myInstance;
    private Boolean _isEnabled;
    private Application application;
    private JSONObject constraints;

    private DigitalAnalyticsModule(Application application1)
    {
        _isEnabled = Boolean.valueOf(false);
        application = application1;
        EOCore.addModule(name(), this);
        EOCore.enableModule(name());
        LoggingUtil.setDebugMode(Boolean.parseBoolean(EOCore.getConfigItemString("DisplayLogging", this)));
        try
        {
            constraints = (new JSONObject(SystemUtil.internalConfiguration(application.getApplicationContext()))).getJSONObject("constraints");
        }
        // Misplaced declaration of an exception variable
        catch (Application application1)
        {
            LogInternal.logException(application1);
            throw new RuntimeException((new StringBuilder()).append("Module Load Failure:").append(application1.getMessage()).toString());
        }
        SessionManager.startup(application);
        QueueBuffer.startup(application);
    }

    private void addSystemParameters(DAModel damodel)
    {
        Object obj = SessionManager.getInstance();
        String s = EOCore.getConfigItemString("ClientId", this);
        String s1 = EOCore.getConfigItemString("AppName", this);
        String s2 = ((SessionManager) (obj)).getVisitorId();
        obj = ((SessionManager) (obj)).getSessionId();
        Object obj1 = Calendar.getInstance();
        obj1 = (new StringBuilder()).append(((Calendar) (obj1)).getTimeInMillis() / 1000L).append("").toString();
        damodel.putData("ci", s);
        damodel.putData("vn1", "4.1.1");
        damodel.putData("vn2", "mobile");
        damodel.putData("st", ((String) (obj1)));
        damodel.putData("ec", "UTF-8");
        damodel.putData("cjen", "1");
        damodel.putData("cjvf", "1");
        damodel.putData("ul", s1);
        damodel.putData("cjuid", s2);
        damodel.putData("cjsid", ((String) (obj)));
    }

    private void addSystemParameters(DAModel damodel, String s)
    {
        Object obj = SessionManager.getInstance();
        String s1 = EOCore.getConfigItemString("ClientId", this);
        s = (new StringBuilder()).append(EOCore.getConfigItemString("AppName", this)).append("/?cm_mmc=").append(s).toString();
        String s2 = ((SessionManager) (obj)).getVisitorId();
        obj = ((SessionManager) (obj)).getSessionId();
        Object obj1 = Calendar.getInstance();
        obj1 = (new StringBuilder()).append(((Calendar) (obj1)).getTimeInMillis() / 1000L).append("").toString();
        damodel.putData("ci", s1);
        damodel.putData("vn1", "4.1.1");
        damodel.putData("vn2", "mobile");
        damodel.putData("st", ((String) (obj1)));
        damodel.putData("ec", "UTF-8");
        damodel.putData("cjen", "1");
        damodel.putData("cjvf", "1");
        damodel.putData("ul", s);
        damodel.putData("cjuid", s2);
        damodel.putData("cjsid", ((String) (obj)));
    }

    private DAModel generatePageviewTag(String s, String s1, String s2, String s3, Map map, String s4)
    {
        DAModel damodel = new DAModel();
        damodel.putData("tid", "1");
        damodel.putData("pi", s);
        if (s1 != null)
        {
            damodel.putData("cg", s1);
        }
        if (s2 != null)
        {
            damodel.putData("se", s2);
        }
        if (s3 != null)
        {
            damodel.putData("sr", s3);
        }
        for (s = map.entrySet().iterator(); s.hasNext(); damodel.putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        if (s4 != null)
        {
            addSystemParameters(damodel, s4);
            return damodel;
        } else
        {
            addSystemParameters(damodel);
            return damodel;
        }
    }

    private DAModel generateTechnicalPropertiesTag(String s, String s1, String s2, String s3, Map map, String s4)
    {
        DAModel damodel = new DAModel();
        damodel.putData("tid", "6");
        damodel.putData("pc", "Y");
        damodel.putData("pi", s);
        if (s1 != null)
        {
            damodel.putData("cg", s1);
        }
        if (s2 != null)
        {
            damodel.putData("se", s2);
        }
        if (s3 != null)
        {
            damodel.putData("sr", s3);
        }
        for (s = map.entrySet().iterator(); s.hasNext(); damodel.putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        if (s4 != null)
        {
            addSystemParameters(damodel, s4);
            return damodel;
        } else
        {
            addSystemParameters(damodel);
            return damodel;
        }
    }

    public static DigitalAnalyticsModule getInstance()
    {
        if (_myInstance == null)
        {
            throw new IllegalStateException("Module is uninitialized. Please use startup(Application) to initialize the Module first");
        } else
        {
            return _myInstance;
        }
    }

    public static void shutdown()
    {
        EOCore.onTerminate();
        SessionManager.shutdown();
        QueueBuffer.shutdown();
        _myInstance = null;
    }

    public static DigitalAnalyticsModule startup(Application application1)
    {
        if (_myInstance != null) goto _L2; else goto _L1
_L1:
        com/da/DigitalAnalyticsModule;
        JVM INSTR monitorenter ;
        if (_myInstance == null)
        {
            _myInstance = new DigitalAnalyticsModule(application1);
        }
        com/da/DigitalAnalyticsModule;
        JVM INSTR monitorexit ;
_L2:
        return _myInstance;
        application1;
        com/da/DigitalAnalyticsModule;
        JVM INSTR monitorexit ;
        throw application1;
    }

    public boolean disable()
    {
        _isEnabled = Boolean.valueOf(false);
        return isEnabled();
    }

    public boolean enable()
    {
        _isEnabled = Boolean.valueOf(true);
        return _isEnabled.booleanValue();
    }

    public DAModel fireConversionEvent(String s, String s1, String s2, String s3, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Event Id is required");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Action Type is required");
        }
        Object obj = new HashMap();
        ((Map) (obj)).put("EVENTID", s);
        ((Map) (obj)).put("ACTIONTYPE", s1);
        ((Map) (obj)).put("EVENTCATEGORYID", s2);
        ((Map) (obj)).put("POINTS", s3);
        ((Map) (obj)).put("ATTRIBUTE", as);
        boolean flag = SizeValidator.CONVERSIONEVENT.validate(((Map) (obj)));
        HashMap hashmap = new HashMap();
        obj = hashmap;
        if (as != null)
        {
            obj = hashmap;
            if (as.length > 0)
            {
                obj = TagUtil.generateAttributes(as, 14);
            }
        }
        as = new DAModel();
        as.putData("tid", "14");
        as.putData("cid", s);
        as.putData("cat", s1);
        if (s2 != null)
        {
            as.putData("ccid", s2);
        }
        if (s3 != null)
        {
            as.putData("cpt", s3);
        }
        for (s = ((Map) (obj)).entrySet().iterator(); s.hasNext(); as.putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        addSystemParameters(as);
        QueueBuffer.getInstance().post(as);
        as.setDataConstraintSuccess(flag);
        return as;
    }

    public DAModel fireElement(String s, String s1, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Element Id is required");
        }
        Object obj = new HashMap();
        ((Map) (obj)).put("ELEMENTID", s);
        ((Map) (obj)).put("ELEMENTCATEGORY", s1);
        ((Map) (obj)).put("ATTRIBUTE", as);
        boolean flag = SizeValidator.ELEMENT.validate(((Map) (obj)));
        HashMap hashmap = new HashMap();
        obj = hashmap;
        if (as != null)
        {
            obj = hashmap;
            if (as.length > 0)
            {
                obj = TagUtil.generateAttributes(as, 15);
            }
        }
        as = new DAModel();
        as.putData("tid", "15");
        as.putData("eid", s);
        if (s1 != null)
        {
            as.putData("ecat", s1);
        }
        for (s = ((Map) (obj)).entrySet().iterator(); s.hasNext(); as.putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        addSystemParameters(as);
        QueueBuffer.getInstance().post(as);
        as.setDataConstraintSuccess(flag);
        return as;
    }

    public DAModel fireImpression(String s, String as[], String as1[])
    {
        Object obj = null;
        if (s == null)
        {
            throw new IllegalArgumentException("Page Id is required");
        }
        String s1;
        boolean flag;
        if (as != null && as.length > 0)
        {
            as = TagUtil.flatten(as, as.length);
        } else
        {
            as = null;
        }
        s1 = obj;
        if (as1 != null)
        {
            s1 = obj;
            if (as1.length > 0)
            {
                s1 = TagUtil.flatten(as1, as1.length);
            }
        }
        as1 = new HashMap();
        as1.put("PAGEID", s);
        as1.put("SITEPROMOTION", as);
        as1.put("REALESTATE", s1);
        flag = SizeValidator.IMPRESSION.validate(as1);
        as1 = new DAModel();
        as1.putData("tid", "9");
        as1.putData("pi", s);
        if (as != null)
        {
            as1.putData("cm_sp", as);
        }
        if (s1 != null)
        {
            as1.putData("cm_re", s1);
        }
        addSystemParameters(as1);
        QueueBuffer.getInstance().post(as1);
        as1.setDataConstraintSuccess(flag);
        return as1;
    }

    public DAModel fireLinkClick(String s, String s1, String s2)
    {
        if (s2 == null)
        {
            throw new IllegalArgumentException("Link is required");
        }
        Object obj = new HashMap();
        ((Map) (obj)).put("PAGEID", s);
        ((Map) (obj)).put("LINKNAME", s1);
        ((Map) (obj)).put("HREF", s2);
        boolean flag = SizeValidator.LINKCLICK.validate(((Map) (obj)));
        obj = Calendar.getInstance();
        obj = (new StringBuilder()).append(((Calendar) (obj)).getTimeInMillis() / 1000L).append("").toString();
        DAModel damodel = new DAModel();
        damodel.putData("tid", "8");
        damodel.putData("ti", ((String) (obj)));
        if (s != null)
        {
            damodel.putData("pi", s);
        }
        if (s1 != null)
        {
            damodel.putData("nm", s1);
        }
        damodel.putData("hr", s2);
        addSystemParameters(damodel);
        QueueBuffer.getInstance().post(damodel);
        damodel.setDataConstraintSuccess(flag);
        return damodel;
    }

    public DAModel fireOrder(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Order Id is required");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Order Subtotal is required");
        }
        if (s2 == null)
        {
            throw new IllegalArgumentException("Order Shipping Charge is required");
        }
        if (s3 == null)
        {
            throw new IllegalArgumentException("Customer Id is required");
        }
        if (s7 == null)
        {
            throw new IllegalArgumentException("Currency Code is required");
        }
        Object obj = new HashMap();
        ((Map) (obj)).put("ORDERID", s);
        ((Map) (obj)).put("ORDERSUBTOTAL", s1);
        ((Map) (obj)).put("SHIPPING", s2);
        ((Map) (obj)).put("REGISTRATIONID", s3);
        ((Map) (obj)).put("CITY", s4);
        ((Map) (obj)).put("STATE", s5);
        ((Map) (obj)).put("ZIP", s6);
        ((Map) (obj)).put("ATTRIBUTE", as);
        boolean flag = SizeValidator.ORDER.validate(((Map) (obj)));
        HashMap hashmap = new HashMap();
        obj = hashmap;
        if (as != null)
        {
            obj = hashmap;
            if (as.length > 0)
            {
                obj = TagUtil.generateAttributes(as, 3);
            }
        }
        as = new DAModel();
        as.putData("tid", "3");
        as.putData("on", s);
        as.putData("tr", s1);
        as.putData("sg", s2);
        as.putData("cd", s3);
        if (s4 != null)
        {
            as.putData("ct", s4);
        }
        if (s5 != null)
        {
            as.putData("sa", s5);
        }
        if (s6 != null)
        {
            as.putData("zp", s6);
        }
        as.putData("cc", s7);
        for (s = ((Map) (obj)).entrySet().iterator(); s.hasNext(); as.putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        addSystemParameters(as);
        QueueBuffer.getInstance().post(as);
        as.setDataConstraintSuccess(flag);
        return as;
    }

    public DAModel firePageview(String s, String s1, String s2, String s3, String as[], String as1[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("PageId is required");
        }
        Object obj = new HashMap();
        ((Map) (obj)).put("PAGEID", s);
        ((Map) (obj)).put("CATEGORYID", s1);
        ((Map) (obj)).put("SEARCHTERM", s2);
        ((Map) (obj)).put("SEARCHRESULTS", s3);
        ((Map) (obj)).put("ATTRIBUTE", as);
        boolean flag = SizeValidator.PAGEVIEW.validate(((Map) (obj)));
        Object obj1 = null;
        obj = obj1;
        if (as1 != null)
        {
            obj = obj1;
            if (as1.length > 0)
            {
                obj = TagUtil.flatten(as1, 4);
            }
        }
        SessionManager sessionmanager = SessionManager.getInstance();
        if (sessionmanager.isFirstPageView())
        {
            HashMap hashmap = new HashMap();
            as1 = hashmap;
            if (as != null)
            {
                as1 = hashmap;
                if (as.length > 0)
                {
                    as1 = TagUtil.generateAttributes(as, 6);
                }
            }
            s = generateTechnicalPropertiesTag(s, s1, s2, s3, as1, ((String) (obj)));
        } else
        {
            HashMap hashmap1 = new HashMap();
            as1 = hashmap1;
            if (as != null)
            {
                as1 = hashmap1;
                if (as.length > 0)
                {
                    as1 = TagUtil.generateAttributes(as, 1);
                }
            }
            s = generatePageviewTag(s, s1, s2, s3, as1, ((String) (obj)));
        }
        QueueBuffer.getInstance().post(s);
        sessionmanager.onPageView();
        s.setDataConstraintSuccess(flag);
        return s;
    }

    public DAModel fireProductview(String s, String s1, String s2, String s3, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("PageId is required");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("ProductId is required");
        }
        if (s2 == null)
        {
            throw new IllegalArgumentException("ProductName is required");
        }
        Object obj = new HashMap();
        ((Map) (obj)).put("PRODUCTID", s1);
        ((Map) (obj)).put("PRODUCTNAME", s2);
        ((Map) (obj)).put("CATEGORYID", s3);
        ((Map) (obj)).put("ATTRIBUTE", as);
        boolean flag = SizeValidator.PRODUCTVIEW.validate(((Map) (obj)));
        HashMap hashmap = new HashMap();
        obj = hashmap;
        if (as != null)
        {
            obj = hashmap;
            if (as.length > 0)
            {
                obj = TagUtil.generateAttributes(as, 5);
            }
        }
        as = new DAModel();
        as.putData("tid", "5");
        as.putData("pi", s);
        as.putData("pr", s1);
        as.putData("pm", s2);
        if (s3 != null)
        {
            as.putData("cg", s3);
        }
        for (s = ((Map) (obj)).entrySet().iterator(); s.hasNext(); as.putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        addSystemParameters(as);
        QueueBuffer.getInstance().post(as);
        as.setDataConstraintSuccess(flag);
        return as;
    }

    public DAModel fireRegistration(String s, String s1, String s2, String s3, String s4, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Customer Id is required");
        }
        Object obj = new HashMap();
        ((Map) (obj)).put("REGISTRATIONID", s);
        ((Map) (obj)).put("EMAIL", s1);
        ((Map) (obj)).put("CITY", s2);
        ((Map) (obj)).put("STATE", s3);
        ((Map) (obj)).put("ZIP", s4);
        ((Map) (obj)).put("ATTRIBUTE", as);
        boolean flag = SizeValidator.REGISTRATION.validate(((Map) (obj)));
        HashMap hashmap = new HashMap();
        obj = hashmap;
        if (as != null)
        {
            obj = hashmap;
            if (as.length > 0)
            {
                obj = TagUtil.generateAttributes(as, 2);
            }
        }
        as = new DAModel();
        as.putData("tid", "2");
        as.putData("cd", s);
        if (s1 != null)
        {
            as.putData("em", s1);
        }
        if (s2 != null)
        {
            as.putData("ct", s2);
        }
        if (s3 != null)
        {
            as.putData("sa", s3);
        }
        if (s4 != null)
        {
            as.putData("zp", s4);
        }
        for (s = ((Map) (obj)).entrySet().iterator(); s.hasNext(); as.putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        addSystemParameters(as);
        QueueBuffer.getInstance().post(as);
        as.setDataConstraintSuccess(flag);
        return as;
    }

    public DAModel fireShopAction5(String s, String s1, String s2, String s3, String s4, String s5, String as[])
    {
        Object obj;
        Object obj1;
        boolean flag;
        if (s == null)
        {
            throw new IllegalArgumentException("ProductId is required");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("ProductName is required");
        }
        if (s2 == null)
        {
            throw new IllegalArgumentException("Quantity is required");
        }
        if (s3 == null)
        {
            throw new IllegalArgumentException("Base Unit Price is required");
        }
        if (s5 == null)
        {
            throw new IllegalArgumentException("Currency Code is required");
        }
        obj = new HashMap();
        ((Map) (obj)).put("PRODUCTID", s);
        ((Map) (obj)).put("PRODUCTNAME", s1);
        ((Map) (obj)).put("QUANTITY", s2);
        ((Map) (obj)).put("UNITPRICE", s3);
        ((Map) (obj)).put("CATEGORYID", s4);
        ((Map) (obj)).put("ATTRIBUTE", as);
        flag = SizeValidator.SHOPACTION5.validate(((Map) (obj)));
        obj1 = new HashMap();
        obj = obj1;
        if (as == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (as.length <= 0) goto _L2; else goto _L3
_L3:
        obj = TagUtil.generateAttributes(as, 4);
        as = TagUtil.generateHash(as);
_L5:
        obj1 = new DAModel();
        ((DAModel) (obj1)).putData("tid", "4");
        ((DAModel) (obj1)).putData("at", "5");
        ((DAModel) (obj1)).putData("pr", s);
        ((DAModel) (obj1)).putData("pm", s1);
        ((DAModel) (obj1)).putData("qt", s2);
        ((DAModel) (obj1)).putData("bp", s3);
        if (s4 != null)
        {
            ((DAModel) (obj1)).putData("cg", s4);
        }
        ((DAModel) (obj1)).putData("cc", s5);
        for (s = ((Map) (obj)).entrySet().iterator(); s.hasNext(); ((DAModel) (obj1)).putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        break; /* Loop/switch isn't completed */
        as;
        LoggingUtil.log(as.getMessage(), 4);
        as = "";
        continue; /* Loop/switch isn't completed */
        as;
        LoggingUtil.log(as.getMessage(), 4);
_L2:
        as = "";
        if (true) goto _L5; else goto _L4
_L4:
        ((DAModel) (obj1)).putData("ha1", as);
        addSystemParameters(((DAModel) (obj1)));
        QueueBuffer.getInstance().post(((DAModel) (obj1)));
        ((DAModel) (obj1)).setDataConstraintSuccess(flag);
        return ((DAModel) (obj1));
    }

    public DAModel fireShopAction9(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String as[])
    {
        Object obj;
        Object obj1;
        boolean flag;
        if (s == null)
        {
            throw new IllegalArgumentException("ProductId is required");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("ProductName is required");
        }
        if (s2 == null)
        {
            throw new IllegalArgumentException("Quantity is required");
        }
        if (s3 == null)
        {
            throw new IllegalArgumentException("Base Unit Price is required");
        }
        if (s8 == null)
        {
            throw new IllegalArgumentException("Currency Code is required");
        }
        if (s5 == null)
        {
            throw new IllegalArgumentException("Order Id is required");
        }
        if (s6 == null)
        {
            throw new IllegalArgumentException("Order Subtotal is required");
        }
        if (s7 == null)
        {
            throw new IllegalArgumentException("Customer Id is required");
        }
        obj = new HashMap();
        ((Map) (obj)).put("PRODUCTID", s);
        ((Map) (obj)).put("PRODUCTNAME", s1);
        ((Map) (obj)).put("QUANTITY", s2);
        ((Map) (obj)).put("UNITPRICE", s3);
        ((Map) (obj)).put("CATEGORYID", s4);
        ((Map) (obj)).put("ORDERID", s5);
        ((Map) (obj)).put("ORDERSUBTOTAL", s6);
        ((Map) (obj)).put("REGISTRATIONID", s7);
        ((Map) (obj)).put("ATTRIBUTE", as);
        flag = SizeValidator.SHOPACTION9.validate(((Map) (obj)));
        obj1 = new HashMap();
        obj = obj1;
        if (as == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (as.length <= 0) goto _L2; else goto _L3
_L3:
        obj = TagUtil.generateAttributes(as, 4);
        as = TagUtil.generateHash(as);
_L5:
        obj1 = new DAModel();
        ((DAModel) (obj1)).putData("tid", "4");
        ((DAModel) (obj1)).putData("at", "9");
        ((DAModel) (obj1)).putData("pr", s);
        ((DAModel) (obj1)).putData("pm", s1);
        ((DAModel) (obj1)).putData("qt", s2);
        ((DAModel) (obj1)).putData("bp", s3);
        if (s4 != null)
        {
            ((DAModel) (obj1)).putData("cg", s4);
        }
        ((DAModel) (obj1)).putData("cc", s8);
        ((DAModel) (obj1)).putData("on", s5);
        ((DAModel) (obj1)).putData("tr", s6);
        ((DAModel) (obj1)).putData("cd", s7);
        for (s = ((Map) (obj)).entrySet().iterator(); s.hasNext(); ((DAModel) (obj1)).putData((String)s1.getKey(), (String)s1.getValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

        break; /* Loop/switch isn't completed */
        as;
        LoggingUtil.log(as.getMessage(), 4);
        as = "";
        continue; /* Loop/switch isn't completed */
        as;
        LoggingUtil.log(as.getMessage(), 4);
_L2:
        as = "";
        if (true) goto _L5; else goto _L4
_L4:
        ((DAModel) (obj1)).putData("ha1", as);
        addSystemParameters(((DAModel) (obj1)));
        QueueBuffer.getInstance().post(((DAModel) (obj1)));
        ((DAModel) (obj1)).setDataConstraintSuccess(flag);
        return ((DAModel) (obj1));
    }

    Application getApplication()
    {
        if (application == null)
        {
            throw new IllegalStateException("Module is uninitialized. Please use startup(Application) to initialize the Module first");
        } else
        {
            return application;
        }
    }

    public HashMap httpHeaders()
    {
        return null;
    }

    public boolean isEnabled()
    {
        return _isEnabled.booleanValue();
    }

    public String libraryVersion()
    {
        return "1.0.1.0";
    }

    int maxLength(String s, String s1)
    {
        if (s != null && s1 != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        if (!constraints.has(s) || !(s = constraints.getJSONObject(s)).has(s1) || !(s = s.getJSONObject(s1)).has("length")) goto _L1; else goto _L3
_L3:
        int i = s.getInt("length");
        return i;
        s;
        LogInternal.logException(s);
        throw new RuntimeException(s);
    }

    public String name()
    {
        return "DigitalAnalytics";
    }

    public boolean onDestroyEO()
    {
        return true;
    }

    public boolean onLowMemoryEO()
    {
        return true;
    }

    public boolean onPauseEO()
    {
        return true;
    }

    public boolean onResumeEO()
    {
        return true;
    }

    public boolean onTerminateEO()
    {
        return true;
    }

    public String sessionId()
    {
        return SessionManager.getInstance().getSessionId();
    }

    public String startNewSession(Context context)
    {
        return SessionManager.getInstance().startNewSession();
    }

    public String visitorId()
    {
        return SessionManager.getInstance().getVisitorId();
    }
}
