.class public Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;
.super Landroid/widget/LinearLayout;
.source "360Security"


# instance fields
.field protected a:I

.field private final b:Landroid/graphics/Rect;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/drawable/GradientDrawable;

.field private e:I

.field private f:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->b:Landroid/graphics/Rect;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    .line 48
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->a()V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->b:Landroid/graphics/Rect;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    .line 43
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->a()V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->b:Landroid/graphics/Rect;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->a()V

    .line 39
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 92
    const/4 v0, 0x0

    invoke-virtual {p0, v3, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->setLayerType(ILandroid/graphics/Paint;)V

    .line 94
    :cond_0
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->c:Landroid/graphics/Paint;

    .line 95
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 96
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 98
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->d:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->d:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 102
    return-void

    .line 96
    :array_0
    .array-data 4
        0x66ffffff
        0x33ffffff
    .end array-data
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->d:Landroid/graphics/drawable/GradientDrawable;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 72
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->d:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->f:Landroid/graphics/Path;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->f:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 77
    :cond_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->a:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 78
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 79
    return-void
.end method

.method public getCoverColor()I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->a:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .prologue
    .line 66
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 67
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    .line 53
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 54
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->getMeasuredWidth()I

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    if-gtz v0, :cond_0

    .line 57
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->getMeasuredWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    .line 59
    :cond_0
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->f:Landroid/graphics/Path;

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->f:Landroid/graphics/Path;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    int-to-float v2, v2

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    int-to-float v3, v3

    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 62
    :cond_1
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 106
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->b:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->b:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->bottom:I

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->e:I

    .line 110
    return-void
.end method

.method public setCoverColor(I)V
    .locals 0

    .prologue
    .line 86
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/RoundLayout;->a:I

    .line 87
    return-void
.end method
