.class final Lcom/roidapp/photogrid/cloud/d;
.super Lcom/roidapp/cloudlib/ads/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/ads/g",
        "<",
        "Lcom/roidapp/photogrid/cloud/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/a;)V
    .locals 0

    .prologue
    .line 165
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/ads/g;-><init>(Ljava/lang/Object;)V

    .line 166
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/a;B)V
    .locals 0

    .prologue
    .line 163
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/d;-><init>(Lcom/roidapp/photogrid/cloud/a;)V

    return-void
.end method

.method private static a(Lcom/roidapp/photogrid/cloud/a;)V
    .locals 1

    .prologue
    .line 233
    invoke-static {p0}, Lcom/roidapp/photogrid/cloud/a;->c(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 234
    invoke-static {p0}, Lcom/roidapp/photogrid/cloud/a;->c(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/e;->e()V

    .line 235
    :cond_0
    invoke-static {p0}, Lcom/roidapp/photogrid/cloud/a;->e(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;

    .line 236
    invoke-static {p0}, Lcom/roidapp/photogrid/cloud/a;->a(Lcom/roidapp/photogrid/cloud/a;)V

    .line 237
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 10

    .prologue
    const/4 v4, 0x0

    .line 163
    check-cast p1, Lcom/roidapp/photogrid/cloud/a;

    .line 2170
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->c(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2172
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    const v1, 0x9c45

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ads/f;->a(I)Lcom/cmcm/a/a/a;

    move-result-object v5

    .line 2173
    if-nez v5, :cond_1

    .line 2174
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->c(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->c(Lcom/roidapp/photogrid/cloud/a;)Lcom/roidapp/cloudlib/ads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/e;->d()I

    move-result v0

    if-nez v0, :cond_0

    .line 2177
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/d;->a(Lcom/roidapp/photogrid/cloud/a;)V

    .line 2186
    :cond_0
    :goto_0
    return-void

    .line 2184
    :cond_1
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/a;->a(Landroid/app/Activity;II)V

    .line 2185
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->d(Lcom/roidapp/photogrid/cloud/a;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2188
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090054

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v6, v0

    .line 2189
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03003a

    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->d(Lcom/roidapp/photogrid/cloud/a;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    .line 2190
    if-eqz v7, :cond_0

    .line 2192
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->d(Lcom/roidapp/photogrid/cloud/a;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2194
    const v0, 0x7f0d0122

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2195
    const v1, 0x7f0d0123

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 2196
    const v2, 0x7f0d0124

    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 2197
    const v3, 0x7f0d0125

    invoke-virtual {v7, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 2199
    invoke-interface {v5}, Lcom/cmcm/a/a/a;->f()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 2200
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v8

    invoke-static {v8}, Lcom/bumptech/glide/h;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v8

    invoke-interface {v5}, Lcom/cmcm/a/a/a;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v8

    invoke-virtual {v8}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v8

    sget-object v9, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v8, v9}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v8

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v8

    invoke-virtual {v8, v0}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 2207
    :cond_2
    if-eqz v1, :cond_3

    .line 2208
    invoke-interface {v5}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2209
    invoke-interface {v5}, Lcom/cmcm/a/a/a;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x7f02013d

    :goto_1
    invoke-static {v1, v4, v4, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 2211
    :cond_3
    if-eqz v2, :cond_4

    .line 2212
    invoke-interface {v5}, Lcom/cmcm/a/a/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2213
    :cond_4
    if-eqz v3, :cond_5

    .line 2214
    invoke-interface {v5}, Lcom/cmcm/a/a/a;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Lcom/cmcm/a/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_7

    .line 2215
    invoke-interface {v5}, Lcom/cmcm/a/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2218
    :goto_2
    const v0, 0x7f02013e

    invoke-static {v3, v4, v0, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 2221
    :cond_5
    invoke-interface {v5, v7}, Lcom/cmcm/a/a/a;->a(Landroid/view/View;)V

    .line 2223
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->d(Lcom/roidapp/photogrid/cloud/a;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 2224
    iput v6, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 2226
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->d(Lcom/roidapp/photogrid/cloud/a;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_6
    move v0, v4

    .line 2209
    goto :goto_1

    .line 2217
    :cond_7
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public final synthetic a(Ljava/lang/Object;Lcom/cmcm/a/a/a;)V
    .locals 3

    .prologue
    .line 163
    check-cast p1, Lcom/roidapp/photogrid/cloud/a;

    .line 1242
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a;->b(Lcom/roidapp/photogrid/cloud/a;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/a;->a(Landroid/app/Activity;II)V

    .line 163
    return-void
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 163
    check-cast p1, Lcom/roidapp/photogrid/cloud/a;

    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/d;->a(Lcom/roidapp/photogrid/cloud/a;)V

    return-void
.end method
