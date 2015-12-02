.class public Landroid_src/mms/a/b/p;
.super Landroid_src/mms/a/b/g;
.source "SmilRootLayoutElementImpl.java"

# interfaces
.implements Lorg/a/a/b/n;


# direct methods
.method constructor <init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Landroid_src/mms/a/b/g;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    .line 33
    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 75
    const-string v1, "px"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 76
    const-string v1, "px"

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 79
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 81
    :goto_0
    return v0

    .line 80
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .prologue
    .line 58
    const-string v0, "height"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "px"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/a/b/p;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    return-void
.end method

.method public b(I)V
    .locals 3

    .prologue
    .line 67
    const-string v0, "width"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "px"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid_src/mms/a/b/p;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    return-void
.end method

.method public d()I
    .locals 1

    .prologue
    .line 40
    const-string v0, "height"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/p;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 41
    invoke-direct {p0, v0}, Landroid_src/mms/a/b/p;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 49
    const-string v0, "width"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/p;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-direct {p0, v0}, Landroid_src/mms/a/b/p;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
