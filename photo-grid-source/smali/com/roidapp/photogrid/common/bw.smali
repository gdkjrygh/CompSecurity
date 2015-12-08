.class final Lcom/roidapp/photogrid/common/bw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/bq;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/bq;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bw;->a:Lcom/roidapp/photogrid/common/bq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bw;->a:Lcom/roidapp/photogrid/common/bq;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bq;->b(Lcom/roidapp/photogrid/common/bq;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 185
    return-void
.end method
