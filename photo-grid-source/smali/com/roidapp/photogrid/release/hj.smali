.class final Lcom/roidapp/photogrid/release/hj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/hh;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hh;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hj;->a:Lcom/roidapp/photogrid/release/hh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hj;->a:Lcom/roidapp/photogrid/release/hh;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Lcom/roidapp/videolib/core/n;->d(Landroid/content/Context;)V

    .line 100
    return-void
.end method
