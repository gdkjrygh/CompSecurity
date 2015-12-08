.class public final Lcom/c/b/i$a$d$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 5639
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 5640
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 5622
    invoke-direct {p0}, Lcom/c/b/i$a$d$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 0

    .prologue
    .line 5645
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 5646
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 5622
    invoke-direct {p0, p1}, Lcom/c/b/i$a$d$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$a$d$a;
    .locals 1

    .prologue
    .line 5696
    instance-of v0, p1, Lcom/c/b/i$a$d;

    if-eqz v0, :cond_0

    .line 5697
    check-cast p1, Lcom/c/b/i$a$d;

    invoke-virtual {p0, p1}, Lcom/c/b/i$a$d$a;->a(Lcom/c/b/i$a$d;)Lcom/c/b/i$a$d$a;

    move-result-object p0

    .line 5700
    :goto_0
    return-object p0

    .line 5699
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$d$a;
    .locals 4

    .prologue
    .line 5725
    const/4 v2, 0x0

    .line 5727
    :try_start_0
    sget-object v0, Lcom/c/b/i$a$d;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$a$d;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5732
    if-eqz v0, :cond_0

    .line 5733
    invoke-virtual {p0, v0}, Lcom/c/b/i$a$d$a;->a(Lcom/c/b/i$a$d;)Lcom/c/b/i$a$d$a;

    .line 5736
    :cond_0
    return-object p0

    .line 5728
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 5729
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$a$d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 5730
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 5732
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 5733
    invoke-virtual {p0, v1}, Lcom/c/b/i$a$d$a;->a(Lcom/c/b/i$a$d;)Lcom/c/b/i$a$d$a;

    .line 5732
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()Lcom/c/b/i$a$d;
    .locals 2

    .prologue
    .line 5671
    invoke-direct {p0}, Lcom/c/b/i$a$d$a;->s()Lcom/c/b/i$a$d;

    move-result-object v0

    .line 5672
    invoke-virtual {v0}, Lcom/c/b/i$a$d;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5673
    invoke-static {v0}, Lcom/c/b/i$a$d$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 5675
    :cond_0
    return-object v0
.end method

.method private s()Lcom/c/b/i$a$d;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 5679
    new-instance v2, Lcom/c/b/i$a$d;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$a$d;-><init>(Lcom/c/b/as$a;B)V

    .line 5680
    iget v3, p0, Lcom/c/b/i$a$d$a;->a:I

    .line 5682
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_1

    .line 5685
    :goto_0
    iget v1, p0, Lcom/c/b/i$a$d$a;->b:I

    invoke-static {v2, v1}, Lcom/c/b/i$a$d;->a(Lcom/c/b/i$a$d;I)I

    .line 5686
    and-int/lit8 v1, v3, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 5687
    or-int/lit8 v0, v0, 0x2

    .line 5689
    :cond_0
    iget v1, p0, Lcom/c/b/i$a$d$a;->c:I

    invoke-static {v2, v1}, Lcom/c/b/i$a$d;->b(Lcom/c/b/i$a$d;I)I

    .line 5690
    invoke-static {v2, v0}, Lcom/c/b/i$a$d;->c(Lcom/c/b/i$a$d;I)I

    .line 5691
    invoke-virtual {p0}, Lcom/c/b/i$a$d$a;->l()V

    .line 5692
    return-object v2

    :cond_1
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0, p1}, Lcom/c/b/i$a$d$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a$d$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$a$d;)Lcom/c/b/i$a$d$a;
    .locals 2

    .prologue
    .line 5705
    invoke-static {}, Lcom/c/b/i$a$d;->l()Lcom/c/b/i$a$d;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 5714
    :goto_0
    return-object p0

    .line 5706
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$a$d;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5707
    invoke-virtual {p1}, Lcom/c/b/i$a$d;->i()I

    move-result v0

    iget v1, p0, Lcom/c/b/i$a$d$a;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/i$a$d$a;->a:I

    iput v0, p0, Lcom/c/b/i$a$d$a;->b:I

    invoke-virtual {p0}, Lcom/c/b/i$a$d$a;->q()V

    .line 5709
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$a$d;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5710
    invoke-virtual {p1}, Lcom/c/b/i$a$d;->k()I

    move-result v0

    iget v1, p0, Lcom/c/b/i$a$d$a;->a:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/c/b/i$a$d$a;->a:I

    iput v0, p0, Lcom/c/b/i$a$d$a;->c:I

    invoke-virtual {p0}, Lcom/c/b/i$a$d$a;->q()V

    .line 5712
    :cond_2
    iget-object v0, p1, Lcom/c/b/i$a$d;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$a$d$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 5713
    invoke-virtual {p0}, Lcom/c/b/i$a$d$a;->q()V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 5718
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a$d$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0, p1}, Lcom/c/b/i$a$d$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$a$d$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$a$d$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 5633
    invoke-static {}, Lcom/c/b/i;->i()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$a$d;

    const-class v2, Lcom/c/b/i$a$d$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 5663
    invoke-static {}, Lcom/c/b/i;->h()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0}, Lcom/c/b/i$a$d$a;->s()Lcom/c/b/i$a$d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0}, Lcom/c/b/i$a$d$a;->r()Lcom/c/b/i$a$d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 5622
    invoke-direct {p0}, Lcom/c/b/i$a$d$a;->r()Lcom/c/b/i$a$d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 5622
    invoke-static {}, Lcom/c/b/i$a$d;->l()Lcom/c/b/i$a$d;

    move-result-object v0

    return-object v0
.end method
