.class public Lcom/b/a/a/a/ai;
.super Lcom/b/a/a/a;
.source "VmSnapshot.java"


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static final TARGET_VERSION:I = 0x9


# instance fields
.field private mPolicy:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/b/a/a/a/ai;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/b/a/a/a/ai;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/b/a/a/a;-><init>()V

    .line 25
    :try_start_0
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a/ai;->mPolicy:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :goto_0
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    sget-object v1, Lcom/b/a/a/a/ai;->TAG:Ljava/lang/String;

    const-string v2, "Unable to retrieve current vm policy."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method


# virtual methods
.method protected getMinimumApiLevel()I
    .locals 1

    .prologue
    .line 33
    const/16 v0, 0x9

    return v0
.end method

.method protected onUpdateVmPolicy(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 39
    iget-object v0, p0, Lcom/b/a/a/a/ai;->mPolicy:Ljava/lang/Object;

    check-cast v0, Landroid/os/StrictMode$VmPolicy;

    .line 40
    invoke-virtual {p0, v0}, Lcom/b/a/a/a/ai;->createVmBuilder(Landroid/os/StrictMode$VmPolicy;)Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    return-object v0
.end method

.method protected shouldRestoreVmPenaltyLog()Z
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/b/a/a/a/ai;->mPolicy:Ljava/lang/Object;

    check-cast v0, Landroid/os/StrictMode$VmPolicy;

    invoke-virtual {p0, v0}, Lcom/b/a/a/a/ai;->isPenaltyLogSet(Landroid/os/StrictMode$VmPolicy;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
