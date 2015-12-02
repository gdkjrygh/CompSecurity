// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.monitor.log;


public final class ErrorCodeEnum extends Enum
{

    private static final ErrorCodeEnum $VALUES[];
    public static final ErrorCodeEnum ERROR_CODE_ADAPTER_NULL;
    public static final ErrorCodeEnum ERROR_CODE_AUTO_TRY;
    public static final ErrorCodeEnum ERROR_CODE_CLASS_LOAD_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_CREATE_FILE_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_DES;
    public static final ErrorCodeEnum ERROR_CODE_DIALOG_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_DIGEST_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_DOUBULE;
    public static final ErrorCodeEnum ERROR_CODE_DOWNLOAD_ENGINE_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_DOWNLOAD_RESOURCE_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_DYNAMIC_LOAD_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_FORCE_UPDATE;
    public static final ErrorCodeEnum ERROR_CODE_FORCE_UP_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_INITIAL;
    public static final ErrorCodeEnum ERROR_CODE_JSON_FORMART_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_LOST_ENTY;
    public static final ErrorCodeEnum ERROR_CODE_NET_CONNET_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_NET_INTERCEPT;
    public static final ErrorCodeEnum ERROR_CODE_NET_MUCH;
    public static final ErrorCodeEnum ERROR_CODE_ORDER_EMPTY;
    public static final ErrorCodeEnum ERROR_CODE_PARSE_WIN_DATA_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_RESTORE_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_SER_PAY_INTER;
    public static final ErrorCodeEnum ERROR_CODE_SIGN_CHECK_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_START_CONTAINER;
    public static final ErrorCodeEnum ERROR_CODE_SYSTEM_404;
    public static final ErrorCodeEnum ERROR_CODE_SYSTEM_ERROR_RES;
    public static final ErrorCodeEnum ERROR_CODE_UNKNOW_ELEMENT_TYPE;
    public static final ErrorCodeEnum ERROR_CODE_UNKNOW_JSACTION;
    public static final ErrorCodeEnum ERROR_CODE_UPDATE_DEX_ERROR;
    public static final ErrorCodeEnum ERROR_CODE_URISYNTAX;
    public static final ErrorCodeEnum ERROR_CODE_VIEW_DRAW_ERROR;
    public static final ErrorCodeEnum ERROR_JNI_LOAD_ERROR;
    public static final ErrorCodeEnum ERROR_SHOULE_RELEASE;
    public static final ErrorCodeEnum ERROR_START_GLOBAL_KILL;
    public static final ErrorCodeEnum ERROR_START_KILL;
    public static final ErrorCodeEnum OPENWEB_PARAMS_ERROR;
    public static final ErrorCodeEnum PAYACTIVITY_ONCREATE;
    public static final ErrorCodeEnum STATE_CODE_ERROR;
    public static final ErrorCodeEnum WEB_ACTIVITY_NULL;
    private final String code;

    private ErrorCodeEnum(String s, int i, String s1)
    {
        super(s, i);
        code = s1;
    }

