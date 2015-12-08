.class Lcom/jirbo/adcolony/ac;
.super Lcom/jirbo/adcolony/h;
.source "SourceFile"


# instance fields
.field H:Z

.field I:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyV4VCAd;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 24
    invoke-direct {p0}, Lcom/jirbo/adcolony/h;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/jirbo/adcolony/ac;->F:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/jirbo/adcolony/ac;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    .line 28
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 35
    :cond_0
    :goto_0
    return-void

    .line 31
    :cond_1
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, p0, v1}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ac;->n:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/jirbo/adcolony/ac;->D:I

    add-int/lit8 v0, v0, 0x14

    iput v0, p0, Lcom/jirbo/adcolony/ac;->D:I

    goto :goto_0
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .prologue
    const/4 v7, 0x1

    const/16 v1, 0x80

    const/4 v6, 0x0

    .line 40
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->c()V

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 44
    iget-wide v4, p0, Lcom/jirbo/adcolony/ac;->w:J

    sub-long/2addr v2, v4

    long-to-int v0, v2

    .line 45
    mul-int/lit16 v0, v0, 0xff

    div-int/lit16 v0, v0, 0x3e8

    .line 46
    if-le v0, v1, :cond_0

    move v0, v1

    .line 47
    :cond_0
    invoke-virtual {p1, v0, v6, v6, v6}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 49
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v3, p0, Lcom/jirbo/adcolony/ac;->x:I

    iget v4, p0, Lcom/jirbo/adcolony/ac;->y:I

    invoke-virtual {v2, p1, v3, v4}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 51
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->b()I

    move-result v2

    .line 52
    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v3, v2, 0x2

    .line 54
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRemainingViewsUntilReward()I

    move-result v4

    .line 57
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getViewsPerReward()I

    move-result v2

    if-ne v2, v7, :cond_3

    .line 59
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->F:Ljava/lang/String;

    const-string v4, ""

    invoke-virtual {p0, v2, v4}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    sget-boolean v2, Lcom/jirbo/adcolony/ac;->s:Z

    if-nez v2, :cond_2

    .line 62
    const-string v2, "Watch a video to earn"

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->i:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v5, v6

    invoke-virtual {p0, v2, v4, v5, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 63
    sget-object v2, Lcom/jirbo/adcolony/ac;->q:Ljava/lang/String;

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->j:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v5, v6

    invoke-virtual {p0, v2, v4, v5, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/jirbo/adcolony/ac;->r:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->k:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v3, v6

    invoke-virtual {p0, v2, v4, v3, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 93
    :goto_0
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v3, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget-object v4, p0, Lcom/jirbo/adcolony/ac;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v4, v4, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/jirbo/adcolony/ac;->A:I

    iget-object v5, p0, Lcom/jirbo/adcolony/ac;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v5, v5, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v4, v5

    invoke-virtual {v2, p1, v3, v4}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 95
    iget-boolean v2, p0, Lcom/jirbo/adcolony/ac;->I:Z

    if-nez v2, :cond_6

    .line 97
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v3, p0, Lcom/jirbo/adcolony/ac;->B:I

    iget v4, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {v2, p1, v3, v4}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 104
    :goto_1
    iget-boolean v2, p0, Lcom/jirbo/adcolony/ac;->H:Z

    if-nez v2, :cond_7

    .line 106
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->e:Lcom/jirbo/adcolony/ADCImage;

    iget v3, p0, Lcom/jirbo/adcolony/ac;->C:I

    iget v4, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {v2, p1, v3, v4}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 113
    :goto_2
    const-string v2, "Yes"

    iget v3, p0, Lcom/jirbo/adcolony/ac;->B:I

    iget v4, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {p0, v2, v3, v4, p1}, Lcom/jirbo/adcolony/ac;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 114
    const-string v2, "No"

    iget v3, p0, Lcom/jirbo/adcolony/ac;->C:I

    iget v4, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {p0, v2, v3, v4, p1}, Lcom/jirbo/adcolony/ac;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 116
    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->invalidate()V

    .line 117
    :cond_1
    return-void

    .line 69
    :cond_2
    const-string v2, "Watch a video to earn"

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->l:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v5, v6

    invoke-virtual {p0, v2, v4, v5, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/jirbo/adcolony/ac;->q:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->m:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v3, v6

    invoke-virtual {p0, v2, v4, v3, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    goto :goto_0

    .line 76
    :cond_3
    if-ne v4, v7, :cond_4

    const-string v2, "video"

    .line 77
    :goto_3
    iget-object v5, p0, Lcom/jirbo/adcolony/ac;->F:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " more "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " to earn )?"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v5, v6}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    sget-boolean v5, Lcom/jirbo/adcolony/ac;->s:Z

    if-nez v5, :cond_5

    .line 80
    const-string v5, "Watch a sponsored video now (Only"

    iget v6, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v7, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v8, v7

    int-to-double v10, v3

    iget-wide v12, p0, Lcom/jirbo/adcolony/ac;->i:D

    mul-double/2addr v10, v12

    sub-double/2addr v8, v10

    double-to-int v7, v8

    invoke-virtual {p0, v5, v6, v7, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 81
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " more "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " to earn "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v4, Lcom/jirbo/adcolony/ac;->q:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->j:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v5, v6

    invoke-virtual {p0, v2, v4, v5, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/jirbo/adcolony/ac;->r:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")?"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->k:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v3, v6

    invoke-virtual {p0, v2, v4, v3, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 76
    :cond_4
    const-string v2, "videos"

    goto/16 :goto_3

    .line 87
    :cond_5
    const-string v5, "Watch a sponsored video now (Only"

    iget v6, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v7, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v8, v7

    int-to-double v10, v3

    iget-wide v12, p0, Lcom/jirbo/adcolony/ac;->l:D

    mul-double/2addr v10, v12

    sub-double/2addr v8, v10

    double-to-int v7, v8

    invoke-virtual {p0, v5, v6, v7, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 88
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " more "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " to earn "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v4, Lcom/jirbo/adcolony/ac;->q:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")?"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget v4, p0, Lcom/jirbo/adcolony/ac;->z:I

    iget v5, p0, Lcom/jirbo/adcolony/ac;->A:I

    int-to-double v6, v5

    int-to-double v8, v3

    iget-wide v10, p0, Lcom/jirbo/adcolony/ac;->m:D

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    double-to-int v3, v6

    invoke-virtual {p0, v2, v4, v3, p1}, Lcom/jirbo/adcolony/ac;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 101
    :cond_6
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->d:Lcom/jirbo/adcolony/ADCImage;

    iget v3, p0, Lcom/jirbo/adcolony/ac;->B:I

    iget v4, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {v2, p1, v3, v4}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_1

    .line 110
    :cond_7
    iget-object v2, p0, Lcom/jirbo/adcolony/ac;->f:Lcom/jirbo/adcolony/ADCImage;

    iget v3, p0, Lcom/jirbo/adcolony/ac;->C:I

    iget v4, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {v2, p1, v3, v4}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_2
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v3, v0

    .line 123
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v4, v0

    .line 124
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v5, :cond_1

    .line 126
    iget v0, p0, Lcom/jirbo/adcolony/ac;->B:I

    iget v1, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {p0, v3, v4, v0, v1}, Lcom/jirbo/adcolony/ac;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ac;->I:Z

    if-eqz v0, :cond_3

    .line 128
    sput-object v6, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    .line 129
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 130
    iget-object v0, p0, Lcom/jirbo/adcolony/ac;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v0, v5}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c(Z)V

    .line 142
    :cond_0
    :goto_0
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ac;->H:Z

    .line 143
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ac;->I:Z

    .line 144
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->invalidate()V

    .line 146
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_2

    .line 150
    iget v0, p0, Lcom/jirbo/adcolony/ac;->B:I

    iget v1, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {p0, v3, v4, v0, v1}, Lcom/jirbo/adcolony/ac;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 152
    iput-boolean v5, p0, Lcom/jirbo/adcolony/ac;->I:Z

    .line 153
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->invalidate()V

    .line 161
    :cond_2
    :goto_1
    return v5

    .line 132
    :cond_3
    iget v0, p0, Lcom/jirbo/adcolony/ac;->C:I

    iget v1, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {p0, v3, v4, v0, v1}, Lcom/jirbo/adcolony/ac;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ac;->H:Z

    if-eqz v0, :cond_0

    .line 134
    sput-object v6, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    .line 135
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 136
    iget-object v0, p0, Lcom/jirbo/adcolony/ac;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c(Z)V

    .line 137
    sput-boolean v5, Lcom/jirbo/adcolony/a;->v:Z

    move v1, v2

    .line 138
    :goto_2
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 139
    :cond_4
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    .line 155
    :cond_5
    iget v0, p0, Lcom/jirbo/adcolony/ac;->C:I

    iget v1, p0, Lcom/jirbo/adcolony/ac;->D:I

    invoke-virtual {p0, v3, v4, v0, v1}, Lcom/jirbo/adcolony/ac;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    iput-boolean v5, p0, Lcom/jirbo/adcolony/ac;->H:Z

    .line 158
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ac;->invalidate()V

    goto :goto_1
.end method
