.class Lorg/chromium/content/browser/ContentViewCore$4;
.super Lorg/chromium/content/browser/WebContentsObserverAndroid;
.source "ContentViewCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore;->initialize(Landroid/view/ViewGroup;Lorg/chromium/content/browser/ContentViewCore$InternalAccessDelegate;JLorg/chromium/ui/base/WindowAndroid;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewCore;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;Lorg/chromium/content_public/browser/WebContents;)V
    .locals 0
    .param p2, "x0"    # Lorg/chromium/content_public/browser/WebContents;

    .prologue
    .line 631
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$4;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-direct {p0, p2}, Lorg/chromium/content/browser/WebContentsObserverAndroid;-><init>(Lorg/chromium/content_public/browser/WebContents;)V

    return-void
.end method


# virtual methods
.method public didNavigateMainFrame(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "baseUrl"    # Ljava/lang/String;
    .param p3, "isNavigationToDifferentPage"    # Z
    .param p4, "isFragmentNavigation"    # Z

    .prologue
    .line 635
    if-nez p3, :cond_0

    .line 639
    :goto_0
    return-void

    .line 636
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$4;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->hidePopupsAndClearSelection()V
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$800(Lorg/chromium/content/browser/ContentViewCore;)V

    .line 637
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$4;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->resetScrollInProgress()V
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$900(Lorg/chromium/content/browser/ContentViewCore;)V

    .line 638
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$4;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->resetGestureDetection()V
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1000(Lorg/chromium/content/browser/ContentViewCore;)V

    goto :goto_0
.end method

.method public renderProcessGone(Z)V
    .locals 1
    .param p1, "wasOomProtected"    # Z

    .prologue
    .line 643
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$4;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->hidePopupsAndClearSelection()V
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$800(Lorg/chromium/content/browser/ContentViewCore;)V

    .line 644
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$4;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->resetScrollInProgress()V
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$900(Lorg/chromium/content/browser/ContentViewCore;)V

    .line 647
    return-void
.end method
