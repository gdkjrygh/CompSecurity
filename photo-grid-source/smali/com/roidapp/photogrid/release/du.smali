.class final Lcom/roidapp/photogrid/release/du;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 844
    iput-object p1, p0, Lcom/roidapp/photogrid/release/du;->b:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/du;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 850
    iget-object v0, p0, Lcom/roidapp/photogrid/release/du;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->m(Lcom/roidapp/photogrid/release/dk;)V

    .line 851
    iget-object v0, p0, Lcom/roidapp/photogrid/release/du;->a:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 852
    iget-object v0, p0, Lcom/roidapp/photogrid/release/du;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 854
    :cond_0
    return-void
.end method
