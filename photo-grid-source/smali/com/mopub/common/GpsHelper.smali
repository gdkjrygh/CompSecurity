.class public Lcom/mopub/common/GpsHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ADVERTISING_ID_KEY:Ljava/lang/String; = "advertisingId"

.field public static final GOOGLE_PLAY_SUCCESS_CODE:I = 0x0

.field public static final IS_LIMIT_AD_TRACKING_ENABLED_KEY:Ljava/lang/String; = "isLimitAdTrackingEnabled"

.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-string v0, "com.google.android.gms.common.GooglePlayServicesUtil"

    sput-object v0, Lcom/mopub/common/GpsHelper;->a:Ljava/lang/String;

    .line 21
    const-string v0, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    sput-object v0, Lcom/mopub/common/GpsHelper;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/mopub/common/GpsHelper;->b:Ljava/lang/String;

    return-object v0
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 182
    :try_start_0
    const-string v0, "getId"

    invoke-static {p0, v0}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V
    .locals 2

    .prologue
    .line 107
    sget-object v0, Lcom/mopub/common/GpsHelper;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/common/util/Reflection;->classFound(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 108
    if-eqz p1, :cond_0

    .line 109
    invoke-interface {p1}, Lcom/mopub/common/GpsHelper$GpsHelperListener;->onFetchAdInfoCompleted()V

    .line 123
    :cond_0
    :goto_0
    return-void

    .line 115
    :cond_1
    :try_start_0
    new-instance v0, Lcom/mopub/common/j;

    invoke-direct {v0, p0, p1}, Lcom/mopub/common/j;-><init>(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-static {v0, v1}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 116
    :catch_0
    move-exception v0

    .line 117
    const-string v1, "Error executing FetchAdvertisingInfoTask"

    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    if-eqz p1, :cond_0

    .line 120
    invoke-interface {p1}, Lcom/mopub/common/GpsHelper$GpsHelperListener;->onFetchAdInfoCompleted()V

    goto :goto_0
.end method

.method static a(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 168
    invoke-static {p1}, Lcom/mopub/common/GpsHelper;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 169
    invoke-static {p1}, Lcom/mopub/common/GpsHelper;->b(Ljava/lang/Object;)Z

    move-result v1

    .line 176
    invoke-static {p0}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object v2

    .line 177
    invoke-virtual {v2, v0, v1}, Lcom/mopub/common/ClientMetadata;->setAdvertisingInfo(Ljava/lang/String;Z)V

    .line 178
    return-void
.end method

.method private static b(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 190
    :try_start_0
    const-string v0, "isLimitAdTrackingEnabled"

    invoke-static {p0, v0}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 191
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 193
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 191
    goto :goto_0

    .line 193
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0
.end method

.method public static fetchAdvertisingInfoAsync(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V
    .locals 2

    .prologue
    .line 69
    invoke-static {p0}, Lcom/mopub/common/GpsHelper;->isPlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 1062
    invoke-static {p0}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mopub/common/ClientMetadata;->isAdvertisingInfoSet()Z

    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    invoke-static {p0, p1}, Lcom/mopub/common/GpsHelper;->a(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V

    .line 81
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    if-eqz p1, :cond_2

    .line 74
    invoke-interface {p1}, Lcom/mopub/common/GpsHelper$GpsHelperListener;->onFetchAdInfoCompleted()V

    .line 76
    :cond_2
    if-eqz v0, :cond_0

    .line 78
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/mopub/common/GpsHelper;->a(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V

    goto :goto_0
.end method

.method public static fetchAdvertisingInfoSync(Landroid/content/Context;)Lcom/mopub/common/GpsHelper$AdvertisingInfo;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 85
    if-nez p0, :cond_0

    .line 103
    :goto_0
    return-object v0

    .line 90
    :cond_0
    const/4 v1, 0x0

    :try_start_0
    const-string v2, "getAdvertisingIdInfo"

    invoke-static {v1, v2}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v1

    sget-object v2, Lcom/mopub/common/GpsHelper;->b:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mopub/common/util/Reflection$MethodBuilder;->setStatic(Ljava/lang/Class;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-virtual {v1, v2, p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->addParam(Ljava/lang/Class;Ljava/lang/Object;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v1

    .line 94
    invoke-virtual {v1}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 100
    invoke-static {v0}, Lcom/mopub/common/GpsHelper;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-static {v0}, Lcom/mopub/common/GpsHelper;->b(Ljava/lang/Object;)Z

    move-result v2

    .line 103
    new-instance v0, Lcom/mopub/common/GpsHelper$AdvertisingInfo;

    invoke-direct {v0, v1, v2}, Lcom/mopub/common/GpsHelper$AdvertisingInfo;-><init>(Ljava/lang/String;Z)V

    goto :goto_0

    .line 96
    :catch_0
    move-exception v1

    const-string v1, "Unable to obtain Google AdvertisingIdClient.Info via reflection."

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static isLimitAdTrackingEnabled(Landroid/content/Context;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 53
    invoke-static {p0}, Lcom/mopub/common/GpsHelper;->isPlayServicesAvailable(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 54
    invoke-static {p0}, Lcom/mopub/common/SharedPreferencesHelper;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "isLimitAdTrackingEnabled"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 57
    :cond_0
    return v0
.end method

.method public static isPlayServicesAvailable(Landroid/content/Context;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 39
    const/4 v0, 0x0

    :try_start_0
    const-string v2, "isGooglePlayServicesAvailable"

    invoke-static {v0, v2}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v0

    sget-object v2, Lcom/mopub/common/GpsHelper;->a:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mopub/common/util/Reflection$MethodBuilder;->setStatic(Ljava/lang/Class;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-virtual {v0, v2, p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->addParam(Ljava/lang/Class;Ljava/lang/Object;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;

    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 47
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 45
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0
.end method

.method public static setClassNamesForTesting()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 202
    const-string v0, "java.lang.Class"

    .line 203
    sput-object v0, Lcom/mopub/common/GpsHelper;->a:Ljava/lang/String;

    .line 204
    sput-object v0, Lcom/mopub/common/GpsHelper;->b:Ljava/lang/String;

    .line 205
    return-void
.end method
