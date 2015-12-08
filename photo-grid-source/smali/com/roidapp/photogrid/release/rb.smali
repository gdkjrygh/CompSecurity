.class final Lcom/roidapp/photogrid/release/rb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ra;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/release/ra;)V
    .locals 0

    .prologue
    .line 1368
    iput-object p1, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/release/ra;B)V
    .locals 0

    .prologue
    .line 1368
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/rb;-><init>(Lcom/roidapp/photogrid/release/ra;)V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    .prologue
    .line 1378
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v0

    .line 1379
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v1

    int-to-float v1, v1

    .line 1381
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ra;->a(Lcom/roidapp/photogrid/release/ra;)V

    .line 1382
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 1384
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    new-instance v3, Landroid/graphics/PointF;

    const/4 v4, 0x0

    aget v0, v0, v4

    invoke-direct {v3, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v4, 0x10

    aget v1, v1, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rb;->a:Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v0, v1, v4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 1385
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 1371
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 1374
    return-void
.end method
