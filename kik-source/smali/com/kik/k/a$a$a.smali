.class public final Lcom/kik/k/a$a$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/k/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/k/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/lang/Object;

.field private d:I

.field private e:I

.field private f:J

.field private g:J

.field private h:I

.field private i:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 562
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 767
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/k/a$a$a;->c:Ljava/lang/Object;

    .line 563
    invoke-static {}, Lcom/kik/k/a$a;->B()Z

    .line 564
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 545
    invoke-direct {p0}, Lcom/kik/k/a$a$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 568
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 767
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/k/a$a$a;->c:Ljava/lang/Object;

    .line 569
    invoke-static {}, Lcom/kik/k/a$a;->B()Z

    .line 570
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 545
    invoke-direct {p0, p1}, Lcom/kik/k/a$a$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/k/a$a$a;
    .locals 1

    .prologue
    .line 655
    instance-of v0, p1, Lcom/kik/k/a$a;

    if-eqz v0, :cond_0

    .line 656
    check-cast p1, Lcom/kik/k/a$a;

    invoke-virtual {p0, p1}, Lcom/kik/k/a$a$a;->a(Lcom/kik/k/a$a;)Lcom/kik/k/a$a$a;

    move-result-object p0

    .line 659
    :goto_0
    return-object p0

    .line 658
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/k/a$a$a;
    .locals 4

    .prologue
    .line 704
    const/4 v2, 0x0

    .line 706
    :try_start_0
    sget-object v0, Lcom/kik/k/a$a;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/k/a$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 711
    if-eqz v0, :cond_0

    .line 712
    invoke-virtual {p0, v0}, Lcom/kik/k/a$a$a;->a(Lcom/kik/k/a$a;)Lcom/kik/k/a$a$a;

    .line 715
    :cond_0
    return-object p0

    .line 707
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 708
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/k/a$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 709
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 711
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 712
    invoke-virtual {p0, v1}, Lcom/kik/k/a$a$a;->a(Lcom/kik/k/a$a;)Lcom/kik/k/a$a$a;

    :cond_1
    throw v0

    .line 711
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()Lcom/kik/k/a$a;
    .locals 2

    .prologue
    .line 606
    invoke-direct {p0}, Lcom/kik/k/a$a$a;->s()Lcom/kik/k/a$a;

    move-result-object v0

    .line 607
    invoke-virtual {v0}, Lcom/kik/k/a$a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 608
    invoke-static {v0}, Lcom/kik/k/a$a$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 610
    :cond_0
    return-object v0
.end method

