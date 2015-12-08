.class final Lkik/android/widget/bo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/GifWidget$b;


# instance fields
.field final synthetic a:Lkik/android/widget/GifWidget;

.field private b:Lkik/android/gifs/a/f;

.field private c:Landroid/graphics/Bitmap;

.field private d:Ljava/lang/String;

.field private e:I


# direct methods
.method constructor <init>(Lkik/android/widget/GifWidget;)V
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/bo;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lkik/android/widget/bo;->c:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lkik/android/widget/bo;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lkik/android/widget/bo;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lkik/android/widget/bo;)I
    .locals 1

    .prologue
    .line 304
    iget v0, p0, Lkik/android/widget/bo;->e:I

    return v0
.end method

.method static synthetic c(Lkik/android/widget/bo;)Lkik/android/gifs/a/f;
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lkik/android/widget/bo;->b:Lkik/android/gifs/a/f;

    return-object v0
.end method


# virtual methods
.method public final a(Lkik/android/gifs/a/f;ILjava/lang/String;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 347
    iput p2, p0, Lkik/android/widget/bo;->e:I

    .line 348
    iput-object p3, p0, Lkik/android/widget/bo;->d:Ljava/lang/String;

    .line 349
    iput-object p1, p0, Lkik/android/widget/bo;->b:Lkik/android/gifs/a/f;

    .line 350
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    invoke-static {v0, v2}, Lkik/android/widget/GifWidget;->a(Lkik/android/widget/GifWidget;Z)V

    .line 351
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lkik/android/gifs/view/AspectRatioGifView;->setVisibility(I)V

    .line 352
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_previewView:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 353
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_gifUseButton:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 354
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_gifUseButton:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 355
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_rechooseButton:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 357
    invoke-virtual {p1}, Lkik/android/gifs/a/f;->c()Lkik/android/gifs/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/gifs/a/e;->b()Landroid/graphics/Point;

    move-result-object v0

    .line 358
    iget-object v1, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v1, v1, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    iget v2, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {v1, v2, v0}, Lkik/android/gifs/view/AspectRatioGifView;->c(II)V

    .line 363
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    invoke-virtual {p1}, Lkik/android/gifs/a/f;->c()Lkik/android/gifs/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/gifs/a/e;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    invoke-virtual {v0, v1, v2}, Lkik/android/gifs/view/AspectRatioGifView;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;)Lcom/kik/g/p;

    move-result-object v0

    const-wide/16 v2, 0x9c4

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v0

    .line 365
    new-instance v1, Lkik/android/widget/bq;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/bq;-><init>(Lkik/android/widget/bo;Lkik/android/gifs/a/f;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 397
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 317
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 339
    :goto_0
    return-void

    .line 319
    :pswitch_0
    iget-object v0, p0, Lkik/android/widget/bo;->b:Lkik/android/gifs/a/f;

    invoke-virtual {v0}, Lkik/android/gifs/a/f;->c()Lkik/android/gifs/a/e;

    move-result-object v0

    .line 321
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    invoke-virtual {v0}, Lkik/android/gifs/a/e;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/bo;->b:Lkik/android/gifs/a/f;

    iget-object v3, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v3, v3, Lkik/android/widget/GifWidget;->c:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/widget/bo;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0, v2, v3, v4}, Lkik/android/f/a/f;->a(Ljava/lang/String;Lkik/android/gifs/a/f;Lcom/kik/cache/ad;Landroid/graphics/Bitmap;)Lcom/kik/g/p;

    move-result-object v0

    .line 323
    new-instance v1, Lkik/android/widget/bp;

    invoke-direct {v1, p0}, Lkik/android/widget/bp;-><init>(Lkik/android/widget/bo;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 335
    :pswitch_1
    iget-object v0, p0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_previewView:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 336
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/bo;->c:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 317
    nop

    :pswitch_data_0
    .packed-switch 0x7f0e0128
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
