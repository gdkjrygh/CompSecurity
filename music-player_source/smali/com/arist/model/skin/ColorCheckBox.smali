.class public Lcom/arist/model/skin/ColorCheckBox;
.super Landroid/widget/ImageView;

# interfaces
.implements Lcom/arist/model/skin/m;


# instance fields
.field a:Z

.field b:I

.field private c:Landroid/widget/CompoundButton$OnCheckedChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorCheckBox;->a:Z

    invoke-direct {p0}, Lcom/arist/model/skin/ColorCheckBox;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorCheckBox;->setImageResource(I)V

    return-void
.end method

.method private a()I
    .locals 3

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorCheckBox;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/arist/model/skin/ColorCheckBox;->setColorFilter(Landroid/graphics/ColorFilter;)V

    const v0, 0x7f0200e5

    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorCheckBox;->a:Z

    if-eqz v0, :cond_1

    new-instance v0, Landroid/graphics/LightingColorFilter;

    iget v1, p0, Lcom/arist/model/skin/ColorCheckBox;->b:I

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorCheckBox;->setColorFilter(Landroid/graphics/ColorFilter;)V

    const v0, 0x7f0200e4

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Lcom/arist/model/skin/ColorCheckBox;->setColorFilter(Landroid/graphics/ColorFilter;)V

    const v0, 0x7f0200e6

    goto :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/arist/model/skin/ColorCheckBox;->b:I

    return-void
.end method

.method public final a(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/ColorCheckBox;->c:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorCheckBox;->a:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/arist/model/skin/ColorCheckBox;->a:Z

    invoke-direct {p0}, Lcom/arist/model/skin/ColorCheckBox;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorCheckBox;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->b(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorCheckBox;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorCheckBox;->a:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/arist/model/skin/ColorCheckBox;->a:Z

    invoke-direct {p0}, Lcom/arist/model/skin/ColorCheckBox;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorCheckBox;->setImageResource(I)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorCheckBox;->c:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorCheckBox;->c:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lcom/arist/model/skin/ColorCheckBox;->a:Z

    invoke-interface {v0, v2, v3}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/arist/model/skin/ColorCheckBox;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorCheckBox;->setImageResource(I)V

    return-void
.end method
