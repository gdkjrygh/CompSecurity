.class final Lkik/android/widget/bq;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/gifs/a/f;

.field final synthetic b:Lkik/android/widget/bo;


# direct methods
.method constructor <init>(Lkik/android/widget/bo;Lkik/android/gifs/a/f;)V
    .locals 0

    .prologue
    .line 365
    iput-object p1, p0, Lkik/android/widget/bq;->b:Lkik/android/widget/bo;

    iput-object p2, p0, Lkik/android/widget/bq;->a:Lkik/android/gifs/a/f;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 365
    check-cast p1, Lkik/android/gifs/view/a;

    iget-object v0, p0, Lkik/android/widget/bq;->b:Lkik/android/widget/bo;

    iget-object v0, v0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_gifUseButton:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkik/android/gifs/view/a;->getNumberOfFrames()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lkik/android/widget/bq;->b:Lkik/android/widget/bo;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/android/gifs/view/a;->getFrame(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/widget/bo;->a(Lkik/android/widget/bo;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 369
    iget-object v0, p0, Lkik/android/widget/bq;->b:Lkik/android/widget/bo;

    iget-object v0, v0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    iget-object v1, p0, Lkik/android/widget/bq;->a:Lkik/android/gifs/a/f;

    sget-object v2, Lkik/android/gifs/a/f$a;->d:Lkik/android/gifs/a/f$a;

    invoke-virtual {v1, v2}, Lkik/android/gifs/a/f;->a(Lkik/android/gifs/a/f$a;)Lkik/android/gifs/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/gifs/a/e;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    invoke-virtual {v0, v1, v2}, Lkik/android/gifs/view/AspectRatioGifView;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/widget/br;

    invoke-direct {v1, p0}, Lkik/android/widget/br;-><init>(Lkik/android/widget/bq;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 386
    return-void
.end method
