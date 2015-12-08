.class final Lcom/roidapp/photogrid/release/v;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/photogrid/release/z;

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/b;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/roidapp/photogrid/release/r;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/r;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 413
    iput-object p1, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 414
    iput-object p2, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    .line 415
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 419
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 424
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 429
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 434
    if-eqz p2, :cond_1

    .line 435
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/z;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    .line 457
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_3

    .line 516
    :cond_0
    :goto_1
    return-object p2

    .line 437
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f03008c

    invoke-virtual {v0, v2, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 438
    new-instance v0, Lcom/roidapp/photogrid/release/z;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/z;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    .line 439
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    const v0, 0x7f0d021a

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/GridImageView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/z;->a:Lcom/roidapp/photogrid/release/GridImageView;

    .line 440
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    const v0, 0x7f0d021b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/roidapp/photogrid/release/z;->b:Landroid/widget/ImageView;

    .line 441
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->d(Lcom/roidapp/photogrid/release/r;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 442
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/z;->b:Landroid/widget/ImageView;

    const v2, 0x7f02036d

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 443
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/z;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 448
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/z;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/GridImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 449
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->e(Lcom/roidapp/photogrid/release/r;)I

    move-result v2

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 450
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->f(Lcom/roidapp/photogrid/release/r;)I

    move-result v2

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 451
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/z;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/GridImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 452
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/z;->a:Lcom/roidapp/photogrid/release/GridImageView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->e(Lcom/roidapp/photogrid/release/r;)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/r;->f(Lcom/roidapp/photogrid/release/r;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/release/GridImageView;->a(II)V

    .line 453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/z;->a:Lcom/roidapp/photogrid/release/GridImageView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/GridImageView;->a(I)V

    .line 454
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 445
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/z;->b:Landroid/widget/ImageView;

    const v2, 0x7f020377

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 462
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/b;

    .line 463
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/z;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v2, p1, v3}, Lcom/roidapp/photogrid/release/r;->a(ILcom/roidapp/photogrid/release/GridImageView;)V

    .line 464
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->d(Lcom/roidapp/photogrid/release/r;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 465
    iget-object v2, p0, Lcom/roidapp/photogrid/release/v;->a:Lcom/roidapp/photogrid/release/z;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/z;->b:Landroid/widget/ImageView;

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/b;->b:Z

    if-eqz v3, :cond_5

    :goto_3
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 469
    :cond_4
    new-instance v1, Lcom/roidapp/photogrid/release/w;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/release/w;-><init>(Lcom/roidapp/photogrid/release/v;Lcom/roidapp/photogrid/release/b;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 465
    :cond_5
    const/16 v1, 0x8

    goto :goto_3
.end method
