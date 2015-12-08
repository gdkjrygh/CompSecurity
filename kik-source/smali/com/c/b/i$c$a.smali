.class public final Lcom/c/b/i$c$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Ljava/util/List;

.field private d:Lcom/c/b/bn;

.field private e:Lcom/c/b/i$e;

.field private f:Lcom/c/b/bp;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 12099
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 12263
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$c$a;->b:Ljava/lang/Object;

    .line 12339
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    .line 12579
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    .line 12100
    invoke-direct {p0}, Lcom/c/b/i$c$a;->r()V

    .line 12101
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 12082
    invoke-direct {p0}, Lcom/c/b/i$c$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 12105
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 12263
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$c$a;->b:Ljava/lang/Object;

    .line 12339
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    .line 12579
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    .line 12106
    invoke-direct {p0}, Lcom/c/b/i$c$a;->r()V

    .line 12107
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 12082
    invoke-direct {p0, p1}, Lcom/c/b/i$c$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$c$a;
    .locals 1

    .prologue
    .line 12181
    instance-of v0, p1, Lcom/c/b/i$c;

    if-eqz v0, :cond_0

    .line 12182
    check-cast p1, Lcom/c/b/i$c;

    invoke-virtual {p0, p1}, Lcom/c/b/i$c$a;->a(Lcom/c/b/i$c;)Lcom/c/b/i$c$a;

    move-result-object p0

    .line 12185
    :goto_0
    return-object p0

    .line 12184
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$c$a;
    .locals 4

    .prologue
    .line 12248
    const/4 v2, 0x0

    .line 12250
    :try_start_0
    sget-object v0, Lcom/c/b/i$c;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$c;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12255
    if-eqz v0, :cond_0

    .line 12256
    invoke-virtual {p0, v0}, Lcom/c/b/i$c$a;->a(Lcom/c/b/i$c;)Lcom/c/b/i$c$a;

    .line 12259
    :cond_0
    return-object p0

    .line 12251
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 12252
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12253
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 12255
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 12256
    invoke-virtual {p0, v1}, Lcom/c/b/i$c$a;->a(Lcom/c/b/i$c;)Lcom/c/b/i$c$a;

    .line 12255
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
    .line 12109
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 12110
    invoke-direct {p0}, Lcom/c/b/i$c$a;->u()Lcom/c/b/bn;

    .line 12111
    iget-object v0, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_0

    new-instance v0, Lcom/c/b/bp;

    invoke-direct {p0}, Lcom/c/b/i$c$a;->v()Lcom/c/b/i$e;

    move-result-object v1

    invoke-virtual {p0}, Lcom/c/b/i$c$a;->p()Lcom/c/b/as$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/c/b/i$c$a;->n()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/c/b/bp;-><init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V

    iput-object v0, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    .line 12113
    :cond_0
    return-void
.end method

.method private s()Lcom/c/b/i$c;
    .locals 2

    .prologue
    .line 12143
    invoke-direct {p0}, Lcom/c/b/i$c$a;->t()Lcom/c/b/i$c;

    move-result-object v0

    .line 12144
    invoke-virtual {v0}, Lcom/c/b/i$c;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 12145
    invoke-static {v0}, Lcom/c/b/i$c$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 12147
    :cond_0
    return-object v0
.end method

