.class Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/LikeActionController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CreateLikeActionControllerWorkItem"
.end annotation


# instance fields
.field private callback:Lcom/facebook/internal/LikeActionController$CreationCallback;

.field private context:Landroid/content/Context;

.field private objectId:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "objectId"    # Ljava/lang/String;
    .param p3, "callback"    # Lcom/facebook/internal/LikeActionController$CreationCallback;

    .prologue
    .line 1441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1442
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;->context:Landroid/content/Context;

    .line 1443
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;->objectId:Ljava/lang/String;

    .line 1444
    iput-object p3, p0, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;->callback:Lcom/facebook/internal/LikeActionController$CreationCallback;

    .line 1445
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1449
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;->objectId:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;->callback:Lcom/facebook/internal/LikeActionController$CreationCallback;

    # invokes: Lcom/facebook/internal/LikeActionController;->createControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$3000(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V

    .line 1450
    return-void
.end method
