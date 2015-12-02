.class public Lcom/google/common/a/fp;
.super Lcom/google/common/a/fx;
.source "ImmutableSortedMap.java"

# interfaces
.implements Ljava/util/SortedMap;


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
        "Lcom/google/common/a/fx",
        "<TK;TV;>;",
        "Ljava/util/SortedMap",
        "<TK;TV;>;"
    }
.end annotation


# static fields
.field private static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Ljava/lang/Comparable;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/common/a/fp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fp",
            "<",
            "Ljava/lang/Comparable;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private final transient d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<-TK;>;"
        }
    .end annotation
.end field

.field private transient e:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient f:Lcom/google/common/a/fy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fy",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient g:Lcom/google/common/a/em;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/em",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 71
    invoke-static {}, Lcom/google/common/a/jq;->b()Lcom/google/common/a/jq;

    move-result-object v0

    sput-object v0, Lcom/google/common/a/fp;->b:Ljava/util/Comparator;

    .line 75
    new-instance v0, Lcom/google/common/a/fp;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    sget-object v2, Lcom/google/common/a/fp;->b:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/fp;-><init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V

    sput-object v0, Lcom/google/common/a/fp;->c:Lcom/google/common/a/fp;

    return-void
.end method

.method constructor <init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;",
            "Ljava/util/Comparator",
            "<-TK;>;)V"
        }
    .end annotation

    .prologue
    .line 404
    invoke-direct {p0}, Lcom/google/common/a/fx;-><init>()V

    .line 405
    iput-object p1, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    .line 406
    iput-object p2, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    .line 407
    return-void
.end method

.method private a(Ljava/lang/Object;Lcom/google/common/a/ld;Lcom/google/common/a/kz;)I
    .locals 3

    .prologue
    .line 713
    invoke-direct {p0}, Lcom/google/common/a/fp;->m()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/common/a/fp;->f()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, v1, v2, p2, p3}, Lcom/google/common/a/kx;->a(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;Lcom/google/common/a/ld;Lcom/google/common/a/kz;)I

    move-result v0

    return v0
.end method

.method private a(II)Lcom/google/common/a/fp;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 719
    if-ge p1, p2, :cond_0

    .line 720
    new-instance v0, Lcom/google/common/a/fp;

    iget-object v1, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-virtual {v1, p1, p2}, Lcom/google/common/a/es;->a(II)Lcom/google/common/a/es;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/fp;-><init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V

    .line 723
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    invoke-static {v0}, Lcom/google/common/a/fp;->a(Ljava/util/Comparator;)Lcom/google/common/a/fp;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Ljava/util/Comparator;)Lcom/google/common/a/fp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator",
            "<-TK;>;)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 92
    sget-object v0, Lcom/google/common/a/fp;->b:Ljava/util/Comparator;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    sget-object v0, Lcom/google/common/a/fp;->c:Lcom/google/common/a/fp;

    .line 95
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/fp;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/common/a/fp;-><init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V

    goto :goto_0
.end method

.method static synthetic a(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 0

    .prologue
    .line 61
    invoke-static {p0, p1}, Lcom/google/common/a/fp;->c(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method static synthetic b(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 0

    .prologue
    .line 61
    invoke-static {p0, p1}, Lcom/google/common/a/fp;->d(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method private static c(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;",
            "Ljava/util/Comparator",
            "<-TK;>;)V"
        }
    .end annotation

    .prologue
    .line 270
    new-instance v0, Lcom/google/common/a/fq;

    invoke-direct {v0, p1}, Lcom/google/common/a/fq;-><init>(Ljava/util/Comparator;)V

    .line 277
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 278
    return-void
.end method

.method private static d(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;",
            "Ljava/util/Comparator",
            "<-TK;>;)V"
        }
    .end annotation

    .prologue
    .line 282
    const/4 v0, 0x1

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 283
    add-int/lit8 v0, v1, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    .line 285
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Duplicate keys in mappings "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " and "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 282
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 290
    :cond_1
    return-void
.end method

.method public static e()Lcom/google/common/a/fu;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K::",
            "Ljava/lang/Comparable",
            "<TK;>;V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/fu",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 303
    new-instance v0, Lcom/google/common/a/fu;

    invoke-static {}, Lcom/google/common/a/jq;->b()Lcom/google/common/a/jq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/common/a/fu;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method

.method private i()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 458
    invoke-virtual {p0}, Lcom/google/common/a/fp;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/fv;

    invoke-direct {v0, p0}, Lcom/google/common/a/fv;-><init>(Lcom/google/common/a/fp;)V

    goto :goto_0
.end method

.method private l()Lcom/google/common/a/fy;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fy",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 520
    invoke-virtual {p0}, Lcom/google/common/a/fp;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 521
    iget-object v0, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    invoke-static {v0}, Lcom/google/common/a/fy;->a(Ljava/util/Comparator;)Lcom/google/common/a/fy;

    move-result-object v0

    .line 524
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/kh;

    new-instance v1, Lcom/google/common/a/fr;

    iget-object v2, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-direct {v1, p0, v2}, Lcom/google/common/a/fr;-><init>(Lcom/google/common/a/fp;Lcom/google/common/a/es;)V

    iget-object v2, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/kh;-><init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V

    goto :goto_0
.end method

.method private m()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 703
    new-instance v0, Lcom/google/common/a/ft;

    iget-object v1, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/ft;-><init>(Lcom/google/common/a/fp;Lcom/google/common/a/es;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 453
    iget-object v0, p0, Lcom/google/common/a/fp;->e:Lcom/google/common/a/fi;

    .line 454
    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/common/a/fp;->i()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/fp;->e:Lcom/google/common/a/fi;

    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/Object;)Lcom/google/common/a/fp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 638
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;Z)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/lang/Object;Z)Lcom/google/common/a/fp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Z)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 643
    if-eqz p2, :cond_0

    .line 644
    sget-object v0, Lcom/google/common/a/ld;->ANY_PRESENT:Lcom/google/common/a/ld;

    sget-object v1, Lcom/google/common/a/kz;->NEXT_LOWER:Lcom/google/common/a/kz;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;Lcom/google/common/a/ld;Lcom/google/common/a/kz;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 648
    :goto_0
    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/google/common/a/fp;->a(II)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0

    .line 646
    :cond_0
    sget-object v0, Lcom/google/common/a/ld;->ANY_PRESENT:Lcom/google/common/a/ld;

    sget-object v1, Lcom/google/common/a/kz;->NEXT_HIGHER:Lcom/google/common/a/kz;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;Lcom/google/common/a/ld;Lcom/google/common/a/kz;)I

    move-result v0

    goto :goto_0
