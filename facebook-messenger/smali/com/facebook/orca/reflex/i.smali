.class public Lcom/facebook/orca/reflex/i;
.super Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;
.source "SwipableOverlayLayout.java"

# interfaces
.implements Lcom/facebook/reflex/view/b/h;
.implements Lcom/facebook/reflex/view/b/i;
.implements Lcom/facebook/reflex/view/b/r;


# instance fields
.field protected final a:Lcom/facebook/reflex/view/b/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/reflex/i;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    new-instance v0, Lcom/facebook/reflex/view/b/a;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/b/a;-><init>(Lcom/facebook/reflex/view/b/i;Lcom/facebook/reflex/view/b/h;)V

    iput-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    .line 40
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p2}, Lcom/facebook/reflex/view/b/a;->a(Landroid/util/AttributeSet;)V

    .line 41
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;->draw(Landroid/graphics/Canvas;)V

    .line 63
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 57
    invoke-super {p0, p1}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public b()Landroid/view/ViewGroup;
    .locals 0

    .prologue
    .line 67
    return-object p0
.end method

.method public c()Lcom/facebook/reflex/view/b/r;
    .locals 0

    .prologue
    .line 72
    return-object p0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/graphics/Canvas;)V

    .line 143
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->f()V

    .line 123
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 127
    return-object p0
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->b()Lcom/facebook/reflex/d;

    move-result-object v0

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v0

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 132
    const/4 v0, 0x0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 137
    const/4 v0, 0x0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    invoke-super {p0}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;->invalidate()V

    .line 164
    :cond_0
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/reflex/view/b/a;->a(IIII)Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;->invalidate(IIII)V

    .line 157
    :cond_0
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    invoke-super {p0, p1}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;->invalidate(Landroid/graphics/Rect;)V

    .line 150
    :cond_0
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/view/b/a;->a([ILandroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const/4 v0, 0x0

    .line 171
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 45
    invoke-super/range {p0 .. p5}, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;->onLayout(ZIIII)V

    .line 46
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->g()V

    .line 47
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/a;->a(II)V

    .line 48
    return-void
.end method

.method public setAndroidTouchMode(Ljava/util/EnumSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/reflex/view/b/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Ljava/util/EnumSet;)V

    .line 93
    return-void
.end method

.method public setCompatibilityDrawEnabled(Z)V
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->b(Z)V

    .line 103
    return-void
.end method

.method public setDispatchAndroidTouchEventsEnabled(Z)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/reflex/i;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Z)V

    .line 83
    return-void
.end method
