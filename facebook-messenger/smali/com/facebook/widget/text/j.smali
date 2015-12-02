.class public Lcom/facebook/widget/text/j;
.super Ljava/lang/Object;
.source "UrlSpanLinkHook.java"

# interfaces
.implements Lcom/facebook/widget/text/b;


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/graphics/Paint;

.field private c:Landroid/text/style/URLSpan;

.field private d:Landroid/graphics/Path;

.field private e:Lcom/facebook/widget/text/k;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 47
    const v0, -0x333334

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/text/j;-><init>(Landroid/widget/TextView;I)V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;I)V
    .locals 2

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/text/j;->d:Landroid/graphics/Path;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/text/j;->e:Lcom/facebook/widget/text/k;

    .line 51
    iput-object p1, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    .line 52
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/text/j;->b:Landroid/graphics/Paint;

    .line 53
    iget-object v0, p0, Lcom/facebook/widget/text/j;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    iget-object v0, p0, Lcom/facebook/widget/text/j;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 56
    return-void
.end method

.method private a()Landroid/graphics/Rect;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 151
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getHeight()I

    move-result v2

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 158
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 159
    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 160
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTotalPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 161
    iget v1, v0, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTotalPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 162
    return-object v0
.end method

.method private b(Landroid/view/MotionEvent;)Landroid/text/style/URLSpan;
    .locals 3

    .prologue
    .line 126
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 127
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    .line 129
    invoke-direct {p0}, Lcom/facebook/widget/text/j;->a()Landroid/graphics/Rect;

    move-result-object v2

    .line 130
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 131
    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    .line 132
    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    .line 133
    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    .line 134
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v1

    .line 135
    int-to-float v0, v0

    invoke-virtual {v2, v1, v0}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v1

    .line 136
    iget-object v0, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    .line 137
    const-class v2, Landroid/text/style/URLSpan;

    invoke-interface {v0, v1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/text/style/URLSpan;

    .line 138
    array-length v1, v0

    if-lez v1, :cond_0

    .line 139
    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 143
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    if-nez v0, :cond_0

    .line 123
    :goto_0
    return-void

    .line 105
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 106
    invoke-direct {p0}, Lcom/facebook/widget/text/j;->a()Landroid/graphics/Rect;

    move-result-object v0

    .line 108
    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 114
    iget-object v0, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    .line 115
    iget-object v0, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    .line 116
    iget-object v2, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    invoke-interface {v0, v2}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v2

    .line 117
    iget-object v3, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    invoke-interface {v0, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 118
    iget-object v3, p0, Lcom/facebook/widget/text/j;->d:Landroid/graphics/Path;

    invoke-virtual {v1, v2, v0, v3}, Landroid/text/Layout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 120
    iget-object v0, p0, Lcom/facebook/widget/text/j;->d:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/facebook/widget/text/j;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 122
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0
.end method

.method public a(Lcom/facebook/widget/text/k;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/facebook/widget/text/j;->e:Lcom/facebook/widget/text/k;

    .line 148
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 60
    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    instance-of v2, v2, Landroid/text/Spanned;

    if-nez v2, :cond_1

    .line 95
    :cond_0
    :goto_0
    return v0

    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 66
    if-nez v2, :cond_3

    .line 67
    invoke-direct {p0, p1}, Lcom/facebook/widget/text/j;->b(Landroid/view/MotionEvent;)Landroid/text/style/URLSpan;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    .line 68
    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->invalidate()V

    .line 91
    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    if-eqz v2, :cond_0

    move v0, v1

    .line 95
    goto :goto_0

    .line 69
    :cond_3
    if-ne v2, v1, :cond_6

    .line 70
    iget-object v2, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    if-eqz v2, :cond_2

    .line 71
    iget-object v2, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    invoke-direct {p0, p1}, Lcom/facebook/widget/text/j;->b(Landroid/view/MotionEvent;)Landroid/text/style/URLSpan;

    move-result-object v3

    if-ne v2, v3, :cond_5

    .line 72
    iget-object v2, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    .line 73
    iput-object v4, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    .line 74
    iget-object v3, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->invalidate()V

    .line 76
    iget-object v3, p0, Lcom/facebook/widget/text/j;->e:Lcom/facebook/widget/text/k;

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/facebook/widget/text/j;->e:Lcom/facebook/widget/text/k;

    iget-object v4, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-interface {v3, v2, v4}, Lcom/facebook/widget/text/k;->a(Landroid/text/style/URLSpan;Landroid/widget/TextView;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 77
    :cond_4
    iget-object v3, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/text/style/URLSpan;->onClick(Landroid/view/View;)V

    goto :goto_1

    .line 80
    :cond_5
    iput-object v4, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    .line 81
    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->invalidate()V

    goto :goto_1

    .line 84
    :cond_6
    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    .line 85
    iget-object v2, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    if-eqz v2, :cond_2

    .line 86
    iput-object v4, p0, Lcom/facebook/widget/text/j;->c:Landroid/text/style/URLSpan;

    .line 87
    iget-object v2, p0, Lcom/facebook/widget/text/j;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->invalidate()V

    goto :goto_1
.end method
