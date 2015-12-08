.class Lorg/xwalk/core/internal/XWalkResourceClientInternal$1;
.super Ljava/lang/Object;
.source "XWalkResourceClientInternal.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewInternal;ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkResourceClientInternal;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkResourceClientInternal;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkResourceClientInternal$1;->this$0:Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 197
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 198
    return-void
.end method
