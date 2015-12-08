.class Lorg/apache/cordova/CordovaWebView$Level16Apis;
.super Ljava/lang/Object;
.source "CordovaWebView.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/CordovaWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Level16Apis"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1023
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static enableUniversalAccess(Landroid/webkit/WebSettings;)V
    .locals 1
    .param p0, "settings"    # Landroid/webkit/WebSettings;

    .prologue
    .line 1025
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 1026
    return-void
.end method
