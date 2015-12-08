.class public Lcom/flurry/sdk/ig$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/kx",
        "<",
        "Lcom/flurry/sdk/ig;",
        ">;"
    }
.end annotation


# instance fields
.field a:Lcom/flurry/sdk/kw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/kw",
            "<",
            "Lcom/flurry/sdk/ih;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    new-instance v0, Lcom/flurry/sdk/kw;

    new-instance v1, Lcom/flurry/sdk/ih$a;

    invoke-direct {v1}, Lcom/flurry/sdk/ih$a;-><init>()V

    invoke-direct {v0, v1}, Lcom/flurry/sdk/kw;-><init>(Lcom/flurry/sdk/kx;)V

    iput-object v0, p0, Lcom/flurry/sdk/ig$a;->a:Lcom/flurry/sdk/kw;

    .line 155
    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Lcom/flurry/sdk/ig;
    .locals 22

    .prologue
    .line 229
    if-nez p1, :cond_0

    .line 230
    const/4 v4, 0x0

    .line 285
    :goto_0
    return-object v4

    .line 233
    :cond_0
    new-instance v18, Lcom/flurry/sdk/ig$a$2;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lcom/flurry/sdk/ig$a$2;-><init>(Lcom/flurry/sdk/ig$a;Ljava/io/InputStream;)V

    .line 240
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v5

    .line 241
    const-string v4, ""

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 242
    const/4 v5, 0x0

    .line 245
    :cond_1
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v8

    .line 246
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v9

    .line 247
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readInt()I

    move-result v19

    .line 248
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v6

    .line 249
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readInt()I

    move-result v11

    .line 250
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readInt()I

    move-result v12

    .line 251
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    invoke-static {v4}, Lcom/flurry/sdk/in;->a(I)Lcom/flurry/sdk/in;

    move-result-object v13

    .line 253
    const/4 v14, 0x0

    .line 254
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readInt()I

    move-result v15

    .line 256
    if-eqz v15, :cond_2

    .line 257
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 259
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v15, :cond_2

    .line 260
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 264
    :cond_2
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v20

    .line 265
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readInt()I

    move-result v15

    .line 266
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readInt()I

    move-result v16

    .line 267
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v17

    .line 268
    const-string v4, ""

    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 269
    const/16 v17, 0x0

    .line 272
    :cond_3
    invoke-virtual/range {v18 .. v18}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v18

    .line 274
    new-instance v4, Lcom/flurry/sdk/ig;

    invoke-direct/range {v4 .. v17}, Lcom/flurry/sdk/ig;-><init>(Ljava/lang/String;JLjava/lang/String;JIILcom/flurry/sdk/in;Ljava/util/Map;IILjava/lang/String;)V

    .line 277
    move-wide/from16 v0, v20

    invoke-static {v4, v0, v1}, Lcom/flurry/sdk/ig;->a(Lcom/flurry/sdk/ig;J)J

    .line 278
    move/from16 v0, v18

    invoke-static {v4, v0}, Lcom/flurry/sdk/ig;->a(Lcom/flurry/sdk/ig;Z)Z

    .line 279
    move/from16 v0, v19

    invoke-virtual {v4, v0}, Lcom/flurry/sdk/ig;->b(I)V

    .line 281
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/flurry/sdk/ig$a;->a:Lcom/flurry/sdk/kw;

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Lcom/flurry/sdk/kw;->a(Ljava/io/InputStream;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    .line 282
    iput-object v5, v4, Lcom/flurry/sdk/ig;->a:Ljava/util/ArrayList;

    .line 283
    invoke-virtual {v4}, Lcom/flurry/sdk/ig;->o()V

    goto/16 :goto_0
.end method

.method public a(Ljava/io/OutputStream;Lcom/flurry/sdk/ig;)V
    .locals 4

    .prologue
    .line 159
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 225
    :cond_0
    :goto_0
    return-void

    .line 163
    :cond_1
    new-instance v1, Lcom/flurry/sdk/ig$a$1;

    invoke-direct {v1, p0, p1}, Lcom/flurry/sdk/ig$a$1;-><init>(Lcom/flurry/sdk/ig$a;Ljava/io/OutputStream;)V

    .line 170
    invoke-static {p2}, Lcom/flurry/sdk/ig;->a(Lcom/flurry/sdk/ig;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 171
    invoke-static {p2}, Lcom/flurry/sdk/ig;->a(Lcom/flurry/sdk/ig;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 177
    :goto_1
    invoke-virtual {p2}, Lcom/flurry/sdk/ig;->t()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 178
    invoke-virtual {p2}, Lcom/flurry/sdk/ig;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 184
    :goto_2
    invoke-virtual {p2}, Lcom/flurry/sdk/ig;->p()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 185
    invoke-virtual {p2}, Lcom/flurry/sdk/ig;->r()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 186
    invoke-static {p2}, Lcom/flurry/sdk/ig;->b(Lcom/flurry/sdk/ig;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 187
    invoke-static {p2}, Lcom/flurry/sdk/ig;->c(Lcom/flurry/sdk/ig;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 188
    invoke-static {p2}, Lcom/flurry/sdk/ig;->d(Lcom/flurry/sdk/ig;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 189
    invoke-static {p2}, Lcom/flurry/sdk/ig;->e(Lcom/flurry/sdk/ig;)Lcom/flurry/sdk/in;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/in;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 191
    invoke-static {p2}, Lcom/flurry/sdk/ig;->f(Lcom/flurry/sdk/ig;)Ljava/util/Map;

    move-result-object v2

    .line 192
    if-eqz v2, :cond_4

    .line 193
    invoke-static {p2}, Lcom/flurry/sdk/ig;->f(Lcom/flurry/sdk/ig;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 195
    invoke-static {p2}, Lcom/flurry/sdk/ig;->f(Lcom/flurry/sdk/ig;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 196
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 198
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 199
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 201
    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 202
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_3

    .line 174
    :cond_2
    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_1

    .line 181
    :cond_3
    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_2

    .line 206
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 209
    :cond_5
    invoke-static {p2}, Lcom/flurry/sdk/ig;->g(Lcom/flurry/sdk/ig;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 210
    invoke-static {p2}, Lcom/flurry/sdk/ig;->h(Lcom/flurry/sdk/ig;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 211
    invoke-static {p2}, Lcom/flurry/sdk/ig;->i(Lcom/flurry/sdk/ig;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 213
    invoke-static {p2}, Lcom/flurry/sdk/ig;->j(Lcom/flurry/sdk/ig;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 214
    invoke-static {p2}, Lcom/flurry/sdk/ig;->j(Lcom/flurry/sdk/ig;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 220
    :goto_4
    invoke-static {p2}, Lcom/flurry/sdk/ig;->k(Lcom/flurry/sdk/ig;)Z

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 222
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 224
    iget-object v0, p0, Lcom/flurry/sdk/ig$a;->a:Lcom/flurry/sdk/kw;

    iget-object v1, p2, Lcom/flurry/sdk/ig;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, v1}, Lcom/flurry/sdk/kw;->a(Ljava/io/OutputStream;Ljava/util/List;)V

    goto/16 :goto_0

    .line 217
    :cond_6
    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_4
.end method

.method public bridge synthetic a(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 150
    check-cast p2, Lcom/flurry/sdk/ig;

    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/ig$a;->a(Ljava/io/OutputStream;Lcom/flurry/sdk/ig;)V

    return-void
.end method

.method public synthetic b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0, p1}, Lcom/flurry/sdk/ig$a;->a(Ljava/io/InputStream;)Lcom/flurry/sdk/ig;

    move-result-object v0

    return-object v0
.end method
