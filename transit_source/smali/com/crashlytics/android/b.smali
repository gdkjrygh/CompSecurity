.class abstract Lcom/crashlytics/android/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static final b:Ljava/util/regex/Pattern;


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Lcom/crashlytics/android/aj;

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Crashlytics Android SDK/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getCrashlyticsVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/b;->a:Ljava/lang/String;

    .line 77
    const-string v0, "http(s?)://[^\\/]+"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/b;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/aj;)V
    .locals 2

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    if-nez p2, :cond_0

    .line 105
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_0
    if-nez p3, :cond_1

    .line 108
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "requestBuilder must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_1
    iput-object p1, p0, Lcom/crashlytics/android/b;->e:Ljava/lang/String;

    .line 111
    iget-object v0, p0, Lcom/crashlytics/android/b;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/crashlytics/android/aB;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/crashlytics/android/b;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    iget-object v1, p0, Lcom/crashlytics/android/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_2
    iput-object p2, p0, Lcom/crashlytics/android/b;->c:Ljava/lang/String;

    .line 112
    iput-object p3, p0, Lcom/crashlytics/android/b;->d:Lcom/crashlytics/android/aj;

    .line 113
    return-void
.end method


# virtual methods
.method protected final a(Ljava/util/Map;)Lcom/crashlytics/android/HttpRequest;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/crashlytics/android/HttpRequest;"
        }
    .end annotation

    .prologue
    .line 153
    iget-object v0, p0, Lcom/crashlytics/android/b;->d:Lcom/crashlytics/android/aj;

    iget-object v1, p0, Lcom/crashlytics/android/b;->c:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/crashlytics/android/aj;->a(Ljava/lang/String;Ljava/util/Map;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v1

    .line 155
    iget-object v0, p0, Lcom/crashlytics/android/b;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "https"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getPinningInfoProvider()Lcom/crashlytics/android/PinningInfoProvider;

    move-result-object v0

    .line 159
    if-eqz v0, :cond_0

    .line 160
    invoke-static {v0}, Lcom/crashlytics/android/aB;->a(Lcom/crashlytics/android/PinningInfoProvider;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    .line 161
    invoke-virtual {v1}, Lcom/crashlytics/android/HttpRequest;->a()Ljava/net/HttpURLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 165
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/crashlytics/android/HttpRequest;->a(Z)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/HttpRequest;->a(I)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v1, "User-Agent"

    sget-object v2, Lcom/crashlytics/android/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    const-string v2, "bca6990fc3c15a8105800c0673517a4b579634a1"

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/crashlytics/android/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected final b()Lcom/crashlytics/android/HttpRequest;
    .locals 1

    .prologue
    .line 133
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/b;->a(Ljava/util/Map;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    return-object v0
.end method
