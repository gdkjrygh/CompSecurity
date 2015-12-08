.class final Lcom/roidapp/photogrid/release/mk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PhotoGridActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V
    .locals 0

    .prologue
    .line 5271
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 5274
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/photogrid/release/PhotoGridActivity;)Z

    .line 5275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(I)V

    .line 5276
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 5277
    return-void
.end method
