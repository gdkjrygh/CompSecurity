.class public Lcom/EnterpriseMobileBanking/Plugins/NativeCache;
.super Lorg/apache/cordova/api/Plugin;
.source "NativeCache.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "NativeCache"

.field private static cache:Landroid/content/SharedPreferences$Editor;

.field private static prefs:Landroid/content/SharedPreferences;

.field private static final resultsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field result:Lorg/apache/cordova/api/PluginResult;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 32
    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    .line 33
    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->resultsMap:Ljava/util/Map;

    .line 38
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->resultsMap:Ljava/util/Map;

    const-string v1, "PhoneNumber"

    const-string v2, "SP_CONTACT_360_US_PHONE"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->resultsMap:Ljava/util/Map;

    const-string v1, "Email"

    const-string v2, "SP_CONTACT_360_EMAIL"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->resultsMap:Ljava/util/Map;

    const-string v1, "threeSixtyProductsUrl"

    const-string v2, "SP_PRODUCTS_360_PRODUCTS_URL"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->resultsMap:Ljava/util/Map;

    const-string v1, "atmThreeSixty"

    const-string v2, "SP_ATM_CAP360_ATM_LOCATOR"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    return-void
.end method

.method private cameraControl(Ljava/lang/String;)V
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 250
    :try_start_0
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, "success"

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    :goto_0
    return-void

    .line 252
    :catch_0
    move-exception v0

    .line 253
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, "Failed to set cameraControl"

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    goto :goto_0
.end method

.method public static contains(Ljava/lang/String;)Z
    .locals 1
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    .line 107
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->setupPreferences()V

    .line 108
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private delete(Ljava/lang/String;)V
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 238
    :try_start_0
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 239
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 245
    :goto_0
    return-void

    .line 240
    :catch_0
    move-exception v0

    .line 241
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, "Failed to remove the key from cache"

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    goto :goto_0
.end method

