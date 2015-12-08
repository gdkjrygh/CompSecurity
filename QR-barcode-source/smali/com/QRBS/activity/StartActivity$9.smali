.class Lcom/QRBS/activity/StartActivity$9;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity;->showDeleteDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/StartActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/StartActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$9;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .param p1, "arg0"    # Landroid/content/DialogInterface;
    .param p2, "arg1"    # I

    .prologue
    .line 452
    new-instance v0, Lcom/scannerfire/db/DbAdapter;

    iget-object v2, p0, Lcom/QRBS/activity/StartActivity$9;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-direct {v0, v2}, Lcom/scannerfire/db/DbAdapter;-><init>(Landroid/content/Context;)V

    .line 453
    .local v0, "db":Lcom/scannerfire/db/DbAdapter;
    invoke-virtual {v0}, Lcom/scannerfire/db/DbAdapter;->open()Lcom/scannerfire/db/DbAdapter;

    .line 454
    invoke-virtual {v0}, Lcom/scannerfire/db/DbAdapter;->deleteAll()V

    .line 455
    invoke-virtual {v0}, Lcom/scannerfire/db/DbAdapter;->getValues()Ljava/util/ArrayList;

    move-result-object v1

    .line 456
    .local v1, "qrArray":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/scannerfire/model/QRModel;>;"
    iget-object v2, p0, Lcom/QRBS/activity/StartActivity$9;->this$0:Lcom/QRBS/activity/StartActivity;

    iget-object v2, v2, Lcom/QRBS/activity/StartActivity;->fc:Lcom/scannerfire/fragment/FragmentCronology;

    iget-object v3, p0, Lcom/QRBS/activity/StartActivity$9;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v2, v1, v3}, Lcom/scannerfire/fragment/FragmentCronology;->updateList(Ljava/util/ArrayList;Landroid/app/Activity;)V

    .line 458
    invoke-virtual {v0}, Lcom/scannerfire/db/DbAdapter;->close()V

    .line 459
    iget-object v2, p0, Lcom/QRBS/activity/StartActivity$9;->this$0:Lcom/QRBS/activity/StartActivity;

    # getter for: Lcom/QRBS/activity/StartActivity;->alert:Landroid/app/AlertDialog;
    invoke-static {v2}, Lcom/QRBS/activity/StartActivity;->access$5(Lcom/QRBS/activity/StartActivity;)Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog;->dismiss()V

    .line 460
    return-void
.end method
