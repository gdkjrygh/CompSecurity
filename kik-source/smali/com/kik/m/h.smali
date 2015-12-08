.class public final Lcom/kik/m/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/m/h$b;,
        Lcom/kik/m/h$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/kik/m/h;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static a(Ljava/io/Closeable;)V
    .locals 1

    .prologue
    .line 100
    if-eqz p0, :cond_0

    .line 102
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lorg/apache/http/HttpEntity;)[B
    .locals 2

    .prologue
    .line 41
    new-instance v0, Lcom/kik/m/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kik/m/h$b;-><init>(B)V

    invoke-static {p0, v0}, Lcom/kik/m/h;->a(Lorg/apache/http/HttpEntity;Lcom/kik/m/h$a;)[B

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/apache/http/HttpEntity;Lcom/kik/m/h$a;)[B
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 46
    sget-object v0, Lcom/kik/m/h;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/kik/m/i;

    invoke-direct {v1, p0, p1}, Lcom/kik/m/i;-><init>(Lorg/apache/http/HttpEntity;Lcom/kik/m/h$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 83
    const-wide/16 v2, 0x2710

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2

    .line 95
    :goto_0
    return-object v0

    .line 86
    :catch_0
    move-exception v0

    invoke-interface {v1, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 95
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 89
    :catch_1
    move-exception v0

    invoke-interface {v1, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1

    .line 92
    :catch_2
    move-exception v0

    invoke-interface {v1, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1
.end method
