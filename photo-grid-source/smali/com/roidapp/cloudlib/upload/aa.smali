.class final Lcom/roidapp/cloudlib/upload/aa;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/x;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/upload/x;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .prologue
    .line 218
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/aa;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 219
    iput-object p2, p0, Lcom/roidapp/cloudlib/upload/aa;->b:Ljava/util/List;

    .line 220
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 223
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/aa;->b:Ljava/util/List;

    .line 224
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/aa;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/aa;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/aa;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/aa;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 236
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 241
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    .line 246
    if-nez p2, :cond_0

    .line 247
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->am:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 249
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->ds:I

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    .line 250
    sget v1, Lcom/roidapp/cloudlib/ar;->dr:I

    invoke-static {p2, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 252
    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/aa;->b:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/cloudlib/sns/b/x;

    .line 253
    if-eqz v2, :cond_1

    .line 254
    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    .line 1261
    iget-object v4, p0, Lcom/roidapp/cloudlib/upload/aa;->a:Lcom/roidapp/cloudlib/upload/x;

    invoke-static {v4}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v3

    sget-object v4, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v3

    new-instance v4, Lcom/roidapp/cloudlib/sns/e/a;

    invoke-direct {v4, v0}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 255
    iget-object v0, v2, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 257
    :cond_1
    return-object p2
.end method
