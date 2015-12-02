.class Lcom/facebook/orca/chatheads/au;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/at;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/at;)V
    .locals 0

    .prologue
    .line 1196
    iput-object p1, p0, Lcom/facebook/orca/chatheads/au;->a:Lcom/facebook/orca/chatheads/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1199
    iget-object v0, p0, Lcom/facebook/orca/chatheads/au;->a:Lcom/facebook/orca/chatheads/at;

    iget-object v0, v0, Lcom/facebook/orca/chatheads/at;->a:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 1200
    return-void
.end method
