.class Lcom/facebook/internal/LikeActionController$6$1;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/RequestBatch$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController$6;->onComplete()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/internal/LikeActionController$6;

.field final synthetic val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController$6;Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;)V
    .locals 0
    .param p1, "this$1"    # Lcom/facebook/internal/LikeActionController$6;

    .prologue
    .line 801
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchCompleted(Lcom/facebook/RequestBatch;)V
    .locals 7
    .param p1, "batch"    # Lcom/facebook/RequestBatch;

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 804
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    # setter for: Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z
    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2002(Lcom/facebook/internal/LikeActionController;Z)Z

    .line 806
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    if-eqz v0, :cond_0

    .line 811
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 813
    # getter for: Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    invoke-static {v2}, Lcom/facebook/internal/LikeActionController;->access$800(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v3, v3, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 814
    # getter for: Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    invoke-static {v3}, Lcom/facebook/internal/LikeActionController;->access$900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v4, v4, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 815
    # getter for: Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/internal/LikeActionController;->access$1000(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v5, v5, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 816
    # getter for: Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    invoke-static {v5}, Lcom/facebook/internal/LikeActionController;->access$1100(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v6, v6, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 817
    # getter for: Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    invoke-static {v6}, Lcom/facebook/internal/LikeActionController;->access$1200(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v6

    .line 811
    # invokes: Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    invoke-static/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->access$1400(Lcom/facebook/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 819
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$6;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    # invokes: Lcom/facebook/internal/LikeActionController;->presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$2100(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 828
    :goto_0
    return-void

    .line 821
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;->unlikeToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    # setter for: Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$1202(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;

    .line 822
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    const/4 v1, 0x1

    # setter for: Lcom/facebook/internal/LikeActionController;->isObjectLikedOnServer:Z
    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2202(Lcom/facebook/internal/LikeActionController;Z)Z

    .line 824
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    # getter for: Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1300(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;

    move-result-object v0

    const-string v1, "fb_like_control_did_like"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v3, v2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 826
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$6;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    # invokes: Lcom/facebook/internal/LikeActionController;->toggleAgainIfNeeded(Landroid/app/Activity;Landroid/os/Bundle;)V
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$2300(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0
.end method
