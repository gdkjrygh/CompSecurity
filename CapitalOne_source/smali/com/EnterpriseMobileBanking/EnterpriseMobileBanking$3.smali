.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final synthetic val$firstTime:Z


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Z)V
    .locals 0

    .prologue
    .line 353
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iput-boolean p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->val$firstTime:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 357
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 358
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    .line 359
    .local v0, "myLoop":Landroid/os/Looper;
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v2, Landroid/app/ProgressDialog;

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$402(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;

    .line 360
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 361
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 362
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 363
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->val$firstTime:Z

    if-eqz v1, :cond_0

    const v1, 0x7f0900fa

    :goto_0
    invoke-virtual {v3, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 364
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V

    .line 365
    invoke-static {}, Landroid/os/Looper;->loop()V

    .line 366
    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 367
    return-void

    .line 363
    :cond_0
    const v1, 0x7f0900f9

    goto :goto_0
.end method
