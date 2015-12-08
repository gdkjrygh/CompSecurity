.class public abstract La/a/a/a/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/util/regex/Pattern;


# instance fields
.field protected final a:La/a/a/a/p;

.field private final c:Ljava/lang/String;

.field private final d:La/a/a/a/a/e/m;

.field private final e:I

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 57
    const-string v0, "http(s?)://[^\\/]+"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La/a/a/a/a/b/a;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;I)V
    .locals 2

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    if-nez p3, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_0
    if-nez p4, :cond_1

    .line 92
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "requestFactory must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_1
    iput-object p1, p0, La/a/a/a/a/b/a;->a:La/a/a/a/p;

    .line 95
    iput-object p2, p0, La/a/a/a/a/b/a;->f:Ljava/lang/String;

    .line 2159
    iget-object v0, p0, La/a/a/a/a/b/a;->f:Ljava/lang/String;

    invoke-static {v0}, La/a/a/a/a/b/l;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2160
    sget-object v0, La/a/a/a/a/b/a;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    iget-object v1, p0, La/a/a/a/a/b/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 96
    :cond_2
    iput-object p3, p0, La/a/a/a/a/b/a;->c:Ljava/lang/String;

    .line 97
    iput-object p4, p0, La/a/a/a/a/b/a;->d:La/a/a/a/a/e/m;

    .line 98
    iput p5, p0, La/a/a/a/a/b/a;->e:I

    .line 99
    return-void
.end method


# virtual methods
.method protected final a(Ljava/util/Map;)La/a/a/a/a/e/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "La/a/a/a/a/e/e;"
        }
    .end annotation

    .prologue
    .line 139
    iget-object v0, p0, La/a/a/a/a/b/a;->d:La/a/a/a/a/e/m;

    iget v1, p0, La/a/a/a/a/b/a;->e:I

    .line 3102
    iget-object v2, p0, La/a/a/a/a/b/a;->c:Ljava/lang/String;

    .line 139
    invoke-interface {v0, v1, v2, p1}, La/a/a/a/a/e/m;->a(ILjava/lang/String;Ljava/util/Map;)La/a/a/a/a/e/e;

    move-result-object v0

    .line 3103
    invoke-virtual {v0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 3815
    invoke-virtual {v0}, La/a/a/a/a/e/e;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 141
    const-string v1, "User-Agent"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Crashlytics Android SDK/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, La/a/a/a/a/b/a;->a:La/a/a/a/p;

    invoke-virtual {v3}, La/a/a/a/p;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    const-string v2, "470fa2b4ae81cd56ecbcda9735803434cec591fa"

    invoke-virtual {v0, v1, v2}, La/a/a/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/e/e;

    move-result-object v0

    return-object v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, La/a/a/a/a/b/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected final b()La/a/a/a/a/e/e;
    .locals 1

    .prologue
    .line 119
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, La/a/a/a/a/b/a;->a(Ljava/util/Map;)La/a/a/a/a/e/e;

    move-result-object v0

    return-object v0
.end method
