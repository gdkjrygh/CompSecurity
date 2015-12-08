.class final Lcom/roidapp/cloudlib/sns/basepost/bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/view/u;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/bc;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bc;)V
    .locals 0

    .prologue
    .line 923
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bf;->a:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(II)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 927
    packed-switch p1, :pswitch_data_0

    .line 936
    :goto_0
    return-void

    .line 929
    :pswitch_0
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Post/Report/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 930
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bf;->a:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Post/Report/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 931
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bf;->a:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0, p2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;I)V

    goto :goto_0

    .line 927
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
