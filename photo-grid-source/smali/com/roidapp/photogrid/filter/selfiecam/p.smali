.class final Lcom/roidapp/photogrid/filter/selfiecam/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/selfiecam/o;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/o;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/p;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/p;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->a(Lcom/roidapp/photogrid/filter/selfiecam/o;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/p;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->b(Lcom/roidapp/photogrid/filter/selfiecam/o;)Lcom/roidapp/photogrid/release/ParentActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ParentActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/p;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->c(Lcom/roidapp/photogrid/filter/selfiecam/o;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/p;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->b(Lcom/roidapp/photogrid/filter/selfiecam/o;)Lcom/roidapp/photogrid/release/ParentActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ParentActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/a;->a()V

    .line 80
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/p;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->d(Lcom/roidapp/photogrid/filter/selfiecam/o;)Z

    .line 82
    :cond_1
    return-void

    .line 78
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/p;->a:Lcom/roidapp/photogrid/filter/selfiecam/o;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->b(Lcom/roidapp/photogrid/filter/selfiecam/o;)Lcom/roidapp/photogrid/release/ParentActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ParentActivity;->x:Lcom/roidapp/photogrid/filter/selfiecam/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/filter/selfiecam/a;->b()V

    goto :goto_0
.end method
