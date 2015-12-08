.class final Lcom/roidapp/photogrid/release/ep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 267
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ep;->b:Lcom/roidapp/photogrid/release/el;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ep;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ep;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->h(Lcom/roidapp/photogrid/release/el;)V

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ep;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->g(Lcom/roidapp/photogrid/release/el;)Z

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ep;->a:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ep;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 276
    :cond_0
    return-void
.end method
