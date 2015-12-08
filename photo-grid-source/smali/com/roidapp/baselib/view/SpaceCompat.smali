.class public Lcom/roidapp/baselib/view/SpaceCompat;
.super Landroid/view/View;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/view/SpaceCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/baselib/view/SpaceCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/SpaceCompat;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 20
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/view/SpaceCompat;->setVisibility(I)V

    .line 22
    :cond_0
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 54
    .line 55
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 56
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 58
    sparse-switch v1, :sswitch_data_0

    .line 69
    :goto_0
    :sswitch_0
    return p0

    .line 63
    :sswitch_1
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    goto :goto_0

    :sswitch_2
    move p0, v0

    .line 66
    goto :goto_0

    .line 58
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x0 -> :sswitch_0
        0x40000000 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 46
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/SpaceCompat;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lcom/roidapp/baselib/view/SpaceCompat;->a(II)I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/SpaceCompat;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v1, p2}, Lcom/roidapp/baselib/view/SpaceCompat;->a(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/baselib/view/SpaceCompat;->setMeasuredDimension(II)V

    .line 77
    return-void
.end method
