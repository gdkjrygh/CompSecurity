.class public Lcom/b/a/a/a/af;
.super Lcom/b/a/a/a;
.source "VmPenaltyDropBox.java"


# static fields
.field private static final TARGET_VERSION:I = 0x9


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/b/a/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getMinimumApiLevel()I
    .locals 1

    .prologue
    .line 22
    const/16 v0, 0x9

    return v0
.end method

.method protected onUpdateVmPolicy(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 28
    invoke-virtual {p1}, Landroid/os/StrictMode$VmPolicy$Builder;->penaltyDropBox()Landroid/os/StrictMode$VmPolicy$Builder;

    .line 29
    invoke-virtual {p1}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    return-object v0
.end method
