.class public final Lcrittercism/android/ay;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private a:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final b:Lcrittercism/android/az;


# direct methods
.method public constructor <init>(Lcrittercism/android/az;Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcrittercism/android/ay;->b:Lcrittercism/android/az;

    .line 14
    iput-object p2, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 15
    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8
    .param p2, "exception"    # Ljava/lang/Throwable;

    .prologue
    .line 24
    :try_start_0
    iget-object v6, p0, Lcrittercism/android/ay;->b:Lcrittercism/android/az;

    iget-object v0, v6, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    if-nez v0, :cond_2

    const-string v0, "Crittercism"

    const-string v1, "Unable to handle application crash. Crittercism not yet initialized"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :cond_0
    :goto_0
    iget-object v0, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    instance-of v0, v0, Lcrittercism/android/ay;

    if-nez v0, :cond_1

    .line 31
    iget-object v0, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 34
    :cond_1
    :goto_1
    return-void

    .line 24
    :cond_2
    :try_start_1
    iget-object v0, v6, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v0}, Lcrittercism/android/dg;->b()V

    iget-object v0, v6, Lcrittercism/android/az;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcrittercism/android/dq;->a(Landroid/content/Context;Z)V

    iget-object v0, v6, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, v6, Lcrittercism/android/az;->u:Z

    if-eqz v0, :cond_4

    new-instance v0, Lcrittercism/android/bk;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-direct {v0, p2, v1, v2}, Lcrittercism/android/bk;-><init>(Ljava/lang/Throwable;J)V

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v0}, Lcrittercism/android/bk;->b()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    new-instance v1, Lcrittercism/android/cu;

    invoke-direct {v1, v6}, Lcrittercism/android/cu;-><init>(Lcrittercism/android/au;)V

    sget-object v2, Lcrittercism/android/bq;->e:Lcrittercism/android/bq;

    invoke-virtual {v2}, Lcrittercism/android/bq;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcrittercism/android/cu;->a(Ljava/lang/String;Lorg/json/JSONArray;)Lcrittercism/android/cu;

    move-result-object v0

    new-instance v1, Lcrittercism/android/dj;

    new-instance v2, Lcrittercism/android/dc;

    new-instance v3, Lcrittercism/android/db;

    iget-object v4, v6, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v4}, Lcrittercism/android/bb;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/android_v2/handle_crashes"

    invoke-direct {v3, v4, v5}, Lcrittercism/android/db;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcrittercism/android/db;->a()Ljava/net/URL;

    move-result-object v3

    invoke-direct {v2, v3}, Lcrittercism/android/dc;-><init>(Ljava/net/URL;)V

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lcrittercism/android/dj;-><init>(Lcrittercism/android/cw;Lcrittercism/android/dc;Lcrittercism/android/cy;)V

    invoke-virtual {v1}, Lcrittercism/android/dj;->run()V
    :try_end_1
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 30
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    instance-of v1, v1, Lcrittercism/android/ay;

    if-nez v1, :cond_3

    .line 31
    iget-object v1, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-interface {v1, v2, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_3
    throw v0

    .line 24
    :cond_4
    :try_start_3
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    instance-of v1, p2, Lcrittercism/android/cp;

    if-nez v1, :cond_5

    invoke-static {v6}, Lcrittercism/android/bg;->b(Lcrittercism/android/az;)Ljava/util/List;

    move-result-object v0

    :cond_5
    new-instance v1, Lcrittercism/android/bk;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-direct {v1, p2, v2, v3}, Lcrittercism/android/bk;-><init>(Ljava/lang/Throwable;J)V

    const-string v2, "crashed_session"

    iget-object v3, v6, Lcrittercism/android/az;->k:Lcrittercism/android/br;

    invoke-virtual {v1, v2, v3}, Lcrittercism/android/bk;->a(Ljava/lang/String;Lcrittercism/android/br;)V

    iget-object v2, v6, Lcrittercism/android/az;->l:Lcrittercism/android/br;

    invoke-virtual {v2}, Lcrittercism/android/br;->b()I

    move-result v2

    if-lez v2, :cond_6

    const-string v2, "previous_session"

    iget-object v3, v6, Lcrittercism/android/az;->l:Lcrittercism/android/br;

    invoke-virtual {v1, v2, v3}, Lcrittercism/android/bk;->a(Ljava/lang/String;Lcrittercism/android/br;)V

    :cond_6
    iget-object v2, v6, Lcrittercism/android/az;->m:Lcrittercism/android/br;

    invoke-virtual {v1, v2}, Lcrittercism/android/bk;->a(Lcrittercism/android/br;)V

    iget-object v2, v6, Lcrittercism/android/az;->n:Lcrittercism/android/br;

    new-instance v3, Lcrittercism/android/bn;

    invoke-direct {v3, v2}, Lcrittercism/android/bn;-><init>(Lcrittercism/android/br;)V

    iget-object v2, v3, Lcrittercism/android/bn;->a:Lorg/json/JSONArray;

    iput-object v2, v1, Lcrittercism/android/bk;->a:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lcrittercism/android/bk;->a()V

    invoke-virtual {v1, v0}, Lcrittercism/android/bk;->a(Ljava/util/List;)V

    iget-object v0, v6, Lcrittercism/android/az;->j:Lcrittercism/android/br;

    invoke-virtual {v0, v1}, Lcrittercism/android/br;->a(Lcrittercism/android/cg;)Z

    new-instance v0, Lcrittercism/android/df;

    iget-object v1, v6, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcrittercism/android/df;-><init>(Landroid/content/Context;)V

    iget-object v1, v6, Lcrittercism/android/az;->g:Lcrittercism/android/br;

    new-instance v2, Lcrittercism/android/da$a;

    invoke-direct {v2}, Lcrittercism/android/da$a;-><init>()V

    iget-object v3, v6, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v3}, Lcrittercism/android/bb;->e()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/v0/appload/"

    const/4 v5, 0x0

    new-instance v7, Lcrittercism/android/cs$b;

    invoke-direct {v7}, Lcrittercism/android/cs$b;-><init>()V

    invoke-virtual/range {v0 .. v7}, Lcrittercism/android/df;->a(Lcrittercism/android/br;Lcrittercism/android/cz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrittercism/android/au;Lcrittercism/android/cx;)V

    iget-object v1, v6, Lcrittercism/android/az;->h:Lcrittercism/android/br;

    new-instance v2, Lcrittercism/android/da$a;

    invoke-direct {v2}, Lcrittercism/android/da$a;-><init>()V

    iget-object v3, v6, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v3}, Lcrittercism/android/bb;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/android_v2/handle_exceptions"

    const/4 v5, 0x0

    new-instance v7, Lcrittercism/android/cu$a;

    invoke-direct {v7}, Lcrittercism/android/cu$a;-><init>()V

    invoke-virtual/range {v0 .. v7}, Lcrittercism/android/df;->a(Lcrittercism/android/br;Lcrittercism/android/cz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrittercism/android/au;Lcrittercism/android/cx;)V

    iget-object v1, v6, Lcrittercism/android/az;->i:Lcrittercism/android/br;

    new-instance v2, Lcrittercism/android/da$a;

    invoke-direct {v2}, Lcrittercism/android/da$a;-><init>()V

    iget-object v3, v6, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v3}, Lcrittercism/android/bb;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/android_v2/handle_ndk_crashes"

    const/4 v5, 0x0

    new-instance v7, Lcrittercism/android/cu$a;

    invoke-direct {v7}, Lcrittercism/android/cu$a;-><init>()V

    invoke-virtual/range {v0 .. v7}, Lcrittercism/android/df;->a(Lcrittercism/android/br;Lcrittercism/android/cz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrittercism/android/au;Lcrittercism/android/cx;)V

    iget-object v1, v6, Lcrittercism/android/az;->j:Lcrittercism/android/br;

    new-instance v2, Lcrittercism/android/da$a;

    invoke-direct {v2}, Lcrittercism/android/da$a;-><init>()V

    iget-object v3, v6, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v3}, Lcrittercism/android/bb;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/android_v2/handle_crashes"

    const/4 v5, 0x0

    new-instance v7, Lcrittercism/android/cu$a;

    invoke-direct {v7}, Lcrittercism/android/cu$a;-><init>()V

    invoke-virtual/range {v0 .. v7}, Lcrittercism/android/df;->a(Lcrittercism/android/br;Lcrittercism/android/cz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrittercism/android/au;Lcrittercism/android/cx;)V
    :try_end_3
    .catch Ljava/lang/ThreadDeath; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v0}, Lcrittercism/android/df;->a()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/ThreadDeath; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "InterruptedException in logCrashException: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    invoke-static {}, Lcrittercism/android/dx;->c()V
    :try_end_5
    .catch Ljava/lang/ThreadDeath; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    .line 27
    :catch_2
    move-exception v0

    .line 28
    :try_start_6
    const-string v1, "Crittercism"

    const-string v2, "Unable to send crash"

    invoke-static {v1, v2, v0}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 30
    iget-object v0, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    instance-of v0, v0, Lcrittercism/android/ay;

    if-nez v0, :cond_1

    .line 31
    iget-object v0, p0, Lcrittercism/android/ay;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    .line 24
    :catch_3
    move-exception v0

    :try_start_7
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected throwable in logCrashException: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    invoke-static {}, Lcrittercism/android/dx;->c()V
    :try_end_7
    .catch Ljava/lang/ThreadDeath; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_0
.end method
