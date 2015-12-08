.class final Lcom/roidapp/photogrid/release/ha;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field a:Lcom/roidapp/photogrid/release/gy;

.field final synthetic b:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 491
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 493
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 497
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->n(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 502
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 507
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 512
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 513
    if-nez p2, :cond_0

    .line 514
    const v1, 0x7f0300a3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 516
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 517
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/gy;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    .line 526
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->n(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->h()Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/gy;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 532
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->o(Lcom/roidapp/photogrid/release/ge;)[J

    move-result-object v1

    aget-wide v2, v1, p1

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 533
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->i(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->i(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 534
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;)Z

    move-result v0

    .line 535
    if-eqz v0, :cond_2

    .line 537
    const/4 v0, 0x1

    const/high16 v1, 0x40a00000    # 5.0f

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ge;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 538
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    const v2, 0x7f02037b

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 539
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 540
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    const v1, 0x7f0200ea

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 541
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 542
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    new-instance v1, Lcom/roidapp/photogrid/release/hb;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/release/hb;-><init>(Lcom/roidapp/photogrid/release/ha;I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 556
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 557
    return-object p2

    .line 519
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/release/gy;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/gy;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    .line 520
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    const v0, 0x7f0d027c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/gy;->a:Landroid/widget/ImageView;

    .line 521
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    const v0, 0x7f0d027e

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/gy;->c:Landroid/widget/TextView;

    .line 522
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    const v0, 0x7f0d027d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    goto/16 :goto_0

    .line 550
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    const v1, 0x7f020395

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 551
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 552
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    const v1, 0x7f0c0026

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 553
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 554
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ha;->a:Lcom/roidapp/photogrid/release/gy;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/gy;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setClickable(Z)V

    goto :goto_1
.end method
