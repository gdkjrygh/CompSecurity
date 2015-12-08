.class Lcom/QRBS/activity/ManualInsert$5;
.super Ljava/lang/Object;
.source "ManualInsert.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/ManualInsert;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/ManualInsert;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/ManualInsert;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 10
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 194
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    iget-object v9, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v9}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v9

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-interface {v9}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/QRBS/activity/ManualInsert;->access$7(Lcom/QRBS/activity/ManualInsert;Ljava/lang/String;)V

    .line 195
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->result:Ljava/lang/String;
    invoke-static {v8}, Lcom/QRBS/activity/ManualInsert;->access$8(Lcom/QRBS/activity/ManualInsert;)Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 236
    :goto_0
    return-void

    .line 199
    :cond_0
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->one:Landroid/widget/CheckBox;
    invoke-static {v8}, Lcom/QRBS/activity/ManualInsert;->access$6(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v8

    invoke-virtual {v8}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v8

    if-nez v8, :cond_4

    .line 201
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->two:Landroid/widget/CheckBox;
    invoke-static {v8}, Lcom/QRBS/activity/ManualInsert;->access$0(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v8

    invoke-virtual {v8}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 203
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "http://www.google.com/m/products?q="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v9, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->result:Ljava/lang/String;
    invoke-static {v9}, Lcom/QRBS/activity/ManualInsert;->access$8(Lcom/QRBS/activity/ManualInsert;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 204
    .local v7, "uri3":Landroid/net/Uri;
    new-instance v3, Landroid/content/Intent;

    const-string v8, "android.intent.action.VIEW"

    invoke-direct {v3, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 205
    .local v3, "intent3":Landroid/content/Intent;
    invoke-virtual {v3, v7}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 206
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    invoke-virtual {v8, v3}, Lcom/QRBS/activity/ManualInsert;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 209
    .end local v3    # "intent3":Landroid/content/Intent;
    .end local v7    # "uri3":Landroid/net/Uri;
    :cond_1
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->three:Landroid/widget/CheckBox;
    invoke-static {v8}, Lcom/QRBS/activity/ManualInsert;->access$1(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v8

    invoke-virtual {v8}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 211
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "http://www.google.com/m/products?q="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v9, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->result:Ljava/lang/String;
    invoke-static {v9}, Lcom/QRBS/activity/ManualInsert;->access$8(Lcom/QRBS/activity/ManualInsert;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 212
    .local v6, "uri2":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v8, "android.intent.action.VIEW"

    invoke-direct {v2, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 213
    .local v2, "intent2":Landroid/content/Intent;
    invoke-virtual {v2, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 214
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    invoke-virtual {v8, v2}, Lcom/QRBS/activity/ManualInsert;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 217
    .end local v2    # "intent2":Landroid/content/Intent;
    .end local v6    # "uri2":Landroid/net/Uri;
    :cond_2
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->four:Landroid/widget/CheckBox;
    invoke-static {v8}, Lcom/QRBS/activity/ManualInsert;->access$2(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v8

    invoke-virtual {v8}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v8

    if-nez v8, :cond_3

    .line 219
    const-string v8, ""

    const-string v9, "No one checked"

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 224
    :cond_3
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "http://www.google.com/m/products?q="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v9, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->result:Ljava/lang/String;
    invoke-static {v9}, Lcom/QRBS/activity/ManualInsert;->access$8(Lcom/QRBS/activity/ManualInsert;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 225
    .local v5, "uri1":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v8, "android.intent.action.VIEW"

    invoke-direct {v1, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 226
    .local v1, "intent1":Landroid/content/Intent;
    invoke-virtual {v1, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 227
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    invoke-virtual {v8, v1}, Lcom/QRBS/activity/ManualInsert;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 232
    .end local v1    # "intent1":Landroid/content/Intent;
    .end local v5    # "uri1":Landroid/net/Uri;
    :cond_4
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "http://www.google.com/m/products?q="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v9, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->result:Ljava/lang/String;
    invoke-static {v9}, Lcom/QRBS/activity/ManualInsert;->access$8(Lcom/QRBS/activity/ManualInsert;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 233
    .local v4, "uri":Landroid/net/Uri;
    new-instance v0, Landroid/content/Intent;

    const-string v8, "android.intent.action.VIEW"

    invoke-direct {v0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 234
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 235
    iget-object v8, p0, Lcom/QRBS/activity/ManualInsert$5;->this$0:Lcom/QRBS/activity/ManualInsert;

    invoke-virtual {v8, v0}, Lcom/QRBS/activity/ManualInsert;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0
.end method
