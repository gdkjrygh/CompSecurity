.class Lcom/qihoo/security/v5/UpdatedDialog$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/UpdatedDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:Lcom/qihoo/security/v5/UpdatedDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/UpdatedDialog;ZZ)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    iput-boolean p2, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->a:Z

    iput-boolean p3, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 190
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/e/b;->c(Landroid/content/Context;)B

    move-result v0

    .line 191
    invoke-static {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->b(I)Z

    move-result v0

    .line 192
    const/16 v1, 0x6982

    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    .line 193
    if-nez v0, :cond_0

    .line 194
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdatedDialog;->a(Lcom/qihoo/security/v5/UpdatedDialog;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 195
    const-string/jumbo v1, "uiforce"

    iget-boolean v2, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->a:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 196
    const-string/jumbo v1, "ispatch"

    iget-boolean v2, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 197
    const-string/jumbo v1, "type"

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdatedDialog;->b(Lcom/qihoo/security/v5/UpdatedDialog;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 198
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 199
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    .line 209
    :goto_0
    return-void

    .line 201
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdatedDialog;->a(Lcom/qihoo/security/v5/UpdatedDialog;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 202
    const-string/jumbo v1, "uiforce"

    iget-boolean v2, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->a:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 203
    const-string/jumbo v1, "ispatch"

    iget-boolean v2, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 204
    const-string/jumbo v1, "type"

    iget-object v2, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-static {v2}, Lcom/qihoo/security/v5/UpdatedDialog;->b(Lcom/qihoo/security/v5/UpdatedDialog;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 205
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->startActivity(Landroid/content/Intent;)V

    .line 206
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$4;->c:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    .line 207
    const/16 v0, 0x6983

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0
.end method
