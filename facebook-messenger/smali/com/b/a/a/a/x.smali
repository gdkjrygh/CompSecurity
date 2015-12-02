.class public Lcom/b/a/a/a/x;
.super Lcom/b/a/a/a;
.source "ThreadSnapshot.java"


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static final TARGET_VERSION:I = 0x9


# instance fields
.field private mPolicy:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/b/a/a/a/x;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/b/a/a/a/x;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/b/a/a/a;-><init>()V

    .line 26
    :try_start_0
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a/x;->mPolicy:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    :goto_0
    return-void

    .line 27
    :catch_0
    move-exception v0

    .line 28
    sget-object v1, Lcom/b/a/a/a/x;->TAG:Ljava/lang/String;

    const-string v2, "Unable to retrieve current thread policy."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method


# virtual methods
.method protected getMinimumApiLevel()I
    .locals 1

    .prologue
    .line 34
    const/16 v0, 0x9

    return v0
.end method

.method protected onUpdateThreadPolicy(Landroid/os/StrictMode$ThreadPolicy$Builder;)Landroid/os/StrictMode$ThreadPolicy;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/b/a/a/a/x;->mPolicy:Ljava/lang/Object;

    check-cast v0, Landroid/os/StrictMode$ThreadPolicy;

    .line 41
    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v1, v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 42
    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    return-object v0
.end method

.method protected shouldRestoreThreadPenaltyLog()Z
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/b/a/a/a/x;->mPolicy:Ljava/lang/Object;

    check-cast v0, Landroid/os/StrictMode$ThreadPolicy;

    invoke-virtual {p0, v0}, Lcom/b/a/a/a/x;->isPenaltyLogSet(Landroid/os/StrictMode$ThreadPolicy;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