.end method

.method a(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/a/fp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ZTK;Z)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 671
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    iget-object v0, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 674
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/fp;->b(Ljava/lang/Object;Z)Lcom/google/common/a/fp;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;Z)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0

    .line 673
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/Object;)Lcom/google/common/a/fp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 689
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/common/a/fp;->b(Ljava/lang/Object;Z)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0
.end method

.method b(Ljava/lang/Object;Z)Lcom/google/common/a/fp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Z)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 694
    if-eqz p2, :cond_0

    .line 695
    sget-object v0, Lcom/google/common/a/ld;->ANY_PRESENT:Lcom/google/common/a/ld;

    sget-object v1, Lcom/google/common/a/kz;->NEXT_HIGHER:Lcom/google/common/a/kz;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;Lcom/google/common/a/ld;Lcom/google/common/a/kz;)I

    move-result v0

    .line 699
    :goto_0
    invoke-virtual {p0}, Lcom/google/common/a/fp;->size()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/google/common/a/fp;->a(II)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0

    .line 697
    :cond_0
    sget-object v0, Lcom/google/common/a/ld;->ANY_PRESENT:Lcom/google/common/a/ld;

    sget-object v1, Lcom/google/common/a/kz;->NEXT_LOWER:Lcom/google/common/a/kz;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;Lcom/google/common/a/ld;Lcom/google/common/a/kz;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public c()Lcom/google/common/a/em;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/em",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 540
    iget-object v0, p0, Lcom/google/common/a/fp;->g:Lcom/google/common/a/em;

    .line 541
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/common/a/fw;

    invoke-direct {v0, p0}, Lcom/google/common/a/fw;-><init>(Lcom/google/common/a/fp;)V

    iput-object v0, p0, Lcom/google/common/a/fp;->g:Lcom/google/common/a/em;

    :cond_0
    return-object v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TK;)",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 666
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<-TK;>;"
        }
    .end annotation

    .prologue
    .line 607
    iget-object v0, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    return-object v0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 436
    if-nez p1, :cond_0

    .line 437
    const/4 v0, 0x0

    .line 439
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/common/a/fp;->h()Lcom/google/common/a/mh;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/gg;->a(Ljava/util/Iterator;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method d()Z
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->a()Z

    move-result v0

    return v0
.end method

.method public synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/google/common/a/fp;->a()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method f()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 419
    iget-object v0, p0, Lcom/google/common/a/fp;->d:Ljava/util/Comparator;

    return-object v0
.end method

.method public firstKey()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 612
    invoke-virtual {p0}, Lcom/google/common/a/fp;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 613
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 615
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fy",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 514
    iget-object v0, p0, Lcom/google/common/a/fp;->f:Lcom/google/common/a/fy;

    .line 515
    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/common/a/fp;->l()Lcom/google/common/a/fy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/fp;->f:Lcom/google/common/a/fy;

    :cond_0
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
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
    const/4 v0, 0x0

    .line 423
    if-nez p1, :cond_1

    .line 432
    :cond_0
    :goto_0
    return-object v0

    .line 428
    :cond_1
    :try_start_0
    sget-object v1, Lcom/google/common/a/ld;->ANY_PRESENT:Lcom/google/common/a/ld;

    sget-object v2, Lcom/google/common/a/kz;->INVERTED_INSERTION_INDEX:Lcom/google/common/a/kz;

    invoke-direct {p0, p1, v1, v2}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;Lcom/google/common/a/ld;Lcom/google/common/a/kz;)I
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 432
    if-ltz v1, :cond_0

    iget-object v0, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 429
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method h()Lcom/google/common/a/mh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 545
    iget-object v0, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    .line 546
    new-instance v1, Lcom/google/common/a/fs;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/fs;-><init>(Lcom/google/common/a/fp;Lcom/google/common/a/mh;)V

    return-object v1
.end method

.method public synthetic headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0, p1}, Lcom/google/common/a/fp;->a(Ljava/lang/Object;)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0
.end method

.method public synthetic i_()Lcom/google/common/a/fi;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/google/common/a/fp;->g()Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/google/common/a/fp;->g()Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public lastKey()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 620
    invoke-virtual {p0}, Lcom/google/common/a/fp;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 621
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 623
    :cond_0
    iget-object v0, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-virtual {p0}, Lcom/google/common/a/fp;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 411
    iget-object v0, p0, Lcom/google/common/a/fp;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public synthetic subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/fp;->c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0
.end method

.method public synthetic tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0, p1}, Lcom/google/common/a/fp;->b(Ljava/lang/Object;)Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/google/common/a/fp;->c()Lcom/google/common/a/em;

    move-result-object v0

    return-object v0
.end method
