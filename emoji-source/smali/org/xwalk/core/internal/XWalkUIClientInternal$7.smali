.class Lorg/xwalk/core/internal/XWalkUIClientInternal$7;
.super Ljava/lang/Object;
.source "XWalkUIClientInternal.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkUIClientInternal;)V
    .locals 0

    .prologue
    .line 435
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkUIClientInternal$7;->this$0:Lorg/xwalk/core/internal/XWalkUIClientInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 439
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 440
    return-void
.end method
