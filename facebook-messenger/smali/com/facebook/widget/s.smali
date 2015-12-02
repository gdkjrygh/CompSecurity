.class public Lcom/facebook/widget/s;
.super Ljava/lang/Object;
.source "ViewTransform.java"

# interfaces
.implements Lcom/facebook/widget/l;


# instance fields
.field private a:Landroid/view/View;

.field private b:Lcom/a/c/a/a;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    .line 18
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 19
    invoke-static {p1}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public getAlpha()F
    .locals 1

    .prologue
    .line 196
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v0

    .line 199
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getAlpha()F

    move-result v0

    goto :goto_0
.end method

.method public getPivotX()F
    .locals 1

    .prologue
    .line 88
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getPivotX()F

    move-result v0

    .line 91
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getPivotX()F

    move-result v0

    goto :goto_0
.end method

.method public getPivotY()F
    .locals 1

    .prologue
    .line 96
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getPivotY()F

    move-result v0

    .line 99
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getPivotY()F

    move-result v0

    goto :goto_0
.end method

.method public getRotation()F
    .locals 1

    .prologue
    .line 220
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getRotation()F

    move-result v0

    .line 223
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getRotation()F

    move-result v0

    goto :goto_0
.end method

.method public getScaleX()F
    .locals 1

    .prologue
    .line 54
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScaleX()F

    move-result v0

    .line 57
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getScaleX()F

    move-result v0

    goto :goto_0
.end method

.method public getScaleY()F
    .locals 1

    .prologue
    .line 62
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getScaleY()F

    move-result v0

    .line 65
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getScaleY()F

    move-result v0

    goto :goto_0
.end method

.method public getTranslationX()F
    .locals 1

    .prologue
    .line 142
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    .line 145
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getTranslationX()F

    move-result v0

    goto :goto_0
.end method

.method public getTranslationY()F
    .locals 1

    .prologue
    .line 154
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    .line 157
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getTranslationY()F

    move-result v0

    goto :goto_0
.end method

.method public getX()F
    .locals 1

    .prologue
    .line 122
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    .line 125
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getX()F

    move-result v0

    goto :goto_0
.end method

.method public getY()F
    .locals 1

    .prologue
    .line 130
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-result v0

    .line 133
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0}, Lcom/a/c/a/a;->getY()F

    move-result v0

    goto :goto_0
.end method

.method public setAlpha(F)V
    .locals 1

    .prologue
    .line 187
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 192
    :goto_0
    return-void

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setAlpha(F)V

    goto :goto_0
.end method

.method public setPivotX(F)V
    .locals 1

    .prologue
    .line 71
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setPivotX(F)V

    .line 76
    :goto_0
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setPivotX(F)V

    goto :goto_0
.end method

.method public setPivotY(F)V
    .locals 1

    .prologue
    .line 79
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setPivotY(F)V

    .line 84
    :goto_0
    return-void

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setPivotY(F)V

    goto :goto_0
.end method

.method public setRotation(F)V
    .locals 1

    .prologue
    .line 208
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    .line 213
    :goto_0
    return-void

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setRotation(F)V

    goto :goto_0
.end method

.method public setScaleX(F)V
    .locals 1

    .prologue
    .line 37
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 42
    :goto_0
    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setScaleX(F)V

    goto :goto_0
.end method

.method public setScaleY(F)V
    .locals 1

    .prologue
    .line 45
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 50
    :goto_0
    return-void

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setScaleY(F)V

    goto :goto_0
.end method

.method public setTranslationX(F)V
    .locals 1

    .prologue
    .line 166
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 171
    :goto_0
    return-void

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setTranslationX(F)V

    goto :goto_0
.end method

.method public setTranslationY(F)V
    .locals 1

    .prologue
    .line 178
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 183
    :goto_0
    return-void

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setTranslationY(F)V

    goto :goto_0
.end method

.method public setVisibility(I)V
    .locals 2

    .prologue
    .line 25
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_1

    .line 26
    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 32
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    return-void

    .line 28
    :cond_2
    if-nez p1, :cond_1

    .line 29
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public setX(F)V
    .locals 1

    .prologue
    .line 105
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setX(F)V

    .line 110
    :goto_0
    return-void

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setX(F)V

    goto :goto_0
.end method

.method public setY(F)V
    .locals 1

    .prologue
    .line 113
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-nez v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/facebook/widget/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setY(F)V

    .line 118
    :goto_0
    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/s;->b:Lcom/a/c/a/a;

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setY(F)V

    goto :goto_0
.end method
