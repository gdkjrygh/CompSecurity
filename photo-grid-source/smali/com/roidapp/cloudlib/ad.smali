.class public abstract Lcom/roidapp/cloudlib/ad;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:Landroid/view/LayoutInflater;

.field protected c:Landroid/widget/AbsListView$LayoutParams;

.field final synthetic d:Lcom/roidapp/cloudlib/t;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/t;Landroid/app/Activity;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 492
    iput-object p1, p0, Lcom/roidapp/cloudlib/ad;->d:Lcom/roidapp/cloudlib/t;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 488
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/ad;->a:I

    .line 489
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/ad;->b:Landroid/view/LayoutInflater;

    .line 493
    const-string v0, "layout_inflater"

    invoke-virtual {p2, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/roidapp/cloudlib/ad;->b:Landroid/view/LayoutInflater;

    .line 495
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ad;->c:Landroid/widget/AbsListView$LayoutParams;

    .line 497
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 558
    iget v0, p0, Lcom/roidapp/cloudlib/ad;->a:I

    return v0
.end method

.method public abstract a(I)Ljava/lang/String;
.end method

.method public abstract b(I)Ljava/lang/String;
.end method

.method public final c(I)V
    .locals 3

    .prologue
    .line 549
    iget v0, p0, Lcom/roidapp/cloudlib/ad;->a:I

    if-ne p1, v0, :cond_0

    .line 555
    :goto_0
    return-void

    .line 552
    :cond_0
    iput p1, p0, Lcom/roidapp/cloudlib/ad;->a:I

    .line 553
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x1

    iget v2, p0, Lcom/roidapp/cloudlib/ad;->a:I

    invoke-direct {v0, v1, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ad;->c:Landroid/widget/AbsListView$LayoutParams;

    .line 554
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ad;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 506
    if-nez p2, :cond_2

    .line 507
    iget-object v0, p0, Lcom/roidapp/cloudlib/ad;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/roidapp/cloudlib/as;->E:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 509
    new-instance v1, Lcom/roidapp/cloudlib/ag;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/ag;-><init>()V

    .line 510
    sget v0, Lcom/roidapp/cloudlib/ar;->be:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/ag;->b:Landroid/widget/TextView;

    .line 512
    sget v0, Lcom/roidapp/cloudlib/ar;->aY:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/ag;->a:Landroid/widget/ImageView;

    .line 514
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 515
    iget-object v0, p0, Lcom/roidapp/cloudlib/ad;->c:Landroid/widget/AbsListView$LayoutParams;

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object v0, v1

    .line 522
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget v2, p0, Lcom/roidapp/cloudlib/ad;->a:I

    if-eq v1, v2, :cond_0

    .line 523
    iget-object v1, p0, Lcom/roidapp/cloudlib/ad;->c:Landroid/widget/AbsListView$LayoutParams;

    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 529
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/ad;->d:Lcom/roidapp/cloudlib/t;

    invoke-static {v1}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/ad;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v1

    .line 535
    iget v2, p0, Lcom/roidapp/cloudlib/ad;->a:I

    if-lez v2, :cond_1

    .line 536
    iget v2, p0, Lcom/roidapp/cloudlib/ad;->a:I

    iget v3, p0, Lcom/roidapp/cloudlib/ad;->a:I

    invoke-virtual {v1, v2, v3}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    .line 539
    :cond_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/ad;->d:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/ag;->a:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/t;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 540
    return-object p2

    .line 518
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ag;

    goto :goto_0
.end method
