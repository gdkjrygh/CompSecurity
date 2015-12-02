.class public Lcom/facebook/bugreporter/activity/bugreport/ScreenShotSectionContainer;
.super Landroid/widget/RelativeLayout;
.source "ScreenShotSectionContainer.java"


# instance fields
.field private a:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/ScreenShotSectionContainer;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/facebook/widget/f/d;->a(Landroid/view/View;I)Landroid/view/TouchDelegate;

    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/ScreenShotSectionContainer;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 51
    return-void
.end method


# virtual methods
.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 35
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 37
    sget v0, Lcom/facebook/i;->screenshot_remove:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/ScreenShotSectionContainer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/ScreenShotSectionContainer;->a:Landroid/view/View;

    .line 38
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .prologue
    .line 42
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 43
    if-eqz p1, :cond_0

    .line 44
    invoke-direct {p0}, Lcom/facebook/bugreporter/activity/bugreport/ScreenShotSectionContainer;->a()V

    .line 46
    :cond_0
    return-void
.end method
