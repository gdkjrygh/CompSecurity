.class final Lcom/roidapp/photogrid/release/mj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PhotoGridActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V
    .locals 0

    .prologue
    .line 5262
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mj;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 5265
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mj;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/photogrid/release/PhotoGridActivity;)Z

    .line 5266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mj;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(I)V

    .line 5267
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 5268
    return-void
.end method
