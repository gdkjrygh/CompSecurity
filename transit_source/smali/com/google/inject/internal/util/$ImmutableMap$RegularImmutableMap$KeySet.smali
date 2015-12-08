.class Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;
.super Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "KeySet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;TK;>;"
    }
.end annotation


# instance fields
.field final map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 683
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet<TK;TV;>;"
    .local p1, "map":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    # getter for: Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->access$500(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)[Ljava/util/Map$Entry;

    move-result-object v0

    # getter for: Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->keySetHashCode:I
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->access$600(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;-><init>([Ljava/lang/Object;I)V

    .line 684
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;->map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    .line 685
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 692
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;->map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 678
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet<TK;TV;>;"
    check-cast p1, Ljava/util/Map$Entry;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;->transform(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method transform(Ljava/util/Map$Entry;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;)TK;"
        }
    .end annotation

    .prologue
    .line 688
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$KeySet<TK;TV;>;"
    .local p1, "element":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
