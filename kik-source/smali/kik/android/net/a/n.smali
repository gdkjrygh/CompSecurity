.class public final Lkik/android/net/a/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/net/a/h;


# instance fields
.field private final a:Ljava/io/RandomAccessFile;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/io/RandomAccessFile;

    invoke-direct {v0, p1, p2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/net/a/n;->a:Ljava/io/RandomAccessFile;

    .line 24
    return-void
.end method


# virtual methods
.method public final a([BI)I
    .locals 2

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/net/a/n;->a:Ljava/io/RandomAccessFile;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v0

    return v0
.end method

.method public final a()J
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Lkik/android/net/a/n;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lkik/android/net/a/n;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1, p2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 42
    return-void
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/net/a/n;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 36
    return-void
.end method
