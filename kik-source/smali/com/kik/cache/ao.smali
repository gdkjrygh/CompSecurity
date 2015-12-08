.class public final Lcom/kik/cache/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/toolbox/g;


# instance fields
.field private final a:Lorg/apache/http/ProtocolVersion;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Lorg/apache/http/ProtocolVersion;

    const-string v1, "HTTP"

    invoke-direct {v0, v1, v2, v2}, Lorg/apache/http/ProtocolVersion;-><init>(Ljava/lang/String;II)V

    iput-object v0, p0, Lcom/kik/cache/ao;->a:Lorg/apache/http/ProtocolVersion;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/n;Ljava/util/Map;)Lorg/apache/http/HttpResponse;
    .locals 5

    .prologue
    .line 30
    new-instance v0, Lorg/apache/http/message/BasicHttpResponse;

    new-instance v1, Lorg/apache/http/message/BasicStatusLine;

    iget-object v2, p0, Lcom/kik/cache/ao;->a:Lorg/apache/http/ProtocolVersion;

    const/16 v3, 0xc8

    const-string v4, "OK"

    invoke-direct {v1, v2, v3, v4}, Lorg/apache/http/message/BasicStatusLine;-><init>(Lorg/apache/http/ProtocolVersion;ILjava/lang/String;)V

    invoke-direct {v0, v1}, Lorg/apache/http/message/BasicHttpResponse;-><init>(Lorg/apache/http/StatusLine;)V

    .line 31
    new-instance v1, Lorg/apache/http/entity/BasicHttpEntity;

    invoke-direct {v1}, Lorg/apache/http/entity/BasicHttpEntity;-><init>()V

    .line 32
    new-instance v2, Ljava/io/ByteArrayInputStream;

    const/4 v3, 0x0

    new-array v3, v3, [B

    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v1, v2}, Lorg/apache/http/entity/BasicHttpEntity;->setContent(Ljava/io/InputStream;)V

    .line 33
    invoke-virtual {v0, v1}, Lorg/apache/http/message/BasicHttpResponse;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 34
    return-object v0
.end method
