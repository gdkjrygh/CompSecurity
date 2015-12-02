.class public Lcom/android/volley/h;
.super Ljava/lang/Thread;
.source "360Security"


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

.field protected final b:Lcom/android/volley/g;

.field protected final c:Lcom/android/volley/a;

.field protected final d:Lcom/android/volley/l;

.field protected volatile e:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/g;Lcom/android/volley/a;Lcom/android/volley/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;",
            "Lcom/android/volley/g;",
            "Lcom/android/volley/a;",
            "Lcom/android/volley/l;",
            ")V"
        }
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/android/volley/h;->e:Z

    .line 59
    iput-object p1, p0, Lcom/android/volley/h;->a:Ljava/util/concurrent/BlockingQueue;

    .line 60
    iput-object p2, p0, Lcom/android/volley/h;->b:Lcom/android/volley/g;

    .line 61
    iput-object p3, p0, Lcom/android/volley/h;->c:Lcom/android/volley/a;

    .line 62
    iput-object p4, p0, Lcom/android/volley/h;->d:Lcom/android/volley/l;

    .line 63
    return-void
.end method

.method private a(Lcom/android/volley/Request;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 78
    invoke-virtual {p1}, Lcom/android/volley/Request;->c()I

    move-result v0

    invoke-static {v0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 80
    :cond_0
    return-void
.end method

.method private a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;",
            "Lcom/android/volley/VolleyError;",
            ")V"
        }
    .end annotation

    .prologue
    .line 145
    invoke-virtual {p1, p2}, Lcom/android/volley/Request;->a(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;

    move-result-object v0

    .line 146
    iget-object v1, p0, Lcom/android/volley/h;->d:Lcom/android/volley/l;

    invoke-interface {v1, p1, v0}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V

    .line 147
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/android/volley/h;->e:Z

    .line 71
    invoke-virtual {p0}, Lcom/android/volley/h;->interrupt()V

    .line 72
    return-void
.end method

.method public run()V
    .locals 6

    .prologue
    .line 84
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 89
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/h;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/Request;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 99
    :try_start_1
    const-string/jumbo v1, "network-queue-take"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0}, Lcom/android/volley/Request;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 104
    const-string/jumbo v1, "network-discard-cancelled"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/android/volley/VolleyError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 135
    :catch_0
    move-exception v1

    .line 136
    invoke-direct {p0, v0, v1}, Lcom/android/volley/h;->a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V

    goto :goto_0

    .line 90
    :catch_1
    move-exception v0

    .line 92
    iget-boolean v0, p0, Lcom/android/volley/h;->e:Z

    if-eqz v0, :cond_0

    .line 93
    return-void

    .line 108
    :cond_1
    :try_start_2
    invoke-direct {p0, v0}, Lcom/android/volley/h;->a(Lcom/android/volley/Request;)V

    .line 111
    iget-object v1, p0, Lcom/android/volley/h;->b:Lcom/android/volley/g;

    invoke-interface {v1, v0}, Lcom/android/volley/g;->a(Lcom/android/volley/Request;)Lcom/android/volley/i;

    move-result-object v1

    .line 112
    const-string/jumbo v2, "network-http-complete"

    invoke-virtual {v0, v2}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 116
    iget-boolean v2, v1, Lcom/android/volley/i;->d:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/android/volley/Request;->w()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 117
    const-string/jumbo v1, "not-modified"

    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/android/volley/VolleyError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    .line 137
    :catch_2
    move-exception v1

    .line 138
    const-string/jumbo v2, "Unhandled exception %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/android/volley/n;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v2, p0, Lcom/android/volley/h;->d:Lcom/android/volley/l;

    new-instance v3, Lcom/android/volley/VolleyError;

    invoke-direct {v3, v1}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v2, v0, v3}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V

    goto :goto_0

    .line 122
    :cond_2
    :try_start_3
    invoke-virtual {v0, v1}, Lcom/android/volley/Request;->a(Lcom/android/volley/i;)Lcom/android/volley/k;

    move-result-object v1

    .line 123
    const-string/jumbo v2, "network-parse-complete"

    invoke-virtual {v0, v2}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 127
    invoke-virtual {v0}, Lcom/android/volley/Request;->r()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/android/volley/k;->b:Lcom/android/volley/a$a;

    if-eqz v2, :cond_3

    .line 128
    iget-object v2, p0, Lcom/android/volley/h;->c:Lcom/android/volley/a;

    invoke-virtual {v0}, Lcom/android/volley/Request;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lcom/android/volley/k;->b:Lcom/android/volley/a$a;

    invoke-interface {v2, v3, v4}, Lcom/android/volley/a;->a(Ljava/lang/String;Lcom/android/volley/a$a;)V

    .line 129
    const-string/jumbo v2, "network-cache-written"

    invoke-virtual {v0, v2}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 133
    :cond_3
    invoke-virtual {v0}, Lcom/android/volley/Request;->v()V

    .line 134
    iget-object v2, p0, Lcom/android/volley/h;->d:Lcom/android/volley/l;

    invoke-interface {v2, v0, v1}, Lcom/android/volley/l;->a(Lcom/android/volley/Request;Lcom/android/volley/k;)V
    :try_end_3
    .catch Lcom/android/volley/VolleyError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_0
.end method
