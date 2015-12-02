.class Lcom/facebook/selfupdate/m;
.super Ljava/lang/Object;
.source "SelfUpdateInstallActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;


# direct methods
.method constructor <init>(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/facebook/selfupdate/m;->a:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/selfupdate/m;->a:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-static {v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->a(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;)Lcom/facebook/selfupdate/o;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/selfupdate/m;->a:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    sget-object v2, Lcom/facebook/selfupdate/p;->BUTTON_PRESS_REMIND:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 140
    iget-object v0, p0, Lcom/facebook/selfupdate/m;->a:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-static {v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->b(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;)V

    .line 141
    iget-object v0, p0, Lcom/facebook/selfupdate/m;->a:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-virtual {v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->finish()V

    .line 142
    return-void
.end method
