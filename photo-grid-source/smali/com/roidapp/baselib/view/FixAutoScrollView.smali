.class public Lcom/roidapp/baselib/view/FixAutoScrollView;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixAutoScrollView;->a:Z

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixAutoScrollView;->a:Z

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/FixAutoScrollView;->a:Z

    .line 22
    return-void
.end method


# virtual methods
.method protected computeScrollDeltaToGetChildRectOnScreen(Landroid/graphics/Rect;)I
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/FixAutoScrollView;->a:Z

    if-nez v0, :cond_0

    .line 38
    const/4 v0, 0x0

    .line 39
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public setOverScrollMode(I)V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x2

    invoke-super {p0, v0}, Landroid/widget/ScrollView;->setOverScrollMode(I)V

    .line 33
    return-void
.end method
