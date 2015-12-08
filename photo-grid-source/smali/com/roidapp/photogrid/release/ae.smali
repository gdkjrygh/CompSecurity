.class final Lcom/roidapp/photogrid/release/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ab;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ab;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ae;->a:Lcom/roidapp/photogrid/release/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ae;->a:Lcom/roidapp/photogrid/release/ab;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ab;->a(Lcom/roidapp/photogrid/release/ab;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ae;->a:Lcom/roidapp/photogrid/release/ab;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ab;->b(Lcom/roidapp/photogrid/release/ab;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ab;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 52
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 53
    return-void
.end method
