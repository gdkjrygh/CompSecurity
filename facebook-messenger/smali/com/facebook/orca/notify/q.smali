.class Lcom/facebook/orca/notify/q;
.super Ljava/lang/Object;
.source "InAppMessagingNotificationHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/ap;

.field final synthetic b:Lcom/facebook/orca/notify/p;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/p;Lcom/facebook/orca/notify/ap;)V
    .locals 0

    .prologue
    .line 416
    iput-object p1, p0, Lcom/facebook/orca/notify/q;->b:Lcom/facebook/orca/notify/p;

    iput-object p2, p0, Lcom/facebook/orca/notify/q;->a:Lcom/facebook/orca/notify/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 419
    iget-object v0, p0, Lcom/facebook/orca/notify/q;->b:Lcom/facebook/orca/notify/p;

    iget-object v0, v0, Lcom/facebook/orca/notify/p;->a:Lcom/facebook/orca/notify/j;

    iget-object v1, p0, Lcom/facebook/orca/notify/q;->a:Lcom/facebook/orca/notify/ap;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/j;->b(Lcom/facebook/orca/notify/ap;)V

    .line 420
    return-void
.end method
