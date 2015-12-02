.class Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c()V
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
    .line 107
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/opti/trashclear/service/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/opti/trashclear/service/d;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->b(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/d;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Z)Z

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;->a:Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->finish()V

    .line 142
    return-void

    .line 118
    :catch_0
    move-exception v0

    goto :goto_0
.end method
