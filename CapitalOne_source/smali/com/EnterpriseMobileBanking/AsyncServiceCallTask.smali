.class public Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;
.super Landroid/os/AsyncTask;
.source "AsyncServiceCallTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        "Lorg/apache/http/HttpResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final JSON_CONFIG_360:Ljava/lang/String; = "Cap360ContactInfo"

.field public static final JSON_CONFIG_ATM_360_ATM_LOCATOR:Ljava/lang/String; = "Cap360AtmLocator"

.field public static final JSON_CONFIG_CAP1:Ljava/lang/String; = "CapOneContactInfo"

.field public static final JSON_CONFIG_DELTA_HOURS:Ljava/lang/String; = "ConfigUpdateDeltaHours"

.field public static final JSON_CONFIG_EMAIL:Ljava/lang/String; = "Email"

.field public static final JSON_CONFIG_FACEBOOK_APP:Ljava/lang/String; = "FacebookApp"

.field public static final JSON_CONFIG_FACEBOOK_HTTP:Ljava/lang/String; = "FacebookHTTP"

.field public static final JSON_CONFIG_OPEN_OUTSIDE:Ljava/lang/String; = "OpenOutsideApp"

.field public static final JSON_CONFIG_OUTSIDE_US_NUMBER:Ljava/lang/String; = "OutsideUSNumber"

.field public static final JSON_CONFIG_PHONE_NUMBER:Ljava/lang/String; = "PhoneNumber"

.field public static final JSON_CONFIG_PRODUCTS:Ljava/lang/String; = "Products"

.field public static final JSON_CONFIG_PRODUCTS_360_AUTH_URL:Ljava/lang/String; = "ThreeSixtyAuthProductsUrl"

.field public static final JSON_CONFIG_PRODUCTS_360_URL:Ljava/lang/String; = "ThreeSixtyProductsUrl"

.field public static final JSON_CONFIG_PRODUCTS_BRANCH_URL:Ljava/lang/String; = "CapitalOneBranchFinderUrl"

.field public static final JSON_CONFIG_TWITTER_APP:Ljava/lang/String; = "TwitterApp"

.field public static final JSON_CONFIG_TWITTER_HTTP:Ljava/lang/String; = "TwitterHTTP"

.field public static final JSON_CONFIG_VERSION:Ljava/lang/String; = "Version"

.field public static final SERVICE_ID_CONFIG:I = 0x0

.field private static final TAG:Ljava/lang/String; = "AsyncServiceCallTask"

.field private static serviceUrls:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCtx:Landroid/content/Context;

.field private mServiceId:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->serviceUrls:Ljava/util/Map;

    .line 58
    sget-object v0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->serviceUrls:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "https://m.capitalone.com:443/static/mobileconfig.json"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    return-void
.end method

.method public constructor <init>(ILandroid/content/Context;)V
    .locals 0
    .param p1, "serviceId"    # I
    .param p2, "packageContext"    # Landroid/content/Context;

    .prologue
    .line 72
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 73
    iput p1, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->mServiceId:I

    .line 74
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->mCtx:Landroid/content/Context;

    .line 75
    return-void
.end method

