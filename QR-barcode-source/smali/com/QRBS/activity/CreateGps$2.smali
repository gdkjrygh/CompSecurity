.class Lcom/QRBS/activity/CreateGps$2;
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
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 133
    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5}, Landroid/text/Editable;->length()I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5}, Landroid/text/Editable;->length()I

    move-result v5

    if-nez v5, :cond_1

    .line 134
    :cond_0
    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v6, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    const v7, 0x7f080102

    invoke-virtual {v6, v7}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 153
    :goto_0
    return-void

    .line 138
    :cond_1
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    invoke-direct {v0, v5}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 141
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v3

    .line 142
    .local v3, "sLat":Ljava/lang/String;
    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v4

    .line 144
    .local v4, "sLon":Ljava/lang/String;
    const-string v5, "-?[0-9]?[0-9][.][0-9]+"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "-?[0-9]?[0-9]?[0-9][.][0-9]+"

    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 145
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "geo:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 146
    .local v2, "s":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 147
    .local v1, "label":Ljava/lang/String;
    invoke-virtual {v0, v2, v1}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 150
    .end local v1    # "label":Ljava/lang/String;
    .end local v2    # "s":Ljava/lang/String;
    :cond_2
    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v6, p0, Lcom/QRBS/activity/CreateGps$2;->this$0:Lcom/QRBS/activity/CreateGps;

    const v7, 0x7f080103

    invoke-virtual {v6, v7}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0
.end method
