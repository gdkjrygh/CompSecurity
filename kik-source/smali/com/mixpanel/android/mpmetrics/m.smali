.class final Lcom/mixpanel/android/mpmetrics/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/k;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/k;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const-wide/16 v8, 0xc8

    const/high16 v6, 0x40000000    # 2.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 66
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->b(Lcom/mixpanel/android/mpmetrics/k;)Landroid/view/View;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 67
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->b(Lcom/mixpanel/android/mpmetrics/k;)Landroid/view/View;

    move-result-object v0

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/k;->c(Lcom/mixpanel/android/mpmetrics/k;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->b()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 68
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->b(Lcom/mixpanel/android/mpmetrics/k;)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/mixpanel/android/mpmetrics/n;

    invoke-direct {v3, p0}, Lcom/mixpanel/android/mpmetrics/n;-><init>(Lcom/mixpanel/android/mpmetrics/m;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 75
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->b(Lcom/mixpanel/android/mpmetrics/k;)Landroid/view/View;

    move-result-object v0

    sget v3, Lcom/mixpanel/android/a$c;->i:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 77
    const/4 v0, 0x1

    const/high16 v3, 0x42960000    # 75.0f

    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/k;->e(Lcom/mixpanel/android/mpmetrics/k;)Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-static {v0, v3, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    .line 78
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    invoke-direct {v0, v1, v1, v3, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 79
    new-instance v4, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v4}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v4}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 80
    invoke-virtual {v0, v8, v9}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 81
    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/k;->b(Lcom/mixpanel/android/mpmetrics/k;)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 83
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    div-float v5, v3, v6

    div-float v6, v3, v6

    move v3, v1

    move v4, v2

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 84
    new-instance v1, Lcom/mixpanel/android/mpmetrics/k$a;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/m;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-direct {v1, v2}, Lcom/mixpanel/android/mpmetrics/k$a;-><init>(Lcom/mixpanel/android/mpmetrics/k;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 85
    const-wide/16 v2, 0x190

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 86
    invoke-virtual {v0, v8, v9}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 87
    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 88
    return-void
.end method
