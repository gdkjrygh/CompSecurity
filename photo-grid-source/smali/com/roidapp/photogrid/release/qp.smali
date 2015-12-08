.class final Lcom/roidapp/photogrid/release/qp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/qi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/qi;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qp;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qp;->a:Lcom/roidapp/photogrid/release/qi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qp;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/qi;->a(Lcom/roidapp/photogrid/release/qi;Landroid/app/Activity;)V

    .line 259
    return-void
.end method
