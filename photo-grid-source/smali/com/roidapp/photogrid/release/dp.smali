.class final Lcom/roidapp/photogrid/release/dp;
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
    .line 729
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dp;->b:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/dp;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 732
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dp;->a:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 733
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dp;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 735
    :cond_0
    return-void
.end method
