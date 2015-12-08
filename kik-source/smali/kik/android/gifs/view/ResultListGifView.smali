.class public Lkik/android/gifs/view/ResultListGifView;
.super Lkik/android/gifs/view/GifView;
.source "SourceFile"


# instance fields
.field private h:I

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 19
    invoke-direct {p0, p1}, Lkik/android/gifs/view/GifView;-><init>(Landroid/content/Context;)V

    .line 14
    iput v0, p0, Lkik/android/gifs/view/ResultListGifView;->h:I

    .line 15
    iput v0, p0, Lkik/android/gifs/view/ResultListGifView;->i:I

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 24
    invoke-direct {p0, p1, p2}, Lkik/android/gifs/view/GifView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    iput v0, p0, Lkik/android/gifs/view/ResultListGifView;->h:I

    .line 15
    iput v0, p0, Lkik/android/gifs/view/ResultListGifView;->i:I

    .line 25
    return-void
.end method


# virtual methods
.method public final c(II)V
    .locals 0

    .prologue
    .line 29
    iput p2, p0, Lkik/android/gifs/view/ResultListGifView;->i:I

    .line 30
    iput p1, p0, Lkik/android/gifs/view/ResultListGifView;->h:I

    .line 31
    invoke-virtual {p0}, Lkik/android/gifs/view/ResultListGifView;->requestLayout()V

    .line 32
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 37
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 39
    iget v1, p0, Lkik/android/gifs/view/ResultListGifView;->h:I

    if-ltz v1, :cond_0

    iget v1, p0, Lkik/android/gifs/view/ResultListGifView;->i:I

    if-ltz v1, :cond_0

    .line 41
    int-to-float v1, v0

    iget v2, p0, Lkik/android/gifs/view/ResultListGifView;->h:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 42
    iget v2, p0, Lkik/android/gifs/view/ResultListGifView;->i:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 43
    invoke-virtual {p0, v0, v1}, Lkik/android/gifs/view/ResultListGifView;->setMeasuredDimension(II)V

    .line 48
    :goto_0
    return-void

    .line 46
    :cond_0
    invoke-super {p0, p1, p2}, Lkik/android/gifs/view/GifView;->onMeasure(II)V

    goto :goto_0
.end method
