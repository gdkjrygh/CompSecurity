.class public abstract Lcom/google/android/gms/internal/ma;
.super Lcom/google/android/gms/internal/me;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/google/android/gms/internal/ma",
        "<TM;>;>",
        "Lcom/google/android/gms/internal/me;"
    }
.end annotation


# instance fields
.field protected amX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/mg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/me;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/mb;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/mb",
            "<TM;TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/mb;->i(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lz;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    if-nez v1, :cond_0

    move v1, v0

    :goto_0
    move v2, v0

    :goto_1
    if-ge v2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mg;

    iget v3, v0, Lcom/google/android/gms/internal/mg;->tag:I

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/lz;->eI(I)V

    iget-object v0, v0, Lcom/google/android/gms/internal/mg;->anc:[B

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/lz;->t([B)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected final a(Lcom/google/android/gms/internal/ly;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->getPosition()I

    move-result v0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ly;->ev(I)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ly;->getPosition()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ly;->o(II)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    new-instance v2, Lcom/google/android/gms/internal/mg;

    invoke-direct {v2, p2, v0}, Lcom/google/android/gms/internal/mg;-><init>(I[B)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected c()I
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    if-nez v1, :cond_0

    move v1, v0

    :goto_0
    move v2, v0

    move v3, v0

    :goto_1
    if-ge v2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mg;

    iget v4, v0, Lcom/google/android/gms/internal/mg;->tag:I

    invoke-static {v4}, Lcom/google/android/gms/internal/lz;->eJ(I)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v0, v0, Lcom/google/android/gms/internal/mg;->anc:[B

    array-length v0, v0

    add-int/2addr v3, v0

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ma;->amX:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :cond_1
    return v3
.end method
