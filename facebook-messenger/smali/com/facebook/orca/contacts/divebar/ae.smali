.class Lcom/facebook/orca/contacts/divebar/ae;
.super Lcom/facebook/base/broadcast/q;
.source "DivebarLoader.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/ad;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/ad;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 308
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ae;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 311
    const-string v0, "orca:FriendListsLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "friendsBroadcastReceiver : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ae;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/ad;->t()V

    .line 313
    return-void
.end method
