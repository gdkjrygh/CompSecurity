.class Lcom/facebook/orca/chatheads/b/l;
.super Ljava/lang/Object;
.source "ChatHeadNuxController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Point;

.field final synthetic b:Lcom/facebook/orca/chatheads/b/e;

.field final synthetic c:Lcom/facebook/orca/chatheads/b/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/b/k;Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/l;->c:Lcom/facebook/orca/chatheads/b/k;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/b/l;->a:Landroid/graphics/Point;

    iput-object p3, p0, Lcom/facebook/orca/chatheads/b/l;->b:Lcom/facebook/orca/chatheads/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/l;->c:Lcom/facebook/orca/chatheads/b/k;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/l;->a:Landroid/graphics/Point;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/b/l;->b:Lcom/facebook/orca/chatheads/b/e;

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/b/k;->a(Lcom/facebook/orca/chatheads/b/k;Landroid/graphics/Point;Lcom/facebook/orca/chatheads/b/e;)V

    .line 101
    return-void
.end method
