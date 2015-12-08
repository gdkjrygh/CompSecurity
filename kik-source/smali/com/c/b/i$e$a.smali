.class public final Lcom/c/b/i$e$a;
.super Lcom/c/b/as$c;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Z

.field private d:Ljava/util/List;

.field private e:Lcom/c/b/bn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 23142
    invoke-direct {p0}, Lcom/c/b/as$c;-><init>()V

    .line 23406
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    .line 23143
    invoke-direct {p0}, Lcom/c/b/i$e$a;->s()V

    .line 23144
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 23124
    invoke-direct {p0}, Lcom/c/b/i$e$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 23148
    invoke-direct {p0, p1}, Lcom/c/b/as$c;-><init>(Lcom/c/b/as$b;)V

    .line 23406
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    .line 23149
    invoke-direct {p0}, Lcom/c/b/i$e$a;->s()V

    .line 23150
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 23124
    invoke-direct {p0, p1}, Lcom/c/b/i$e$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$e$a;
    .locals 1

    .prologue
    .line 23215
    instance-of v0, p1, Lcom/c/b/i$e;

    if-eqz v0, :cond_0

    .line 23216
    check-cast p1, Lcom/c/b/i$e;

    invoke-virtual {p0, p1}, Lcom/c/b/i$e$a;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    move-result-object p0

    .line 23219
    :goto_0
    return-object p0

    .line 23218
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$c;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$e$a;
    .locals 4

    .prologue
    .line 23279
    const/4 v2, 0x0

    .line 23281
    :try_start_0
    sget-object v0, Lcom/c/b/i$e;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$e;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23286
    if-eqz v0, :cond_0

    .line 23287
    invoke-virtual {p0, v0}, Lcom/c/b/i$e$a;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    .line 23290
    :cond_0
    return-object p0

    .line 23282
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 23283
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23284
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23286
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 23287
    invoke-virtual {p0, v1}, Lcom/c/b/i$e$a;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    .line 23286
    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 23152
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 23153
    invoke-direct {p0}, Lcom/c/b/i$e$a;->u()Lcom/c/b/bn;

    .line 23155
    :cond_0
    return-void
.end method

