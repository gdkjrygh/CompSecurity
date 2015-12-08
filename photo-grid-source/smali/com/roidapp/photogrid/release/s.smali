.class final Lcom/roidapp/photogrid/release/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/r;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/r;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/roidapp/photogrid/release/s;->a:Lcom/roidapp/photogrid/release/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/release/s;->a:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(II)V

    .line 99
    return-void
.end method
