.class final Lcom/roidapp/cloudlib/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/AccountMgrActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lcom/roidapp/cloudlib/b;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 141
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->a(Lcom/roidapp/cloudlib/AccountMgrActivity;)Lcom/dropbox/client2/DropboxAPI;

    move-result-object v0

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->accountInfo()Lcom/dropbox/client2/DropboxAPI$Account;

    move-result-object v0

    iget-object v0, v0, Lcom/dropbox/client2/DropboxAPI$Account;->displayName:Ljava/lang/String;

    .line 142
    if-eqz v0, :cond_0

    .line 143
    iget-object v1, p0, Lcom/roidapp/cloudlib/b;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    new-instance v1, Lcom/roidapp/cloudlib/c;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/c;-><init>(Lcom/roidapp/cloudlib/b;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/AccountMgrActivity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lcom/dropbox/client2/exception/DropboxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :goto_0
    return-void

    .line 152
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/dropbox/client2/exception/DropboxException;->printStackTrace()V

    goto :goto_0
.end method
