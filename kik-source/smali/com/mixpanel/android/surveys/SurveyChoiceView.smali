.class public Lcom/mixpanel/android/surveys/SurveyChoiceView;
.super Landroid/widget/CheckedTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/surveys/SurveyChoiceView$a;
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:F

.field private c:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->a()V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->a()V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    invoke-direct {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->a()V

    .line 33
    return-void
.end method

.method static synthetic a(Lcom/mixpanel/android/surveys/SurveyChoiceView;F)F
    .locals 0

    .prologue
    .line 18
    iput p1, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->b:F

    return p1
.end method

.method private a()V
    .locals 1

    .prologue
    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->b:F

    .line 101
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->c:F

    .line 102
    return-void
.end method

.method static synthetic b(Lcom/mixpanel/android/surveys/SurveyChoiceView;F)F
    .locals 0

    .prologue
    .line 18
    iput p1, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->c:F

    return p1
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 54
    iget-object v2, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->a:Landroid/graphics/drawable/Drawable;

    .line 55
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 56
    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    .line 59
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    const/high16 v0, 0x41600000    # 14.0f

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 63
    :goto_0
    const/high16 v4, 0x41400000    # 12.0f

    mul-float/2addr v4, v3

    float-to-int v4, v4

    .line 64
    const/high16 v5, 0x41b00000    # 22.0f

    mul-float/2addr v3, v5

    float-to-int v3, v3

    .line 67
    const/4 v5, 0x0

    invoke-virtual {p0, v5}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    int-to-float v5, v3

    iget v6, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->c:F

    int-to-float v7, v0

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    float-to-int v5, v5

    .line 69
    invoke-virtual {p0, v5, v4, v3, v4}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->setPadding(IIII)V

    .line 70
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 71
    int-to-float v5, v3

    iget v6, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->b:F

    int-to-float v7, v0

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    float-to-int v5, v5

    .line 72
    invoke-virtual {p0, v5, v4, v3, v4}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->setPadding(IIII)V

    .line 73
    invoke-virtual {p0, v2}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    if-eqz v2, :cond_0

    .line 76
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->getGravity()I

    move-result v6

    and-int/lit8 v6, v6, 0x70

    .line 79
    sparse-switch v6, :sswitch_data_0

    .line 89
    :goto_1
    add-int v6, v1, v0

    .line 91
    add-int/2addr v0, v5

    .line 92
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->getScrollX()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->getScrollX()I

    move-result v7

    add-int/2addr v0, v7

    invoke-virtual {v2, v5, v1, v0, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 93
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 96
    :cond_0
    invoke-virtual {p0, v3, v4, v3, v4}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->setPadding(IIII)V

    .line 97
    return-void

    .line 81
    :sswitch_0
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->getHeight()I

    move-result v1

    sub-int/2addr v1, v0

    .line 82
    goto :goto_1

    .line 84
    :sswitch_1
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->getHeight()I

    move-result v1

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_0

    .line 79
    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x50 -> :sswitch_0
    .end sparse-switch
.end method

.method public setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 37
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    iput-object p1, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView;->a:Landroid/graphics/drawable/Drawable;

    .line 39
    return-void
.end method

.method public setChecked(Z)V
    .locals 4

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->isChecked()Z

    move-result v0

    .line 44
    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 45
    invoke-virtual {p0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    .line 46
    new-instance v0, Lcom/mixpanel/android/surveys/SurveyChoiceView$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mixpanel/android/surveys/SurveyChoiceView$a;-><init>(Lcom/mixpanel/android/surveys/SurveyChoiceView;B)V

    .line 47
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 48
    invoke-virtual {p0, v0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 50
    :cond_0
    return-void
.end method
