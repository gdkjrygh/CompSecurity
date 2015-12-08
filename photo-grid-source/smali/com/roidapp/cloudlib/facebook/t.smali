.class public final Lcom/roidapp/cloudlib/facebook/t;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/roidapp/cloudlib/facebook/FbFriend;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

.field private b:Landroid/view/LayoutInflater;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/FbFriend;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/FbFriend;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;Landroid/app/Activity;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/FbFriend;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 391
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    .line 392
    sget v0, Lcom/roidapp/cloudlib/as;->o:I

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 393
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/t;->b:Landroid/view/LayoutInflater;

    .line 394
    iput-object p3, p0, Lcom/roidapp/cloudlib/facebook/t;->c:Ljava/util/List;

    .line 395
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/t;->d:Ljava/util/List;

    .line 396
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 398
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 399
    return-void

    .line 400
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/FbFriend;

    .line 401
    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/t;->d:Ljava/util/List;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;->a()Lcom/roidapp/cloudlib/facebook/FbFriend;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 406
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 407
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 408
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/t;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 410
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 411
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 412
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/t;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 413
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/t;->notifyDataSetChanged()V

    .line 414
    return-void

    .line 416
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/FbFriend;

    .line 418
    if-eqz v0, :cond_0

    .line 419
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;->c()Ljava/lang/String;

    move-result-object v4

    .line 420
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 421
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;->a()Lcom/roidapp/cloudlib/facebook/FbFriend;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x0

    .line 428
    if-eqz p2, :cond_0

    .line 429
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/v;

    move-object v3, v0

    .line 440
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/facebook/t;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/FbFriend;

    .line 441
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;->b()Ljava/lang/String;

    move-result-object v1

    .line 1088
    if-nez v1, :cond_1

    .line 1089
    const-string v1, ""

    .line 442
    :goto_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/t;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/facebook/u;

    iget-object v4, v3, Lcom/roidapp/cloudlib/facebook/v;->a:Landroid/widget/ImageView;

    invoke-direct {v2, p0, v4}, Lcom/roidapp/cloudlib/facebook/u;-><init>(Lcom/roidapp/cloudlib/facebook/t;Landroid/widget/ImageView;)V

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 476
    iget-object v1, v3, Lcom/roidapp/cloudlib/facebook/v;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 477
    return-object p2

    .line 431
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/t;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/roidapp/cloudlib/as;->o:I

    invoke-virtual {v0, v1, p3, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 433
    new-instance v1, Lcom/roidapp/cloudlib/facebook/v;

    invoke-direct {v1, v7}, Lcom/roidapp/cloudlib/facebook/v;-><init>(B)V

    .line 434
    sget v0, Lcom/roidapp/cloudlib/ar;->da:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/facebook/v;->b:Landroid/widget/TextView;

    .line 436
    sget v0, Lcom/roidapp/cloudlib/ar;->bl:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/facebook/v;->a:Landroid/widget/ImageView;

    .line 438
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v3, v1

    goto :goto_0

    .line 1090
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1097
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v5, "https://graph.facebook.com/v2.3/%s/picture"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v7

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1098
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v4

    goto :goto_1

    .line 1100
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1102
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/baselib/c/x;

    .line 1103
    if-eqz v1, :cond_3

    iget-object v7, v1, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    if-eqz v7, :cond_3

    .line 1104
    iget-object v7, v1, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1105
    iget-object v1, v1, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1108
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    invoke-static {v4, v1, v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1
.end method
