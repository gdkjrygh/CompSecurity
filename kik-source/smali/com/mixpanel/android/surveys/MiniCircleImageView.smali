.class public Lcom/mixpanel/android/surveys/MiniCircleImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a()V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a()V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a()V

    .line 30
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 33
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a:Landroid/graphics/Paint;

    .line 34
    iget-object v0, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    iget-object v0, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/MiniCircleImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 38
    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    .line 39
    iget-object v1, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 40
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 44
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 46
    iget v0, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->b:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    .line 47
    iget v1, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->c:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    .line 50
    const v2, 0x3f333333    # 0.7f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v3

    mul-float/2addr v2, v3

    .line 51
    iget-object v3, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 52
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 56
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 58
    iput p1, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->b:I

    .line 59
    iput p2, p0, Lcom/mixpanel/android/surveys/MiniCircleImageView;->c:I

    .line 60
    return-void
.end method