.method private t()Lcom/c/b/i$c;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 12151
    new-instance v2, Lcom/c/b/i$c;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$c;-><init>(Lcom/c/b/as$a;B)V

    .line 12152
    iget v3, p0, Lcom/c/b/i$c$a;->a:I

    .line 12154
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_4

    .line 12157
    :goto_0
    iget-object v1, p0, Lcom/c/b/i$c$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/c/b/i$c;->a(Lcom/c/b/i$c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12158
    iget-object v1, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_1

    .line 12159
    iget v1, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v1, v1, 0x2

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    .line 12160
    iget-object v1, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    .line 12161
    iget v1, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$c$a;->a:I

    .line 12163
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$c;->a(Lcom/c/b/i$c;Ljava/util/List;)Ljava/util/List;

    .line 12167
    :goto_1
    and-int/lit8 v1, v3, 0x4

    const/4 v3, 0x4

    if-ne v1, v3, :cond_3

    .line 12168
    or-int/lit8 v0, v0, 0x2

    move v1, v0

    .line 12170
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_2

    .line 12171
    iget-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    invoke-static {v2, v0}, Lcom/c/b/i$c;->a(Lcom/c/b/i$c;Lcom/c/b/i$e;)Lcom/c/b/i$e;

    .line 12175
    :goto_3
    invoke-static {v2, v1}, Lcom/c/b/i$c;->a(Lcom/c/b/i$c;I)I

    .line 12176
    invoke-virtual {p0}, Lcom/c/b/i$c$a;->l()V

    .line 12177
    return-object v2

    .line 12165
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$c;->a(Lcom/c/b/i$c;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 12173
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$e;

    invoke-static {v2, v0}, Lcom/c/b/i$c;->a(Lcom/c/b/i$c;Lcom/c/b/i$e;)Lcom/c/b/i$e;

    goto :goto_3

    :cond_3
    move v1, v0

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 12567
    iget-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 12568
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$c$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$c$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    .line 12574
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    .line 12576
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    return-object v0

    .line 12568
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private v()Lcom/c/b/i$e;
    .locals 1

    .prologue
    .line 12592
    iget-object v0, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 12593
    iget-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$e;->m()Lcom/c/b/i$e;

    move-result-object v0

    .line 12595
    :goto_0
    return-object v0

    .line 12593
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    goto :goto_0

    .line 12595
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$e;

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0, p1}, Lcom/c/b/i$c$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$c;)Lcom/c/b/i$c$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 12190
    invoke-static {}, Lcom/c/b/i$c;->m()Lcom/c/b/i$c;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 12227
    :goto_0
    return-object p0

    .line 12191
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$c;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 12192
    iget v1, p0, Lcom/c/b/i$c$a;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/i$c$a;->a:I

    .line 12193
    invoke-static {p1}, Lcom/c/b/i$c;->a(Lcom/c/b/i$c;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$c$a;->b:Ljava/lang/Object;

    .line 12194
    invoke-virtual {p0}, Lcom/c/b/i$c$a;->q()V

    .line 12196
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_6

    .line 12197
    invoke-static {p1}, Lcom/c/b/i$c;->b(Lcom/c/b/i$c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 12198
    iget-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12199
    invoke-static {p1}, Lcom/c/b/i$c;->b(Lcom/c/b/i$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    .line 12200
    iget v0, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/c/b/i$c$a;->a:I

    .line 12205
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$c$a;->q()V

    .line 12222
    :cond_2
    :goto_2
    invoke-virtual {p1}, Lcom/c/b/i$c;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12223
    invoke-virtual {p1}, Lcom/c/b/i$c;->l()Lcom/c/b/i$e;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    if-nez v1, :cond_a

    iget v1, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v1, v1, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_9

    iget-object v1, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    invoke-static {}, Lcom/c/b/i$e;->m()Lcom/c/b/i$e;

    move-result-object v2

    if-eq v1, v2, :cond_9

    iget-object v1, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    invoke-static {v1}, Lcom/c/b/i$e;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/c/b/i$e$a;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$e$a;->g()Lcom/c/b/i$e;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    :goto_3
    invoke-virtual {p0}, Lcom/c/b/i$c$a;->q()V

    :goto_4
    iget v0, p0, Lcom/c/b/i$c$a;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/c/b/i$c$a;->a:I

    .line 12225
    :cond_3
    iget-object v0, p1, Lcom/c/b/i$c;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$c$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 12226
    invoke-virtual {p0}, Lcom/c/b/i$c$a;->q()V

    goto :goto_0

    .line 12202
    :cond_4
    iget v0, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$c$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$c$a;->a:I

    .line 12203
    :cond_5
    iget-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$c;->b(Lcom/c/b/i$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 12208
    :cond_6
    invoke-static {p1}, Lcom/c/b/i$c;->b(Lcom/c/b/i$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 12209
    iget-object v1, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 12210
    iget-object v1, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 12211
    iput-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    .line 12212
    invoke-static {p1}, Lcom/c/b/i$c;->b(Lcom/c/b/i$c;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    .line 12213
    iget v1, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$c$a;->a:I

    .line 12214
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_7

    invoke-direct {p0}, Lcom/c/b/i$c$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_7
    iput-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    goto/16 :goto_2

    .line 12218
    :cond_8
    iget-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$c;->b(Lcom/c/b/i$c;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto/16 :goto_2

    .line 12223
    :cond_9
    iput-object v0, p0, Lcom/c/b/i$c$a;->e:Lcom/c/b/i$e;

    goto :goto_3

    :cond_a
    iget-object v1, p0, Lcom/c/b/i$c$a;->f:Lcom/c/b/bp;

    invoke-virtual {v1, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_4
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12231
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 12232
    iget-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$c$a;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$g;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$g;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 12241
    :cond_0
    :goto_3
    return v2

    .line 12231
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 12232
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$c$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$g;

    goto :goto_2

    .line 12231
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 12236
    :cond_4
    iget v0, p0, Lcom/c/b/i$c$a;->a:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    move v0, v3

    :goto_4
    if-eqz v0, :cond_5

    .line 12237
    invoke-direct {p0}, Lcom/c/b/i$c$a;->v()Lcom/c/b/i$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_5
    move v2, v3

    .line 12241
    goto :goto_3

    :cond_6
    move v0, v2

    .line 12236
    goto :goto_4
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0, p1}, Lcom/c/b/i$c$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$c$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 12093
    invoke-static {}, Lcom/c/b/i;->o()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$c;

    const-class v2, Lcom/c/b/i$c$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 12135
    invoke-static {}, Lcom/c/b/i;->n()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0}, Lcom/c/b/i$c$a;->t()Lcom/c/b/i$c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0}, Lcom/c/b/i$c$a;->s()Lcom/c/b/i$c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 12082
    invoke-direct {p0}, Lcom/c/b/i$c$a;->s()Lcom/c/b/i$c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 12082
    invoke-static {}, Lcom/c/b/i$c;->m()Lcom/c/b/i$c;

    move-result-object v0

    return-object v0
.end method
