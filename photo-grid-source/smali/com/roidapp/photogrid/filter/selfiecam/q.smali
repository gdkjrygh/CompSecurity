.class final Lcom/roidapp/photogrid/filter/selfiecam/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/selfiecam/o;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/o;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/q;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/q;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/q;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->e(Lcom/roidapp/photogrid/filter/selfiecam/o;)Lcom/roidapp/photogrid/filter/selfiecam/v;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->a(Lcom/roidapp/photogrid/filter/selfiecam/o;Landroid/view/View;Lcom/roidapp/photogrid/filter/selfiecam/v;)V

    .line 219
    return-void
.end method
