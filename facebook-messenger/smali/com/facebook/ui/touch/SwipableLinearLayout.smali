.class public Lcom/facebook/ui/touch/SwipableLinearLayout;
.super Landroid/widget/LinearLayout;
.source "SwipableLinearLayout.java"

# interfaces
.implements Lcom/facebook/ui/touch/f;


# instance fields
.field private a:Lcom/facebook/ui/touch/a;

.field private b:Lcom/facebook/ui/touch/e;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->a:Lcom/facebook/ui/touch/a;

    .line 34
    return-void
.end method

.method public a(Lcom/facebook/ui/touch/a;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->a:Lcom/facebook/ui/touch/a;

    .line 29
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->a:Lcom/facebook/ui/touch/a;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->a:Lcom/facebook/ui/touch/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/touch/a;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->c:Z

    .line 46
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->c:Z

    return v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 51
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V

    .line 52
    iget-object v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->b:Lcom/facebook/ui/touch/e;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->b:Lcom/facebook/ui/touch/e;

    invoke-interface {v0}, Lcom/facebook/ui/touch/e;->a()V

    .line 55
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->c:Z

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->a:Lcom/facebook/ui/touch/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/touch/a;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->c:Z

    .line 65
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->c:Z

    return v0
.end method

.method public setOnSizeChangedListener(Lcom/facebook/ui/touch/e;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/ui/touch/SwipableLinearLayout;->b:Lcom/facebook/ui/touch/e;

    .line 38
    return-void
.end method
