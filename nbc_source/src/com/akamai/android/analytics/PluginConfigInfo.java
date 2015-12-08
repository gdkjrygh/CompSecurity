// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// Referenced classes of package com.akamai.android.analytics:
//            InternalCodes

class PluginConfigInfo extends Thread
{
    class BucketMetrics
    {

        int bucketCount;
        int bucketLength;
        final PluginConfigInfo this$0;

        public String debug()
        {
            return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("BucketCount:").append(bucketCount).append(":\n").toString()))).append("BucketLength:").append(bucketLength).append(":\n").toString();
        }

        BucketMetrics()
        {
            this$0 = PluginConfigInfo.this;
            super();
        }
    }

    class DataKeyAttrib
    {

        boolean doLog;
        String fallback;
        String regExpJVPattern;
        String regExpJVReplace;
        boolean sendOnce;
        int size;
        final PluginConfigInfo this$0;
        String value;

        public String debug()
        {
            return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("Value:").append(value).append(":\n").toString()))).append("size:").append(size).append(":\n").toString()))).append("doLog:").append(doLog).append(":\n").toString()))).append("sendOnce:").append(sendOnce).append(":\n").toString()))).append("fallback:").append(fallback).append(":\n").toString();
        }

        DataKeyAttrib()
        {
            this$0 = PluginConfigInfo.this;
            super();
        }
    }

    class MatchRules
    {

        String key;
        String name;
        final PluginConfigInfo this$0;
        String type;
        String value;

        public String debug()
        {
            return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("Key :").append(key).append(":\n").toString()))).append("Name:").append(name).append(":\n").toString()))).append("Type:").append(type).append(":\n").toString()))).append("Value:").append(value).append(":\n").toString();
        }

        MatchRules()
        {
            this$0 = PluginConfigInfo.this;
            super();
        }
    }

    static interface ParserEventListener
    {

        public abstract void event(InternalCodes.PARSER_EVENT parser_event, String s);
    }

    class PlugLogTo
    {

        String encodedParamSeparator;
        int feedback_limit;
        int feedback_socialShareLimit;
        String formatVersion;
        int heartBeatInterval;
        String host;
        int initBrowserCloseTime;
        int isSessionWithRebufferLimit;
        int logInterval;
        boolean logType;
        String logVersion;
        int maxLogLength;
        String path;
        int secondLogTime;
        int startUpTimeOutlierLimit;
        final PluginConfigInfo this$0;
        String urlParamSeparator;
        int visitTimeOut;

        public String debug()
        {
            return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("logInterval:").append(logInterval).append(":\n").toString()))).append("logType:").append(logType).append(":\n").toString()))).append("maxLogLength:").append(maxLogLength).append(":\n").toString()))).append("secondLogTime:").append(secondLogTime).append(":\n").toString()))).append("startUptimeoutlierlimit:").append(startUpTimeOutlierLimit).append(":\n").toString()))).append("initBrowserCloseTime:").append(initBrowserCloseTime).append(":\n").toString()))).append("urlParamSeparator:").append(urlParamSeparator).append(":\n").toString()))).append("host:").append(host).append(":\n").toString()))).append("path:").append(path).append(":\n").toString()))).append("logVersion:").append(logVersion).append(":\n").toString()))).append("formatVersion:").append(formatVersion).append(":\n").toString();
        }

        PlugLogTo()
        {
            this$0 = PluginConfigInfo.this;
            super();
            logInterval = InternalCodes.DEFAULT_LOG_INTERVAL;
            secondLogTime = InternalCodes.DEFAULT_SECONDARYLOGTIME;
            heartBeatInterval = InternalCodes.DEFAULT_HEARTBEAT_INTERVAL;
            logType = true;
            maxLogLength = 4096;
            startUpTimeOutlierLimit = 0x927c0;
            initBrowserCloseTime = 0xdbba0;
            urlParamSeparator = InternalCodes.DEFAULT_URLPARAM_SEPERATOR;
            visitTimeOut = 0x36ee80;
            feedback_limit = InternalCodes.FEEDBACK_LIMIT;
            feedback_socialShareLimit = InternalCodes.SOCIAL_SHARE_LIMIT;
            isSessionWithRebufferLimit = InternalCodes.DEFAULT_ISSESSIONWITHREBUFFER_LIMIT;
            encodedParamSeparator = InternalCodes.DEFAULT_ENCODEDPARAMSEPARATOR;
        }
    }

    class PluginStatistics
    {

        String eventCode;
        ArrayList keysList;
        HashMap namesMatchRule;
        HashMap namesWithAttrib;
        final PluginConfigInfo this$0;

        public String debug()
        {
            Object obj;
            Object obj1;
            obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("EventCode:").append(eventCode).append(":\n").toString()))).append("keyNamePairs ::\n").toString()))).append("Keys List in Order::\n").toString();
            obj = obj1;
            if (keysList == null) goto _L2; else goto _L1
