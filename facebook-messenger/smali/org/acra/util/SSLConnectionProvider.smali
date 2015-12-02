.class public Lorg/acra/util/SSLConnectionProvider;
.super Ljava/lang/Object;
.source "SSLConnectionProvider.java"

# interfaces
.implements Lorg/acra/util/HttpConnectionProvider;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 13
    invoke-virtual {p0, v0}, Lorg/acra/util/SSLConnectionProvider;->initializeConnectionParameters(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method public initializeConnectionParameters(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 17
    invoke-static {}, Lorg/acra/ACRA;->getConfig()Lorg/acra/reporter/ReportsCrashes;

    move-result-object v0

    invoke-interface {v0}, Lorg/acra/reporter/ReportsCrashes;->socketTimeout()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 18
    invoke-static {}, Lorg/acra/ACRA;->getConfig()Lorg/acra/reporter/ReportsCrashes;

    move-result-object v0

    invoke-interface {v0}, Lorg/acra/reporter/ReportsCrashes;->socketTimeout()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 19
    return-object p1
.end method
