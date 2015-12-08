.class public final Lcom/c/b/i$i$a;
.super Lcom/c/b/as$c;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/util/List;

.field private d:Lcom/c/b/bn;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 24155
    invoke-direct {p0}, Lcom/c/b/as$c;-><init>()V

    .line 24358
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    .line 24156
    invoke-direct {p0}, Lcom/c/b/i$i$a;->s()V

    .line 24157
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 24137
    invoke-direct {p0}, Lcom/c/b/i$i$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 24161
    invoke-direct {p0, p1}, Lcom/c/b/as$c;-><init>(Lcom/c/b/as$b;)V

    .line 24358
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    .line 24162
    invoke-direct {p0}, Lcom/c/b/i$i$a;->s()V

    .line 24163
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 24137
    invoke-direct {p0, p1}, Lcom/c/b/i$i$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$i$a;
    .locals 1

    .prologue
    .line 24222
    instance-of v0, p1, Lcom/c/b/i$i;

    if-eqz v0, :cond_0

    .line 24223
    check-cast p1, Lcom/c/b/i$i;

    invoke-virtual {p0, p1}, Lcom/c/b/i$i$a;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    move-result-object p0

    .line 24226
    :goto_0
    return-object p0

    .line 24225
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$c;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$i$a;
    .locals 4

    .prologue
    .line 24283
    const/4 v2, 0x0

    .line 24285
    :try_start_0
    sget-object v0, Lcom/c/b/i$i;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$i;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24290
    if-eqz v0, :cond_0

    .line 24291
    invoke-virtual {p0, v0}, Lcom/c/b/i$i$a;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    .line 24294
    :cond_0
    return-object p0

    .line 24286
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 24287
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24288
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24290
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 24291
    invoke-virtual {p0, v1}, Lcom/c/b/i$i$a;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    .line 24290
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
    .line 24165
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 24166
    invoke-direct {p0}, Lcom/c/b/i$i$a;->u()Lcom/c/b/bn;

    .line 24168
    :cond_0
    return-void
.end method

.method private t()Lcom/c/b/i$i;
    .locals 2

    .prologue
    .line 24192
    invoke-virtual {p0}, Lcom/c/b/i$i$a;->g()Lcom/c/b/i$i;

    move-result-object v0

    .line 24193
    invoke-virtual {v0}, Lcom/c/b/i$i;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 24194
    invoke-static {v0}, Lcom/c/b/i$i$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 24196
    :cond_0
    return-object v0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 24658
    iget-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 24659
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$i$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$i$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$i$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    .line 24665
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    .line 24667
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    return-object v0

    .line 24659
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 24137
    invoke-direct {p0, p1}, Lcom/c/b/i$i$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 24137
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$i$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 24231
    invoke-static {}, Lcom/c/b/i$i;->k()Lcom/c/b/i$i;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 24264
    :goto_0
    return-object p0

    .line 24232
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$i;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 24233
    invoke-virtual {p1}, Lcom/c/b/i$i;->i()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$i$a;->a:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$i$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$i$a;->b:Z

    invoke-virtual {p0}, Lcom/c/b/i$i$a;->q()V

    .line 24235
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_5

    .line 24236
    invoke-static {p1}, Lcom/c/b/i$i;->b(Lcom/c/b/i$i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 24237
    iget-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 24238
    invoke-static {p1}, Lcom/c/b/i$i;->b(Lcom/c/b/i$i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    .line 24239
    iget v0, p0, Lcom/c/b/i$i$a;->a:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/c/b/i$i$a;->a:I

    .line 24244
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$i$a;->q()V

    .line 24261
    :cond_2
    :goto_2
    invoke-virtual {p0, p1}, Lcom/c/b/i$i$a;->a(Lcom/c/b/as$d;)V

    .line 24262
    iget-object v0, p1, Lcom/c/b/i$i;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$i$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 24263
    invoke-virtual {p0}, Lcom/c/b/i$i$a;->q()V

    goto :goto_0

    .line 24241
    :cond_3
    iget v0, p0, Lcom/c/b/i$i$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$i$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$i$a;->a:I

    .line 24242
    :cond_4
    iget-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$i;->b(Lcom/c/b/i$i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 24247
    :cond_5
    invoke-static {p1}, Lcom/c/b/i$i;->b(Lcom/c/b/i$i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 24248
    iget-object v1, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 24249
    iget-object v1, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 24250
    iput-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    .line 24251
    invoke-static {p1}, Lcom/c/b/i$i;->b(Lcom/c/b/i$i;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    .line 24252
    iget v1, p0, Lcom/c/b/i$i$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$i$a;->a:I

    .line 24253
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_6

    invoke-direct {p0}, Lcom/c/b/i$i$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_6
    iput-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    goto :goto_2

    .line 24257
    :cond_7
    iget-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$i;->b(Lcom/c/b/i$i;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 24268
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 24269
    iget-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 24276
    :cond_0
    :goto_3
    return v2

    .line 24268
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 24269
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    goto :goto_2

    .line 24268
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 24273
    :cond_4
    invoke-virtual {p0}, Lcom/c/b/i$i$a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24276
    const/4 v2, 0x1

    goto :goto_3
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 24137
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$i$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 24137
    invoke-direct {p0, p1}, Lcom/c/b/i$i$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 24137
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$i$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$i$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 24149
    invoke-static {}, Lcom/c/b/i;->E()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$i;

    const-class v2, Lcom/c/b/i$i$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 24184
    invoke-static {}, Lcom/c/b/i;->D()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$i;
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 24200
    new-instance v2, Lcom/c/b/i$i;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$i;-><init>(Lcom/c/b/as$c;B)V

    .line 24201
    iget v3, p0, Lcom/c/b/i$i$a;->a:I

    .line 24203
    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_2

    .line 24206
    :goto_0
    iget-boolean v1, p0, Lcom/c/b/i$i$a;->b:Z

    invoke-static {v2, v1}, Lcom/c/b/i$i;->a(Lcom/c/b/i$i;Z)Z

    .line 24207
    iget-object v1, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_1

    .line 24208
    iget v1, p0, Lcom/c/b/i$i$a;->a:I

    and-int/lit8 v1, v1, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 24209
    iget-object v1, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    .line 24210
    iget v1, p0, Lcom/c/b/i$i$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$i$a;->a:I

    .line 24212
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$i$a;->c:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$i;->a(Lcom/c/b/i$i;Ljava/util/List;)Ljava/util/List;

    .line 24216
    :goto_1
    invoke-static {v2, v0}, Lcom/c/b/i$i;->a(Lcom/c/b/i$i;I)I

    .line 24217
    invoke-virtual {p0}, Lcom/c/b/i$i$a;->l()V

    .line 24218
    return-object v2

    .line 24214
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$i$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$i;->a(Lcom/c/b/i$i;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 24137
    invoke-virtual {p0}, Lcom/c/b/i$i$a;->g()Lcom/c/b/i$i;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 24137
    invoke-direct {p0}, Lcom/c/b/i$i$a;->t()Lcom/c/b/i$i;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 24137
    invoke-direct {p0}, Lcom/c/b/i$i$a;->t()Lcom/c/b/i$i;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 24137
    invoke-static {}, Lcom/c/b/i$i;->k()Lcom/c/b/i$i;

    move-result-object v0

    return-object v0
.end method