_L1:
            Iterator iterator;
            iterator = keysList.iterator();
            obj = obj1;
_L10:
            if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
            obj1 = obj;
            if (namesMatchRule == null) goto _L5; else goto _L4
_L4:
            iterator = namesMatchRule.keySet().iterator();
_L12:
            if (iterator.hasNext()) goto _L7; else goto _L6
_L6:
            obj1 = obj;
_L5:
            obj = obj1;
            if (namesWithAttrib == null) goto _L9; else goto _L8
_L8:
            obj = namesWithAttrib.keySet().iterator();
_L14:
            if (((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_316;
            }
            obj = obj1;
_L9:
            return ((String) (obj)).toString();
_L3:
            obj1 = (String)iterator.next();
            obj = (new StringBuilder(String.valueOf(obj))).append("Key:").append(((String) (obj1))).append(":\n").toString();
              goto _L10
_L7:
            Object obj2;
            obj2 = (String)iterator.next();
            obj1 = (new StringBuilder(String.valueOf(obj))).append("Key With Match Rules:").append(((String) (obj2))).append(":\n").toString();
            obj2 = ((ArrayList)namesMatchRule.get(obj2)).iterator();
_L13:
            obj = obj1;
            if (!((Iterator) (obj2)).hasNext()) goto _L12; else goto _L11
_L11:
            obj = (MatchRules)((Iterator) (obj2)).next();
            obj1 = (new StringBuilder(String.valueOf(obj1))).append(((MatchRules) (obj)).debug()).toString();
              goto _L13
              goto _L12
            String s = (String)((Iterator) (obj)).next();
            obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj1))).append("Key With Attrib:").append(s).append(":\n").toString()))).append(((DataKeyAttrib)namesWithAttrib.get(s)).debug()).toString();
              goto _L14
        }

        PluginStatistics()
        {
            this$0 = PluginConfigInfo.this;
            super();
        }
    }

    class ViewerDiagnostics
    {

        int no_of_iterations;
        int output_bytes;
        String salt_value;
        String salt_version;
        final PluginConfigInfo this$0;

        ViewerDiagnostics()
        {
            this$0 = PluginConfigInfo.this;
            super();
            salt_version = "0.0";
            salt_value = "";
            no_of_iterations = 50;
            output_bytes = 16;
        }
    }


    String beaconId;
    String beaconVersion;
    String configURL;
    ParserEventListener eventListener;
    String failReason;
    boolean isActive;
    boolean isDebug;
    boolean isException;
    public boolean isLoading;
    boolean isLogWindow;
    boolean isViewerDiagEnabled;
    HashMap keyNamePairs;
    public InternalCodes.PARSER_EVENT lastEventCode;
    public String lastMessageDispatched;
    PlugLogTo logTo;
    HashMap statInfo;
    boolean statUseKey;
    ViewerDiagnostics viewerDiag;
    boolean xmlLoadSuccess;

    public PluginConfigInfo()
    {
        isDebug = false;
        isException = false;
        isLogWindow = false;
        beaconId = null;
        beaconVersion = null;
        isActive = true;
        isViewerDiagEnabled = false;
        statUseKey = true;
        statInfo = null;
        xmlLoadSuccess = false;
    }

    public PluginConfigInfo(String s)
    {
        this(s, null);
    }

    public PluginConfigInfo(String s, ParserEventListener parsereventlistener)
    {
        isDebug = false;
        isException = false;
        isLogWindow = false;
        beaconId = null;
        beaconVersion = null;
        isActive = true;
        isViewerDiagEnabled = false;
        statUseKey = true;
        statInfo = null;
        xmlLoadSuccess = false;
        configURL = s;
        eventListener = parsereventlistener;
        isLoading = true;
        try
        {
            setName("AkamaiConfigDownloader");
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private PlugLogTo getLogToInfo(Node node)
    {
        if (node == null) goto _L2; else goto _L1
_L1:
        NamedNodeMap namednodemap;
        PlugLogTo pluglogto;
        int i;
        pluglogto = new PlugLogTo();
        if (node.hasAttributes())
        {
            namednodemap = node.getAttributes();
        } else
        {
            namednodemap = null;
        }
        if (namednodemap == null || namednodemap.getLength() <= 0) goto _L4; else goto _L3
_L3:
        i = 0;
_L19:
        if (i < namednodemap.getLength()) goto _L5; else goto _L4
_L4:
        node = node.getChildNodes();
        if (node == null || node.getLength() <= 0) goto _L7; else goto _L6
_L6:
        i = 0;
_L12:
        if (i < node.getLength()) goto _L8; else goto _L7
_L7:
        if (pluglogto.heartBeatInterval > pluglogto.logInterval)
        {
            pluglogto.heartBeatInterval = pluglogto.logInterval;
        }
        return pluglogto;
_L5:
        Node node2 = namednodemap.item(i);
        if (node2 != null) goto _L10; else goto _L9
_L9:
        i++;
        continue; /* Loop/switch isn't completed */
_L10:
        if (node2.getNodeName().equalsIgnoreCase("logInterval"))
        {
            pluglogto.logInterval = Integer.parseInt(node2.getNodeValue());
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("logType"))
        {
            Node node1;
            boolean flag;
            if (node2.getNodeValue().equalsIgnoreCase("relative"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                pluglogto.logType = flag;
            }
            catch (Exception exception1) { }
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("maxLogLineLength"))
        {
            pluglogto.maxLogLength = Integer.parseInt(node2.getNodeValue());
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("secondaryLogTime"))
        {
            pluglogto.secondLogTime = Integer.parseInt(node2.getNodeValue());
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("initBrowserCloseTime"))
        {
            pluglogto.initBrowserCloseTime = Integer.parseInt(node2.getNodeValue());
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("startupTimeOutlierLimit"))
        {
            pluglogto.startUpTimeOutlierLimit = Integer.parseInt(node2.getNodeValue()) * 1000;
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("urlParamSeparator"))
        {
            pluglogto.urlParamSeparator = node2.getNodeValue();
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("heartBeatInterval"))
        {
            pluglogto.heartBeatInterval = Integer.parseInt(node2.getNodeValue());
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("visitTimeOut"))
        {
            pluglogto.visitTimeOut = Integer.parseInt(node2.getNodeValue()) * 60 * 1000;
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("encodedParamSeparator"))
        {
            pluglogto.encodedParamSeparator = node2.getNodeValue();
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("isSessionWithRebufferLimit"))
        {
            pluglogto.isSessionWithRebufferLimit = Integer.parseInt(node2.getNodeValue());
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("feedbackLimit"))
        {
            pluglogto.feedback_limit = Integer.parseInt(node2.getNodeValue());
            continue; /* Loop/switch isn't completed */
        }
        if (node2.getNodeName().equalsIgnoreCase("socialShareLimit"))
        {
            pluglogto.feedback_socialShareLimit = Integer.parseInt(node2.getNodeValue());
        }
        if (true) goto _L9; else goto _L8
_L8:
        node1 = node.item(i);
        if (node1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L14:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        if (node1.getNodeType() != 1) goto _L14; else goto _L13
_L13:
        if (!node1.getNodeName().equalsIgnoreCase("host"))
        {
            break MISSING_BLOCK_LABEL_667;
        }
        pluglogto.host = nodeVal(node1);
        if (!pluglogto.host.startsWith("http://"))
        {
            pluglogto.host = (new StringBuilder(String.valueOf("http://"))).append(pluglogto.host).toString();
        }
          goto _L14
        try
        {
label0:
            {
                if (!node1.getNodeName().equalsIgnoreCase("path"))
                {
                    break label0;
                }
                pluglogto.path = nodeVal(node1);
            }
        }
        catch (Exception exception) { }
          goto _L14
        if (!node1.getNodeName().equalsIgnoreCase("logVersion")) goto _L16; else goto _L15
_L15:
        pluglogto.logVersion = nodeVal(node1);
          goto _L14
_L16:
        if (!node1.getNodeName().equalsIgnoreCase("formatVersion")) goto _L14; else goto _L17
_L17:
        pluglogto.formatVersion = nodeVal(node1);
          goto _L14
_L2:
        return null;
        if (true) goto _L19; else goto _L18
_L18:
    }

    private ArrayList getMatchRules(NodeList nodelist)
    {
        Object obj;
        int i;
        obj = null;
        i = 0;
_L9:
        Object obj1;
        ArrayList arraylist;
        Object obj2;
        Node node;
        int j;
        int k;
        if (i >= nodelist.getLength())
        {
            if (obj != null && ((ArrayList) (obj)).size() > 0)
            {
                return ((ArrayList) (obj));
            } else
            {
                return null;
            }
        }
        obj2 = nodelist.item(i);
        obj1 = obj;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        if (((Node) (obj2)).getNodeType() != 1) goto _L2; else goto _L3
_L3:
        obj1 = obj;
        if (!((Node) (obj2)).getNodeName().equalsIgnoreCase("matchRules")) goto _L2; else goto _L4
_L4:
        arraylist = new ArrayList();
        if (((Node) (obj2)).hasChildNodes())
        {
            obj = ((Node) (obj2)).getChildNodes();
        } else
        {
            obj = null;
        }
        obj1 = arraylist;
        if (obj == null) goto _L2; else goto _L5
_L5:
        obj1 = arraylist;
        if (((NodeList) (obj)).getLength() <= 0) goto _L2; else goto _L6
_L6:
        j = 0;
_L13:
        if (j < ((NodeList) (obj)).getLength()) goto _L8; else goto _L7
_L7:
        obj1 = arraylist;
_L2:
        i++;
        obj = obj1;
          goto _L9
_L8:
        obj1 = ((NodeList) (obj)).item(j);
        if (obj1 == null || ((Node) (obj1)).getNodeType() != 1 || !((Node) (obj1)).getNodeName().equalsIgnoreCase("match")) goto _L11; else goto _L10
_L10:
        if (((Node) (obj1)).hasAttributes())
        {
            obj1 = ((Node) (obj1)).getAttributes();
        } else
        {
            obj1 = null;
        }
        obj2 = new MatchRules();
        if (obj1 == null || ((NamedNodeMap) (obj1)).getLength() <= 0) goto _L11; else goto _L12
_L12:
        k = 0;
_L14:
        if (k < ((NamedNodeMap) (obj1)).getLength())
        {
            break MISSING_BLOCK_LABEL_269;
        }
        arraylist.add(obj2);
_L11:
        j++;
          goto _L13
        node = ((NamedNodeMap) (obj1)).item(k);
        if (node.getNodeName().equalsIgnoreCase("key"))
        {
            obj2.key = node.getNodeValue();
        } else
        if (node.getNodeName().equalsIgnoreCase("name"))
        {
            obj2.name = node.getNodeValue();
        } else
        if (node.getNodeName().equalsIgnoreCase("type"))
        {
            obj2.type = node.getNodeValue();
        } else
        if (node.getNodeName().equalsIgnoreCase("value"))
        {
            obj2.value = node.getNodeValue();
        }
        k++;
          goto _L14
    }

    private String nodeVal(Node node)
    {
        Object obj = null;
        String s = obj;
        if (node != null)
        {
            s = obj;
            try
            {
                if (node.getFirstChild() != null)
                {
                    s = node.getFirstChild().getNodeValue();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Node node)
            {
                return null;
            }
        }
        return s;
    }

    private PluginStatistics processPlugStat(Node node)
    {
        Object obj;
        Object obj1;
        PluginStatistics pluginstatistics;
        NodeList nodelist;
        int i;
        pluginstatistics = new PluginStatistics();
        if (keyNamePairs == null)
        {
            keyNamePairs = new HashMap();
        }
        pluginstatistics.keysList = new ArrayList();
        pluginstatistics.namesMatchRule = new HashMap();
        pluginstatistics.namesWithAttrib = new HashMap();
        pluginstatistics.eventCode = null;
        if (node.hasAttributes())
        {
            obj = node.getAttributes();
        } else
        {
            obj = null;
        }
        if (obj == null || ((NamedNodeMap) (obj)).getLength() <= 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L32:
        if (i < ((NamedNodeMap) (obj)).getLength()) goto _L3; else goto _L2
_L2:
        obj = null;
        obj1 = node.getChildNodes();
        if (obj1 == null || ((NodeList) (obj1)).getLength() <= 0) goto _L5; else goto _L4
_L4:
        i = 0;
_L14:
        if (i < ((NodeList) (obj1)).getLength()) goto _L7; else goto _L6
_L6:
        node = ((Node) (obj));
_L12:
        if (node == null) goto _L5; else goto _L8
_L8:
        nodelist = node.getChildNodes();
        if (nodelist == null || nodelist.getLength() <= 0) goto _L10; else goto _L9
_L9:
        i = 0;
_L16:
        if (i < nodelist.getLength()) goto _L11; else goto _L10
_L10:
        return pluginstatistics;
_L3:
        obj1 = ((NamedNodeMap) (obj)).item(i);
        String s;
        String s1;
        String s2;
        String s3;
        NumberFormatException numberformatexception;
        String s4;
        String s5;
        NamedNodeMap namednodemap;
        Object obj2;
        String s6;
        Object obj3;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        Node node1;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Node node2;
        int j;
        boolean flag;
        if (obj1 != null)
        {
            try
            {
                if (((Node) (obj1)).getNodeName().equalsIgnoreCase("eventCode"))
                {
                    pluginstatistics.eventCode = ((Node) (obj1)).getNodeValue();
                }
            }
            catch (Exception exception) { }
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        node = ((NodeList) (obj1)).item(i);
        if (node == null || node.getNodeType() != 1 || !node.getNodeName().equalsIgnoreCase("dataMetrics")) goto _L13; else goto _L12
_L13:
        i++;
          goto _L14
_L11:
        node2 = nodelist.item(i);
          goto _L15
_L18:
        i++;
          goto _L16
_L15:
        if (node2 == null || node2.getNodeType() != 1 || !node2.getNodeName().equalsIgnoreCase("data")) goto _L18; else goto _L17
_L17:
        obj4 = null;
        obj3 = null;
        obj5 = null;
        s7 = null;
        obj6 = null;
        node1 = null;
        obj7 = null;
        s11 = null;
        obj8 = null;
        obj2 = null;
        obj9 = null;
        s10 = null;
        obj10 = null;
        s6 = null;
        obj11 = null;
        s8 = null;
        obj12 = null;
        s9 = null;
        if (node2.hasAttributes())
        {
            namednodemap = node2.getAttributes();
        } else
        {
            namednodemap = null;
        }
        node = obj8;
        obj = obj10;
        obj1 = obj4;
        s = obj5;
        s1 = obj11;
        s5 = obj12;
        s2 = obj9;
        s3 = obj7;
        s4 = obj6;
        if (namednodemap == null) goto _L20; else goto _L19
_L19:
        node = obj8;
        obj = obj10;
        obj1 = obj4;
        s = obj5;
        s1 = obj11;
        s5 = obj12;
        s2 = obj9;
        s3 = obj7;
        s4 = obj6;
        if (namednodemap.getLength() <= 1) goto _L20; else goto _L21
_L21:
        j = 0;
        s4 = node1;
        s3 = s11;
        s2 = s10;
        s5 = s9;
        s1 = s8;
        s = s7;
        obj1 = obj3;
        obj = s6;
        node = ((Node) (obj2));
_L28:
        if (j < namednodemap.getLength()) goto _L22; else goto _L20
_L20:
        if (obj1 == null || s == null) goto _L18; else goto _L23
_L23:
        keyNamePairs.put(((String) (obj1)).toLowerCase(), s);
        pluginstatistics.keysList.add(obj1);
        if (s4 == null && s3 == null && node == null && s2 == null && obj == null && (s1 == null || s5 == null)) goto _L25; else goto _L24
_L24:
        obj1 = new DataKeyAttrib();
        obj1.value = s4;
        if (s3 == null) goto _L27; else goto _L26
_L26:
        j = Integer.parseInt(s3);
_L29:
        obj1.size = j;
_L30:
        if (node != null)
        {
            if (node.equals("1"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        obj1.doLog = flag;
        if (s2 != null)
        {
            if (s2.equals("1"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        obj1.sendOnce = flag;
        obj1.fallback = ((String) (obj));
        obj1.regExpJVPattern = s1;
        obj1.regExpJVReplace = s5;
        pluginstatistics.namesWithAttrib.put(s.toLowerCase(), obj1);
_L25:
        if (node2.hasChildNodes())
        {
            node = node2.getChildNodes();
        } else
        {
            node = null;
        }
        if (node != null && node.getLength() > 0)
        {
            node = getMatchRules(node);
            if (node != null)
            {
                pluginstatistics.namesMatchRule.put(s.toLowerCase(), node);
            }
        }
          goto _L18
_L22:
        node1 = namednodemap.item(j);
        if (node1 == null)
        {
            s11 = s4;
            s10 = s3;
            s9 = s2;
            s8 = s1;
            s7 = s;
            obj3 = obj1;
            s6 = ((String) (obj));
            obj2 = node;
        } else
        if (node1.getNodeName().equalsIgnoreCase("key"))
        {
            obj3 = node1.getNodeValue();
            obj2 = node;
            s6 = ((String) (obj));
            s7 = s;
            s8 = s1;
            s9 = s2;
            s10 = s3;
            s11 = s4;
        } else
        if (node1.getNodeName().equalsIgnoreCase("name"))
        {
            s7 = node1.getNodeValue();
            obj2 = node;
            s6 = ((String) (obj));
            obj3 = obj1;
            s8 = s1;
            s9 = s2;
            s10 = s3;
            s11 = s4;
        } else
        if (node1.getNodeName().equalsIgnoreCase("value"))
        {
            s11 = node1.getNodeValue();
            obj2 = node;
            s6 = ((String) (obj));
            obj3 = obj1;
            s7 = s;
            s8 = s1;
            s9 = s2;
            s10 = s3;
        } else
        if (node1.getNodeName().equalsIgnoreCase("size"))
        {
            s10 = node1.getNodeValue();
            obj2 = node;
            s6 = ((String) (obj));
            obj3 = obj1;
            s7 = s;
            s8 = s1;
            s9 = s2;
            s11 = s4;
        } else
        if (node1.getNodeName().equalsIgnoreCase("doLog"))
        {
            obj2 = node1.getNodeValue();
            s6 = ((String) (obj));
            obj3 = obj1;
            s7 = s;
            s8 = s1;
            s9 = s2;
            s10 = s3;
            s11 = s4;
        } else
        if (node1.getNodeName().equalsIgnoreCase("sendOnce"))
        {
            s9 = node1.getNodeValue();
            obj2 = node;
            s6 = ((String) (obj));
            obj3 = obj1;
            s7 = s;
            s8 = s1;
            s10 = s3;
            s11 = s4;
        } else
        if (node1.getNodeName().equalsIgnoreCase("fallback"))
        {
            s6 = node1.getNodeValue();
            obj2 = node;
            obj3 = obj1;
            s7 = s;
            s8 = s1;
            s9 = s2;
            s10 = s3;
            s11 = s4;
        } else
        if (node1.getNodeName().equalsIgnoreCase("regExpJVPattern"))
        {
            s8 = node1.getNodeValue();
            obj2 = node;
            s6 = ((String) (obj));
            obj3 = obj1;
            s7 = s;
            s9 = s2;
            s10 = s3;
            s11 = s4;
        } else
        {
            obj2 = node;
            s6 = ((String) (obj));
            obj3 = obj1;
            s7 = s;
            s8 = s1;
            s9 = s2;
            s10 = s3;
            s11 = s4;
            if (node1.getNodeName().equalsIgnoreCase("regExpJVReplace"))
            {
                s5 = node1.getNodeValue();
                obj2 = node;
                s6 = ((String) (obj));
                obj3 = obj1;
                s7 = s;
                s8 = s1;
                s9 = s2;
                s10 = s3;
                s11 = s4;
            }
        }
        j++;
        node = ((Node) (obj2));
        obj = s6;
        obj1 = obj3;
        s = s7;
        s1 = s8;
        s2 = s9;
        s3 = s10;
        s4 = s11;
          goto _L28
_L27:
        j = -1;
          goto _L29
        numberformatexception;
        obj1.size = -1;
          goto _L30
_L5:
        return null;
        if (true) goto _L32; else goto _L31
_L31:
    }

    private boolean processSecurityTag(Node node)
    {
        node = node.getChildNodes();
        if (node == null || node.getLength() <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < node.getLength()) goto _L3; else goto _L2
_L2:
        return true;
_L3:
        Node node1;
        node1 = node.item(i);
        if (node1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (node1.getNodeType() != 1 || !node1.getNodeName().equalsIgnoreCase("viewerdiagnostics")) goto _L7; else goto _L6
_L6:
        viewerDiag = processViewerDiagnostics(node1);
        isViewerDiagEnabled = true;
          goto _L7
        Exception exception;
        exception;
          goto _L7
    }

    private boolean processStatisticsInfo(Node node)
    {
        NamedNodeMap namednodemap;
        int i;
        if (node == null)
        {
            failReason = "NOSTATISTICS";
            return false;
        }
        if (node.hasAttributes())
        {
            namednodemap = node.getAttributes();
        } else
        {
            namednodemap = null;
        }
        if (namednodemap == null || namednodemap.getLength() <= 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L6:
        if (i < namednodemap.getLength()) goto _L3; else goto _L2
_L2:
        node = node.getChildNodes();
        if (node == null || node.getLength() <= 0) goto _L5; else goto _L4
_L4:
        statInfo = new HashMap();
        i = 0;
_L7:
        if (i < node.getLength())
        {
            break MISSING_BLOCK_LABEL_171;
        }
_L5:
        return true;
_L3:
        Object obj = namednodemap.item(i);
        if (((Node) (obj)).getNodeName().equalsIgnoreCase("useKey"))
        {
            boolean flag;
            if (((Node) (obj)).getNodeValue().equalsIgnoreCase("1"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            String s;
            try
            {
                statUseKey = flag;
            }
            catch (Exception exception) { }
        }
        i++;
          goto _L6
        obj = node.item(i);
        if (obj != null && ((Node) (obj)).getNodeType() == 1)
        {
            s = ((Node) (obj)).getNodeName();
            if (s != null)
            {
                obj = processPlugStat(((Node) (obj)));
                if (obj != null)
                {
                    statInfo.put(s.toLowerCase(), obj);
                }
            }
        }
        i++;
          goto _L7
    }

    private ViewerDiagnostics processViewerDiagnostics(Node node)
    {
        if (node == null) goto _L2; else goto _L1
_L1:
        ViewerDiagnostics viewerdiagnostics;
        NodeList nodelist;
        viewerdiagnostics = new ViewerDiagnostics();
        nodelist = node.getChildNodes();
        if (nodelist == null || nodelist.getLength() <= 0) goto _L4; else goto _L3
_L3:
        int i = 0;
_L7:
        if (i < nodelist.getLength()) goto _L5; else goto _L4
_L4:
        return viewerdiagnostics;
_L5:
        node = nodelist.item(i);
        if (node != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L9:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        if (node.getNodeType() != 1 || !node.getNodeName().equalsIgnoreCase("salt")) goto _L9; else goto _L8
_L8:
        if (!node.hasAttributes()) goto _L11; else goto _L10
_L10:
        node = node.getAttributes();
_L18:
        if (node == null) goto _L9; else goto _L12
_L12:
        if (node.getLength() <= 0) goto _L9; else goto _L13
_L13:
        int j = 0;
_L17:
        if (j >= node.getLength()) goto _L9; else goto _L14
_L14:
        Node node1 = node.item(j);
        if (node1 != null) goto _L16; else goto _L15
_L15:
        j++;
          goto _L17
_L11:
        node = null;
          goto _L18
_L16:
label0:
        {
            if (!node1.getNodeName().equalsIgnoreCase("version"))
            {
                break label0;
            }
            viewerdiagnostics.salt_version = node1.getNodeValue();
        }
          goto _L15
        try
        {
label1:
            {
                if (!node1.getNodeName().equalsIgnoreCase("value"))
                {
                    break label1;
                }
                viewerdiagnostics.salt_value = node1.getNodeValue();
            }
        }
        catch (Exception exception) { }
          goto _L15
        if (!node1.getNodeName().equalsIgnoreCase("iterations")) goto _L20; else goto _L19
_L19:
        viewerdiagnostics.no_of_iterations = Integer.parseInt(node1.getNodeValue());
          goto _L15
_L20:
        if (!node1.getNodeName().equalsIgnoreCase("bytes")) goto _L15; else goto _L21
_L21:
        viewerdiagnostics.output_bytes = Integer.parseInt(node1.getNodeValue());
          goto _L15
_L2:
        return null;
        node;
          goto _L9
    }

    boolean convertDoctoObj(Document document)
    {
        Object obj;
        obj = document.getChildNodes();
        document = null;
        if (obj == null || ((NodeList) (obj)).getLength() <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L16:
        if (i < ((NodeList) (obj)).getLength()) goto _L4; else goto _L3
_L3:
        if (document != null) goto _L5; else goto _L2
_L2:
        return false;
_L4:
        document = ((NodeList) (obj)).item(i);
        continue;
        while (document == null || document.getNodeType() != 1 || !document.getNodeName().equalsIgnoreCase("AkamaiPlayerAnalyticsConfig")) 
        {
            i++;
            continue; /* Loop/switch isn't completed */
        }
          goto _L3
_L5:
        if (document.hasAttributes())
        {
            obj = document.getAttributes();
        } else
        {
            obj = null;
        }
        if (obj == null || ((NamedNodeMap) (obj)).getLength() <= 0) goto _L7; else goto _L6
_L6:
        i = 0;
_L11:
        if (i < ((NamedNodeMap) (obj)).getLength()) goto _L8; else goto _L7
_L7:
label0:
        {
            document = document.getChildNodes();
            if (document != null && document.getLength() > 0)
            {
                i = 0;
                break label0;
            }
        }
          goto _L2
_L8:
        node = ((NamedNodeMap) (obj)).item(i);
        if (node != null) goto _L10; else goto _L9
_L9:
        i++;
          goto _L11
_L10:
        if (!node.getNodeName().equalsIgnoreCase("debug"))
        {
            break MISSING_BLOCK_LABEL_240;
        }
        boolean flag;
        Object obj1;
        if (node.getNodeValue().equalsIgnoreCase("0"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        try
        {
            isDebug = flag;
        }
        catch (Exception exception) { }
          goto _L9
        if (!node.getNodeName().equalsIgnoreCase("exception")) goto _L13; else goto _L12
_L12:
        if (node.getNodeValue().equalsIgnoreCase("0"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        isException = flag;
          goto _L9
_L13:
        if (!node.getNodeName().equalsIgnoreCase("logWindow")) goto _L9; else goto _L14
_L14:
        if (node.getNodeValue().equalsIgnoreCase("0"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        isLogWindow = flag;
          goto _L9
label1:
        while (!((Node) (obj1)).getNodeName().equalsIgnoreCase("statistics") || processStatisticsInfo(((Node) (obj1)))) 
        {
            do
            {
                i++;
                if (i >= document.getLength())
                {
                    return true;
                }
                obj1 = document.item(i);
                if (obj1 != null && ((Node) (obj1)).getNodeType() == 1)
                {
                    if (((Node) (obj1)).getNodeName().equalsIgnoreCase("beaconId"))
                    {
                        beaconId = nodeVal(((Node) (obj1)));
                    } else
                    if (((Node) (obj1)).getNodeName().equalsIgnoreCase("beaconVersion"))
                    {
                        beaconVersion = nodeVal(((Node) (obj1)));
                    } else
                    if (((Node) (obj1)).getNodeName().equalsIgnoreCase("isActive"))
                    {
                        obj1 = nodeVal(((Node) (obj1)));
                        if (obj1 != null)
                        {
                            if (((String) (obj1)).equalsIgnoreCase("1"))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            isActive = flag;
                        }
                    } else
                    if (((Node) (obj1)).getNodeName().equalsIgnoreCase("logTo"))
                    {
                        logTo = getLogToInfo(((Node) (obj1)));
                    } else
                    {
                        if (!((Node) (obj1)).getNodeName().equalsIgnoreCase("security"))
                        {
                            continue label1;
                        }
                        processSecurityTag(((Node) (obj1)));
                    }
                }
            } while (true);
        }
        return false;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void dispatchEvent(InternalCodes.PARSER_EVENT parser_event, String s)
    {
        if (parser_event != InternalCodes.PARSER_EVENT.DEBUG)
        {
            lastEventCode = parser_event;
            lastMessageDispatched = s;
        }
        try
        {
            if (eventListener != null)
            {
                eventListener.event(parser_event, s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InternalCodes.PARSER_EVENT parser_event)
        {
            return;
        }
    }

    boolean parseXml(String s)
    {
        Object obj = DocumentBuilderFactory.newInstance();
        try
        {
            obj = ((DocumentBuilderFactory) (obj)).newDocumentBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dispatchEvent(InternalCodes.PARSER_EVENT.PARSER_CONFIG_EXCEPTION, "Parser Config Exception, check Document Builder");
            return false;
        }
        try
        {
            obj = ((DocumentBuilder) (obj)).parse((new URL(s)).openConnection().getInputStream());
        }
        catch (MalformedURLException malformedurlexception)
        {
            failReason = "MALFORMEDURLEXCEPTION";
            dispatchEvent(InternalCodes.PARSER_EVENT.MALFORMED_URL_EXCEPTION, (new StringBuilder("Check the URL :")).append(s).toString());
            return false;
        }
        catch (SAXException saxexception)
        {
            dispatchEvent(InternalCodes.PARSER_EVENT.SAX_EXCEPTION, (new StringBuilder("SAX Exception: Check the URL:")).append(s).toString());
            return false;
        }
        catch (IOException ioexception)
        {
            dispatchEvent(InternalCodes.PARSER_EVENT.XML_NOT_LOADED, (new StringBuilder(":Io Exception:Please check the URL :")).append(s).toString());
            return false;
        }
        if (obj == null || !convertDoctoObj(((Document) (obj))))
        {
            if (failReason == null)
            {
                failReason = "General Parsing Error";
                dispatchEvent(InternalCodes.PARSER_EVENT.GENERAL_PARSING_ERROR, failReason);
            }
        } else
        if (!verifyXml())
        {
            if (failReason == null)
            {
                failReason = "Verification Failed";
                dispatchEvent(InternalCodes.PARSER_EVENT.GENERAL_PARSING_ERROR, failReason);
                return false;
            }
        } else
        {
            return true;
        }
        return false;
    }

    public void run()
    {
        try
        {
            if (parseXml(configURL))
            {
                isLoading = false;
                xmlLoadSuccess = true;
                dispatchEvent(InternalCodes.PARSER_EVENT.XML_LOADED, "Plugin Loaded");
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        isLoading = false;
        xmlLoadSuccess = false;
        return;
    }

    public void setOnParserEventListener(ParserEventListener parsereventlistener)
    {
        eventListener = parsereventlistener;
    }

    boolean verifyXml()
    {
        if (beaconId != null) goto _L2; else goto _L1
_L1:
        failReason = "No Beacon ID in the Config";
        dispatchEvent(InternalCodes.PARSER_EVENT.NO_BEACON_ID, failReason);
_L4:
        return true;
_L2:
        if (logTo == null || logTo.host == null)
        {
            failReason = "No Host specified in the config";
            dispatchEvent(InternalCodes.PARSER_EVENT.NO_HOST_DATA, failReason);
        } else
        if (statInfo == null)
        {
            failReason = "No Statistics Data in the config";
            dispatchEvent(InternalCodes.PARSER_EVENT.NO_STAT_DATA, failReason);
        } else
        if (!statInfo.containsKey("init") || !statInfo.containsKey("playstart") || !statInfo.containsKey("playing") || !statInfo.containsKey("complete") || !statInfo.containsKey("error") || !statInfo.containsKey("common"))
        {
            failReason = "Log Line Metrics is not defined properly";
            dispatchEvent(InternalCodes.PARSER_EVENT.LOG_LINE_METRICS_NOT_DEFINED, failReason);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
