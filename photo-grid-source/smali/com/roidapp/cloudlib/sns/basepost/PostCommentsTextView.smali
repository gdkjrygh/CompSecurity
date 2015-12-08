.class public Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Landroid/text/Layout;

.field private b:Lcom/roidapp/cloudlib/sns/basepost/g;

.field private c:Landroid/text/Spannable;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->d:Z

    .line 39
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->requestLayout()V

    .line 40
    return-void
.end method

.method public final a(Landroid/text/Layout;)V
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->d:Z

    .line 44
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    .line 45
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spannable;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->c:Landroid/text/Spannable;

    .line 46
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->requestLayout()V

    .line 47
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 129
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 130
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->d:Z

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 132
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 133
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 136
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 52
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 53
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->d:Z

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->setMeasuredDimension(II)V

    .line 59
    :goto_0
    return-void

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->setMeasuredDimension(II)V

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 65
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    if-nez v2, :cond_0

    .line 123
    :goto_0
    return v0

    .line 68
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    .line 69
    packed-switch v2, :pswitch_data_0

    .line 123
    :cond_1
    :pswitch_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 71
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 73
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v0, v3

    .line 74
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    .line 75
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getScrollX()I

    move-result v3

    add-int/2addr v0, v3

    .line 76
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getScrollY()I

    move-result v3

    add-int/2addr v2, v3

    .line 78
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v2

    .line 79
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v3

    int-to-float v4, v0

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_1

    int-to-float v3, v0

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    invoke-virtual {v4, v2}, Landroid/text/Layout;->getLineRight(I)F

    move-result v4

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_1

    .line 81
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a:Landroid/text/Layout;

    int-to-float v0, v0

    invoke-virtual {v3, v2, v0}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v0

    .line 83
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->c:Landroid/text/Spannable;

    const-class v3, Lcom/roidapp/cloudlib/sns/basepost/g;

    invoke-interface {v2, v0, v0, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/cloudlib/sns/basepost/g;

    .line 87
    array-length v2, v0

    if-eqz v2, :cond_1

    .line 89
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->b:Lcom/roidapp/cloudlib/sns/basepost/g;

    .line 93
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->b:Lcom/roidapp/cloudlib/sns/basepost/g;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/g;->a(Z)V

    .line 94
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->invalidate()V

    move v0, v1

    .line 95
    goto :goto_0

    .line 110
    :pswitch_2
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->b:Lcom/roidapp/cloudlib/sns/basepost/g;

    if-eqz v2, :cond_2

    .line 111
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->b:Lcom/roidapp/cloudlib/sns/basepost/g;

    invoke-virtual {v2, p0}, Lcom/roidapp/cloudlib/sns/basepost/g;->onClick(Landroid/view/View;)V

    .line 114
    :cond_2
    :pswitch_3
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->b:Lcom/roidapp/cloudlib/sns/basepost/g;

    if-eqz v2, :cond_1

    .line 115
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->b:Lcom/roidapp/cloudlib/sns/basepost/g;

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/sns/basepost/g;->a(Z)V

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->b:Lcom/roidapp/cloudlib/sns/basepost/g;

    .line 117
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->invalidate()V

    move v0, v1

    .line 118
    goto/16 :goto_0

    .line 69
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
