.class final Lcom/roidapp/photogrid/release/di;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dc;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dc;)V
    .locals 0

    .prologue
    .line 758
    iput-object p1, p0, Lcom/roidapp/photogrid/release/di;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 761
    iget-object v0, p0, Lcom/roidapp/photogrid/release/di;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->c(Lcom/roidapp/photogrid/release/dc;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->a(Landroid/view/View;)V

    .line 762
    iget-object v0, p0, Lcom/roidapp/photogrid/release/di;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->f(Lcom/roidapp/photogrid/release/dc;)Lcom/roidapp/photogrid/release/lr;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/lr;->g()V

    .line 763
    return-void
.end method
