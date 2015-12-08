.class final Lcom/roidapp/photogrid/release/iv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 427
    iput-object p1, p0, Lcom/roidapp/photogrid/release/iv;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 432
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iv;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->x(Lcom/roidapp/photogrid/release/ImageEditor;)V

    .line 433
    return-void
.end method
