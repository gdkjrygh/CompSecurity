.class public final Lcom/c/b/au;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/au$c;,
        Lcom/c/b/au$b;,
        Lcom/c/b/au$a;
    }
.end annotation


# static fields
.field protected static final a:Ljava/nio/charset/Charset;

.field protected static final b:Ljava/nio/charset/Charset;

.field public static final c:[B

.field public static final d:Ljava/nio/ByteBuffer;

.field public static final e:Lcom/c/b/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 55
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/c/b/au;->a:Ljava/nio/charset/Charset;

    .line 56
    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/c/b/au;->b:Ljava/nio/charset/Charset;

    .line 364
    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 369
    sput-object v0, Lcom/c/b/au;->c:[B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sput-object v0, Lcom/c/b/au;->d:Ljava/nio/ByteBuffer;

    .line 373
    sget-object v0, Lcom/c/b/au;->c:[B

    array-length v1, v0

    invoke-static {v0, v1}, Lcom/c/b/g;->a([BI)Lcom/c/b/g;

    move-result-object v0

    sput-object v0, Lcom/c/b/au;->e:Lcom/c/b/g;

    return-void
.end method

.method public static a(Lcom/c/b/au$a;)I
    .locals 1

    .prologue
    .line 238
    invoke-interface {p0}, Lcom/c/b/au$a;->a()I

    move-result v0

    return v0
.end method

.method public static a(Ljava/util/List;)I
    .locals 3

    .prologue
    .line 246
    const/4 v0, 0x1

    .line 247
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/au$a;

    .line 248
    mul-int/lit8 v1, v1, 0x1f

    invoke-interface {v0}, Lcom/c/b/au$a;->a()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 249
    goto :goto_0

    .line 250
    :cond_0
    return v1
.end method

.method public static a([B)Z
    .locals 2

    .prologue
    .line 176
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/c/b/cc;->a([BII)Z

    move-result v0

    return v0
.end method

.method public static b([B)Ljava/lang/String;
    .locals 2

    .prologue
    .line 190
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/c/b/au;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method
