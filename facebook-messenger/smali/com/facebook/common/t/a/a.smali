.class public Lcom/facebook/common/t/a/a;
.super Landroid/view/TouchDelegate;
.source "CompoundTouchDelegate.java"


# instance fields
.field private final a:[Landroid/view/TouchDelegate;


# direct methods
.method public varargs constructor <init>(Landroid/view/View;[Landroid/view/TouchDelegate;)V
    .locals 1

    .prologue
    .line 22
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {p0, v0, p1}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 23
    iput-object p2, p0, Lcom/facebook/common/t/a/a;->a:[Landroid/view/TouchDelegate;

    .line 24
    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 28
    iget-object v2, p0, Lcom/facebook/common/t/a/a;->a:[Landroid/view/TouchDelegate;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 29
    invoke-virtual {v4, p1}, Landroid/view/TouchDelegate;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 30
    const/4 v0, 0x1

    .line 33
    :cond_0
    return v0

    .line 28
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
