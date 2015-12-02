.class final Lcom/google/common/a/ca;
.super Lcom/google/common/a/ci;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/bj",
        "<TK;TV;>.com/google/common/a/ci;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/bj;


# direct methods
.method constructor <init>(Lcom/google/common/a/bj;)V
    .locals 0

    .prologue
    .line 3816
    iput-object p1, p0, Lcom/google/common/a/ca;->a:Lcom/google/common/a/bj;

    invoke-direct {p0, p1}, Lcom/google/common/a/ci;-><init>(Lcom/google/common/a/bj;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 3820
    invoke-virtual {p0}, Lcom/google/common/a/ca;->e()Lcom/google/common/a/dk;

    move-result-object v0

    return-object v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 3816
    invoke-virtual {p0}, Lcom/google/common/a/ca;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
