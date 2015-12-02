.class public Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;
.super Lcom/qihoo/security/widget/CheckBoxPreference;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/widget/material/b;


# instance fields
.field private b:Lcom/qihoo/security/widget/material/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/widget/CheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->b:Lcom/qihoo/security/widget/material/a;

    .line 25
    new-instance v0, Lcom/qihoo/security/widget/material/a;

    invoke-direct {v0}, Lcom/qihoo/security/widget/material/a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->b:Lcom/qihoo/security/widget/material/a;

    .line 26
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->b:Lcom/qihoo/security/widget/material/a;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, p0}, Lcom/qihoo/security/widget/material/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V

    .line 27
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/CheckBoxPreference;->draw(Landroid/graphics/Canvas;)V

    .line 55
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->b:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/material/a;->a(Landroid/graphics/Canvas;)V

    .line 50
    return-void
.end method

.method public isInEditMode()Z
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    return v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 37
    invoke-super {p0, p1, p2, p3, p4}, Lcom/qihoo/security/widget/CheckBoxPreference;->onSizeChanged(IIII)V

    .line 38
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->b:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo/security/widget/material/a;->a(IIII)V

    .line 40
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 31
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/CheckBoxPreference;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 32
    iget-object v1, p0, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->b:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->isEnabled()Z

    move-result v2

    invoke-virtual {v1, p1, v0, v2}, Lcom/qihoo/security/widget/material/a;->a(Landroid/view/MotionEvent;ZZ)Z

    move-result v0

    return v0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleCheckBox;->b:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/material/a;->a(Landroid/view/View$OnClickListener;)V

    .line 17
    return-void
.end method
