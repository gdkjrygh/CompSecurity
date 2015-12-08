.class final Lcom/facebook/share/internal/LikeActionController$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic val$controllerToRefresh:Lcom/facebook/share/internal/LikeActionController;


# direct methods
.method constructor <init>(Lcom/facebook/share/internal/LikeActionController;)V
    .locals 0

    .prologue
    .line 282
    iput-object p1, p0, Lcom/facebook/share/internal/LikeActionController$2;->val$controllerToRefresh:Lcom/facebook/share/internal/LikeActionController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$2;->val$controllerToRefresh:Lcom/facebook/share/internal/LikeActionController;

    # invokes: Lcom/facebook/share/internal/LikeActionController;->refreshStatusAsync()V
    invoke-static {v0}, Lcom/facebook/share/internal/LikeActionController;->access$200(Lcom/facebook/share/internal/LikeActionController;)V

    .line 286
    return-void
.end method
