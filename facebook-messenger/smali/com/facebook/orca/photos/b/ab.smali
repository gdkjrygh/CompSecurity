.class public Lcom/facebook/orca/photos/b/ab;
.super Ljava/lang/Object;
.source "PhotoUploadStatusUtil.java"


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/orca/photos/b/ab;->a:Landroid/content/res/Resources;

    .line 20
    return-void
.end method

.method private a(ZLandroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 55
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/photos/b/ab;->b:Z

    if-nez v0, :cond_0

    .line 56
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/photos/b/ab;->b:Z

    .line 58
    invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 59
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 61
    :cond_0
    if-nez p1, :cond_1

    iget-boolean v0, p0, Lcom/facebook/orca/photos/b/ab;->b:Z

    if-eqz v0, :cond_1

    .line 62
    invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 63
    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->reverseTransition(I)V

    .line 64
    iput-boolean v2, p0, Lcom/facebook/orca/photos/b/ab;->b:Z

    .line 65
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 67
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/photos/b/w;Landroid/widget/ProgressBar;Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 33
    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    .line 52
    :cond_0
    :goto_0
    return-void

    .line 36
    :cond_1
    if-nez p1, :cond_2

    .line 37
    invoke-virtual {p2, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 38
    invoke-direct {p0, v2, p3}, Lcom/facebook/orca/photos/b/ab;->a(ZLandroid/view/View;)V

    goto :goto_0

    .line 41
    :cond_2
    iget v0, p1, Lcom/facebook/orca/photos/b/w;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 42
    invoke-virtual {p2, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 43
    invoke-direct {p0, v4, p3}, Lcom/facebook/orca/photos/b/ab;->a(ZLandroid/view/View;)V

    goto :goto_0

    .line 44
    :cond_3
    iget-boolean v0, p1, Lcom/facebook/orca/photos/b/w;->c:Z

    if-eqz v0, :cond_4

    .line 45
    invoke-virtual {p2, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 46
    invoke-direct {p0, v2, p3}, Lcom/facebook/orca/photos/b/ab;->a(ZLandroid/view/View;)V

    goto :goto_0

    .line 48
    :cond_4
    invoke-direct {p0, v4, p3}, Lcom/facebook/orca/photos/b/ab;->a(ZLandroid/view/View;)V

    .line 49
    invoke-virtual {p2, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 50
    iget v0, p1, Lcom/facebook/orca/photos/b/w;->b:I

    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_0
.end method
