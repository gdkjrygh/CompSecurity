.class Lcom/qihoo/security/dialog/DataFailDialog$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/dialog/DataFailDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/DataFailDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/DataFailDialog;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/qihoo/security/dialog/DataFailDialog$1;->a:Lcom/qihoo/security/dialog/DataFailDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/dialog/DataFailDialog$1;->a:Lcom/qihoo/security/dialog/DataFailDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/DataFailDialog;->finish()V

    .line 32
    return-void
.end method
