.class final Lcom/localytics/android/JavaScriptClient;
.super Ljava/lang/Object;
.source "JavaScriptClient.java"


# instance fields
.field private mCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/localytics/android/AmpCallable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/localytics/android/AmpCallable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 24
    .local p1, "callbacks":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Lcom/localytics/android/AmpCallable;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/localytics/android/JavaScriptClient;->mCallbacks:Ljava/util/Map;

    .line 26
    return-void
.end method

.method static synthetic access$000(Lcom/localytics/android/JavaScriptClient;I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/JavaScriptClient;
    .param p1, "x1"    # I
    .param p2, "x2"    # [Ljava/lang/Object;

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/localytics/android/JavaScriptClient;->invoke(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private invoke(I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "methodId"    # I
    .param p2, "params"    # [Ljava/lang/Object;

    .prologue
    .line 130
    const/4 v1, 0x0

    .line 132
    .local v1, "result":Ljava/lang/Object;
    iget-object v2, p0, Lcom/localytics/android/JavaScriptClient;->mCallbacks:Ljava/util/Map;

    if-eqz v2, :cond_0

    .line 134
    iget-object v2, p0, Lcom/localytics/android/JavaScriptClient;->mCallbacks:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/localytics/android/AmpCallable;

    .line 135
    .local v0, "callable":Lcom/localytics/android/AmpCallable;
    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {v0, p2}, Lcom/localytics/android/AmpCallable;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 141
    .end local v0    # "callable":Lcom/localytics/android/AmpCallable;
    .end local v1    # "result":Ljava/lang/Object;
    :cond_0
    return-object v1
.end method


# virtual methods
.method public getAttributes()Ljava/lang/String;
    .locals 3

    .prologue
    .line 124
    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Lcom/localytics/android/JavaScriptClient;->invoke(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 125
    .local v0, "customDimensions":Ljava/lang/String;
    return-object v0
.end method

.method public getCallbacks()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/localytics/android/AmpCallable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 30
    iget-object v0, p0, Lcom/localytics/android/JavaScriptClient;->mCallbacks:Ljava/util/Map;

    return-object v0
.end method

.method public getCustomDimensions()Ljava/lang/String;
    .locals 3

    .prologue
    .line 118
    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Lcom/localytics/android/JavaScriptClient;->invoke(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 119
    .local v0, "customDimensions":Ljava/lang/String;
    return-object v0
.end method

.method public getIdentifiers()Ljava/lang/String;
    .locals 3

    .prologue
    .line 112
    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Lcom/localytics/android/JavaScriptClient;->invoke(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 113
    .local v0, "identifiers":Ljava/lang/String;
    return-object v0
.end method

.method public getJsGlueCode()Ljava/lang/String;
    .locals 4

    .prologue
    .line 35
    const-string v0, "javascript:(function() {  var localyticsScript = document.createElement(\'script\');  localyticsScript.type = \'text/javascript\';  localyticsScript.text = \' \t localytics.identifers = %s;\t localytics.customDimensions = %s;\t localytics.attributes = %s;    localytics.tagEvent = function(event, attributes, customDimensions, customerValueIncrease) {\t   localytics.nativeTagEvent(event, JSON.stringify(attributes), JSON.stringify(customDimensions), customerValueIncrease);    };    localytics.setCustomDimension = function(number, value) {      if (number != null && value != null)        localytics.nativeSetCustomDimension(number, value);    };    window.open = function(url) {      if (url != null)        localytics.navigate(url);    };    localytics.close = function() {      localytics.nativeClose();    };\';  document.getElementsByTagName(\'body\')[0].appendChild(localyticsScript);})()"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/localytics/android/JavaScriptClient;->getIdentifiers()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/localytics/android/JavaScriptClient;->getCustomDimensions()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-virtual {p0}, Lcom/localytics/android/JavaScriptClient;->getAttributes()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public nativeClose()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 96
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 98
    const-string v0, "Localytics"

    const-string v1, "[JavaScriptClient]: nativeClose is being called"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/localytics/android/JavaScriptClient$1;

    invoke-direct {v1, p0}, Lcom/localytics/android/JavaScriptClient$1;-><init>(Lcom/localytics/android/JavaScriptClient;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 108
    return-void
.end method

.method public nativeSetCustomDimension(JLjava/lang/String;)V
    .locals 4
    .param p1, "dimension"    # J
    .param p3, "value"    # Ljava/lang/String;
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 79
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 81
    const-string v0, "Localytics"

    const-string v1, "[JavaScriptClient]: nativeSetCustomDimension is being called"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    :cond_0
    const/16 v0, 0x8

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    long-to-int v3, p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/localytics/android/JavaScriptClient;->invoke(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    return-void
.end method

.method public nativeTagEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3
    .param p1, "event"    # Ljava/lang/String;
    .param p2, "attributes"    # Ljava/lang/String;
    .param p3, "customDimensions"    # Ljava/lang/String;
    .param p4, "customerValueIncrease"    # J
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    const/4 v2, 0x3

    .line 68
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 70
    const-string v0, "Localytics"

    const-string v1, "[JavaScriptClient]: nativeTagEvent is being called"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    :cond_0
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const/4 v1, 0x2

    aput-object p3, v0, v1

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-direct {p0, v2, v0}, Lcom/localytics/android/JavaScriptClient;->invoke(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    return-void
.end method

.method public navigate(Ljava/lang/String;)V
    .locals 3
    .param p1, "url"    # Ljava/lang/String;
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    .line 90
    const/16 v0, 0xf

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/localytics/android/JavaScriptClient;->invoke(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    return-void
.end method
