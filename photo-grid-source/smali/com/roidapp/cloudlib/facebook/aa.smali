.class final Lcom/roidapp/cloudlib/facebook/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/aa;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 100
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.WIFI_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 102
    iget-object v1, p0, Lcom/roidapp/cloudlib/facebook/aa;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 103
    return-void
.end method
