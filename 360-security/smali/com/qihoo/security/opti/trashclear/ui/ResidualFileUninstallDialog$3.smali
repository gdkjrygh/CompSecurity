.class Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$3;
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
    .line 171
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$3;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$3;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {p2}, Lcom/qihoo/security/opti/trashclear/service/d$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/opti/trashclear/service/d;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Lcom/qihoo/security/opti/trashclear/service/d;)Lcom/qihoo/security/opti/trashclear/service/d;

    .line 179
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$3;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Lcom/qihoo/security/opti/trashclear/service/d;)Lcom/qihoo/security/opti/trashclear/service/d;

    .line 184
    return-void
.end method
