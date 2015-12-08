.class final Lcom/EnterpriseMobileBanking/AppHelper$13;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper;->showError(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$messageDialog:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 646
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$13;->val$title:Ljava/lang/String;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/AppHelper$13;->val$messageDialog:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 652
    new-instance v0, Landroid/app/AlertDialog$Builder;

    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 655
    .local v0, "alertMessage1":Landroid/app/AlertDialog$Builder;
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$13;->val$title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 658
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$13;->val$messageDialog:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 660
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 667
    const-string v1, "OK"

    new-instance v2, Lcom/EnterpriseMobileBanking/AppHelper$13$1;

    invoke-direct {v2, p0}, Lcom/EnterpriseMobileBanking/AppHelper$13$1;-><init>(Lcom/EnterpriseMobileBanking/AppHelper$13;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 675
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    # setter for: Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->access$202(Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 676
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$200()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 678
    return-void
.end method
