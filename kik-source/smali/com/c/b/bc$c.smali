.class final Lcom/c/b/bc$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/c/b/bi;

.field private final b:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/c/b/bi;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    iput-object p1, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    .line 222
    iput-object p2, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    .line 223
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 271
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 272
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 3

    .prologue
    .line 286
    new-instance v0, Lcom/c/b/bc$d;

    iget-object v1, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    iget-object v2, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/c/b/bc$d;-><init>(Lcom/c/b/bi;Ljava/util/Set;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 247
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 296
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 3

    .prologue
    .line 276
    new-instance v0, Lcom/c/b/bc$d;

    iget-object v1, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    iget-object v2, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/c/b/bc$d;-><init>(Lcom/c/b/bi;Ljava/util/Set;)V

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 253
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 265
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 266
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    invoke-interface {v0}, Lcom/c/b/bi;->d()V

    .line 259
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 3

    .prologue
    .line 281
    new-instance v0, Lcom/c/b/bc$a;

    iget-object v1, p0, Lcom/c/b/bc$c;->a:Lcom/c/b/bi;

    iget-object v2, p0, Lcom/c/b/bc$c;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/c/b/bc$a;-><init>(Lcom/c/b/bi;Ljava/util/Collection;)V

    return-object v0
.end method
