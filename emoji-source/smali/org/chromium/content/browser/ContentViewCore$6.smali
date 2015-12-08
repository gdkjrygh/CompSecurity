.class Lorg/chromium/content/browser/ContentViewCore$6;
.super Ljava/lang/Object;
.source "ContentViewCore.java"

# interfaces
.implements Lorg/chromium/content/browser/PopupZoomer$OnTapListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore;->initPopupZoomer(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final mContainerViewAtCreation:Landroid/view/ViewGroup;

.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewCore;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 1

    .prologue
    .line 745
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 748
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mContainerView:Landroid/view/ViewGroup;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$000(Lorg/chromium/content/browser/ContentViewCore;)Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$6;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public onLongPress(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "v"    # Landroid/view/View;
    .param p2, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 761
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mNativeContentViewCore:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1200(Lorg/chromium/content/browser/ContentViewCore;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 762
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mNativeContentViewCore:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1200(Lorg/chromium/content/browser/ContentViewCore;)J

    move-result-wide v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->nativeLongPress(JJFF)V
    invoke-static/range {v1 .. v7}, Lorg/chromium/content/browser/ContentViewCore;->access$1400(Lorg/chromium/content/browser/ContentViewCore;JJFF)V

    .line 764
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onSingleTap(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "v"    # Landroid/view/View;
    .param p2, "e"    # Landroid/view/MotionEvent;

    .prologue
    .line 752
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$6;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    .line 753
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mNativeContentViewCore:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1200(Lorg/chromium/content/browser/ContentViewCore;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 754
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$6;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mNativeContentViewCore:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1200(Lorg/chromium/content/browser/ContentViewCore;)J

    move-result-wide v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->nativeSingleTap(JJFF)V
    invoke-static/range {v1 .. v7}, Lorg/chromium/content/browser/ContentViewCore;->access$1300(Lorg/chromium/content/browser/ContentViewCore;JJFF)V

    .line 756
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
