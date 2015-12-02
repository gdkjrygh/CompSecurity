.class public final Lcom/google/common/b/b;
.super Ljava/lang/Object;
.source "CharStreams.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Readable;Ljava/lang/Appendable;)J
    .locals 5

    .prologue
    .line 199
    const/16 v0, 0x800

    invoke-static {v0}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v2

    .line 200
    const-wide/16 v0, 0x0

    .line 202
    :goto_0
    invoke-interface {p0, v2}, Ljava/lang/Readable;->read(Ljava/nio/CharBuffer;)I

    move-result v3

    .line 203
    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    .line 210
    return-wide v0

    .line 206
    :cond_0
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    .line 207
    const/4 v4, 0x0

    invoke-interface {p1, v2, v4, v3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    .line 208
    int-to-long v3, v3

    add-long/2addr v0, v3

    .line 209
    goto :goto_0
.end method

.method public static a(Ljava/lang/Readable;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 222
    invoke-static {p0}, Lcom/google/common/b/b;->b(Ljava/lang/Readable;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/Readable;)Ljava/lang/StringBuilder;
    .locals 1

    .prologue
    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    invoke-static {p0, v0}, Lcom/google/common/b/b;->a(Ljava/lang/Readable;Ljava/lang/Appendable;)J

    .line 249
    return-object v0
.end method
