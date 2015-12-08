.class Lorg/chromium/content/browser/ContentViewCore$9;
.super Ljava/lang/Object;
.source "ContentViewCore.java"

# interfaces
.implements Lorg/chromium/content/browser/input/PopupTouchHandleDrawable$PopupTouchHandleDrawableDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore;->createPopupTouchHandleDrawable()Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;
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
    .line 2240
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$9;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getParent()Landroid/view/View;
    .locals 1

    .prologue
    .line 2243
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$9;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContainerView()Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method public getParentPositionObserver()Lorg/chromium/content/browser/PositionObserver;
    .locals 1

    .prologue
    .line 2248
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$9;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mPositionObserver:Lorg/chromium/content/browser/PositionObserver;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$2000(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/PositionObserver;

    move-result-object v0

    return-object v0
.end method

.method public isScrollInProgress()Z
    .locals 1

    .prologue
    .line 2259
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$9;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->isScrollInProgress()Z

    move-result v0

    return v0
.end method

.method public onTouchHandleEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 2253
    const/4 v0, 0x1

    .line 2254
    .local v0, "isTouchHandleEvent":Z
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$9;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    const/4 v2, 0x1

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->onTouchEventImpl(Landroid/view/MotionEvent;Z)Z
    invoke-static {v1, p1, v2}, Lorg/chromium/content/browser/ContentViewCore;->access$2100(Lorg/chromium/content/browser/ContentViewCore;Landroid/view/MotionEvent;Z)Z

    move-result v1

    return v1
.end method
