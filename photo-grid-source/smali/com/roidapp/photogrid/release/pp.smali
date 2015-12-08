.class final Lcom/roidapp/photogrid/release/pp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PhotoView;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoView;)V
    .locals 0

    .prologue
    .line 562
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pp;->a:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 566
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pp;->a:Lcom/roidapp/photogrid/release/PhotoView;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 567
    return-void
.end method
