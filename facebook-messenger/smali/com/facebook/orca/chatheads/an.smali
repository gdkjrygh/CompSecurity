.class Lcom/facebook/orca/chatheads/an;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 758
    iput-object p1, p0, Lcom/facebook/orca/chatheads/an;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 761
    iget-object v0, p0, Lcom/facebook/orca/chatheads/an;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->r(Lcom/facebook/orca/chatheads/al;)V

    .line 762
    return-void
.end method
