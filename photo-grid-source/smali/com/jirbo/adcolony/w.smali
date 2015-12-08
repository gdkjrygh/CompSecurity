.class Lcom/jirbo/adcolony/w;
.super Lcom/jirbo/adcolony/h;
.source "SourceFile"


# static fields
.field static H:Z

.field static I:Lcom/jirbo/adcolony/w;


# instance fields
.field J:Z

.field K:Z

.field L:Lcom/jirbo/adcolony/ADCVideo;


# direct methods
.method public constructor <init>(Lcom/jirbo/adcolony/ADCVideo;Lcom/jirbo/adcolony/AdColonyV4VCAd;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/jirbo/adcolony/h;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    .line 29
    iput-object p2, p0, Lcom/jirbo/adcolony/w;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    .line 30
    iget-object v0, p1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->pause()V

    .line 31
    sput-object p0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 32
    invoke-virtual {p0}, Lcom/jirbo/adcolony/w;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    :cond_0
    return-void
.end method


# virtual methods
.method c()V
    .locals 10

    .prologue
    const-wide/high16 v8, 0x4030000000000000L    # 16.0

    .line 164
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    .line 165
    iget-object v1, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->u:I

    .line 167
    iget-object v2, p0, Lcom/jirbo/adcolony/w;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/jirbo/adcolony/w;->x:I

    .line 168
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v0, v0, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int v0, v1, v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/jirbo/adcolony/w;->y:I

    .line 169
    iget v0, p0, Lcom/jirbo/adcolony/w;->x:I

    iget-object v1, p0, Lcom/jirbo/adcolony/w;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jirbo/adcolony/w;->z:I

    .line 170
    iget v0, p0, Lcom/jirbo/adcolony/w;->y:I

    iget-object v1, p0, Lcom/jirbo/adcolony/w;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jirbo/adcolony/w;->A:I

    .line 172
    iget v0, p0, Lcom/jirbo/adcolony/w;->y:I

    iget-object v1, p0, Lcom/jirbo/adcolony/w;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v2, v1

    iget-object v1, p0, Lcom/jirbo/adcolony/w;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v4, v1

    sget-wide v6, Lcom/jirbo/adcolony/w;->p:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    sub-double/2addr v2, v4

    double-to-int v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jirbo/adcolony/w;->D:I

    .line 174
    iget v0, p0, Lcom/jirbo/adcolony/w;->x:I

    sget-wide v2, Lcom/jirbo/adcolony/w;->p:D

    mul-double/2addr v2, v8

    double-to-int v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jirbo/adcolony/w;->B:I

    .line 175
    iget v0, p0, Lcom/jirbo/adcolony/w;->x:I

    iget-object v1, p0, Lcom/jirbo/adcolony/w;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->f:I

    int-to-double v2, v1

    iget-object v1, p0, Lcom/jirbo/adcolony/w;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->f:I

    int-to-double v4, v1

    sget-wide v6, Lcom/jirbo/adcolony/w;->p:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    sub-double/2addr v2, v4

    double-to-int v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jirbo/adcolony/w;->C:I

    .line 176
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .prologue
    const/16 v0, 0x80

    const/4 v6, 0x0

    .line 41
    iget-object v1, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-nez v1, :cond_0

    .line 86
    :goto_0
    return-void

    .line 44
    :cond_0
    const/4 v1, 0x1

    sput-boolean v1, Lcom/jirbo/adcolony/w;->H:Z

    .line 45
    invoke-virtual {p0}, Lcom/jirbo/adcolony/w;->c()V

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 49
    iget-wide v4, p0, Lcom/jirbo/adcolony/w;->w:J

    sub-long/2addr v2, v4

    long-to-int v1, v2

    .line 50
    mul-int/lit16 v1, v1, 0xff

    div-int/lit16 v1, v1, 0x3e8

    .line 51
    if-le v1, v0, :cond_3

    .line 52
    :goto_1
    invoke-virtual {p1, v0, v6, v6, v6}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 54
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->a:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/w;->x:I

    iget v2, p0, Lcom/jirbo/adcolony/w;->y:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 56
    invoke-virtual {p0}, Lcom/jirbo/adcolony/w;->b()I

    move-result v0

    .line 57
    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    .line 59
    const-string v1, "Completion is required to receive"

    iget v2, p0, Lcom/jirbo/adcolony/w;->z:I

    iget v3, p0, Lcom/jirbo/adcolony/w;->A:I

    int-to-double v4, v3

    int-to-double v6, v0

    const-wide/high16 v8, 0x4006000000000000L    # 2.75

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v3, v4

    invoke-virtual {p0, v1, v2, v3, p1}, Lcom/jirbo/adcolony/w;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 60
    const-string v1, "your reward."

    iget v2, p0, Lcom/jirbo/adcolony/w;->z:I

    iget v3, p0, Lcom/jirbo/adcolony/w;->A:I

    mul-int/lit8 v4, v0, 0x2

    sub-int/2addr v3, v4

    invoke-virtual {p0, v1, v2, v3, p1}, Lcom/jirbo/adcolony/w;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 61
    const-string v1, "Are you sure you want to skip?"

    iget v2, p0, Lcom/jirbo/adcolony/w;->z:I

    iget v3, p0, Lcom/jirbo/adcolony/w;->A:I

    int-to-double v4, v3

    int-to-double v6, v0

    const-wide/high16 v8, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    double-to-int v0, v4

    invoke-virtual {p0, v1, v2, v0, p1}, Lcom/jirbo/adcolony/w;->a(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 63
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/w;->z:I

    iget-object v2, p0, Lcom/jirbo/adcolony/w;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget v2, p0, Lcom/jirbo/adcolony/w;->A:I

    iget-object v3, p0, Lcom/jirbo/adcolony/w;->b:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 65
    iget-boolean v0, p0, Lcom/jirbo/adcolony/w;->J:Z

    if-nez v0, :cond_1

    .line 67
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/w;->B:I

    iget v2, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 74
    :goto_2
    iget-boolean v0, p0, Lcom/jirbo/adcolony/w;->K:Z

    if-nez v0, :cond_2

    .line 76
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->e:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/w;->C:I

    iget v2, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 82
    :goto_3
    const-string v0, "Yes"

    iget v1, p0, Lcom/jirbo/adcolony/w;->B:I

    iget v2, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/jirbo/adcolony/w;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    .line 83
    const-string v0, "No"

    iget v1, p0, Lcom/jirbo/adcolony/w;->C:I

    iget v2, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/jirbo/adcolony/w;->c(Ljava/lang/String;IILandroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->d:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/w;->B:I

    iget v2, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto :goto_2

    .line 80
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->f:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/w;->C:I

    iget v2, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto :goto_3

    :cond_3
    move v0, v1

    goto/16 :goto_1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 144
    iget-object v1, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-nez v1, :cond_1

    .line 149
    :cond_0
    :goto_0
    return v0

    .line 145
    :cond_1
    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    .line 147
    invoke-super {p0, p1, p2}, Lcom/jirbo/adcolony/h;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 156
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 157
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->start()V

    .line 158
    const/4 v0, 0x1

    .line 160
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x1

    .line 90
    sget-boolean v1, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v1, :cond_1

    .line 91
    sput-object v6, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 92
    iget-object v0, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ae;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 139
    :cond_0
    :goto_0
    return v0

    .line 95
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    .line 96
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 98
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-ne v3, v0, :cond_3

    .line 101
    iget v3, p0, Lcom/jirbo/adcolony/w;->B:I

    iget v4, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/jirbo/adcolony/w;->a(IIII)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-boolean v3, p0, Lcom/jirbo/adcolony/w;->J:Z

    if-eqz v3, :cond_4

    .line 103
    sput-object v6, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 104
    sput-boolean v5, Lcom/jirbo/adcolony/w;->H:Z

    .line 105
    sput-boolean v5, Lcom/jirbo/adcolony/a;->u:Z

    .line 106
    sput-boolean v0, Lcom/jirbo/adcolony/a;->aa:Z

    .line 107
    sget-object v3, Lcom/jirbo/adcolony/a;->M:Lcom/jirbo/adcolony/a$a;

    iget-object v4, p0, Lcom/jirbo/adcolony/w;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v3, v4}, Lcom/jirbo/adcolony/a$a;->b(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 108
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->A:Z

    .line 109
    iget-object v3, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v3}, Lcom/jirbo/adcolony/ADCVideo;->finish()V

    .line 119
    :cond_2
    :goto_1
    iput-boolean v5, p0, Lcom/jirbo/adcolony/w;->J:Z

    .line 120
    iput-boolean v5, p0, Lcom/jirbo/adcolony/w;->K:Z

    .line 121
    invoke-virtual {p0}, Lcom/jirbo/adcolony/w;->invalidate()V

    .line 124
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_0

    .line 126
    iget v3, p0, Lcom/jirbo/adcolony/w;->B:I

    iget v4, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/jirbo/adcolony/w;->a(IIII)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 129
    iput-boolean v0, p0, Lcom/jirbo/adcolony/w;->J:Z

    .line 130
    invoke-virtual {p0}, Lcom/jirbo/adcolony/w;->invalidate()V

    goto :goto_0

    .line 112
    :cond_4
    iget v3, p0, Lcom/jirbo/adcolony/w;->C:I

    iget v4, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/jirbo/adcolony/w;->a(IIII)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Lcom/jirbo/adcolony/w;->K:Z

    if-eqz v3, :cond_2

    .line 114
    sput-object v6, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 115
    sput-boolean v5, Lcom/jirbo/adcolony/w;->H:Z

    .line 116
    iget-object v3, p0, Lcom/jirbo/adcolony/w;->L:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v3, v3, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v3}, Lcom/jirbo/adcolony/e;->start()V

    goto :goto_1

    .line 132
    :cond_5
    iget v3, p0, Lcom/jirbo/adcolony/w;->C:I

    iget v4, p0, Lcom/jirbo/adcolony/w;->D:I

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/jirbo/adcolony/w;->a(IIII)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 135
    iput-boolean v0, p0, Lcom/jirbo/adcolony/w;->K:Z

    .line 136
    invoke-virtual {p0}, Lcom/jirbo/adcolony/w;->invalidate()V

    goto :goto_0
.end method
