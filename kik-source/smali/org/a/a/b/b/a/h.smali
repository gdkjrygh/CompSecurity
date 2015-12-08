.class public final Lorg/a/a/b/b/a/h;
.super Lorg/a/a/b/b/a/c;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 38
    const/4 v0, 0x0

    const v1, 0x7fffffff

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lorg/a/a/b/b/a/h;-><init>(IIZ)V

    .line 39
    return-void
.end method

.method private constructor <init>(IIZ)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lorg/a/a/b/b/a/c;-><init>()V

    .line 52
    iput p1, p0, Lorg/a/a/b/b/a/h;->a:I

    .line 53
    iput p2, p0, Lorg/a/a/b/b/a/h;->b:I

    .line 54
    iput-boolean p3, p0, Lorg/a/a/b/b/a/h;->c:Z

    .line 55
    return-void
.end method

.method public static a()Lorg/a/a/b/b/a/h;
    .locals 4

    .prologue
    .line 85
    new-instance v0, Lorg/a/a/b/b/a/h;

    const/16 v1, 0x20

    const/16 v2, 0x7f

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lorg/a/a/b/b/a/h;-><init>(IIZ)V

    return-object v0
.end method


# virtual methods
.method public final a(ILjava/io/Writer;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 104
    iget-boolean v1, p0, Lorg/a/a/b/b/a/h;->c:Z

    if-eqz v1, :cond_1

    .line 105
    iget v1, p0, Lorg/a/a/b/b/a/h;->a:I

    if-lt p1, v1, :cond_0

    iget v1, p0, Lorg/a/a/b/b/a/h;->b:I

    if-le p1, v1, :cond_2

    .line 128
    :cond_0
    :goto_0
    return v0

    .line 109
    :cond_1
    iget v1, p0, Lorg/a/a/b/b/a/h;->a:I

    if-lt p1, v1, :cond_2

    iget v1, p0, Lorg/a/a/b/b/a/h;->b:I

    if-le p1, v1, :cond_0

    .line 115
    :cond_2
    const v0, 0xffff

    if-le p1, v0, :cond_3

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\u"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/a/a/b/b/a/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 128
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 119
    :cond_3
    const/16 v0, 0xfff

    if-le p1, v0, :cond_4

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\u"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/a/a/b/b/a/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 121
    :cond_4
    const/16 v0, 0xff

    if-le p1, v0, :cond_5

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\u0"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/a/a/b/b/a/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 123
    :cond_5
    const/16 v0, 0xf

    if-le p1, v0, :cond_6

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\u00"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/a/a/b/b/a/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 126
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\u000"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/a/a/b/b/a/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1
.end method
