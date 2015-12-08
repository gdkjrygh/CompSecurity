.class public abstract Lcom/c/a/c/b$a;
.super Lcom/c/a/c/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/nio/ByteBuffer;

.field private final b:I

.field private final c:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/c/a/c/b$a;-><init>(B)V

    .line 96
    return-void
.end method

.method private constructor <init>(B)V
    .locals 3

    .prologue
    const/16 v2, 0x10

    .line 107
    invoke-direct {p0}, Lcom/c/a/c/a;-><init>()V

    .line 109
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/c/a/a/u;->a(Z)V

    .line 112
    const/16 v0, 0x17

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    .line 115
    iput v2, p0, Lcom/c/a/c/b$a;->b:I

    .line 116
    iput v2, p0, Lcom/c/a/c/b$a;->c:I

    .line 117
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 249
    :goto_0
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    iget v1, p0, Lcom/c/a/c/b$a;->c:I

    if-lt v0, v1, :cond_0

    .line 252
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/c/a/c/b$a;->a(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 255
    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/c/i;
    .locals 1

    .prologue
    .line 229
    invoke-direct {p0}, Lcom/c/a/c/b$a;->c()V

    .line 230
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 231
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    if-lez v0, :cond_0

    .line 232
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/c/a/c/b$a;->b(Ljava/nio/ByteBuffer;)V

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/c/a/c/b$a;->b()Lcom/c/a/c/i;

    move-result-object v0

    return-object v0
.end method

.method public final a(C)Lcom/c/a/c/k;
    .locals 2

    .prologue
    .line 202
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    .line 203
    iget-object v0, p0, Lcom/c/a/c/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Lcom/c/a/c/b$a;->c()V

    .line 204
    :cond_0
    return-object p0
.end method

.method public final a(Ljava/lang/CharSequence;)Lcom/c/a/c/k;
    .locals 2

    .prologue
    .line 180
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 181
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Lcom/c/a/c/b$a;->a(C)Lcom/c/a/c/k;

    .line 180
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 183
    :cond_0
    return-object p0
.end method

.method public final a(Ljava/lang/Object;Lcom/c/a/c/g;)Lcom/c/a/c/k;
    .locals 0

    .prologue
    .line 223
    invoke-interface {p2, p1, p0}, Lcom/c/a/c/g;->a(Ljava/lang/Object;Lcom/c/a/c/n;)V

    .line 224
    return-object p0
.end method

.method protected abstract a(Ljava/nio/ByteBuffer;)V
.end method

.method abstract b()Lcom/c/a/c/i;
.end method

.method public final synthetic b(Ljava/lang/CharSequence;)Lcom/c/a/c/n;
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p0, p1}, Lcom/c/a/c/b$a;->a(Ljava/lang/CharSequence;)Lcom/c/a/c/k;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/nio/ByteBuffer;)V
    .locals 2

    .prologue
    .line 133
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 134
    iget v0, p0, Lcom/c/a/c/b$a;->c:I

    add-int/lit8 v0, v0, 0x7

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 135
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    iget v1, p0, Lcom/c/a/c/b$a;->c:I

    if-ge v0, v1, :cond_0

    .line 136
    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 138
    :cond_0
    iget v0, p0, Lcom/c/a/c/b$a;->c:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 139
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 140
    invoke-virtual {p0, p1}, Lcom/c/a/c/b$a;->a(Ljava/nio/ByteBuffer;)V

    .line 141
    return-void
.end method
