.class public final Lcom/kik/android/a/b;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private f:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/view/View;II)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, -0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/kik/android/a/b;-><init>(Landroid/view/View;III)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/view/View;III)V
    .locals 2

    .prologue
    .line 39
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    .line 43
    iget-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 47
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    .line 48
    iput p2, p0, Lcom/kik/android/a/b;->b:I

    .line 49
    iput p3, p0, Lcom/kik/android/a/b;->c:I

    .line 50
    iput p4, p0, Lcom/kik/android/a/b;->d:I

    .line 51
    const/4 v0, -0x1

    iput v0, p0, Lcom/kik/android/a/b;->e:I

    .line 52
    iget-object v0, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    if-nez v0, :cond_2

    .line 53
    :cond_1
    :goto_0
    return-void

    .line 52
    :cond_2
    iget-object v0, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    iget v1, p0, Lcom/kik/android/a/b;->b:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lcom/kik/android/a/b;->c:I

    return v0
.end method

.method protected final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 101
    iget-object v0, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    if-nez v0, :cond_1

    .line 111
    :cond_0
    :goto_0
    return-void

    .line 105
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/animation/Animation;->applyTransformation(FLandroid/view/animation/Transformation;)V

    .line 107
    iget v0, p0, Lcom/kik/android/a/b;->b:I

    if-ltz v0, :cond_2

    iget v0, p0, Lcom/kik/android/a/b;->c:I

    if-gez v0, :cond_4

    .line 108
    :cond_2
    :goto_1
    iget v0, p0, Lcom/kik/android/a/b;->d:I

    if-ltz v0, :cond_3

    iget v0, p0, Lcom/kik/android/a/b;->e:I

    if-gez v0, :cond_6

    .line 110
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    goto :goto_0

    .line 107
    :cond_4
    iget v0, p0, Lcom/kik/android/a/b;->c:I

    iget v1, p0, Lcom/kik/android/a/b;->b:I

    sub-int/2addr v0, v1

    cmpg-float v1, p1, v2

    if-gez v1, :cond_5

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iget v1, p0, Lcom/kik/android/a/b;->b:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    iget v1, p0, Lcom/kik/android/a/b;->c:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_1

    .line 108
    :cond_6
    iget v0, p0, Lcom/kik/android/a/b;->e:I

    iget v1, p0, Lcom/kik/android/a/b;->d:I

    sub-int/2addr v0, v1

    cmpg-float v1, p1, v2

    if-gez v1, :cond_7

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iget v1, p0, Lcom/kik/android/a/b;->d:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    iget v1, p0, Lcom/kik/android/a/b;->e:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_2
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/kik/android/a/b;->e:I

    return v0
.end method

.method public final cancel()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 84
    invoke-super {p0}, Landroid/view/animation/Animation;->cancel()V

    .line 85
    iput-object v0, p0, Lcom/kik/android/a/b;->a:Landroid/view/View;

    .line 86
    iput-object v0, p0, Lcom/kik/android/a/b;->f:Landroid/view/ViewGroup$LayoutParams;

    .line 87
    return-void
.end method
