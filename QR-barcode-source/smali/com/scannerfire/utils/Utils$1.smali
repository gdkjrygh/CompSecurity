.class Lcom/scannerfire/utils/Utils$1;
.super Ljava/lang/Object;
.source "Utils.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/utils/Utils;->makeAlertDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;Z)Landroid/app/AlertDialog$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scannerfire/utils/Utils;

.field private final synthetic val$app:Landroid/app/Activity;

.field private final synthetic val$finish:Z

.field private final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/scannerfire/utils/Utils;Landroid/app/Activity;Landroid/content/Intent;Z)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/utils/Utils$1;->this$0:Lcom/scannerfire/utils/Utils;

    iput-object p2, p0, Lcom/scannerfire/utils/Utils$1;->val$app:Landroid/app/Activity;

    iput-object p3, p0, Lcom/scannerfire/utils/Utils$1;->val$intent:Landroid/content/Intent;

    iput-boolean p4, p0, Lcom/scannerfire/utils/Utils$1;->val$finish:Z

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .param p1, "dialoginterface"    # Landroid/content/DialogInterface;
    .param p2, "i"    # I

    .prologue
    .line 252
    iget-object v0, p0, Lcom/scannerfire/utils/Utils$1;->val$app:Landroid/app/Activity;

    invoke-static {v0}, Lcom/scannerfire/utils/Utils;->getVibratePref(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/scannerfire/utils/Utils$1;->this$0:Lcom/scannerfire/utils/Utils;

    iget-object v1, p0, Lcom/scannerfire/utils/Utils$1;->val$app:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/scannerfire/utils/Utils;->getVibrator(Landroid/content/Context;)Landroid/os/Vibrator;

    move-result-object v0

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/scannerfire/utils/Utils$1;->val$intent:Landroid/content/Intent;

    if-eqz v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/scannerfire/utils/Utils$1;->val$app:Landroid/app/Activity;

    iget-object v1, p0, Lcom/scannerfire/utils/Utils$1;->val$intent:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 260
    :cond_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 261
    iget-boolean v0, p0, Lcom/scannerfire/utils/Utils$1;->val$finish:Z

    if-eqz v0, :cond_2

    .line 263
    iget-object v0, p0, Lcom/scannerfire/utils/Utils$1;->val$app:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 265
    :cond_2
    return-void
.end method
