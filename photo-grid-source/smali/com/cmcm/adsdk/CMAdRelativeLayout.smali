.class public Lcom/cmcm/adsdk/CMAdRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ProgressBar;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/content/Context;

.field private d:Z

.field private e:Z

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    iput-boolean v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->d:Z

    .line 21
    iput-boolean v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->e:Z

    .line 41
    iput-object p1, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->c:Landroid/content/Context;

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    iput-boolean v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->d:Z

    .line 21
    iput-boolean v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->e:Z

    .line 35
    iput-object p1, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->c:Landroid/content/Context;

    .line 36
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 0

    .prologue
    .line 47
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V

    .line 48
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 98
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 99
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    const/4 v2, -0x2

    .line 67
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 68
    iget-boolean v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->d:Z

    if-nez v0, :cond_0

    .line 1079
    new-instance v0, Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->a:Landroid/widget/ProgressBar;

    .line 1080
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1082
    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1083
    iget-object v1, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1084
    iget-object v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1085
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->b:Landroid/widget/RelativeLayout;

    .line 1086
    iget-object v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->b:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->f:I

    iget v3, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->g:I

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1087
    iget-object v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->b:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 1088
    iget-object v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/cmcm/adsdk/CMAdRelativeLayout;->getChildCount()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/cmcm/adsdk/CMAdRelativeLayout;->addView(Landroid/view/View;I)V

    .line 1089
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->d:Z

    .line 71
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .prologue
    .line 60
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 61
    invoke-virtual {p0}, Lcom/cmcm/adsdk/CMAdRelativeLayout;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->f:I

    .line 62
    invoke-virtual {p0}, Lcom/cmcm/adsdk/CMAdRelativeLayout;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/cmcm/adsdk/CMAdRelativeLayout;->g:I

    .line 63
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 75
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 76
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 52
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onWindowFocusChanged(Z)V

    .line 53
    return-void
.end method
