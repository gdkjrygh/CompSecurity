.class final Lcom/roidapp/photogrid/release/fl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/release/fm;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/release/fi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fi;I)V
    .locals 0

    .prologue
    .line 411
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    iput p2, p0, Lcom/roidapp/photogrid/release/fl;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    const v2, 0x7f0d0493

    .line 428
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0, p1}, Lcom/roidapp/photogrid/release/fi;->b(Lcom/roidapp/photogrid/release/fi;I)I

    .line 429
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->h(Lcom/roidapp/photogrid/release/fi;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/fl;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 430
    if-lez p1, :cond_0

    .line 431
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->h(Lcom/roidapp/photogrid/release/fi;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 433
    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 415
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0, p1}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;Z)Z

    .line 416
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->f(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 417
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;I)I

    .line 421
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->i(Lcom/roidapp/photogrid/release/fi;)V

    .line 422
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->j(Lcom/roidapp/photogrid/release/fi;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 423
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 424
    return-void

    .line 417
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 419
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/fl;->b:Lcom/roidapp/photogrid/release/fi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fi;->g(Lcom/roidapp/photogrid/release/fi;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    :goto_2
    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/fi;->a(Lcom/roidapp/photogrid/release/fi;I)I

    goto :goto_1

    :cond_2
    const/4 v0, 0x3

    goto :goto_2
.end method
