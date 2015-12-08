.class Lorg/xwalk/core/internal/XWalkUIClientInternal$5;
.super Ljava/lang/Object;
.source "XWalkUIClientInternal.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJsConfirm(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z
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
    .line 393
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkUIClientInternal$5;->this$0:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkUIClientInternal$5;->val$fResult:Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 396
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientInternal$5;->val$fResult:Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;

    invoke-interface {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;->confirm()V

    .line 397
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 398
    return-void
.end method
