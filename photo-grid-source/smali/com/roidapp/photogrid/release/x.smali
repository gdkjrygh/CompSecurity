.class final Lcom/roidapp/photogrid/release/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/w;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/w;)V
    .locals 0

    .prologue
    .line 482
    iput-object p1, p0, Lcom/roidapp/photogrid/release/x;->a:Lcom/roidapp/photogrid/release/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 485
    iget-object v0, p0, Lcom/roidapp/photogrid/release/x;->a:Lcom/roidapp/photogrid/release/w;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;Z)Z

    .line 486
    return-void
.end method
