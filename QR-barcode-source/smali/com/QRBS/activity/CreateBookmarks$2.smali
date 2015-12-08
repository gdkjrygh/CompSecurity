.class Lcom/QRBS/activity/CreateBookmarks$2;
.super Ljava/lang/Object;
.source "CreateBookmarks.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateBookmarks;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateBookmarks;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateBookmarks;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateBookmarks$2;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 54
    iget-object v3, p0, Lcom/QRBS/activity/CreateBookmarks$2;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    const v4, 0x7f0d0077

    invoke-virtual {v3, v4}, Lcom/QRBS/activity/CreateBookmarks;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 55
    .local v2, "text":Landroid/widget/EditText;
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 56
    .local v1, "s":Ljava/lang/String;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1

    .line 57
    :cond_0
    iget-object v3, p0, Lcom/QRBS/activity/CreateBookmarks$2;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    iget-object v4, p0, Lcom/QRBS/activity/CreateBookmarks$2;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    const v5, 0x7f0800fa

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/CreateBookmarks;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 67
    :goto_0
    return-void

    .line 60
    :cond_1
    invoke-static {v1}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "www."

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 61
    iget-object v3, p0, Lcom/QRBS/activity/CreateBookmarks$2;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    iget-object v4, p0, Lcom/QRBS/activity/CreateBookmarks$2;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    const v5, 0x7f0800fb

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/CreateBookmarks;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_2
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v3, p0, Lcom/QRBS/activity/CreateBookmarks$2;->this$0:Lcom/QRBS/activity/CreateBookmarks;

    invoke-direct {v0, v3}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 66
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    invoke-virtual {v0, v1, v1}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
