.class final Lcom/roidapp/photogrid/cloud/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/cloud/b/f;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/b/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/b/a;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/cloud/b/d;)V
    .locals 5

    .prologue
    .line 62
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->a(Lcom/roidapp/photogrid/cloud/b/a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    if-nez v0, :cond_1

    .line 93
    :cond_0
    :goto_0
    return-void

    .line 66
    :cond_1
    iget v0, p1, Lcom/roidapp/photogrid/cloud/b/d;->i:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Lcom/roidapp/photogrid/cloud/b/d;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "market://details?id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/roidapp/photogrid/cloud/b/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "https://play.google.com/store/apps/details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/roidapp/photogrid/cloud/b/d;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 69
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v2

    iget-object v3, p1, Lcom/roidapp/photogrid/cloud/b/d;->h:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v2, v3, v0, v1, v4}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 71
    :cond_2
    iget v0, p1, Lcom/roidapp/photogrid/cloud/b/d;->i:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 73
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->r()V

    goto :goto_0

    .line 76
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->v()V

    goto :goto_0

    .line 80
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->u()V

    goto :goto_0

    .line 83
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->w()V

    goto :goto_0

    .line 86
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->q()V

    goto :goto_0

    .line 89
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/b;->a:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->s()V

    goto :goto_0

    .line 71
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
