.class final Lcom/EnterpriseMobileBanking/AppHelper$11;
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


# instance fields
.field final synthetic val$lob:Ljava/lang/String;

.field final synthetic val$save:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 623
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$11;->val$save:Ljava/lang/String;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/AppHelper$11;->val$lob:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 627
    const/4 v0, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->access$202(Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 628
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/AppHelper$11;->val$save:Ljava/lang/String;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$11;->val$lob:Ljava/lang/String;

    # invokes: Lcom/EnterpriseMobileBanking/AppHelper;->switchLob(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/AppHelper;->access$300(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    return-void
.end method
