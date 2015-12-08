.class Lorg/xwalk/core/internal/XWalkContent$1;
.super Lorg/chromium/content/browser/ContentViewRenderView;
.source "XWalkContent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkContent;->setNativeContent(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContent;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContent;Landroid/content/Context;Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;)V
    .locals 0
    .param p2, "x0"    # Landroid/content/Context;
    .param p3, "x1"    # Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    .prologue
    .line 134
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContent$1;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    invoke-direct {p0, p2, p3}, Lorg/chromium/content/browser/ContentViewRenderView;-><init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;)V

    return-void
.end method


# virtual methods
.method protected onReadyToRender()V
    .locals 0

    .prologue
    .line 138
    return-void
.end method
