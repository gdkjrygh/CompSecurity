.class final Lcom/mobvista/sdk/m/a/c/b;
.super Landroid/os/Handler;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/c/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/c/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 55
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 94
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 95
    return-void

    .line 59
    :sswitch_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v1}, Lcom/mobvista/sdk/m/a/c/a;->b(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v4}, Lcom/mobvista/sdk/m/a/c/a;->d(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v4}, Lcom/mobvista/sdk/m/a/c/a;->e(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/mobvista/sdk/m/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 67
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 68
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v1}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 69
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v1}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v1

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->b(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/mobvista/sdk/m/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 75
    :sswitch_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    sget v1, Lcom/mobvista/sdk/m/a/c/a;->b:I

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->b(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/mobvista/sdk/m/a/c/d;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :sswitch_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    sget v1, Lcom/mobvista/sdk/m/a/c/a;->c:I

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->b(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/mobvista/sdk/m/a/c/d;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 87
    :sswitch_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;

    move-result-object v0

    sget v1, Lcom/mobvista/sdk/m/a/c/a;->a:I

    iget-object v2, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v2}, Lcom/mobvista/sdk/m/a/c/a;->b(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/a/c/b;->a:Lcom/mobvista/sdk/m/a/c/a;

    invoke-static {v3}, Lcom/mobvista/sdk/m/a/c/a;->c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/mobvista/sdk/m/a/c/d;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 55
    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_1
        0x6e -> :sswitch_3
        0x6f -> :sswitch_4
        0x70 -> :sswitch_2
    .end sparse-switch
.end method
