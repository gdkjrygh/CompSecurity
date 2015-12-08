.class final Lcom/roidapp/photogrid/release/it;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 900
    iput-object p1, p0, Lcom/roidapp/photogrid/release/it;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 902
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 903
    iget-object v0, p0, Lcom/roidapp/photogrid/release/it;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->D(Lcom/roidapp/photogrid/release/ImageEditor;)V

    .line 909
    :goto_0
    return-void

    .line 904
    :cond_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 905
    iget-object v0, p0, Lcom/roidapp/photogrid/release/it;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->E(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto :goto_0

    .line 907
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/it;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->F(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto :goto_0
.end method
