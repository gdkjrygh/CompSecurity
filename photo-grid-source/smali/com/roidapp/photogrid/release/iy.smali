.class final Lcom/roidapp/photogrid/release/iy;
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
    .line 1073
    iput-object p1, p0, Lcom/roidapp/photogrid/release/iy;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 1077
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iy;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    check-cast p1, Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/aq;)V

    .line 1078
    return-void
.end method
