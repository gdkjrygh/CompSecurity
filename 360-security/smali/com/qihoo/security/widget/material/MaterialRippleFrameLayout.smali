.class public Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;
.super Landroid/widget/FrameLayout;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/widget/material/b;


# instance fields
.field private a:Lcom/qihoo/security/widget/material/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 19
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->a:Lcom/qihoo/security/widget/material/a;

    .line 28
    new-instance v0, Lcom/qihoo/security/widget/material/a;

    invoke-direct {v0}, Lcom/qihoo/security/widget/material/a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->a:Lcom/qihoo/security/widget/material/a;

    .line 29
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1, p2, p3, p0}, Lcom/qihoo/security/widget/material/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V

    .line 30
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 57
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 58
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/material/a;->a(Landroid/graphics/Canvas;)V

    .line 53
    return-void
.end method

.method public isInEditMode()Z
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x1

    return v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 40
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo/security/widget/material/a;->a(IIII)V

    .line 43
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 34
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 35
    iget-object v1, p0, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->isEnabled()Z

    move-result v2

    invoke-virtual {v1, p1, v0, v2}, Lcom/qihoo/security/widget/material/a;->a(Landroid/view/MotionEvent;ZZ)Z

    move-result v0

    return v0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleFrameLayout;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/material/a;->a(Landroid/view/View$OnClickListener;)V

    .line 16
    return-void
.end method
