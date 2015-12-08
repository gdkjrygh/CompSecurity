.class final Lcom/roidapp/photogrid/release/hl;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/hk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hk;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method

.method private a(I)Lcom/roidapp/photogrid/release/ig;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    return-object v0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v0, v0

    .line 91
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/hl;->a(I)Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 102
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 107
    if-nez p2, :cond_0

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/hk;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f030139

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/video/cc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/video/cc;-><init>()V

    const-class v2, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/p;->a(Lcom/bumptech/glide/load/c/s;Ljava/lang/Class;)Lcom/bumptech/glide/r;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/hl;->a(I)Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/r;->a(Ljava/lang/Object;)Lcom/bumptech/glide/s;

    move-result-object v0

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/s;->a(Ljava/lang/Class;)Lcom/bumptech/glide/g;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/video/bm;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/hk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roidapp/photogrid/video/bm;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->b:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/e;->e()Lcom/bumptech/glide/e;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hk;->a(Lcom/roidapp/photogrid/release/hk;)I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hl;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->a(Lcom/roidapp/photogrid/release/hk;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/e;->a(II)Lcom/bumptech/glide/e;

    move-result-object v1

    const v0, 0x7f0d04ef

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/e;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 122
    return-object p2
.end method
