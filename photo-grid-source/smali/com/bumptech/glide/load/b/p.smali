.class final Lcom/bumptech/glide/load/b/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:Lcom/bumptech/glide/load/e;

.field private final e:Lcom/bumptech/glide/load/e;

.field private final f:Lcom/bumptech/glide/load/g;

.field private final g:Lcom/bumptech/glide/load/f;

.field private final h:Lcom/bumptech/glide/load/resource/e/c;

.field private final i:Lcom/bumptech/glide/load/b;

.field private final j:Lcom/bumptech/glide/load/c;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Lcom/bumptech/glide/load/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bumptech/glide/load/c;IILcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/f;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/load/b;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/bumptech/glide/load/b/p;->a:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lcom/bumptech/glide/load/b/p;->j:Lcom/bumptech/glide/load/c;

    .line 36
    iput p3, p0, Lcom/bumptech/glide/load/b/p;->b:I

    .line 37
    iput p4, p0, Lcom/bumptech/glide/load/b/p;->c:I

    .line 38
    iput-object p5, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    .line 39
    iput-object p6, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    .line 40
    iput-object p7, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    .line 41
    iput-object p8, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    .line 42
    iput-object p9, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    .line 43
    iput-object p10, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    .line 44
    return-void
.end method


# virtual methods
.method public final a()Lcom/bumptech/glide/load/c;
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->m:Lcom/bumptech/glide/load/c;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/bumptech/glide/load/b/w;

    iget-object v1, p0, Lcom/bumptech/glide/load/b/p;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/bumptech/glide/load/b/p;->j:Lcom/bumptech/glide/load/c;

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/b/w;-><init>(Ljava/lang/String;Lcom/bumptech/glide/load/c;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/p;->m:Lcom/bumptech/glide/load/c;

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->m:Lcom/bumptech/glide/load/c;

    return-object v0
.end method

.method public final a(Ljava/security/MessageDigest;)V
    .locals 3

    .prologue
    .line 161
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/load/b/p;->b:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/load/b/p;->c:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 165
    iget-object v1, p0, Lcom/bumptech/glide/load/b/p;->j:Lcom/bumptech/glide/load/c;

    invoke-interface {v1, p1}, Lcom/bumptech/glide/load/c;->a(Ljava/security/MessageDigest;)V

    .line 166
    iget-object v1, p0, Lcom/bumptech/glide/load/b/p;->a:Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 167
    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 168
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 169
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 170
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    invoke-interface {v0}, Lcom/bumptech/glide/load/g;->a()Ljava/lang/String;

    move-result-object v0

    :goto_2
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 171
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    invoke-interface {v0}, Lcom/bumptech/glide/load/f;->a()Ljava/lang/String;

    move-result-object v0

    :goto_3
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 173
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b;->a()Ljava/lang/String;

    move-result-object v0

    :goto_4
    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 174
    return-void

    .line 168
    :cond_0
    const-string v0, ""

    goto :goto_0

    .line 169
    :cond_1
    const-string v0, ""

    goto :goto_1

    .line 170
    :cond_2
    const-string v0, ""

    goto :goto_2

    .line 171
    :cond_3
    const-string v0, ""

    goto :goto_3

    .line 173
    :cond_4
    const-string v0, ""

    goto :goto_4
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 55
    if-ne p0, p1, :cond_1

    move v2, v1

    .line 97
    :cond_0
    :goto_0
    return v2

    .line 58
    :cond_1
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v0, v3, :cond_0

    .line 62
    check-cast p1, Lcom/bumptech/glide/load/b/p;

    .line 64
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->j:Lcom/bumptech/glide/load/c;

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->j:Lcom/bumptech/glide/load/c;

    invoke-interface {v0, v3}, Lcom/bumptech/glide/load/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->c:I

    iget v3, p1, Lcom/bumptech/glide/load/b/p;->c:I

    if-ne v0, v3, :cond_0

    .line 70
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->b:I

    iget v3, p1, Lcom/bumptech/glide/load/b/p;->b:I

    if-ne v0, v3, :cond_0

    .line 72
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    if-nez v0, :cond_8

    move v0, v1

    :goto_1
    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    if-nez v3, :cond_9

    move v3, v1

    :goto_2
    xor-int/2addr v0, v3

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    invoke-interface {v0}, Lcom/bumptech/glide/load/g;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    invoke-interface {v3}, Lcom/bumptech/glide/load/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    if-nez v0, :cond_a

    move v0, v1

    :goto_3
    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    if-nez v3, :cond_b

    move v3, v1

    :goto_4
    xor-int/2addr v0, v3

    if-nez v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    invoke-interface {v3}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    if-nez v0, :cond_c

    move v0, v1

    :goto_5
    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    if-nez v3, :cond_d

    move v3, v1

    :goto_6
    xor-int/2addr v0, v3

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    invoke-interface {v3}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    if-nez v0, :cond_e

    move v0, v1

    :goto_7
    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    if-nez v3, :cond_f

    move v3, v1

    :goto_8
    xor-int/2addr v0, v3

    if-nez v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    invoke-interface {v0}, Lcom/bumptech/glide/load/f;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    invoke-interface {v3}, Lcom/bumptech/glide/load/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    :cond_5
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    if-nez v0, :cond_10

    move v0, v1

    :goto_9
    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    if-nez v3, :cond_11

    move v3, v1

    :goto_a
    xor-int/2addr v0, v3

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/resource/e/c;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    invoke-interface {v3}, Lcom/bumptech/glide/load/resource/e/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    :cond_6
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    if-nez v0, :cond_12

    move v0, v1

    :goto_b
    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    if-nez v3, :cond_13

    move v3, v1

    :goto_c
    xor-int/2addr v0, v3

    if-nez v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p1, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    invoke-interface {v3}, Lcom/bumptech/glide/load/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_7
    move v2, v1

    .line 97
    goto/16 :goto_0

    :cond_8
    move v0, v2

    .line 72
    goto/16 :goto_1

    :cond_9
    move v3, v2

    goto/16 :goto_2

    :cond_a
    move v0, v2

    .line 76
    goto/16 :goto_3

    :cond_b
    move v3, v2

    goto/16 :goto_4

    :cond_c
    move v0, v2

    .line 80
    goto/16 :goto_5

    :cond_d
    move v3, v2

    goto/16 :goto_6

    :cond_e
    move v0, v2

    .line 84
    goto :goto_7

    :cond_f
    move v3, v2

    goto :goto_8

    :cond_10
    move v0, v2

    .line 88
    goto :goto_9

    :cond_11
    move v3, v2

    goto :goto_a

    :cond_12
    move v0, v2

    .line 92
    goto :goto_b

    :cond_13
    move v3, v2

    goto :goto_c
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 102
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    if-nez v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 104
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/bumptech/glide/load/b/p;->j:Lcom/bumptech/glide/load/c;

    invoke-interface {v2}, Lcom/bumptech/glide/load/c;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 105
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/bumptech/glide/load/b/p;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 106
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/bumptech/glide/load/b/p;->c:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 107
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 108
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 109
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    invoke-interface {v0}, Lcom/bumptech/glide/load/g;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 110
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    invoke-interface {v0}, Lcom/bumptech/glide/load/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 111
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/resource/e/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v0, v2

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 112
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    invoke-interface {v1}, Lcom/bumptech/glide/load/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    iput v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    .line 114
    :cond_1
    iget v0, p0, Lcom/bumptech/glide/load/b/p;->l:I

    return v0

    :cond_2
    move v0, v1

    .line 107
    goto :goto_0

    :cond_3
    move v0, v1

    .line 108
    goto :goto_1

    :cond_4
    move v0, v1

    .line 109
    goto :goto_2

    :cond_5
    move v0, v1

    .line 110
    goto :goto_3

    :cond_6
    move v0, v1

    .line 111
    goto :goto_4
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v3, 0x2b

    const/16 v2, 0x27

    .line 119
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EngineKey{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/b/p;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/load/b/p;->j:Lcom/bumptech/glide/load/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "+["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/load/b/p;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/load/b/p;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]+\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->d:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->e:Lcom/bumptech/glide/load/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/e;->a()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->f:Lcom/bumptech/glide/load/g;

    invoke-interface {v0}, Lcom/bumptech/glide/load/g;->a()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->g:Lcom/bumptech/glide/load/f;

    invoke-interface {v0}, Lcom/bumptech/glide/load/f;->a()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->h:Lcom/bumptech/glide/load/resource/e/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/resource/e/c;->a()Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->i:Lcom/bumptech/glide/load/b;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b;->a()Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/b/p;->k:Ljava/lang/String;

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/p;->k:Ljava/lang/String;

    return-object v0

    .line 120
    :cond_1
    const-string v0, ""

    goto/16 :goto_0

    :cond_2
    const-string v0, ""

    goto/16 :goto_1

    :cond_3
    const-string v0, ""

    goto :goto_2

    :cond_4
    const-string v0, ""

    goto :goto_3

    :cond_5
    const-string v0, ""

    goto :goto_4

    :cond_6
    const-string v0, ""

    goto :goto_5
.end method