.method private read(Ljava/lang/String;)V
    .locals 5
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 213
    :try_start_0
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 214
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    const-string v4, "xxx"

    invoke-interface {v3, p1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    .line 223
    :goto_0
    return-void

    .line 216
    :cond_0
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, "xxx"

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 219
    :catch_0
    move-exception v0

    .line 220
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, "Unknown Error"

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    goto :goto_0
.end method

.method private static setupPreferences()V
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    if-nez v0, :cond_1

    .line 47
    :cond_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    .line 48
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    .line 50
    :cond_1
    return-void
.end method

.method public static staticRead(Ljava/lang/String;I)I
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "defaultValue"    # I

    .prologue
    .line 140
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->setupPreferences()V

    .line 141
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static staticRead(Ljava/lang/String;J)J
    .locals 3
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "defaultValue"    # J

    .prologue
    .line 151
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->setupPreferences()V

    .line 152
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1, p2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static staticRead(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    .line 117
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->setupPreferences()V

    .line 119
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "defaultValue"    # Ljava/lang/String;

    .prologue
    .line 129
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->setupPreferences()V

    .line 130
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static staticRead(Ljava/lang/String;Z)Z
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "defaultValue"    # Z

    .prologue
    .line 162
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->setupPreferences()V

    .line 163
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static staticWrite(Ljava/lang/String;I)Z
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # I

    .prologue
    .line 184
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 185
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public static staticWrite(Ljava/lang/String;J)Z
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # J

    .prologue
    .line 195
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 196
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public static staticWrite(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 173
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 174
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public static staticWrite(Ljava/lang/String;Z)Z
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Z

    .prologue
    .line 206
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 207
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method private worklightProperties(Lorg/json/JSONObject;Lorg/json/JSONArray;)V
    .locals 15
    .param p1, "jsObj"    # Lorg/json/JSONObject;
    .param p2, "urls"    # Lorg/json/JSONArray;

    .prologue
    .line 259
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_0
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-ge v8, v12, :cond_1

    .line 261
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 263
    .local v5, "element":Ljava/lang/String;
    sget-object v12, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->resultsMap:Ljava/util/Map;

    invoke-interface {v12, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 265
    invoke-static {v5}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 267
    .local v10, "temp":Ljava/lang/String;
    sget-object v12, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->resultsMap:Ljava/util/Map;

    invoke-interface {v12, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-direct {p0, v12, v10}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->write(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .end local v10    # "temp":Ljava/lang/String;
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 272
    .end local v5    # "element":Ljava/lang/String;
    :cond_1
    const-string v12, "FacebookApp"

    const-string v13, "SP_CONTACT_360_FACEBOOK"

    invoke-static {v13}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 273
    .local v6, "facebookApp":Ljava/lang/String;
    const-string v12, "FacebookHTTP"

    const-string v13, "SP_CONTACT_360_FACEBOOK"

    invoke-static {v13}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 274
    .local v1, "FacebookHTTP":Ljava/lang/String;
    const-string v12, "TwitterApp"

    const-string v13, "SP_CONTACT_360_TWITTER"

    invoke-static {v13}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 275
    .local v2, "TwitterApp":Ljava/lang/String;
    const-string v12, "TwitterHTTP"

    const-string v13, "SP_CONTACT_360_TWITTER"

    invoke-static {v13}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 276
    .local v3, "TwitterHTTP":Ljava/lang/String;
    const-string v12, "threeSixtyProductsUrl"

    const-string v13, "SP_PRODUCTS_360_PRODUCTS_URL"

    invoke-static {v13}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 278
    .local v11, "threeSixtyProductsUrl":Ljava/lang/String;
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "{ \"app\":\""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "\", \"web\":\""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "\" }"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 279
    .local v7, "fappandhttp":Ljava/lang/String;
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "{ \"app\":\""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "\", \"web\":\""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "\" }"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 281
    .local v9, "tappandhttp":Ljava/lang/String;
    const-string v12, "SP_CONTACT_360_FACEBOOK"

    invoke-direct {p0, v12, v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->write(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string v12, "SP_CONTACT_360_TWITTER"

    invoke-direct {p0, v12, v9}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->write(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v12, "SP_PRODUCTS_360_PRODUCTS_AUTH_URL"

    invoke-direct {p0, v12, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->write(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v12, "SP_PRODUCTS_360_PRODUCTS_URL"

    invoke-direct {p0, v12, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->write(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 293
    .end local v1    # "FacebookHTTP":Ljava/lang/String;
    .end local v2    # "TwitterApp":Ljava/lang/String;
    .end local v3    # "TwitterHTTP":Ljava/lang/String;
    .end local v6    # "facebookApp":Ljava/lang/String;
    .end local v7    # "fappandhttp":Ljava/lang/String;
    .end local v9    # "tappandhttp":Ljava/lang/String;
    .end local v11    # "threeSixtyProductsUrl":Ljava/lang/String;
    :goto_1
    return-void

    .line 288
    :catch_0
    move-exception v4

    .line 289
    .local v4, "e":Lorg/json/JSONException;
    const-string v12, "NativeCache"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Error parsing data "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v4}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 290
    .end local v4    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v4

    .line 291
    .local v4, "e":Ljava/lang/Exception;
    const-string v12, "NativeCache"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Error converting result "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private write(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 227
    :try_start_0
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 228
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cache:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 229
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, "success"

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    :goto_0
    return-void

    .line 230
    :catch_0
    move-exception v0

    .line 231
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v3, "failed"

    invoke-direct {v1, v2, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    goto :goto_0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 9
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "data"    # Lorg/json/JSONArray;
    .param p3, "callBack"    # Ljava/lang/String;

    .prologue
    .line 60
    :try_start_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->setupPreferences()V

    .line 61
    const/4 v6, 0x0

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 63
    .local v4, "key":Ljava/lang/String;
    const-string v6, "read"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 64
    invoke-direct {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->read(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :goto_0
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    .end local v4    # "key":Ljava/lang/String;
    :goto_1
    return-object v6

    .line 66
    .restart local v4    # "key":Ljava/lang/String;
    :cond_0
    :try_start_1
    const-string v6, "write"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 67
    const/4 v6, 0x1

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 68
    .local v5, "value":Ljava/lang/String;
    const-string v6, "adapconfig"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "config"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 69
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 71
    .local v1, "jOBJ":Lorg/json/JSONObject;
    new-instance v2, Lorg/json/JSONObject;

    const-string v6, "invocationResult"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 73
    .local v2, "jOBJ2":Lorg/json/JSONObject;
    invoke-virtual {v2}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v3

    .line 75
    .local v3, "jsArray":Lorg/json/JSONArray;
    invoke-direct {p0, v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->worklightProperties(Lorg/json/JSONObject;Lorg/json/JSONArray;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 91
    .end local v1    # "jOBJ":Lorg/json/JSONObject;
    .end local v2    # "jOBJ2":Lorg/json/JSONObject;
    .end local v3    # "jsArray":Lorg/json/JSONArray;
    .end local v4    # "key":Ljava/lang/String;
    .end local v5    # "value":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 92
    .local v0, "e":Ljava/lang/Exception;
    :try_start_2
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v7, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v8, "still an error"

    invoke-direct {v6, v7, v8}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    goto :goto_1

    .line 78
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v4    # "key":Ljava/lang/String;
    .restart local v5    # "value":Ljava/lang/String;
    :cond_2
    :try_start_3
    invoke-direct {p0, v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->write(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 95
    .end local v4    # "key":Ljava/lang/String;
    .end local v5    # "value":Ljava/lang/String;
    :catchall_0
    move-exception v6

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;

    goto :goto_1

    .line 82
    .restart local v4    # "key":Ljava/lang/String;
    :cond_3
    :try_start_4
    const-string v6, "delete"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 83
    invoke-direct {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->delete(Ljava/lang/String;)V

    goto :goto_0

    .line 85
    :cond_4
    const-string v6, "cameraControl"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 86
    invoke-direct {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->cameraControl(Ljava/lang/String;)V

    goto :goto_0

    .line 89
    :cond_5
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v7, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v8, "invalid action"

    invoke-direct {v6, v7, v8}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    iput-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->result:Lorg/apache/cordova/api/PluginResult;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0
.end method
