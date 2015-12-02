.class Lcom/facebook/common/v/h;
.super Lcom/facebook/common/v/j;
.source "UserInteractionController.java"


# instance fields
.field final synthetic a:Ljava/util/concurrent/Semaphore;

.field final synthetic b:Lcom/facebook/common/v/f;


# direct methods
.method constructor <init>(Lcom/facebook/common/v/f;Ljava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/facebook/common/v/h;->b:Lcom/facebook/common/v/f;

    iput-object p2, p0, Lcom/facebook/common/v/h;->a:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Lcom/facebook/common/v/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    .line 179
    if-nez p1, :cond_0

    .line 180
    iget-object v0, p0, Lcom/facebook/common/v/h;->a:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 182
    :cond_0
    return-void
.end method
