.class final Lkik/android/chat/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/b/a/a$d;

.field final synthetic b:Lkik/android/chat/ad;


# direct methods
.method constructor <init>(Lkik/android/chat/ad;Lkik/a/b/a/a$d;)V
    .locals 0

    .prologue
    .line 343
    iput-object p1, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iput-object p2, p0, Lkik/android/chat/ae;->a:Lkik/a/b/a/a$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    .line 347
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 348
    const-string v0, "ct"

    iget-object v1, p0, Lkik/android/chat/ae;->a:Lkik/a/b/a/a$d;

    iget-wide v2, v1, Lkik/a/b/a/a$d;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    const-string v0, "qt"

    iget-object v1, p0, Lkik/android/chat/ae;->a:Lkik/a/b/a/a$d;

    iget-wide v2, v1, Lkik/a/b/a/a$d;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    const-string v0, "bt"

    iget-object v1, p0, Lkik/android/chat/ae;->a:Lkik/a/b/a/a$d;

    iget-wide v2, v1, Lkik/a/b/a/a$d;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    const-string v2, "s"

    iget-object v0, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iget-object v0, v0, Lkik/android/chat/ad;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(Lkik/android/chat/KikApplication;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x2

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 354
    iget-object v0, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iget-object v0, v0, Lkik/android/chat/ad;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(Lkik/android/chat/KikApplication;)Z

    .line 356
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 357
    invoke-static {}, Lkik/a/h/j;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 359
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v1, v6, v8

    if-nez v1, :cond_0

    .line 360
    const-string v1, "ctime"

    const-string v2, "true"

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    :cond_0
    iget-object v1, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iget-object v1, v1, Lkik/android/chat/ad;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v1}, Lkik/android/chat/KikApplication;->k()V

    .line 365
    iget-object v1, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iget-object v1, v1, Lkik/android/chat/ad;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/chat/KikApplication;->c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->l:Lcom/kik/d/b/a$k;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 366
    invoke-static {}, Lkik/android/util/DeviceUtils;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 367
    iget-object v0, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iget-object v0, v0, Lkik/android/chat/ad;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->h(Lkik/android/chat/KikApplication;)Lkik/a/e/f;

    move-result-object v0

    new-instance v1, Lkik/a/f/f/e;

    iget-object v2, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iget-object v2, v2, Lkik/android/chat/ad;->a:Lkik/android/chat/KikApplication;

    iget-object v3, p0, Lkik/android/chat/ae;->b:Lkik/android/chat/ad;

    iget-object v3, v3, Lkik/android/chat/ad;->a:Lkik/android/chat/KikApplication;

    invoke-static {v3}, Lkik/android/chat/KikApplication;->g(Lkik/android/chat/KikApplication;)Lkik/a/f/k;

    move-result-object v3

    invoke-interface {v3}, Lkik/a/f/k;->j()I

    move-result v3

    iget-object v4, p0, Lkik/android/chat/ae;->a:Lkik/a/b/a/a$d;

    iget-object v4, v4, Lkik/a/b/a/a$d;->a:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lkik/android/util/DeviceUtils;->a(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/a/f/f/e;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 369
    :cond_1
    return-void

    .line 351
    :cond_2
    const-wide/16 v0, 0x0

    goto/16 :goto_0
.end method
