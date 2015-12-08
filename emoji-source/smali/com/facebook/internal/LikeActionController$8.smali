.class Lcom/facebook/internal/LikeActionController$8;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController;->refreshStatusAsync()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/LikeActionController;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController;)V
    .locals 0
    .param p1, "this$0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 885
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 5

    .prologue
    .line 888
    new-instance v1, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 889
    # getter for: Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 890
    .local v1, "objectLikesRequest":Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;
    new-instance v0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    .line 891
    # getter for: Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 893
    .local v0, "engagementRequest":Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;
    new-instance v2, Lcom/facebook/RequestBatch;

    invoke-direct {v2}, Lcom/facebook/RequestBatch;-><init>()V

    .line 894
    .local v2, "requestBatch":Lcom/facebook/RequestBatch;
    invoke-virtual {v1, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 895
    invoke-virtual {v0, v2}, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 897
    new-instance v3, Lcom/facebook/internal/LikeActionController$8$1;

    invoke-direct {v3, p0, v1, v0}, Lcom/facebook/internal/LikeActionController$8$1;-><init>(Lcom/facebook/internal/LikeActionController$8;Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;)V

    invoke-virtual {v2, v3}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V

    .line 920
    invoke-virtual {v2}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 921
    return-void
.end method