.method private t()Lcom/c/b/i$e;
    .locals 2

    .prologue
    .line 23181
    invoke-virtual {p0}, Lcom/c/b/i$e$a;->g()Lcom/c/b/i$e;

    move-result-object v0

    .line 23182
    invoke-virtual {v0}, Lcom/c/b/i$e;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 23183
    invoke-static {v0}, Lcom/c/b/i$e$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 23185
    :cond_0
    return-object v0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 23706
    iget-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 23707
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$e$a;->a:I

    and-int/lit8 v0, v0, 0x4

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$e$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$e$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    .line 23713
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    .line 23715
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    return-object v0

    .line 23707
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 23124
    invoke-direct {p0, p1}, Lcom/c/b/i$e$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 23124
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$e$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 23224
    invoke-static {}, Lcom/c/b/i$e;->m()Lcom/c/b/i$e;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 23260
    :goto_0
    return-object p0

    .line 23225
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$e;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 23226
    invoke-virtual {p1}, Lcom/c/b/i$e;->i()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$e$a;->a:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$e$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$e$a;->b:Z

    invoke-virtual {p0}, Lcom/c/b/i$e$a;->q()V

    .line 23228
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$e;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 23229
    invoke-virtual {p1}, Lcom/c/b/i$e;->k()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$e$a;->a:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Lcom/c/b/i$e$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$e$a;->c:Z

    invoke-virtual {p0}, Lcom/c/b/i$e$a;->q()V

    .line 23231
    :cond_2
    iget-object v1, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    if-nez v1, :cond_6

    .line 23232
    invoke-static {p1}, Lcom/c/b/i$e;->b(Lcom/c/b/i$e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 23233
    iget-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 23234
    invoke-static {p1}, Lcom/c/b/i$e;->b(Lcom/c/b/i$e;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    .line 23235
    iget v0, p0, Lcom/c/b/i$e$a;->a:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/c/b/i$e$a;->a:I

    .line 23240
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$e$a;->q()V

    .line 23257
    :cond_3
    :goto_2
    invoke-virtual {p0, p1}, Lcom/c/b/i$e$a;->a(Lcom/c/b/as$d;)V

    .line 23258
    iget-object v0, p1, Lcom/c/b/i$e;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$e$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 23259
    invoke-virtual {p0}, Lcom/c/b/i$e$a;->q()V

    goto :goto_0

    .line 23237
    :cond_4
    iget v0, p0, Lcom/c/b/i$e$a;->a:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$e$a;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/c/b/i$e$a;->a:I

    .line 23238
    :cond_5
    iget-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$e;->b(Lcom/c/b/i$e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 23243
    :cond_6
    invoke-static {p1}, Lcom/c/b/i$e;->b(Lcom/c/b/i$e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 23244
    iget-object v1, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 23245
    iget-object v1, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 23246
    iput-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    .line 23247
    invoke-static {p1}, Lcom/c/b/i$e;->b(Lcom/c/b/i$e;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    .line 23248
    iget v1, p0, Lcom/c/b/i$e$a;->a:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Lcom/c/b/i$e$a;->a:I

    .line 23249
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_7

    invoke-direct {p0}, Lcom/c/b/i$e$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_7
    iput-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    goto :goto_2

    .line 23253
    :cond_8
    iget-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$e;->b(Lcom/c/b/i$e;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 23264
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 23265
    iget-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 23272
    :cond_0
    :goto_3
    return v2

    .line 23264
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 23265
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    goto :goto_2

    .line 23264
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 23269
    :cond_4
    invoke-virtual {p0}, Lcom/c/b/i$e$a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23272
    const/4 v2, 0x1

    goto :goto_3
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 23124
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$e$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 23124
    invoke-direct {p0, p1}, Lcom/c/b/i$e$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 23124
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$e$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$e$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 23136
    invoke-static {}, Lcom/c/b/i;->C()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$e;

    const-class v2, Lcom/c/b/i$e$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 23173
    invoke-static {}, Lcom/c/b/i;->B()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$e;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 23189
    new-instance v2, Lcom/c/b/i$e;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$e;-><init>(Lcom/c/b/as$c;B)V

    .line 23190
    iget v3, p0, Lcom/c/b/i$e$a;->a:I

    .line 23192
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_3

    .line 23195
    :goto_0
    iget-boolean v1, p0, Lcom/c/b/i$e$a;->b:Z

    invoke-static {v2, v1}, Lcom/c/b/i$e;->a(Lcom/c/b/i$e;Z)Z

    .line 23196
    and-int/lit8 v1, v3, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 23197
    or-int/lit8 v0, v0, 0x2

    .line 23199
    :cond_0
    iget-boolean v1, p0, Lcom/c/b/i$e$a;->c:Z

    invoke-static {v2, v1}, Lcom/c/b/i$e;->b(Lcom/c/b/i$e;Z)Z

    .line 23200
    iget-object v1, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    if-nez v1, :cond_2

    .line 23201
    iget v1, p0, Lcom/c/b/i$e$a;->a:I

    and-int/lit8 v1, v1, 0x4

    const/4 v3, 0x4

    if-ne v1, v3, :cond_1

    .line 23202
    iget-object v1, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    .line 23203
    iget v1, p0, Lcom/c/b/i$e$a;->a:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Lcom/c/b/i$e$a;->a:I

    .line 23205
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$e$a;->d:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$e;->a(Lcom/c/b/i$e;Ljava/util/List;)Ljava/util/List;

    .line 23209
    :goto_1
    invoke-static {v2, v0}, Lcom/c/b/i$e;->a(Lcom/c/b/i$e;I)I

    .line 23210
    invoke-virtual {p0}, Lcom/c/b/i$e$a;->l()V

    .line 23211
    return-object v2

    .line 23207
    :cond_2
    iget-object v1, p0, Lcom/c/b/i$e$a;->e:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$e;->a(Lcom/c/b/i$e;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 23124
    invoke-virtual {p0}, Lcom/c/b/i$e$a;->g()Lcom/c/b/i$e;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 23124
    invoke-direct {p0}, Lcom/c/b/i$e$a;->t()Lcom/c/b/i$e;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 23124
    invoke-direct {p0}, Lcom/c/b/i$e$a;->t()Lcom/c/b/i$e;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 23124
    invoke-static {}, Lcom/c/b/i$e;->m()Lcom/c/b/i$e;

    move-result-object v0

    return-object v0
.end method
