.class public final Lcom/c/b/i$y$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 11471
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 11565
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$y$a;->b:Ljava/lang/Object;

    .line 11472
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 11454
    invoke-direct {p0}, Lcom/c/b/i$y$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 11477
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 11565
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$y$a;->b:Ljava/lang/Object;

    .line 11478
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 11454
    invoke-direct {p0, p1}, Lcom/c/b/i$y$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$y$a;
    .locals 1

    .prologue
    .line 11522
    instance-of v0, p1, Lcom/c/b/i$y;

    if-eqz v0, :cond_0

    .line 11523
    check-cast p1, Lcom/c/b/i$y;

    invoke-virtual {p0, p1}, Lcom/c/b/i$y$a;->a(Lcom/c/b/i$y;)Lcom/c/b/i$y$a;

    move-result-object p0

    .line 11526
    :goto_0
    return-object p0

    .line 11525
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$y$a;
    .locals 4

    .prologue
    .line 11550
    const/4 v2, 0x0

    .line 11552
    :try_start_0
    sget-object v0, Lcom/c/b/i$y;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$y;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11557
    if-eqz v0, :cond_0

    .line 11558
    invoke-virtual {p0, v0}, Lcom/c/b/i$y$a;->a(Lcom/c/b/i$y;)Lcom/c/b/i$y$a;

    .line 11561
    :cond_0
    return-object p0

    .line 11553
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 11554
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$y;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11555
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 11557
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 11558
    invoke-virtual {p0, v1}, Lcom/c/b/i$y$a;->a(Lcom/c/b/i$y;)Lcom/c/b/i$y$a;

    .line 11557
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()Lcom/c/b/i$y;
    .locals 2

    .prologue
    .line 11501
    invoke-direct {p0}, Lcom/c/b/i$y$a;->s()Lcom/c/b/i$y;

    move-result-object v0

    .line 11502
    invoke-virtual {v0}, Lcom/c/b/i$y;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 11503
    invoke-static {v0}, Lcom/c/b/i$y$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 11505
    :cond_0
    return-object v0
.end method

.method private s()Lcom/c/b/i$y;
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 11509
    new-instance v2, Lcom/c/b/i$y;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$y;-><init>(Lcom/c/b/as$a;B)V

    .line 11510
    iget v3, p0, Lcom/c/b/i$y$a;->a:I

    .line 11512
    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_0

    .line 11515
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$y$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$y;->a(Lcom/c/b/i$y;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11516
    invoke-static {v2, v0}, Lcom/c/b/i$y;->a(Lcom/c/b/i$y;I)I

    .line 11517
    invoke-virtual {p0}, Lcom/c/b/i$y$a;->l()V

    .line 11518
    return-object v2

    :cond_0
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0, p1}, Lcom/c/b/i$y$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$y$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$y$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$y$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$y;)Lcom/c/b/i$y$a;
    .locals 1

    .prologue
    .line 11531
    invoke-static {}, Lcom/c/b/i$y;->j()Lcom/c/b/i$y;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 11539
    :goto_0
    return-object p0

    .line 11532
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$y;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11533
    iget v0, p0, Lcom/c/b/i$y$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$y$a;->a:I

    .line 11534
    invoke-static {p1}, Lcom/c/b/i$y;->a(Lcom/c/b/i$y;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$y$a;->b:Ljava/lang/Object;

    .line 11535
    invoke-virtual {p0}, Lcom/c/b/i$y$a;->q()V

    .line 11537
    :cond_1
    iget-object v0, p1, Lcom/c/b/i$y;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$y$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 11538
    invoke-virtual {p0}, Lcom/c/b/i$y$a;->q()V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 11543
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$y$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$y$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0, p1}, Lcom/c/b/i$y$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$y$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$y$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$y$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 11465
    invoke-static {}, Lcom/c/b/i;->m()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$y;

    const-class v2, Lcom/c/b/i$y$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 11493
    invoke-static {}, Lcom/c/b/i;->l()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0}, Lcom/c/b/i$y$a;->s()Lcom/c/b/i$y;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0}, Lcom/c/b/i$y$a;->r()Lcom/c/b/i$y;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 11454
    invoke-direct {p0}, Lcom/c/b/i$y$a;->r()Lcom/c/b/i$y;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 11454
    invoke-static {}, Lcom/c/b/i$y;->j()Lcom/c/b/i$y;

    move-result-object v0

    return-object v0
.end method
