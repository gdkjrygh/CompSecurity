.class Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {p2}, Lcom/qihoo/security/service/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/service/a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;

    .line 196
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/service/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 198
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/service/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->d(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/service/c$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :cond_0
    :goto_0
    return-void

    .line 199
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 207
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;

    .line 208
    return-void
.end method
