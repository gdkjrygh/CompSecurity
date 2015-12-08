.class Lorg/xwalk/core/internal/XWalkContentVideoViewClient;
.super Ljava/lang/Object;
.source "XWalkContentVideoViewClient.java"

# interfaces
.implements Lorg/chromium/content/browser/ContentVideoViewClient;


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

.field private mView:Lorg/xwalk/core/internal/XWalkViewInternal;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClient;Landroid/app/Activity;Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 0
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkContentsClient;
    .param p2, "activity"    # Landroid/app/Activity;
    .param p3, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    .line 24
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;->mActivity:Landroid/app/Activity;

    .line 25
    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 26
    return-void
.end method


# virtual methods
.method public getVideoLoadingProgressView()Landroid/view/View;
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    return-object v0
.end method

.method public onDestroyContentVideoView()V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkViewInternal;->setOverlayVideoMode(Z)V

    .line 43
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkContentsClient;->onHideCustomView()V

    .line 44
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;)Z
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x1

    .line 30
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v1, v2}, Lorg/xwalk/core/internal/XWalkViewInternal;->setOverlayVideoMode(Z)V

    .line 31
    new-instance v0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient$1;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkContentVideoViewClient$1;-><init>(Lorg/xwalk/core/internal/XWalkContentVideoViewClient;)V

    .line 36
    .local v0, "cb":Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentVideoViewClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    invoke-virtual {v1, p1, v0}, Lorg/xwalk/core/internal/XWalkContentsClient;->onShowCustomView(Landroid/view/View;Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V

    .line 37
    return v2
.end method
