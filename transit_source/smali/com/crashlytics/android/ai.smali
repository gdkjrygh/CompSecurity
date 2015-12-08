.class final Lcom/crashlytics/android/ai;
.super Lcom/crashlytics/android/HttpRequest$CloseOperation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/HttpRequest$CloseOperation",
        "<",
        "Lcom/crashlytics/android/HttpRequest;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic a:Ljava/io/InputStream;

.field private synthetic b:Ljava/io/OutputStream;

.field private synthetic c:Lcom/crashlytics/android/HttpRequest;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/HttpRequest;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 2370
    iput-object p1, p0, Lcom/crashlytics/android/ai;->c:Lcom/crashlytics/android/HttpRequest;

    iput-object p4, p0, Lcom/crashlytics/android/ai;->a:Ljava/io/InputStream;

    iput-object p5, p0, Lcom/crashlytics/android/ai;->b:Ljava/io/OutputStream;

    invoke-direct {p0, p2, p3}, Lcom/crashlytics/android/HttpRequest$CloseOperation;-><init>(Ljava/io/Closeable;Z)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/crashlytics/android/HttpRequest$HttpRequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2370
    iget-object v0, p0, Lcom/crashlytics/android/ai;->c:Lcom/crashlytics/android/HttpRequest;

    invoke-static {v0}, Lcom/crashlytics/android/HttpRequest;->a(Lcom/crashlytics/android/HttpRequest;)I

    move-result v0

    new-array v0, v0, [B

    :goto_0
    iget-object v1, p0, Lcom/crashlytics/android/ai;->a:Ljava/io/InputStream;

    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v2, p0, Lcom/crashlytics/android/ai;->b:Ljava/io/OutputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/ai;->c:Lcom/crashlytics/android/HttpRequest;

    return-object v0
.end method
