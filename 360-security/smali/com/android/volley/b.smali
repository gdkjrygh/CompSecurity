.class public Lcom/android/volley/b;
.super Ljava/lang/Thread;
.source "360Security"


# static fields
.field private static final f:Z


# instance fields
.field protected final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field

.field protected final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field

.field protected final c:Lcom/android/volley/a;

.field protected final d:Lcom/android/volley/l;

.field protected volatile e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    sget-boolean v0, Lcom/android/volley/n;->b:Z

    sput-boolean v0, Lcom/android/volley/b;->f:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/a;Lcom/android/volley/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;",
            "Lcom/android/volley/a;",
            "Lcom/android/volley/l;",
            ")V"
        }
    .end annotation

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/volley/b;->e:Z

    .line 65
    iput-object p1, p0, Lcom/android/volley/b;->a:Ljava/util/concurrent/BlockingQueue;

    .line 66
    iput-object p2, p0, Lcom/android/volley/b;->b:Ljava/util/concurrent/BlockingQueue;

    .line 67
    iput-object p3, p0, Lcom/android/volley/b;->c:Lcom/android/volley/a;

    .line 68
    iput-object p4, p0, Lcom/android/volley/b;->d:Lcom/android/volley/l;

    .line 69
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/android/volley/b;->e:Z

    .line 77
    invoke-virtual {p0}, Lcom/android/volley/b;->interrupt()V

    .line 78
    return-void
.end method

.method public run()V
    .locals 5

    .prologue
    .line 82
    sget-boolean v0, Lcom/android/volley/b;->f:Z

    if-eqz v0, :cond_0

    .line 83
    const-string/jumbo v0, "start new dispatcher"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/android/volley/n;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 88
    iget-object v0, p0, Lcom/android/volley/b;->c:Lcom/android/volley/a;

    invoke-interface {v0}, Lcom/android/volley/a;->a()V

    .line 94
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/Request;

    .line 95
    const-string/jumbo v1, "cache-queue-take"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v0}, Lcom/android/volley/Request;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 99
    const-string/jumbo v1, "cache-discard-canceled"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 153
    :catch_0
    move-exception v0

    .line 155
    iget-boolean v0, p0, Lcom/android/volley/b;->e:Z

    if-eqz v0, :cond_1

    .line 156
    return-void

    .line 104
    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/android/volley/b;->c:Lcom/android/volley/a;

    invoke-virtual {v0}, Lcom/android/volley/Request;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/android/volley/a;->a(Ljava/lang/String;)Lcom/android/volley/a$a;

    move-result-object v1

    .line 105
    if-nez v1, :cond_3

    .line 106
    const-string/jumbo v1, "cache-miss"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 108
    iget-object v1, p0, Lcom/android/volley/b;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0

    .line 113
    :cond_3
    invoke-virtual {v1}, Lcom/android/volley/a$a;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 114
    const-string/jumbo v2, "cache-hit-expired"

    invoke-virtual {v0, v2}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Lcom/android/volley/a$a;)Lcom/android/volley/Request;

    .line 116
    iget-object v1, p0, Lcom/android/volley/b;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0

    .line 121
    :cond_4
    const-string/jumbo v2, "cache-hit"

    invoke-virtual {v0, v2}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 122
    new-instance v2, Lcom/android/volley/i;

    iget-object v3, v1, Lcom/android/volley/a$a;->a:[B

    .line 123
    iget-object v4, v1, Lcom/android/volley/a$a;->f:Ljava/util/Map;

    invoke-direct {v2, v3, v4}, Lcom/android/volley/i;-><init>([BLjava/util/Map;)V

    .line 122
    invoke-virtual {v0, v2}, Lcom/android/volley/Request;->a(Lcom/android/volley/i;)Lcom/android/volley/k;

    move-result-object v2

    .line 124
    const-string/jumbo v3, "cache-hit-parsed"

    invoke-virtual {v0, v3}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v1}, Lcom/android/volley/a$a;->b()Z

    move-result v3

    if-nez v3, :cond_5

    .line 128
    iget-object v1, p0, Lcom/android/volley/b;->d:Lcom/android/volley/l;

    invoke-interface {v1, v0, v2}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/k;)V

    goto :goto_0

    .line 133
    :cond_5
    const-string/jumbo v3, "cache-hit-refresh-needed"

    invoke-virtual {v0, v3}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Lcom/android/volley/a$a;)Lcom/android/volley/Request;

    .line 137
    const/4 v1, 0x1

    iput-boolean v1, v2, Lcom/android/volley/k;->d:Z

    .line 141
    iget-object v1, p0, Lcom/android/volley/b;->d:Lcom/android/volley/l;

    new-instance v3, Lcom/android/volley/b$1;

    invoke-direct {v3, p0, v0}, Lcom/android/volley/b$1;-><init>(Lcom/android/volley/b;Lcom/android/volley/Request;)V

    invoke-interface {v1, v0, v2, v3}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/k;Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method
