.class final Lcom/roidapp/photogrid/release/gx;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 4

    .prologue
    .line 424
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 425
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 426
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->k(Lcom/roidapp/photogrid/release/ge;)V

    .line 428
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->l(Lcom/roidapp/photogrid/release/ge;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 429
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/rc;->b(Landroid/content/Context;)V

    .line 430
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 431
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 432
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 433
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 434
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 435
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-static {p1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 436
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 437
    const-string v2, "FREE_TEXT_FONT"

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Typeface;)I

    move-result v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 438
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 443
    :cond_0
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 447
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->l(Lcom/roidapp/photogrid/release/ge;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 452
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->l(Lcom/roidapp/photogrid/release/ge;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 457
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 462
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 463
    if-nez p2, :cond_0

    .line 464
    const v1, 0x7f0300cb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 467
    :cond_0
    const v0, 0x7f0d0338

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 468
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->l(Lcom/roidapp/photogrid/release/ge;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "_"

    const-string v3, " "

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 469
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 470
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->m(Lcom/roidapp/photogrid/release/ge;)I

    move-result v1

    if-ne p1, v1, :cond_2

    .line 471
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 475
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 476
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 479
    :cond_1
    return-object p2

    .line 473
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gx;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00cf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method
