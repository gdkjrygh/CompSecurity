.class Lcom/QRBS/activity/CreateGps$4;
.super Ljava/lang/Object;
.source "CreateGps.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateGps;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateGps;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateGps;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 178
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-interface {v8}, Landroid/text/Editable;->length()I

    move-result v8

    if-eqz v8, :cond_0

    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-interface {v8}, Landroid/text/Editable;->length()I

    move-result v8

    if-nez v8, :cond_1

    .line 179
    :cond_0
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    const v10, 0x7f080102

    invoke-virtual {v9, v10}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 199
    :goto_0
    return-void

    .line 183
    :cond_1
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-interface {v8}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v3

    .line 184
    .local v3, "sLat":Ljava/lang/String;
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-interface {v8}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v4

    .line 186
    .local v4, "sLon":Ljava/lang/String;
    const-string v8, "-?[0-9]?[0-9][.][0-9]+"

    invoke-virtual {v3, v8}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string v8, "-?[0-9]?[0-9]?[0-9][.][0-9]+"

    invoke-virtual {v4, v8}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 188
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->address:Landroid/widget/EditText;

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-interface {v8}, Landroid/text/Editable;->length()I

    move-result v8

    if-nez v8, :cond_2

    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    const v9, 0x7f080105

    invoke-virtual {v8, v9}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 189
    .local v1, "label":Ljava/lang/String;
    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "geo:"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 190
    .local v6, "uriBegin":Ljava/lang/String;
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "("

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ")"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 191
    .local v2, "query":Ljava/lang/String;
    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 192
    .local v0, "encodedQuery":Ljava/lang/String;
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "?q="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "&z=16"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 193
    .local v7, "uriString":Ljava/lang/String;
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 194
    .local v5, "uri":Landroid/net/Uri;
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    new-instance v9, Landroid/content/Intent;

    const-string v10, "android.intent.action.VIEW"

    invoke-direct {v9, v10, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v8, v9}, Lcom/QRBS/activity/CreateGps;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 188
    .end local v0    # "encodedQuery":Ljava/lang/String;
    .end local v1    # "label":Ljava/lang/String;
    .end local v2    # "query":Ljava/lang/String;
    .end local v5    # "uri":Landroid/net/Uri;
    .end local v6    # "uriBegin":Ljava/lang/String;
    .end local v7    # "uriString":Ljava/lang/String;
    :cond_2
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->address:Landroid/widget/EditText;

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-interface {v8}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 197
    :cond_3
    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$4;->this$0:Lcom/QRBS/activity/CreateGps;

    const v10, 0x7f080103

    invoke-virtual {v9, v10}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_0
.end method
