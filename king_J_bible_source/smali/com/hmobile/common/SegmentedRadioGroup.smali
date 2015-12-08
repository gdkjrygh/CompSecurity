.class public Lcom/hmobile/common/SegmentedRadioGroup;
.super Landroid/widget/RadioGroup;
.source "SegmentedRadioGroup.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 26
    invoke-direct {p0, p1}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method

.method private changeButtonsImages()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    const v3, 0x7f020092

    .line 40
    invoke-super {p0}, Landroid/widget/RadioGroup;->getChildCount()I

    move-result v0

    .line 56
    .local v0, "count":I
    if-le v0, v4, :cond_2

    .line 57
    invoke-super {p0, v2}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 59
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-lt v1, v2, :cond_1

    .line 63
    add-int/lit8 v2, v0, -0x1

    invoke-super {p0, v2}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 70
    .end local v1    # "i":I
    :cond_0
    :goto_1
    return-void

    .line 60
    .restart local v1    # "i":I
    :cond_1
    invoke-super {p0, v1}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 59
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 65
    .end local v1    # "i":I
    :cond_2
    if-ne v0, v4, :cond_0

    .line 66
    invoke-super {p0, v2}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1
.end method


# virtual methods
.method protected onFinishInflate()V
    .locals 0

    .prologue
    .line 35
    invoke-super {p0}, Landroid/widget/RadioGroup;->onFinishInflate()V

    .line 37
    return-void
.end method
