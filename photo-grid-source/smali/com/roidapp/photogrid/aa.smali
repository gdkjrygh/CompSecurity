.class final Lcom/roidapp/photogrid/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 1480
    iput-object p1, p0, Lcom/roidapp/photogrid/aa;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 1483
    iget-object v0, p0, Lcom/roidapp/photogrid/aa;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1487
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1489
    :cond_0
    return-void
.end method
