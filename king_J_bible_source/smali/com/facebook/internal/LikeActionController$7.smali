.class Lcom/facebook/internal/LikeActionController$7;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/RequestBatch$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController;->publishUnlikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/LikeActionController;

.field private final synthetic val$activity:Landroid/app/Activity;

.field private final synthetic val$analyticsParameters:Landroid/os/Bundle;

.field private final synthetic val$unlikeRequest:Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;

    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$7;->val$unlikeRequest:Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;

    iput-object p3, p0, Lcom/facebook/internal/LikeActionController$7;->val$activity:Landroid/app/Activity;

    iput-object p4, p0, Lcom/facebook/internal/LikeActionController$7;->val$analyticsParameters:Landroid/os/Bundle;

    .line 858
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchCompleted(Lcom/facebook/RequestBatch;)V
    .locals 4
    .param p1, "batch"    # Lcom/facebook/RequestBatch;

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 861
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$27(Lcom/facebook/internal/LikeActionController;Z)V

    .line 863
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->val$unlikeRequest:Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    if-eqz v0, :cond_0

    .line 868
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$7;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$7;->val$analyticsParameters:Landroid/os/Bundle;

    const/4 v3, 0x1

    # invokes: Lcom/facebook/internal/LikeActionController;->fallbackToDialog(Landroid/app/Activity;Landroid/os/Bundle;Z)V
    invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/LikeActionController;->access$28(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;Z)V

    .line 877
    :goto_0
    return-void

    .line 870
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0, v3}, Lcom/facebook/internal/LikeActionController;->access$29(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 871
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$30(Lcom/facebook/internal/LikeActionController;Z)V

    .line 873
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;

    # getter for: Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$21(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;

    move-result-object v0

    const-string v1, "fb_like_control_did_unlike"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$7;->val$analyticsParameters:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v3, v2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 875
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$7;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$7;->val$analyticsParameters:Landroid/os/Bundle;

    # invokes: Lcom/facebook/internal/LikeActionController;->toggleAgainIfNeeded(Landroid/app/Activity;Landroid/os/Bundle;)V
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$31(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0
.end method
