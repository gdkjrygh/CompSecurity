.class Lcom/google/common/a/is;
.super Ljava/lang/Object;
.source "Maps.java"

# interfaces
.implements Lcom/google/common/a/hw;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/a/hw",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final a:Z

.field final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;",
            "Lcom/google/common/a/hx",
            "<TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Ljava/util/Map",
            "<TK;",
            "Lcom/google/common/a/hx",
            "<TV;>;>;)V"
        }
    .end annotation

    .prologue
    .line 397
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    iput-boolean p1, p0, Lcom/google/common/a/is;->a:Z

    .line 399
    iput-object p2, p0, Lcom/google/common/a/is;->b:Ljava/util/Map;

    .line 400
    iput-object p3, p0, Lcom/google/common/a/is;->c:Ljava/util/Map;

    .line 401
    iput-object p4, p0, Lcom/google/common/a/is;->d:Ljava/util/Map;

    .line 402
    iput-object p5, p0, Lcom/google/common/a/is;->e:Ljava/util/Map;

    .line 403
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 412
    iget-object v0, p0, Lcom/google/common/a/is;->b:Ljava/util/Map;

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 417
    iget-object v0, p0, Lcom/google/common/a/is;->c:Ljava/util/Map;

    return-object v0
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 422
    iget-object v0, p0, Lcom/google/common/a/is;->d:Ljava/util/Map;

    return-object v0
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;",
            "Lcom/google/common/a/hx",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 427
    iget-object v0, p0, Lcom/google/common/a/is;->e:Ljava/util/Map;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 431
    if-ne p1, p0, :cond_1

    .line 441
    :cond_0
    :goto_0
    return v0

    .line 434
    :cond_1
    instance-of v2, p1, Lcom/google/common/a/hw;

    if-eqz v2, :cond_3

    .line 435
    check-cast p1, Lcom/google/common/a/hw;

    .line 436
    invoke-virtual {p0}, Lcom/google/common/a/is;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/common/a/hw;->a()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/google/common/a/is;->b()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/common/a/hw;->b()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/google/common/a/is;->c()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/common/a/hw;->c()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/google/common/a/is;->d()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/common/a/hw;->d()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 441
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 445
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/common/a/is;->a()Ljava/util/Map;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/common/a/is;->b()Ljava/util/Map;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/google/common/a/is;->c()Ljava/util/Map;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/google/common/a/is;->d()Ljava/util/Map;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 450
    iget-boolean v0, p0, Lcom/google/common/a/is;->a:Z

    if-eqz v0, :cond_0

    .line 451
    const-string v0, "equal"

    .line 464
    :goto_0
    return-object v0

    .line 454
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "not equal"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 455
    iget-object v1, p0, Lcom/google/common/a/is;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 456
    const-string v1, ": only on left="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/is;->b:Ljava/util/Map;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 458
    :cond_1
    iget-object v1, p0, Lcom/google/common/a/is;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 459
    const-string v1, ": only on right="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/is;->c:Ljava/util/Map;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 461
    :cond_2
    iget-object v1, p0, Lcom/google/common/a/is;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 462
    const-string v1, ": value differences="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/is;->e:Ljava/util/Map;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 464
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
