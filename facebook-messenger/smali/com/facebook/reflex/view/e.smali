.class public Lcom/facebook/reflex/view/e;
.super Landroid/widget/ImageView;
.source "ImageView.java"

# interfaces
.implements Lcom/facebook/reflex/view/b/r;


# instance fields
.field private a:Lcom/facebook/reflex/Container;

.field private b:Lcom/facebook/reflex/view/b/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    invoke-direct {p0}, Lcom/facebook/reflex/view/e;->a()V

    .line 35
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 43
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/e;->setWillNotDraw(Z)V

    .line 44
    new-instance v0, Lcom/facebook/reflex/Container;

    invoke-direct {v0}, Lcom/facebook/reflex/Container;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/e;->a:Lcom/facebook/reflex/Container;

    .line 45
    new-instance v0, Lcom/facebook/reflex/view/f;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/f;-><init>(Lcom/facebook/reflex/view/e;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/e;->b:Lcom/facebook/reflex/view/b/m;

    .line 53
    iget-object v0, p0, Lcom/facebook/reflex/view/e;->a:Lcom/facebook/reflex/Container;

    iget-object v1, p0, Lcom/facebook/reflex/view/e;->b:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/d;)V

    .line 54
    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 121
    invoke-super {p0, p1}, Landroid/widget/ImageView;->draw(Landroid/graphics/Canvas;)V

    .line 122
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x1

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 132
    const/4 v0, 0x0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 115
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ImageView;->draw(Landroid/graphics/Canvas;)V

    .line 116
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/reflex/view/e;->b:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/m;->f()V

    .line 91
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 95
    return-object p0
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/reflex/view/e;->b:Lcom/facebook/reflex/view/b/m;

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/reflex/view/e;->a:Lcom/facebook/reflex/Container;

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/facebook/reflex/view/e;->getScrollX()I

    move-result v0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/facebook/reflex/view/e;->getScrollY()I

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 110
    invoke-virtual {p0}, Lcom/facebook/reflex/view/e;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 111
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/facebook/reflex/view/e;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 106
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 100
    invoke-virtual {p0}, Lcom/facebook/reflex/view/e;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 101
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 83
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 84
    iget-object v0, p0, Lcom/facebook/reflex/view/e;->a:Lcom/facebook/reflex/Container;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Container;->a(II)V

    .line 85
    iget-object v0, p0, Lcom/facebook/reflex/view/e;->b:Lcom/facebook/reflex/view/b/m;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/m;->a(II)V

    .line 86
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 127
    return-void
.end method
