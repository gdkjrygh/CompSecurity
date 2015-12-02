.class public Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;
.super Landroid/widget/ImageView;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;
    }
.end annotation


# instance fields
.field private a:F

.field private b:I

.field private c:I

.field private d:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;

.field private e:I

.field private f:F

.field private g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b:I

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->d:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;

    .line 32
    const/16 v0, 0x28

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->e:I

    .line 33
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->f:F

    .line 34
    const v0, 0x3f4ccccd    # 0.8f

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->g:F

    .line 44
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    .line 81
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->d:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;

    .line 48
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b()V

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    .line 50
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->invalidate()V

    .line 52
    return-void
.end method

.method public a(Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;)V
    .locals 2

    .prologue
    .line 66
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->d:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;

    .line 67
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 68
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    .line 70
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->invalidate()V

    .line 71
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    const/4 v2, -0x1

    const/high16 v3, 0x40000000    # 2.0f

    .line 90
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    if-eq v0, v2, :cond_2

    .line 91
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    packed-switch v0, :pswitch_data_0

    .line 117
    :cond_0
    :goto_0
    :pswitch_0
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b:I

    int-to-float v0, v0

    const/high16 v1, 0x4f000000

    iget v2, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    sub-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b:I

    .line 120
    :cond_1
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b:I

    int-to-float v0, v0

    iget v1, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b:I

    .line 121
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->invalidate()V

    .line 123
    :cond_2
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->b:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v3

    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 124
    invoke-super {p0, p1}, Landroid/widget/ImageView;->draw(Landroid/graphics/Canvas;)V

    .line 125
    return-void

    .line 93
    :pswitch_1
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    iget v1, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->e:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 94
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    iget v1, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->f:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    goto :goto_0

    .line 96
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->d:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;

    if-eqz v0, :cond_4

    .line 97
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    goto :goto_0

    .line 99
    :cond_4
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    goto :goto_0

    .line 106
    :pswitch_2
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    iget v1, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->g:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    .line 107
    iget v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->a:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 108
    iput v2, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->c:I

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->d:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView;->d:Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;

    invoke-interface {v0}, Lcom/qihoo/security/floatview/ui/FloatViewWndmillView$a;->a()V

    goto :goto_0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 85
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 86
    return-void
.end method
