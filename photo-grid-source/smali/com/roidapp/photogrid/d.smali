.class final Lcom/roidapp/photogrid/d;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/a;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/a;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/a;B)V
    .locals 0

    .prologue
    .line 222
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/d;-><init>(Lcom/roidapp/photogrid/a;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/d;)Ljava/util/List;
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/d;->b:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 226
    iput-object p1, p0, Lcom/roidapp/photogrid/d;->b:Ljava/util/List;

    .line 227
    return-void
.end method

.method public final destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 271
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 272
    return-void
.end method

.method public final getCount()I
    .locals 2

    .prologue
    .line 240
    iget-object v0, p0, Lcom/roidapp/photogrid/d;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0
.end method

.method public final getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 281
    const/4 v0, -0x2

    return v0
.end method

.method public final instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    .prologue
    .line 245
    iget-object v0, p0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->k(Lcom/roidapp/photogrid/a;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030099

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 246
    const v0, 0x7f0d026e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 247
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 248
    iget-object v3, p0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v3}, Lcom/roidapp/photogrid/a;->l(Lcom/roidapp/photogrid/a;)I

    move-result v3

    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 249
    iget-object v3, p0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v3}, Lcom/roidapp/photogrid/a;->m(Lcom/roidapp/photogrid/a;)I

    move-result v3

    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 250
    new-instance v1, Lcom/roidapp/photogrid/e;

    invoke-direct {v1, p0, p2}, Lcom/roidapp/photogrid/e;-><init>(Lcom/roidapp/photogrid/d;I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    iget-object v1, p0, Lcom/roidapp/photogrid/d;->b:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/b/u;

    .line 1230
    iget-object v3, p0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v3}, Lcom/roidapp/photogrid/a;->j(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/k;

    move-result-object v3

    invoke-static {v3}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/u;->b:Ljava/lang/String;

    invoke-virtual {v3, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v3}, Lcom/roidapp/photogrid/a;->h(Lcom/roidapp/photogrid/a;)I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v4}, Lcom/roidapp/photogrid/a;->i(Lcom/roidapp/photogrid/a;)I

    move-result v4

    invoke-virtual {v1, v3, v4}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 265
    const/4 v0, 0x0

    invoke-virtual {p1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 266
    return-object v2
.end method

.method public final isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 276
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
