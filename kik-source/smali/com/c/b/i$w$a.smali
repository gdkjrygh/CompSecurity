.class public final Lcom/c/b/i$w$a;
.super Lcom/c/b/as$c;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$w;
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
    .line 26059
    invoke-direct {p0}, Lcom/c/b/as$c;-><init>()V

    .line 26262
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    .line 26060
    invoke-direct {p0}, Lcom/c/b/i$w$a;->s()V

    .line 26061
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 26041
    invoke-direct {p0}, Lcom/c/b/i$w$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 26065
    invoke-direct {p0, p1}, Lcom/c/b/as$c;-><init>(Lcom/c/b/as$b;)V

    .line 26262
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    .line 26066
    invoke-direct {p0}, Lcom/c/b/i$w$a;->s()V

    .line 26067
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 26041
    invoke-direct {p0, p1}, Lcom/c/b/i$w$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/c/b/i$w$a;
    .locals 1

    .prologue
    .line 26126
    instance-of v0, p1, Lcom/c/b/i$w;

    if-eqz v0, :cond_0

    .line 26127
    check-cast p1, Lcom/c/b/i$w;

    invoke-virtual {p0, p1}, Lcom/c/b/i$w$a;->a(Lcom/c/b/i$w;)Lcom/c/b/i$w$a;

    move-result-object p0

    .line 26130
    :goto_0
    return-object p0

    .line 26129
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$c;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$w$a;
    .locals 4

    .prologue
    .line 26187
    const/4 v2, 0x0

    .line 26189
    :try_start_0
    sget-object v0, Lcom/c/b/i$w;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$w;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26194
    if-eqz v0, :cond_0

    .line 26195
    invoke-virtual {p0, v0}, Lcom/c/b/i$w$a;->a(Lcom/c/b/i$w;)Lcom/c/b/i$w$a;

    .line 26198
    :cond_0
    return-object p0

    .line 26190
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 26191
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$w;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26192
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26194
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 26195
    invoke-virtual {p0, v1}, Lcom/c/b/i$w$a;->a(Lcom/c/b/i$w;)Lcom/c/b/i$w$a;

    .line 26194
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
    .line 26069
    sget-boolean v0, Lcom/c/b/as;->d:Z

    if-eqz v0, :cond_0

    .line 26070
    invoke-direct {p0}, Lcom/c/b/i$w$a;->u()Lcom/c/b/bn;

    .line 26072
    :cond_0
    return-void
.end method

.method private t()Lcom/c/b/i$w;
    .locals 2

    .prologue
    .line 26096
    invoke-virtual {p0}, Lcom/c/b/i$w$a;->g()Lcom/c/b/i$w;

    move-result-object v0

    .line 26097
    invoke-virtual {v0}, Lcom/c/b/i$w;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 26098
    invoke-static {v0}, Lcom/c/b/i$w$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 26100
    :cond_0
    return-object v0
.end method

