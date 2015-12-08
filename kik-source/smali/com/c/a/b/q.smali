.class abstract Lcom/c/a/b/q;
.super Lcom/c/a/b/v;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/c/a/b/v;-><init>()V

    return-void
.end method


# virtual methods
.method final b()Z
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 46
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_0

    .line 47
    check-cast p1, Ljava/util/Map$Entry;

    .line 48
    invoke-virtual {p0}, Lcom/c/a/b/q;->f()Lcom/c/a/b/o;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/c/a/b/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 51
    :cond_0
    return v0
.end method

.method abstract f()Lcom/c/a/b/o;
.end method

.method public size()I
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/c/a/b/q;->f()Lcom/c/a/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/o;->size()I

    move-result v0

    return v0
.end method
