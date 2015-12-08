.class final Lcom/mixpanel/android/surveys/SurveyChoiceView$a;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/surveys/SurveyChoiceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/mixpanel/android/surveys/SurveyChoiceView;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/surveys/SurveyChoiceView;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView$a;->a:Lcom/mixpanel/android/surveys/SurveyChoiceView;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/surveys/SurveyChoiceView;B)V
    .locals 0

    .prologue
    .line 104
    invoke-direct {p0, p1}, Lcom/mixpanel/android/surveys/SurveyChoiceView$a;-><init>(Lcom/mixpanel/android/surveys/SurveyChoiceView;)V

    return-void
.end method


# virtual methods
.method protected final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f000000    # 0.5f

    .line 117
    const/4 v1, 0x0

    .line 119
    cmpg-float v2, p1, v3

    if-gtz v2, :cond_0

    .line 120
    sub-float v1, p1, v3

    .line 124
    :goto_0
    iget-object v2, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView$a;->a:Lcom/mixpanel/android/surveys/SurveyChoiceView;

    invoke-static {v2, v1}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->a(Lcom/mixpanel/android/surveys/SurveyChoiceView;F)F

    .line 125
    iget-object v1, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView$a;->a:Lcom/mixpanel/android/surveys/SurveyChoiceView;

    invoke-static {v1, v0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->b(Lcom/mixpanel/android/surveys/SurveyChoiceView;F)F

    .line 126
    iget-object v0, p0, Lcom/mixpanel/android/surveys/SurveyChoiceView$a;->a:Lcom/mixpanel/android/surveys/SurveyChoiceView;

    invoke-virtual {v0}, Lcom/mixpanel/android/surveys/SurveyChoiceView;->requestLayout()V

    .line 127
    return-void

    .line 122
    :cond_0
    sub-float v2, p1, v3

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    add-float/2addr v0, v2

    goto :goto_0
.end method

.method public final willChangeBounds()Z
    .locals 1

    .prologue
    .line 112
    const/4 v0, 0x0

    return v0
.end method

.method public final willChangeTransformationMatrix()Z
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x0

    return v0
.end method
