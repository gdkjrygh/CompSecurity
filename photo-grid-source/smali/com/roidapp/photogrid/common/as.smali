.class final Lcom/roidapp/photogrid/common/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/roidapp/photogrid/common/ap;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/AlertDialog;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/roidapp/photogrid/common/as;->c:Lcom/roidapp/photogrid/common/ap;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/as;->a:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/as;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/common/as;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/common/as;->c:Lcom/roidapp/photogrid/common/ap;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/as;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/common/ap;->b(Landroid/app/Activity;)V

    .line 94
    return-void
.end method
