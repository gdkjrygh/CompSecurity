.class public final Lcom/c/b/i$g$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:I

.field private d:Lcom/c/b/i$i;

.field private e:Lcom/c/b/bp;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 13108
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 13234
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$g$a;->b:Ljava/lang/Object;

    .line 13342
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    .line 13109
    invoke-direct {p0}, Lcom/c/b/i$g$a;->r()V

    .line 13110
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 13091
    invoke-direct {p0}, Lcom/c/b/i$g$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 13114
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 13234
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$g$a;->b:Ljava/lang/Object;

    .line 13342
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    .line 13115
    invoke-direct {p0}, Lcom/c/b/i$g$a;->r()V

    .line 13116
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 13091
    invoke-direct {p0, p1}, Lcom/c/b/i$g$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$g$a;
    .locals 1

    .prologue
    .line 13180
    instance-of v0, p1, Lcom/c/b/i$g;

    if-eqz v0, :cond_0

    .line 13181
    check-cast p1, Lcom/c/b/i$g;

    invoke-virtual {p0, p1}, Lcom/c/b/i$g$a;->a(Lcom/c/b/i$g;)Lcom/c/b/i$g$a;

    move-result-object p0

    .line 13184
    :goto_0
    return-object p0

    .line 13183
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$g$a;
    .locals 4

    .prologue
    .line 13219
    const/4 v2, 0x0

    .line 13221
    :try_start_0
    sget-object v0, Lcom/c/b/i$g;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$g;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13226
    if-eqz v0, :cond_0

    .line 13227
    invoke-virtual {p0, v0}, Lcom/c/b/i$g$a;->a(Lcom/c/b/i$g;)Lcom/c/b/i$g$a;

    .line 13230
    :cond_0
    return-object p0

    .line 13222
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 13223
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 13224
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 13226
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 13227
    invoke-virtual {p0, v1}, Lcom/c/b/i$g$a;->a(Lcom/c/b/i$g;)Lcom/c/b/i$g$a;

    .line 13226
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
    .line 13118
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 13119
    iget-object v0, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/c/b/bp;

    invoke-direct {p0}, Lcom/c/b/i$g$a;->t()Lcom/c/b/i$i;

    move-result-object v1

    invoke-virtual {p0}, Lcom/c/b/i$g$a;->p()Lcom/c/b/as$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/c/b/i$g$a;->n()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    iput-object v0, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    .line 13121
    :cond_0
    return-void
.end method

.method private s()Lcom/c/b/i$g;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 13155
    new-instance v2, Lcom/c/b/i$g;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$g;-><init>(Lcom/c/b/as$a;B)V

    .line 13156
    iget v3, p0, Lcom/c/b/i$g$a;->a:I

    .line 13158
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_3

    .line 13161
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$g$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$g;->a(Lcom/c/b/i$g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13162
    and-int/lit8 v1, v3, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 13163
    or-int/lit8 v0, v0, 0x2

    .line 13165
    :cond_0
    iget v1, p0, Lcom/c/b/i$g$a;->c:I

    invoke-static {v2, v1}, Lcom/c/b/i$g;->a(Lcom/c/b/i$g;I)I

    .line 13166
    and-int/lit8 v1, v3, 0x4

    const/4 v3, 0x4

    if-ne v1, v3, :cond_2

    .line 13167
    or-int/lit8 v0, v0, 0x4

    move v1, v0

    .line 13169
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 13170
    iget-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    invoke-static {v2, v0}, Lcom/c/b/i$g;->a(Lcom/c/b/i$g;Lcom/c/b/i$i;)Lcom/c/b/i$i;

    .line 13174
    :goto_2
    invoke-static {v2, v1}, Lcom/c/b/i$g;->b(Lcom/c/b/i$g;I)I

    .line 13175
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->l()V

    .line 13176
    return-object v2

    .line 13172
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$i;

    invoke-static {v2, v0}, Lcom/c/b/i$g;->a(Lcom/c/b/i$g;Lcom/c/b/i$i;)Lcom/c/b/i$i;

    goto :goto_2

    :cond_2
    move v1, v0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method private t()Lcom/c/b/i$i;
    .locals 1

    .prologue
    .line 13355
    iget-object v0, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 13356
    iget-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$i;->k()Lcom/c/b/i$i;

    move-result-object v0

    .line 13358
    :goto_0
    return-object v0

    .line 13356
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    goto :goto_0

    .line 13358
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$i;

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 13091
    invoke-direct {p0, p1}, Lcom/c/b/i$g$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 13091
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$g$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)Lcom/c/b/i$g$a;
    .locals 1

    .prologue
    .line 13327
    iget v0, p0, Lcom/c/b/i$g$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$g$a;->a:I

    .line 13328
    iput p1, p0, Lcom/c/b/i$g$a;->c:I

    .line 13329
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->q()V

    .line 13330
    return-object p0
