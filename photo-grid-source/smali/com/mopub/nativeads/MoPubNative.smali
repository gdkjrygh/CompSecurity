.class public Lcom/mopub/nativeads/MoPubNative;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

.field static final b:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;

.field private e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

.field private f:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/mopub/network/AdRequest$Listener;

.field private i:Lcom/mopub/network/AdRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    new-instance v0, Lcom/mopub/nativeads/t;

    invoke-direct {v0}, Lcom/mopub/nativeads/t;-><init>()V

    sput-object v0, Lcom/mopub/nativeads/MoPubNative;->a:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    .line 57
    new-instance v0, Lcom/mopub/nativeads/u;

    invoke-direct {v0}, Lcom/mopub/nativeads/u;-><init>()V

    sput-object v0, Lcom/mopub/nativeads/MoPubNative;->b:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/nativeads/MoPubNative$MoPubNativeListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 100
    invoke-direct {p0, p1, p2, p3}, Lcom/mopub/nativeads/MoPubNative;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;)V

    .line 101
    invoke-virtual {p0, p3}, Lcom/mopub/nativeads/MoPubNative;->setNativeEventListener(Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;)V

    .line 102
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;)V
    .locals 1

    .prologue
    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->g:Ljava/util/Map;

    .line 107
    const-string v0, "Context may not be null."

    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    const-string v0, "AdUnitId may not be null."

    invoke-static {p2, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    const-string v0, "MoPubNativeNetworkListener may not be null."

    invoke-static {p3, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-static {p1}, Lcom/mopub/common/util/ManifestUtils;->checkNativeActivitiesDeclared(Landroid/content/Context;)V

    .line 113
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->c:Ljava/lang/ref/WeakReference;

    .line 114
    iput-object p2, p0, Lcom/mopub/nativeads/MoPubNative;->d:Ljava/lang/String;

    .line 115
    iput-object p3, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    .line 116
    sget-object v0, Lcom/mopub/nativeads/MoPubNative;->b:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->f:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    .line 117
    new-instance v0, Lcom/mopub/nativeads/v;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/v;-><init>(Lcom/mopub/nativeads/MoPubNative;)V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->h:Lcom/mopub/network/AdRequest$Listener;

    .line 130
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/mopub/common/GpsHelper;->fetchAdvertisingInfoAsync(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V

    .line 131
    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/MoPubNative;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/mopub/nativeads/MoPubNative;Lcom/mopub/network/AdResponse;)V
    .locals 3

    .prologue
    .line 37
    .line 1221
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubNative;->a()Landroid/content/Context;

    move-result-object v0

    .line 1222
    if-eqz v0, :cond_0

    .line 1225
    new-instance v1, Lcom/mopub/nativeads/w;

    invoke-direct {v1, p0, p1}, Lcom/mopub/nativeads/w;-><init>(Lcom/mopub/nativeads/MoPubNative;Lcom/mopub/network/AdResponse;)V

    .line 1249
    iget-object v2, p0, Lcom/mopub/nativeads/MoPubNative;->g:Ljava/util/Map;

    invoke-static {v0, v2, p1, v1}, Lcom/mopub/nativeads/g;->loadNativeAd(Landroid/content/Context;Ljava/util/Map;Lcom/mopub/network/AdResponse;Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;)V

    .line 37
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/mopub/nativeads/MoPubNative;)Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->f:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/nativeads/MoPubNative;)Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    return-object v0
.end method


# virtual methods
.method final a()Landroid/content/Context;
    .locals 2

    .prologue
    .line 298
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 299
    if-nez v0, :cond_0

    .line 300
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubNative;->destroy()V

    .line 301
    const-string v1, "Weak reference to Activity Context in MoPubNative became null. This instance of MoPubNative is destroyed and No more requests will be processed."

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 304
    :cond_0
    return-object v0
.end method

