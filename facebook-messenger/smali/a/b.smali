.class public La/b;
.super Ljava/lang/Object;
.source "Chunk.java"


# instance fields
.field private final a:I

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput p1, p0, La/b;->a:I

    .line 62
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La/b;->b:Ljava/util/List;

    .line 63
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, La/b;->a:I

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 99
    iget-object v0, p0, La/b;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, La/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 135
    if-ne p0, p1, :cond_1

    .line 149
    :cond_0
    :goto_0
    return v0

    .line 137
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 140
    goto :goto_0

    .line 141
    :cond_3
    check-cast p1, La/b;

    .line 142
    iget-object v2, p0, La/b;->b:Ljava/util/List;

    if-nez v2, :cond_4

    .line 143
    iget-object v2, p1, La/b;->b:Ljava/util/List;

    if-eqz v2, :cond_5

    move v0, v1

    .line 144
    goto :goto_0

    .line 145
    :cond_4
    iget-object v2, p0, La/b;->b:Ljava/util/List;

    iget-object v3, p1, La/b;->b:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 146
    goto :goto_0

    .line 147
    :cond_5
    iget v2, p0, La/b;->a:I

    iget v3, p1, La/b;->a:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 148
    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 120
    .line 122
    iget-object v0, p0, La/b;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 123
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, La/b;->a:I

    add-int/2addr v0, v1

    .line 124
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, La/b;->c()I

    move-result v1

    add-int/2addr v0, v1

    .line 125
    return v0

    .line 122
    :cond_0
    iget-object v0, p0, La/b;->b:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[position: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, La/b;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, La/b;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lines: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, La/b;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
