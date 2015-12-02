.class Lcom/facebook/orca/chatheads/t;
.super Ljava/lang/Object;
.source "ChatHeadService.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/d/e;

.field final synthetic b:Lcom/facebook/orca/chatheads/ChatHeadService;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ChatHeadService;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 660
    iput-object p1, p0, Lcom/facebook/orca/chatheads/t;->b:Lcom/facebook/orca/chatheads/ChatHeadService;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/t;->a:Lcom/facebook/common/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 663
    iget-object v0, p0, Lcom/facebook/orca/chatheads/t;->a:Lcom/facebook/common/d/e;

    invoke-interface {v0}, Lcom/facebook/common/d/e;->a()V

    .line 664
    return-void
.end method
