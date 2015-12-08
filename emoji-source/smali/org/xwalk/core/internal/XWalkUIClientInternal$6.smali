.class Lorg/xwalk/core/internal/XWalkUIClientInternal$6;
.super Ljava/lang/Object;
.source "XWalkUIClientInternal.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJsPrompt(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkUIClientInternal;

.field final synthetic val$fResult:Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkUIClientInternal;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)V
    .locals 0

    .prologue
    .line 442
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkUIClientInternal$6;->this$0:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkUIClientInternal$6;->val$fResult:Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 445
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientInternal$6;->val$fResult:Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;

    invoke-interface {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;->cancel()V

    .line 446
    return-void
.end method
