.class final Lcom/mobvista/sdk/m/a/d/a/e;
.super Landroid/os/Handler;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/d/a/d;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/d/a/d;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/e;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 46
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 48
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string/jumbo v1, "message_key"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 49
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string/jumbo v2, "message_bitmap"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/a;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 51
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/e;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 53
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/e;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Lcom/mobvista/sdk/m/a/d/a/d;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedList;

    .line 54
    if-eqz v0, :cond_1

    .line 55
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/a/d/a/h;

    .line 56
    if-eqz v0, :cond_0

    .line 57
    invoke-interface {v0, v2, v1}, Lcom/mobvista/sdk/m/a/d/a/h;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    goto :goto_0

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/e;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Lcom/mobvista/sdk/m/a/d/a/d;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_2
    :goto_1
    return-void

    .line 62
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 64
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string/jumbo v1, "message_key"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 65
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string/jumbo v2, "message_message"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/e;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Lcom/mobvista/sdk/m/a/d/a/d;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedList;

    .line 68
    if-eqz v0, :cond_4

    .line 69
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_2

    .line 75
    :cond_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/e;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Lcom/mobvista/sdk/m/a/d/a/d;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method
