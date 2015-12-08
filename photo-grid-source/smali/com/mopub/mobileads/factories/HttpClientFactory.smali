.class public Lcom/mopub/mobileads/factories/HttpClientFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SOCKET_SIZE:I = 0x2000

.field private static a:Lcom/mopub/mobileads/factories/HttpClientFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lcom/mopub/mobileads/factories/HttpClientFactory;

    invoke-direct {v0}, Lcom/mopub/mobileads/factories/HttpClientFactory;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/factories/HttpClientFactory;->a:Lcom/mopub/mobileads/factories/HttpClientFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)Lorg/apache/http/impl/client/DefaultHttpClient;
    .locals 2

    .prologue
    .line 27
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 29
    if-lez p0, :cond_0

    .line 31
    invoke-static {v0, p0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 32
    invoke-static {v0, p0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 37
    :cond_0
    const/16 v1, 0x2000

    invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 39
    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    return-object v1
.end method

.method public static create()Lorg/apache/http/impl/client/DefaultHttpClient;
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/mopub/mobileads/factories/HttpClientFactory;->a(I)Lorg/apache/http/impl/client/DefaultHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public static create(I)Lorg/apache/http/impl/client/DefaultHttpClient;
    .locals 1

    .prologue
    .line 19
    invoke-static {p0}, Lcom/mopub/mobileads/factories/HttpClientFactory;->a(I)Lorg/apache/http/impl/client/DefaultHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public static setInstance(Lcom/mopub/mobileads/factories/HttpClientFactory;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 15
    sput-object p0, Lcom/mopub/mobileads/factories/HttpClientFactory;->a:Lcom/mopub/mobileads/factories/HttpClientFactory;

    .line 16
    return-void
.end method
