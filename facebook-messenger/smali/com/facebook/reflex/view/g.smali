.class public Lcom/facebook/reflex/view/g;
.super Landroid/widget/LinearLayout;
.source "LinearLayout.java"

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
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/reflex/view/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    new-instance v0, Lcom/facebook/reflex/view/b/a;

    invoke-direct {v0, p0, p0}, Lcom/facebook/reflex/view/b/a;-><init>(Lcom/facebook/reflex/view/b/i;Lcom/facebook/reflex/view/b/h;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    .line 44
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p2}, Lcom/facebook/reflex/view/b/a;->a(Landroid/util/AttributeSet;)V

    .line 45
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 71
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 72
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 61
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public b()Landroid/view/ViewGroup;
    .locals 0

    .prologue
    .line 76
    return-object p0
.end method

.method public c()Lcom/facebook/reflex/view/b/r;
    .locals 0

    .prologue
    .line 81
    return-object p0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->h()Z

    move-result v0

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/graphics/Canvas;)V

    .line 67
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->f()V

    .line 132
    return-void
.end method

.method public f()Landroid/view/View;
    .locals 0

    .prologue
    .line 136
    return-object p0
.end method

.method public getBackingContent()Lcom/facebook/reflex/d;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->b()Lcom/facebook/reflex/d;

    move-result-object v0

    return-object v0
.end method

.method public getBackingWidget()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->a()Lcom/facebook/reflex/Container;

    move-result-object v0

    return-object v0
.end method

.method public getScrollOffsetX()I
    .locals 1

    .prologue
    .line 141
    const/4 v0, 0x0

    return v0
.end method

.method public getScrollOffsetY()I
    .locals 1

    .prologue
    .line 146
    const/4 v0, 0x0

    return v0
.end method

.method public getTranslationX()F
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->i()F

    move-result v0

    return v0
.end method

.method public getTranslationY()F
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->j()F

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 186
    invoke-super {p0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 188
    :cond_0
    return-void
.end method

.method public invalidate(IIII)V
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/reflex/view/b/a;->a(IIII)Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->invalidate(IIII)V

    .line 181
    :cond_0
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->invalidate(Landroid/graphics/Rect;)V

    .line 174
    :cond_0
    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/view/b/a;->a([ILandroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    const/4 v0, 0x0

    .line 195
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 49
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 50
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/b/a;->g()V

    .line 51
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/reflex/view/b/a;->a(II)V

    .line 52
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
    .line 101
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Ljava/util/EnumSet;)V

    .line 102
    return-void
.end method

.method public setCompatibilityDrawEnabled(Z)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->b(Z)V

    .line 112
    return-void
.end method

.method public setDispatchAndroidTouchEventsEnabled(Z)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(Z)V

    .line 92
    return-void
.end method

.method public setTranslationX(F)V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->a(F)V

    .line 157
    return-void
.end method

.method public setTranslationY(F)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/reflex/view/g;->a:Lcom/facebook/reflex/view/b/a;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/b/a;->b(F)V

    .line 167
    return-void
.end method
