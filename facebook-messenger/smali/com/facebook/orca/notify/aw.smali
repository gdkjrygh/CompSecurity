.class Lcom/facebook/orca/notify/aw;
.super Ljava/lang/Object;
.source "OrcaNotificationManager.java"

# interfaces
.implements Lcom/facebook/i/a/a/a;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/av;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/orca/notify/aw;->a:Lcom/facebook/orca/notify/av;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;ZLcom/facebook/i/a/a/f;)V
    .locals 4

    .prologue
    .line 117
    if-nez p2, :cond_0

    .line 118
    invoke-static {}, Lcom/facebook/orca/notify/av;->c()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "PeerState changed on uri %s "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    .line 120
    iget-object v1, p0, Lcom/facebook/orca/notify/aw;->a:Lcom/facebook/orca/notify/av;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/av;->b(Ljava/lang/String;)V

    .line 122
    :cond_0
    return-void
.end method
