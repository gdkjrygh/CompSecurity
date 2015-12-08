.class Lcom/QRBS/activity/MyResultActivity$6;
.super Ljava/lang/Object;
.source "MyResultActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyResultActivity;->buildButton(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/MyResultActivity;

.field private final synthetic val$text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$6;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iput-object p2, p0, Lcom/QRBS/activity/MyResultActivity$6;->val$text:Ljava/lang/String;

    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 188
    iget-object v3, p0, Lcom/QRBS/activity/MyResultActivity$6;->val$text:Ljava/lang/String;

    const-string v4, "geo:"

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 190
    .local v2, "t":Ljava/lang/String;
    :try_start_0
    const-string v3, ""

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "TEXT ->"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/QRBS/activity/MyResultActivity$6;->val$text:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 192
    .local v1, "intent":Landroid/content/Intent;
    const-string v3, "?"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "&z=16"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 194
    :goto_0
    iget-object v3, p0, Lcom/QRBS/activity/MyResultActivity$6;->this$0:Lcom/QRBS/activity/MyResultActivity;

    invoke-virtual {v3, v1}, Lcom/QRBS/activity/MyResultActivity;->startActivity(Landroid/content/Intent;)V

    .line 198
    .end local v1    # "intent":Landroid/content/Intent;
    :goto_1
    return-void

    .line 193
    .restart local v1    # "intent":Landroid/content/Intent;
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "?z=16"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 195
    .end local v1    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v0

    .line 196
    .local v0, "anfe":Landroid/content/ActivityNotFoundException;
    iget-object v3, p0, Lcom/QRBS/activity/MyResultActivity$6;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iget-object v3, v3, Lcom/QRBS/activity/MyResultActivity;->a:Landroid/app/Activity;

    iget-object v4, p0, Lcom/QRBS/activity/MyResultActivity$6;->this$0:Lcom/QRBS/activity/MyResultActivity;

    const v5, 0x7f080116

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/MyResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1
.end method
