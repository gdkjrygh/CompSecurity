.class public final Lcom/kik/a/a/a$a$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/a/a/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/a/a/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 429
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 528
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->a:Ljava/lang/Object;

    .line 618
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->b:Ljava/lang/Object;

    .line 708
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->c:Ljava/lang/Object;

    .line 430
    invoke-static {}, Lcom/kik/a/a/a$a;->l()Z

    .line 431
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 412
    invoke-direct {p0}, Lcom/kik/a/a/a$a$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 435
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 528
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->a:Ljava/lang/Object;

    .line 618
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->b:Ljava/lang/Object;

    .line 708
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->c:Ljava/lang/Object;

    .line 436
    invoke-static {}, Lcom/kik/a/a/a$a;->l()Z

    .line 437
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 412
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$a$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/a/a/a$a$a;
    .locals 1

    .prologue
    .line 480
    instance-of v0, p1, Lcom/kik/a/a/a$a;

    if-eqz v0, :cond_0

    .line 481
    check-cast p1, Lcom/kik/a/a/a$a;

    invoke-virtual {p0, p1}, Lcom/kik/a/a/a$a$a;->a(Lcom/kik/a/a/a$a;)Lcom/kik/a/a/a$a$a;

    move-result-object p0

    .line 484
    :goto_0
    return-object p0

    .line 483
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$a$a;
    .locals 4

    .prologue
    .line 514
    const/4 v2, 0x0

    .line 516
    :try_start_0
    sget-object v0, Lcom/kik/a/a/a$a;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 521
    if-eqz v0, :cond_0

    .line 522
    invoke-virtual {p0, v0}, Lcom/kik/a/a/a$a$a;->a(Lcom/kik/a/a/a$a;)Lcom/kik/a/a/a$a$a;

    .line 525
    :cond_0
    return-object p0

    .line 517
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 518
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 519
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 521
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 522
    invoke-virtual {p0, v1}, Lcom/kik/a/a/a$a$a;->a(Lcom/kik/a/a/a$a;)Lcom/kik/a/a/a$a$a;

    :cond_1
    throw v0

    .line 521
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()Lcom/kik/a/a/a$a;
    .locals 2

    .prologue
    .line 463
    invoke-direct {p0}, Lcom/kik/a/a/a$a$a;->s()Lcom/kik/a/a/a$a;

    move-result-object v0

    .line 464
    invoke-virtual {v0}, Lcom/kik/a/a/a$a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 465
    invoke-static {v0}, Lcom/kik/a/a/a$a$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 467
    :cond_0
    return-object v0
.end method

.method private s()Lcom/kik/a/a/a$a;
    .locals 2

    .prologue
    .line 471
    new-instance v0, Lcom/kik/a/a/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/a/a/a$a;-><init>(Lcom/c/b/as$a;B)V

    .line 472
    iget-object v1, p0, Lcom/kik/a/a/a$a$a;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/kik/a/a/a$a;->a(Lcom/kik/a/a/a$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    iget-object v1, p0, Lcom/kik/a/a/a$a$a;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/kik/a/a/a$a;->b(Lcom/kik/a/a/a$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    iget-object v1, p0, Lcom/kik/a/a/a$a$a;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/kik/a/a/a$a;->c(Lcom/kik/a/a/a$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    invoke-virtual {p0}, Lcom/kik/a/a/a$a$a;->l()V

    .line 476
    return-object v0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$a$a;->d(Lcom/c/b/bd;)Lcom/kik/a/a/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Lcom/c/b/by;)Lcom/c/b/a$a;
    .locals 0

    .prologue
    .line 412
    return-object p0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/a/a/a$a;)Lcom/kik/a/a/a$a$a;
    .locals 1

    .prologue
    .line 489
    invoke-static {}, Lcom/kik/a/a/a$a;->k()Lcom/kik/a/a/a$a;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 503
    :goto_0
    return-object p0

    .line 490
    :cond_0
    invoke-virtual {p1}, Lcom/kik/a/a/a$a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 491
    invoke-static {p1}, Lcom/kik/a/a/a$a;->a(Lcom/kik/a/a/a$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->a:Ljava/lang/Object;

    .line 492
    invoke-virtual {p0}, Lcom/kik/a/a/a$a$a;->q()V

    .line 494
    :cond_1
    invoke-virtual {p1}, Lcom/kik/a/a/a$a;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 495
    invoke-static {p1}, Lcom/kik/a/a/a$a;->b(Lcom/kik/a/a/a$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->b:Ljava/lang/Object;

    .line 496
    invoke-virtual {p0}, Lcom/kik/a/a/a$a$a;->q()V

    .line 498
    :cond_2
    invoke-virtual {p1}, Lcom/kik/a/a/a$a;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 499
    invoke-static {p1}, Lcom/kik/a/a/a$a;->c(Lcom/kik/a/a/a$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$a$a;->c:Ljava/lang/Object;

    .line 500
    invoke-virtual {p0}, Lcom/kik/a/a/a$a$a;->q()V

    .line 502
    :cond_3
    invoke-virtual {p0}, Lcom/kik/a/a/a$a$a;->q()V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 507
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/c/b/by;)Lcom/c/b/bd$a;
    .locals 0

    .prologue
    .line 412
    return-object p0
.end method

.method public final bridge synthetic c(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 412
    return-object p0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$a$a;->d(Lcom/c/b/bd;)Lcom/kik/a/a/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 412
    return-object p0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 423
    invoke-static {}, Lcom/kik/a/a/a;->b()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/a/a/a$a;

    const-class v2, Lcom/kik/a/a/a$a$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 455
    invoke-static {}, Lcom/kik/a/a/a;->a()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0}, Lcom/kik/a/a/a$a$a;->s()Lcom/kik/a/a/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0}, Lcom/kik/a/a/a$a$a;->r()Lcom/kik/a/a/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 412
    invoke-direct {p0}, Lcom/kik/a/a/a$a$a;->r()Lcom/kik/a/a/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 412
    invoke-static {}, Lcom/kik/a/a/a$a;->k()Lcom/kik/a/a/a$a;

    move-result-object v0

    return-object v0
.end method
