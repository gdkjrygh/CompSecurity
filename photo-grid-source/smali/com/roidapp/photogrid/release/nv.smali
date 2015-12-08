.class final Lcom/roidapp/photogrid/release/nv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/oa;

.field final synthetic b:Lcom/roidapp/photogrid/release/nn;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/nn;Lcom/roidapp/photogrid/release/oa;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nv;->b:Lcom/roidapp/photogrid/release/nn;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/nv;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nv;->a:Lcom/roidapp/photogrid/release/oa;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oa;->a()V

    .line 199
    return-void
.end method
