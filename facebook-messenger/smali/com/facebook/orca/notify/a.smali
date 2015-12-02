.class public Lcom/facebook/orca/notify/a;
.super Ljava/lang/Object;
.source "AbstractMessagingNotificationHandler.java"

# interfaces
.implements Lcom/facebook/orca/notify/am;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 66
    return-void
.end method

.method public final a(Lcom/facebook/orca/notify/ai;)V
    .locals 2

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/orca/notify/b;->a:[I

    iget-object v1, p1, Lcom/facebook/orca/notify/ai;->a:Lcom/facebook/orca/notify/aj;

    invoke-virtual {v1}, Lcom/facebook/orca/notify/aj;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 34
    :goto_0
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Lcom/facebook/orca/notify/ap;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->a(Lcom/facebook/orca/notify/ap;)V

    goto :goto_0

    .line 19
    :pswitch_1
    check-cast p1, Lcom/facebook/orca/notify/w;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->a(Lcom/facebook/orca/notify/w;)V

    goto :goto_0

    .line 22
    :pswitch_2
    check-cast p1, Lcom/facebook/orca/push/a;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->a(Lcom/facebook/orca/push/a;)V

    goto :goto_0

    .line 25
    :pswitch_3
    check-cast p1, Lcom/facebook/orca/notify/i;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->a(Lcom/facebook/orca/notify/i;)V

    goto :goto_0

    .line 28
    :pswitch_4
    check-cast p1, Lcom/facebook/orca/notify/bi;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->a(Lcom/facebook/orca/notify/bi;)V

    goto :goto_0

    .line 31
    :pswitch_5
    check-cast p1, Lcom/facebook/orca/notify/ao;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->a(Lcom/facebook/orca/notify/ao;)V

    goto :goto_0

    .line 14
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public a(Lcom/facebook/orca/notify/aj;)V
    .locals 0

    .prologue
    .line 62
    return-void
.end method

.method protected a(Lcom/facebook/orca/notify/ao;)V
    .locals 0

    .prologue
    .line 88
    return-void
.end method

.method protected a(Lcom/facebook/orca/notify/ap;)V
    .locals 0

    .prologue
    .line 73
    return-void
.end method

.method protected a(Lcom/facebook/orca/notify/bi;)V
    .locals 0

    .prologue
    .line 85
    return-void
.end method

.method protected a(Lcom/facebook/orca/notify/i;)V
    .locals 0

    .prologue
    .line 82
    return-void
.end method

.method protected a(Lcom/facebook/orca/notify/w;)V
    .locals 0

    .prologue
    .line 76
    return-void
.end method

.method protected a(Lcom/facebook/orca/push/a;)V
    .locals 0

    .prologue
    .line 79
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 70
    return-void
.end method

.method public final b(Lcom/facebook/orca/notify/ai;)V
    .locals 2

    .prologue
    .line 38
    sget-object v0, Lcom/facebook/orca/notify/b;->a:[I

    iget-object v1, p1, Lcom/facebook/orca/notify/ai;->a:Lcom/facebook/orca/notify/aj;

    invoke-virtual {v1}, Lcom/facebook/orca/notify/aj;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 58
    :goto_0
    return-void

    .line 40
    :pswitch_0
    check-cast p1, Lcom/facebook/orca/notify/ap;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->b(Lcom/facebook/orca/notify/ap;)V

    goto :goto_0

    .line 43
    :pswitch_1
    check-cast p1, Lcom/facebook/orca/notify/w;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->b(Lcom/facebook/orca/notify/w;)V

    goto :goto_0

    .line 46
    :pswitch_2
    check-cast p1, Lcom/facebook/orca/push/a;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->b(Lcom/facebook/orca/push/a;)V

    goto :goto_0

    .line 49
    :pswitch_3
    check-cast p1, Lcom/facebook/orca/notify/i;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->b(Lcom/facebook/orca/notify/i;)V

    goto :goto_0

    .line 52
    :pswitch_4
    check-cast p1, Lcom/facebook/orca/notify/bi;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->b(Lcom/facebook/orca/notify/bi;)V

    goto :goto_0

    .line 55
    :pswitch_5
    check-cast p1, Lcom/facebook/orca/notify/ao;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/notify/a;->b(Lcom/facebook/orca/notify/ao;)V

    goto :goto_0

    .line 38
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method protected b(Lcom/facebook/orca/notify/ao;)V
    .locals 0

    .prologue
    .line 106
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/ap;)V
    .locals 0

    .prologue
    .line 91
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/bi;)V
    .locals 0

    .prologue
    .line 103
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/i;)V
    .locals 0

    .prologue
    .line 100
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/w;)V
    .locals 0

    .prologue
    .line 94
    return-void
.end method

.method protected b(Lcom/facebook/orca/push/a;)V
    .locals 0

    .prologue
    .line 97
    return-void
.end method
