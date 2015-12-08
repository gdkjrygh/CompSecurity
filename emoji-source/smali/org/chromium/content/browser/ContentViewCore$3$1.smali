.class Lorg/chromium/content/browser/ContentViewCore$3$1;
.super Landroid/os/ResultReceiver;
.source "ContentViewCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore$3;->getNewShowKeyboardReceiver()Landroid/os/ResultReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/chromium/content/browser/ContentViewCore$3;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore$3;Landroid/os/Handler;)V
    .locals 0
    .param p2, "x0"    # Landroid/os/Handler;

    .prologue
    .line 563
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$3$1;->this$1:Lorg/chromium/content/browser/ContentViewCore$3;

    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onReceiveResult(ILandroid/os/Bundle;)V
    .locals 3
    .param p1, "resultCode"    # I
    .param p2, "resultData"    # Landroid/os/Bundle;

    .prologue
    const/4 v2, 0x2

    .line 566
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3$1;->this$1:Lorg/chromium/content/browser/ContentViewCore$3;

    iget-object v0, v0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContentViewClient()Lorg/chromium/content/browser/ContentViewClient;

    move-result-object v1

    if-eq p1, v2, :cond_0

    if-nez p1, :cond_2

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lorg/chromium/content/browser/ContentViewClient;->onImeStateChangeRequested(Z)V

    .line 569
    if-ne p1, v2, :cond_3

    .line 575
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3$1;->this$1:Lorg/chromium/content/browser/ContentViewCore$3;

    iget-object v0, v0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContainerView()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$3$1;->this$1:Lorg/chromium/content/browser/ContentViewCore$3;

    iget-object v1, v1, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mFocusPreOSKViewportRect:Landroid/graphics/Rect;
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewCore;->access$600(Lorg/chromium/content/browser/ContentViewCore;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 582
    :cond_1
    :goto_1
    return-void

    .line 566
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 577
    :cond_3
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3$1;->this$1:Lorg/chromium/content/browser/ContentViewCore$3;

    iget-object v0, v0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 580
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$3$1;->this$1:Lorg/chromium/content/browser/ContentViewCore$3;

    iget-object v0, v0, Lorg/chromium/content/browser/ContentViewCore$3;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->scrollFocusedEditableNodeIntoView()V
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$700(Lorg/chromium/content/browser/ContentViewCore;)V

    goto :goto_1
.end method
