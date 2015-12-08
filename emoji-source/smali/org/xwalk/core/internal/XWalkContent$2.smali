.class Lorg/xwalk/core/internal/XWalkContent$2;
.super Ljava/lang/Object;
.source "XWalkContent.java"

# interfaces
.implements Lorg/chromium/content_public/browser/JavaScriptCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkContent;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContent;

.field final synthetic val$fCallback:Landroid/webkit/ValueCallback;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContent;Landroid/webkit/ValueCallback;)V
    .locals 0

    .prologue
    .line 282
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContent$2;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkContent$2;->val$fCallback:Landroid/webkit/ValueCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleJavaScriptResult(Ljava/lang/String;)V
    .locals 1
    .param p1, "jsonResult"    # Ljava/lang/String;

    .prologue
    .line 285
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$2;->val$fCallback:Landroid/webkit/ValueCallback;

    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 286
    return-void
.end method
