.class public Lcom/facebook/widget/animatablelistview/k;
.super Ljava/lang/Object;
.source "AnimatingListTransactionBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/widget/animatablelistview/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/d",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TT;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/widget/animatablelistview/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/d",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    .line 33
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/k;->a:Lcom/facebook/widget/animatablelistview/d;

    .line 34
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/d;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->b:Lcom/google/common/a/es;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->b:Lcom/google/common/a/es;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    .line 36
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->e:Ljava/util/Set;

    .line 37
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->f:Ljava/util/Map;

    .line 38
    return-void
.end method

.method private a(Ljava/util/List;)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<TT;>;)",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 371
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 372
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 373
    iget-object v3, p0, Lcom/facebook/widget/animatablelistview/k;->e:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 375
    iget-object v3, p0, Lcom/facebook/widget/animatablelistview/k;->f:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 376
    iget-object v3, p0, Lcom/facebook/widget/animatablelistview/k;->f:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 378
    :cond_1
    invoke-virtual {v0, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 381
    :cond_2
    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public a(I)V
    .locals 4

    .prologue
    .line 222
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 223
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 224
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v2, Lcom/facebook/widget/animatablelistview/h;

    sget-object v3, Lcom/facebook/widget/animatablelistview/i;->REMOVE:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v2, v0, v3}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    return-void
.end method

.method public a(IILcom/facebook/widget/animatablelistview/o;)V
    .locals 4

    .prologue
    .line 324
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 325
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v2, Lcom/facebook/widget/animatablelistview/h;

    invoke-virtual {p3}, Lcom/facebook/widget/animatablelistview/o;->toMutationType()Lcom/facebook/widget/animatablelistview/i;

    move-result-object v3

    invoke-direct {v2, v0, v3, p2}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    return-void
.end method

.method public a(ILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v1, Lcom/facebook/widget/animatablelistview/h;

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->ADD:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v1, p2, v2}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 128
    return-void
.end method

.method public a(ILjava/lang/Object;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;Z)V"
        }
    .end annotation

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v1, Lcom/facebook/widget/animatablelistview/h;

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v1, p2, v2, p3}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 184
    return-void
.end method

.method public a(IZ)V
    .locals 4

    .prologue
    .line 251
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 252
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v2, Lcom/facebook/widget/animatablelistview/h;

    sget-object v3, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v2, v0, v3, p2}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;Z)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->e:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 257
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 97
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/animatablelistview/k;->a(Ljava/lang/Object;Z)V

    .line 98
    return-void
.end method

.method public a(Ljava/lang/Object;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v1, Lcom/facebook/widget/animatablelistview/h;

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v1, p1, v2, p2}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    return-void
.end method

.method public a(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TT;>;)V"
        }
    .end annotation

    .prologue
    .line 192
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 193
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v3, Lcom/facebook/widget/animatablelistview/h;

    sget-object v4, Lcom/facebook/widget/animatablelistview/i;->ADD:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v3, v1, v4}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 198
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 199
    return-void
.end method

.method public b()V
    .locals 4

    .prologue
    .line 363
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 364
    invoke-direct {p0, v0}, Lcom/facebook/widget/animatablelistview/k;->a(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v1

    .line 365
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    invoke-static {v2}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    .line 367
    iget-object v3, p0, Lcom/facebook/widget/animatablelistview/k;->a:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v3, p0, v0, v1, v2}, Lcom/facebook/widget/animatablelistview/d;->a(Lcom/facebook/widget/animatablelistview/k;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    .line 368
    return-void
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 238
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/animatablelistview/k;->a(IZ)V

    .line 239
    return-void
.end method

.method public b(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 166
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/widget/animatablelistview/k;->a(ILjava/lang/Object;Z)V

    .line 167
    return-void
.end method

.method public b(IZ)V
    .locals 4

    .prologue
    .line 281
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 282
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v2, Lcom/facebook/widget/animatablelistview/h;

    sget-object v3, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v2, v0, v3, p2}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;Z)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->e:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 287
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 389
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    return-object v0
.end method

.method public c(I)V
    .locals 1

    .prologue
    .line 268
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/animatablelistview/k;->b(IZ)V

    .line 269
    return-void
.end method

.method public c(ILjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 296
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 297
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v1, Lcom/facebook/widget/animatablelistview/h;

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->REPLACE:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v1, p2, v2}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 300
    return-void
.end method

.method public d(ILjava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 309
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->d:Ljava/util/List;

    new-instance v2, Lcom/facebook/widget/animatablelistview/h;

    sget-object v3, Lcom/facebook/widget/animatablelistview/i;->MARKED_FOR_REPLACE:Lcom/facebook/widget/animatablelistview/i;

    invoke-direct {v2, p2, v3}, Lcom/facebook/widget/animatablelistview/h;-><init>(Ljava/lang/Object;Lcom/facebook/widget/animatablelistview/i;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 313
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/k;->f:Ljava/util/Map;

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    return-void
.end method

.method public d(I)Z
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/k;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
