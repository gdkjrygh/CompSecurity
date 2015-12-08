.class Lorg/chromium/content/browser/ContentViewRenderView$2;
.super Lorg/chromium/content/browser/ContentReadbackHandler;
.source "ContentViewRenderView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewRenderView;->onNativeLibraryLoaded(Lorg/chromium/ui/base/WindowAndroid;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewRenderView;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentViewRenderView;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewRenderView$2;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    invoke-direct {p0}, Lorg/chromium/content/browser/ContentReadbackHandler;-><init>()V

    return-void
.end method


# virtual methods
.method protected readyForReadback()Z
    .locals 4

    .prologue
    .line 183
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$2;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$2;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    iget-object v0, v0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
