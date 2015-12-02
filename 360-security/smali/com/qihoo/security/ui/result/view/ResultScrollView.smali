.class public Lcom/qihoo/security/ui/result/view/ResultScrollView;
.super Landroid/widget/ScrollView;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/result/view/ResultScrollView$a;
    }
.end annotation


# instance fields
.field private a:Landroid/view/VelocityTracker;

.field private b:Lcom/qihoo/security/ui/result/view/ResultScrollView$a;

.field private final c:I

.field private final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->b:Lcom/qihoo/security/ui/result/view/ResultScrollView$a;

    .line 36
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->e:F

    .line 49
    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/a;->c()I

    move-result v0

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->c:I

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/ResultScrollView;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->c:I

    return v0
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 185
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 188
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 199
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 200
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    .line 202
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 77
    new-instance v0, Lcom/qihoo/security/ui/result/view/ResultScrollView$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/ResultScrollView$1;-><init>(Lcom/qihoo/security/ui/result/view/ResultScrollView;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->post(Ljava/lang/Runnable;)Z

    .line 83
    return-void
.end method

.method public a(IJLcom/nineoldandroids/a/b;)V
    .locals 6

    .prologue
    .line 90
    new-instance v0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;

    move-object v1, p0

    move v2, p1

    move-object v3, p4

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;-><init>(Lcom/qihoo/security/ui/result/view/ResultScrollView;ILcom/nineoldandroids/a/b;J)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->post(Ljava/lang/Runnable;)Z

    .line 127
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 6

    .prologue
    .line 59
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 60
    if-eq p2, p4, :cond_0

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->b:Lcom/qihoo/security/ui/result/view/ResultScrollView$a;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->b:Lcom/qihoo/security/ui/result/view/ResultScrollView$a;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/ui/result/view/ResultScrollView$a;->a(Lcom/qihoo/security/ui/result/view/ResultScrollView;IIII)V

    .line 69
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 134
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a(Landroid/view/MotionEvent;)V

    .line 135
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 172
    :cond_0
    :goto_0
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 139
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    .line 141
    cmpl-float v1, v0, v2

    if-eqz v1, :cond_0

    .line 142
    iput v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->e:F

    goto :goto_0

    .line 150
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->getScrollY()I

    move-result v0

    iget v1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->c:I

    if-ge v0, v1, :cond_1

    .line 151
    iget v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->e:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2

    .line 152
    new-instance v0, Lcom/qihoo/security/ui/result/view/ResultScrollView$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/ResultScrollView$3;-><init>(Lcom/qihoo/security/ui/result/view/ResultScrollView;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->post(Ljava/lang/Runnable;)Z

    .line 167
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->b()V

    goto :goto_0

    .line 158
    :cond_2
    iget v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->e:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    .line 159
    new-instance v0, Lcom/qihoo/security/ui/result/view/ResultScrollView$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/ResultScrollView$4;-><init>(Lcom/qihoo/security/ui/result/view/ResultScrollView;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setScrollViewListener(Lcom/qihoo/security/ui/result/view/ResultScrollView$a;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView;->b:Lcom/qihoo/security/ui/result/view/ResultScrollView$a;

    .line 55
    return-void
.end method
