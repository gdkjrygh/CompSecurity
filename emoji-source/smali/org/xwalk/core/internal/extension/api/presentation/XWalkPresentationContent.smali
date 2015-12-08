.class public Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;
.super Ljava/lang/Object;
.source "XWalkPresentationContent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;
    }
.end annotation


# instance fields
.field public final INVALID_PRESENTATION_ID:I

.field private mActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

.field private mContext:Landroid/content/Context;

.field private mDelegate:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;

.field private mPresentationId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p3, "delegate"    # Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;",
            "Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "activity":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
    const/4 v0, -0x1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->INVALID_PRESENTATION_ID:I

    .line 24
    iput v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mPresentationId:I

    .line 33
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContext:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mActivity:Ljava/lang/ref/WeakReference;

    .line 35
    iput-object p3, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mDelegate:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;

    .line 36
    return-void
.end method

.method static synthetic access$002(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;I)I
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;
    .param p1, "x1"    # I

    .prologue
    .line 21
    iput p1, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mPresentationId:I

    return p1
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    .prologue
    .line 21
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->onContentClosed()V

    return-void
.end method

.method static synthetic access$200(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)Lorg/xwalk/core/internal/XWalkViewInternal;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    .prologue
    .line 21
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    return-object v0
.end method

.method static synthetic access$300(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;

    .prologue
    .line 21
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->onContentLoaded()V

    return-void
.end method

.method private onContentClosed()V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mDelegate:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mDelegate:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;

    invoke-interface {v0, p0}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;->onContentClosed(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)V

    .line 97
    :cond_0
    return-void
.end method

.method private onContentLoaded()V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mDelegate:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mDelegate:Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;

    invoke-interface {v0, p0}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$PresentationDelegate;->onContentLoaded(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;)V

    .line 93
    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->onDestroy()V

    .line 77
    const/4 v0, -0x1

    iput v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mPresentationId:I

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 79
    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    return-object v0
.end method

.method public getPresentationId()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mPresentationId:I

    return v0
.end method

.method public load(Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 39
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 40
    .local v0, "activity":Landroid/app/Activity;
    if-nez v0, :cond_0

    .line 65
    :goto_0
    return-void

    .line 42
    :cond_0
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    if-nez v2, :cond_1

    .line 43
    new-instance v2, Lorg/xwalk/core/internal/XWalkViewInternal;

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContext:Landroid/content/Context;

    invoke-direct {v2, v3, v0}, Lorg/xwalk/core/internal/XWalkViewInternal;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    iput-object v2, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 44
    new-instance v1, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;

    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-direct {v1, p0, v2}, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent$1;-><init>(Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 62
    .local v1, "xWalkUIClient":Lorg/xwalk/core/internal/XWalkUIClientInternal;
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v2, v1}, Lorg/xwalk/core/internal/XWalkViewInternal;->setUIClient(Lorg/xwalk/core/internal/XWalkUIClientInternal;)V

    .line 64
    .end local v1    # "xWalkUIClient":Lorg/xwalk/core/internal/XWalkUIClientInternal;
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3}, Lorg/xwalk/core/internal/XWalkViewInternal;->load(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->pauseTimers()V

    .line 83
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->onHide()V

    .line 84
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->resumeTimers()V

    .line 88
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/XWalkPresentationContent;->mContentView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->onShow()V

    .line 89
    return-void
.end method
