.class public Lcom/facebook/reflex/view/a;
.super Landroid/widget/Button;
.source "Button.java"

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
    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    invoke-direct {p0}, Lcom/facebook/reflex/view/a;->a()V

    .line 38
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 46
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/a;->setWillNotDraw(Z)V

    .line 47
    new-instance v0, Lcom/facebook/reflex/Container;

    invoke-direct {v0}, Lcom/facebook/reflex/Container;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/a;->a:Lcom/facebook/reflex/Container;

    .line 48
    new-instance v0, Lcom/facebook/reflex/view/b;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/b;-><init>(Lcom/facebook/reflex/view/a;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/a;->b:Lcom/facebook/reflex/view/b/m;

    .line 56
    iget-object v0, p0, Lcom/facebook/reflex/view/a;->a:Lcom/facebook/reflex/Container;

    iget-object v1, p0, Lcom/facebook/reflex/view/a;->b:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/d;)V

    .line 57
    iget-object v0, p0, Lcom/facebook/reflex/view/a;->a:Lcom/facebook/reflex/Container;

    new-instance v1, Lcom/facebook/reflex/view/c;

    invoke-direct {v1, p0}, Lcom/facebook/reflex/view/c;-><init>(Lcom/facebook/reflex/view/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Container;->a(Lcom/facebook/reflex/ak;)V

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/facebook/reflex/view/a;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 24
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 132
    invoke-super {p0, p1}, Landroid/widget/Button;->draw(Landroid/graphics/Canvas;)V

    .line 133
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x1

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x1

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 126
    invoke-static {}, Lcom/facebook/reflex/view/b/j;->a()Lcom/facebook/reflex/view/b/j;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/Button;->draw(Landroid/graphics/Canvas;)V

    .line 127
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/reflex/view/a;->b:Lcom/facebook/reflex/view/b/m;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/m;->f()V

    .line 102
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 106
    return-object p0
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/reflex/view/a;->b:Lcom/facebook/reflex/view/b/m;

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/reflex/view/a;->a:Lcom/facebook/reflex/Container;

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/facebook/reflex/view/a;->getScrollX()I

    move-result v0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/reflex/view/a;->getScrollY()I

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 121
    invoke-virtual {p0}, Lcom/facebook/reflex/view/a;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 122
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 116
    invoke-virtual {p0}, Lcom/facebook/reflex/view/a;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 117
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Lcom/facebook/reflex/view/a;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/j;

    invoke-virtual {v0, p0}, Lcom/facebook/reflex/j;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 112
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 94
    invoke-super/range {p0 .. p5}, Landroid/widget/Button;->onLayout(ZIIII)V

    .line 95
    iget-object v0, p0, Lcom/facebook/reflex/view/a;->a:Lcom/facebook/reflex/Container;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/Container;->a(II)V

    .line 96
    iget-object v0, p0, Lcom/facebook/reflex/view/a;->b:Lcom/facebook/reflex/view/b/m;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/m;->a(II)V

    .line 97
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 138
    return-void
.end method
