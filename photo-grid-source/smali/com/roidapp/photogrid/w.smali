.class final Lcom/roidapp/photogrid/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 1445
    iput-object p1, p0, Lcom/roidapp/photogrid/w;->b:Lcom/roidapp/photogrid/MainPage;

    iput-object p2, p0, Lcom/roidapp/photogrid/w;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1449
    new-instance v0, Lcom/roidapp/photogrid/common/o;

    iget-object v1, p0, Lcom/roidapp/photogrid/w;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/o;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->d()V

    .line 1450
    iget-object v0, p0, Lcom/roidapp/photogrid/w;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1451
    return-void
.end method
