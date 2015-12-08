.class public Lcom/mopub/mobileads/AdAlertGestureListener;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# instance fields
.field private final a:Lcom/mopub/common/AdReport;

.field private b:F

.field private c:F

.field private d:Z

.field private e:Z

.field private f:Lcom/mopub/mobileads/AdAlertReporter;

.field private g:I

.field private h:F

.field private i:I

.field private j:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;Lcom/mopub/common/AdReport;)V
    .locals 3

    .prologue
    const/high16 v2, 0x42c80000    # 100.0f

    .line 30
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 16
    iput v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->b:F

    .line 25
    sget v0, Lcom/mopub/mobileads/b;->UNSET$34b17a83:I

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    .line 31
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->b:F

    .line 34
    :cond_0
    iput-object p1, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->j:Landroid/view/View;

    .line 35
    iput-object p2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->a:Lcom/mopub/common/AdReport;

    .line 36
    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    .prologue
    .line 74
    iget v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    sget v1, Lcom/mopub/mobileads/b;->FINISHED$34b17a83:I

    if-ne v0, v1, :cond_0

    .line 75
    new-instance v0, Lcom/mopub/mobileads/AdAlertReporter;

    iget-object v1, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->j:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->j:Landroid/view/View;

    iget-object v3, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->a:Lcom/mopub/common/AdReport;

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/mobileads/AdAlertReporter;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/common/AdReport;)V

    iput-object v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->f:Lcom/mopub/mobileads/AdAlertReporter;

    .line 76
    iget-object v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->f:Lcom/mopub/mobileads/AdAlertReporter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdAlertReporter;->send()V

    .line 78
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdAlertGestureListener;->b()V

    .line 79
    return-void
.end method

.method final b()V
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->g:I

    .line 83
    sget v0, Lcom/mopub/mobileads/b;->UNSET$34b17a83:I

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    .line 84
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 40
    iget v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    sget v3, Lcom/mopub/mobileads/b;->FINISHED$34b17a83:I

    if-ne v2, v3, :cond_0

    .line 41
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    .line 70
    :goto_0
    return v0

    .line 46
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 1087
    sub-float v2, v3, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1

    move v2, v0

    .line 46
    :goto_1
    if-eqz v2, :cond_2

    .line 47
    sget v0, Lcom/mopub/mobileads/b;->FAILED$34b17a83:I

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    .line 48
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v2, v1

    .line 1087
    goto :goto_1

    .line 51
    :cond_2
    sget-object v2, Lcom/mopub/mobileads/a;->a:[I

    iget v3, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 68
    :cond_3
    :goto_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->c:F

    .line 70
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v0

    goto :goto_0

    .line 53
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->h:F

    .line 54
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1091
    iget v1, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->h:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 1092
    sget v0, Lcom/mopub/mobileads/b;->GOING_RIGHT$34b17a83:I

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    goto :goto_2

    .line 57
    :pswitch_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 1118
    iget-boolean v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->e:Z

    if-eqz v2, :cond_4

    move v2, v0

    .line 1097
    :goto_3
    if-eqz v2, :cond_3

    .line 1147
    iget v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->c:F

    cmpg-float v2, v3, v2

    if-gez v2, :cond_6

    .line 1097
    :goto_4
    if-eqz v0, :cond_3

    .line 1098
    sget v0, Lcom/mopub/mobileads/b;->GOING_LEFT$34b17a83:I

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    .line 1099
    iput v3, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->h:F

    goto :goto_2

    .line 1120
    :cond_4
    iget v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->h:F

    iget v4, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->b:F

    add-float/2addr v2, v4

    cmpl-float v2, v3, v2

    if-ltz v2, :cond_5

    .line 1121
    iput-boolean v1, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->d:Z

    .line 1122
    iput-boolean v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->e:Z

    move v2, v0

    .line 1123
    goto :goto_3

    :cond_5
    move v2, v1

    .line 1125
    goto :goto_3

    :cond_6
    move v0, v1

    .line 1147
    goto :goto_4

    .line 60
    :pswitch_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 2130
    iget-boolean v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->d:Z

    if-eqz v2, :cond_7

    move v2, v0

    .line 2104
    :goto_5
    if-eqz v2, :cond_3

    .line 3143
    iget v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->c:F

    cmpl-float v2, v3, v2

    if-lez v2, :cond_a

    .line 2104
    :goto_6
    if-eqz v0, :cond_3

    .line 2105
    sget v0, Lcom/mopub/mobileads/b;->GOING_RIGHT$34b17a83:I

    iput v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    .line 2106
    iput v3, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->h:F

    goto :goto_2

    .line 2132
    :cond_7
    iget v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->h:F

    iget v4, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->b:F

    sub-float/2addr v2, v4

    cmpg-float v2, v3, v2

    if-gtz v2, :cond_9

    .line 2133
    iput-boolean v1, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->e:Z

    .line 2134
    iput-boolean v0, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->d:Z

    .line 3111
    iget v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->g:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->g:I

    .line 3112
    iget v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->g:I

    const/4 v4, 0x4

    if-lt v2, v4, :cond_8

    .line 3113
    sget v2, Lcom/mopub/mobileads/b;->FINISHED$34b17a83:I

    iput v2, p0, Lcom/mopub/mobileads/AdAlertGestureListener;->i:I

    :cond_8
    move v2, v0

    .line 2136
    goto :goto_5

    :cond_9
    move v2, v1

    .line 2138
    goto :goto_5

    :cond_a
    move v0, v1

    .line 3143
    goto :goto_6

    .line 51
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
