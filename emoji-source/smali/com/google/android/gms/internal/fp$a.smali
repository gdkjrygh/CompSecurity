.class public final Lcom/google/android/gms/internal/fp$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final mName:Ljava/lang/String;

.field private yi:Ljava/lang/String;

.field private yj:Z

.field private yk:I

.field private yl:Z

.field private ym:Ljava/lang/String;

.field private final yn:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/fm;",
            ">;"
        }
    .end annotation
.end field

.field private yo:Ljava/util/BitSet;

.field private yp:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fp$a;->mName:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/fp$a;->yk:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fp$a;->yn:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public I(I)Lcom/google/android/gms/internal/fp$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fp$a;->yo:Ljava/util/BitSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fp$a;->yo:Ljava/util/BitSet;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fp$a;->yo:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-object p0
.end method

.method public Z(Ljava/lang/String;)Lcom/google/android/gms/internal/fp$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fp$a;->yi:Ljava/lang/String;

    return-object p0
.end method

.method public aa(Ljava/lang/String;)Lcom/google/android/gms/internal/fp$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fp$a;->yp:Ljava/lang/String;

    return-object p0
.end method

.method public dQ()Lcom/google/android/gms/internal/fp;
    .locals 10

    const/4 v1, 0x0

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/fp$a;->yo:Ljava/util/BitSet;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fp$a;->yo:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    new-array v8, v0, [I

    iget-object v0, p0, Lcom/google/android/gms/internal/fp$a;->yo:Ljava/util/BitSet;

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    :goto_0
    if-ltz v0, :cond_0

    add-int/lit8 v2, v1, 0x1

    aput v0, v8, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/fp$a;->yo:Ljava/util/BitSet;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    move v1, v2

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/fp;

    iget-object v1, p0, Lcom/google/android/gms/internal/fp$a;->mName:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/fp$a;->yi:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/fp$a;->yj:Z

    iget v4, p0, Lcom/google/android/gms/internal/fp$a;->yk:I

    iget-boolean v5, p0, Lcom/google/android/gms/internal/fp$a;->yl:Z

    iget-object v6, p0, Lcom/google/android/gms/internal/fp$a;->ym:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/fp$a;->yn:Ljava/util/List;

    iget-object v9, p0, Lcom/google/android/gms/internal/fp$a;->yn:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    new-array v9, v9, [Lcom/google/android/gms/internal/fm;

    invoke-interface {v7, v9}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Lcom/google/android/gms/internal/fm;

    iget-object v9, p0, Lcom/google/android/gms/internal/fp$a;->yp:Ljava/lang/String;

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/fp;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/String;[Lcom/google/android/gms/internal/fm;[ILjava/lang/String;)V

    return-object v0
.end method

.method public w(Z)Lcom/google/android/gms/internal/fp$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/fp$a;->yj:Z

    return-object p0
.end method

.method public x(Z)Lcom/google/android/gms/internal/fp$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/fp$a;->yl:Z

    return-object p0
.end method
