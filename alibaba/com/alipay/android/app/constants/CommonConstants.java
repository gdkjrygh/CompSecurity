// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.constants;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicHeader;

public class CommonConstants
{
    public final class Request
    {

        public static final String DEFAULT_CONTENT_TYPE = "application/octet-stream;binary/octet-stream";
        public static final String MSP_PARAM = "Msp-Param";
        public static final String NEW_CLIENT_KEY = "new_client_key";
        final CommonConstants a;

        public Request()
        {
            a = CommonConstants.this;
            super();
        }
    }


    public static final String ACTION = "action";
    public static final String ACTION_APINAME = "apiName";
    public static final String ACTION_FALSE = "false";
    public static final String ACTION_METHOD = "method";
    public static final String ACTION_NAMESPACE = "namespace";
    public static final String ACTION_PAY_FAILED = "com.alipay.android.app.pay.ACTION_PAY_FAILED";
    public static final String ACTION_PAY_REQUEST = "com.alipay.android.app.pay.ACTION_PAY_REQUEST";
    public static final String ACTION_PAY_SUCCESS = "com.alipay.android.app.pay.ACTION_PAY_SUCCESS";
    public static final String ACTION_TRUE = "true";
    public static final String ACTION_TYPE = "type";
    public static final String ACTION_VERSION = "apiVersion";
    public static final String ALIPAY_PROTOCAL = "AE_SDK_MAIN";
    public static final String ALIPAY_PUB_UP = "AE_SDK_PK";
    public static final String API = "api";
    public static final String API_VERSION = "api_version";
    public static final String APP_VERSION = "app_version";
    public static final String BIZ_ID = "bizIdentity";
    public static final String CALL_BACK_URL = "call_back_url";
    public static final String CHARSET = "utf-8";
    public static final String CODE = "code";
    public static String CONTROL_ARGS = "cmd";
    public static String CONTROL_ERROR_NET = "ner";
    public static String CONTROL_ERROR_SYS = "ser";
    public static String CONTROL_GW_DNS = "gwDns";
    public static String CONTROL_LAODING_MSG = "load";
    public static String CONTROL_NET_RETRYCOUNT = "netTryCount";
    public static String CONTROL_PERFORMACE_UP = "upPer";
    public static String CONTROL_STRING_CANCEL = "cancel";
    public static String CONTROL_STRING_OK = "ok";
    public static String CONTROL_STRING_RETRY = "retry";
    public static String CONTROL_UIEGNIE_UPDATEINFO = "enUp";
    public static String CONTROL_UIRESOURCE_UPDATEINFO = "reUp";
    public static String CONTROL_UPLOAD_LOG = "upLog";
    public static String CONTROL_UPLOAD_LOG_2G = "up2g";
    public static final String COPY = "copy";
    public static final String DATA = "data";
    public static final String DIGEST = "digest";
    public static final String DNS_IP = "dns.json";
    public static final String DOWNLOAD_APK_OTP_CACHE = "download";
    public static final String DYNAMIC_FM_VERSION = "frameVersion";
    public static final String DYNAMIC_VERSION = "version";
    public static final String ENCRIPT_HEADER_LENGTH = "el";
    public static final String EXP = "exp";
    public static final String EXTERNAL_INFO = "external_info";
    public static final String FILE_APK_LIB = "lib";
    public static final String FILE_APK_OTP_CACHE = "installApkOtpCache";
    public static final String FILE_BASE = "alipay";
    public static final String FILE_LOG = "log";
    public static final String FILE_SERIALIZE = "serialize";
    public static final String FN = "fn";
    public static final String FORM = "form";
    public static final String GW_DNS = "gwDns";
    public static List HEADERS;
    public static final String HIDDEN = "hidden";
    public static final String HTTPS = "https";
    public static final int INFO_TIMEOUT = 15000;
    public static String INIT_SDK_PREFERENCE_NAME = "alipay_sdk_pref";
    public static final String INSTRUCTION_CONTENT_TYPE = "enctype";
    public static final String INSTRUCTION_FORMSUBMIT = "formSubmit";
    public static final String INSTRUCTION_HOST = "host";
    public static final String INSTRUCTION_HTTPS = "https";
    public static final String INSTRUCTION_NAME = "name";
    public static final String INSTRUCTION_PROGRESS_BAR = "progressBar";
    public static final String INSTRUCTION_REQ_PARAM = "request_param";
    public static final String INSTRUCTION_VALIDATE = "validate";
    public static final String INSTRUCTION_VERSION = "apiVersion";
    public static final String INTECEPTER_URL = "inUrl";
    public static String IS_CHECK_DEAD_CONN = "checkConnect";
    public static String IS_INTERCEPT_URL = "isInterceptUrl";
    public static final String METHOD = "method";
    public static final String PARAMS = "params";
    public static String PER_UPDATEINFO = "updateInfo";
    public static final String RESULT = "result";
    public static final String RESULT_KEY = "cardNumber";
    public static final String RESULT_STATUS = "resultStatus";
    public static final String SESSION = "sessionId";
    public static final int THREADCOUNT;
    public static final String TID = "tid";
    public static final String TITLE = "title";
    public static final String TOKENID = "tokenId";
    public static final String TRADE_NO = "trade_no";
    public static final String TRADE_NO_LIST = "trade_no_list";
    public static final String UIENGINE_NETWORK_CLASSPATH = "network_class_path";
    public static final String UIENGINE_UIINTER_BRIDGE_CLASSPATH = "uiengine_bridge_class_path";
    public static final String UI_ENGINE = "ui-engine.jar";
    public static final String UI_ENGINE_TEMP = "ui-engine-temp.jar";
    public static String UI_ENGINE_VERIFY[] = {
        "classes.dex", "lib/x86/libedittextutil.so", "lib/armeabi-v7a/libedittextutil.so", "lib/armeabi/libedittextutil.so"
    };
    public static final String UI_RESOUCE = "ui-resource.jar";
    public static final String UI_RESOUCE_TEMP = "ui-resource-temp.jar";
    public static String UI_RESOURCE_VERIFY[] = {
        "resources.arsc"
    };
    public static final String UI_WIN_LANGUAGE = "language.json";
    public static final String UI_WIN_TEMPLATE = "template.zip";
    public static String UP_GZIP = "upGzip";
    public static final String URL = "url";
    public static final String USER_AGENT = "user_agent";
    public static final String UTDID = "utdid";
    public static final String WAPINTERCEPT = "wapintercept";
    public static final String WINDATA_NAME = "win.data";
    public static final String WIN_LANGUAGE = "language";
    public static final String WIN_TEMP = "templates";
    public static final String WIN_VARIABLE = "variables";
    public static final String WIN_VERSION = "tv";
    public static final String WIN_VERSIONS = "tvs";
    public static String WITH_COOKIE = "wCookie";

    public CommonConstants()
    {
    }

    static 
    {
        ArrayList arraylist;
        int i;
        if (Runtime.getRuntime().availableProcessors() < 4)
        {
            i = 12;
        } else
        {
            i = Runtime.getRuntime().availableProcessors() * 3;
        }
        THREADCOUNT = i;
        arraylist = new ArrayList();
        HEADERS = arraylist;
        arraylist.add(new BasicHeader("Accept-Charset", "utf-8"));
        HEADERS.add(new BasicHeader("Connection", "Keep-Alive"));
        HEADERS.add(new BasicHeader("Keep-Alive", "timeout=90, max=100"));
    }
}
