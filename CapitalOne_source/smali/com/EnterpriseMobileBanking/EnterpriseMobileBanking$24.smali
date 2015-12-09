.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$24;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNotFound()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 0

    .prologue
    .line 1727
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$24;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 1731
    # getter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->notFound:Landroid/app/AlertDialog;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1600()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 1732
    return-void
.end method
