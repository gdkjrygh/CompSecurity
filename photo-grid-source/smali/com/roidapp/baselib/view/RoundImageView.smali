.class public Lcom/roidapp/baselib/view/RoundImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 15
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    return-void
.end method


# virtual methods
.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 24
    new-instance v0, Lcom/roidapp/baselib/view/v;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/RoundImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/roidapp/baselib/view/v;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 25
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/v;->a(F)V

    .line 26
    invoke-virtual {v0}, Lcom/roidapp/baselib/view/v;->a()V

    .line 27
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/RoundImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    return-void
.end method
