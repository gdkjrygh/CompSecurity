.class final Lcom/nineoldandroids/b/a$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method static a(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 277
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    move-result v0

    return v0
.end method

.method static a(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 185
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 186
    return-void
.end method

.method static b(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v0

    return v0
.end method

.method static b(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 233
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 234
    return-void
.end method

.method static c(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 241
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 242
    return-void
.end method

.method static d(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 265
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 266
    return-void
.end method

.method static e(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 273
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 274
    return-void
.end method
