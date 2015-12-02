.class Lcom/facebook/orca/notify/bf;
.super Ljava/lang/Object;
.source "OrcaNotificationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/bi;

.field final synthetic b:Lcom/facebook/orca/notify/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/bi;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/facebook/orca/notify/bf;->b:Lcom/facebook/orca/notify/av;

    iput-object p2, p0, Lcom/facebook/orca/notify/bf;->a:Lcom/facebook/orca/notify/bi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/orca/notify/bf;->b:Lcom/facebook/orca/notify/av;

    iget-object v1, p0, Lcom/facebook/orca/notify/bf;->a:Lcom/facebook/orca/notify/bi;

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/bi;)V

    .line 216
    return-void
.end method
