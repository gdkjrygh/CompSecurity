.class public Lcom/facebook/zero/server/c;
.super Lcom/facebook/common/s/a;
.source "NetworkType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/s/a",
        "<",
        "Lcom/facebook/zero/server/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/common/s/a;-><init>(Ljava/lang/String;)V

    .line 17
    return-void
.end method

.method public static a(I)Lcom/facebook/zero/server/c;
    .locals 1

    .prologue
    .line 25
    packed-switch p0, :pswitch_data_0

    .line 46
    :pswitch_0
    sget-object v0, Lcom/facebook/zero/a/b;->a:Lcom/facebook/zero/server/c;

    :goto_0
    return-object v0

    .line 27
    :pswitch_1
    sget-object v0, Lcom/facebook/zero/a/b;->b:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 29
    :pswitch_2
    sget-object v0, Lcom/facebook/zero/a/b;->c:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 31
    :pswitch_3
    sget-object v0, Lcom/facebook/zero/a/b;->d:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 33
    :pswitch_4
    sget-object v0, Lcom/facebook/zero/a/b;->e:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 35
    :pswitch_5
    sget-object v0, Lcom/facebook/zero/a/b;->f:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 37
    :pswitch_6
    sget-object v0, Lcom/facebook/zero/a/b;->g:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 39
    :pswitch_7
    sget-object v0, Lcom/facebook/zero/a/b;->h:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 41
    :pswitch_8
    sget-object v0, Lcom/facebook/zero/a/b;->i:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 43
    :pswitch_9
    sget-object v0, Lcom/facebook/zero/a/b;->j:Lcom/facebook/zero/server/c;

    goto :goto_0

    .line 25
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_8
        :pswitch_6
        :pswitch_7
        :pswitch_4
        :pswitch_5
        :pswitch_9
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/zero/server/c;
    .locals 1

    .prologue
    .line 21
    new-instance v0, Lcom/facebook/zero/server/c;

    invoke-direct {v0, p1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Ljava/lang/String;)Lcom/facebook/common/s/a;
    .locals 1

    .prologue
    .line 13
    invoke-virtual {p0, p1}, Lcom/facebook/zero/server/c;->a(Ljava/lang/String;)Lcom/facebook/zero/server/c;

    move-result-object v0

    return-object v0
.end method
