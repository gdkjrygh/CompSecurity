.class Lcom/facebook/orca/notify/ax;
.super Ljava/lang/Object;
.source "OrcaNotificationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/av;)V
    .locals 0

    .prologue
    .line 524
    iput-object p1, p0, Lcom/facebook/orca/notify/ax;->a:Lcom/facebook/orca/notify/av;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Lcom/facebook/orca/notify/ax;->a:Lcom/facebook/orca/notify/av;

    invoke-static {v0}, Lcom/facebook/orca/notify/av;->b(Lcom/facebook/orca/notify/av;)V

    .line 528
    return-void
.end method
