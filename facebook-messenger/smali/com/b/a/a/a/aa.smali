.class public Lcom/b/a/a/a/aa;
.super Lcom/b/a/a/a;
.source "VmDetectLeakedClosableObjects.java"


# static fields
.field private static final TARGET_VERSION:I = 0xb


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
    const/16 v0, 0xb

    return v0
.end method

.method protected onUpdateVmPolicy(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 28
    invoke-virtual {p1}, Landroid/os/StrictMode$VmPolicy$Builder;->detectLeakedClosableObjects()Landroid/os/StrictMode$VmPolicy$Builder;

    .line 29
    invoke-virtual {p1}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    return-object v0
.end method
