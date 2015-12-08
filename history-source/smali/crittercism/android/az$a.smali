.class final Lcrittercism/android/az$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcrittercism/android/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 248
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcrittercism/android/az$a;->a:Z

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 247
    invoke-direct {p0}, Lcrittercism/android/az$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final queueIdle()Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 251
    monitor-enter p0

    .line 252
    :try_start_0
    iget-boolean v0, p0, Lcrittercism/android/az$a;->a:Z

    if-nez v0, :cond_0

    .line 253
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcrittercism/android/az$a;->a:Z

    .line 254
    invoke-static {}, Lcrittercism/android/bg;->g()V

    .line 256
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    return v1

    .line 256
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
