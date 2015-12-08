.class final Lcom/roidapp/photogrid/release/li;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ld;

.field private b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/ld;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 327
    iput-object p1, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 328
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/li;->b:Landroid/view/LayoutInflater;

    .line 329
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ld;->e(Lcom/roidapp/photogrid/release/ld;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ld;->e(Lcom/roidapp/photogrid/release/ld;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 336
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 341
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 346
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v3, 0x0

    const v2, 0x7f0d03f7

    .line 351
    if-nez p1, :cond_0

    .line 353
    iget-object v0, p0, Lcom/roidapp/photogrid/release/li;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f0300fd

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 354
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 355
    const v2, 0x7f07023d

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    move-object v0, v1

    .line 373
    :goto_0
    return-object v0

    .line 357
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/li;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f0300fe

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 358
    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 359
    iget-object v1, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ld;->e(Lcom/roidapp/photogrid/release/ld;)Ljava/util/ArrayList;

    move-result-object v1

    add-int/lit8 v2, p1, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    const v1, 0x7f0d03fb

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 362
    iget-object v2, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ld;->a(Lcom/roidapp/photogrid/release/ld;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    iget-object v2, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ld;->f(Lcom/roidapp/photogrid/release/ld;)Ljava/util/ArrayList;

    move-result-object v2

    add-int/lit8 v5, p1, -0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 363
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 364
    invoke-static {}, Lcom/roidapp/photogrid/release/ld;->a()I

    move-result v4

    if-nez v4, :cond_1

    .line 365
    iget-object v4, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/ld;->a(Lcom/roidapp/photogrid/release/ld;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00c0

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 366
    const/16 v0, 0x32

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 371
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    move-object v0, v3

    goto :goto_0

    .line 368
    :cond_1
    iget-object v4, p0, Lcom/roidapp/photogrid/release/li;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/ld;->a(Lcom/roidapp/photogrid/release/ld;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00bf

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 369
    const/16 v0, 0xe1

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_1
.end method
