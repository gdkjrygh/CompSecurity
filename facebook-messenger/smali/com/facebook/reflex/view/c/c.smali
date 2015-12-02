.class public Lcom/facebook/reflex/view/c/c;
.super Ljava/lang/Object;
.source "HeightCache.java"


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    .line 14
    iput v1, p0, Lcom/facebook/reflex/view/c/c;->b:I

    .line 15
    iput v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    .line 16
    iput v1, p0, Lcom/facebook/reflex/view/c/c;->d:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 19
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->d:I

    return v0
.end method

.method public a(I)I
    .locals 3

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    .line 41
    :goto_0
    return v0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 31
    invoke-virtual {p0}, Lcom/facebook/reflex/view/c/c;->a()I

    move-result v0

    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    if-ge v0, p1, :cond_2

    .line 34
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/facebook/reflex/view/c/c;->b:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    .line 35
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    goto :goto_1

    .line 37
    :cond_2
    :goto_2
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    if-le v0, p1, :cond_3

    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    if-lez v0, :cond_3

    .line 38
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    .line 39
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/facebook/reflex/view/c/c;->b:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    goto :goto_2

    .line 41
    :cond_3
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    goto :goto_0
.end method

.method public a(II)V
    .locals 3

    .prologue
    .line 82
    :goto_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le p1, v0, :cond_0

    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/c;->d(I)V

    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 86
    invoke-virtual {p0, p2}, Lcom/facebook/reflex/view/c/c;->d(I)V

    .line 94
    :cond_1
    :goto_1
    return-void

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 89
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->d:I

    sub-int v2, p2, v0

    add-int/2addr v1, v2

    iput v1, p0, Lcom/facebook/reflex/view/c/c;->d:I

    .line 90
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->b:I

    if-ge p1, v1, :cond_1

    .line 91
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    sub-int v0, p2, v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    goto :goto_1
.end method

.method public b()I
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public b(I)I
    .locals 3

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    .line 60
    :goto_0
    return v0

    .line 48
    :cond_0
    :goto_1
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/facebook/reflex/view/c/c;->b:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    if-gt v0, p1, :cond_1

    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    iget-object v1, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    .line 50
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/facebook/reflex/view/c/c;->b:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    .line 51
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    goto :goto_1

    .line 53
    :cond_1
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/facebook/reflex/view/c/c;->b:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    if-gt v0, p1, :cond_2

    .line 54
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    .line 56
    :cond_2
    :goto_2
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    if-le v0, p1, :cond_3

    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    if-lez v0, :cond_3

    .line 57
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    .line 58
    iget v1, p0, Lcom/facebook/reflex/view/c/c;->c:I

    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/facebook/reflex/view/c/c;->b:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->c:I

    goto :goto_2

    .line 60
    :cond_3
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->b:I

    goto :goto_0
.end method

.method public c(I)I
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public d(I)V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/reflex/view/c/c;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    iget v0, p0, Lcom/facebook/reflex/view/c/c;->d:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/facebook/reflex/view/c/c;->d:I

    .line 70
    return-void
.end method
