.class public Lorg/chromium/content/browser/ActivityContentVideoViewClient;
.super Ljava/lang/Object;
.source "ActivityContentVideoViewClient.java"

# interfaces
.implements Lorg/chromium/content/browser/ContentVideoViewClient;


# instance fields
.field private final mActivity:Landroid/app/Activity;

.field private mView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mActivity:Landroid/app/Activity;

    .line 25
    return-void
.end method

.method private setSystemUiVisibility(Landroid/view/View;Z)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;
    .param p2, "enterFullscreen"    # Z
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .prologue
    const/16 v3, 0x400

    .line 60
    if-eqz p2, :cond_0

    .line 61
    iget-object v2, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 67
    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-ge v2, v3, :cond_1

    .line 83
    :goto_1
    return-void

    .line 65
    :cond_0
    iget-object v2, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/Window;->clearFlags(I)V

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    .line 72
    .local v1, "systemUiVisibility":I
    const/16 v0, 0x1606

    .line 77
    .local v0, "flags":I
    if-eqz p2, :cond_2

    .line 78
    or-int/2addr v1, v0

    .line 82
    :goto_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_1

    .line 80
    :cond_2
    and-int/lit16 v1, v1, -0x1607

    goto :goto_2
.end method


# virtual methods
.method public getVideoLoadingProgressView()Landroid/view/View;
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    return-object v0
.end method

.method public onDestroyContentVideoView()V
    .locals 2

    .prologue
    .line 42
    iget-object v1, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 43
    .local v0, "decor":Landroid/widget/FrameLayout;
    iget-object v1, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 44
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->setSystemUiVisibility(Landroid/view/View;Z)V

    .line 45
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mView:Landroid/view/View;

    .line 46
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;)Z
    .locals 6
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const/4 v5, 0x1

    const/4 v4, -0x1

    .line 29
    iget-object v1, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 30
    .local v0, "decor":Landroid/widget/FrameLayout;
    const/4 v1, 0x0

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x11

    invoke-direct {v2, v4, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, p1, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 35
    invoke-direct {p0, v0, v5}, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->setSystemUiVisibility(Landroid/view/View;Z)V

    .line 36
    iput-object p1, p0, Lorg/chromium/content/browser/ActivityContentVideoViewClient;->mView:Landroid/view/View;

    .line 37
    return v5
.end method
