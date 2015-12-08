.class public final Lcom/roidapp/imagelib/filter/z;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/s;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/filter/s;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 398
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/imagelib/filter/z;-><init>(Lcom/roidapp/imagelib/filter/s;Landroid/content/Context;B)V

    .line 399
    return-void
.end method

.method private constructor <init>(Lcom/roidapp/imagelib/filter/s;Landroid/content/Context;B)V
    .locals 1

    .prologue
    .line 402
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/imagelib/filter/z;-><init>(Lcom/roidapp/imagelib/filter/s;Landroid/content/Context;C)V

    .line 403
    return-void
.end method

.method private constructor <init>(Lcom/roidapp/imagelib/filter/s;Landroid/content/Context;C)V
    .locals 2

    .prologue
    .line 405
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/z;->a:Lcom/roidapp/imagelib/filter/s;

    .line 406
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 407
    return-void
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 411
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/z;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/s;->e(Lcom/roidapp/imagelib/filter/s;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 412
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method
