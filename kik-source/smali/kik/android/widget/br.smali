.class final Lkik/android/widget/br;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/bq;


# direct methods
.method constructor <init>(Lkik/android/widget/bq;)V
    .locals 0

    .prologue
    .line 370
    iput-object p1, p0, Lkik/android/widget/br;->a:Lkik/android/widget/bq;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 370
    check-cast p1, Lkik/android/gifs/view/a;

    iget-object v0, p0, Lkik/android/widget/br;->a:Lkik/android/widget/bq;

    iget-object v0, v0, Lkik/android/widget/bq;->b:Lkik/android/widget/bo;

    iget-object v0, v0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_gifUseButton:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    invoke-virtual {p1}, Lkik/android/gifs/view/a;->getNumberOfFrames()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/br;->a:Lkik/android/widget/bq;

    iget-object v1, v0, Lkik/android/widget/bq;->b:Lkik/android/widget/bo;

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
    .locals 2

    .prologue
    .line 374
    iget-object v0, p0, Lkik/android/widget/br;->a:Lkik/android/widget/bq;

    iget-object v0, v0, Lkik/android/widget/bq;->b:Lkik/android/widget/bo;

    iget-object v0, v0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/GifWidget;->a(Lkik/android/widget/GifWidget;Z)V

    .line 375
    return-void
.end method
