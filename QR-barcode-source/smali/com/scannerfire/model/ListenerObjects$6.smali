.class Lcom/scannerfire/model/ListenerObjects$6;
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
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 249
    iget-object v3, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v2, v3, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    .line 250
    .local v2, "url":Ljava/lang/String;
    const-string v3, ""

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "GEO VALUE "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v5, v5, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    iget-object v3, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v3, v3, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    const-string v4, "geo:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 254
    :try_start_0
    iget-object v3, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v3, v3, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    new-instance v6, Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v7, v7, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "&z=16"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v3, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 266
    :goto_0
    return-void

    .line 255
    :catch_0
    move-exception v0

    .line 256
    .local v0, "anfe":Landroid/content/ActivityNotFoundException;
    iget-object v3, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v3, v3, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    iget-object v4, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v4, v4, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    const v5, 0x7f080116

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 261
    .end local v0    # "anfe":Landroid/content/ActivityNotFoundException;
    :cond_0
    const-string v3, "http://"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "https://"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "market://"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 262
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "http://"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 263
    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    .line 264
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 263
    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 265
    .local v1, "browserIntent":Landroid/content/Intent;
    iget-object v3, p0, Lcom/scannerfire/model/ListenerObjects$6;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v3, v3, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method
