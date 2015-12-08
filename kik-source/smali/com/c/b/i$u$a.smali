.class public final Lcom/c/b/i$u$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private d:Ljava/lang/Object;

.field private e:Lcom/c/b/i$w;

.field private f:Lcom/c/b/bp;

.field private g:Z

.field private h:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 15166
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 15323
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u$a;->b:Ljava/lang/Object;

    .line 15399
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u$a;->c:Ljava/lang/Object;

    .line 15505
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u$a;->d:Ljava/lang/Object;

    .line 15581
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    .line 15167
    invoke-direct {p0}, Lcom/c/b/i$u$a;->r()V

    .line 15168
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 15149
    invoke-direct {p0}, Lcom/c/b/i$u$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 15172
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 15323
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u$a;->b:Ljava/lang/Object;

    .line 15399
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u$a;->c:Ljava/lang/Object;

    .line 15505
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$u$a;->d:Ljava/lang/Object;

    .line 15581
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    .line 15173
    invoke-direct {p0}, Lcom/c/b/i$u$a;->r()V

    .line 15174
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 15149
    invoke-direct {p0, p1}, Lcom/c/b/i$u$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$u$a;
    .locals 1

    .prologue
    .line 15256
    instance-of v0, p1, Lcom/c/b/i$u;

    if-eqz v0, :cond_0

    .line 15257
    check-cast p1, Lcom/c/b/i$u;

    invoke-virtual {p0, p1}, Lcom/c/b/i$u$a;->a(Lcom/c/b/i$u;)Lcom/c/b/i$u$a;

    move-result-object p0

    .line 15260
    :goto_0
    return-object p0

    .line 15259
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$u$a;
    .locals 4

    .prologue
    .line 15308
    const/4 v2, 0x0

    .line 15310
    :try_start_0
    sget-object v0, Lcom/c/b/i$u;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$u;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15315
    if-eqz v0, :cond_0

    .line 15316
    invoke-virtual {p0, v0}, Lcom/c/b/i$u$a;->a(Lcom/c/b/i$u;)Lcom/c/b/i$u$a;

    .line 15319
    :cond_0
    return-object p0

    .line 15311
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 15312
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 15313
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15315
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 15316
    invoke-virtual {p0, v1}, Lcom/c/b/i$u$a;->a(Lcom/c/b/i$u;)Lcom/c/b/i$u$a;

    .line 15315
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private r()V
    .locals 4

    .prologue
    .line 15176
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 15177
    iget-object v0, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/c/b/bp;

    invoke-direct {p0}, Lcom/c/b/i$u$a;->u()Lcom/c/b/i$w;

    move-result-object v1

    invoke-virtual {p0}, Lcom/c/b/i$u$a;->p()Lcom/c/b/as$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/c/b/i$u$a;->n()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    iput-object v0, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    .line 15179
    :cond_0
    return-void
.end method

.method private s()Lcom/c/b/i$u;
    .locals 2

    .prologue
    .line 15211
    invoke-direct {p0}, Lcom/c/b/i$u$a;->t()Lcom/c/b/i$u;

    move-result-object v0

    .line 15212
    invoke-virtual {v0}, Lcom/c/b/i$u;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 15213
    invoke-static {v0}, Lcom/c/b/i$u$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 15215
    :cond_0
    return-object v0
.end method

