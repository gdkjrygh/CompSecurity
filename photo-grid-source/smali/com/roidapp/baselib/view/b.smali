.class final Lcom/roidapp/baselib/view/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/DraggableGridView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/DraggableGridView;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const-wide/16 v4, 0x19

    .line 139
    iget-object v0, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->e(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->f(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v1

    sub-int/2addr v0, v1

    .line 140
    if-gez v0, :cond_3

    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->f(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->g(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v2

    if-le v1, v2, :cond_3

    .line 141
    iget-object v0, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->h(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v0

    neg-int v0, v0

    .line 142
    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->j(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->i(Lcom/roidapp/baselib/view/DraggableGridView;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 153
    :goto_0
    if-eqz v0, :cond_2

    .line 154
    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->l(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v3}, Lcom/roidapp/baselib/view/DraggableGridView;->getFirstVisiblePosition()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/DraggableGridView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 155
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v2, v3, :cond_5

    if-eqz v1, :cond_5

    .line 156
    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v3, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v3}, Lcom/roidapp/baselib/view/DraggableGridView;->l(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    add-int/2addr v0, v4

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->smoothScrollToPositionFromTop(II)V

    .line 167
    :cond_0
    :goto_1
    if-eqz v1, :cond_1

    .line 168
    iget-object v0, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->n(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->o(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->f(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/view/DraggableGridView;->a(Lcom/roidapp/baselib/view/DraggableGridView;II)V

    .line 172
    :cond_2
    return-void

    .line 144
    :cond_3
    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->f(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->k(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 145
    iget-object v0, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->h(Lcom/roidapp/baselib/view/DraggableGridView;)I

    move-result v0

    .line 146
    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->j(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->i(Lcom/roidapp/baselib/view/DraggableGridView;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 149
    :cond_4
    const/4 v0, 0x0

    .line 150
    iget-object v1, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->j(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->i(Lcom/roidapp/baselib/view/DraggableGridView;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 158
    :cond_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x8

    if-lt v2, v3, :cond_6

    .line 159
    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    neg-int v0, v0

    const/16 v3, 0xc8

    invoke-virtual {v2, v0, v3}, Lcom/roidapp/baselib/view/DraggableGridView;->smoothScrollBy(II)V

    goto :goto_1

    .line 161
    :cond_6
    if-eqz v1, :cond_0

    .line 162
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    add-int/2addr v0, v2

    .line 163
    iget-object v2, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->m(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/Scroller;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v3}, Lcom/roidapp/baselib/view/DraggableGridView;->m(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/Scroller;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Scroller;->getFinalX()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v4}, Lcom/roidapp/baselib/view/DraggableGridView;->m(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/Scroller;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Scroller;->getFinalY()I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v5}, Lcom/roidapp/baselib/view/DraggableGridView;->m(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/Scroller;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/Scroller;->getFinalX()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v6}, Lcom/roidapp/baselib/view/DraggableGridView;->m(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/Scroller;

    move-result-object v6

    invoke-virtual {v6}, Landroid/widget/Scroller;->getFinalY()I

    move-result v6

    add-int/2addr v0, v6

    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 164
    iget-object v0, p0, Lcom/roidapp/baselib/view/b;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->postInvalidate()V

    goto/16 :goto_1
.end method
