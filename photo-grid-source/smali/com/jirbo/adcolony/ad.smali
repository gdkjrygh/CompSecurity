.class Lcom/jirbo/adcolony/ad;
.super Lcom/jirbo/adcolony/h;
.source "SourceFile"


# instance fields
.field H:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyV4VCAd;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 22
    invoke-direct {p0}, Lcom/jirbo/adcolony/h;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/jirbo/adcolony/ad;->F:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lcom/jirbo/adcolony/ad;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    .line 26
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ad;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    :goto_0
    return-void

    .line 29
    :cond_0
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, p0, v1}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method


# virtual methods
.method c()V
    .locals 10

    .prologue
    .line 103
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v2

    .line 105
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v3

    .line 107
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ad;->n:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    .line 109
    :goto_0
    iget-object v4, p0, Lcom/jirbo/adcolony/ad;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v4, v4, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v2, v4

    div-int/lit8 v2, v2, 0x2

    iput v2, p0, Lcom/jirbo/adcolony/ad;->x:I

    .line 110
    iget-object v2, p0, Lcom/jirbo/adcolony/ad;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int v2, v3, v2

    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, -0x50

    iput v2, p0, Lcom/jirbo/adcolony/ad;->y:I

    .line 111
    iget v2, p0, Lcom/jirbo/adcolony/ad;->x:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ad;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iput v2, p0, Lcom/jirbo/adcolony/ad;->z:I

    .line 112
    iget v2, p0, Lcom/jirbo/adcolony/ad;->y:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ad;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iput v2, p0, Lcom/jirbo/adcolony/ad;->A:I

    .line 114
    iget v2, p0, Lcom/jirbo/adcolony/ad;->y:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ad;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v4, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/ad;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v6, v3

    sget-wide v8, Lcom/jirbo/adcolony/ad;->p:D

    mul-double/2addr v0, v8

    add-double/2addr v0, v6

    sub-double v0, v4, v0

    double-to-int v0, v0

    add-int/2addr v0, v2

    iput v0, p0, Lcom/jirbo/adcolony/ad;->D:I

    .line 115
    iget v0, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/jirbo/adcolony/ad;->B:I

    .line 116
    return-void

    .line 107
    :cond_0
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    goto :goto_0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .prologue
    .line 35
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ad;->c()V

    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 39
    iget-wide v2, p0, Lcom/jirbo/adcolony/ad;->w:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    .line 40
    mul-int/lit16 v0, v0, 0xff

    div-int/lit16 v0, v0, 0x3e8

    .line 41
    const/16 v1, 0x80

    if-le v0, v1, :cond_0

    const/16 v0, 0x80

    .line 42
    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 44
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v2, p0, Lcom/jirbo/adcolony/ad;->x:I

    iget v3, p0, Lcom/jirbo/adcolony/ad;->y:I

    invoke-virtual {v1, p1, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 46
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ad;->b()I

    move-result v1

    .line 47
    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v2, v1, 0x2

    .line 49
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getRemainingViewsUntilReward()I

    move-result v3

    .line 52
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->getViewsPerReward()I

    move-result v1

    if-eq v3, v1, :cond_1

    if-nez v3, :cond_4

    .line 54
    :cond_1
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->F:Ljava/lang/String;

    const-string v3, "video. You earned"

    invoke-virtual {p0, v1, v3}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    sget-boolean v1, Lcom/jirbo/adcolony/ad;->s:Z

    if-eqz v1, :cond_3

    .line 57
    const-string v1, "Thanks for watching the sponsored"

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v4, v4

    invoke-virtual {p0, v1, v3, v4, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "video. You earned "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/jirbo/adcolony/ad;->q:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v2, v4

    invoke-virtual {p0, v1, v3, v2, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 86
    :goto_0
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v2, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ad;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ad;->A:I

    iget-object v4, p0, Lcom/jirbo/adcolony/ad;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v4, v4, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-virtual {v1, p1, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 88
    iget-boolean v1, p0, Lcom/jirbo/adcolony/ad;->H:Z

    if-nez v1, :cond_7

    .line 90
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->h:Lcom/jirbo/adcolony/ADCImage;

    iget v2, p0, Lcom/jirbo/adcolony/ad;->B:I

    iget v3, p0, Lcom/jirbo/adcolony/ad;->D:I

    invoke-virtual {v1, p1, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 97
    :goto_1
    const-string v1, "Ok"

    iget v2, p0, Lcom/jirbo/adcolony/ad;->B:I

    iget v3, p0, Lcom/jirbo/adcolony/ad;->D:I

    invoke-virtual {p0, v1, v2, v3, p1}, Lcom/jirbo/adcolony/ad;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 98
    const/16 v1, 0x80

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ad;->invalidate()V

    .line 99
    :cond_2
    return-void

    .line 62
    :cond_3
    const-string v1, "Thanks for watching the sponsored"

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide v8, 0x4006666666666666L    # 2.8

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v4, v4

    invoke-virtual {p0, v1, v3, v4, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "video. You earned "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/jirbo/adcolony/ad;->q:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide v8, 0x4000666666666666L    # 2.05

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v4, v4

    invoke-virtual {p0, v1, v3, v4, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/jirbo/adcolony/ad;->r:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide v8, 0x3ff4cccccccccccdL    # 1.3

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v2, v4

    invoke-virtual {p0, v1, v3, v2, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 70
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->F:Ljava/lang/String;

    const-string v4, "to earn "

    invoke-virtual {p0, v1, v4}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const/4 v1, 0x1

    if-ne v3, v1, :cond_5

    const-string v1, "video"

    .line 72
    :goto_2
    sget-boolean v4, Lcom/jirbo/adcolony/ad;->s:Z

    if-eqz v4, :cond_6

    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Thank you. Watch "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " more "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v4, v4

    invoke-virtual {p0, v1, v3, v4, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "to earn "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/jirbo/adcolony/ad;->q:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v2, v4

    invoke-virtual {p0, v1, v3, v2, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 71
    :cond_5
    const-string v1, "videos"

    goto :goto_2

    .line 79
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Thank you. Watch "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " more "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide v8, 0x4006666666666666L    # 2.8

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v4, v4

    invoke-virtual {p0, v1, v3, v4, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "to earn "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/jirbo/adcolony/ad;->q:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide v8, 0x4000666666666666L    # 2.05

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v4, v4

    invoke-virtual {p0, v1, v3, v4, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/jirbo/adcolony/ad;->r:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v3, p0, Lcom/jirbo/adcolony/ad;->z:I

    iget v4, p0, Lcom/jirbo/adcolony/ad;->A:I

    int-to-double v4, v4

    int-to-double v6, v2

    const-wide v8, 0x3ff4cccccccccccdL    # 1.3

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v2, v4

    invoke-virtual {p0, v1, v3, v2, p1}, Lcom/jirbo/adcolony/ad;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 94
    :cond_7
    iget-object v1, p0, Lcom/jirbo/adcolony/ad;->g:Lcom/jirbo/adcolony/ADCImage;

    iget v2, p0, Lcom/jirbo/adcolony/ad;->B:I

    iget v3, p0, Lcom/jirbo/adcolony/ad;->D:I

    invoke-virtual {v1, p1, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 121
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v3, v0

    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v4, v0

    .line 123
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v5, :cond_2

    .line 125
    iget v0, p0, Lcom/jirbo/adcolony/ad;->B:I

    iget v1, p0, Lcom/jirbo/adcolony/ad;->D:I

    invoke-virtual {p0, v3, v4, v0, v1}, Lcom/jirbo/adcolony/ad;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ad;->H:Z

    if-eqz v0, :cond_1

    .line 127
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    .line 128
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ad;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move v1, v2

    .line 129
    :goto_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 130
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 131
    sput-boolean v5, Lcom/jirbo/adcolony/a;->v:Z

    .line 134
    :cond_1
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ad;->H:Z

    .line 135
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ad;->invalidate()V

    .line 137
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    .line 140
    iget v0, p0, Lcom/jirbo/adcolony/ad;->B:I

    iget v1, p0, Lcom/jirbo/adcolony/ad;->D:I

    invoke-virtual {p0, v3, v4, v0, v1}, Lcom/jirbo/adcolony/ad;->a(IIII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 143
    iput-boolean v5, p0, Lcom/jirbo/adcolony/ad;->H:Z

    .line 144
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ad;->invalidate()V

    .line 147
    :cond_3
    return v5
.end method
