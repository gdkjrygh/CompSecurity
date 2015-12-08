.class final Lcom/roidapp/photogrid/common/br;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/bq;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/bq;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/roidapp/photogrid/common/br;->a:Lcom/roidapp/photogrid/common/bq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/common/br;->a:Lcom/roidapp/photogrid/common/bq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->f()V

    .line 122
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
