.class Lcom/facebook/orca/notify/bg;
.super Ljava/lang/Object;
.source "OrcaNotificationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/ao;

.field final synthetic b:Lcom/facebook/orca/notify/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/ao;)V
    .locals 0

    .prologue
    .line 221
    iput-object p1, p0, Lcom/facebook/orca/notify/bg;->b:Lcom/facebook/orca/notify/av;

    iput-object p2, p0, Lcom/facebook/orca/notify/bg;->a:Lcom/facebook/orca/notify/ao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/orca/notify/bg;->b:Lcom/facebook/orca/notify/av;

    iget-object v1, p0, Lcom/facebook/orca/notify/bg;->a:Lcom/facebook/orca/notify/ao;

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/ao;)V

    .line 225
    return-void
.end method
