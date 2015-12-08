.class final Lkik/android/chat/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Integer;

.field final synthetic b:Lkik/android/chat/af;


# direct methods
.method constructor <init>(Lkik/android/chat/af;Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 379
    iput-object p1, p0, Lkik/android/chat/ag;->b:Lkik/android/chat/af;

    iput-object p2, p0, Lkik/android/chat/ag;->a:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    .line 383
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 384
    invoke-static {}, Lkik/a/h/j;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 385
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    .line 386
    iget-object v1, p0, Lkik/android/chat/ag;->b:Lkik/android/chat/af;

    iget-object v1, v1, Lkik/android/chat/af;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/chat/KikApplication;->c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->n:Lcom/kik/d/b/a$k;

    const-string v3, "c"

    iget-object v4, p0, Lkik/android/chat/ag;->a:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-long v4, v4

    const-string v6, "ctime"

    const-string v7, "true"

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual/range {v1 .. v9}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V

    .line 394
    :goto_0
    iget-object v0, p0, Lkik/android/chat/ag;->b:Lkik/android/chat/af;

    iget-object v0, v0, Lkik/android/chat/af;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Chat List Size"

    iget-object v2, p0, Lkik/android/chat/ag;->b:Lkik/android/chat/af;

    iget-object v2, v2, Lkik/android/chat/af;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;)Lkik/a/e/i;

    move-result-object v2

    invoke-interface {v2}, Lkik/a/e/i;->A()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;I)Lcom/kik/android/a;

    .line 395
    iget-object v0, p0, Lkik/android/chat/ag;->b:Lkik/android/chat/af;

    iget-object v0, v0, Lkik/android/chat/af;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "New Chat List Size"

    iget-object v2, p0, Lkik/android/chat/ag;->b:Lkik/android/chat/af;

    iget-object v2, v2, Lkik/android/chat/af;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;)Lkik/a/e/i;

    move-result-object v2

    invoke-interface {v2}, Lkik/a/e/i;->B()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;I)Lcom/kik/android/a;

    .line 396
    return-void

    .line 390
    :cond_0
    iget-object v1, p0, Lkik/android/chat/ag;->b:Lkik/android/chat/af;

    iget-object v1, v1, Lkik/android/chat/af;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/chat/KikApplication;->c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->n:Lcom/kik/d/b/a$k;

    const-string v3, "c"

    iget-object v4, p0, Lkik/android/chat/ag;->a:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/lang/String;JJ)V

    goto :goto_0
.end method
