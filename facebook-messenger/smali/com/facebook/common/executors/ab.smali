.class Lcom/facebook/common/executors/ab;
.super Ljava/lang/Object;
.source "WakingExecutorService.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field private final a:Lcom/facebook/common/executors/z;


# direct methods
.method public constructor <init>(Lcom/facebook/common/executors/z;)V
    .locals 0

    .prologue
    .line 368
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 369
    iput-object p1, p0, Lcom/facebook/common/executors/ab;->a:Lcom/facebook/common/executors/z;

    .line 370
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, Lcom/facebook/common/executors/ab;->a:Lcom/facebook/common/executors/z;

    invoke-static {v0}, Lcom/facebook/common/executors/z;->a(Lcom/facebook/common/executors/z;)V

    .line 375
    return-void
.end method
