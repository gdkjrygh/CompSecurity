.class public Lcom/qihoo/security/widget/material/MaterialRippleTextView;
.super Lcom/qihoo/security/locale/widget/LocaleTextView;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/widget/material/b;


# instance fields
.field private a:Lcom/qihoo/security/widget/material/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 21
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/widget/material/MaterialRippleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/material/MaterialRippleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->a:Lcom/qihoo/security/widget/material/a;

    .line 30
    new-instance v0, Lcom/qihoo/security/widget/material/a;

    invoke-direct {v0}, Lcom/qihoo/security/widget/material/a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->a:Lcom/qihoo/security/widget/material/a;

    .line 31
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1, p2, p3, p0}, Lcom/qihoo/security/widget/material/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V

    .line 32
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->draw(Landroid/graphics/Canvas;)V

    .line 60
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/material/a;->a(Landroid/graphics/Canvas;)V

    .line 55
    return-void
.end method

.method public isInEditMode()Z
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    return v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 42
    invoke-super {p0, p1, p2, p3, p4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onSizeChanged(IIII)V

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo/security/widget/material/a;->a(IIII)V

    .line 45
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 36
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 37
    iget-object v1, p0, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->isEnabled()Z

    move-result v2

    invoke-virtual {v1, p1, v0, v2}, Lcom/qihoo/security/widget/material/a;->a(Landroid/view/MotionEvent;ZZ)Z

    move-result v0

    return v0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/qihoo/security/widget/material/MaterialRippleTextView;->a:Lcom/qihoo/security/widget/material/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/material/a;->a(Landroid/view/View$OnClickListener;)V

    .line 17
    return-void
.end method