.method private t()Lcom/c/b/i$u;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 15219
    new-instance v2, Lcom/c/b/i$u;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$u;-><init>(Lcom/c/b/as$a;B)V

    .line 15220
    iget v3, p0, Lcom/c/b/i$u$a;->a:I

    .line 15222
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_6

    .line 15225
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$u$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$u;->a(Lcom/c/b/i$u;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15226
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 15227
    or-int/lit8 v0, v0, 0x2

    .line 15229
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$u$a;->c:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$u;->b(Lcom/c/b/i$u;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15230
    and-int/lit8 v1, v3, 0x4

    const/4 v4, 0x4

    if-ne v1, v4, :cond_1

    .line 15231
    or-int/lit8 v0, v0, 0x4

    .line 15233
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$u$a;->d:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$u;->c(Lcom/c/b/i$u;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15234
    and-int/lit8 v1, v3, 0x8

    const/16 v4, 0x8

    if-ne v1, v4, :cond_5

    .line 15235
    or-int/lit8 v0, v0, 0x8

    move v1, v0

    .line 15237
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_4

    .line 15238
    iget-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    invoke-static {v2, v0}, Lcom/c/b/i$u;->a(Lcom/c/b/i$u;Lcom/c/b/i$w;)Lcom/c/b/i$w;

    .line 15242
    :goto_2
    and-int/lit8 v0, v3, 0x10

    const/16 v4, 0x10

    if-ne v0, v4, :cond_2

    .line 15243
    or-int/lit8 v1, v1, 0x10

    .line 15245
    :cond_2
    iget-boolean v0, p0, Lcom/c/b/i$u$a;->g:Z

    invoke-static {v2, v0}, Lcom/c/b/i$u;->a(Lcom/c/b/i$u;Z)Z

    .line 15246
    and-int/lit8 v0, v3, 0x20

    const/16 v3, 0x20

    if-ne v0, v3, :cond_3

    .line 15247
    or-int/lit8 v1, v1, 0x20

    .line 15249
    :cond_3
    iget-boolean v0, p0, Lcom/c/b/i$u$a;->h:Z

    invoke-static {v2, v0}, Lcom/c/b/i$u;->b(Lcom/c/b/i$u;Z)Z

    .line 15250
    invoke-static {v2, v1}, Lcom/c/b/i$u;->a(Lcom/c/b/i$u;I)I

    .line 15251
    invoke-virtual {p0}, Lcom/c/b/i$u$a;->l()V

    .line 15252
    return-object v2

    .line 15240
    :cond_4
    iget-object v0, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$w;

    invoke-static {v2, v0}, Lcom/c/b/i$u;->a(Lcom/c/b/i$u;Lcom/c/b/i$w;)Lcom/c/b/i$w;

    goto :goto_2

    :cond_5
    move v1, v0

    goto :goto_1

    :cond_6
    move v0, v1

    goto :goto_0
.end method

.method private u()Lcom/c/b/i$w;
    .locals 1

    .prologue
    .line 15594
    iget-object v0, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 15595
    iget-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$w;->k()Lcom/c/b/i$w;

    move-result-object v0

    .line 15597
    :goto_0
    return-object v0

    .line 15595
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    goto :goto_0

    .line 15597
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$w;

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0, p1}, Lcom/c/b/i$u$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$u$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$u$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$u$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$u;)Lcom/c/b/i$u$a;
    .locals 3

    .prologue
    .line 15265
    invoke-static {}, Lcom/c/b/i$u;->x()Lcom/c/b/i$u;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 15292
    :goto_0
    return-object p0

    .line 15266
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$u;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15267
    iget v0, p0, Lcom/c/b/i$u$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$u$a;->a:I

    .line 15268
    invoke-static {p1}, Lcom/c/b/i$u;->a(Lcom/c/b/i$u;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$u$a;->b:Ljava/lang/Object;

    .line 15269
    invoke-virtual {p0}, Lcom/c/b/i$u$a;->q()V

    .line 15271
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$u;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 15272
    iget v0, p0, Lcom/c/b/i$u$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$u$a;->a:I

    .line 15273
    invoke-static {p1}, Lcom/c/b/i$u;->b(Lcom/c/b/i$u;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$u$a;->c:Ljava/lang/Object;

    .line 15274
    invoke-virtual {p0}, Lcom/c/b/i$u$a;->q()V

    .line 15276
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/i$u;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 15277
    iget v0, p0, Lcom/c/b/i$u$a;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/c/b/i$u$a;->a:I

    .line 15278
    invoke-static {p1}, Lcom/c/b/i$u;->c(Lcom/c/b/i$u;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$u$a;->d:Ljava/lang/Object;

    .line 15279
    invoke-virtual {p0}, Lcom/c/b/i$u$a;->q()V

    .line 15281
    :cond_3
    invoke-virtual {p1}, Lcom/c/b/i$u;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 15282
    invoke-virtual {p1}, Lcom/c/b/i$u;->o()Lcom/c/b/i$w;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    if-nez v1, :cond_8

    iget v1, p0, Lcom/c/b/i$u$a;->a:I

    and-int/lit8 v1, v1, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_7

    iget-object v1, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    invoke-static {}, Lcom/c/b/i$w;->k()Lcom/c/b/i$w;

    move-result-object v2

    if-eq v1, v2, :cond_7

    iget-object v1, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    invoke-static {v1}, Lcom/c/b/i$w;->a(Lcom/c/b/i$w;)Lcom/c/b/i$w$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/c/b/i$w$a;->a(Lcom/c/b/i$w;)Lcom/c/b/i$w$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$w$a;->g()Lcom/c/b/i$w;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$u$a;->q()V

    :goto_2
    iget v0, p0, Lcom/c/b/i$u$a;->a:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/c/b/i$u$a;->a:I

    .line 15284
    :cond_4
    invoke-virtual {p1}, Lcom/c/b/i$u;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 15285
    invoke-virtual {p1}, Lcom/c/b/i$u;->q()Z

    move-result v0

    iget v1, p0, Lcom/c/b/i$u$a;->a:I

    or-int/lit8 v1, v1, 0x10

    iput v1, p0, Lcom/c/b/i$u$a;->a:I

    iput-boolean v0, p0, Lcom/c/b/i$u$a;->g:Z

    invoke-virtual {p0}, Lcom/c/b/i$u$a;->q()V

    .line 15287
    :cond_5
    invoke-virtual {p1}, Lcom/c/b/i$u;->r()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15288
    invoke-virtual {p1}, Lcom/c/b/i$u;->s()Z

    move-result v0

    iget v1, p0, Lcom/c/b/i$u$a;->a:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Lcom/c/b/i$u$a;->a:I

    iput-boolean v0, p0, Lcom/c/b/i$u$a;->h:Z

    invoke-virtual {p0}, Lcom/c/b/i$u$a;->q()V

    .line 15290
    :cond_6
    iget-object v0, p1, Lcom/c/b/i$u;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$u$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 15291
    invoke-virtual {p0}, Lcom/c/b/i$u$a;->q()V

    goto/16 :goto_0

    .line 15282
    :cond_7
    iput-object v0, p0, Lcom/c/b/i$u$a;->e:Lcom/c/b/i$w;

    goto :goto_1

    :cond_8
    iget-object v1, p0, Lcom/c/b/i$u$a;->f:Lcom/c/b/bp;

    invoke-virtual {v1, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_2
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 15296
    iget v2, p0, Lcom/c/b/i$u$a;->a:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    .line 15297
    invoke-direct {p0}, Lcom/c/b/i$u$a;->u()Lcom/c/b/i$w;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/i$w;->a()Z

    move-result v2

    if-nez v2, :cond_1

    .line 15301
    :goto_1
    return v0

    :cond_0
    move v2, v0

    .line 15296
    goto :goto_0

    :cond_1
    move v0, v1

    .line 15301
    goto :goto_1
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$u$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$u$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0, p1}, Lcom/c/b/i$u$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$u$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$u$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$u$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 15160
    invoke-static {}, Lcom/c/b/i;->u()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$u;

    const-class v2, Lcom/c/b/i$u$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 15203
    invoke-static {}, Lcom/c/b/i;->t()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0}, Lcom/c/b/i$u$a;->t()Lcom/c/b/i$u;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0}, Lcom/c/b/i$u$a;->s()Lcom/c/b/i$u;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 15149
    invoke-direct {p0}, Lcom/c/b/i$u$a;->s()Lcom/c/b/i$u;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 15149
    invoke-static {}, Lcom/c/b/i$u;->x()Lcom/c/b/i$u;

    move-result-object v0

    return-object v0
.end method
