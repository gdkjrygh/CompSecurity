.class public Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;
.super Lcom/qihoo/security/widget/ImageView/RemoteImageView;
.source "360Security"


# static fields
.field public static final a:Landroid/graphics/PorterDuffColorFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 11
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    const v1, -0x777778

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    sput-object v0, Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;->a:Landroid/graphics/PorterDuffColorFilter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    return-void
.end method


# virtual methods
.method public setPressed(Z)V
    .locals 2

    .prologue
    .line 20
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 23
    if-eqz p1, :cond_0

    .line 24
    sget-object v1, Lcom/qihoo/security/widget/ImageView/ColorFilterImageView;->a:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 27
    :cond_0
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setPressed(Z)V

    .line 29
    return-void
.end method
