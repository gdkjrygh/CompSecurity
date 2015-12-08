.class Lcom/facebook/internal/LikeActionController$4$1;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController$4;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/internal/LikeActionController$4;

.field private final synthetic val$broadcastContext:Landroid/content/Context;

.field private final synthetic val$shouldClearDisk:Z


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController$4;ZLandroid/content/Context;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$4$1;->this$1:Lcom/facebook/internal/LikeActionController$4;

    iput-boolean p2, p0, Lcom/facebook/internal/LikeActionController$4$1;->val$shouldClearDisk:Z

    iput-object p3, p0, Lcom/facebook/internal/LikeActionController$4$1;->val$broadcastContext:Landroid/content/Context;

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 301
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController$4$1;->val$shouldClearDisk:Z

    if-eqz v0, :cond_0

    .line 302
    # getter for: Lcom/facebook/internal/LikeActionController;->objectSuffix:I
    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$16()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    rem-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$17(I)V

    .line 303
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$4$1;->val$broadcastContext:Landroid/content/Context;

    const-string v1, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 304
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 305
    const-string v1, "OBJECT_SUFFIX"

    # getter for: Lcom/facebook/internal/LikeActionController;->objectSuffix:I
    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$16()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 306
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 310
    # getter for: Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;
    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$8()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 311
    # getter for: Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;
    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$18()Lcom/facebook/internal/FileLruCache;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/internal/FileLruCache;->clearCache()V

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$4$1;->val$broadcastContext:Landroid/content/Context;

    const/4 v1, 0x0

    const-string v2, "com.facebook.sdk.LikeActionController.DID_RESET"

    # invokes: Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$19(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 315
    invoke-static {v3}, Lcom/facebook/internal/LikeActionController;->access$14(Z)V

    .line 316
    return-void
.end method
