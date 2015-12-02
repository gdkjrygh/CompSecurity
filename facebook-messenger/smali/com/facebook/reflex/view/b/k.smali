.class public Lcom/facebook/reflex/view/b/k;
.super Ljava/lang/Object;
.source "MotionEventHelper.java"


# static fields
.field private static final a:Lcom/facebook/reflex/view/b/k;


# instance fields
.field private final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lcom/facebook/reflex/view/b/k;

    invoke-direct {v0}, Lcom/facebook/reflex/view/b/k;-><init>()V

    sput-object v0, Lcom/facebook/reflex/view/b/k;->a:Lcom/facebook/reflex/view/b/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/facebook/reflex/view/b/k;->b:[I

    return-void
.end method

.method public static a(Lcom/facebook/reflex/r;)Landroid/view/MotionEvent;
    .locals 2

    .prologue
    .line 20
    invoke-virtual {p0}, Lcom/facebook/reflex/r;->f()F

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/reflex/r;->g()F

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/facebook/reflex/view/b/k;->a(Lcom/facebook/reflex/r;FF)Landroid/view/MotionEvent;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/facebook/reflex/r;FF)Landroid/view/MotionEvent;
    .locals 8

    .prologue
    .line 28
    invoke-static {p0}, Lcom/facebook/reflex/view/b/k;->c(Lcom/facebook/reflex/r;)I

    move-result v4

    .line 29
    invoke-virtual {p0}, Lcom/facebook/reflex/r;->b()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/reflex/r;->c()J

    move-result-wide v2

    const/4 v7, 0x0

    move v5, p1

    move v6, p2

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    return-object v0
.end method

.method public static a()Lcom/facebook/reflex/view/b/k;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/facebook/reflex/view/b/k;->a:Lcom/facebook/reflex/view/b/k;

    return-object v0
.end method

.method public static b(Lcom/facebook/reflex/r;)Landroid/view/MotionEvent;
    .locals 2

    .prologue
    .line 24
    invoke-virtual {p0}, Lcom/facebook/reflex/r;->d()F

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/reflex/r;->e()F

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/facebook/reflex/view/b/k;->a(Lcom/facebook/reflex/r;FF)Landroid/view/MotionEvent;

    move-result-object v0

    return-object v0
.end method

.method private static c(Lcom/facebook/reflex/r;)I
    .locals 3

    .prologue
    const/4 v0, 0x3

    .line 79
    sget-object v1, Lcom/facebook/reflex/view/b/l;->a:[I

    invoke-virtual {p0}, Lcom/facebook/reflex/r;->a()Lcom/facebook/reflex/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/reflex/t;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 89
    :goto_0
    :pswitch_0
    return v0

    .line 81
    :pswitch_1
    const/4 v0, 0x0

    goto :goto_0

    .line 83
    :pswitch_2
    const/4 v0, 0x1

    goto :goto_0

    .line 87
    :pswitch_3
    const/4 v0, 0x2

    goto :goto_0

    .line 79
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 7

    .prologue
    .line 50
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 51
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    move v4, v0

    move v5, v1

    move-object v1, p1

    .line 52
    :goto_0
    if-eqz v1, :cond_3

    .line 53
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 54
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    .line 56
    instance-of v0, v1, Lcom/facebook/reflex/view/b/r;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 57
    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->getScrollOffsetX()I

    move-result v0

    sub-int/2addr v2, v0

    move-object v0, v1

    .line 58
    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->getScrollOffsetY()I

    move-result v0

    sub-int v0, v3, v0

    move v3, v2

    move v2, v0

    .line 63
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 64
    :goto_2
    if-nez v0, :cond_0

    .line 67
    iget-object v6, p0, Lcom/facebook/reflex/view/b/k;->b:[I

    invoke-virtual {v1, v6}, Landroid/view/View;->getLocationInWindow([I)V

    .line 68
    iget-object v1, p0, Lcom/facebook/reflex/view/b/k;->b:[I

    const/4 v6, 0x0

    aget v1, v1, v6

    add-int/2addr v3, v1

    .line 69
    iget-object v1, p0, Lcom/facebook/reflex/view/b/k;->b:[I

    const/4 v6, 0x1

    aget v1, v1, v6

    add-int/2addr v2, v1

    .line 71
    :cond_0
    int-to-float v1, v3

    sub-float v3, v5, v1

    .line 72
    int-to-float v1, v2

    sub-float v1, v4, v1

    move v4, v1

    move v5, v3

    move-object v1, v0

    .line 74
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v0

    sub-int/2addr v2, v0

    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int v0, v3, v0

    move v3, v2

    move v2, v0

    goto :goto_1

    .line 63
    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    .line 75
    :cond_3
    invoke-virtual {p2, v5, v4}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 76
    return-void
.end method
