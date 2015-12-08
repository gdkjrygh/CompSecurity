.class Lorg/chromium/content/browser/ContentViewCore$3;
.super Ljava/lang/Object;
.source "ContentViewCore.java"

# interfaces
.implements Lorg/chromium/content/browser/input/ImeAdapter$ImeAdapterDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore;->createImeAdapter(Landroid/content/Context;)Lorg/chromium/content/browser/input/ImeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewCore;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 0

    .prologue
    .line 543
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAttachedView()Landroid/view/View;
    .locals 1

    .prologue
    .line 558
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mContainerView:Landroid/view/ViewGroup;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$000(Lorg/chromium/content/browser/ContentViewCore;)Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method public getNewShowKeyboardReceiver()Landroid/os/ResultReceiver;
    .locals 2

    .prologue
    .line 563
    new-instance v0, Lorg/chromium/content/browser/ContentViewCore$3$1;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, p0, v1}, Lorg/chromium/content/browser/ContentViewCore$3$1;-><init>(Lorg/chromium/content/browser/ContentViewCore$3;Landroid/os/Handler;)V

    return-object v0
.end method

.method public onDismissInput()V
    .locals 2

    .prologue
    .line 553
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContentViewClient()Lorg/chromium/content/browser/ContentViewClient;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentViewClient;->onImeStateChangeRequested(Z)V

    .line 554
    return-void
.end method

.method public onImeEvent()V
    .locals 2

    .prologue
    .line 546
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mPopupZoomer:Lorg/chromium/content/browser/PopupZoomer;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$300(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/PopupZoomer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/PopupZoomer;->hide(Z)V

    .line 547
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContentViewClient()Lorg/chromium/content/browser/ContentViewClient;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewClient;->onImeEvent()V

    .line 548
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mFocusedNodeEditable:Z
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$400(Lorg/chromium/content/browser/ContentViewCore;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->hideTextHandles()V
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$500(Lorg/chromium/content/browser/ContentViewCore;)V

    .line 549
    :cond_0
    return-void
.end method
