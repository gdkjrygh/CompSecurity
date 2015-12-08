.class final Lkik/android/net/communicator/a$a;
.super Lkik/android/net/communicator/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/net/communicator/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/net/communicator/a;


# direct methods
.method private constructor <init>(Lkik/android/net/communicator/a;)V
    .locals 0

    .prologue
    .line 493
    iput-object p1, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-direct {p0}, Lkik/android/net/communicator/j;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lkik/android/net/communicator/a;B)V
    .locals 0

    .prologue
    .line 493
    invoke-direct {p0, p1}, Lkik/android/net/communicator/a$a;-><init>(Lkik/android/net/communicator/a;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 4

    .prologue
    .line 564
    :try_start_0
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/net/communicator/a;->a(Lkik/android/net/communicator/a;Ljava/lang/String;)Ljava/lang/String;

    .line 565
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->r(Lkik/android/net/communicator/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    new-instance v1, Lkik/android/net/communicator/a$e;

    iget-object v2, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lkik/android/net/communicator/a$e;-><init>(Lkik/android/net/communicator/a;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 569
    :goto_0
    return-void

    .line 568
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected final a(Lkik/a/f/n;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 500
    const-string v0, "pong"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 501
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->x(Lkik/android/net/communicator/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 502
    :try_start_0
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->y(Lkik/android/net/communicator/a;)Lkik/android/net/communicator/a$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 503
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->y(Lkik/android/net/communicator/a;)Lkik/android/net/communicator/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/net/communicator/a$c;->b()V

    .line 504
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->D(Lkik/android/net/communicator/a;)Lkik/android/net/communicator/a$c;

    .line 506
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 508
    invoke-virtual {p1}, Lkik/a/f/n;->skipSubTree()V

    .line 558
    :cond_1
    :goto_0
    return-void

    .line 506
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 510
    :cond_2
    const-string v0, "ack"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 511
    const-string v0, "id"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 512
    iget-object v1, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v1}, Lkik/android/net/communicator/a;->w(Lkik/android/net/communicator/a;)Lkik/a/f/b/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/a/f/b/a;->b(Ljava/lang/String;)V

    .line 513
    invoke-virtual {p1}, Lkik/a/f/n;->skipSubTree()V

    goto :goto_0

    .line 515
    :cond_3
    const-string v0, "hold"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 516
    const-string v0, "stanza"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 517
    iget-object v1, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v1}, Lkik/android/net/communicator/a;->w(Lkik/android/net/communicator/a;)Lkik/a/f/b/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/a/f/b/a;->c(Ljava/lang/String;)V

    .line 518
    invoke-virtual {p1}, Lkik/a/f/n;->skipSubTree()V

    goto :goto_0

    .line 520
    :cond_4
    const-string v0, "stc"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 521
    invoke-static {p1}, Lkik/a/f/a/c;->a(Lkik/a/f/n;)Lkik/a/f/a/g;

    move-result-object v0

    .line 522
    iget-object v1, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v1}, Lkik/android/net/communicator/a;->z(Lkik/android/net/communicator/a;)Lkik/a/f/a/c;

    move-result-object v1

    new-instance v2, Lkik/android/net/communicator/b;

    invoke-direct {v2, p0, v0}, Lkik/android/net/communicator/b;-><init>(Lkik/android/net/communicator/a$a;Lkik/a/f/a/g;)V

    invoke-virtual {v1, v0, v2}, Lkik/a/f/a/c;->a(Lkik/a/f/a/g;Ljava/lang/Runnable;)V

    goto :goto_0

    .line 530
    :cond_5
    const-string v0, "iq"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 531
    const-string v0, "id"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 532
    iget-object v1, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v1}, Lkik/android/net/communicator/a;->w(Lkik/android/net/communicator/a;)Lkik/a/f/b/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/a/f/b/a;->d(Ljava/lang/String;)Lkik/a/f/f/y;

    move-result-object v0

    .line 533
    if-eqz v0, :cond_6

    .line 534
    invoke-virtual {v0, p1}, Lkik/a/f/f/y;->c(Lkik/a/f/n;)V

    goto :goto_0

    .line 537
    :cond_6
    invoke-virtual {p1}, Lkik/a/f/n;->skipSubTree()V

    goto :goto_0

    .line 542
    :cond_7
    invoke-virtual {p1}, Lkik/a/f/n;->getName()Ljava/lang/String;

    .line 545
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->F(Lkik/android/net/communicator/a;)Lkik/a/e/o;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/o;->b()Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPair;

    .line 547
    iget-object v1, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v1}, Lkik/android/net/communicator/a;->F(Lkik/android/net/communicator/a;)Lkik/a/e/o;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkik/a/f/c/e;->a(Lkik/a/f/n;Ljava/security/KeyPair;Lkik/a/e/o;)Lkik/a/f/c/c;

    move-result-object v1

    .line 548
    if-eqz v1, :cond_8

    .line 549
    iget-object v0, p0, Lkik/android/net/communicator/a$a;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->G(Lkik/android/net/communicator/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/i;

    .line 550
    invoke-interface {v0, v1}, Lkik/a/f/i;->a(Lkik/a/f/c/g;)V

    goto :goto_1

    .line 554
    :cond_8
    invoke-virtual {p1}, Lkik/a/f/n;->skipSubTree()V

    goto/16 :goto_0
.end method
