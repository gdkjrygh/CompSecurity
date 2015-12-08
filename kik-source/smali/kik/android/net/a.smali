.class public final Lkik/android/net/a;
.super Ljava/io/BufferedReader;
.source "SourceFile"


# static fields
.field private static final f:Lorg/c/b;


# instance fields
.field private a:Ljava/lang/StringBuffer;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Lcom/kik/android/b/a;

.field private volatile e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-string v0, "LoggingBufferedReader"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/net/a;->f:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;Ljava/lang/String;Lcom/kik/android/b/a;)V
    .locals 3

    .prologue
    const v2, 0x8000

    .line 27
    invoke-direct {p0, p1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/net/a;->c:Z

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/net/a;->e:J

    .line 28
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    .line 29
    iput-object p2, p0, Lkik/android/net/a;->b:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lkik/android/net/a;->d:Lcom/kik/android/b/a;

    .line 31
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkik/android/net/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    iget-object v1, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 99
    iput-boolean v2, p0, Lkik/android/net/a;->c:Z

    .line 100
    return-void
.end method

.method public final b()J
    .locals 2

    .prologue
    .line 111
    iget-wide v0, p0, Lkik/android/net/a;->e:J

    return-wide v0
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lkik/android/net/a;->d:Lcom/kik/android/b/a;

    invoke-virtual {v0}, Lcom/kik/android/b/a;->e()V

    .line 106
    invoke-super {p0}, Ljava/io/BufferedReader;->close()V

    .line 107
    return-void
.end method

.method public final read()I
    .locals 6

    .prologue
    const/4 v0, -0x1

    .line 43
    invoke-super {p0}, Ljava/io/BufferedReader;->read()I

    move-result v1

    .line 47
    iget-object v2, p0, Lkik/android/net/a;->d:Lcom/kik/android/b/a;

    const-wide/16 v4, 0x3e8

    invoke-virtual {v2, v4, v5}, Lcom/kik/android/b/a;->a(J)Lcom/kik/g/ar;

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lkik/android/net/a;->e:J

    .line 50
    if-ne v1, v0, :cond_0

    .line 65
    :goto_0
    return v0

    .line 53
    :cond_0
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    add-int/2addr v0, v1

    iget-object v2, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->capacity()I

    move-result v2

    if-lt v0, v2, :cond_1

    .line 54
    invoke-virtual {p0}, Lkik/android/net/a;->a()V

    .line 56
    :cond_1
    if-ltz v1, :cond_2

    iget-boolean v0, p0, Lkik/android/net/a;->c:Z

    if-nez v0, :cond_2

    .line 57
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->capacity()I

    move-result v0

    iget-object v2, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0xd

    if-lez v0, :cond_3

    .line 58
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    int-to-char v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_2
    :goto_1
    move v0, v1

    .line 65
    goto :goto_0

    .line 61
    :cond_3
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    const-string v2, "... TRUNCATED"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/net/a;->c:Z

    goto :goto_1
.end method

.method public final read([CII)I
    .locals 6

    .prologue
    const/4 v0, -0x1

    .line 71
    invoke-super {p0, p1, p2, p3}, Ljava/io/BufferedReader;->read([CII)I

    move-result v1

    .line 75
    iget-object v2, p0, Lkik/android/net/a;->d:Lcom/kik/android/b/a;

    const-wide/16 v4, 0x3e8

    invoke-virtual {v2, v4, v5}, Lcom/kik/android/b/a;->a(J)Lcom/kik/g/ar;

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lkik/android/net/a;->e:J

    .line 78
    if-ne v1, v0, :cond_0

    .line 92
    :goto_0
    return v0

    .line 81
    :cond_0
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->capacity()I

    move-result v0

    iget-object v2, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0xd

    .line 82
    iget-boolean v2, p0, Lkik/android/net/a;->c:Z

    if-nez v2, :cond_1

    .line 83
    if-ge v1, v0, :cond_2

    .line 84
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1, p2, v1}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    :cond_1
    :goto_1
    move v0, v1

    .line 92
    goto :goto_0

    .line 87
    :cond_2
    iget-object v2, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1, p2, v0}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    .line 88
    iget-object v0, p0, Lkik/android/net/a;->a:Ljava/lang/StringBuffer;

    const-string v2, "... TRUNCATED"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/net/a;->c:Z

    goto :goto_1
.end method
