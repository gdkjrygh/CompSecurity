.class final Lcom/EnterpriseMobileBanking/AppHelper$12;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper;->promptForLogout(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 631
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 635
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$200()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 636
    const/4 v0, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->access$202(Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 637
    return-void
.end method
