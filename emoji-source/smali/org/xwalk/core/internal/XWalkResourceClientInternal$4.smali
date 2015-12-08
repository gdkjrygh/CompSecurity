.class Lorg/xwalk/core/internal/XWalkResourceClientInternal$4;
.super Ljava/lang/Object;
.source "XWalkResourceClientInternal.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

.field final synthetic val$valueCallback:Landroid/webkit/ValueCallback;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkResourceClientInternal;Landroid/webkit/ValueCallback;)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkResourceClientInternal$4;->this$0:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkResourceClientInternal$4;->val$valueCallback:Landroid/webkit/ValueCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 244
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientInternal$4;->val$valueCallback:Landroid/webkit/ValueCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 245
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 246
    return-void
.end method
