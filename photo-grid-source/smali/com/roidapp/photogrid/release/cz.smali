.class final Lcom/roidapp/photogrid/release/cz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lcom/roidapp/photogrid/release/cy;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cy;Landroid/view/ViewGroup;Landroid/view/View;II)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/cz;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/cz;->b:Landroid/view/View;

    iput p4, p0, Lcom/roidapp/photogrid/release/cz;->c:I

    iput p5, p0, Lcom/roidapp/photogrid/release/cz;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const v4, 0x7f0d0493

    const/4 v3, 0x0

    .line 78
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cy;->a(Lcom/roidapp/photogrid/release/cy;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 111
    :cond_0
    :goto_0
    return-void

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cy;->b(Lcom/roidapp/photogrid/release/cy;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 83
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cy;->c(Lcom/roidapp/photogrid/release/cy;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->b(Lcom/roidapp/photogrid/release/cy;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cy;->b(Lcom/roidapp/photogrid/release/cy;)Landroid/widget/HorizontalScrollView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 84
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->d(Lcom/roidapp/photogrid/release/cy;)I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_4

    .line 85
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->b(Lcom/roidapp/photogrid/release/cy;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cy;->d(Lcom/roidapp/photogrid/release/cy;)I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    sub-int v0, v2, v0

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 97
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cy;->e(Lcom/roidapp/photogrid/release/cy;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->e(Lcom/roidapp/photogrid/release/cy;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 101
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->b:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    iget v1, p0, Lcom/roidapp/photogrid/release/cz;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/cy;->a(Lcom/roidapp/photogrid/release/cy;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 103
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cy;->a(Lcom/roidapp/photogrid/release/cy;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P()Lcom/roidapp/photogrid/release/az;

    move-result-object v0

    .line 104
    if-eqz v0, :cond_0

    .line 105
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    iget v2, p0, Lcom/roidapp/photogrid/release/cz;->d:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/cy;->a(Lcom/roidapp/photogrid/release/cy;I)I

    .line 106
    iget v1, p0, Lcom/roidapp/photogrid/release/cz;->d:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(I)V

    .line 107
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->invalidate()V

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    iget v1, p0, Lcom/roidapp/photogrid/release/cz;->d:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/cy;->b(Lcom/roidapp/photogrid/release/cy;I)V

    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->f(Lcom/roidapp/photogrid/release/cy;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/cy;->c(Lcom/roidapp/photogrid/release/cy;I)V

    goto/16 :goto_0

    .line 88
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->b(Lcom/roidapp/photogrid/release/cy;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 90
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->d(Lcom/roidapp/photogrid/release/cy;)I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_2

    .line 91
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cy;->b(Lcom/roidapp/photogrid/release/cy;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cz;->e:Lcom/roidapp/photogrid/release/cy;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cy;->d(Lcom/roidapp/photogrid/release/cy;)I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto/16 :goto_1
.end method
