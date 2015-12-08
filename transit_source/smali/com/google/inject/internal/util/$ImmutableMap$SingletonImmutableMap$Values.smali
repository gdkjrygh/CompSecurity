.class Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;
.super Lcom/google/inject/internal/util/$ImmutableCollection;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Values"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableCollection",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final singleValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .prologue
    .line 507
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values<TV;>;"
    .local p1, "singleValue":Ljava/lang/Object;, "TV;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;-><init>()V

    .line 508
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;->singleValue:Ljava/lang/Object;

    .line 509
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "object"    # Ljava/lang/Object;

    .prologue
    .line 512
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values<TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;->singleValue:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 516
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values<TV;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 524
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values<TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;->singleValue:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/inject/internal/util/$Iterators;->singletonIterator(Ljava/lang/Object;)Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 504
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values<TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 520
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values<TV;>;"
    const/4 v0, 0x1

    return v0
.end method
