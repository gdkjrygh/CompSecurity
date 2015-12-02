.class Lcom/qihoo/security/v5/CheckUpdateDialog$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/CheckUpdateDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/CheckUpdateDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/CheckUpdateDialog;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$2;->a:Lcom/qihoo/security/v5/CheckUpdateDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$2;->a:Lcom/qihoo/security/v5/CheckUpdateDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->finish()V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$2;->a:Lcom/qihoo/security/v5/CheckUpdateDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->a(Lcom/qihoo/security/v5/CheckUpdateDialog;)V

    .line 93
    return-void
.end method
