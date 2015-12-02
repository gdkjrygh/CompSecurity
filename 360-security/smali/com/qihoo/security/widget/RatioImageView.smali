.class public Lcom/qihoo/security/widget/RatioImageView;
.super Landroid/widget/ImageView;
.source "360Security"


# instance fields
.field private a:F

.field private b:I

.field protected c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/appbox/c/a/b$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/RatioImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/RatioImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    iput v1, p0, Lcom/qihoo/security/widget/RatioImageView;->a:F

    .line 34
    iput v2, p0, Lcom/qihoo/security/widget/RatioImageView;->d:I

    .line 46
    sget-object v0, Lcom/qihoo/security/lite/a$a;->RatioImageView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 47
    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/RatioImageView;->a:F

    .line 48
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/RatioImageView;->d:I

    .line 49
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 50
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 3

    .prologue
    const/high16 v2, 0x40000000    # 2.0f

    .line 54
    iget v0, p0, Lcom/qihoo/security/widget/RatioImageView;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 55
    iget v0, p0, Lcom/qihoo/security/widget/RatioImageView;->b:I

    if-lez v0, :cond_0

    .line 56
    iget v0, p0, Lcom/qihoo/security/widget/RatioImageView;->b:I

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 58
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 59
    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/widget/RatioImageView;->a:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    .line 60
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 66
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 67
    return-void

    .line 62
    :cond_1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 63
    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/widget/RatioImageView;->a:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 64
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0
.end method

.method public setRatio(F)V
    .locals 0

    .prologue
    .line 74
    iput p1, p0, Lcom/qihoo/security/widget/RatioImageView;->a:F

    .line 75
    invoke-virtual {p0}, Lcom/qihoo/security/widget/RatioImageView;->requestLayout()V

    .line 76
    return-void
.end method

.method public setWidth(I)V
    .locals 0

    .prologue
    .line 79
    iput p1, p0, Lcom/qihoo/security/widget/RatioImageView;->b:I

    .line 80
    return-void
.end method
