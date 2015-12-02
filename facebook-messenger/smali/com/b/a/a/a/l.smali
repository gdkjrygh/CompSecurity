.class public Lcom/b/a/a/a/l;
.super Lcom/b/a/a/a;
.source "ThreadLax.java"


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

.method protected onUpdateThreadPolicy(Landroid/os/StrictMode$ThreadPolicy$Builder;)Landroid/os/StrictMode$ThreadPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 28
    sget-object v0, Landroid/os/StrictMode$ThreadPolicy;->LAX:Landroid/os/StrictMode$ThreadPolicy;

    return-object v0
.end method
