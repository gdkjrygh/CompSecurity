.class Lcom/scannerfire/model/ListenerObjects$2;
.super Ljava/lang/Object;
.source "ListenerObjects.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/model/ListenerObjects;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scannerfire/model/ListenerObjects;


# direct methods
.method constructor <init>(Lcom/scannerfire/model/ListenerObjects;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects$2;->this$0:Lcom/scannerfire/model/ListenerObjects;

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 120
    const-string v1, ""

    .line 121
    .local v1, "to":Ljava/lang/String;
    const-string v2, ""

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "msg->  "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/scannerfire/model/ListenerObjects$2;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v4, v4, Lcom/scannerfire/model/ListenerObjects;->msg:Lcom/scannerfire/model/Mail;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    iget-object v2, p0, Lcom/scannerfire/model/ListenerObjects$2;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v2, v2, Lcom/scannerfire/model/ListenerObjects;->msg:Lcom/scannerfire/model/Mail;

    if-eqz v2, :cond_0

    .line 123
    invoke-static {}, Lcom/scannerfire/model/Mail;->getString()Ljava/lang/String;

    move-result-object v1

    .line 135
    :goto_0
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.SENDTO"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "mailto:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 136
    .local v0, "emailIntent":Landroid/content/Intent;
    iget-object v2, p0, Lcom/scannerfire/model/ListenerObjects$2;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v2, v2, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    iget-object v3, p0, Lcom/scannerfire/model/ListenerObjects$2;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v3, v3, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    const v4, 0x7f080148

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 137
    return-void

    .line 125
    .end local v0    # "emailIntent":Landroid/content/Intent;
    :cond_0
    invoke-static {}, Lcom/scannerfire/model/MatMsg;->getTO()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method
