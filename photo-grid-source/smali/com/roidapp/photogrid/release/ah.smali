.class final Lcom/roidapp/photogrid/release/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/af;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/af;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ah;->a:Lcom/roidapp/photogrid/release/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 31
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 32
    return-void
.end method
