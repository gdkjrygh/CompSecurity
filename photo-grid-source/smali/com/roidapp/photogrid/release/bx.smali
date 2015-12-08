.class final Lcom/roidapp/photogrid/release/bx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lcom/roidapp/photogrid/release/bu;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/bu;Landroid/view/ViewGroup;Landroid/view/View;II)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/bx;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/bx;->b:Landroid/view/View;

    iput p4, p0, Lcom/roidapp/photogrid/release/bx;->c:I

    iput p5, p0, Lcom/roidapp/photogrid/release/bx;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const v4, 0x7f0d0493

    const/4 v3, 0x0

    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 128
    :cond_0
    :goto_0
    return-void

    .line 93
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->e(Lcom/roidapp/photogrid/release/bu;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->f(Lcom/roidapp/photogrid/release/bu;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->e(Lcom/roidapp/photogrid/release/bu;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/bu;->e(Lcom/roidapp/photogrid/release/bu;)Landroid/widget/HorizontalScrollView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 95
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->g(Lcom/roidapp/photogrid/release/bu;)I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_4

    .line 96
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->e(Lcom/roidapp/photogrid/release/bu;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/bu;->g(Lcom/roidapp/photogrid/release/bu;)I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    sub-int v0, v2, v0

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 108
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->h(Lcom/roidapp/photogrid/release/bu;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->h(Lcom/roidapp/photogrid/release/bu;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 111
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->b:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    iget v1, p0, Lcom/roidapp/photogrid/release/bx;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 114
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->d(Lcom/roidapp/photogrid/release/bu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 116
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 117
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 118
    iget v1, p0, Lcom/roidapp/photogrid/release/bx;->d:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->a(I)V

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_0

    .line 99
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->e(Lcom/roidapp/photogrid/release/bu;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 101
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->g(Lcom/roidapp/photogrid/release/bu;)I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_2

    .line 102
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/bu;->e(Lcom/roidapp/photogrid/release/bu;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/bu;->g(Lcom/roidapp/photogrid/release/bu;)I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto/16 :goto_1

    .line 122
    :cond_5
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 123
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->v(Z)V

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bx;->e:Lcom/roidapp/photogrid/release/bu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/bu;->a(Lcom/roidapp/photogrid/release/bu;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v1, p0, Lcom/roidapp/photogrid/release/bx;->d:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->a(I)V

    goto/16 :goto_0
.end method
