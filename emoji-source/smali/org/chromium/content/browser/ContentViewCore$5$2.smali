.class Lorg/chromium/content/browser/ContentViewCore$5$2;
.super Ljava/lang/Object;
.source "ContentViewCore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore$5;->onPopupZoomerHidden(Lorg/chromium/content/browser/PopupZoomer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic this$1:Lorg/chromium/content/browser/ContentViewCore$5;

.field final synthetic val$zoomer:Lorg/chromium/content/browser/PopupZoomer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 730
    const-class v0, Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ContentViewCore$5$2;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore$5;Lorg/chromium/content/browser/PopupZoomer;)V
    .locals 0

    .prologue
    .line 730
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$5$2;->this$1:Lorg/chromium/content/browser/ContentViewCore$5;

    iput-object p2, p0, Lorg/chromium/content/browser/ContentViewCore$5$2;->val$zoomer:Lorg/chromium/content/browser/PopupZoomer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 733
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$5$2;->this$1:Lorg/chromium/content/browser/ContentViewCore$5;

    # getter for: Lorg/chromium/content/browser/ContentViewCore$5;->mContainerViewAtCreation:Landroid/view/ViewGroup;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore$5;->access$1100(Lorg/chromium/content/browser/ContentViewCore$5;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$5$2;->val$zoomer:Lorg/chromium/content/browser/PopupZoomer;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 734
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$5$2;->this$1:Lorg/chromium/content/browser/ContentViewCore$5;

    # getter for: Lorg/chromium/content/browser/ContentViewCore$5;->mContainerViewAtCreation:Landroid/view/ViewGroup;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore$5;->access$1100(Lorg/chromium/content/browser/ContentViewCore$5;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$5$2;->val$zoomer:Lorg/chromium/content/browser/PopupZoomer;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 735
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$5$2;->this$1:Lorg/chromium/content/browser/ContentViewCore$5;

    # getter for: Lorg/chromium/content/browser/ContentViewCore$5;->mContainerViewAtCreation:Landroid/view/ViewGroup;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore$5;->access$1100(Lorg/chromium/content/browser/ContentViewCore$5;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    .line 739
    :cond_0
    return-void

    .line 737
    :cond_1
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewCore$5$2;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "PopupZoomer should never be hidden without being shown"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
