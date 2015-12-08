.class public Lcom/flurry/sdk/iw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/flurry/sdk/iw;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/iw;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    return-void
.end method

.method synthetic constructor <init>(Lcom/flurry/sdk/iw$1;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/flurry/sdk/iw;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/flurry/sdk/ix;)V
    .locals 10

    .prologue
    const/4 v5, 0x0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    const/4 v3, 0x0

    .line 97
    :try_start_0
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 98
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, v8}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 100
    const/4 v2, 0x7

    :try_start_1
    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 101
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->b()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 103
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->c()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 104
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->d()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 107
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 110
    const/4 v2, -0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 112
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 113
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 114
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 119
    :goto_0
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 120
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 121
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 128
    :goto_1
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->h()Ljava/util/Map;

    move-result-object v2

    .line 129
    if-nez v2, :cond_6

    .line 130
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 140
    :cond_0
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->e()Ljava/util/Map;

    move-result-object v2

    .line 141
    if-nez v2, :cond_7

    .line 142
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 152
    :cond_1
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 153
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->k()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 155
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->l()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 156
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 158
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->n()Landroid/location/Location;

    move-result-object v2

    if-nez v2, :cond_8

    .line 159
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 167
    :goto_2
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->o()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 168
    const/4 v2, -0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 169
    const/4 v2, -0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 170
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->p()B

    move-result v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 171
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->q()Ljava/lang/Long;

    move-result-object v2

    if-nez v2, :cond_9

    .line 172
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 178
    :goto_3
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->r()Ljava/util/Map;

    move-result-object v2

    .line 179
    if-nez v2, :cond_a

    .line 180
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 189
    :cond_2
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->s()Ljava/util/List;

    move-result-object v2

    .line 190
    if-nez v2, :cond_b

    .line 191
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 198
    :cond_3
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->t()Z

    move-result v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 203
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->v()Ljava/util/List;

    move-result-object v9

    .line 204
    if-eqz v9, :cond_f

    move v6, v5

    move v3, v5

    move v7, v5

    .line 205
    :goto_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    if-ge v6, v2, :cond_e

    .line 206
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/flurry/sdk/ir;

    invoke-virtual {v2}, Lcom/flurry/sdk/ir;->a()I

    move-result v2

    add-int/2addr v7, v2

    .line 207
    const v2, 0x27100

    if-le v7, v2, :cond_c

    .line 208
    const/4 v2, 0x5

    sget-object v6, Lcom/flurry/sdk/iw;->b:Ljava/lang/String;

    const-string v7, "Error Log size exceeded. No more event details logged."

    invoke-static {v2, v6, v7}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    move v6, v3

    .line 217
    :goto_5
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->u()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 218
    invoke-virtual {v4, v6}, Ljava/io/DataOutputStream;->writeShort(I)V

    move v3, v5

    .line 219
    :goto_6
    if-ge v3, v6, :cond_d

    .line 220
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/flurry/sdk/ir;

    invoke-virtual {v2}, Lcom/flurry/sdk/ir;->b()[B

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->write([B)V

    .line 219
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_6

    .line 116
    :cond_4
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_0

    .line 246
    :catch_0
    move-exception v2

    move-object v3, v4

    .line 247
    :goto_7
    const/4 v4, 0x6

    :try_start_2
    sget-object v5, Lcom/flurry/sdk/iw;->b:Ljava/lang/String;

    const-string v6, ""

    invoke-static {v4, v5, v6, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 248
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 250
    :catchall_0
    move-exception v2

    move-object v4, v3

    :goto_8
    invoke-static {v4}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v2

    .line 123
    :cond_5
    const/4 v2, 0x0

    :try_start_3
    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    goto/16 :goto_1

    .line 250
    :catchall_1
    move-exception v2

    goto :goto_8

    .line 132
    :cond_6
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 133
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 134
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 135
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_9

    .line 144
    :cond_7
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 145
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/util/Map$Entry;

    move-object v3, v0

    .line 146
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 147
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 148
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    goto :goto_a

    .line 161
    :cond_8
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 162
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->n()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    const/4 v6, 0x3

    invoke-static {v2, v3, v6}, Lcom/flurry/sdk/lp;->a(DI)D

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Ljava/io/DataOutputStream;->writeDouble(D)V

    .line 163
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->n()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    const/4 v6, 0x3

    invoke-static {v2, v3, v6}, Lcom/flurry/sdk/lp;->a(DI)D

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Ljava/io/DataOutputStream;->writeDouble(D)V

    .line 164
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->n()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeFloat(F)V

    goto/16 :goto_2

    .line 174
    :cond_9
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 175
    invoke-virtual {p1}, Lcom/flurry/sdk/ix;->q()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    goto/16 :goto_3

    .line 182
    :cond_a
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 183
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/util/Map$Entry;

    move-object v3, v0

    .line 184
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 185
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/flurry/sdk/is;

    iget v2, v2, Lcom/flurry/sdk/is;->a:I

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    goto :goto_b

    .line 193
    :cond_b
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 194
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/flurry/sdk/it;

    .line 195
    invoke-virtual {v2}, Lcom/flurry/sdk/it;->e()[B

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_c

    .line 212
    :cond_c
    add-int/lit8 v3, v3, 0x1

    .line 205
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    goto/16 :goto_4

    .line 236
    :cond_d
    const/4 v2, -0x1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 237
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 240
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 243
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 245
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    iput-object v2, p0, Lcom/flurry/sdk/iw;->a:[B
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 250
    invoke-static {v4}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    .line 251
    return-void

    .line 250
    :catchall_2
    move-exception v2

    move-object v4, v3

    goto/16 :goto_8

    .line 246
    :catch_1
    move-exception v2

    goto/16 :goto_7

    :cond_e
    move v6, v3

    goto/16 :goto_5

    :cond_f
    move v6, v5

    goto/16 :goto_5
.end method

.method public constructor <init>([B)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Lcom/flurry/sdk/iw;->a:[B

    .line 92
    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    .prologue
    .line 255
    iget-object v0, p0, Lcom/flurry/sdk/iw;->a:[B

    return-object v0
.end method
