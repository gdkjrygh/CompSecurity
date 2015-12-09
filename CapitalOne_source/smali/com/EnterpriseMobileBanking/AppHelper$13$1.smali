.class Lcom/EnterpriseMobileBanking/AppHelper$13$1;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper$13;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/AppHelper$13;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/AppHelper$13;)V
    .locals 0

    .prologue
    .line 667
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$13$1;->this$0:Lcom/EnterpriseMobileBanking/AppHelper$13;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "id"    # I

    .prologue
    .line 669
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$200()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 670
    const/4 v0, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->access$202(Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 671
    return-void
.end method
