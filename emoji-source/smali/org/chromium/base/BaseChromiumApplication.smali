.class public Lorg/chromium/base/BaseChromiumApplication;
.super Landroid/app/Application;
.source "BaseChromiumApplication.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 0

    .prologue
    .line 16
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 17
    invoke-static {p0}, Lorg/chromium/base/ApplicationStatusManager;->init(Landroid/app/Application;)V

    .line 18
    return-void
.end method
