.class public final Lcom/c/b/bz;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/az;
.implements Ljava/util/RandomAccess;


# instance fields
.field private final a:Lcom/c/b/az;


# direct methods
.method public constructor <init>(Lcom/c/b/az;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/c/b/bz;->a:Lcom/c/b/az;

    .line 54
    return-void
.end method

.method static synthetic a(Lcom/c/b/bz;)Lcom/c/b/az;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/c/b/bz;->a:Lcom/c/b/az;

    return-object v0
.end method


# virtual methods
.method public final a(I)Lcom/c/b/f;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/c/b/bz;->a:Lcom/c/b/az;

    invoke-interface {v0, p1}, Lcom/c/b/az;->a(I)Lcom/c/b/f;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/f;)V
    .locals 1

    .prologue
    .line 73
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/c/b/bz;->a:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/az;
    .locals 0

    .prologue
    .line 203
    return-object p0
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/c/b/bz;->a:Lcom/c/b/az;

    invoke-interface {v0, p1}, Lcom/c/b/az;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 160
    new-instance v0, Lcom/c/b/cb;

    invoke-direct {v0, p0}, Lcom/c/b/cb;-><init>(Lcom/c/b/bz;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 108
    new-instance v0, Lcom/c/b/ca;

    invoke-direct {v0, p0, p1}, Lcom/c/b/ca;-><init>(Lcom/c/b/bz;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/c/b/bz;->a:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->size()I

    move-result v0

    return v0
.end method
