// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.schemas.event;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TIOStreamTransport;

// Referenced classes of package com.pinterest.schemas.event:
//            EventType, EventData, Context, AppType, 
//            DeviceType, BrowserType, OSType, EventAppState, 
//            SiteType, Diagnostics

public class Event
    implements Serializable, Cloneable, Comparable, TBase
{

    private static final TField APP_FIELD_DESC = new TField("app", (byte)8, (short)9);
    private static final TField APP_STATE_FIELD_DESC = new TField("appState", (byte)8, (short)20);
    private static final TField APP_VERSION_FIELD_DESC = new TField("appVersion", (byte)11, (short)11);
    private static final TField AUX_DATA_FIELD_DESC = new TField("auxData", (byte)13, (short)5);
    private static final TField BROWSER_EXTENSION_TRACKING_ID_FIELD_DESC = new TField("browserExtensionTrackingId", (byte)10, (short)26);
    private static final TField BROWSER_FIELD_DESC = new TField("browser", (byte)8, (short)13);
    private static final TField CLIENT_ID_FIELD_DESC = new TField("clientId", (byte)10, (short)25);
    private static final TField CONTEXT_FIELD_DESC = new TField("context", (byte)12, (short)8);
    private static final TField DEVICE_FIELD_DESC = new TField("device", (byte)8, (short)12);
    private static final TField DEVICE_NAME_FIELD_DESC = new TField("deviceName", (byte)11, (short)15);
    private static final TField DIAGNOSTICS_FIELD_DESC = new TField("diagnostics", (byte)12, (short)22);
    private static final TField EVENT_DATA_FIELD_DESC = new TField("eventData", (byte)12, (short)6);
    private static final TField EVENT_TYPE_FIELD_DESC = new TField("eventType", (byte)8, (short)2);
    private static final TField FROM_THIRD_PARTY_FIELD_DESC = new TField("fromThirdParty", (byte)2, (short)27);
    private static final TField INSERTION_ID_FIELD_DESC = new TField("insertionId", (byte)11, (short)19);
    private static final TField OBJECT_ID_FIELD_DESC = new TField("objectId", (byte)10, (short)4);
    private static final TField OBJECT_ID_STR_FIELD_DESC = new TField("objectIdStr", (byte)11, (short)18);
    private static final TField OS_FIELD_DESC = new TField("os", (byte)8, (short)14);
    private static final TField PREVIOUS_CONTEXT_FIELD_DESC = new TField("previousContext", (byte)12, (short)7);
    private static final TField P_DATA_FIELD_DESC = new TField("pData", (byte)13, (short)24);
    private static final TField REQUEST_FIELD_DESC = new TField("request", (byte)11, (short)10);
    private static final TField SITE_FIELD_DESC = new TField("site", (byte)8, (short)21);
    private static final TStruct STRUCT_DESC = new TStruct("Event");
    private static final TField TIME_FIELD_DESC = new TField("time", (byte)10, (short)1);
    private static final TField UNAUTH_ID_FIELD_DESC = new TField("unauthId", (byte)11, (short)16);
    private static final TField USER_ID_FIELD_DESC = new TField("userId", (byte)10, (short)3);
    private static final TField USER_ID_STR_FIELD_DESC = new TField("userIdStr", (byte)11, (short)17);
    private static final TField UUID_FIELD_DESC = new TField("uuid", (byte)11, (short)23);
    private static final int __BROWSEREXTENSIONTRACKINGID_ISSET_ID = 4;
    private static final int __CLIENTID_ISSET_ID = 3;
    private static final int __FROMTHIRDPARTY_ISSET_ID = 5;
    private static final int __OBJECTID_ISSET_ID = 2;
    private static final int __TIME_ISSET_ID = 0;
    private static final int __USERID_ISSET_ID = 1;
    public static final Map metaDataMap;
    private static final _Fields optionals[];
    private static final Map schemes;
    private byte __isset_bitfield;
    public AppType app;
    public EventAppState appState;
    public String appVersion;
    public Map auxData;
    public BrowserType browser;
    public long browserExtensionTrackingId;
    public long clientId;
    public Context context;
    public DeviceType device;
    public String deviceName;
    public Diagnostics diagnostics;
    public EventData eventData;
    public EventType eventType;
    public boolean fromThirdParty;
    public String insertionId;
    public long objectId;
    public String objectIdStr;
    public OSType os;
    public Map pData;
    public Context previousContext;
    public String request;
    public SiteType site;
    public long time;
    public String unauthId;
    public long userId;
    public String userIdStr;
    public String uuid;

    public Event()
    {
        __isset_bitfield = 0;
        auxData = new HashMap();
        fromThirdParty = false;
    }

    public Event(long l, EventType eventtype, long l1, long l2, 
            Map map)
    {
        this();
        time = l;
        setTimeIsSet(true);
        eventType = eventtype;
        userId = l1;
        setUserIdIsSet(true);
        objectId = l2;
        setObjectIdIsSet(true);
        auxData = map;
    }

    public Event(Event event)
    {
        __isset_bitfield = 0;
        __isset_bitfield = event.__isset_bitfield;
        time = event.time;
        if (event.isSetEventType())
        {
            eventType = event.eventType;
        }
        userId = event.userId;
        objectId = event.objectId;
        if (event.isSetAuxData())
        {
            auxData = new HashMap(event.auxData);
        }
        if (event.isSetEventData())
        {
            eventData = new EventData(event.eventData);
        }
        if (event.isSetPreviousContext())
        {
            previousContext = new Context(event.previousContext);
        }
        if (event.isSetContext())
        {
            context = new Context(event.context);
        }
        if (event.isSetApp())
        {
            app = event.app;
        }
        if (event.isSetRequest())
        {
            request = event.request;
        }
        if (event.isSetAppVersion())
        {
            appVersion = event.appVersion;
        }
        if (event.isSetDevice())
        {
            device = event.device;
        }
        if (event.isSetBrowser())
        {
            browser = event.browser;
        }
        if (event.isSetOs())
        {
            os = event.os;
        }
        if (event.isSetDeviceName())
        {
            deviceName = event.deviceName;
        }
        if (event.isSetUnauthId())
        {
            unauthId = event.unauthId;
        }
        if (event.isSetUserIdStr())
        {
            userIdStr = event.userIdStr;
        }
        if (event.isSetObjectIdStr())
        {
            objectIdStr = event.objectIdStr;
        }
        if (event.isSetInsertionId())
        {
            insertionId = event.insertionId;
        }
        if (event.isSetAppState())
        {
            appState = event.appState;
        }
        if (event.isSetSite())
        {
            site = event.site;
        }
        if (event.isSetDiagnostics())
        {
            diagnostics = new Diagnostics(event.diagnostics);
        }
        if (event.isSetUuid())
        {
            uuid = event.uuid;
        }
        if (event.isSetPData())
        {
            pData = new HashMap(event.pData);
        }
        clientId = event.clientId;
        browserExtensionTrackingId = event.browserExtensionTrackingId;
        fromThirdParty = event.fromThirdParty;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        try
        {
            __isset_bitfield = 0;
            read(new TCompactProtocol(new TIOStreamTransport(objectinputstream)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw new IOException(objectinputstream.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        try
        {
            write(new TCompactProtocol(new TIOStreamTransport(objectoutputstream)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ObjectOutputStream objectoutputstream)
        {
            throw new IOException(objectoutputstream.getMessage());
        }
    }

    public void clear()
    {
        setTimeIsSet(false);
        time = 0L;
        eventType = null;
        setUserIdIsSet(false);
        userId = 0L;
        setObjectIdIsSet(false);
        objectId = 0L;
        auxData = new HashMap();
        eventData = null;
        previousContext = null;
        context = null;
        app = null;
        request = null;
        appVersion = null;
        device = null;
        browser = null;
        os = null;
        deviceName = null;
        unauthId = null;
        userIdStr = null;
        objectIdStr = null;
        insertionId = null;
        appState = null;
        site = null;
        diagnostics = null;
        uuid = null;
        pData = null;
        setClientIdIsSet(false);
        clientId = 0L;
        setBrowserExtensionTrackingIdIsSet(false);
        browserExtensionTrackingId = 0L;
        fromThirdParty = false;
    }

    public int compareTo(Event event)
    {
        if (getClass().equals(event.getClass())) goto _L2; else goto _L1
_L1:
        int i = getClass().getName().compareTo(event.getClass().getName());
_L4:
        return i;
_L2:
        int j;
        j = Boolean.valueOf(isSetTime()).compareTo(Boolean.valueOf(event.isSetTime()));
        i = j;
        if (j != 0) goto _L4; else goto _L3
_L3:
        if (!isSetTime())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(time, event.time);
        i = j;
        if (j != 0) goto _L4; else goto _L5
_L5:
        j = Boolean.valueOf(isSetEventType()).compareTo(Boolean.valueOf(event.isSetEventType()));
        i = j;
        if (j != 0) goto _L4; else goto _L6
_L6:
        if (!isSetEventType())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(eventType, event.eventType);
        i = j;
        if (j != 0) goto _L4; else goto _L7
_L7:
        j = Boolean.valueOf(isSetUserId()).compareTo(Boolean.valueOf(event.isSetUserId()));
        i = j;
        if (j != 0) goto _L4; else goto _L8
_L8:
        if (!isSetUserId())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(userId, event.userId);
        i = j;
        if (j != 0) goto _L4; else goto _L9
_L9:
        j = Boolean.valueOf(isSetObjectId()).compareTo(Boolean.valueOf(event.isSetObjectId()));
        i = j;
        if (j != 0) goto _L4; else goto _L10
_L10:
        if (!isSetObjectId())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(objectId, event.objectId);
        i = j;
        if (j != 0) goto _L4; else goto _L11
_L11:
        j = Boolean.valueOf(isSetAuxData()).compareTo(Boolean.valueOf(event.isSetAuxData()));
        i = j;
        if (j != 0) goto _L4; else goto _L12
_L12:
        if (!isSetAuxData())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(auxData, event.auxData);
        i = j;
        if (j != 0) goto _L4; else goto _L13
_L13:
        j = Boolean.valueOf(isSetEventData()).compareTo(Boolean.valueOf(event.isSetEventData()));
        i = j;
        if (j != 0) goto _L4; else goto _L14
_L14:
        if (!isSetEventData())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(eventData, event.eventData);
        i = j;
        if (j != 0) goto _L4; else goto _L15
_L15:
        j = Boolean.valueOf(isSetPreviousContext()).compareTo(Boolean.valueOf(event.isSetPreviousContext()));
        i = j;
        if (j != 0) goto _L4; else goto _L16
_L16:
        if (!isSetPreviousContext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(previousContext, event.previousContext);
        i = j;
        if (j != 0) goto _L4; else goto _L17
_L17:
        j = Boolean.valueOf(isSetContext()).compareTo(Boolean.valueOf(event.isSetContext()));
        i = j;
        if (j != 0) goto _L4; else goto _L18
_L18:
        if (!isSetContext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(context, event.context);
        i = j;
        if (j != 0) goto _L4; else goto _L19
_L19:
        j = Boolean.valueOf(isSetApp()).compareTo(Boolean.valueOf(event.isSetApp()));
        i = j;
        if (j != 0) goto _L4; else goto _L20
_L20:
        if (!isSetApp())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(app, event.app);
        i = j;
        if (j != 0) goto _L4; else goto _L21
_L21:
        j = Boolean.valueOf(isSetRequest()).compareTo(Boolean.valueOf(event.isSetRequest()));
        i = j;
        if (j != 0) goto _L4; else goto _L22
_L22:
        if (!isSetRequest())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(request, event.request);
        i = j;
        if (j != 0) goto _L4; else goto _L23
_L23:
        j = Boolean.valueOf(isSetAppVersion()).compareTo(Boolean.valueOf(event.isSetAppVersion()));
        i = j;
        if (j != 0) goto _L4; else goto _L24
_L24:
        if (!isSetAppVersion())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(appVersion, event.appVersion);
        i = j;
        if (j != 0) goto _L4; else goto _L25
_L25:
        j = Boolean.valueOf(isSetDevice()).compareTo(Boolean.valueOf(event.isSetDevice()));
        i = j;
        if (j != 0) goto _L4; else goto _L26
_L26:
        if (!isSetDevice())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(device, event.device);
        i = j;
        if (j != 0) goto _L4; else goto _L27
_L27:
        j = Boolean.valueOf(isSetBrowser()).compareTo(Boolean.valueOf(event.isSetBrowser()));
        i = j;
        if (j != 0) goto _L4; else goto _L28
_L28:
        if (!isSetBrowser())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(browser, event.browser);
        i = j;
        if (j != 0) goto _L4; else goto _L29
_L29:
        j = Boolean.valueOf(isSetOs()).compareTo(Boolean.valueOf(event.isSetOs()));
        i = j;
        if (j != 0) goto _L4; else goto _L30
_L30:
        if (!isSetOs())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(os, event.os);
        i = j;
        if (j != 0) goto _L4; else goto _L31
_L31:
        j = Boolean.valueOf(isSetDeviceName()).compareTo(Boolean.valueOf(event.isSetDeviceName()));
        i = j;
        if (j != 0) goto _L4; else goto _L32
_L32:
        if (!isSetDeviceName())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(deviceName, event.deviceName);
        i = j;
        if (j != 0) goto _L4; else goto _L33
_L33:
        j = Boolean.valueOf(isSetUnauthId()).compareTo(Boolean.valueOf(event.isSetUnauthId()));
        i = j;
        if (j != 0) goto _L4; else goto _L34
_L34:
        if (!isSetUnauthId())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(unauthId, event.unauthId);
        i = j;
        if (j != 0) goto _L4; else goto _L35
_L35:
        j = Boolean.valueOf(isSetUserIdStr()).compareTo(Boolean.valueOf(event.isSetUserIdStr()));
        i = j;
        if (j != 0) goto _L4; else goto _L36
_L36:
        if (!isSetUserIdStr())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(userIdStr, event.userIdStr);
        i = j;
        if (j != 0) goto _L4; else goto _L37
_L37:
        j = Boolean.valueOf(isSetObjectIdStr()).compareTo(Boolean.valueOf(event.isSetObjectIdStr()));
        i = j;
        if (j != 0) goto _L4; else goto _L38
_L38:
        if (!isSetObjectIdStr())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(objectIdStr, event.objectIdStr);
        i = j;
        if (j != 0) goto _L4; else goto _L39
_L39:
        j = Boolean.valueOf(isSetInsertionId()).compareTo(Boolean.valueOf(event.isSetInsertionId()));
        i = j;
        if (j != 0) goto _L4; else goto _L40
_L40:
        if (!isSetInsertionId())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(insertionId, event.insertionId);
        i = j;
        if (j != 0) goto _L4; else goto _L41
_L41:
        j = Boolean.valueOf(isSetAppState()).compareTo(Boolean.valueOf(event.isSetAppState()));
        i = j;
        if (j != 0) goto _L4; else goto _L42
_L42:
        if (!isSetAppState())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(appState, event.appState);
        i = j;
        if (j != 0) goto _L4; else goto _L43
_L43:
        j = Boolean.valueOf(isSetSite()).compareTo(Boolean.valueOf(event.isSetSite()));
        i = j;
        if (j != 0) goto _L4; else goto _L44
_L44:
        if (!isSetSite())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(site, event.site);
        i = j;
        if (j != 0) goto _L4; else goto _L45
_L45:
        j = Boolean.valueOf(isSetDiagnostics()).compareTo(Boolean.valueOf(event.isSetDiagnostics()));
        i = j;
        if (j != 0) goto _L4; else goto _L46
_L46:
        if (!isSetDiagnostics())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(diagnostics, event.diagnostics);
        i = j;
        if (j != 0) goto _L4; else goto _L47
_L47:
        j = Boolean.valueOf(isSetUuid()).compareTo(Boolean.valueOf(event.isSetUuid()));
        i = j;
        if (j != 0) goto _L4; else goto _L48
_L48:
        if (!isSetUuid())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(uuid, event.uuid);
        i = j;
        if (j != 0) goto _L4; else goto _L49
_L49:
        j = Boolean.valueOf(isSetPData()).compareTo(Boolean.valueOf(event.isSetPData()));
        i = j;
        if (j != 0) goto _L4; else goto _L50
_L50:
        if (!isSetPData())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(pData, event.pData);
        i = j;
        if (j != 0) goto _L4; else goto _L51
_L51:
        j = Boolean.valueOf(isSetClientId()).compareTo(Boolean.valueOf(event.isSetClientId()));
        i = j;
        if (j != 0) goto _L4; else goto _L52
_L52:
        if (!isSetClientId())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(clientId, event.clientId);
        i = j;
        if (j != 0) goto _L4; else goto _L53
_L53:
        j = Boolean.valueOf(isSetBrowserExtensionTrackingId()).compareTo(Boolean.valueOf(event.isSetBrowserExtensionTrackingId()));
        i = j;
        if (j != 0) goto _L4; else goto _L54
_L54:
        if (!isSetBrowserExtensionTrackingId())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(browserExtensionTrackingId, event.browserExtensionTrackingId);
        i = j;
        if (j != 0) goto _L4; else goto _L55
_L55:
        j = Boolean.valueOf(isSetFromThirdParty()).compareTo(Boolean.valueOf(event.isSetFromThirdParty()));
        i = j;
        if (j != 0) goto _L4; else goto _L56
_L56:
        if (!isSetFromThirdParty())
        {
            break; /* Loop/switch isn't completed */
        }
        j = TBaseHelper.compareTo(fromThirdParty, event.fromThirdParty);
        i = j;
        if (j != 0) goto _L4; else goto _L57
_L57:
        return 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Event)obj);
    }

    public Event deepCopy()
    {
        return new Event(this);
    }

    public volatile TBase deepCopy()
    {
        return deepCopy();
    }

    public boolean equals(Event event)
    {
        if (event != null && time == event.time)
        {
            boolean flag = isSetEventType();
            boolean flag24 = event.isSetEventType();
            if ((!flag && !flag24 || flag && flag24 && eventType.equals(event.eventType)) && userId == event.userId && objectId == event.objectId)
            {
                boolean flag1 = isSetAuxData();
                boolean flag25 = event.isSetAuxData();
                if (!flag1 && !flag25 || flag1 && flag25 && auxData.equals(event.auxData))
                {
                    boolean flag2 = isSetEventData();
                    boolean flag26 = event.isSetEventData();
                    if (!flag2 && !flag26 || flag2 && flag26 && eventData.equals(event.eventData))
                    {
                        boolean flag3 = isSetPreviousContext();
                        boolean flag27 = event.isSetPreviousContext();
                        if (!flag3 && !flag27 || flag3 && flag27 && previousContext.equals(event.previousContext))
                        {
                            boolean flag4 = isSetContext();
                            boolean flag28 = event.isSetContext();
                            if (!flag4 && !flag28 || flag4 && flag28 && context.equals(event.context))
                            {
                                boolean flag5 = isSetApp();
                                boolean flag29 = event.isSetApp();
                                if (!flag5 && !flag29 || flag5 && flag29 && app.equals(event.app))
                                {
                                    boolean flag6 = isSetRequest();
                                    boolean flag30 = event.isSetRequest();
                                    if (!flag6 && !flag30 || flag6 && flag30 && request.equals(event.request))
                                    {
                                        boolean flag7 = isSetAppVersion();
                                        boolean flag31 = event.isSetAppVersion();
                                        if (!flag7 && !flag31 || flag7 && flag31 && appVersion.equals(event.appVersion))
                                        {
                                            boolean flag8 = isSetDevice();
                                            boolean flag32 = event.isSetDevice();
                                            if (!flag8 && !flag32 || flag8 && flag32 && device.equals(event.device))
                                            {
                                                boolean flag9 = isSetBrowser();
                                                boolean flag33 = event.isSetBrowser();
                                                if (!flag9 && !flag33 || flag9 && flag33 && browser.equals(event.browser))
                                                {
                                                    boolean flag10 = isSetOs();
                                                    boolean flag34 = event.isSetOs();
                                                    if (!flag10 && !flag34 || flag10 && flag34 && os.equals(event.os))
                                                    {
                                                        boolean flag11 = isSetDeviceName();
                                                        boolean flag35 = event.isSetDeviceName();
                                                        if (!flag11 && !flag35 || flag11 && flag35 && deviceName.equals(event.deviceName))
                                                        {
                                                            boolean flag12 = isSetUnauthId();
                                                            boolean flag36 = event.isSetUnauthId();
                                                            if (!flag12 && !flag36 || flag12 && flag36 && unauthId.equals(event.unauthId))
                                                            {
                                                                boolean flag13 = isSetUserIdStr();
                                                                boolean flag37 = event.isSetUserIdStr();
                                                                if (!flag13 && !flag37 || flag13 && flag37 && userIdStr.equals(event.userIdStr))
                                                                {
                                                                    boolean flag14 = isSetObjectIdStr();
                                                                    boolean flag38 = event.isSetObjectIdStr();
                                                                    if (!flag14 && !flag38 || flag14 && flag38 && objectIdStr.equals(event.objectIdStr))
                                                                    {
                                                                        boolean flag15 = isSetInsertionId();
                                                                        boolean flag39 = event.isSetInsertionId();
                                                                        if (!flag15 && !flag39 || flag15 && flag39 && insertionId.equals(event.insertionId))
                                                                        {
                                                                            boolean flag16 = isSetAppState();
                                                                            boolean flag40 = event.isSetAppState();
                                                                            if (!flag16 && !flag40 || flag16 && flag40 && appState.equals(event.appState))
                                                                            {
                                                                                boolean flag17 = isSetSite();
                                                                                boolean flag41 = event.isSetSite();
                                                                                if (!flag17 && !flag41 || flag17 && flag41 && site.equals(event.site))
                                                                                {
                                                                                    boolean flag18 = isSetDiagnostics();
                                                                                    boolean flag42 = event.isSetDiagnostics();
                                                                                    if (!flag18 && !flag42 || flag18 && flag42 && diagnostics.equals(event.diagnostics))
                                                                                    {
                                                                                        boolean flag19 = isSetUuid();
                                                                                        boolean flag43 = event.isSetUuid();
                                                                                        if (!flag19 && !flag43 || flag19 && flag43 && uuid.equals(event.uuid))
                                                                                        {
                                                                                            boolean flag20 = isSetPData();
                                                                                            boolean flag44 = event.isSetPData();
                                                                                            if (!flag20 && !flag44 || flag20 && flag44 && pData.equals(event.pData))
                                                                                            {
                                                                                                boolean flag21 = isSetClientId();
                                                                                                boolean flag45 = event.isSetClientId();
                                                                                                if (!flag21 && !flag45 || flag21 && flag45 && clientId == event.clientId)
                                                                                                {
                                                                                                    boolean flag22 = isSetBrowserExtensionTrackingId();
                                                                                                    boolean flag46 = event.isSetBrowserExtensionTrackingId();
                                                                                                    if (!flag22 && !flag46 || flag22 && flag46 && browserExtensionTrackingId == event.browserExtensionTrackingId)
                                                                                                    {
                                                                                                        boolean flag23 = isSetFromThirdParty();
                                                                                                        boolean flag47 = event.isSetFromThirdParty();
                                                                                                        if (!flag23 && !flag47 || flag23 && flag47 && fromThirdParty == event.fromThirdParty)
                                                                                                        {
                                                                                                            return true;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof Event)) 
        {
            return false;
        }
        return equals((Event)obj);
    }

    public _Fields fieldForId(int i)
    {
        return _Fields.findByThriftId(i);
    }

    public volatile TFieldIdEnum fieldForId(int i)
    {
        return fieldForId(i);
    }

    public AppType getApp()
    {
        return app;
    }

    public EventAppState getAppState()
    {
        return appState;
    }

    public String getAppVersion()
    {
        return appVersion;
    }

    public Map getAuxData()
    {
        return auxData;
    }

    public int getAuxDataSize()
    {
        if (auxData == null)
        {
            return 0;
        } else
        {
            return auxData.size();
        }
    }

    public BrowserType getBrowser()
    {
        return browser;
    }

    public long getBrowserExtensionTrackingId()
    {
        return browserExtensionTrackingId;
    }

    public long getClientId()
    {
        return clientId;
    }

    public Context getContext()
    {
        return context;
    }

    public DeviceType getDevice()
    {
        return device;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public Diagnostics getDiagnostics()
    {
        return diagnostics;
    }

    public EventData getEventData()
    {
        return eventData;
    }

    public EventType getEventType()
    {
        return eventType;
    }

    public Object getFieldValue(_Fields _pfields)
    {
        switch (_cls1..SwitchMap.com.pinterest.schemas.event.Event._Fields[_pfields.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            return Long.valueOf(getTime());

        case 2: // '\002'
            return getEventType();

        case 3: // '\003'
            return Long.valueOf(getUserId());

        case 4: // '\004'
            return Long.valueOf(getObjectId());

        case 5: // '\005'
            return getAuxData();

        case 6: // '\006'
            return getEventData();

        case 7: // '\007'
            return getPreviousContext();

        case 8: // '\b'
            return getContext();

        case 9: // '\t'
            return getApp();

        case 10: // '\n'
            return getRequest();

        case 11: // '\013'
            return getAppVersion();

        case 12: // '\f'
            return getDevice();

        case 13: // '\r'
            return getBrowser();

        case 14: // '\016'
            return getOs();

        case 15: // '\017'
            return getDeviceName();

        case 16: // '\020'
            return getUnauthId();

        case 17: // '\021'
            return getUserIdStr();

        case 18: // '\022'
            return getObjectIdStr();

        case 19: // '\023'
            return getInsertionId();

        case 20: // '\024'
            return getAppState();

        case 21: // '\025'
            return getSite();

        case 22: // '\026'
            return getDiagnostics();

        case 23: // '\027'
            return getUuid();

        case 24: // '\030'
            return getPData();

        case 25: // '\031'
            return Long.valueOf(getClientId());

        case 26: // '\032'
            return Long.valueOf(getBrowserExtensionTrackingId());

        case 27: // '\033'
            return Boolean.valueOf(isFromThirdParty());
        }
    }

    public volatile Object getFieldValue(TFieldIdEnum tfieldidenum)
    {
        return getFieldValue((_Fields)tfieldidenum);
    }

    public String getInsertionId()
    {
        return insertionId;
    }

    public long getObjectId()
    {
        return objectId;
    }

    public String getObjectIdStr()
    {
        return objectIdStr;
    }

    public OSType getOs()
    {
        return os;
    }

    public Map getPData()
    {
        return pData;
    }

    public int getPDataSize()
    {
        if (pData == null)
        {
            return 0;
        } else
        {
            return pData.size();
        }
    }

    public Context getPreviousContext()
    {
        return previousContext;
    }

    public String getRequest()
    {
        return request;
    }

    public SiteType getSite()
    {
        return site;
    }

    public long getTime()
    {
        return time;
    }

    public String getUnauthId()
    {
        return unauthId;
    }

    public long getUserId()
    {
        return userId;
    }

    public String getUserIdStr()
    {
        return userIdStr;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Boolean.valueOf(true));
        arraylist.add(Long.valueOf(time));
        boolean flag = isSetEventType();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Integer.valueOf(eventType.getValue()));
        }
        arraylist.add(Boolean.valueOf(true));
        arraylist.add(Long.valueOf(userId));
        arraylist.add(Boolean.valueOf(true));
        arraylist.add(Long.valueOf(objectId));
        flag = isSetAuxData();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(auxData);
        }
        flag = isSetEventData();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(eventData);
        }
        flag = isSetPreviousContext();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(previousContext);
        }
        flag = isSetContext();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(context);
        }
        flag = isSetApp();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Integer.valueOf(app.getValue()));
        }
        flag = isSetRequest();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(request);
        }
        flag = isSetAppVersion();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(appVersion);
        }
        flag = isSetDevice();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Integer.valueOf(device.getValue()));
        }
        flag = isSetBrowser();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Integer.valueOf(browser.getValue()));
        }
        flag = isSetOs();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Integer.valueOf(os.getValue()));
        }
        flag = isSetDeviceName();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(deviceName);
        }
        flag = isSetUnauthId();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(unauthId);
        }
        flag = isSetUserIdStr();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(userIdStr);
        }
        flag = isSetObjectIdStr();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(objectIdStr);
        }
        flag = isSetInsertionId();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(insertionId);
        }
        flag = isSetAppState();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Integer.valueOf(appState.getValue()));
        }
        flag = isSetSite();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Integer.valueOf(site.getValue()));
        }
        flag = isSetDiagnostics();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(diagnostics);
        }
        flag = isSetUuid();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(uuid);
        }
        flag = isSetPData();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(pData);
        }
        flag = isSetClientId();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Long.valueOf(clientId));
        }
        flag = isSetBrowserExtensionTrackingId();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Long.valueOf(browserExtensionTrackingId));
        }
        flag = isSetFromThirdParty();
        arraylist.add(Boolean.valueOf(flag));
        if (flag)
        {
            arraylist.add(Boolean.valueOf(fromThirdParty));
        }
        return arraylist.hashCode();
    }

    public boolean isFromThirdParty()
    {
        return fromThirdParty;
    }

    public boolean isSet(_Fields _pfields)
    {
        if (_pfields == null)
        {
            throw new IllegalArgumentException();
        }
        switch (_cls1..SwitchMap.com.pinterest.schemas.event.Event._Fields[_pfields.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            return isSetTime();

        case 2: // '\002'
            return isSetEventType();

        case 3: // '\003'
            return isSetUserId();

        case 4: // '\004'
            return isSetObjectId();

        case 5: // '\005'
            return isSetAuxData();

        case 6: // '\006'
            return isSetEventData();

        case 7: // '\007'
            return isSetPreviousContext();

        case 8: // '\b'
            return isSetContext();

        case 9: // '\t'
            return isSetApp();

        case 10: // '\n'
            return isSetRequest();

        case 11: // '\013'
            return isSetAppVersion();

        case 12: // '\f'
            return isSetDevice();

        case 13: // '\r'
            return isSetBrowser();

        case 14: // '\016'
            return isSetOs();

        case 15: // '\017'
            return isSetDeviceName();

        case 16: // '\020'
            return isSetUnauthId();

        case 17: // '\021'
            return isSetUserIdStr();

        case 18: // '\022'
            return isSetObjectIdStr();

        case 19: // '\023'
            return isSetInsertionId();

        case 20: // '\024'
            return isSetAppState();

        case 21: // '\025'
            return isSetSite();

        case 22: // '\026'
            return isSetDiagnostics();

        case 23: // '\027'
            return isSetUuid();

        case 24: // '\030'
            return isSetPData();

        case 25: // '\031'
            return isSetClientId();

        case 26: // '\032'
            return isSetBrowserExtensionTrackingId();

        case 27: // '\033'
            return isSetFromThirdParty();
        }
    }

    public volatile boolean isSet(TFieldIdEnum tfieldidenum)
    {
        return isSet((_Fields)tfieldidenum);
    }

    public boolean isSetApp()
    {
        return app != null;
    }

    public boolean isSetAppState()
    {
        return appState != null;
    }

    public boolean isSetAppVersion()
    {
        return appVersion != null;
    }

    public boolean isSetAuxData()
    {
        return auxData != null;
    }

    public boolean isSetBrowser()
    {
        return browser != null;
    }

    public boolean isSetBrowserExtensionTrackingId()
    {
        return EncodingUtils.testBit(__isset_bitfield, 4);
    }

    public boolean isSetClientId()
    {
        return EncodingUtils.testBit(__isset_bitfield, 3);
    }

    public boolean isSetContext()
    {
        return context != null;
    }

    public boolean isSetDevice()
    {
        return device != null;
    }

    public boolean isSetDeviceName()
    {
        return deviceName != null;
    }

    public boolean isSetDiagnostics()
    {
        return diagnostics != null;
    }

    public boolean isSetEventData()
    {
        return eventData != null;
    }

    public boolean isSetEventType()
    {
        return eventType != null;
    }

    public boolean isSetFromThirdParty()
    {
        return EncodingUtils.testBit(__isset_bitfield, 5);
    }

    public boolean isSetInsertionId()
    {
        return insertionId != null;
    }

    public boolean isSetObjectId()
    {
        return EncodingUtils.testBit(__isset_bitfield, 2);
    }

    public boolean isSetObjectIdStr()
    {
        return objectIdStr != null;
    }

    public boolean isSetOs()
    {
        return os != null;
    }

    public boolean isSetPData()
    {
        return pData != null;
    }

    public boolean isSetPreviousContext()
    {
        return previousContext != null;
    }

    public boolean isSetRequest()
    {
        return request != null;
    }

    public boolean isSetSite()
    {
        return site != null;
    }

    public boolean isSetTime()
    {
        return EncodingUtils.testBit(__isset_bitfield, 0);
    }

    public boolean isSetUnauthId()
    {
        return unauthId != null;
    }

    public boolean isSetUserId()
    {
        return EncodingUtils.testBit(__isset_bitfield, 1);
    }

    public boolean isSetUserIdStr()
    {
        return userIdStr != null;
    }

    public boolean isSetUuid()
    {
        return uuid != null;
    }

    public void putToAuxData(String s, String s1)
    {
        if (auxData == null)
        {
            auxData = new HashMap();
        }
        auxData.put(s, s1);
    }

    public void putToPData(String s, String s1)
    {
        if (pData == null)
        {
            pData = new HashMap();
        }
        pData.put(s, s1);
    }

    public void read(TProtocol tprotocol)
    {
        ((SchemeFactory)schemes.get(tprotocol.getScheme())).getScheme().read(tprotocol, this);
    }

    public Event setApp(AppType apptype)
    {
        app = apptype;
        return this;
    }

    public void setAppIsSet(boolean flag)
    {
        if (!flag)
        {
            app = null;
        }
    }

    public Event setAppState(EventAppState eventappstate)
    {
        appState = eventappstate;
        return this;
    }

    public void setAppStateIsSet(boolean flag)
    {
        if (!flag)
        {
            appState = null;
        }
    }

    public Event setAppVersion(String s)
    {
        appVersion = s;
        return this;
    }

    public void setAppVersionIsSet(boolean flag)
    {
        if (!flag)
        {
            appVersion = null;
        }
    }

    public Event setAuxData(Map map)
    {
        auxData = map;
        return this;
    }

    public void setAuxDataIsSet(boolean flag)
    {
        if (!flag)
        {
            auxData = null;
        }
    }

    public Event setBrowser(BrowserType browsertype)
    {
        browser = browsertype;
        return this;
    }

    public Event setBrowserExtensionTrackingId(long l)
    {
        browserExtensionTrackingId = l;
        setBrowserExtensionTrackingIdIsSet(true);
        return this;
    }

    public void setBrowserExtensionTrackingIdIsSet(boolean flag)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, 4, flag);
    }

    public void setBrowserIsSet(boolean flag)
    {
        if (!flag)
        {
            browser = null;
        }
    }

    public Event setClientId(long l)
    {
        clientId = l;
        setClientIdIsSet(true);
        return this;
    }

    public void setClientIdIsSet(boolean flag)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, 3, flag);
    }

    public Event setContext(Context context1)
    {
        context = context1;
        return this;
    }

    public void setContextIsSet(boolean flag)
    {
        if (!flag)
        {
            context = null;
        }
    }

    public Event setDevice(DeviceType devicetype)
    {
        device = devicetype;
        return this;
    }

    public void setDeviceIsSet(boolean flag)
    {
        if (!flag)
        {
            device = null;
        }
    }

    public Event setDeviceName(String s)
    {
        deviceName = s;
        return this;
    }

    public void setDeviceNameIsSet(boolean flag)
    {
        if (!flag)
        {
            deviceName = null;
        }
    }

    public Event setDiagnostics(Diagnostics diagnostics1)
    {
        diagnostics = diagnostics1;
        return this;
    }

    public void setDiagnosticsIsSet(boolean flag)
    {
        if (!flag)
        {
            diagnostics = null;
        }
    }

    public Event setEventData(EventData eventdata)
    {
        eventData = eventdata;
        return this;
    }

    public void setEventDataIsSet(boolean flag)
    {
        if (!flag)
        {
            eventData = null;
        }
    }

    public Event setEventType(EventType eventtype)
    {
        eventType = eventtype;
        return this;
    }

    public void setEventTypeIsSet(boolean flag)
    {
        if (!flag)
        {
            eventType = null;
        }
    }

    public void setFieldValue(_Fields _pfields, Object obj)
    {
        switch (_cls1..SwitchMap.com.pinterest.schemas.event.Event._Fields[_pfields.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (obj == null)
            {
                unsetTime();
                return;
            } else
            {
                setTime(((Long)obj).longValue());
                return;
            }

        case 2: // '\002'
            if (obj == null)
            {
                unsetEventType();
                return;
            } else
            {
                setEventType((EventType)obj);
                return;
            }

        case 3: // '\003'
            if (obj == null)
            {
                unsetUserId();
                return;
            } else
            {
                setUserId(((Long)obj).longValue());
                return;
            }

        case 4: // '\004'
            if (obj == null)
            {
                unsetObjectId();
                return;
            } else
            {
                setObjectId(((Long)obj).longValue());
                return;
            }

        case 5: // '\005'
            if (obj == null)
            {
                unsetAuxData();
                return;
            } else
            {
                setAuxData((Map)obj);
                return;
            }

        case 6: // '\006'
            if (obj == null)
            {
                unsetEventData();
                return;
            } else
            {
                setEventData((EventData)obj);
                return;
            }

        case 7: // '\007'
            if (obj == null)
            {
                unsetPreviousContext();
                return;
            } else
            {
                setPreviousContext((Context)obj);
                return;
            }

        case 8: // '\b'
            if (obj == null)
            {
                unsetContext();
                return;
            } else
            {
                setContext((Context)obj);
                return;
            }

        case 9: // '\t'
            if (obj == null)
            {
                unsetApp();
                return;
            } else
            {
                setApp((AppType)obj);
                return;
            }

        case 10: // '\n'
            if (obj == null)
            {
                unsetRequest();
                return;
            } else
            {
                setRequest((String)obj);
                return;
            }

        case 11: // '\013'
            if (obj == null)
            {
                unsetAppVersion();
                return;
            } else
            {
                setAppVersion((String)obj);
                return;
            }

        case 12: // '\f'
            if (obj == null)
            {
                unsetDevice();
                return;
            } else
            {
                setDevice((DeviceType)obj);
                return;
            }

        case 13: // '\r'
            if (obj == null)
            {
                unsetBrowser();
                return;
            } else
            {
                setBrowser((BrowserType)obj);
                return;
            }

        case 14: // '\016'
            if (obj == null)
            {
                unsetOs();
                return;
            } else
            {
                setOs((OSType)obj);
                return;
            }

        case 15: // '\017'
            if (obj == null)
            {
                unsetDeviceName();
                return;
            } else
            {
                setDeviceName((String)obj);
                return;
            }

        case 16: // '\020'
            if (obj == null)
            {
                unsetUnauthId();
                return;
            } else
            {
                setUnauthId((String)obj);
                return;
            }

        case 17: // '\021'
            if (obj == null)
            {
                unsetUserIdStr();
                return;
            } else
            {
                setUserIdStr((String)obj);
                return;
            }

        case 18: // '\022'
            if (obj == null)
            {
                unsetObjectIdStr();
                return;
            } else
            {
                setObjectIdStr((String)obj);
                return;
            }

        case 19: // '\023'
            if (obj == null)
            {
                unsetInsertionId();
                return;
            } else
            {
                setInsertionId((String)obj);
                return;
            }

        case 20: // '\024'
            if (obj == null)
            {
                unsetAppState();
                return;
            } else
            {
                setAppState((EventAppState)obj);
                return;
            }

        case 21: // '\025'
            if (obj == null)
            {
                unsetSite();
                return;
            } else
            {
                setSite((SiteType)obj);
                return;
            }

        case 22: // '\026'
            if (obj == null)
            {
                unsetDiagnostics();
                return;
            } else
            {
                setDiagnostics((Diagnostics)obj);
                return;
            }

        case 23: // '\027'
            if (obj == null)
            {
                unsetUuid();
                return;
            } else
            {
                setUuid((String)obj);
                return;
            }

        case 24: // '\030'
            if (obj == null)
            {
                unsetPData();
                return;
            } else
            {
                setPData((Map)obj);
                return;
            }

        case 25: // '\031'
            if (obj == null)
            {
                unsetClientId();
                return;
            } else
            {
                setClientId(((Long)obj).longValue());
                return;
            }

        case 26: // '\032'
            if (obj == null)
            {
                unsetBrowserExtensionTrackingId();
                return;
            } else
            {
                setBrowserExtensionTrackingId(((Long)obj).longValue());
                return;
            }

        case 27: // '\033'
            break;
        }
        if (obj == null)
        {
            unsetFromThirdParty();
            return;
        } else
        {
            setFromThirdParty(((Boolean)obj).booleanValue());
            return;
        }
    }

    public volatile void setFieldValue(TFieldIdEnum tfieldidenum, Object obj)
    {
        setFieldValue((_Fields)tfieldidenum, obj);
    }

    public Event setFromThirdParty(boolean flag)
    {
        fromThirdParty = flag;
        setFromThirdPartyIsSet(true);
        return this;
    }

    public void setFromThirdPartyIsSet(boolean flag)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, 5, flag);
    }

    public Event setInsertionId(String s)
    {
        insertionId = s;
        return this;
    }

    public void setInsertionIdIsSet(boolean flag)
    {
        if (!flag)
        {
            insertionId = null;
        }
    }

    public Event setObjectId(long l)
    {
        objectId = l;
        setObjectIdIsSet(true);
        return this;
    }

    public void setObjectIdIsSet(boolean flag)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, 2, flag);
    }

    public Event setObjectIdStr(String s)
    {
        objectIdStr = s;
        return this;
    }

    public void setObjectIdStrIsSet(boolean flag)
    {
        if (!flag)
        {
            objectIdStr = null;
        }
    }

    public Event setOs(OSType ostype)
    {
        os = ostype;
        return this;
    }

    public void setOsIsSet(boolean flag)
    {
        if (!flag)
        {
            os = null;
        }
    }

    public Event setPData(Map map)
    {
        pData = map;
        return this;
    }

    public void setPDataIsSet(boolean flag)
    {
        if (!flag)
        {
            pData = null;
        }
    }

    public Event setPreviousContext(Context context1)
    {
        previousContext = context1;
        return this;
    }

    public void setPreviousContextIsSet(boolean flag)
    {
        if (!flag)
        {
            previousContext = null;
        }
    }

    public Event setRequest(String s)
    {
        request = s;
        return this;
    }

    public void setRequestIsSet(boolean flag)
    {
        if (!flag)
        {
            request = null;
        }
    }

    public Event setSite(SiteType sitetype)
    {
        site = sitetype;
        return this;
    }

    public void setSiteIsSet(boolean flag)
    {
        if (!flag)
        {
            site = null;
        }
    }

    public Event setTime(long l)
    {
        time = l;
        setTimeIsSet(true);
        return this;
    }

    public void setTimeIsSet(boolean flag)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, 0, flag);
    }

    public Event setUnauthId(String s)
    {
        unauthId = s;
        return this;
    }

    public void setUnauthIdIsSet(boolean flag)
    {
        if (!flag)
        {
            unauthId = null;
        }
    }

    public Event setUserId(long l)
    {
        userId = l;
        setUserIdIsSet(true);
        return this;
    }

    public void setUserIdIsSet(boolean flag)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, 1, flag);
    }

    public Event setUserIdStr(String s)
    {
        userIdStr = s;
        return this;
    }

    public void setUserIdStrIsSet(boolean flag)
    {
        if (!flag)
        {
            userIdStr = null;
        }
    }

    public Event setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public void setUuidIsSet(boolean flag)
    {
        if (!flag)
        {
            uuid = null;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Event(");
        stringbuilder.append("time:");
        stringbuilder.append(time);
        stringbuilder.append(", ");
        stringbuilder.append("eventType:");
        if (eventType == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(eventType);
        }
        stringbuilder.append(", ");
        stringbuilder.append("userId:");
        stringbuilder.append(userId);
        stringbuilder.append(", ");
        stringbuilder.append("objectId:");
        stringbuilder.append(objectId);
        stringbuilder.append(", ");
        stringbuilder.append("auxData:");
        if (auxData == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(auxData);
        }
        if (isSetEventData())
        {
            stringbuilder.append(", ");
            stringbuilder.append("eventData:");
            if (eventData == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(eventData);
            }
        }
        if (isSetPreviousContext())
        {
            stringbuilder.append(", ");
            stringbuilder.append("previousContext:");
            if (previousContext == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(previousContext);
            }
        }
        if (isSetContext())
        {
            stringbuilder.append(", ");
            stringbuilder.append("context:");
            if (context == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(context);
            }
        }
        if (isSetApp())
        {
            stringbuilder.append(", ");
            stringbuilder.append("app:");
            if (app == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(app);
            }
        }
        if (isSetRequest())
        {
            stringbuilder.append(", ");
            stringbuilder.append("request:");
            if (request == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(request);
            }
        }
        if (isSetAppVersion())
        {
            stringbuilder.append(", ");
            stringbuilder.append("appVersion:");
            if (appVersion == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(appVersion);
            }
        }
        if (isSetDevice())
        {
            stringbuilder.append(", ");
            stringbuilder.append("device:");
            if (device == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(device);
            }
        }
        if (isSetBrowser())
        {
            stringbuilder.append(", ");
            stringbuilder.append("browser:");
            if (browser == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(browser);
            }
        }
        if (isSetOs())
        {
            stringbuilder.append(", ");
            stringbuilder.append("os:");
            if (os == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(os);
            }
        }
        if (isSetDeviceName())
        {
            stringbuilder.append(", ");
            stringbuilder.append("deviceName:");
            if (deviceName == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(deviceName);
            }
        }
        if (isSetUnauthId())
        {
            stringbuilder.append(", ");
            stringbuilder.append("unauthId:");
            if (unauthId == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(unauthId);
            }
        }
        if (isSetUserIdStr())
        {
            stringbuilder.append(", ");
            stringbuilder.append("userIdStr:");
            if (userIdStr == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(userIdStr);
            }
        }
        if (isSetObjectIdStr())
        {
            stringbuilder.append(", ");
            stringbuilder.append("objectIdStr:");
            if (objectIdStr == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(objectIdStr);
            }
        }
        if (isSetInsertionId())
        {
            stringbuilder.append(", ");
            stringbuilder.append("insertionId:");
            if (insertionId == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(insertionId);
            }
        }
        if (isSetAppState())
        {
            stringbuilder.append(", ");
            stringbuilder.append("appState:");
            if (appState == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(appState);
            }
        }
        if (isSetSite())
        {
            stringbuilder.append(", ");
            stringbuilder.append("site:");
            if (site == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(site);
            }
        }
        if (isSetDiagnostics())
        {
            stringbuilder.append(", ");
            stringbuilder.append("diagnostics:");
            if (diagnostics == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(diagnostics);
            }
        }
        if (isSetUuid())
        {
            stringbuilder.append(", ");
            stringbuilder.append("uuid:");
            if (uuid == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(uuid);
            }
        }
        if (isSetPData())
        {
            stringbuilder.append(", ");
            stringbuilder.append("pData:");
            if (pData == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(pData);
            }
        }
        if (isSetClientId())
        {
            stringbuilder.append(", ");
            stringbuilder.append("clientId:");
            stringbuilder.append(clientId);
        }
        if (isSetBrowserExtensionTrackingId())
        {
            stringbuilder.append(", ");
            stringbuilder.append("browserExtensionTrackingId:");
            stringbuilder.append(browserExtensionTrackingId);
        }
        if (isSetFromThirdParty())
        {
            stringbuilder.append(", ");
            stringbuilder.append("fromThirdParty:");
            stringbuilder.append(fromThirdParty);
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    public void unsetApp()
    {
        app = null;
    }

    public void unsetAppState()
    {
        appState = null;
    }

    public void unsetAppVersion()
    {
        appVersion = null;
    }

    public void unsetAuxData()
    {
        auxData = null;
    }

    public void unsetBrowser()
    {
        browser = null;
    }

    public void unsetBrowserExtensionTrackingId()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, 4);
    }

    public void unsetClientId()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, 3);
    }

    public void unsetContext()
    {
        context = null;
    }

    public void unsetDevice()
    {
        device = null;
    }

    public void unsetDeviceName()
    {
        deviceName = null;
    }

    public void unsetDiagnostics()
    {
        diagnostics = null;
    }

    public void unsetEventData()
    {
        eventData = null;
    }

    public void unsetEventType()
    {
        eventType = null;
    }

    public void unsetFromThirdParty()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, 5);
    }

    public void unsetInsertionId()
    {
        insertionId = null;
    }

    public void unsetObjectId()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, 2);
    }

    public void unsetObjectIdStr()
    {
        objectIdStr = null;
    }

    public void unsetOs()
    {
        os = null;
    }

    public void unsetPData()
    {
        pData = null;
    }

    public void unsetPreviousContext()
    {
        previousContext = null;
    }

    public void unsetRequest()
    {
        request = null;
    }

    public void unsetSite()
    {
        site = null;
    }

    public void unsetTime()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, 0);
    }

    public void unsetUnauthId()
    {
        unauthId = null;
    }

    public void unsetUserId()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, 1);
    }

    public void unsetUserIdStr()
    {
        userIdStr = null;
    }

    public void unsetUuid()
    {
        uuid = null;
    }

    public void validate()
    {
        if (eventData != null)
        {
            eventData.validate();
        }
        if (previousContext != null)
        {
            previousContext.validate();
        }
        if (context != null)
        {
            context.validate();
        }
        if (diagnostics != null)
        {
            diagnostics.validate();
        }
    }

    public void write(TProtocol tprotocol)
    {
        ((SchemeFactory)schemes.get(tprotocol.getScheme())).getScheme().write(tprotocol, this);
    }

    static 
    {
        Object obj = new HashMap();
        schemes = ((Map) (obj));
        ((Map) (obj)).put(org/apache/thrift/scheme/StandardScheme, new EventStandardSchemeFactory(null));
        schemes.put(org/apache/thrift/scheme/TupleScheme, new EventTupleSchemeFactory(null));
        optionals = (new _Fields[] {
            _Fields.EVENT_DATA, _Fields.PREVIOUS_CONTEXT, _Fields.CONTEXT, _Fields.APP, _Fields.REQUEST, _Fields.APP_VERSION, _Fields.DEVICE, _Fields.BROWSER, _Fields.OS, _Fields.DEVICE_NAME, 
            _Fields.UNAUTH_ID, _Fields.USER_ID_STR, _Fields.OBJECT_ID_STR, _Fields.INSERTION_ID, _Fields.APP_STATE, _Fields.SITE, _Fields.DIAGNOSTICS, _Fields.UUID, _Fields.P_DATA, _Fields.CLIENT_ID, 
            _Fields.BROWSER_EXTENSION_TRACKING_ID, _Fields.FROM_THIRD_PARTY
        });
        obj = new EnumMap(com/pinterest/schemas/event/Event$_Fields);
        ((Map) (obj)).put(_Fields.TIME, new FieldMetaData("time", (byte)3, new FieldValueMetaData((byte)10, "Timestamp")));
        ((Map) (obj)).put(_Fields.EVENT_TYPE, new FieldMetaData("eventType", (byte)3, new EnumMetaData((byte)16, com/pinterest/schemas/event/EventType)));
        ((Map) (obj)).put(_Fields.USER_ID, new FieldMetaData("userId", (byte)3, new FieldValueMetaData((byte)10, "Id")));
        ((Map) (obj)).put(_Fields.OBJECT_ID, new FieldMetaData("objectId", (byte)3, new FieldValueMetaData((byte)10, "Id")));
        ((Map) (obj)).put(_Fields.AUX_DATA, new FieldMetaData("auxData", (byte)3, new MapMetaData((byte)13, new FieldValueMetaData((byte)11), new FieldValueMetaData((byte)11))));
        ((Map) (obj)).put(_Fields.EVENT_DATA, new FieldMetaData("eventData", (byte)2, new StructMetaData((byte)12, com/pinterest/schemas/event/EventData)));
        ((Map) (obj)).put(_Fields.PREVIOUS_CONTEXT, new FieldMetaData("previousContext", (byte)2, new StructMetaData((byte)12, com/pinterest/schemas/event/Context)));
        ((Map) (obj)).put(_Fields.CONTEXT, new FieldMetaData("context", (byte)2, new StructMetaData((byte)12, com/pinterest/schemas/event/Context)));
        ((Map) (obj)).put(_Fields.APP, new FieldMetaData("app", (byte)2, new EnumMetaData((byte)16, com/pinterest/schemas/event/AppType)));
        ((Map) (obj)).put(_Fields.REQUEST, new FieldMetaData("request", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.APP_VERSION, new FieldMetaData("appVersion", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.DEVICE, new FieldMetaData("device", (byte)2, new EnumMetaData((byte)16, com/pinterest/schemas/event/DeviceType)));
        ((Map) (obj)).put(_Fields.BROWSER, new FieldMetaData("browser", (byte)2, new EnumMetaData((byte)16, com/pinterest/schemas/event/BrowserType)));
        ((Map) (obj)).put(_Fields.OS, new FieldMetaData("os", (byte)2, new EnumMetaData((byte)16, com/pinterest/schemas/event/OSType)));
        ((Map) (obj)).put(_Fields.DEVICE_NAME, new FieldMetaData("deviceName", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.UNAUTH_ID, new FieldMetaData("unauthId", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.USER_ID_STR, new FieldMetaData("userIdStr", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.OBJECT_ID_STR, new FieldMetaData("objectIdStr", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.INSERTION_ID, new FieldMetaData("insertionId", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.APP_STATE, new FieldMetaData("appState", (byte)2, new EnumMetaData((byte)16, com/pinterest/schemas/event/EventAppState)));
        ((Map) (obj)).put(_Fields.SITE, new FieldMetaData("site", (byte)2, new EnumMetaData((byte)16, com/pinterest/schemas/event/SiteType)));
        ((Map) (obj)).put(_Fields.DIAGNOSTICS, new FieldMetaData("diagnostics", (byte)2, new StructMetaData((byte)12, com/pinterest/schemas/event/Diagnostics)));
        ((Map) (obj)).put(_Fields.UUID, new FieldMetaData("uuid", (byte)2, new FieldValueMetaData((byte)11)));
        ((Map) (obj)).put(_Fields.P_DATA, new FieldMetaData("pData", (byte)2, new MapMetaData((byte)13, new FieldValueMetaData((byte)11), new FieldValueMetaData((byte)11))));
        ((Map) (obj)).put(_Fields.CLIENT_ID, new FieldMetaData("clientId", (byte)2, new FieldValueMetaData((byte)10, "Id")));
        ((Map) (obj)).put(_Fields.BROWSER_EXTENSION_TRACKING_ID, new FieldMetaData("browserExtensionTrackingId", (byte)2, new FieldValueMetaData((byte)10, "Id")));
        ((Map) (obj)).put(_Fields.FROM_THIRD_PARTY, new FieldMetaData("fromThirdParty", (byte)2, new FieldValueMetaData((byte)2)));
        metaDataMap = Collections.unmodifiableMap(((Map) (obj)));
        FieldMetaData.addStructMetaDataMap(com/pinterest/schemas/event/Event, metaDataMap);
    }





























    /* member class not found */
    class _Fields {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class EventStandardSchemeFactory {}


    /* member class not found */
    class EventTupleSchemeFactory {}

}
