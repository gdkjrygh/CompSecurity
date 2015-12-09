.class public Lorg/apache/cordova/StandAlone;
.super Lorg/apache/cordova/DroidGap;
.source "StandAlone.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lorg/apache/cordova/DroidGap;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 27
    invoke-super {p0, p1}, Lorg/apache/cordova/DroidGap;->onCreate(Landroid/os/Bundle;)V

    .line 29
    const-string v0, "file:///android_asset/www/index.html"

    invoke-super {p0, v0}, Lorg/apache/cordova/DroidGap;->loadUrl(Ljava/lang/String;)V

    .line 30
    return-void
.end method
