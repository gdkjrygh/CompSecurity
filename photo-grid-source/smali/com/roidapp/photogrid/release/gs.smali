.class final Lcom/roidapp/photogrid/release/gs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 966
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gs;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 970
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gs;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->s(Lcom/roidapp/photogrid/release/ge;)V

    .line 971
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gs;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 972
    return-void
.end method
