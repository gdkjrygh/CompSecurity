.class final Lcom/crashlytics/android/ad;
.super Lcom/crashlytics/android/b;
.source "SourceFile"

# interfaces
.implements Lcom/crashlytics/android/ab;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/crashlytics/android/d;->b:Lcom/crashlytics/android/d;

    invoke-direct {p0, p1, p2, v0}, Lcom/crashlytics/android/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/aj;)V

    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lcom/crashlytics/android/aa;)Z
    .locals 6

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/crashlytics/android/ad;->b()Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    .line 43
    const-string v1, "X-CRASHLYTICS-API-KEY"

    invoke-virtual {p1}, Lcom/crashlytics/android/aa;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-CLIENT-TYPE"

    const-string v2, "android"

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"

    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getCrashlyticsVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    invoke-virtual {p1}, Lcom/crashlytics/android/aa;->b()Lcom/crashlytics/android/aq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/crashlytics/android/aq;->e()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {v1, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/util/Map$Entry;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Lcom/crashlytics/android/aa;->b()Lcom/crashlytics/android/aq;

    move-result-object v0

    const-string v2, "report[file]"

    invoke-virtual {v0}, Lcom/crashlytics/android/aq;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "application/octet-stream"

    invoke-virtual {v0}, Lcom/crashlytics/android/aq;->d()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v1

    const-string v2, "report[identifier]"

    invoke-virtual {v0}, Lcom/crashlytics/android/aq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Sending report to: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/crashlytics/android/ad;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v0}, Lcom/crashlytics/android/HttpRequest;->b()I

    move-result v1

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Create report request ID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v0, v3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Result was: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 53
    invoke-static {v1}, Lcom/crashlytics/android/c;->a(I)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
