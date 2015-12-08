.class abstract Lcom/crashlytics/android/a;
.super Lcom/crashlytics/android/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/aj;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/crashlytics/android/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/aj;)V

    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lcom/crashlytics/android/h;)Z
    .locals 7

    .prologue
    .line 38
    invoke-virtual {p0}, Lcom/crashlytics/android/a;->b()Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    .line 39
    const-string v1, "X-CRASHLYTICS-API-KEY"

    iget-object v2, p1, Lcom/crashlytics/android/h;->a:Ljava/lang/String;

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

    .line 40
    iget-object v1, p1, Lcom/crashlytics/android/h;->j:Lcom/crashlytics/android/ak;

    const-string v2, "app[identifier]"

    iget-object v3, p1, Lcom/crashlytics/android/h;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v2, "app[name]"

    iget-object v3, p1, Lcom/crashlytics/android/h;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v2, "app[display_version]"

    iget-object v3, p1, Lcom/crashlytics/android/h;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v2, "app[build_version]"

    iget-object v3, p1, Lcom/crashlytics/android/h;->d:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v2, "app[source]"

    iget v3, p1, Lcom/crashlytics/android/h;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/Number;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v2, "app[minimum_sdk_version]"

    iget-object v3, p1, Lcom/crashlytics/android/h;->h:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v2, "app[built_sdk_version]"

    iget-object v3, p1, Lcom/crashlytics/android/h;->i:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v2

    iget-object v0, p1, Lcom/crashlytics/android/h;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/crashlytics/android/aB;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "app[instance_identifier]"

    iget-object v3, p1, Lcom/crashlytics/android/h;->e:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    :cond_0
    if-eqz v1, :cond_1

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v1}, Lcom/crashlytics/android/ak;->b()[B

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v3, "app[icon][hash]"

    invoke-virtual {v1}, Lcom/crashlytics/android/ak;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/crashlytics/android/HttpRequest;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v3

    const-string v4, "app[icon][data]"

    const-string v5, "icon.png"

    const-string v6, "application/octet-stream"

    invoke-virtual {v3, v4, v5, v6, v0}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v3, "app[icon][width]"

    invoke-virtual {v1}, Lcom/crashlytics/android/ak;->c()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/Number;)Lcom/crashlytics/android/HttpRequest;

    move-result-object v0

    const-string v3, "app[icon][height]"

    invoke-virtual {v1}, Lcom/crashlytics/android/ak;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;Ljava/lang/Number;)Lcom/crashlytics/android/HttpRequest;

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Sending app info to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/crashlytics/android/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v2}, Lcom/crashlytics/android/HttpRequest;->b()I

    move-result v1

    .line 45
    const-string v0, "POST"

    invoke-virtual {v2}, Lcom/crashlytics/android/HttpRequest;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Create"

    .line 47
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " app request ID: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "X-REQUEST-ID"

    invoke-virtual {v2, v3}, Lcom/crashlytics/android/HttpRequest;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Result was "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/crashlytics/android/aB;->c(Ljava/lang/String;)V

    .line 50
    invoke-static {v1}, Lcom/crashlytics/android/c;->a(I)I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_1
    return v0

    .line 45
    :cond_2
    const-string v0, "Update"

    goto :goto_0

    .line 50
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method
