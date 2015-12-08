.class Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;
.super Ljava/lang/Object;
.source "ImmutableMap.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SerializedForm"
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field final keys:[Ljava/lang/Object;

.field final values:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$ImmutableMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<**>;)V"
        }
    .end annotation

    .prologue
    .line 756
    .local p1, "map":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<**>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 757
    invoke-virtual {p1}, Lcom/google/inject/internal/util/$ImmutableMap;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;->keys:[Ljava/lang/Object;

    .line 758
    invoke-virtual {p1}, Lcom/google/inject/internal/util/$ImmutableMap;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;->values:[Ljava/lang/Object;

    .line 759
    const/4 v1, 0x0

    .line 760
    .local v1, "i":I
    invoke-virtual {p1}, Lcom/google/inject/internal/util/$ImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/inject/internal/util/$ImmutableSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 761
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;->keys:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v1

    .line 762
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;->values:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v1

    .line 763
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 765
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    :cond_0
    return-void
.end method


# virtual methods
.method readResolve()Ljava/lang/Object;
    .locals 4

    .prologue
    .line 767
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;-><init>()V

    .line 768
    .local v0, "builder":Lcom/google/inject/internal/util/$ImmutableMap$Builder;, "Lcom/google/inject/internal/util/$ImmutableMap$Builder<Ljava/lang/Object;Ljava/lang/Object;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v2, p0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;->keys:[Ljava/lang/Object;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 769
    iget-object v2, p0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;->keys:[Ljava/lang/Object;

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;->values:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-virtual {v0, v2, v3}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    .line 768
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 771
    :cond_0
    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->build()Lcom/google/inject/internal/util/$ImmutableMap;

    move-result-object v2

    return-object v2
.end method
