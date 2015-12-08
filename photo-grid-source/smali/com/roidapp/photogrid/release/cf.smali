.class final Lcom/roidapp/photogrid/release/cf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:I

.field final synthetic d:Lcom/roidapp/photogrid/release/cd;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cd;Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/cf;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/cf;->b:Landroid/view/View;

    iput p4, p0, Lcom/roidapp/photogrid/release/cf;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const v4, 0x7f0d0493

    const/4 v3, 0x0

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 161
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->f(Lcom/roidapp/photogrid/release/cd;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->g(Lcom/roidapp/photogrid/release/cd;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->f(Lcom/roidapp/photogrid/release/cd;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cd;->f(Lcom/roidapp/photogrid/release/cd;)Landroid/widget/HorizontalScrollView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 124
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->h(Lcom/roidapp/photogrid/release/cd;)I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 125
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->f(Lcom/roidapp/photogrid/release/cd;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cd;->h(Lcom/roidapp/photogrid/release/cd;)I

    move-result v2

    sub-int v0, v2, v0

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 137
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->i(Lcom/roidapp/photogrid/release/cd;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->i(Lcom/roidapp/photogrid/release/cd;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 140
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->b:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    iget v1, p0, Lcom/roidapp/photogrid/release/cf;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->e(Lcom/roidapp/photogrid/release/cd;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 145
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 146
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 147
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ra;->aq:Z

    .line 148
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->b(Lcom/roidapp/photogrid/release/cd;)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/ra;->a(II)V

    .line 149
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 150
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_0

    .line 128
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->f(Lcom/roidapp/photogrid/release/cd;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 130
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->h(Lcom/roidapp/photogrid/release/cd;)I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 131
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cd;->f(Lcom/roidapp/photogrid/release/cd;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cd;->h(Lcom/roidapp/photogrid/release/cd;)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto/16 :goto_1

    .line 153
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->b(Lcom/roidapp/photogrid/release/cd;)I

    move-result v0

    if-nez v0, :cond_6

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/mm;->b(I)V

    goto/16 :goto_0

    .line 156
    :cond_6
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 157
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->v(Z)V

    .line 158
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->a(Lcom/roidapp/photogrid/release/cd;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/cf;->d:Lcom/roidapp/photogrid/release/cd;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cd;->b(Lcom/roidapp/photogrid/release/cd;)I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/release/mm;->a(II)V

    goto/16 :goto_0
.end method
