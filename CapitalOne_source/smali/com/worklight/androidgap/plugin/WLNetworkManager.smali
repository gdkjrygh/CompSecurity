.class public Lcom/worklight/androidgap/plugin/WLNetworkManager;
.super Lorg/apache/cordova/NetworkManager;
.source "WLNetworkManager.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lorg/apache/cordova/NetworkManager;-><init>()V

    return-void
.end method


# virtual methods
.method public isSynch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "action"    # Ljava/lang/String;

    .prologue
    .line 34
    const/4 v0, 0x1

    return v0
.end method
