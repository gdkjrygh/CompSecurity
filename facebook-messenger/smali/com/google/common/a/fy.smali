.class public abstract Lcom/google/common/a/fy;
.super Lcom/google/common/a/ga;
.source "ImmutableSortedSet.java"

# interfaces
.implements Lcom/google/common/a/kv;
.implements Ljava/util/SortedSet;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ga",
        "<TE;>;",
        "Lcom/google/common/a/kv",
        "<TE;>;",
        "Ljava/util/SortedSet",
        "<TE;>;"
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

.field private static final d:Lcom/google/common/a/fy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fy",
            "<",
            "Ljava/lang/Comparable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<-TE;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 92
    invoke-static {}, Lcom/google/common/a/jq;->b()Lcom/google/common/a/jq;

    move-result-object v0

    sput-object v0, Lcom/google/common/a/fy;->b:Ljava/util/Comparator;

    .line 95
    new-instance v0, Lcom/google/common/a/dr;

    sget-object v1, Lcom/google/common/a/fy;->b:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Lcom/google/common/a/dr;-><init>(Ljava/util/Comparator;)V

    sput-object v0, Lcom/google/common/a/fy;->d:Lcom/google/common/a/fy;

    return-void
.end method

.method constructor <init>(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator",
            "<-TE;>;)V"
        }
    .end annotation

    .prologue
    .line 583
    invoke-direct {p0}, Lcom/google/common/a/ga;-><init>()V

    .line 584
    iput-object p1, p0, Lcom/google/common/a/fy;->a:Ljava/util/Comparator;

    .line 585
    return-void
.end method

.method static a(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator",
            "<*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    .prologue
    .line 577
    .line 578
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static a(Ljava/util/Comparator;)Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator",
            "<-TE;>;)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 105
    sget-object v0, Lcom/google/common/a/fy;->b:Ljava/util/Comparator;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-static {}, Lcom/google/common/a/fy;->g()Lcom/google/common/a/fy;

    move-result-object v0

    .line 108
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/dr;

    invoke-direct {v0, p0}, Lcom/google/common/a/dr;-><init>(Ljava/util/Comparator;)V

    goto :goto_0
.end method

.method static synthetic a(Ljava/util/Comparator;Ljava/util/Iterator;)Lcom/google/common/a/fy;
    .locals 1

    .prologue
    .line 89
    invoke-static {p0, p1}, Lcom/google/common/a/fy;->b(Ljava/util/Comparator;Ljava/util/Iterator;)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/util/Comparator;Ljava/util/Iterator;)Lcom/google/common/a/fy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator",
            "<-TE;>;",
            "Ljava/util/Iterator",
            "<+TE;>;)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 428
    invoke-static {p0, p1}, Lcom/google/common/a/kw;->a(Ljava/util/Comparator;Ljava/util/Iterator;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    .line 430
    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/common/a/fy;->a(Ljava/util/Comparator;)Lcom/google/common/a/fy;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/kh;

    invoke-direct {v0, v1, p0}, Lcom/google/common/a/kh;-><init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V

    goto :goto_0
.end method

.method public static f()Lcom/google/common/a/fz;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljava/lang/Comparable",
            "<TE;>;>()",
            "Lcom/google/common/a/fz",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 473
    new-instance v0, Lcom/google/common/a/fz;

    invoke-static {}, Lcom/google/common/a/jq;->b()Lcom/google/common/a/jq;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/common/a/fz;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method

.method private static g()Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 100
    sget-object v0, Lcom/google/common/a/fy;->d:Lcom/google/common/a/fy;

    return-object v0
.end method


# virtual methods
.method abstract a(Ljava/lang/Object;)I
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method abstract a(Ljava/lang/Object;Z)Lcom/google/common/a/fy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation
.end method

.method abstract a(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/a/fy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation
.end method

.method b(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 568
    iget-object v0, p0, Lcom/google/common/a/fy;->a:Ljava/util/Comparator;

    invoke-static {v0, p1, p2}, Lcom/google/common/a/fy;->a(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method abstract b(Ljava/lang/Object;Z)Lcom/google/common/a/fy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation
.end method

.method b(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 642
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    iget-object v0, p0, Lcom/google/common/a/fy;->a:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 645
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/common/a/fy;->a(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0

    .line 644
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Ljava/lang/Object;)Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 615
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/common/a/fy;->c(Ljava/lang/Object;Z)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 637
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/google/common/a/fy;->b(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method c(Ljava/lang/Object;Z)Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 619
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/google/common/a/fy;->a(Ljava/lang/Object;Z)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<-TE;>;"
        }
    .end annotation

    .prologue
    .line 596
    iget-object v0, p0, Lcom/google/common/a/fy;->a:Ljava/util/Comparator;

    return-object v0
.end method

.method public d(Ljava/lang/Object;)Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 661
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/common/a/fy;->d(Ljava/lang/Object;Z)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method d(Ljava/lang/Object;Z)Lcom/google/common/a/fy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 665
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/google/common/a/fy;->b(Ljava/lang/Object;Z)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public abstract h_()Lcom/google/common/a/mh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation
.end method

.method public synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0, p1}, Lcom/google/common/a/fy;->c(Ljava/lang/Object;)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0}, Lcom/google/common/a/fy;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/fy;->c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0, p1}, Lcom/google/common/a/fy;->d(Ljava/lang/Object;)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method
