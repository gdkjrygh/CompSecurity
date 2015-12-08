.class final Lcom/roidapp/photogrid/release/nj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ng;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ng;)V
    .locals 0

    .prologue
    .line 802
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nj;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 806
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nj;->a:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 807
    return-void
.end method
