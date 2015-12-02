.class public Lcom/qihoo/security/widget/ShadowTextView;
.super Lcom/qihoo/security/locale/widget/LocaleTextView;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/widget/ShadowTextView$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private final b:Z

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:I

.field private final g:Landroid/text/TextPaint;

.field private final h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/ShadowTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    .line 180
    iput-boolean v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->h:Z

    .line 54
    sget-object v2, Lcom/qihoo/security/lite/a$a;->ShadowTextView:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 55
    const/4 v3, 0x2

    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lcom/qihoo/security/widget/ShadowTextView;->c:F

    .line 56
    invoke-virtual {v2, v1, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lcom/qihoo/security/widget/ShadowTextView;->d:F

    .line 57
    invoke-virtual {v2, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lcom/qihoo/security/widget/ShadowTextView;->e:F

    .line 58
    const/4 v3, 0x3

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lcom/qihoo/security/widget/ShadowTextView;->f:I

    .line 60
    const/4 v3, 0x4

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "en"

    invoke-static {p1, v3, v4}, Lcom/qihoo/security/locale/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->b:Z

    .line 62
    iget v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->c:F

    iget v3, p0, Lcom/qihoo/security/widget/ShadowTextView;->d:F

    iget v4, p0, Lcom/qihoo/security/widget/ShadowTextView;->e:F

    iget v5, p0, Lcom/qihoo/security/widget/ShadowTextView;->f:I

    invoke-virtual {p0, v0, v3, v4, v5}, Lcom/qihoo/security/widget/ShadowTextView;->setShadowLayer(FFFI)V

    .line 63
    iget v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->d:F

    float-to-int v0, v0

    iget v3, p0, Lcom/qihoo/security/widget/ShadowTextView;->e:F

    float-to-int v3, v3

    invoke-virtual {p0, v1, v1, v0, v3}, Lcom/qihoo/security/widget/ShadowTextView;->setPadding(IIII)V

    .line 64
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 67
    iget-boolean v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->b:Z

    if-eqz v0, :cond_0

    .line 68
    const/high16 v0, 0x11000000

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ShadowTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {v2}, Landroid/text/TextPaint;->getColor()I

    move-result v2

    const v3, 0xffffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ShadowTextView;->setTextColor(I)V

    .line 69
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ShadowTextView;->getGravity()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    iget v2, p0, Lcom/qihoo/security/widget/ShadowTextView;->c:F

    iget v3, p0, Lcom/qihoo/security/widget/ShadowTextView;->d:F

    iget v4, p0, Lcom/qihoo/security/widget/ShadowTextView;->e:F

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ShadowTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->g:Landroid/text/TextPaint;

    .line 81
    return-void

    :cond_1
    move v0, v1

    .line 60
    goto :goto_0
.end method

.method private a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 96
    iget-boolean v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->b:Z

    if-eqz v0, :cond_0

    .line 97
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ShadowTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 98
    new-instance v1, Lcom/qihoo/security/widget/ShadowTextView$a;

    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-direct {v1, v2}, Lcom/qihoo/security/widget/ShadowTextView$a;-><init>([I)V

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ShadowTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 99
    iget-object v1, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->postInvalidate()V

    .line 104
    :cond_0
    return-void

    .line 98
    nop

    :array_0
    .array-data 4
        -0x1
        0x33ffffff
    .end array-data
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 172
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->draw(Landroid/graphics/Canvas;)V

    .line 176
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 162
    invoke-super/range {p0 .. p5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onLayout(ZIIII)V

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/widget/TextView;->layout(IIII)V

    .line 167
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .prologue
    .line 153
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onMeasure(II)V

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->measure(II)V

    .line 158
    :cond_0
    return-void
.end method

.method public setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .prologue
    .line 138
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/widget/ShadowTextView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    :cond_0
    return-void
.end method

.method public setLocalText(I)V
    .locals 0

    .prologue
    .line 85
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 86
    invoke-direct {p0}, Lcom/qihoo/security/widget/ShadowTextView;->a()V

    .line 87
    return-void
.end method

.method public setLocalText(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 91
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 92
    invoke-direct {p0}, Lcom/qihoo/security/widget/ShadowTextView;->a()V

    .line 93
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 0

    .prologue
    .line 130
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 134
    return-void
.end method
