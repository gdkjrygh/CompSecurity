.class public Lcom/b/a/a/a/n;
.super Lcom/b/a/a/a;
.source "ThreadPenaltyDeathOnNetwork.java"


# static fields
.field private static final TARGET_VERSION:I = 0xb


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/b/a/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getMinimumApiLevel()I
    .locals 1

    .prologue
    .line 21
    const/16 v0, 0xb

    return v0
.end method

.method protected onUpdateThreadPolicy(Landroid/os/StrictMode$ThreadPolicy$Builder;)Landroid/os/StrictMode$ThreadPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 27
    invoke-virtual {p1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeathOnNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 28
    invoke-virtual {p1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method
