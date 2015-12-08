.class public Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field private a:Landroid/text/StaticLayout;

.field private b:Landroid/text/Spannable;

.field private c:Landroid/text/style/CharacterStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 59
    packed-switch v0, :pswitch_data_0

    .line 103
    :cond_0
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    return v0

    .line 61
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 62
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 63
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v0, v3

    .line 64
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    .line 65
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->getScrollX()I

    move-result v3

    add-int/2addr v0, v3

    .line 66
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->getScrollY()I

    move-result v3

    add-int/2addr v2, v3

    .line 67
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->a:Landroid/text/StaticLayout;

    invoke-virtual {v3, v2}, Landroid/text/StaticLayout;->getLineForVertical(I)I

    move-result v2

    .line 68
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->a:Landroid/text/StaticLayout;

    invoke-virtual {v3, v2}, Landroid/text/StaticLayout;->getLineLeft(I)F

    move-result v3

    int-to-float v4, v0

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_0

    int-to-float v3, v0

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->a:Landroid/text/StaticLayout;

    invoke-virtual {v4, v2}, Landroid/text/StaticLayout;->getLineRight(I)F

    move-result v4

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_0

    .line 70
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->a:Landroid/text/StaticLayout;

    int-to-float v0, v0

    invoke-virtual {v3, v2, v0}, Landroid/text/StaticLayout;->getOffsetForHorizontal(IF)I

    move-result v0

    .line 71
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->b:Landroid/text/Spannable;

    const-class v3, Lcom/roidapp/cloudlib/sns/basepost/g;

    invoke-interface {v2, v0, v0, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/text/style/CharacterStyle;

    .line 73
    array-length v2, v0

    if-eqz v2, :cond_0

    .line 75
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    .line 76
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/notification/a;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    check-cast v0, Lcom/roidapp/cloudlib/sns/notification/a;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/notification/a;->a(Z)V

    .line 78
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->invalidate()V

    move v0, v1

    .line 79
    goto :goto_0

    .line 86
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/notification/a;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    check-cast v0, Lcom/roidapp/cloudlib/sns/notification/a;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/notification/a;->onClick(Landroid/view/View;)V

    .line 88
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    check-cast v0, Lcom/roidapp/cloudlib/sns/notification/a;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/notification/a;->a(Z)V

    .line 89
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->invalidate()V

    move v0, v1

    .line 90
    goto/16 :goto_0

    .line 95
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/notification/a;

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->c:Landroid/text/style/CharacterStyle;

    check-cast v0, Lcom/roidapp/cloudlib/sns/notification/a;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/notification/a;->a(Z)V

    .line 97
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/DescriptionTextView;->invalidate()V

    move v0, v1

    .line 98
    goto/16 :goto_0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
