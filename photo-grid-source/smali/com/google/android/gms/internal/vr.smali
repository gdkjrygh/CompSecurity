.class public Lcom/google/android/gms/internal/vr;
.super Lcom/google/android/gms/internal/wb;

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/wb",
        "<TK;TV;>;",
        "Ljava/util/Map",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field a:Lcom/google/android/gms/internal/vv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/vv",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/wb;-><init>()V

    return-void
.end method

.method private b()Lcom/google/android/gms/internal/vv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/vv",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/vr;->a:Lcom/google/android/gms/internal/vv;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/vs;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/vs;-><init>(Lcom/google/android/gms/internal/vr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/vr;->a:Lcom/google/android/gms/internal/vv;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vr;->a:Lcom/google/android/gms/internal/vv;

    return-object v0
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .locals 2
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
    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/internal/vr;->b()Lcom/google/android/gms/internal/vv;

    move-result-object v0

    .line 1000
    iget-object v1, v0, Lcom/google/android/gms/internal/vv;->b:Lcom/google/android/gms/internal/vx;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/vx;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/vx;-><init>(Lcom/google/android/gms/internal/vv;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/vv;->b:Lcom/google/android/gms/internal/vx;

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/vv;->b:Lcom/google/android/gms/internal/vx;

    .line 0
    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/internal/vr;->b()Lcom/google/android/gms/internal/vv;

    move-result-object v0

    .line 2000
    iget-object v1, v0, Lcom/google/android/gms/internal/vv;->c:Lcom/google/android/gms/internal/vy;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/vy;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/vy;-><init>(Lcom/google/android/gms/internal/vv;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/vv;->c:Lcom/google/android/gms/internal/vy;

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/vv;->c:Lcom/google/android/gms/internal/vy;

    .line 0
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

    iget v0, p0, Lcom/google/android/gms/internal/vr;->h:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/vr;->a(I)V

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

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/internal/vr;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public values()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/internal/vr;->b()Lcom/google/android/gms/internal/vv;

    move-result-object v0

    .line 3000
    iget-object v1, v0, Lcom/google/android/gms/internal/vv;->d:Lcom/google/android/gms/internal/wa;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/wa;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/wa;-><init>(Lcom/google/android/gms/internal/vv;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/vv;->d:Lcom/google/android/gms/internal/wa;

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/vv;->d:Lcom/google/android/gms/internal/wa;

    .line 0
    return-object v0
.end method