.method final a(Lcom/mopub/volley/VolleyError;)V
    .locals 3
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 259
    const-string v0, "Native ad request failed."

    invoke-static {v0, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    instance-of v0, p1, Lcom/mopub/network/MoPubNetworkError;

    if-eqz v0, :cond_0

    .line 261
    check-cast p1, Lcom/mopub/network/MoPubNetworkError;

    .line 262
    sget-object v0, Lcom/mopub/nativeads/x;->a:[I

    invoke-virtual {p1}, Lcom/mopub/network/MoPubNetworkError;->getReason()Lcom/mopub/network/MoPubNetworkError$Reason;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mopub/network/MoPubNetworkError$Reason;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 280
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    .line 295
    :goto_0
    return-void

    .line 264
    :pswitch_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_JSON:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 267
    :pswitch_1
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_JSON:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 272
    :pswitch_2
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->WARMUP:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubErrorCode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->c(Ljava/lang/String;)V

    .line 273
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 276
    :pswitch_3
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->EMPTY_AD_RESPONSE:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 285
    :cond_0
    iget-object v0, p1, Lcom/mopub/volley/VolleyError;->networkResponse:Lcom/mopub/volley/NetworkResponse;

    .line 286
    if-eqz v0, :cond_1

    iget v1, v0, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v2, 0x1f4

    if-lt v1, v2, :cond_1

    iget v1, v0, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v2, 0x258

    if-ge v1, v2, :cond_1

    .line 287
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->SERVER_ERROR_RESPONSE_CODE:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 288
    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/common/util/DeviceUtils;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 289
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_CONNECTION:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubErrorCode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->c(Ljava/lang/String;)V

    .line 290
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 292
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->UNSPECIFIED:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 262
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method final a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 205
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubNative;->a()Landroid/content/Context;

    move-result-object v4

    .line 206
    if-nez v4, :cond_0

    .line 218
    :goto_0
    return-void

    .line 210
    :cond_0
    if-nez p1, :cond_1

    .line 211
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->INVALID_REQUEST_URL:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 215
    :cond_1
    new-instance v0, Lcom/mopub/network/AdRequest;

    sget-object v2, Lcom/mopub/common/AdFormat;->NATIVE:Lcom/mopub/common/AdFormat;

    iget-object v3, p0, Lcom/mopub/nativeads/MoPubNative;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/mopub/nativeads/MoPubNative;->h:Lcom/mopub/network/AdRequest$Listener;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/mopub/network/AdRequest;-><init>(Ljava/lang/String;Lcom/mopub/common/AdFormat;Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/AdRequest$Listener;)V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->i:Lcom/mopub/network/AdRequest;

    .line 216
    invoke-static {v4}, Lcom/mopub/network/Networking;->getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v0

    .line 217
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNative;->i:Lcom/mopub/network/AdRequest;

    invoke-virtual {v0, v1}, Lcom/mopub/volley/RequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    goto :goto_0
.end method

.method public destroy()V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    .line 140
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->i:Lcom/mopub/network/AdRequest;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->i:Lcom/mopub/network/AdRequest;

    invoke-virtual {v0}, Lcom/mopub/network/AdRequest;->cancel()V

    .line 142
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->i:Lcom/mopub/network/AdRequest;

    .line 144
    :cond_0
    sget-object v0, Lcom/mopub/nativeads/MoPubNative;->a:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    .line 145
    sget-object v0, Lcom/mopub/nativeads/MoPubNative;->b:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->f:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    .line 146
    return-void
.end method

.method public makeRequest()V
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/MoPubNative;->makeRequest(Lcom/mopub/nativeads/RequestParameters;)V

    .line 158
    return-void
.end method

.method public makeRequest(Lcom/mopub/nativeads/RequestParameters;)V
    .locals 1

    .prologue
    .line 161
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/mopub/nativeads/MoPubNative;->makeRequest(Lcom/mopub/nativeads/RequestParameters;Ljava/lang/Integer;)V

    .line 162
    return-void
.end method

.method public makeRequest(Lcom/mopub/nativeads/RequestParameters;Ljava/lang/Integer;)V
    .locals 3

    .prologue
    .line 166
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubNative;->a()Landroid/content/Context;

    move-result-object v0

    .line 167
    if-nez v0, :cond_1

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 171
    :cond_1
    invoke-static {v0}, Lcom/mopub/common/util/DeviceUtils;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 172
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->e:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    sget-object v1, Lcom/mopub/nativeads/NativeErrorCode;->CONNECTION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V

    goto :goto_0

    .line 1182
    :cond_2
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubNative;->a()Landroid/content/Context;

    move-result-object v0

    .line 1183
    if-eqz v0, :cond_0

    .line 1187
    new-instance v1, Lcom/mopub/nativeads/ao;

    invoke-direct {v1, v0}, Lcom/mopub/nativeads/ao;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/mopub/nativeads/ao;->withAdUnitId(Ljava/lang/String;)Lcom/mopub/nativeads/ao;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/ao;->a(Lcom/mopub/nativeads/RequestParameters;)Lcom/mopub/nativeads/ao;

    move-result-object v0

    .line 1191
    if-eqz p2, :cond_3

    .line 1192
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/ao;->a(I)Lcom/mopub/nativeads/ao;

    .line 1195
    :cond_3
    const-string v1, "ads.mopub.com"

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/ao;->generateUrlString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1197
    if-eqz v0, :cond_4

    .line 1198
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Loading ad from: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 1201
    :cond_4
    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/MoPubNative;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setLocalExtras(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 149
    if-nez p1, :cond_0

    .line 150
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->g:Ljava/util/Map;

    .line 154
    :goto_0
    return-void

    .line 152
    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0, p1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNative;->g:Ljava/util/Map;

    goto :goto_0
.end method

.method public setNativeEventListener(Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;)V
    .locals 0

    .prologue
    .line 134
    if-nez p1, :cond_0

    sget-object p1, Lcom/mopub/nativeads/MoPubNative;->b:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    :cond_0
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubNative;->f:Lcom/mopub/nativeads/MoPubNative$MoPubNativeEventListener;

    .line 136
    return-void
.end method
