.class final Lcom/roidapp/photogrid/common/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/bq;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/bq;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bv;->a:Lcom/roidapp/photogrid/common/bq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bv;->a:Lcom/roidapp/photogrid/common/bq;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bq;->a(Lcom/roidapp/photogrid/common/bq;)V

    .line 173
    return-void
.end method