.method private s()Lcom/kik/k/a$a;
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 614
    new-instance v2, Lcom/kik/k/a$a;

    invoke-direct {v2, p0, v1}, Lcom/kik/k/a$a;-><init>(Lcom/c/b/as$a;B)V

    .line 615
    iget v3, p0, Lcom/kik/k/a$a$a;->a:I

    .line 617
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_7

    .line 620
    :goto_0
    iget-boolean v1, p0, Lcom/kik/k/a$a$a;->b:Z

    invoke-static {v2, v1}, Lcom/kik/k/a$a;->a(Lcom/kik/k/a$a;Z)Z

    .line 621
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 622
    or-int/lit8 v0, v0, 0x2

    .line 624
    :cond_0
    iget-object v1, p0, Lcom/kik/k/a$a$a;->c:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/k/a$a;->a(Lcom/kik/k/a$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 626
    or-int/lit8 v0, v0, 0x4

    .line 628
    :cond_1
    iget v1, p0, Lcom/kik/k/a$a$a;->d:I

    invoke-static {v2, v1}, Lcom/kik/k/a$a;->a(Lcom/kik/k/a$a;I)I

    .line 629
    and-int/lit8 v1, v3, 0x8

    const/16 v4, 0x8

    if-ne v1, v4, :cond_2

    .line 630
    or-int/lit8 v0, v0, 0x8

    .line 632
    :cond_2
    iget v1, p0, Lcom/kik/k/a$a$a;->e:I

    invoke-static {v2, v1}, Lcom/kik/k/a$a;->b(Lcom/kik/k/a$a;I)I

    .line 633
    and-int/lit8 v1, v3, 0x10

    const/16 v4, 0x10

    if-ne v1, v4, :cond_3

    .line 634
    or-int/lit8 v0, v0, 0x10

    .line 636
    :cond_3
    iget-wide v4, p0, Lcom/kik/k/a$a$a;->f:J

    invoke-static {v2, v4, v5}, Lcom/kik/k/a$a;->a(Lcom/kik/k/a$a;J)J

    .line 637
    and-int/lit8 v1, v3, 0x20

    const/16 v4, 0x20

    if-ne v1, v4, :cond_4

    .line 638
    or-int/lit8 v0, v0, 0x20

    .line 640
    :cond_4
    iget-wide v4, p0, Lcom/kik/k/a$a$a;->g:J

    invoke-static {v2, v4, v5}, Lcom/kik/k/a$a;->b(Lcom/kik/k/a$a;J)J

    .line 641
    and-int/lit8 v1, v3, 0x40

    const/16 v4, 0x40

    if-ne v1, v4, :cond_5

    .line 642
    or-int/lit8 v0, v0, 0x40

    .line 644
    :cond_5
    iget v1, p0, Lcom/kik/k/a$a$a;->h:I

    invoke-static {v2, v1}, Lcom/kik/k/a$a;->c(Lcom/kik/k/a$a;I)I

    .line 645
    and-int/lit16 v1, v3, 0x80

    const/16 v3, 0x80

    if-ne v1, v3, :cond_6

    .line 646
    or-int/lit16 v0, v0, 0x80

    .line 648
    :cond_6
    iget v1, p0, Lcom/kik/k/a$a$a;->i:I

    invoke-static {v2, v1}, Lcom/kik/k/a$a;->d(Lcom/kik/k/a$a;I)I

    .line 649
    invoke-static {v2, v0}, Lcom/kik/k/a$a;->e(Lcom/kik/k/a$a;I)I

    .line 650
    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->l()V

    .line 651
    return-object v2

    :cond_7
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0, p1}, Lcom/kik/k/a$a$a;->d(Lcom/c/b/bd;)Lcom/kik/k/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0, p1, p2}, Lcom/kik/k/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/k/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/k/a$a;)Lcom/kik/k/a$a$a;
    .locals 3

    .prologue
    .line 664
    invoke-static {}, Lcom/kik/k/a$a;->A()Lcom/kik/k/a$a;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 693
    :goto_0
    return-object p0

    .line 665
    :cond_0
    invoke-virtual {p1}, Lcom/kik/k/a$a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 666
    invoke-virtual {p1}, Lcom/kik/k/a$a;->i()Z

    move-result v0

    iget v1, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/kik/k/a$a$a;->a:I

    iput-boolean v0, p0, Lcom/kik/k/a$a$a;->b:Z

    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 668
    :cond_1
    invoke-virtual {p1}, Lcom/kik/k/a$a;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 669
    iget v0, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/k/a$a$a;->a:I

    .line 670
    invoke-static {p1}, Lcom/kik/k/a$a;->a(Lcom/kik/k/a$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/k/a$a$a;->c:Ljava/lang/Object;

    .line 671
    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 673
    :cond_2
    invoke-virtual {p1}, Lcom/kik/k/a$a;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 674
    invoke-virtual {p1}, Lcom/kik/k/a$a;->l()I

    move-result v0

    iget v1, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/kik/k/a$a$a;->a:I

    iput v0, p0, Lcom/kik/k/a$a$a;->d:I

    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 676
    :cond_3
    invoke-virtual {p1}, Lcom/kik/k/a$a;->m()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 677
    invoke-virtual {p1}, Lcom/kik/k/a$a;->n()I

    move-result v0

    iget v1, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Lcom/kik/k/a$a$a;->a:I

    iput v0, p0, Lcom/kik/k/a$a$a;->e:I

    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 679
    :cond_4
    invoke-virtual {p1}, Lcom/kik/k/a$a;->o()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 680
    invoke-virtual {p1}, Lcom/kik/k/a$a;->p()J

    move-result-wide v0

    iget v2, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit8 v2, v2, 0x10

    iput v2, p0, Lcom/kik/k/a$a$a;->a:I

    iput-wide v0, p0, Lcom/kik/k/a$a$a;->f:J

    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 682
    :cond_5
    invoke-virtual {p1}, Lcom/kik/k/a$a;->q()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 683
    invoke-virtual {p1}, Lcom/kik/k/a$a;->r()J

    move-result-wide v0

    iget v2, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit8 v2, v2, 0x20

    iput v2, p0, Lcom/kik/k/a$a$a;->a:I

    iput-wide v0, p0, Lcom/kik/k/a$a$a;->g:J

    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 685
    :cond_6
    invoke-virtual {p1}, Lcom/kik/k/a$a;->s()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 686
    invoke-virtual {p1}, Lcom/kik/k/a$a;->x()I

    move-result v0

    iget v1, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Lcom/kik/k/a$a$a;->a:I

    iput v0, p0, Lcom/kik/k/a$a$a;->h:I

    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 688
    :cond_7
    invoke-virtual {p1}, Lcom/kik/k/a$a;->y()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 689
    invoke-virtual {p1}, Lcom/kik/k/a$a;->z()I

    move-result v0

    iget v1, p0, Lcom/kik/k/a$a$a;->a:I

    or-int/lit16 v1, v1, 0x80

    iput v1, p0, Lcom/kik/k/a$a$a;->a:I

    iput v0, p0, Lcom/kik/k/a$a$a;->i:I

    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    .line 691
    :cond_8
    invoke-static {p1}, Lcom/kik/k/a$a;->b(Lcom/kik/k/a$a;)Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/k/a$a$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 692
    invoke-virtual {p0}, Lcom/kik/k/a$a$a;->q()V

    goto/16 :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 697
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0, p1, p2}, Lcom/kik/k/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/k/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0, p1}, Lcom/kik/k/a$a$a;->d(Lcom/c/b/bd;)Lcom/kik/k/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0, p1, p2}, Lcom/kik/k/a$a$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/k/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 556
    invoke-static {}, Lcom/kik/k/a;->c()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/k/a$a;

    const-class v2, Lcom/kik/k/a$a$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 598
    invoke-static {}, Lcom/kik/k/a;->b()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0}, Lcom/kik/k/a$a$a;->s()Lcom/kik/k/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0}, Lcom/kik/k/a$a$a;->r()Lcom/kik/k/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 545
    invoke-direct {p0}, Lcom/kik/k/a$a$a;->r()Lcom/kik/k/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 545
    invoke-static {}, Lcom/kik/k/a$a;->A()Lcom/kik/k/a$a;

    move-result-object v0

    return-object v0
.end method
