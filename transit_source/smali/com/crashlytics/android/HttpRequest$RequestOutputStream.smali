.class public Lcom/crashlytics/android/HttpRequest$RequestOutputStream;
.super Ljava/io/BufferedOutputStream;
.source "SourceFile"


# instance fields
.field private final a:Ljava/nio/charset/CharsetEncoder;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Ljava/lang/String;I)V
    .locals 1
    .param p1, "stream"    # Ljava/io/OutputStream;
    .param p2, "charset"    # Ljava/lang/String;
    .param p3, "bufferSize"    # I

    .prologue
    .line 697
    invoke-direct {p0, p1, p3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 699
    invoke-static {p2}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->a:Ljava/nio/charset/CharsetEncoder;

    .line 700
    return-void
.end method


# virtual methods
.method public write(Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest$RequestOutputStream;
    .locals 3
    .param p1, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 710
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest$RequestOutputStream;->a:Ljava/nio/charset/CharsetEncoder;

    invoke-static {p1}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 712
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-super {p0, v1, v2, v0}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 714
    return-object p0
.end method
