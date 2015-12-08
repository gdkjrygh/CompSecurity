.class public final Lcom/kik/android/a/a;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private final b:I

.field private c:Landroid/graphics/drawable/ColorDrawable;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    .line 20
    iget-object v0, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 21
    iget-object v0, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 23
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lcom/kik/android/a/a;->b:I

    .line 24
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget v1, p0, Lcom/kik/android/a/a;->b:I

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Lcom/kik/android/a/a;->c:Landroid/graphics/drawable/ColorDrawable;

    .line 25
    return-void
.end method


# virtual methods
.method protected final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .prologue
    const/16 v0, 0xff

    const v2, 0x3f4ccccd    # 0.8f

    .line 37
    iget-object v1, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    if-nez v1, :cond_0

    .line 54
    :goto_0
    return-void

    .line 41
    :cond_0
    mul-float v1, v2, p1

    sub-float v1, v2, v1

    .line 42
    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 43
    if-le v1, v0, :cond_3

    .line 46
    :goto_1
    if-gez v0, :cond_1

    .line 47
    const/4 v0, 0x0

    .line 49
    :cond_1
    iget-object v1, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/android/a/a;->c:Landroid/graphics/drawable/ColorDrawable;

    if-eq v1, v2, :cond_2

    .line 50
    iget-object v1, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/kik/android/a/a;->c:Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 52
    :cond_2
    iget-object v1, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 53
    invoke-super {p0, p1, p2}, Landroid/view/animation/Animation;->applyTransformation(FLandroid/view/animation/Transformation;)V

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public final cancel()V
    .locals 1

    .prologue
    .line 30
    invoke-super {p0}, Landroid/view/animation/Animation;->cancel()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/android/a/a;->a:Landroid/view/View;

    .line 32
    return-void
.end method
