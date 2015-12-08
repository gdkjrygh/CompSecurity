.class Lorg/xwalk/core/internal/XWalkClient$1;
.super Ljava/lang/Object;
.source "XWalkClient.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkClient;->onReceivedHttpAuthRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkHttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkClient;

.field final synthetic val$haHandler:Lorg/xwalk/core/internal/XWalkHttpAuthHandler;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkClient;Lorg/xwalk/core/internal/XWalkHttpAuthHandler;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkClient$1;->this$0:Lorg/xwalk/core/internal/XWalkClient;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkClient$1;->val$haHandler:Lorg/xwalk/core/internal/XWalkHttpAuthHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 180
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkClient$1;->val$haHandler:Lorg/xwalk/core/internal/XWalkHttpAuthHandler;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->cancel()V

    .line 181
    return-void
.end method
