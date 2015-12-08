.class final Lcom/c/a/b/al;
.super Lcom/c/a/b/m;
.source "SourceFile"


# instance fields
.field final transient a:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/c/a/b/m;-><init>()V

    .line 40
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    .line 41
    return-void
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    aput-object v0, p1, p2

    .line 116
    add-int/lit8 v0, p2, 0x1

    return v0
.end method

.method public final a()Lcom/c/a/b/ao;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/c/a/b/w;->a(Ljava/lang/Object;)Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public final a(II)Lcom/c/a/b/m;
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lcom/c/a/a/u;->a(III)V

    .line 68
    if-ne p1, p2, :cond_0

    invoke-static {}, Lcom/c/a/b/m;->f()Lcom/c/a/b/m;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x0

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 76
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 80
    if-ne p1, p0, :cond_1

    .line 87
    :cond_0
    :goto_0
    return v0

    .line 83
    :cond_1
    instance-of v2, p1, Ljava/util/List;

    if-eqz v2, :cond_3

    .line 84
    check-cast p1, Ljava/util/List;

    .line 85
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v0, :cond_2

    iget-object v2, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 87
    goto :goto_0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/c/a/a/u;->a(II)I

    .line 46
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 50
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 106
    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/c/a/b/w;->a(Ljava/lang/Object;)Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 58
    invoke-virtual {p0, p1}, Lcom/c/a/b/al;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic subList(II)Ljava/util/List;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0, p1, p2}, Lcom/c/a/b/al;->a(II)Lcom/c/a/b/m;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 97
    iget-object v0, p0, Lcom/c/a/b/al;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
