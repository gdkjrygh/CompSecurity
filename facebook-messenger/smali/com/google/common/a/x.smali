.class abstract Lcom/google/common/a/x;
.super Ljava/lang/Object;
.source "AbstractMultimap.java"

# interfaces
.implements Lcom/google/common/a/iw;
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/a/iw",
        "<TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private transient a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation
.end field

.field private transient b:I

.field private transient c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient d:Lcom/google/common/a/jf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jf",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient e:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;)V"
        }
    .end annotation

    .prologue
    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 120
    iput-object p1, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    .line 121
    return-void
.end method

.method static synthetic a(Lcom/google/common/a/x;I)I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Lcom/google/common/a/x;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/common/a/x;->b:I

    return v0
.end method

.method static synthetic a(Lcom/google/common/a/x;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lcom/google/common/a/x;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/x;->a(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 212
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 213
    if-nez v0, :cond_0

    .line 214
    invoke-virtual {p0, p1}, Lcom/google/common/a/x;->e(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    .line 215
    iget-object v1, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    :cond_0
    return-object v0
.end method

.method private a(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Collection",
            "<TV;>;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 364
    instance-of v0, p2, Ljava/util/SortedSet;

    if-eqz v0, :cond_0

    .line 365
    new-instance v0, Lcom/google/common/a/ap;

    check-cast p2, Ljava/util/SortedSet;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/common/a/ap;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/SortedSet;Lcom/google/common/a/ak;)V

    .line 371
    :goto_0
    return-object v0

    .line 366
    :cond_0
    instance-of v0, p2, Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 367
    new-instance v0, Lcom/google/common/a/ao;

    check-cast p2, Ljava/util/Set;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/common/a/ao;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Set;)V

    goto :goto_0

    .line 368
    :cond_1
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 369
    check-cast p2, Ljava/util/List;

    invoke-direct {p0, p1, p2, v1}, Lcom/google/common/a/x;->a(Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 371
    :cond_2
    new-instance v0, Lcom/google/common/a/ak;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/common/a/ak;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Collection;Lcom/google/common/a/ak;)V

    goto :goto_0
.end method

.method private a(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<TV;>;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 320
    instance-of v0, p1, Ljava/util/SortedSet;

    if-eqz v0, :cond_0

    .line 321
    check-cast p1, Ljava/util/SortedSet;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSortedSet(Ljava/util/SortedSet;)Ljava/util/SortedSet;

    move-result-object v0

    .line 327
    :goto_0
    return-object v0

    .line 322
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 323
    check-cast p1, Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    .line 324
    :cond_1
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 325
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 327
    :cond_2
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/common/a/x;Ljava/util/Collection;)Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lcom/google/common/a/x;->b(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)Ljava/util/List;
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/x;->a(Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/google/common/a/ak;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List",
            "<TV;>;",
            "Lcom/google/common/a/x",
            "<TK;TV;>.com/google/common/a/ak;)",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 377
    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/common/a/ah;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/common/a/ah;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/am;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/common/a/am;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/a/ak;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/common/a/x;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    return-object v0
.end method

.method private a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 871
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/common/a/aj;

    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/SortedMap;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/aj;-><init>(Lcom/google/common/a/x;Ljava/util/SortedMap;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/af;

    iget-object v1, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/af;-><init>(Lcom/google/common/a/x;Ljava/util/Map;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/common/a/x;)I
    .locals 2

    .prologue
    .line 88
    iget v0, p0, Lcom/google/common/a/x;->b:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/google/common/a/x;->b:I

    return v0
.end method

.method static synthetic b(Lcom/google/common/a/x;I)I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Lcom/google/common/a/x;->b:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/google/common/a/x;->b:I

    return v0
.end method

.method private b(Ljava/lang/Object;)I
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1012
    :try_start_0
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1020
    if-eqz v0, :cond_0

    .line 1021
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    .line 1022
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 1023
    iget v0, p0, Lcom/google/common/a/x;->b:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/common/a/x;->b:I

    :cond_0
    move v0, v1

    move v1, v0

    .line 1025
    :goto_0
    return v1

    .line 1015
    :catch_0
    move-exception v0

    goto :goto_0

    .line 1013
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private b(Ljava/util/Collection;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<TV;>;)",
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 640
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/common/a/x;)I
    .locals 2

    .prologue
    .line 88
    iget v0, p0, Lcom/google/common/a/x;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/common/a/x;->b:I

    return v0
.end method

.method private l()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1162
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/common/a/ai;

    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/SortedMap;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/ai;-><init>(Lcom/google/common/a/x;Ljava/util/SortedMap;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/ab;

    iget-object v1, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/ab;-><init>(Lcom/google/common/a/x;Ljava/util/Map;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .prologue
    .line 201
    invoke-direct {p0, p1}, Lcom/google/common/a/x;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    .line 203
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    iget v0, p0, Lcom/google/common/a/x;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/common/a/x;->b:I

    .line 205
    const/4 v0, 0x1

    .line 207
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Collection;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable",
            "<+TV;>;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 278
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 279
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 280
    invoke-virtual {p0, p1}, Lcom/google/common/a/x;->d(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    .line 296
    :goto_0
    return-object v0

    .line 283
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/common/a/x;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v1

    .line 284
    invoke-virtual {p0}, Lcom/google/common/a/x;->c()Ljava/util/Collection;

    move-result-object v2

    .line 285
    invoke-interface {v2, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 287
    iget v3, p0, Lcom/google/common/a/x;->b:I

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, p0, Lcom/google/common/a/x;->b:I

    .line 288
    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 290
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 291
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 292
    iget v3, p0, Lcom/google/common/a/x;->b:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/google/common/a/x;->b:I

    goto :goto_1

    .line 296
    :cond_2
    invoke-direct {p0, v2}, Lcom/google/common/a/x;->a(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    goto :goto_0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1157
    iget-object v0, p0, Lcom/google/common/a/x;->f:Ljava/util/Map;

    .line 1158
    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/common/a/x;->l()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/x;->f:Ljava/util/Map;

    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 193
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 194
    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method abstract c()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end method

.method public c(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 350
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 351
    if-nez v0, :cond_0

    .line 352
    invoke-virtual {p0, p1}, Lcom/google/common/a/x;->e(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    .line 354
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/google/common/a/x;->a(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Iterable;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable",
            "<+TV;>;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 241
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 258
    :goto_0
    return v0

    .line 244
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/common/a/x;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v1

    .line 245
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    .line 248
    instance-of v3, p2, Ljava/util/Collection;

    if-eqz v3, :cond_2

    .line 249
    invoke-static {p2}, Lcom/google/common/a/ax;->a(Ljava/lang/Iterable;)Ljava/util/Collection;

    move-result-object v0

    .line 250
    invoke-interface {v1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result v0

    .line 257
    :cond_1
    iget v3, p0, Lcom/google/common/a/x;->b:I

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    sub-int/2addr v1, v2

    add-int/2addr v1, v3

    iput v1, p0, Lcom/google/common/a/x;->b:I

    goto :goto_0

    .line 252
    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 253
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    goto :goto_1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 222
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 223
    if-nez v0, :cond_0

    .line 224
    const/4 v0, 0x0

    .line 234
    :goto_0
    return v0

    .line 227
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v1

    .line 228
    if-eqz v1, :cond_1

    .line 229
    iget v2, p0, Lcom/google/common/a/x;->b:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/google/common/a/x;->b:I

    .line 230
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    move v0, v1

    .line 234
    goto :goto_0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 167
    iget v0, p0, Lcom/google/common/a/x;->b:I

    return v0
.end method

.method public d(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 306
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 307
    invoke-virtual {p0}, Lcom/google/common/a/x;->c()Ljava/util/Collection;

    move-result-object v1

    .line 309
    if-eqz v0, :cond_0

    .line 310
    invoke-interface {v1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 311
    iget v2, p0, Lcom/google/common/a/x;->b:I

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/google/common/a/x;->b:I

    .line 312
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 315
    :cond_0
    invoke-direct {p0, v1}, Lcom/google/common/a/x;->a(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method e(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 156
    invoke-virtual {p0}, Lcom/google/common/a/x;->c()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 172
    iget v0, p0, Lcom/google/common/a/x;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 1352
    if-ne p1, p0, :cond_0

    .line 1353
    const/4 v0, 0x1

    .line 1359
    :goto_0
    return v0

    .line 1355
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/iw;

    if-eqz v0, :cond_1

    .line 1356
    check-cast p1, Lcom/google/common/a/iw;

    .line 1357
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 1359
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 2

    .prologue
    .line 334
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 335
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    goto :goto_0

    .line 337
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 338
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/common/a/x;->b:I

    .line 339
    return-void
.end method

.method public f(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 177
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 866
    iget-object v0, p0, Lcom/google/common/a/x;->c:Ljava/util/Set;

    .line 867
    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/common/a/x;->a()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/x;->c:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public h()Lcom/google/common/a/jf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jf",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 994
    iget-object v0, p0, Lcom/google/common/a/x;->d:Lcom/google/common/a/jf;

    .line 995
    if-nez v0, :cond_0

    .line 996
    new-instance v0, Lcom/google/common/a/y;

    invoke-direct {v0, p0}, Lcom/google/common/a/y;-><init>(Lcom/google/common/a/x;)V

    iput-object v0, p0, Lcom/google/common/a/x;->d:Lcom/google/common/a/jf;

    .line 1002
    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 1371
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1068
    iget-object v0, p0, Lcom/google/common/a/x;->e:Ljava/util/Collection;

    .line 1069
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/x;->j()Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/x;->e:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method

.method j()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1073
    instance-of v0, p0, Lcom/google/common/a/kk;

    if-eqz v0, :cond_0

    .line 1074
    new-instance v0, Lcom/google/common/a/z;

    invoke-direct {v0, p0}, Lcom/google/common/a/z;-><init>(Lcom/google/common/a/x;)V

    .line 1084
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/aa;

    invoke-direct {v0, p0}, Lcom/google/common/a/aa;-><init>(Lcom/google/common/a/x;)V

    goto :goto_0
.end method

.method k()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1104
    new-instance v0, Lcom/google/common/a/ae;

    invoke-direct {v0, p0}, Lcom/google/common/a/ae;-><init>(Lcom/google/common/a/x;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1382
    iget-object v0, p0, Lcom/google/common/a/x;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
