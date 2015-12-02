.class public Lcom/b/a/a/a/ad;
.super Lcom/b/a/a/a;
.source "VmLax.java"


# static fields
.field private static final TARGET_VERSION:I = 0x9


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/b/a/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getMinimumApiLevel()I
    .locals 1

    .prologue
    .line 20
    const/16 v0, 0x9

    return v0
.end method

.method protected onUpdateVmPolicy(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 26
    sget-object v0, Landroid/os/StrictMode$VmPolicy;->LAX:Landroid/os/StrictMode$VmPolicy;

    return-object v0
.end method
