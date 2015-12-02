.class Lcom/facebook/orca/server/al;
.super Ljava/lang/Object;
.source "MessagesServiceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/server/aj;


# direct methods
.method constructor <init>(Lcom/facebook/orca/server/aj;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/orca/server/al;->a:Lcom/facebook/orca/server/aj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/orca/server/al;->a:Lcom/facebook/orca/server/aj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/server/aj;->a(Lcom/facebook/orca/server/aj;Z)Z

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/server/al;->a:Lcom/facebook/orca/server/aj;

    invoke-static {v0}, Lcom/facebook/orca/server/aj;->b(Lcom/facebook/orca/server/aj;)V

    .line 77
    return-void
.end method
