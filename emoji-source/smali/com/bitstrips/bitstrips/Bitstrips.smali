.class public Lcom/bitstrips/bitstrips/Bitstrips;
.super Lorg/apache/cordova/CordovaActivity;
.source "Bitstrips.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lorg/apache/cordova/CordovaActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 30
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaActivity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    iget-object v0, p0, Lcom/bitstrips/bitstrips/Bitstrips;->launchUrl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/bitstrips/bitstrips/Bitstrips;->loadUrl(Ljava/lang/String;)V

    .line 33
    return-void
.end method
