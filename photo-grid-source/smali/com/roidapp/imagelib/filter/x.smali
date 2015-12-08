.class final Lcom/roidapp/imagelib/filter/x;
.super Lcom/roidapp/imagelib/filter/ax;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/s;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/s;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 345
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/x;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-direct {p0, p2, p3}, Lcom/roidapp/imagelib/filter/ax;-><init>(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/ImageView;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 1

    .prologue
    .line 349
    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 350
    return-void
.end method
