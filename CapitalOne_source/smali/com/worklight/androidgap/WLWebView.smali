.class public Lcom/worklight/androidgap/WLWebView;
.super Lorg/apache/cordova/CordovaWebView;
.source "WLWebView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lorg/apache/cordova/CordovaWebView;-><init>(Landroid/content/Context;)V

    .line 36
    return-void
.end method


# virtual methods
.method public pauseTimers()V
    .locals 0

    .prologue
    .line 40
    return-void
.end method

.method public pauseTimers(Z)V
    .locals 0
    .param p1, "realPause"    # Z

    .prologue
    .line 47
    invoke-super {p0}, Lorg/apache/cordova/CordovaWebView;->pauseTimers()V

    .line 48
    return-void
.end method