.method private getAppAndHttpString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "app"    # Ljava/lang/String;
    .param p2, "http"    # Ljava/lang/String;

    .prologue
    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{ \"app\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\", \"web\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private handleConfigResponse(Lorg/json/JSONObject;)V
    .locals 10
    .param p1, "jObj"    # Lorg/json/JSONObject;

    .prologue
    .line 201
    if-nez p1, :cond_0

    .line 251
    :goto_0
    return-void

    .line 206
    :cond_0
    :try_start_0
    const-string v6, "CapOneContactInfo"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 207
    .local v1, "cap1Info":Lorg/json/JSONObject;
    const-string v6, "SP_CONTACT_CAP1_US_PHONE"

    const-string v7, "PhoneNumber"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 208
    const-string v6, "SP_CONTACT_CAP1_NON_US_PHONE"

    const-string v7, "OutsideUSNumber"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 209
    const-string v6, "TwitterApp"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 210
    .local v0, "app":Ljava/lang/String;
    const-string v6, "TwitterHTTP"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 211
    .local v3, "http":Ljava/lang/String;
    const-string v6, "SP_CONTACT_CAP1_TWITTER"

    invoke-direct {p0, v0, v3}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->getAppAndHttpString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 212
    const-string v6, "FacebookApp"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 213
    const-string v6, "FacebookHTTP"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 214
    const-string v6, "SP_CONTACT_CAP1_FACEBOOK"

    invoke-direct {p0, v0, v3}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->getAppAndHttpString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 217
    const-string v6, "Cap360ContactInfo"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 218
    .local v5, "threesixtyInfo":Lorg/json/JSONObject;
    const-string v6, "SP_CONTACT_360_US_PHONE"

    const-string v7, "PhoneNumber"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 219
    const-string v6, "SP_CONTACT_360_EMAIL"

    const-string v7, "Email"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 220
    const-string v6, "TwitterApp"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 221
    const-string v6, "TwitterHTTP"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 222
    const-string v6, "SP_CONTACT_360_TWITTER"

    invoke-direct {p0, v0, v3}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->getAppAndHttpString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 223
    const-string v6, "FacebookApp"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 224
    const-string v6, "FacebookHTTP"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 225
    const-string v6, "SP_CONTACT_360_FACEBOOK"

    invoke-direct {p0, v0, v3}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->getAppAndHttpString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 228
    const-string v6, "SP_CONFIG_DETLA_HOURS"

    const-string v7, "ConfigUpdateDeltaHours"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;I)Z

    .line 231
    const-string v6, "SP_ATM_CAP360_ATM_LOCATOR"

    const-string v7, "Cap360AtmLocator"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 232
    const-string v6, "SP_URL_OPEN_OUTSIDE"

    const-string v7, "OpenOutsideApp"

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    const-string v8, ","

    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->join(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 234
    const-string v6, "OpenOutsideApp"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->setOutsideAppList(Lorg/json/JSONArray;)V

    .line 237
    const-string v6, "Products"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 238
    .local v4, "products":Lorg/json/JSONObject;
    const-string v6, "SP_PRODUCTS_360_PRODUCTS_URL"

    const-string v7, "ThreeSixtyProductsUrl"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 239
    const-string v6, "SP_PRODUCTS_360_PRODUCTS_AUTH_URL"

    const-string v7, "ThreeSixtyAuthProductsUrl"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 240
    const-string v6, "SP_PRODUCTS_BRANCH_URL"

    const-string v7, "CapitalOneBranchFinderUrl"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 243
    const-string v6, "SP_CONFIG_LAST_UPDATED_MILLIS"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v6, v8, v9}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;J)Z

    .line 244
    const-string v6, "AsyncServiceCallTask"

    const-string v7, "Made it to the end of putting in config params"

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_0

    .line 246
    .end local v0    # "app":Ljava/lang/String;
    .end local v1    # "cap1Info":Lorg/json/JSONObject;
    .end local v3    # "http":Ljava/lang/String;
    .end local v4    # "products":Lorg/json/JSONObject;
    .end local v5    # "threesixtyInfo":Lorg/json/JSONObject;
    :catch_0
    move-exception v2

    .line 247
    .local v2, "e":Lorg/json/JSONException;
    const-string v6, "AsyncServiceCallTask"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error parsing data "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v2}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 248
    .end local v2    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v2

    .line 249
    .local v2, "e":Ljava/lang/Exception;
    const-string v6, "AsyncServiceCallTask"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error converting result "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 45
    check-cast p1, [Ljava/lang/Void;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->doInBackground([Ljava/lang/Void;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Lorg/apache/http/HttpResponse;
    .locals 7
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 81
    sget-object v5, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->serviceUrls:Ljava/util/Map;

    iget v6, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->mServiceId:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 84
    .local v4, "url":Ljava/lang/String;
    sget-object v5, Lcom/EnterpriseMobileBanking/Config;->MOBILE_CONFIG_BYPASS_SSL_ERRORS:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 85
    new-instance v0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;

    iget-object v5, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->mCtx:Landroid/content/Context;

    invoke-direct {v0, p0, v5}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;-><init>(Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;Landroid/content/Context;)V

    .line 89
    .local v0, "client":Lorg/apache/http/client/HttpClient;
    :goto_0
    new-instance v2, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v2, v4}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 91
    .local v2, "getRequest":Lorg/apache/http/client/methods/HttpGet;
    const/4 v3, 0x0

    .line 93
    .local v3, "response":Lorg/apache/http/HttpResponse;
    :try_start_0
    invoke-interface {v0, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 99
    :goto_1
    return-object v3

    .line 87
    .end local v0    # "client":Lorg/apache/http/client/HttpClient;
    .end local v2    # "getRequest":Lorg/apache/http/client/methods/HttpGet;
    .end local v3    # "response":Lorg/apache/http/HttpResponse;
    :cond_0
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .restart local v0    # "client":Lorg/apache/http/client/HttpClient;
    goto :goto_0

    .line 94
    .restart local v2    # "getRequest":Lorg/apache/http/client/methods/HttpGet;
    .restart local v3    # "response":Lorg/apache/http/HttpResponse;
    :catch_0
    move-exception v1

    .line 95
    .local v1, "e":Lorg/apache/http/client/ClientProtocolException;
    invoke-virtual {v1}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    goto :goto_1

    .line 96
    .end local v1    # "e":Lorg/apache/http/client/ClientProtocolException;
    :catch_1
    move-exception v1

    .line 97
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 45
    check-cast p1, Lorg/apache/http/HttpResponse;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->onPostExecute(Lorg/apache/http/HttpResponse;)V

    return-void
.end method

.method protected onPostExecute(Lorg/apache/http/HttpResponse;)V
    .locals 12
    .param p1, "result"    # Lorg/apache/http/HttpResponse;

    .prologue
    .line 128
    if-nez p1, :cond_1

    .line 178
    :cond_0
    :goto_0
    return-void

    .line 132
    :cond_1
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v9

    const/16 v10, 0xc8

    if-eq v9, v10, :cond_2

    .line 135
    const-string v9, "AsyncServiceCallTask"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "status code not zero: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v11

    invoke-interface {v11}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 139
    :cond_2
    const/4 v3, 0x0

    .line 144
    .local v3, "jObj":Lorg/json/JSONObject;
    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v2

    .line 146
    .local v2, "is":Ljava/io/InputStream;
    new-instance v7, Ljava/io/BufferedReader;

    new-instance v9, Ljava/io/InputStreamReader;

    const-string v10, "iso-8859-1"

    invoke-direct {v9, v2, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    const/16 v10, 0x8

    invoke-direct {v7, v9, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 147
    .local v7, "reader":Ljava/io/BufferedReader;
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .local v8, "sb":Ljava/lang/StringBuilder;
    const/4 v6, 0x0

    .line 149
    .local v6, "line":Ljava/lang/String;
    :goto_1
    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 150
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "\n"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_1

    .line 157
    .end local v2    # "is":Ljava/io/InputStream;
    .end local v6    # "line":Ljava/lang/String;
    .end local v7    # "reader":Ljava/io/BufferedReader;
    .end local v8    # "sb":Ljava/lang/StringBuilder;
    :catch_0
    move-exception v1

    .line 158
    .local v1, "e1":Ljava/lang/IllegalStateException;
    invoke-virtual {v1}, Ljava/lang/IllegalStateException;->printStackTrace()V

    .line 176
    .end local v1    # "e1":Ljava/lang/IllegalStateException;
    :goto_2
    iget v9, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->mServiceId:I

    if-nez v9, :cond_0

    .line 177
    invoke-direct {p0, v3}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->handleConfigResponse(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 152
    .restart local v2    # "is":Ljava/io/InputStream;
    .restart local v6    # "line":Ljava/lang/String;
    .restart local v7    # "reader":Ljava/io/BufferedReader;
    .restart local v8    # "sb":Ljava/lang/StringBuilder;
    :cond_3
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 153
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 155
    .local v5, "json":Ljava/lang/String;
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .end local v3    # "jObj":Lorg/json/JSONObject;
    .local v4, "jObj":Lorg/json/JSONObject;
    move-object v3, v4

    .line 165
    .end local v4    # "jObj":Lorg/json/JSONObject;
    .restart local v3    # "jObj":Lorg/json/JSONObject;
    goto :goto_2

    .line 159
    .end local v2    # "is":Ljava/io/InputStream;
    .end local v5    # "json":Ljava/lang/String;
    .end local v6    # "line":Ljava/lang/String;
    .end local v7    # "reader":Ljava/io/BufferedReader;
    .end local v8    # "sb":Ljava/lang/StringBuilder;
    :catch_1
    move-exception v1

    .line 160
    .local v1, "e1":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 161
    .end local v1    # "e1":Ljava/io/IOException;
    :catch_2
    move-exception v0

    .line 162
    .local v0, "e":Lorg/json/JSONException;
    const-string v9, "AsyncServiceCallTask"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Error parsing data "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 163
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_3
    move-exception v0

    .line 164
    .local v0, "e":Ljava/lang/Exception;
    const-string v9, "AsyncServiceCallTask"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Error converting result "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2
.end method
