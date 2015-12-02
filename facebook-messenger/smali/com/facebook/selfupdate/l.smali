.class Lcom/facebook/selfupdate/l;
.super Ljava/lang/Object;
.source "SelfUpdateInstallActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;


# direct methods
.method constructor <init>(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/facebook/selfupdate/l;->b:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    iput-object p2, p0, Lcom/facebook/selfupdate/l;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/selfupdate/l;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 124
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/facebook/selfupdate/l;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 126
    :cond_0
    iget-object v1, p0, Lcom/facebook/selfupdate/l;->b:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-static {v1}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->a(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;)Lcom/facebook/selfupdate/o;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/selfupdate/l;->b:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    sget-object v3, Lcom/facebook/selfupdate/p;->BUTTON_PRESS_INSTALL:Lcom/facebook/selfupdate/p;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 129
    iget-object v1, p0, Lcom/facebook/selfupdate/l;->b:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-static {v0, v1}, Lcom/facebook/selfupdate/af;->a(Landroid/net/Uri;Landroid/app/Activity;)V

    .line 130
    return-void
.end method
