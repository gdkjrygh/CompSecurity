.class public final Lcom/android/volley/c;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field private static final a:Z


# instance fields
.field private final b:Ljava/util/concurrent/BlockingQueue;

.field private final c:Ljava/util/concurrent/BlockingQueue;

.field private final d:Lcom/android/volley/b;

.field private final e:Lcom/android/volley/s;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    sget-boolean v0, Lcom/android/volley/x;->b:Z

    sput-boolean v0, Lcom/android/volley/c;->a:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/b;Lcom/android/volley/s;)V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/volley/c;->f:Z

    .line 64
    iput-object p1, p0, Lcom/android/volley/c;->b:Ljava/util/concurrent/BlockingQueue;

    .line 65
    iput-object p2, p0, Lcom/android/volley/c;->c:Ljava/util/concurrent/BlockingQueue;

    .line 66
    iput-object p3, p0, Lcom/android/volley/c;->d:Lcom/android/volley/b;

    .line 67
    iput-object p4, p0, Lcom/android/volley/c;->e:Lcom/android/volley/s;

    .line 68
    return-void
.end method

.method static synthetic a(Lcom/android/volley/c;)Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/android/volley/c;->c:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/android/volley/c;->f:Z

    .line 77
    invoke-virtual {p0}, Lcom/android/volley/c;->interrupt()V

    .line 78
    return-void
.end method

.method public final run()V
    .locals 5

    .prologue
    .line 83
    sget-boolean v0, Lcom/android/volley/c;->a:Z

    if-eqz v0, :cond_0

    .line 84
    const-string v0, "start new dispatcher"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/android/volley/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 88
    iget-object v0, p0, Lcom/android/volley/c;->d:Lcom/android/volley/b;

    invoke-interface {v0}, Lcom/android/volley/b;->a()V

    .line 94
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/c;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/n;

    .line 95
    const-string v1, "cache-queue-take"

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v0}, Lcom/android/volley/n;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 99
    const-string v1, "cache-discard-canceled"

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 159
    :catch_0
    move-exception v0

    iget-boolean v0, p0, Lcom/android/volley/c;->f:Z

    if-eqz v0, :cond_1

    .line 160
    return-void

    .line 104
    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/android/volley/c;->d:Lcom/android/volley/b;

    invoke-virtual {v0}, Lcom/android/volley/n;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/android/volley/b;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v1

    .line 105
    if-nez v1, :cond_3

    .line 106
    const-string v1, "cache-miss"

    invoke-virtual {v0, v1}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 108
    iget-object v1, p0, Lcom/android/volley/c;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0

    .line 113
    :cond_3
    invoke-virtual {v1}, Lcom/android/volley/b$a;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 114
    const-string v2, "cache-hit-expired"

    invoke-virtual {v0, v2}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v0, v1}, Lcom/android/volley/n;->a(Lcom/android/volley/b$a;)V

    .line 116
    iget-object v1, p0, Lcom/android/volley/c;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0

    .line 121
    :cond_4
    const-string v2, "cache-hit"

    invoke-virtual {v0, v2}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 122
    new-instance v2, Lcom/android/volley/k;

    iget-object v3, v1, Lcom/android/volley/b$a;->a:[B

    iget-object v4, v1, Lcom/android/volley/b$a;->f:Ljava/util/Map;

    invoke-direct {v2, v3, v4}, Lcom/android/volley/k;-><init>([BLjava/util/Map;)V

    invoke-virtual {v0, v2}, Lcom/android/volley/n;->a(Lcom/android/volley/k;)Lcom/android/volley/r;

    move-result-object v2

    .line 124
    const-string v3, "cache-hit-parsed"

    invoke-virtual {v0, v3}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v1}, Lcom/android/volley/b$a;->b()Z

    move-result v3

    if-nez v3, :cond_5

    .line 128
    iget-object v1, p0, Lcom/android/volley/c;->e:Lcom/android/volley/s;

    invoke-interface {v1, v0, v2}, Lcom/android/volley/s;->a(Lcom/android/volley/n;Lcom/android/volley/r;)V

    goto :goto_0

    .line 134
    :cond_5
    const-string v3, "cache-hit-refresh-needed"

    invoke-virtual {v0, v3}, Lcom/android/volley/n;->a(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v0, v1}, Lcom/android/volley/n;->a(Lcom/android/volley/b$a;)V

    .line 138
    const/4 v1, 0x1

    iput-boolean v1, v2, Lcom/android/volley/r;->d:Z

    .line 142
    iget-object v1, p0, Lcom/android/volley/c;->e:Lcom/android/volley/s;

    new-instance v3, Lcom/android/volley/d;

    invoke-direct {v3, p0, v0}, Lcom/android/volley/d;-><init>(Lcom/android/volley/c;Lcom/android/volley/n;)V

    invoke-interface {v1, v0, v2, v3}, Lcom/android/volley/s;->a(Lcom/android/volley/n;Lcom/android/volley/r;Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method