.method private u()Lcom/c/b/bn;
    .locals 5

    .prologue
    .line 26562
    iget-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_0

    .line 26563
    new-instance v1, Lcom/c/b/bn;

    iget-object v2, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$w$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/c/b/i$w$a;->p()Lcom/c/b/as$b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/c/b/i$w$a;->n()Z

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/c/b/bn;-><init>(Ljava/util/List;ZLcom/c/b/as$b;Z)V

    iput-object v1, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    .line 26569
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    .line 26571
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    return-object v0

    .line 26563
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 26041
    invoke-direct {p0, p1}, Lcom/c/b/i$w$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$w$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 26041
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$w$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$w$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/i$w;)Lcom/c/b/i$w$a;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 26135
    invoke-static {}, Lcom/c/b/i$w;->k()Lcom/c/b/i$w;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 26168
    :goto_0
    return-object p0

    .line 26136
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/i$w;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 26137
    invoke-virtual {p1}, Lcom/c/b/i$w;->i()Z

    move-result v1

    iget v2, p0, Lcom/c/b/i$w$a;->a:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$w$a;->a:I

    iput-boolean v1, p0, Lcom/c/b/i$w$a;->b:Z

    invoke-virtual {p0}, Lcom/c/b/i$w$a;->q()V

    .line 26139
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_5

    .line 26140
    invoke-static {p1}, Lcom/c/b/i$w;->b(Lcom/c/b/i$w;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 26141
    iget-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 26142
    invoke-static {p1}, Lcom/c/b/i$w;->b(Lcom/c/b/i$w;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    .line 26143
    iget v0, p0, Lcom/c/b/i$w$a;->a:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/c/b/i$w$a;->a:I

    .line 26148
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$w$a;->q()V

    .line 26165
    :cond_2
    :goto_2
    invoke-virtual {p0, p1}, Lcom/c/b/i$w$a;->a(Lcom/c/b/as$d;)V

    .line 26166
    iget-object v0, p1, Lcom/c/b/i$w;->e:Lcom/c/b/by;

    invoke-virtual {p0, v0}, Lcom/c/b/i$w$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 26167
    invoke-virtual {p0}, Lcom/c/b/i$w$a;->q()V

    goto :goto_0

    .line 26145
    :cond_3
    iget v0, p0, Lcom/c/b/i$w$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    iget v0, p0, Lcom/c/b/i$w$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$w$a;->a:I

    .line 26146
    :cond_4
    iget-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    invoke-static {p1}, Lcom/c/b/i$w;->b(Lcom/c/b/i$w;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 26151
    :cond_5
    invoke-static {p1}, Lcom/c/b/i$w;->b(Lcom/c/b/i$w;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 26152
    iget-object v1, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->d()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 26153
    iget-object v1, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->b()V

    .line 26154
    iput-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    .line 26155
    invoke-static {p1}, Lcom/c/b/i$w;->b(Lcom/c/b/i$w;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    .line 26156
    iget v1, p0, Lcom/c/b/i$w$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$w$a;->a:I

    .line 26157
    sget-boolean v1, Lcom/c/b/as;->d:Z

    if-eqz v1, :cond_6

    invoke-direct {p0}, Lcom/c/b/i$w$a;->u()Lcom/c/b/bn;

    move-result-object v0

    :cond_6
    iput-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    goto :goto_2

    .line 26161
    :cond_7
    iget-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    invoke-static {p1}, Lcom/c/b/i$w;->b(Lcom/c/b/i$w;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(Ljava/lang/Iterable;)Lcom/c/b/bn;

    goto :goto_2
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 26172
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 26173
    iget-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    :goto_2
    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 26180
    :cond_0
    :goto_3
    return v2

    .line 26172
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    goto :goto_1

    .line 26173
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    invoke-virtual {v0, v1}, Lcom/c/b/bn;->a(I)Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    goto :goto_2

    .line 26172
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 26177
    :cond_4
    invoke-virtual {p0}, Lcom/c/b/i$w$a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26180
    const/4 v2, 0x1

    goto :goto_3
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 26041
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$w$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$w$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 26041
    invoke-direct {p0, p1}, Lcom/c/b/i$w$a;->d(Lcom/c/b/bd;)Lcom/c/b/i$w$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 26041
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$w$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/i$w$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 26053
    invoke-static {}, Lcom/c/b/i;->I()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$w;

    const-class v2, Lcom/c/b/i$w$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 26088
    invoke-static {}, Lcom/c/b/i;->H()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/i$w;
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 26104
    new-instance v2, Lcom/c/b/i$w;

    invoke-direct {v2, p0, v1}, Lcom/c/b/i$w;-><init>(Lcom/c/b/as$c;B)V

    .line 26105
    iget v3, p0, Lcom/c/b/i$w$a;->a:I

    .line 26107
    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_2

    .line 26110
    :goto_0
    iget-boolean v1, p0, Lcom/c/b/i$w$a;->b:Z

    invoke-static {v2, v1}, Lcom/c/b/i$w;->a(Lcom/c/b/i$w;Z)Z

    .line 26111
    iget-object v1, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    if-nez v1, :cond_1

    .line 26112
    iget v1, p0, Lcom/c/b/i$w$a;->a:I

    and-int/lit8 v1, v1, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 26113
    iget-object v1, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    .line 26114
    iget v1, p0, Lcom/c/b/i$w$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/c/b/i$w$a;->a:I

    .line 26116
    :cond_0
    iget-object v1, p0, Lcom/c/b/i$w$a;->c:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/c/b/i$w;->a(Lcom/c/b/i$w;Ljava/util/List;)Ljava/util/List;

    .line 26120
    :goto_1
    invoke-static {v2, v0}, Lcom/c/b/i$w;->a(Lcom/c/b/i$w;I)I

    .line 26121
    invoke-virtual {p0}, Lcom/c/b/i$w$a;->l()V

    .line 26122
    return-object v2

    .line 26118
    :cond_1
    iget-object v1, p0, Lcom/c/b/i$w$a;->d:Lcom/c/b/bn;

    invoke-virtual {v1}, Lcom/c/b/bn;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/c/b/i$w;->a(Lcom/c/b/i$w;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 26041
    invoke-virtual {p0}, Lcom/c/b/i$w$a;->g()Lcom/c/b/i$w;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 26041
    invoke-direct {p0}, Lcom/c/b/i$w$a;->t()Lcom/c/b/i$w;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 26041
    invoke-direct {p0}, Lcom/c/b/i$w$a;->t()Lcom/c/b/i$w;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 26041
    invoke-static {}, Lcom/c/b/i$w;->k()Lcom/c/b/i$w;

    move-result-object v0

    return-object v0
.end method