.end method

.method public final a(Lcom/c/b/i$g;)Lcom/c/b/i$g$a;
    .locals 3

    .prologue
    .line 13189
    invoke-static {}, Lcom/c/b/i$g;->o()Lcom/c/b/i$g;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 13203
    :goto_0
    return-object p0

    .line 13190
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$g;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13191
    iget v0, p0, Lcom/c/b/i$g$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$g$a;->a:I

    .line 13192
    invoke-static {p1}, Lcom/c/b/i$g;->a(Lcom/c/b/i$g;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$g$a;->b:Ljava/lang/Object;

    .line 13193
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->q()V

    .line 13195
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/i$g;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 13196
    invoke-virtual {p1}, Lcom/c/b/i$g;->k()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/i$g$a;->a(I)Lcom/c/b/i$g$a;

    .line 13198
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/i$g;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13199
    invoke-virtual {p1}, Lcom/c/b/i$g;->m()Lcom/c/b/i$i;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    if-nez v1, :cond_5

    iget v1, p0, Lcom/c/b/i$g$a;->a:I

    and-int/lit8 v1, v1, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    invoke-static {}, Lcom/c/b/i$i;->k()Lcom/c/b/i$i;

    move-result-object v2

    if-eq v1, v2, :cond_4

    iget-object v1, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    invoke-static {v1}, Lcom/c/b/i$i;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/c/b/i$i$a;->a(Lcom/c/b/i$i;)Lcom/c/b/i$i$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$i$a;->g()Lcom/c/b/i$i;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->q()V

    :goto_2
    iget v0, p0, Lcom/c/b/i$g$a;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/c/b/i$g$a;->a:I

    .line 13201
    :cond_3
    iget-object v0, p1, Lcom/c/b/i$g;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$g$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 13202
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->q()V

    goto :goto_0

    .line 13199
    :cond_4
    iput-object v0, p0, Lcom/c/b/i$g$a;->d:Lcom/c/b/i$i;

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lcom/c/b/i$g$a;->e:Lcom/c/b/bp;

    invoke-virtual {v1, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_2
.end method

.method public final a(Ljava/lang/String;)Lcom/c/b/i$g$a;
    .locals 1

    .prologue
    .line 13279
    if-nez p1, :cond_0

    .line 13280
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 13282
    :cond_0
    iget v0, p0, Lcom/c/b/i$g$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/i$g$a;->a:I

    .line 13283
    iput-object p1, p0, Lcom/c/b/i$g$a;->b:Ljava/lang/Object;

    .line 13284
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->q()V

    .line 13285
    return-object p0
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 13207
    iget v2, p0, Lcom/c/b/i$g$a;->a:I

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    .line 13208
    invoke-direct {p0}, Lcom/c/b/i$g$a;->t()Lcom/c/b/i$i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/i$i;->a()Z

    move-result v2

    if-nez v2, :cond_1

    .line 13212
    :goto_1
    return v0

    :cond_0
    move v2, v0

    .line 13207
    goto :goto_0

    :cond_1
    move v0, v1

    .line 13212
    goto :goto_1
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 13091
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$g$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 13091
    invoke-direct {p0, p1}, Lcom/c/b/i$g$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 13091
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$g$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$g$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 13102
    invoke-static {}, Lcom/c/b/i;->q()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$g;

    const-class v2, Lcom/c/b/i$g$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 13139
    invoke-static {}, Lcom/c/b/i;->p()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$g;
    .locals 2

    .prologue
    .line 13147
    invoke-direct {p0}, Lcom/c/b/i$g$a;->s()Lcom/c/b/i$g;

    move-result-object v0

    .line 13148
    invoke-virtual {v0}, Lcom/c/b/i$g;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 13149
    invoke-static {v0}, Lcom/c/b/i$g$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 13151
    :cond_0
    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 13091
    invoke-direct {p0}, Lcom/c/b/i$g$a;->s()Lcom/c/b/i$g;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 13091
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->g()Lcom/c/b/i$g;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 13091
    invoke-virtual {p0}, Lcom/c/b/i$g$a;->g()Lcom/c/b/i$g;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 13091
    invoke-static {}, Lcom/c/b/i$g;->o()Lcom/c/b/i$g;

    move-result-object v0

    return-object v0
.end method
