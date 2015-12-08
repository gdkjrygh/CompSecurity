.class Lnl/xservices/plugins/SocialSharing$2$1$1;
.super Ljava/lang/Object;
.source "SocialSharing.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnl/xservices/plugins/SocialSharing$2$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lnl/xservices/plugins/SocialSharing$2$1;


# direct methods
.method constructor <init>(Lnl/xservices/plugins/SocialSharing$2$1;)V
    .locals 0
    .param p1, "this$2"    # Lnl/xservices/plugins/SocialSharing$2$1;

    .prologue
    .line 243
    iput-object p1, p0, Lnl/xservices/plugins/SocialSharing$2$1$1;->this$2:Lnl/xservices/plugins/SocialSharing$2$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 245
    iget-object v0, p0, Lnl/xservices/plugins/SocialSharing$2$1$1;->this$2:Lnl/xservices/plugins/SocialSharing$2$1;

    iget-object v0, v0, Lnl/xservices/plugins/SocialSharing$2$1;->this$1:Lnl/xservices/plugins/SocialSharing$2;

    iget-object v0, v0, Lnl/xservices/plugins/SocialSharing$2;->this$0:Lnl/xservices/plugins/SocialSharing;

    iget-object v1, p0, Lnl/xservices/plugins/SocialSharing$2$1$1;->this$2:Lnl/xservices/plugins/SocialSharing$2$1;

    iget-object v1, v1, Lnl/xservices/plugins/SocialSharing$2$1;->this$1:Lnl/xservices/plugins/SocialSharing$2;

    iget-object v1, v1, Lnl/xservices/plugins/SocialSharing$2;->val$msg:Ljava/lang/String;

    iget-object v2, p0, Lnl/xservices/plugins/SocialSharing$2$1$1;->this$2:Lnl/xservices/plugins/SocialSharing$2$1;

    iget-object v2, v2, Lnl/xservices/plugins/SocialSharing$2$1;->this$1:Lnl/xservices/plugins/SocialSharing$2;

    iget-object v2, v2, Lnl/xservices/plugins/SocialSharing$2;->this$0:Lnl/xservices/plugins/SocialSharing;

    # getter for: Lnl/xservices/plugins/SocialSharing;->pasteMessage:Ljava/lang/String;
    invoke-static {v2}, Lnl/xservices/plugins/SocialSharing;->access$500(Lnl/xservices/plugins/SocialSharing;)Ljava/lang/String;

    move-result-object v2

    # invokes: Lnl/xservices/plugins/SocialSharing;->showPasteMessage(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0, v1, v2}, Lnl/xservices/plugins/SocialSharing;->access$600(Lnl/xservices/plugins/SocialSharing;Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    return-void
.end method
