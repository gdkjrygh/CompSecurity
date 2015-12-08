.class final Lcom/c/a/b/am;
.super Lcom/c/a/b/v;
.source "SourceFile"


# instance fields
.field final transient a:Ljava/lang/Object;

.field private transient b:I


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/c/a/b/v;-><init>()V

    .line 47
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    .line 48
    return-void
.end method

.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/c/a/b/v;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    .line 53
    iput p2, p0, Lcom/c/a/b/am;->b:I

    .line 54
    return-void
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    aput-object v0, p1, p2

    .line 80
    add-int/lit8 v0, p2, 0x1

    return v0
.end method

.method public final a()Lcom/c/a/b/ao;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/c/a/b/w;->a(Ljava/lang/Object;)Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 74
    const/4 v0, 0x0

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method final d()Z
    .locals 1

    .prologue
    .line 104
    iget v0, p0, Lcom/c/a/b/am;->b:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 84
    if-ne p1, p0, :cond_1

    .line 91
    :cond_0
    :goto_0
    return v0

    .line 87
    :cond_1
    instance-of v2, p1, Ljava/util/Set;

    if-eqz v2, :cond_3

    .line 88
    check-cast p1, Ljava/util/Set;

    .line 89
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    if-ne v2, v0, :cond_2

    iget-object v2, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 91
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 96
    iget v0, p0, Lcom/c/a/b/am;->b:I

    .line 97
    if-nez v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/c/a/b/am;->b:I

    .line 100
    :cond_0
    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/c/a/b/w;->a(Ljava/lang/Object;)Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 108
    iget-object v0, p0, Lcom/c/a/b/am;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 109
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
