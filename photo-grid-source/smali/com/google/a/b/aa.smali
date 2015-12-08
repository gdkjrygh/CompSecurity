.class final Lcom/google/a/b/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map$Entry",
        "<",
        "Ljava/lang/String;",
        "TV;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field final c:I

.field d:Lcom/google/a/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation
.end field

.field e:Lcom/google/a/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation
.end field

.field f:Lcom/google/a/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 297
    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    invoke-direct/range {v0 .. v6}, Lcom/google/a/b/aa;-><init>(Ljava/lang/String;Ljava/lang/Object;ILcom/google/a/b/aa;Lcom/google/a/b/aa;Lcom/google/a/b/aa;)V

    .line 298
    iput-object p0, p0, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    iput-object p0, p0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    .line 299
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/Object;ILcom/google/a/b/aa;Lcom/google/a/b/aa;Lcom/google/a/b/aa;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TV;I",
            "Lcom/google/a/b/aa",
            "<TV;>;",
            "Lcom/google/a/b/aa",
            "<TV;>;",
            "Lcom/google/a/b/aa",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 303
    iput-object p1, p0, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    .line 304
    iput-object p2, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    .line 305
    iput p3, p0, Lcom/google/a/b/aa;->c:I

    .line 306
    iput-object p4, p0, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    .line 307
    iput-object p5, p0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    .line 308
    iput-object p6, p0, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    .line 309
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 326
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-nez v1, :cond_1

    .line 331
    :cond_0
    :goto_0
    return v0

    .line 329
    :cond_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 330
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 331
    iget-object v2, p0, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    if-nez v2, :cond_2

    if-nez v1, :cond_0

    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1
.end method

.method public final bridge synthetic getKey()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 287
    .line 1312
    iget-object v0, p0, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    .line 287
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 316
    iget-object v0, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 336
    iget-object v0, p0, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    if-nez v2, :cond_1

    :goto_1
    xor-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    .prologue
    .line 320
    iget-object v0, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    .line 321
    iput-object p1, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    .line 322
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 340
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
