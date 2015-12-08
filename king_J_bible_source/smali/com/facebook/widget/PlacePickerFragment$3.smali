.class Lcom/facebook/widget/PlacePickerFragment$3;
.super Ljava/lang/Object;
.source "PlacePickerFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/PlacePickerFragment;->onSearchTextTimerTriggered()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/PlacePickerFragment;


# direct methods
.method constructor <init>(Lcom/facebook/widget/PlacePickerFragment;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    .line 444
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 447
    const/4 v1, 0x0

    .line 449
    .local v1, "error":Lcom/facebook/FacebookException;
    :try_start_0
    iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/facebook/widget/PlacePickerFragment;->loadData(Z)V
    :try_end_0
    .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 455
    if-eqz v1, :cond_0

    .line 456
    iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-virtual {v5}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;

    move-result-object v4

    .line 457
    .local v4, "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    if-eqz v4, :cond_5

    .line 458
    iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-interface {v4, v5, v1}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V

    .line 464
    .end local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    :cond_0
    :goto_0
    return-void

    .line 450
    :catch_0
    move-exception v3

    .line 451
    .local v3, "fe":Lcom/facebook/FacebookException;
    move-object v1, v3

    .line 455
    if-eqz v1, :cond_0

    .line 456
    iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-virtual {v5}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;

    move-result-object v4

    .line 457
    .restart local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    if-eqz v4, :cond_1

    .line 458
    iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-interface {v4, v5, v1}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V

    goto :goto_0

    .line 460
    :cond_1
    sget-object v5, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    const-string v6, "PlacePickerFragment"

    const-string v7, "Error loading data : %s"

    new-array v8, v9, [Ljava/lang/Object;

    aput-object v1, v8, v10

    invoke-static {v5, v6, v7, v8}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 452
    .end local v3    # "fe":Lcom/facebook/FacebookException;
    .end local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    :catch_1
    move-exception v0

    .line 453
    .local v0, "e":Ljava/lang/Exception;
    :try_start_1
    new-instance v2, Lcom/facebook/FacebookException;

    invoke-direct {v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 455
    .end local v1    # "error":Lcom/facebook/FacebookException;
    .local v2, "error":Lcom/facebook/FacebookException;
    if-eqz v2, :cond_6

    .line 456
    iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-virtual {v5}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;

    move-result-object v4

    .line 457
    .restart local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    if-eqz v4, :cond_2

    .line 458
    iget-object v5, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-interface {v4, v5, v2}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V

    move-object v1, v2

    .line 459
    .end local v2    # "error":Lcom/facebook/FacebookException;
    .restart local v1    # "error":Lcom/facebook/FacebookException;
    goto :goto_0

    .line 460
    .end local v1    # "error":Lcom/facebook/FacebookException;
    .restart local v2    # "error":Lcom/facebook/FacebookException;
    :cond_2
    sget-object v5, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    const-string v6, "PlacePickerFragment"

    const-string v7, "Error loading data : %s"

    new-array v8, v9, [Ljava/lang/Object;

    aput-object v2, v8, v10

    invoke-static {v5, v6, v7, v8}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v1, v2

    .end local v2    # "error":Lcom/facebook/FacebookException;
    .restart local v1    # "error":Lcom/facebook/FacebookException;
    goto :goto_0

    .line 454
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    :catchall_0
    move-exception v5

    .line 455
    if-eqz v1, :cond_3

    .line 456
    iget-object v6, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-virtual {v6}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;

    move-result-object v4

    .line 457
    .restart local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    if-eqz v4, :cond_4

    .line 458
    iget-object v6, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;

    invoke-interface {v4, v6, v1}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V

    .line 463
    .end local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    :cond_3
    :goto_1
    throw v5

    .line 460
    .restart local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    :cond_4
    sget-object v6, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    const-string v7, "PlacePickerFragment"

    const-string v8, "Error loading data : %s"

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v1, v9, v10

    invoke-static {v6, v7, v8, v9}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    sget-object v5, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    const-string v6, "PlacePickerFragment"

    const-string v7, "Error loading data : %s"

    new-array v8, v9, [Ljava/lang/Object;

    aput-object v1, v8, v10

    invoke-static {v5, v6, v7, v8}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .end local v1    # "error":Lcom/facebook/FacebookException;
    .end local v4    # "onErrorListener":Lcom/facebook/widget/PickerFragment$OnErrorListener;, "Lcom/facebook/widget/PickerFragment$OnErrorListener;"
    .restart local v0    # "e":Ljava/lang/Exception;
    .restart local v2    # "error":Lcom/facebook/FacebookException;
    :cond_6
    move-object v1, v2

    .end local v2    # "error":Lcom/facebook/FacebookException;
    .restart local v1    # "error":Lcom/facebook/FacebookException;
    goto :goto_0
.end method
