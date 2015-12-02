.class Lcom/facebook/orca/chatheads/bq;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/l;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/bo;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/bo;)V
    .locals 0

    .prologue
    .line 2138
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bq;->a:Lcom/facebook/orca/chatheads/bo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 2141
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bq;->a:Lcom/facebook/orca/chatheads/bo;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/bo;->b(Lcom/facebook/orca/chatheads/bo;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 2142
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bq;->a:Lcom/facebook/orca/chatheads/bo;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/bo;->a(Lcom/facebook/orca/chatheads/bo;)V

    .line 2144
    :cond_0
    return-void
.end method
