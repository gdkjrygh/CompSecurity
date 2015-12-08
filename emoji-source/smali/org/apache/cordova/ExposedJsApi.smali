.class Lorg/apache/cordova/ExposedJsApi;
.super Ljava/lang/Object;
.source "ExposedJsApi.java"


# instance fields
.field private bridge:Lorg/apache/cordova/CordovaBridge;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/CordovaBridge;)V
    .locals 0
    .param p1, "bridge"    # Lorg/apache/cordova/CordovaBridge;

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lorg/apache/cordova/ExposedJsApi;->bridge:Lorg/apache/cordova/CordovaBridge;

    .line 35
    return-void
.end method


# virtual methods
.method public exec(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "bridgeSecret"    # I
    .param p2, "service"    # Ljava/lang/String;
    .param p3, "action"    # Ljava/lang/String;
    .param p4, "callbackId"    # Ljava/lang/String;
    .param p5, "arguments"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .annotation runtime Lorg/xwalk/core/JavascriptInterface;
    .end annotation

    .prologue
    .line 39
    iget-object v0, p0, Lorg/apache/cordova/ExposedJsApi;->bridge:Lorg/apache/cordova/CordovaBridge;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/apache/cordova/CordovaBridge;->jsExec(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public retrieveJsMessages(IZ)Ljava/lang/String;
    .locals 1
    .param p1, "bridgeSecret"    # I
    .param p2, "fromOnlineEvent"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .annotation runtime Lorg/xwalk/core/JavascriptInterface;
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lorg/apache/cordova/ExposedJsApi;->bridge:Lorg/apache/cordova/CordovaBridge;

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/CordovaBridge;->jsRetrieveJsMessages(IZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setNativeToJsBridgeMode(II)V
    .locals 1
    .param p1, "bridgeSecret"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .annotation runtime Lorg/xwalk/core/JavascriptInterface;
    .end annotation

    .prologue
    .line 44
    iget-object v0, p0, Lorg/apache/cordova/ExposedJsApi;->bridge:Lorg/apache/cordova/CordovaBridge;

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/CordovaBridge;->jsSetNativeToJsBridgeMode(II)V

    .line 45
    return-void
.end method
