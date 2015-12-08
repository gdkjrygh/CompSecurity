.class final Lcom/roidapp/photogrid/release/kk;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/kg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kg;)V
    .locals 0

    .prologue
    .line 320
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v5, 0x8

    .line 322
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 394
    :goto_0
    return-void

    .line 324
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->g(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->g(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Z)Z

    .line 328
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->h(Lcom/roidapp/photogrid/release/kg;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->h(Lcom/roidapp/photogrid/release/kg;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 330
    const-string v0, "load bitmap"

    const-string v1, "end..................."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->i(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kg;->h(Lcom/roidapp/photogrid/release/kg;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 333
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->j(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v0

    .line 334
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kg;->j(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    .line 338
    if-lez v0, :cond_1

    if-lez v1, :cond_1

    .line 339
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;I)I

    .line 340
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/kg;->d(Lcom/roidapp/photogrid/release/kg;I)I

    .line 344
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->k(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 346
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kg;->h(Lcom/roidapp/photogrid/release/kg;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 347
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->h(Lcom/roidapp/photogrid/release/kg;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 353
    iget-object v3, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->e(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    if-gt v1, v3, :cond_2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->f(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    if-gt v2, v3, :cond_2

    .line 354
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 355
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 372
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kg;->k(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 373
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->l(Lcom/roidapp/photogrid/release/kg;)I

    move-result v0

    if-lez v0, :cond_4

    .line 374
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->k(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 375
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->m(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 382
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->m(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kg;->l(Lcom/roidapp/photogrid/release/kg;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 358
    :cond_2
    iget-object v3, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->e(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kg;->f(Lcom/roidapp/photogrid/release/kg;)I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 359
    int-to-float v1, v1

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 360
    cmpl-float v2, v3, v1

    if-lez v2, :cond_3

    .line 361
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->f(Lcom/roidapp/photogrid/release/kg;)I

    move-result v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 362
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->f(Lcom/roidapp/photogrid/release/kg;)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_1

    .line 365
    :cond_3
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->e(Lcom/roidapp/photogrid/release/kg;)I

    move-result v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 366
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->e(Lcom/roidapp/photogrid/release/kg;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    div-float v1, v2, v1

    float-to-int v1, v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_1

    .line 378
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->k(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->m(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 389
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->k(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 390
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kk;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->m(Lcom/roidapp/photogrid/release/kg;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 322
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
