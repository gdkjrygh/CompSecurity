.class Lcom/facebook/mqtt/a/e;
.super Lcom/facebook/mqtt/a/c;
.source "MessageDecoder.java"


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/messages/h;I)V
    .locals 0

    .prologue
    .line 129
    invoke-direct {p0, p1, p2}, Lcom/facebook/mqtt/a/c;-><init>(Lcom/facebook/mqtt/messages/h;I)V

    .line 130
    return-void
.end method

.method static synthetic a(Lcom/facebook/mqtt/a/e;Ljava/io/DataInputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 126
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/e;->c(Ljava/io/DataInputStream;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/io/DataInputStream;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 133
    sget-object v0, Lcom/facebook/mqtt/a/b;->a:[I

    iget-object v1, p0, Lcom/facebook/mqtt/a/e;->a:Lcom/facebook/mqtt/messages/h;

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/h;->a()Lcom/facebook/mqtt/messages/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 152
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 135
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/e;->d(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/f;

    move-result-object v0

    goto :goto_0

    .line 138
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/e;->e(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/b;

    move-result-object v0

    goto :goto_0

    .line 145
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/e;->f(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/j;

    move-result-object v0

    goto :goto_0

    .line 148
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/e;->g(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/o;

    move-result-object v0

    goto :goto_0

    .line 133
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private d(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/f;
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 158
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/e;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v0

    .line 159
    const-string v3, "MQIsdp"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 160
    invoke-virtual {p1}, Ljava/io/DataInputStream;->close()V

    .line 161
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid input - missing header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_0
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    .line 164
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    .line 165
    iget v4, p0, Lcom/facebook/mqtt/a/e;->b:I

    add-int/lit8 v4, v4, -0x2

    iput v4, p0, Lcom/facebook/mqtt/a/e;->b:I

    .line 166
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/e;->b(Ljava/io/DataInputStream;)I

    move-result v4

    .line 168
    new-instance v5, Lcom/facebook/mqtt/messages/g;

    invoke-direct {v5}, Lcom/facebook/mqtt/messages/g;-><init>()V

    .line 169
    invoke-virtual {v5, v0}, Lcom/facebook/mqtt/messages/g;->a(I)Lcom/facebook/mqtt/messages/g;

    .line 170
    and-int/lit16 v0, v3, 0x80

    const/16 v6, 0x80

    if-ne v0, v6, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v5, v0}, Lcom/facebook/mqtt/messages/g;->a(Z)Lcom/facebook/mqtt/messages/g;

    .line 171
    and-int/lit8 v0, v3, 0x40

    const/16 v6, 0x40

    if-ne v0, v6, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v5, v0}, Lcom/facebook/mqtt/messages/g;->b(Z)Lcom/facebook/mqtt/messages/g;

    .line 172
    and-int/lit8 v0, v3, 0x20

    const/16 v6, 0x20

    if-ne v0, v6, :cond_3

    move v0, v1

    :goto_2
    invoke-virtual {v5, v0}, Lcom/facebook/mqtt/messages/g;->d(Z)Lcom/facebook/mqtt/messages/g;

    .line 173
    and-int/lit8 v0, v3, 0x18

    shr-int/lit8 v0, v0, 0x3

    invoke-virtual {v5, v0}, Lcom/facebook/mqtt/messages/g;->b(I)Lcom/facebook/mqtt/messages/g;

    .line 174
    and-int/lit8 v0, v3, 0x4

    const/4 v6, 0x4

    if-ne v0, v6, :cond_4

    move v0, v1

    :goto_3
    invoke-virtual {v5, v0}, Lcom/facebook/mqtt/messages/g;->c(Z)Lcom/facebook/mqtt/messages/g;

    .line 175
    and-int/lit8 v0, v3, 0x2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_5

    :goto_4
    invoke-virtual {v5, v1}, Lcom/facebook/mqtt/messages/g;->e(Z)Lcom/facebook/mqtt/messages/g;

    .line 176
    invoke-virtual {v5, v4}, Lcom/facebook/mqtt/messages/g;->c(I)Lcom/facebook/mqtt/messages/g;

    .line 177
    invoke-virtual {v5}, Lcom/facebook/mqtt/messages/g;->i()Lcom/facebook/mqtt/messages/f;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v2

    .line 170
    goto :goto_0

    :cond_2
    move v0, v2

    .line 171
    goto :goto_1

    :cond_3
    move v0, v2

    .line 172
    goto :goto_2

    :cond_4
    move v0, v2

    .line 174
    goto :goto_3

    :cond_5
    move v1, v2

    .line 175
    goto :goto_4
.end method

.method private e(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/b;
    .locals 2

    .prologue
    .line 182
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 183
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    .line 184
    iget v1, p0, Lcom/facebook/mqtt/a/e;->b:I

    add-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/facebook/mqtt/a/e;->b:I

    .line 185
    new-instance v1, Lcom/facebook/mqtt/messages/b;

    invoke-direct {v1, v0}, Lcom/facebook/mqtt/messages/b;-><init>(B)V

    return-object v1
.end method

.method private f(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/j;
    .locals 2

    .prologue
    .line 190
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/e;->b(Ljava/io/DataInputStream;)I

    move-result v0

    .line 191
    new-instance v1, Lcom/facebook/mqtt/messages/j;

    invoke-direct {v1, v0}, Lcom/facebook/mqtt/messages/j;-><init>(I)V

    return-object v1
.end method

.method private g(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/o;
    .locals 3

    .prologue
    .line 196
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/e;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v1

    .line 197
    const/4 v0, -0x1

    .line 198
    iget-object v2, p0, Lcom/facebook/mqtt/a/e;->a:Lcom/facebook/mqtt/messages/h;

    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/h;->c()I

    move-result v2

    if-lez v2, :cond_0

    .line 199
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/e;->b(Ljava/io/DataInputStream;)I

    move-result v0

    .line 201
    :cond_0
    new-instance v2, Lcom/facebook/mqtt/messages/o;

    invoke-direct {v2, v1, v0}, Lcom/facebook/mqtt/messages/o;-><init>(Ljava/lang/String;I)V

    return-object v2
.end method
