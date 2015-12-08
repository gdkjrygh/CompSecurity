.class final Lcom/roidapp/imagelib/filter/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/s;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/s;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/u;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 225
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/u;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/s;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 241
    :cond_0
    :goto_0
    return v7

    .line 226
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 228
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 229
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/u;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/s;->b(Lcom/roidapp/imagelib/filter/s;)Lcom/roidapp/imagelib/filter/az;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 230
    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    move v2, v1

    :goto_1
    if-ge v2, v3, :cond_0

    .line 231
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/u;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/s;->b(Lcom/roidapp/imagelib/filter/s;)Lcom/roidapp/imagelib/filter/az;

    move-result-object v4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/imagelib/filter/b;

    iget-object v5, p0, Lcom/roidapp/imagelib/filter/u;->a:Lcom/roidapp/imagelib/filter/s;

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/s;->c(Lcom/roidapp/imagelib/filter/s;)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v5

    new-instance v6, Lcom/roidapp/imagelib/filter/v;

    invoke-direct {v6, p0}, Lcom/roidapp/imagelib/filter/v;-><init>(Lcom/roidapp/imagelib/filter/u;)V

    invoke-virtual {v4, v1, v5, v6}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/imagelib/filter/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/bd;)V

    .line 230
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 226
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
