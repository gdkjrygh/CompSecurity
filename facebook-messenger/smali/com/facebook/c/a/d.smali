.class public Lcom/facebook/c/a/d;
.super Ljava/lang/Object;
.source "FbEventSubscriberListManager.java"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/c/a/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/c/a/b;)V
    .locals 3

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 61
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 63
    iget-object v0, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/a/c;

    invoke-virtual {p1, v0}, Lcom/facebook/c/a/b;->a(Lcom/facebook/c/a/c;)Z

    .line 62
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 66
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/c/a/c;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 20
    if-nez p1, :cond_1

    .line 31
    :cond_0
    :goto_0
    return v0

    .line 23
    :cond_1
    iget-object v1, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    if-nez v1, :cond_2

    .line 24
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    .line 26
    :cond_2
    iget-object v1, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_3

    .line 27
    iget-object v3, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p1, :cond_0

    .line 26
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 31
    :cond_3
    iget-object v0, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public b(Lcom/facebook/c/a/b;)V
    .locals 3

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 70
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 72
    iget-object v0, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/a/c;

    invoke-virtual {p1, v0}, Lcom/facebook/c/a/b;->b(Lcom/facebook/c/a/c;)Z

    .line 71
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 75
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/c/a/c;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 35
    iget-object v1, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    if-nez v1, :cond_1

    .line 44
    :cond_0
    :goto_0
    return v0

    .line 38
    :cond_1
    iget-object v1, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_0

    .line 39
    iget-object v3, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p1, :cond_2

    .line 40
    iget-object v0, p0, Lcom/facebook/c/a/d;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 41
    const/4 v0, 0x1

    goto :goto_0

    .line 38
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method