    public static ErrorCodeEnum valueOf(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ErrorCodeEnum[] values()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public final String getCode()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        ERROR_CODE_DYNAMIC_LOAD_ERROR = new ErrorCodeEnum("ERROR_CODE_DYNAMIC_LOAD_ERROR", 0, "dynamic_load_error");
        ERROR_CODE_JSON_FORMART_ERROR = new ErrorCodeEnum("ERROR_CODE_JSON_FORMART_ERROR", 1, "json_format_error");
        ERROR_CODE_NET_MUCH = new ErrorCodeEnum("ERROR_CODE_NET_MUCH", 2, "net_req_much");
        ERROR_CODE_DIGEST_ERROR = new ErrorCodeEnum("ERROR_CODE_DIGEST_ERROR", 3, "digist_error");
        ERROR_CODE_SER_PAY_INTER = new ErrorCodeEnum("ERROR_CODE_SER_PAY_INTER", 4, "ser_pay_interrupt");
        ERROR_CODE_INITIAL = new ErrorCodeEnum("ERROR_CODE_INITIAL", 5, "initial");
        ERROR_CODE_DOUBULE = new ErrorCodeEnum("ERROR_CODE_DOUBULE", 6, "double-request");
        ERROR_SHOULE_RELEASE = new ErrorCodeEnum("ERROR_SHOULE_RELEASE", 7, "should_release");
        ERROR_JNI_LOAD_ERROR = new ErrorCodeEnum("ERROR_JNI_LOAD_ERROR", 8, "jni_load_error");
        ERROR_START_KILL = new ErrorCodeEnum("ERROR_START_KILL", 9, "start_kill");
        ERROR_START_GLOBAL_KILL = new ErrorCodeEnum("ERROR_START_GLOBAL_KILL", 10, "start_global_kill");
        ERROR_CODE_NET_INTERCEPT = new ErrorCodeEnum("ERROR_CODE_NET_INTERCEPT", 11, "net_intercept");
        ERROR_CODE_SIGN_CHECK_ERROR = new ErrorCodeEnum("ERROR_CODE_SIGN_CHECK_ERROR", 12, "sign_check_error");
        ERROR_CODE_UPDATE_DEX_ERROR = new ErrorCodeEnum("ERROR_CODE_UPDATE_DEX_ERROR", 13, "dex_version_error");
        ERROR_CODE_URISYNTAX = new ErrorCodeEnum("ERROR_CODE_URISYNTAX", 14, "URISyntaxException");
        ERROR_CODE_FORCE_UP_ERROR = new ErrorCodeEnum("ERROR_CODE_FORCE_UP_ERROR", 15, "fore_up_error");
        ERROR_CODE_DOWNLOAD_ENGINE_ERROR = new ErrorCodeEnum("ERROR_CODE_DOWNLOAD_ENGINE_ERROR", 16, "engine_down_error");
        ERROR_CODE_DOWNLOAD_RESOURCE_ERROR = new ErrorCodeEnum("ERROR_CODE_DOWNLOAD_RESOURCE_ERROR", 17, "resouce_down_error");
        ERROR_CODE_CLASS_LOAD_ERROR = new ErrorCodeEnum("ERROR_CODE_CLASS_LOAD_ERROR", 18, "class_load_error");
        ERROR_CODE_ADAPTER_NULL = new ErrorCodeEnum("ERROR_CODE_ADAPTER_NULL", 19, "adapter_null");
        ERROR_CODE_FORCE_UPDATE = new ErrorCodeEnum("ERROR_CODE_FORCE_UPDATE", 20, "force_update");
        ERROR_CODE_NET_CONNET_ERROR = new ErrorCodeEnum("ERROR_CODE_NET_CONNET_ERROR", 21, "net_connect_error");
        ERROR_CODE_CREATE_FILE_ERROR = new ErrorCodeEnum("ERROR_CODE_CREATE_FILE_ERROR", 22, "create_file_error");
        ERROR_CODE_SYSTEM_404 = new ErrorCodeEnum("ERROR_CODE_SYSTEM_404", 23, "cashier_system_404");
        ERROR_CODE_START_CONTAINER = new ErrorCodeEnum("ERROR_CODE_START_CONTAINER", 24, "start_container_error");
        ERROR_CODE_PARSE_WIN_DATA_ERROR = new ErrorCodeEnum("ERROR_CODE_PARSE_WIN_DATA_ERROR", 25, "parse_windate_error");
        ERROR_CODE_LOST_ENTY = new ErrorCodeEnum("ERROR_CODE_LOST_ENTY", 26, "data_lost_enty");
        ERROR_CODE_UNKNOW_JSACTION = new ErrorCodeEnum("ERROR_CODE_UNKNOW_JSACTION", 27, "unknown_jsaction");
        ERROR_CODE_SYSTEM_ERROR_RES = new ErrorCodeEnum("ERROR_CODE_SYSTEM_ERROR_RES", 28, "system_error_res");
        ERROR_CODE_AUTO_TRY = new ErrorCodeEnum("ERROR_CODE_AUTO_TRY", 29, "auto_try");
        ERROR_CODE_RESTORE_ERROR = new ErrorCodeEnum("ERROR_CODE_RESTORE_ERROR", 30, "view_restore_error");
        ERROR_CODE_UNKNOW_ELEMENT_TYPE = new ErrorCodeEnum("ERROR_CODE_UNKNOW_ELEMENT_TYPE", 31, "unknown_element_type");
        ERROR_CODE_DIALOG_ERROR = new ErrorCodeEnum("ERROR_CODE_DIALOG_ERROR", 32, "dialog_error");
        ERROR_CODE_DES = new ErrorCodeEnum("ERROR_CODE_DES", 33, "des_error");
        ERROR_CODE_VIEW_DRAW_ERROR = new ErrorCodeEnum("ERROR_CODE_VIEW_DRAW_ERROR", 34, "view_draw_error");
        ERROR_CODE_ORDER_EMPTY = new ErrorCodeEnum("ERROR_CODE_ORDER_EMPTY", 35, "order_empty");
        OPENWEB_PARAMS_ERROR = new ErrorCodeEnum("OPENWEB_PARAMS_ERROR", 36, "openweb_params_error");
        WEB_ACTIVITY_NULL = new ErrorCodeEnum("WEB_ACTIVITY_NULL", 37, "web_activity_null");
        STATE_CODE_ERROR = new ErrorCodeEnum("STATE_CODE_ERROR", 38, "status_code_error");
        PAYACTIVITY_ONCREATE = new ErrorCodeEnum("PAYACTIVITY_ONCREATE", 39, "payactivity_oncreate");
        $VALUES = (new ErrorCodeEnum[] {
            ERROR_CODE_DYNAMIC_LOAD_ERROR, ERROR_CODE_JSON_FORMART_ERROR, ERROR_CODE_NET_MUCH, ERROR_CODE_DIGEST_ERROR, ERROR_CODE_SER_PAY_INTER, ERROR_CODE_INITIAL, ERROR_CODE_DOUBULE, ERROR_SHOULE_RELEASE, ERROR_JNI_LOAD_ERROR, ERROR_START_KILL, 
            ERROR_START_GLOBAL_KILL, ERROR_CODE_NET_INTERCEPT, ERROR_CODE_SIGN_CHECK_ERROR, ERROR_CODE_UPDATE_DEX_ERROR, ERROR_CODE_URISYNTAX, ERROR_CODE_FORCE_UP_ERROR, ERROR_CODE_DOWNLOAD_ENGINE_ERROR, ERROR_CODE_DOWNLOAD_RESOURCE_ERROR, ERROR_CODE_CLASS_LOAD_ERROR, ERROR_CODE_ADAPTER_NULL, 
            ERROR_CODE_FORCE_UPDATE, ERROR_CODE_NET_CONNET_ERROR, ERROR_CODE_CREATE_FILE_ERROR, ERROR_CODE_SYSTEM_404, ERROR_CODE_START_CONTAINER, ERROR_CODE_PARSE_WIN_DATA_ERROR, ERROR_CODE_LOST_ENTY, ERROR_CODE_UNKNOW_JSACTION, ERROR_CODE_SYSTEM_ERROR_RES, ERROR_CODE_AUTO_TRY, 
            ERROR_CODE_RESTORE_ERROR, ERROR_CODE_UNKNOW_ELEMENT_TYPE, ERROR_CODE_DIALOG_ERROR, ERROR_CODE_DES, ERROR_CODE_VIEW_DRAW_ERROR, ERROR_CODE_ORDER_EMPTY, OPENWEB_PARAMS_ERROR, WEB_ACTIVITY_NULL, STATE_CODE_ERROR, PAYACTIVITY_ONCREATE
        });
    }
}
