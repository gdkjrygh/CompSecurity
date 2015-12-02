.class public Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;
.super Lcom/qihoo/security/widget/ImageView/RemoteImageView;
.source "360Security"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;->a:Z

    .line 15
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 31
    if-lez p2, :cond_0

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "make sure defaultIcon<=0!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    .line 35
    iput-object p1, p0, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;->b:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 40
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 41
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;->setLoaded(Z)V

    .line 42
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 46
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;->setLoaded(Z)V

    .line 48
    return-void
.end method

.method public setLoaded(Z)V
    .locals 0

    .prologue
    .line 26
    iput-boolean p1, p0, Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;->a:Z

    .line 27
    return-void
.end method
