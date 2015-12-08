.class Lcom/QRBS/activity/StartActivity$4;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity;->showBackDialog()V
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
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$4;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "arg0"    # Landroid/content/DialogInterface;
    .param p2, "arg1"    # I

    .prologue
    .line 263
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$4;->this$0:Lcom/QRBS/activity/StartActivity;

    # getter for: Lcom/QRBS/activity/StartActivity;->alert:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/QRBS/activity/StartActivity;->access$5(Lcom/QRBS/activity/StartActivity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 264
    return-void
.end method
