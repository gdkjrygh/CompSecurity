.class final Lcom/roidapp/photogrid/release/er;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;)V
    .locals 0

    .prologue
    .line 325
    iput-object p1, p0, Lcom/roidapp/photogrid/release/er;->a:Lcom/roidapp/photogrid/release/el;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 329
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 330
    return-void
.end method
