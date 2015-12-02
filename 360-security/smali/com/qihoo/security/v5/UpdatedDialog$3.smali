.class Lcom/qihoo/security/v5/UpdatedDialog$3;
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
.field final synthetic a:Lcom/qihoo/security/v5/UpdatedDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/UpdatedDialog;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdatedDialog$3;->a:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$3;->a:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    .line 145
    return-void
.end method
