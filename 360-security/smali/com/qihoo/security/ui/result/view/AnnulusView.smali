.class public Lcom/qihoo/security/ui/result/view/AnnulusView;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/result/view/AnnulusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/ui/result/view/AnnulusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->a:Landroid/graphics/Paint;

    .line 39
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 41
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 54
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 55
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->a:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    iget v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->b:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->c:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->d:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->a:Landroid/graphics/Paint;

    const/16 v1, 0x21

    const/16 v2, 0x96

    const/16 v3, 0xf3

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    iget v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->b:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->c:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->e:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 59
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 45
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 46
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AnnulusView;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->b:I

    .line 47
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AnnulusView;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->c:I

    .line 48
    iget v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->b:I

    iget v1, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->c:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->d:I

    .line 49
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AnnulusView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090056

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;I)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/qihoo/security/ui/result/view/AnnulusView;->e:I

    .line 50
    return-void
.end method
