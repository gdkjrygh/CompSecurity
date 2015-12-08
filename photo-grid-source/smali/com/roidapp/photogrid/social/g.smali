.class final Lcom/roidapp/photogrid/social/g;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/social/d;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/social/d;)V
    .locals 0

    .prologue
    .line 244
    iput-object p1, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/social/d;B)V
    .locals 0

    .prologue
    .line 244
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/social/g;-><init>(Lcom/roidapp/photogrid/social/d;)V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 296
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 311
    :goto_0
    return-void

    .line 299
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 300
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/social/d;->a()V

    .line 301
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->c(Lcom/roidapp/photogrid/social/d;)I

    move-result v0

    if-nez v0, :cond_2

    .line 302
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 303
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->e(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    const v2, 0x7f07035c

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v4}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/photogrid/social/d;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 304
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->e(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 306
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->h(Lcom/roidapp/photogrid/social/d;)V

    goto :goto_0

    .line 309
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->h(Lcom/roidapp/photogrid/social/d;)V

    goto :goto_0
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 244
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/d;

    .line 1315
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->b(Ljava/lang/Object;)V

    .line 244
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/16 v1, 0x8

    const/4 v5, 0x0

    .line 244
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/d;

    .line 2248
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/social/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2255
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->c(Ljava/lang/Object;)V

    .line 2256
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 2257
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/a/d;->addAll(Ljava/util/Collection;)Z

    .line 2261
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/social/d;->a()V

    .line 2262
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->b(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2263
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->c(Lcom/roidapp/photogrid/social/d;)I

    move-result v0

    if-nez v0, :cond_5

    .line 2264
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->d(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 2265
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->d(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2267
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 2268
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->e(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    const v2, 0x7f07035c

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v4}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/photogrid/social/d;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2269
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->e(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2290
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->b(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v1}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/util/List;)V

    .line 2291
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->b(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    .line 244
    :cond_2
    return-void

    .line 2259
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0, p1}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;Lcom/roidapp/cloudlib/sns/b/a/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    goto/16 :goto_0

    .line 2271
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->f(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2272
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->f(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 2276
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->a(Lcom/roidapp/photogrid/social/d;)Lcom/roidapp/cloudlib/sns/b/a/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/d;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 2277
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->d(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_6

    .line 2278
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->d(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2280
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->e(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2281
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->e(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 2284
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->g(Lcom/roidapp/photogrid/social/d;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f0700c6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2285
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->d(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2286
    iget-object v0, p0, Lcom/roidapp/photogrid/social/g;->a:Lcom/roidapp/photogrid/social/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/social/d;->d(Lcom/roidapp/photogrid/social/d;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1
.end method
