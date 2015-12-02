.class Lcom/google/common/a/ce;
.super Lcom/google/common/a/o;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/o",
        "<",
        "Lcom/google/common/a/cm",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/cc;


# direct methods
.method constructor <init>(Lcom/google/common/a/cc;Lcom/google/common/a/cm;)V
    .locals 0

    .prologue
    .line 3263
    iput-object p1, p0, Lcom/google/common/a/ce;->a:Lcom/google/common/a/cc;

    invoke-direct {p0, p2}, Lcom/google/common/a/o;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/common/a/cm;)Lcom/google/common/a/cm;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3266
    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    .line 3267
    iget-object v1, p0, Lcom/google/common/a/ce;->a:Lcom/google/common/a/cc;

    iget-object v1, v1, Lcom/google/common/a/cc;->a:Lcom/google/common/a/cm;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 3263
    check-cast p1, Lcom/google/common/a/cm;

    invoke-virtual {p0, p1}, Lcom/google/common/a/ce;->a(Lcom/google/common/a/cm;)Lcom/google/common/a/cm;

    move-result-object v0

    return-object v0
.end method
