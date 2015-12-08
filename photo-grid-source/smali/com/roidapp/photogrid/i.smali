.class final Lcom/roidapp/photogrid/i;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/f;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/f;)V
    .locals 0

    .prologue
    .line 488
    iput-object p1, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/f;B)V
    .locals 0

    .prologue
    .line 488
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/i;-><init>(Lcom/roidapp/photogrid/f;)V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 492
    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-static {v0}, Lcom/roidapp/photogrid/f;->b(Lcom/roidapp/photogrid/f;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 493
    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-static {v0}, Lcom/roidapp/photogrid/f;->b(Lcom/roidapp/photogrid/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 495
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 500
    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-static {v0}, Lcom/roidapp/photogrid/f;->b(Lcom/roidapp/photogrid/f;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 501
    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-static {v0}, Lcom/roidapp/photogrid/f;->b(Lcom/roidapp/photogrid/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 503
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 508
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 514
    if-nez p2, :cond_1

    .line 515
    new-instance v1, Lcom/roidapp/photogrid/j;

    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-direct {v1, v0, v4}, Lcom/roidapp/photogrid/j;-><init>(Lcom/roidapp/photogrid/f;B)V

    .line 516
    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030109

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 517
    const v0, 0x7f0d041a

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/GridImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    .line 518
    iget-object v0, v1, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/GridImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 519
    iget-object v2, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/f;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f09002a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 520
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 521
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 522
    iget-object v3, v1, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/GridImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 523
    iget-object v0, v1, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0, v2, v2}, Lcom/roidapp/photogrid/release/GridImageView;->a(II)V

    .line 524
    iget-object v0, v1, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/GridImageView;->a(I)V

    .line 525
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 529
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-static {v0}, Lcom/roidapp/photogrid/f;->b(Lcom/roidapp/photogrid/f;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-static {v0}, Lcom/roidapp/photogrid/f;->b(Lcom/roidapp/photogrid/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 531
    iget-object v2, v1, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/GridImageView;->setTag(Ljava/lang/Object;)V

    .line 532
    iget-object v2, p0, Lcom/roidapp/photogrid/i;->a:Lcom/roidapp/photogrid/f;

    invoke-static {v2}, Lcom/roidapp/photogrid/f;->c(Lcom/roidapp/photogrid/f;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v2

    iget-object v1, v1, Lcom/roidapp/photogrid/j;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v2, v0, v1, v4, v4}, Lcom/roidapp/photogrid/release/kp;->b(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    .line 534
    :cond_0
    return-object p2

    .line 527
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/j;

    move-object v1, v0

    goto :goto_0
.end method
