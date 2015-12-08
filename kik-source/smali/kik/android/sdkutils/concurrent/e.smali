.class public abstract Lkik/android/sdkutils/concurrent/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field protected a:Lcom/kik/g/p;

.field protected b:Ljava/lang/Object;

.field protected c:Z

.field private d:Ljava/util/concurrent/ScheduledExecutorService;

.field private e:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lkik/android/sdkutils/concurrent/e;->b:Ljava/lang/Object;

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/sdkutils/concurrent/e;->c:Z

    .line 31
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/android/sdkutils/concurrent/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    return-void
.end method


# virtual methods
.method public abstract a()Lcom/kik/g/p;
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lkik/android/sdkutils/concurrent/e;->b:Ljava/lang/Object;

    .line 90
    return-void
.end method

.method public final b()Lcom/kik/g/p;
    .locals 6

    .prologue
    .line 36
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 37
    invoke-virtual {p0}, Lkik/android/sdkutils/concurrent/e;->c()V

    .line 39
    iget-object v1, p0, Lkik/android/sdkutils/concurrent/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lkik/android/sdkutils/concurrent/f;

    invoke-direct {v2, p0, v0}, Lkik/android/sdkutils/concurrent/f;-><init>(Lkik/android/sdkutils/concurrent/e;Lcom/kik/g/p;)V

    const-wide/16 v4, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    iput-object v1, p0, Lkik/android/sdkutils/concurrent/e;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 69
    return-object v0
.end method

.method public final c()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 77
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/e;->e:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/e;->e:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 81
    :cond_0
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/e;->a:Lcom/kik/g/p;

    if-eqz v0, :cond_1

    .line 82
    iput-boolean v1, p0, Lkik/android/sdkutils/concurrent/e;->c:Z

    .line 83
    iget-object v0, p0, Lkik/android/sdkutils/concurrent/e;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 85
    :cond_1
    return-void
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p0}, Lkik/android/sdkutils/concurrent/e;->a()Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
