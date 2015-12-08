.class public final Lcom/roidapp/cloudlib/facebook/k;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/roidapp/cloudlib/facebook/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

.field private b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;Landroid/app/Activity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 593
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/k;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    .line 594
    sget v0, Lcom/roidapp/cloudlib/as;->n:I

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 595
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/k;->b:Landroid/view/LayoutInflater;

    .line 596
    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 600
    if-eqz p2, :cond_0

    .line 601
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/l;

    move-object v1, v0

    .line 615
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/facebook/k;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/b;

    .line 616
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->a()I

    move-result v2

    .line 617
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 618
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->b()Ljava/lang/String;

    move-result-object v3

    .line 619
    if-nez v3, :cond_1

    .line 620
    iget-object v3, v1, Lcom/roidapp/cloudlib/facebook/l;->b:Landroid/widget/ImageView;

    sget v4, Lcom/roidapp/cloudlib/aq;->f:I

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 632
    :goto_1
    iget-object v3, v1, Lcom/roidapp/cloudlib/facebook/l;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 633
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->c()Ljava/lang/String;

    move-result-object v0

    const-string v3, "<friends_albums>"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 634
    iget-object v0, v1, Lcom/roidapp/cloudlib/facebook/l;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 635
    iget-object v0, v1, Lcom/roidapp/cloudlib/facebook/l;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 639
    :goto_2
    return-object p2

    .line 603
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/k;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/roidapp/cloudlib/as;->n:I

    invoke-virtual {v0, v1, p3, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 605
    new-instance v1, Lcom/roidapp/cloudlib/facebook/l;

    invoke-direct {v1, p0, v7}, Lcom/roidapp/cloudlib/facebook/l;-><init>(Lcom/roidapp/cloudlib/facebook/k;B)V

    .line 606
    sget v0, Lcom/roidapp/cloudlib/ar;->bi:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/facebook/l;->b:Landroid/widget/ImageView;

    .line 608
    sget v0, Lcom/roidapp/cloudlib/ar;->cJ:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/facebook/l;->c:Landroid/widget/TextView;

    .line 610
    sget v0, Lcom/roidapp/cloudlib/ar;->cI:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/facebook/l;->a:Landroid/widget/TextView;

    .line 612
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 623
    :cond_1
    iget-object v4, p0, Lcom/roidapp/cloudlib/facebook/k;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v4}, Lcom/bumptech/glide/h;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v3

    sget-object v4, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/cloudlib/facebook/k;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v4}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->h(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/cloudlib/facebook/k;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v5}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->h(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/cloudlib/facebook/k;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    iget-object v5, v1, Lcom/roidapp/cloudlib/facebook/l;->b:Landroid/widget/ImageView;

    .line 1440
    new-instance v6, Lcom/roidapp/cloudlib/facebook/g;

    invoke-direct {v6, v4, v5}, Lcom/roidapp/cloudlib/facebook/g;-><init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;Landroid/widget/ImageView;)V

    .line 623
    invoke-virtual {v3, v6}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_1

    .line 637
    :cond_2
    iget-object v0, v1, Lcom/roidapp/cloudlib/facebook/l;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method
