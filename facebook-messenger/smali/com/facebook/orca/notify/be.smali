.class Lcom/facebook/orca/notify/be;
.super Ljava/lang/Object;
.source "OrcaNotificationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/a;

.field final synthetic b:Lcom/facebook/orca/notify/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/push/a;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lcom/facebook/orca/notify/be;->b:Lcom/facebook/orca/notify/av;

    iput-object p2, p0, Lcom/facebook/orca/notify/be;->a:Lcom/facebook/orca/push/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Lcom/facebook/orca/notify/be;->b:Lcom/facebook/orca/notify/av;

    iget-object v1, p0, Lcom/facebook/orca/notify/be;->a:Lcom/facebook/orca/push/a;

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/push/a;)V

    .line 207
    return-void
.end method
