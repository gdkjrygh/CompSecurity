.class public final Lkik/android/net/b;
.super Ljava/io/OutputStream;
.source "SourceFile"


# static fields
.field private static final d:Lorg/c/b;


# instance fields
.field private a:Ljava/io/OutputStream;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-string v0, "LoggingOutputStream"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/net/b;->d:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 20
    iput-object p1, p0, Lkik/android/net/b;->a:Ljava/io/OutputStream;

    .line 21
    iput-object p2, p0, Lkik/android/net/b;->b:Ljava/lang/String;

    .line 22
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lkik/android/net/b;->c:Ljava/lang/StringBuffer;

    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkik/android/net/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/net/b;->c:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    iget-object v0, p0, Lkik/android/net/b;->c:Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/net/b;->c:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 43
    return-void
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 54
    invoke-super {p0}, Ljava/io/OutputStream;->close()V

    .line 55
    iget-object v0, p0, Lkik/android/net/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 56
    return-void
.end method

.method public final flush()V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lkik/android/net/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 49
    return-void
.end method

.method public final write(I)V
    .locals 2

    .prologue
    .line 28
    iget-object v0, p0, Lkik/android/net/b;->c:Ljava/lang/StringBuffer;

    int-to-byte v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 29
    iget-object v0, p0, Lkik/android/net/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 30
    return-void
.end method

.method public final write([BII)V
    .locals 3

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/net/b;->c:Ljava/lang/StringBuffer;

    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, p1, p2, p3, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 36
    iget-object v0, p0, Lkik/android/net/b;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 37
    return-void
.end method
