.class final Lcom/roidapp/photogrid/release/po;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PhotoView;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoView;)V
    .locals 0

    .prologue
    .line 556
    iput-object p1, p0, Lcom/roidapp/photogrid/release/po;->a:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 559
    iget-object v0, p0, Lcom/roidapp/photogrid/release/po;->a:Lcom/roidapp/photogrid/release/PhotoView;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 560
    return-void
.end method
