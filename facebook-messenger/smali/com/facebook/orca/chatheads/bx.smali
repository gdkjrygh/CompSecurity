.class Lcom/facebook/orca/chatheads/bx;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/br;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;

.field private final b:Landroid/content/res/Resources;

.field private c:I


# direct methods
.method public constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 1

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bx;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    invoke-static {p1}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/orca/chatheads/al;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/bx;->b:Landroid/content/res/Resources;

    .line 147
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/bx;->a()V

    .line 148
    return-void
.end method


# virtual methods
.method public a(I)Landroid/graphics/PointF;
    .locals 5

    .prologue
    .line 177
    const/4 v1, 0x0

    .line 178
    const/4 v0, 0x3

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 180
    const/4 v0, 0x1

    :goto_0
    if-gt v0, v2, :cond_0

    .line 181
    iget v3, p0, Lcom/facebook/orca/chatheads/bx;->c:I

    int-to-float v3, v3

    int-to-float v4, v0

    div-float/2addr v3, v4

    add-float/2addr v1, v3

    .line 180
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 184
    :cond_0
    new-instance v0, Landroid/graphics/PointF;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/bx;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/orca/chatheads/al;)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/facebook/orca/chatheads/bx;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v2}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/orca/chatheads/al;)I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public a(Ljava/util/List;)Lcom/google/common/d/a/s;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ef;",
            ">;)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 157
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v3

    .line 158
    new-instance v4, Landroid/graphics/PointF;

    iget-object v0, p0, Lcom/facebook/orca/chatheads/bx;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->d(Lcom/facebook/orca/chatheads/al;)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/bx;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->e(Lcom/facebook/orca/chatheads/al;)I

    move-result v1

    int-to-float v1, v1

    invoke-direct {v4, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 159
    const/4 v1, 0x0

    .line 160
    const/4 v0, 0x0

    .line 162
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v2, v1

    move-object v1, v0

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ef;

    .line 163
    if-nez v1, :cond_0

    .line 164
    invoke-virtual {v0, v4}, Lcom/facebook/orca/chatheads/ef;->a(Landroid/graphics/PointF;)Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_0

    .line 166
    :cond_0
    new-instance v6, Landroid/graphics/PointF;

    iget v7, p0, Lcom/facebook/orca/chatheads/bx;->c:I

    int-to-float v7, v7

    int-to-float v8, v2

    div-float/2addr v7, v8

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 167
    invoke-virtual {v0, v1, v6}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;Landroid/graphics/PointF;)Lcom/google/common/d/a/s;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 172
    :cond_1
    invoke-static {v3}, Lcom/google/common/d/a/i;->a(Ljava/lang/Iterable;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bx;->b:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/g;->chat_head_first_stack_offset:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/bx;->c:I

    .line 153
    return-void
.end method
