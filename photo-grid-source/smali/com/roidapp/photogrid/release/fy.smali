.class final Lcom/roidapp/photogrid/release/fy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lcom/roidapp/photogrid/release/fr;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fr;Landroid/view/ViewGroup;Landroid/view/View;II)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/fy;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/fy;->b:Landroid/view/View;

    iput p4, p0, Lcom/roidapp/photogrid/release/fy;->c:I

    iput p5, p0, Lcom/roidapp/photogrid/release/fy;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const v4, 0x7f0d0493

    const/4 v3, 0x0

    .line 233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->f(Lcom/roidapp/photogrid/release/fr;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 273
    :goto_0
    return-void

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->g(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->h(Lcom/roidapp/photogrid/release/fr;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->g(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fr;->g(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/HorizontalScrollView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 239
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->i(Lcom/roidapp/photogrid/release/fr;)I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_4

    .line 240
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->g(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fr;->i(Lcom/roidapp/photogrid/release/fr;)I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    sub-int v0, v2, v0

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 252
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 255
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->b:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 256
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    iget v1, p0, Lcom/roidapp/photogrid/release/fy;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->j(Lcom/roidapp/photogrid/release/fr;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 270
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    iget v1, p0, Lcom/roidapp/photogrid/release/fy;->d:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fr;->j(Lcom/roidapp/photogrid/release/fr;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/fr;->a(II)V

    goto/16 :goto_0

    .line 243
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->g(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 245
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->i(Lcom/roidapp/photogrid/release/fr;)I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_1

    .line 246
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->g(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fr;->i(Lcom/roidapp/photogrid/release/fr;)I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto :goto_1

    .line 260
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/fr;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->b(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_2

    .line 265
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/fr;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->e(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fy;->e:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->d(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_2

    .line 258
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
