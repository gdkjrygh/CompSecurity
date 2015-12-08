.class final Lcom/roidapp/imagelib/filter/an;
.super Lcom/roidapp/imagelib/filter/ax;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/aj;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/aj;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 777
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/an;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-direct {p0, p2, p3}, Lcom/roidapp/imagelib/filter/ax;-><init>(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/ImageView;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 4

    .prologue
    .line 780
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 781
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/an;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/baselib/c/ah;->a(Ljava/lang/String;)I

    move-result v0

    .line 782
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/an;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aj;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/imagelib/e;->g:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 783
    new-instance v2, Lcom/roidapp/imagelib/c/a;

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-direct {v2, v1, v1, v3, v0}, Lcom/roidapp/imagelib/c/a;-><init>(IILandroid/graphics/Bitmap$Config;I)V

    .line 784
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/an;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    invoke-interface {p2}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/an;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/aj;->e:Lcom/roidapp/imagelib/c/e;

    invoke-static {v0, v1, p2, v2}, Lcom/roidapp/imagelib/c/h;->a(Ljava/lang/String;Lcom/roidapp/imagelib/c/e;Ljava/lang/Object;Lcom/roidapp/imagelib/c/a;)Lcom/roidapp/imagelib/c/h;

    move-result-object v0

    .line 785
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/an;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/aj;->b:Lcom/roidapp/imagelib/c/b;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-interface {p2, v2}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, p1, v0, v2}, Lcom/roidapp/imagelib/c/b;->a(Landroid/widget/ImageView;Lcom/roidapp/imagelib/c/h;Landroid/graphics/drawable/Drawable;)V

    .line 789
    :goto_0
    return-void

    .line 787
    :cond_0
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method
