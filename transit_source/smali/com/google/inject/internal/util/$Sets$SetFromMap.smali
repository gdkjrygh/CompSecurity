.class Lcom/google/inject/internal/util/$Sets$SetFromMap;
.super Ljava/util/AbstractSet;
.source "Sets.java"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$Sets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SetFromMap"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractSet",
        "<TE;>;",
        "Ljava/util/Set",
        "<TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field static final serialVersionUID:J


# instance fields
.field private final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TE;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private transient s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TE;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 123
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<TE;Ljava/lang/Boolean;>;"
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 124
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const-string v1, "Map is non-empty"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 125
    iput-object p1, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    .line 126
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    .line 127
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .param p1, "stream"    # Ljava/io/ObjectInputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 181
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 182
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    .line 183
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 145
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    .local p1, "e":Ljava/lang/Object;, "TE;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 130
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 131
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 139
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 166
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    .local p1, "c":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .line 163
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    if-eq p0, p1, :cond_0

    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 160
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 136
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 148
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 142
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 169
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    .local p1, "c":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 172
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    .local p1, "c":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 133
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 151
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 154
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    .local p1, "a":[Ljava/lang/Object;, "[TT;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    .local p0, "this":Lcom/google/inject/internal/util/$Sets$SetFromMap;, "Lcom/google/inject/internal/util/$Sets$SetFromMap<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$Sets$SetFromMap;->s:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
