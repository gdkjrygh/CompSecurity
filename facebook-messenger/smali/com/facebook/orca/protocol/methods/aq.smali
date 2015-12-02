.class Lcom/facebook/orca/protocol/methods/aq;
.super Ljava/lang/Object;
.source "SendViaChatHandler.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/methods/ap;


# direct methods
.method constructor <init>(Lcom/facebook/orca/protocol/methods/ap;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/aq;->a:Lcom/facebook/orca/protocol/methods/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 3

    .prologue
    .line 190
    const-string v0, "topic_name"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 191
    const-string v1, "payload"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v1

    .line 192
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/aq;->a:Lcom/facebook/orca/protocol/methods/ap;

    invoke-static {v1}, Lcom/facebook/common/w/n;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/protocol/methods/ap;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    return-void
.end method
