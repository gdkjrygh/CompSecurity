.class Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$5;
.super Lcom/qihoo/security/service/c$a;
.source "360Security"


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
    .line 267
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$5;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-direct {p0}, Lcom/qihoo/security/service/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZZZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 272
    if-eqz p1, :cond_0

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$5;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->finish()V

    .line 278
    :cond_0
    return-void
.end method
