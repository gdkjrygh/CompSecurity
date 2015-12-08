.class Lorg/chromium/content/browser/BrowserStartupController$1;
.super Ljava/lang/Object;
.source "BrowserStartupController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/BrowserStartupController;->enqueueCallbackExecution(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/BrowserStartupController;

.field final synthetic val$alreadyStarted:Z

.field final synthetic val$startupFailure:I


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/BrowserStartupController;IZ)V
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lorg/chromium/content/browser/BrowserStartupController$1;->this$0:Lorg/chromium/content/browser/BrowserStartupController;

    iput p2, p0, Lorg/chromium/content/browser/BrowserStartupController$1;->val$startupFailure:I

    iput-boolean p3, p0, Lorg/chromium/content/browser/BrowserStartupController$1;->val$alreadyStarted:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 230
    iget-object v0, p0, Lorg/chromium/content/browser/BrowserStartupController$1;->this$0:Lorg/chromium/content/browser/BrowserStartupController;

    iget v1, p0, Lorg/chromium/content/browser/BrowserStartupController$1;->val$startupFailure:I

    iget-boolean v2, p0, Lorg/chromium/content/browser/BrowserStartupController$1;->val$alreadyStarted:Z

    # invokes: Lorg/chromium/content/browser/BrowserStartupController;->executeEnqueuedCallbacks(IZ)V
    invoke-static {v0, v1, v2}, Lorg/chromium/content/browser/BrowserStartupController;->access$000(Lorg/chromium/content/browser/BrowserStartupController;IZ)V

    .line 231
    return-void
.end method
