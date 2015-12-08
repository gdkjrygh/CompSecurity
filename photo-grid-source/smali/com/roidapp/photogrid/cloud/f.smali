.class final Lcom/roidapp/photogrid/cloud/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/cloud/cm;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 0

    .prologue
    .line 568
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 578
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_0

    .line 579
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/br;->k()Ljava/util/ArrayList;

    move-result-object v0

    .line 581
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 586
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_0

    .line 587
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/cloud/br;->b(Ljava/lang/String;)V

    .line 589
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 571
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_0

    .line 572
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/photogrid/cloud/br;->a(Ljava/lang/String;Z)V

    .line 574
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_0

    .line 594
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/f;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/br;->j()V

    .line 596
    :cond_0
    return-void
.end method
