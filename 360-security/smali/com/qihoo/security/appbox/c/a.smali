.class public Lcom/qihoo/security/appbox/c/a;
.super Lcom/android/volley/toolbox/a;
.source "360Security"


# direct methods
.method public constructor <init>(Lcom/android/volley/toolbox/e;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/android/volley/toolbox/a;-><init>(Lcom/android/volley/toolbox/e;)V

    .line 23
    return-void
.end method

.method private a(Lcom/android/volley/toolbox/h;)Lcom/android/volley/i;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/VolleyError;
        }
    .end annotation

    .prologue
    .line 35
    invoke-virtual {p1}, Lcom/android/volley/toolbox/h;->d()Ljava/lang/String;

    move-result-object v0

    .line 36
    const-string/jumbo v1, "Package://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "ApkPath://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    :cond_0
    new-instance v0, Lcom/android/volley/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/volley/i;-><init>([B)V

    .line 39
    :goto_0
    return-object v0

    :cond_1
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/a;->a(Lcom/android/volley/Request;)Lcom/android/volley/i;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/android/volley/Request;)Lcom/android/volley/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;)",
            "Lcom/android/volley/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/VolleyError;
        }
    .end annotation

    .prologue
    .line 27
    instance-of v0, p1, Lcom/android/volley/toolbox/h;

    if-eqz v0, :cond_0

    .line 28
    check-cast p1, Lcom/android/volley/toolbox/h;

    invoke-direct {p0, p1}, Lcom/qihoo/security/appbox/c/a;->a(Lcom/android/volley/toolbox/h;)Lcom/android/volley/i;

    move-result-object v0

    .line 31
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/a;->a(Lcom/android/volley/Request;)Lcom/android/volley/i;

    move-result-object v0

    goto :goto_0
.end method
