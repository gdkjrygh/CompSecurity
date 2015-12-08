.class public Lcom/roidapp/photogrid/cmid/LoginService;
.super Landroid/app/IntentService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    const-string v0, "LoginService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 32
    return-void
.end method

.method private static a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 35
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cm/kinfoc/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 37
    const-string v0, ""

    .line 39
    :cond_0
    return-object v0
.end method


# virtual methods
.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 46
    if-nez p1, :cond_1

    .line 2101
    :cond_0
    :goto_0
    return-void

    .line 49
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 53
    const-string v1, "ACTION_LOGIN_BY_FACEBOOK"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1065
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->a()Ljava/lang/String;

    move-result-object v3

    .line 1066
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1071
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cmid/a;->b()Lcom/roidapp/photogrid/cmid/c;

    move-result-object v2

    .line 1072
    if-eqz v2, :cond_7

    .line 1075
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cmid/LoginService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->getInstance(Landroid/content/Context;)Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    move-result-object v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const-string v5, "115"

    const/4 v6, 0x1

    invoke-static {}, Lcom/roidapp/photogrid/cmid/LoginService;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v8

    invoke-static {v8}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v0 .. v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->thirdPartyLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    :try_end_0
    .catch Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    move-object v9, v0

    .line 1081
    :goto_2
    if-eqz v9, :cond_0

    .line 1082
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getRet()I

    move-result v0

    if-ne v0, v10, :cond_0

    .line 1083
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    invoke-interface {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    .line 1084
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1086
    :try_start_1
    const-string v2, "sid"

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getSid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1087
    const-string v2, "sso_token"

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getSsoToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1091
    :goto_3
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    invoke-interface {v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getExtra()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    move-result-object v0

    .line 1092
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v2

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/cmid/a;->a(Ljava/lang/String;)V

    .line 1093
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v1

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/cmid/a;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1079
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->printStackTrace()V

    goto :goto_2

    .line 1089
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_3

    .line 55
    :cond_2
    const-string v1, "ACTION_FRESH_GOOGLE_TOKEN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1131
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/a;->d()J

    move-result-wide v2

    .line 1132
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_3

    sub-long v2, v0, v2

    const-wide/32 v4, -0x4cf3c000

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 1135
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/roidapp/photogrid/cmid/a;->a(J)V

    .line 1137
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cmid/a;->c()Lcom/roidapp/photogrid/cmid/b;

    move-result-object v3

    .line 1138
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cmid/a;->b()Lcom/roidapp/photogrid/cmid/c;

    move-result-object v2

    .line 1140
    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    .line 1141
    invoke-virtual {v3}, Lcom/roidapp/photogrid/cmid/b;->a()Ljava/lang/String;

    move-result-object v6

    .line 1143
    :try_start_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cmid/LoginService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->getInstance(Landroid/content/Context;)Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    move-result-object v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/cmid/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/photogrid/cmid/LoginService;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v5

    invoke-static {v5}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->cmRefreshToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    :try_end_2
    .catch Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v9

    .line 1149
    :goto_4
    if-eqz v9, :cond_0

    .line 1150
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getRet()I

    move-result v0

    if-ne v0, v10, :cond_0

    .line 1152
    :try_start_3
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    invoke-interface {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    .line 1153
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 1155
    :try_start_4
    const-string v2, "sid"

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getSid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1156
    const-string v2, "sso_token"

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getSsoToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1160
    :goto_5
    :try_start_5
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cmid/a;->a(Ljava/lang/String;)V

    .line 1161
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1162
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/cmid/LoginService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1163
    const-string v1, "ACTION_LOGOUT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1164
    const-string v1, ":sid"

    invoke-virtual {p1, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1165
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cmid/LoginService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto/16 :goto_0

    .line 1168
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    .line 1147
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->printStackTrace()V

    goto :goto_4

    .line 1158
    :catch_4
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_5

    .line 57
    :cond_4
    const-string v1, "ACTION_LOGOUT"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1176
    const-string v0, ":sid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1179
    :try_start_7
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cmid/a;->b()Lcom/roidapp/photogrid/cmid/c;

    move-result-object v2

    .line 1180
    if-eqz v2, :cond_0

    .line 1181
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cmid/LoginService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->getInstance(Landroid/content/Context;)Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    move-result-object v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/photogrid/cmid/LoginService;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v5

    invoke-static {v5}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->allLogout(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    :try_end_7
    .catch Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException; {:try_start_7 .. :try_end_7} :catch_5

    goto/16 :goto_0

    .line 1185
    :catch_5
    move-exception v0

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->printStackTrace()V

    goto/16 :goto_0

    .line 59
    :cond_5
    const-string v1, "ACTION_LOGIN_BY_INSTAGRAM"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2099
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cmid/LoginService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 2100
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2104
    :try_start_8
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cmid/a;->b()Lcom/roidapp/photogrid/cmid/c;

    move-result-object v2

    .line 2105
    if-eqz v2, :cond_6

    .line 2106
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cmid/LoginService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->getInstance(Landroid/content/Context;)Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;

    move-result-object v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cmid/c;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {}, Lcom/roidapp/photogrid/cmid/LoginService;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v6

    invoke-static {v6}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/usermanager/UserManagerImpl;->instagramLoginWithExtra(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;
    :try_end_8
    .catch Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException; {:try_start_8 .. :try_end_8} :catch_6

    move-result-object v9

    .line 2112
    :cond_6
    :goto_6
    if-eqz v9, :cond_0

    .line 2113
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getRet()I

    move-result v0

    if-ne v0, v10, :cond_0

    .line 2114
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    invoke-interface {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    .line 2115
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 2117
    :try_start_9
    const-string v2, "sid"

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getSid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2118
    const-string v2, "sso_token"

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getSsoToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_7

    .line 2122
    :goto_7
    invoke-interface {v9}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    invoke-interface {v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin;->getExtra()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    move-result-object v0

    .line 2123
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v2

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/cmid/a;->a(Ljava/lang/String;)V

    .line 2124
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v1

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/cmid/a;->b(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2110
    :catch_6
    move-exception v0

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;->printStackTrace()V

    goto :goto_6

    .line 2120
    :catch_7
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_7

    :cond_7
    move-object v0, v9

    goto/16 :goto_1
.end method
