.class public Lcom/facebook/mqtt/a/h;
.super Ljava/lang/Object;
.source "MessageFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/mqtt/messages/l;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 30
    sget-object v0, Lcom/facebook/mqtt/a/i;->a:[I

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/h;->a()Lcom/facebook/mqtt/messages/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 70
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown message type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/h;->a()Lcom/facebook/mqtt/messages/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :pswitch_0
    new-instance v0, Lcom/facebook/mqtt/messages/c;

    check-cast p2, Lcom/facebook/mqtt/messages/f;

    check-cast p3, Lcom/facebook/mqtt/messages/d;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/mqtt/messages/c;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/f;Lcom/facebook/mqtt/messages/d;)V

    .line 67
    :goto_0
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, Lcom/facebook/mqtt/messages/a;

    check-cast p2, Lcom/facebook/mqtt/messages/b;

    invoke-direct {v0, p1, p2}, Lcom/facebook/mqtt/messages/a;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/b;)V

    goto :goto_0

    .line 39
    :pswitch_2
    new-instance v0, Lcom/facebook/mqtt/messages/r;

    check-cast p2, Lcom/facebook/mqtt/messages/j;

    check-cast p3, Lcom/facebook/mqtt/messages/s;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/mqtt/messages/r;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;Lcom/facebook/mqtt/messages/s;)V

    goto :goto_0

    .line 43
    :pswitch_3
    new-instance v0, Lcom/facebook/mqtt/messages/p;

    check-cast p2, Lcom/facebook/mqtt/messages/j;

    check-cast p3, Lcom/facebook/mqtt/messages/q;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/mqtt/messages/p;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;Lcom/facebook/mqtt/messages/q;)V

    goto :goto_0

    .line 47
    :pswitch_4
    new-instance v0, Lcom/facebook/mqtt/messages/v;

    check-cast p2, Lcom/facebook/mqtt/messages/j;

    check-cast p3, Lcom/facebook/mqtt/messages/w;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/mqtt/messages/v;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;Lcom/facebook/mqtt/messages/w;)V

    goto :goto_0

    .line 51
    :pswitch_5
    new-instance v0, Lcom/facebook/mqtt/messages/n;

    check-cast p2, Lcom/facebook/mqtt/messages/o;

    check-cast p3, [B

    check-cast p3, [B

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/mqtt/messages/n;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/o;[B)V

    goto :goto_0

    .line 55
    :pswitch_6
    new-instance v0, Lcom/facebook/mqtt/messages/l;

    invoke-direct {v0, p1, v2, v2}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 58
    :pswitch_7
    new-instance v0, Lcom/facebook/mqtt/messages/l;

    invoke-direct {v0, p1, v2, v2}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 61
    :pswitch_8
    new-instance v0, Lcom/facebook/mqtt/messages/l;

    invoke-direct {v0, p1, v2, v2}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 64
    :pswitch_9
    new-instance v0, Lcom/facebook/mqtt/messages/m;

    check-cast p2, Lcom/facebook/mqtt/messages/j;

    invoke-direct {v0, p1, p2}, Lcom/facebook/mqtt/messages/m;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;)V

    goto :goto_0

    .line 67
    :pswitch_a
    new-instance v0, Lcom/facebook/mqtt/messages/u;

    check-cast p2, Lcom/facebook/mqtt/messages/j;

    invoke-direct {v0, p1, p2}, Lcom/facebook/mqtt/messages/u;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;)V

    goto :goto_0

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method
