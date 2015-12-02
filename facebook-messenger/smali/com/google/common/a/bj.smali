.class Lcom/google/common/a/bj;
.super Ljava/util/AbstractMap;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/concurrent/ConcurrentMap;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap",
        "<TK;TV;>;",
        "Ljava/io/Serializable;",
        "Ljava/util/concurrent/ConcurrentMap",
        "<TK;TV;>;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field static final q:Lcom/google/common/a/dd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/dd",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field static final r:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient b:I

.field final transient c:I

.field final transient d:[Lcom/google/common/a/cn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final e:I

.field final f:Lcom/google/common/base/Equivalence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final g:Lcom/google/common/base/Equivalence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final h:Lcom/google/common/a/ct;

.field final i:Lcom/google/common/a/ct;

.field final j:I

.field final k:J

.field final l:J

.field final m:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/google/common/a/ij",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field final n:Lcom/google/common/a/ii;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ii",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final transient o:Lcom/google/common/a/bn;

.field final p:Lcom/google/common/base/Ticker;

.field s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation
.end field

.field t:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end field

.field u:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 136
    const-class v0, Lcom/google/common/a/bj;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/common/a/bj;->a:Ljava/util/logging/Logger;

    .line 630
    new-instance v0, Lcom/google/common/a/bk;

    invoke-direct {v0}, Lcom/google/common/a/bk;-><init>()V

    sput-object v0, Lcom/google/common/a/bj;->q:Lcom/google/common/a/dd;

    .line 920
    new-instance v0, Lcom/google/common/a/bl;

    invoke-direct {v0}, Lcom/google/common/a/bl;-><init>()V

    sput-object v0, Lcom/google/common/a/bj;->r:Ljava/util/Queue;

    return-void
.end method

.method constructor <init>(Lcom/google/common/a/hy;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 196
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 197
    invoke-virtual {p1}, Lcom/google/common/a/hy;->e()I

    move-result v0

    const/high16 v1, 0x10000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/google/common/a/bj;->e:I

    .line 199
    invoke-virtual {p1}, Lcom/google/common/a/hy;->g()Lcom/google/common/a/ct;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/bj;->h:Lcom/google/common/a/ct;

    .line 200
    invoke-virtual {p1}, Lcom/google/common/a/hy;->j()Lcom/google/common/a/ct;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/bj;->i:Lcom/google/common/a/ct;

    .line 202
    invoke-virtual {p1}, Lcom/google/common/a/hy;->b()Lcom/google/common/base/Equivalence;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/bj;->f:Lcom/google/common/base/Equivalence;

    .line 203
    invoke-virtual {p1}, Lcom/google/common/a/hy;->c()Lcom/google/common/base/Equivalence;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/bj;->g:Lcom/google/common/base/Equivalence;

    .line 205
    iget v0, p1, Lcom/google/common/a/hy;->e:I

    iput v0, p0, Lcom/google/common/a/bj;->j:I

    .line 206
    invoke-virtual {p1}, Lcom/google/common/a/hy;->l()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/common/a/bj;->k:J

    .line 207
    invoke-virtual {p1}, Lcom/google/common/a/hy;->k()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/common/a/bj;->l:J

    .line 209
    iget-object v0, p0, Lcom/google/common/a/bj;->h:Lcom/google/common/a/ct;

    invoke-virtual {p0}, Lcom/google/common/a/bj;->b()Z

    move-result v1

    invoke-virtual {p0}, Lcom/google/common/a/bj;->a()Z

    move-result v3

    invoke-static {v0, v1, v3}, Lcom/google/common/a/bn;->getFactory(Lcom/google/common/a/ct;ZZ)Lcom/google/common/a/bn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/bj;->o:Lcom/google/common/a/bn;

    .line 210
    invoke-virtual {p1}, Lcom/google/common/a/hy;->m()Lcom/google/common/base/Ticker;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/bj;->p:Lcom/google/common/base/Ticker;

    .line 212
    invoke-virtual {p1}, Lcom/google/common/a/hy;->a()Lcom/google/common/a/ii;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/bj;->n:Lcom/google/common/a/ii;

    .line 213
    iget-object v0, p0, Lcom/google/common/a/bj;->n:Lcom/google/common/a/ii;

    sget-object v1, Lcom/google/common/a/eb;->INSTANCE:Lcom/google/common/a/eb;

    if-ne v0, v1, :cond_2

    invoke-static {}, Lcom/google/common/a/bj;->i()Ljava/util/Queue;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/common/a/bj;->m:Ljava/util/Queue;

    .line 217
    invoke-virtual {p1}, Lcom/google/common/a/hy;->d()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 218
    invoke-virtual {p0}, Lcom/google/common/a/bj;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 219
    iget v1, p0, Lcom/google/common/a/bj;->j:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_0
    move v1, v2

    move v3, v4

    .line 228
    :goto_1
    iget v5, p0, Lcom/google/common/a/bj;->e:I

    if-ge v1, v5, :cond_3

    invoke-virtual {p0}, Lcom/google/common/a/bj;->a()Z

    move-result v5

    if-eqz v5, :cond_1

    mul-int/lit8 v5, v1, 0x2

    iget v6, p0, Lcom/google/common/a/bj;->j:I

    if-gt v5, v6, :cond_3

    .line 229
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 230
    shl-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 213
    :cond_2
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    goto :goto_0

    .line 232
    :cond_3
    rsub-int/lit8 v3, v3, 0x20

    iput v3, p0, Lcom/google/common/a/bj;->c:I

    .line 233
    add-int/lit8 v3, v1, -0x1

    iput v3, p0, Lcom/google/common/a/bj;->b:I

    .line 235
    invoke-virtual {p0, v1}, Lcom/google/common/a/bj;->d(I)[Lcom/google/common/a/cn;

    move-result-object v3

    iput-object v3, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    .line 237
    div-int v3, v0, v1

    .line 238
    mul-int v5, v3, v1

    if-ge v5, v0, :cond_8

    .line 239
    add-int/lit8 v0, v3, 0x1

    .line 243
    :goto_2
    if-ge v2, v0, :cond_4

    .line 244
    shl-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 247
    :cond_4
    invoke-virtual {p0}, Lcom/google/common/a/bj;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 249
    iget v0, p0, Lcom/google/common/a/bj;->j:I

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    .line 250
    iget v3, p0, Lcom/google/common/a/bj;->j:I

    rem-int v1, v3, v1

    .line 251
    :goto_3
    iget-object v3, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    array-length v3, v3

    if-ge v4, v3, :cond_7

    .line 252
    if-ne v4, v1, :cond_5

    .line 253
    add-int/lit8 v0, v0, -0x1

    .line 255
    :cond_5
    iget-object v3, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    invoke-virtual {p0, v2, v0}, Lcom/google/common/a/bj;->a(II)Lcom/google/common/a/cn;

    move-result-object v5

    aput-object v5, v3, v4

    .line 251
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 259
    :cond_6
    :goto_4
    iget-object v0, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    array-length v0, v0

    if-ge v4, v0, :cond_7

    .line 260
    iget-object v0, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    const/4 v1, -0x1

    invoke-virtual {p0, v2, v1}, Lcom/google/common/a/bj;->a(II)Lcom/google/common/a/cn;

    move-result-object v1

    aput-object v1, v0, v4

    .line 259
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 264
    :cond_7
    return-void

    :cond_8
    move v0, v3

    goto :goto_2
.end method

.method static a(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation

    .prologue
    .line 1979
    invoke-interface {p0, p1}, Lcom/google/common/a/cm;->setNextExpirable(Lcom/google/common/a/cm;)V

    .line 1980
    invoke-interface {p1, p0}, Lcom/google/common/a/cm;->setPreviousExpirable(Lcom/google/common/a/cm;)V

    .line 1981
    return-void
.end method

.method static b(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation

    .prologue
    .line 2011
    invoke-interface {p0, p1}, Lcom/google/common/a/cm;->setNextEvictable(Lcom/google/common/a/cm;)V

    .line 2012
    invoke-interface {p1, p0}, Lcom/google/common/a/cm;->setPreviousEvictable(Lcom/google/common/a/cm;)V

    .line 2013
    return-void
.end method

.method static c(I)I
    .locals 3

    .prologue
    .line 1863
    shl-int/lit8 v0, p0, 0xf

    xor-int/lit16 v0, v0, -0x3283

    add-int/2addr v0, p0

    .line 1864
    ushr-int/lit8 v1, v0, 0xa

    xor-int/2addr v0, v1

    .line 1865
    shl-int/lit8 v1, v0, 0x3

    add-int/2addr v0, v1

    .line 1866
    ushr-int/lit8 v1, v0, 0x6

    xor-int/2addr v0, v1

    .line 1867
    shl-int/lit8 v1, v0, 0x2

    shl-int/lit8 v2, v0, 0xe

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 1868
    ushr-int/lit8 v1, v0, 0x10

    xor-int/2addr v0, v1

    return v0
.end method

.method static d(Lcom/google/common/a/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation

    .prologue
    .line 1985
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    .line 1986
    invoke-interface {p0, v0}, Lcom/google/common/a/cm;->setNextExpirable(Lcom/google/common/a/cm;)V

    .line 1987
    invoke-interface {p0, v0}, Lcom/google/common/a/cm;->setPreviousExpirable(Lcom/google/common/a/cm;)V

    .line 1988
    return-void
.end method

.method static e(Lcom/google/common/a/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation

    .prologue
    .line 2017
    invoke-static {}, Lcom/google/common/a/bj;->h()Lcom/google/common/a/cm;

    move-result-object v0

    .line 2018
    invoke-interface {p0, v0}, Lcom/google/common/a/cm;->setNextEvictable(Lcom/google/common/a/cm;)V

    .line 2019
    invoke-interface {p0, v0}, Lcom/google/common/a/cm;->setPreviousEvictable(Lcom/google/common/a/cm;)V

    .line 2020
    return-void
.end method

.method static g()Lcom/google/common/a/dd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 666
    sget-object v0, Lcom/google/common/a/bj;->q:Lcom/google/common/a/dd;

    return-object v0
.end method

.method static h()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 917
    sget-object v0, Lcom/google/common/a/cl;->INSTANCE:Lcom/google/common/a/cl;

    return-object v0
.end method

.method static i()Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Queue",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 952
    sget-object v0, Lcom/google/common/a/bj;->r:Ljava/util/Queue;

    return-object v0
.end method


# virtual methods
.method a(II)Lcom/google/common/a/cn;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1937
    new-instance v0, Lcom/google/common/a/cn;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/common/a/cn;-><init>(Lcom/google/common/a/bj;II)V

    return-object v0
.end method

.method a(Lcom/google/common/a/cm;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1912
    invoke-interface {p1}, Lcom/google/common/a/cm;->getHash()I

    move-result v0

    .line 1913
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/common/a/cn;->a(Lcom/google/common/a/cm;I)Z

    .line 1914
    return-void
.end method

.method a(Lcom/google/common/a/dd;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1906
    invoke-interface {p1}, Lcom/google/common/a/dd;->a()Lcom/google/common/a/cm;

    move-result-object v0

    .line 1907
    invoke-interface {v0}, Lcom/google/common/a/cm;->getHash()I

    move-result v1

    .line 1908
    invoke-virtual {p0, v1}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/common/a/cm;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0, v1, p1}, Lcom/google/common/a/cn;->a(Ljava/lang/Object;ILcom/google/common/a/dd;)Z

    .line 1909
    return-void
.end method

.method a()Z
    .locals 2

    .prologue
    .line 267
    iget v0, p0, Lcom/google/common/a/bj;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lcom/google/common/a/cm;J)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;J)Z"
        }
    .end annotation

    .prologue
    .line 1974
    invoke-interface {p1}, Lcom/google/common/a/cm;->getExpirationTime()J

    move-result-wide v0

    sub-long v0, p2, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method b(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1901
    iget-object v0, p0, Lcom/google/common/a/bj;->f:Lcom/google/common/base/Equivalence;

    invoke-virtual {v0, p1}, Lcom/google/common/base/Equivalence;->hash(Ljava/lang/Object;)I

    move-result v0

    .line 1902
    invoke-static {v0}, Lcom/google/common/a/bj;->c(I)I

    move-result v0

    return v0
.end method

.method b(I)Lcom/google/common/a/cn;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1933
    iget-object v0, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    iget v1, p0, Lcom/google/common/a/bj;->c:I

    ushr-int v1, p1, v1

    iget v2, p0, Lcom/google/common/a/bj;->b:I

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method

.method b(Lcom/google/common/a/cm;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)TV;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 1946
    invoke-interface {p1}, Lcom/google/common/a/cm;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1957
    :cond_0
    :goto_0
    return-object v0

    .line 1949
    :cond_1
    invoke-interface {p1}, Lcom/google/common/a/cm;->getValueReference()Lcom/google/common/a/dd;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/common/a/dd;->get()Ljava/lang/Object;

    move-result-object v1

    .line 1950
    if-eqz v1, :cond_0

    .line 1954
    invoke-virtual {p0}, Lcom/google/common/a/bj;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->c(Lcom/google/common/a/cm;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move-object v0, v1

    .line 1957
    goto :goto_0
.end method

.method b()Z
    .locals 1

    .prologue
    .line 271
    invoke-virtual {p0}, Lcom/google/common/a/bj;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/bj;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method c()Z
    .locals 4

    .prologue
    .line 275
    iget-wide v0, p0, Lcom/google/common/a/bj;->l:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method c(Lcom/google/common/a/cm;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 1966
    iget-object v0, p0, Lcom/google/common/a/bj;->p:Lcom/google/common/base/Ticker;

    invoke-virtual {v0}, Lcom/google/common/base/Ticker;->read()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/common/a/bj;->a(Lcom/google/common/a/cm;J)Z

    move-result v0

    return v0
.end method

.method public clear()V
    .locals 4

    .prologue
    .line 3615
    iget-object v1, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 3616
    invoke-virtual {v3}, Lcom/google/common/a/cn;->m()V

    .line 3615
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3618
    :cond_0
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 3507
    if-nez p1, :cond_0

    .line 3508
    const/4 v0, 0x0

    .line 3511
    :goto_0
    return v0

    .line 3510
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3511
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/common/a/cn;->d(Ljava/lang/Object;I)Z

    move-result v0

    goto :goto_0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 14
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 3516
    if-nez p1, :cond_0

    .line 3517
    const/4 v0, 0x0

    .line 3550
    :goto_0
    return v0

    .line 3525
    :cond_0
    iget-object v8, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    .line 3526
    const-wide/16 v3, -0x1

    .line 3527
    const/4 v0, 0x0

    move v5, v0

    move-wide v6, v3

    :goto_1
    const/4 v0, 0x3

    if-ge v5, v0, :cond_5

    .line 3528
    const-wide/16 v1, 0x0

    .line 3529
    array-length v9, v8

    const/4 v0, 0x0

    move-wide v3, v1

    move v2, v0

    :goto_2
    if-ge v2, v9, :cond_4

    aget-object v10, v8, v2

    .line 3532
    iget v0, v10, Lcom/google/common/a/cn;->b:I

    .line 3534
    iget-object v11, v10, Lcom/google/common/a/cn;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3535
    const/4 v0, 0x0

    move v1, v0

    :goto_3
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 3536
    invoke-virtual {v11, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/cm;

    :goto_4
    if-eqz v0, :cond_2

    .line 3537
    invoke-virtual {v10, v0}, Lcom/google/common/a/cn;->f(Lcom/google/common/a/cm;)Ljava/lang/Object;

    move-result-object v12

    .line 3538
    if-eqz v12, :cond_1

    iget-object v13, p0, Lcom/google/common/a/bj;->g:Lcom/google/common/base/Equivalence;

    invoke-virtual {v13, p1, v12}, Lcom/google/common/base/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 3539
    const/4 v0, 0x1

    goto :goto_0

    .line 3536
    :cond_1
    invoke-interface {v0}, Lcom/google/common/a/cm;->getNext()Lcom/google/common/a/cm;

    move-result-object v0

    goto :goto_4

    .line 3535
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 3543
    :cond_3
    iget v0, v10, Lcom/google/common/a/cn;->c:I

    int-to-long v0, v0

    add-long/2addr v3, v0

    .line 3529
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 3545
    :cond_4
    cmp-long v0, v3, v6

    if-nez v0, :cond_6

    .line 3550
    :cond_5
    const/4 v0, 0x0

    goto :goto_0

    .line 3527
    :cond_6
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    move-wide v6, v3

    goto :goto_1
.end method

.method d()Z
    .locals 4

    .prologue
    .line 279
    iget-wide v0, p0, Lcom/google/common/a/bj;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d(I)[Lcom/google/common/a/cn;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 2024
    new-array v0, p1, [Lcom/google/common/a/cn;

    return-object v0
.end method

.method e()Z
    .locals 2

    .prologue
    .line 283
    iget-object v0, p0, Lcom/google/common/a/bj;->h:Lcom/google/common/a/ct;

    sget-object v1, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 3640
    iget-object v0, p0, Lcom/google/common/a/bj;->u:Ljava/util/Set;

    .line 3641
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/cb;

    invoke-direct {v0, p0}, Lcom/google/common/a/cb;-><init>(Lcom/google/common/a/bj;)V

    iput-object v0, p0, Lcom/google/common/a/bj;->u:Ljava/util/Set;

    goto :goto_0
.end method

.method f()Z
    .locals 2

    .prologue
    .line 287
    iget-object v0, p0, Lcom/google/common/a/bj;->i:Lcom/google/common/a/ct;

    sget-object v1, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 3475
    if-nez p1, :cond_0

    .line 3476
    const/4 v0, 0x0

    .line 3479
    :goto_0
    return-object v0

    .line 3478
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3479
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/common/a/cn;->c(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 9

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    .line 3440
    .line 3441
    iget-object v6, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    move v0, v1

    move-wide v2, v4

    .line 3442
    :goto_0
    array-length v7, v6

    if-ge v0, v7, :cond_2

    .line 3443
    aget-object v7, v6, v0

    iget v7, v7, Lcom/google/common/a/cn;->b:I

    if-eqz v7, :cond_1

    .line 3460
    :cond_0
    :goto_1
    return v1

    .line 3446
    :cond_1
    aget-object v7, v6, v0

    iget v7, v7, Lcom/google/common/a/cn;->c:I

    int-to-long v7, v7

    add-long/2addr v2, v7

    .line 3442
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3449
    :cond_2
    cmp-long v0, v2, v4

    if-eqz v0, :cond_4

    move v0, v1

    .line 3450
    :goto_2
    array-length v7, v6

    if-ge v0, v7, :cond_3

    .line 3451
    aget-object v7, v6, v0

    iget v7, v7, Lcom/google/common/a/cn;->b:I

    if-nez v7, :cond_0

    .line 3454
    aget-object v7, v6, v0

    iget v7, v7, Lcom/google/common/a/cn;->c:I

    int-to-long v7, v7

    sub-long/2addr v2, v7

    .line 3450
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 3456
    :cond_3
    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    .line 3460
    :cond_4
    const/4 v1, 0x1

    goto :goto_1
.end method

.method j()V
    .locals 4

    .prologue
    .line 1999
    :goto_0
    iget-object v0, p0, Lcom/google/common/a/bj;->m:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ij;

    if-eqz v0, :cond_0

    .line 2001
    :try_start_0
    iget-object v1, p0, Lcom/google/common/a/bj;->n:Lcom/google/common/a/ii;

    invoke-interface {v1, v0}, Lcom/google/common/a/ii;->onRemoval(Lcom/google/common/a/ij;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2002
    :catch_0
    move-exception v0

    .line 2003
    sget-object v1, Lcom/google/common/a/bj;->a:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "Exception thrown by removal listener"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 2006
    :cond_0
    return-void
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 3624
    iget-object v0, p0, Lcom/google/common/a/bj;->s:Ljava/util/Set;

    .line 3625
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/ck;

    invoke-direct {v0, p0}, Lcom/google/common/a/ck;-><init>(Lcom/google/common/a/bj;)V

    iput-object v0, p0, Lcom/google/common/a/bj;->s:Ljava/util/Set;

    goto :goto_0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 3555
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3556
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3557
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3558
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, p2, v2}, Lcom/google/common/a/cn;->a(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .line 3571
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 3572
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/google/common/a/bj;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 3574
    :cond_0
    return-void
.end method

.method public putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 3563
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3564
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3565
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3566
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, Lcom/google/common/a/cn;->a(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 3578
    if-nez p1, :cond_0

    .line 3579
    const/4 v0, 0x0

    .line 3582
    :goto_0
    return-object v0

    .line 3581
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3582
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/common/a/cn;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 3587
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 3588
    :cond_0
    const/4 v0, 0x0

    .line 3591
    :goto_0
    return v0

    .line 3590
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3591
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, Lcom/google/common/a/cn;->b(Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 3607
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3608
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3609
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3610
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, Lcom/google/common/a/cn;->a(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;TV;)Z"
        }
    .end annotation

    .prologue
    .line 3596
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3597
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3598
    if-nez p2, :cond_0

    .line 3599
    const/4 v0, 0x0

    .line 3602
    :goto_0
    return v0

    .line 3601
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/common/a/bj;->b(Ljava/lang/Object;)I

    move-result v0

    .line 3602
    invoke-virtual {p0, v0}, Lcom/google/common/a/bj;->b(I)Lcom/google/common/a/cn;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2, p3}, Lcom/google/common/a/cn;->a(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public size()I
    .locals 6

    .prologue
    .line 3465
    iget-object v3, p0, Lcom/google/common/a/bj;->d:[Lcom/google/common/a/cn;

    .line 3466
    const-wide/16 v1, 0x0

    .line 3467
    const/4 v0, 0x0

    :goto_0
    array-length v4, v3

    if-ge v0, v4, :cond_0

    .line 3468
    aget-object v4, v3, v0

    iget v4, v4, Lcom/google/common/a/cn;->b:I

    int-to-long v4, v4

    add-long/2addr v1, v4

    .line 3467
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3470
    :cond_0
    invoke-static {v1, v2}, Lcom/google/common/c/a;->b(J)I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 3632
    iget-object v0, p0, Lcom/google/common/a/bj;->t:Ljava/util/Collection;

    .line 3633
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/de;

    invoke-direct {v0, p0}, Lcom/google/common/a/de;-><init>(Lcom/google/common/a/bj;)V

    iput-object v0, p0, Lcom/google/common/a/bj;->t:Ljava/util/Collection;

    goto :goto_0
.end method
