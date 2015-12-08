.class final Lcom/roidapp/photogrid/release/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/view/j;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/c;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/roidapp/photogrid/release/g;->a:Lcom/roidapp/photogrid/release/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 231
    return-void
.end method

.method public final a(F)V
    .locals 1

    .prologue
    .line 224
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/g;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->e(Lcom/roidapp/photogrid/release/c;)V

    .line 227
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 217
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/release/g;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->d(Lcom/roidapp/photogrid/release/c;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 220
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/release/g;->a:Lcom/roidapp/photogrid/release/c;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/g;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/c;->f(Lcom/roidapp/photogrid/release/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/c;->a(Lcom/roidapp/photogrid/release/c;Ljava/lang/String;)V

    .line 236
    return-void
.end method
