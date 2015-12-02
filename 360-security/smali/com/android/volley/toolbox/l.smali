.class public Lcom/android/volley/toolbox/l;
.super Lcom/android/volley/Request;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/volley/Request",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/android/volley/k$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/volley/k$b",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/android/volley/k$b",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/android/volley/k$a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 83
    invoke-direct {p0, p1, p2, p5}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/k$a;)V

    .line 84
    iput-object p4, p0, Lcom/android/volley/toolbox/l;->a:Lcom/android/volley/k$b;

    .line 85
    iput-object p3, p0, Lcom/android/volley/toolbox/l;->b:Ljava/lang/String;

    .line 86
    return-void
.end method


# virtual methods
.method protected a(Lcom/android/volley/i;)Lcom/android/volley/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/i;",
            ")",
            "Lcom/android/volley/k",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 97
    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p1, Lcom/android/volley/i;->b:[B

    iget-object v2, p1, Lcom/android/volley/i;->c:Ljava/util/Map;

    invoke-static {v2}, Lcom/android/volley/toolbox/d;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :goto_0
    invoke-static {p1}, Lcom/android/volley/toolbox/d;->a(Lcom/android/volley/i;)Lcom/android/volley/a$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/volley/k;->a(Ljava/lang/Object;Lcom/android/volley/a$a;)Lcom/android/volley/k;

    move-result-object v0

    return-object v0

    .line 98
    :catch_0
    move-exception v0

    .line 99
    new-instance v0, Ljava/lang/String;

    iget-object v1, p1, Lcom/android/volley/i;->b:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method protected synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/l;->c(Ljava/lang/String;)V

    return-void
.end method

.method protected c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/android/volley/toolbox/l;->a:Lcom/android/volley/k$b;

    invoke-interface {v0, p1}, Lcom/android/volley/k$b;->a(Ljava/lang/Object;)V

    .line 91
    return-void
.end method

.method public q()[B
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 107
    :try_start_0
    iget-object v1, p0, Lcom/android/volley/toolbox/l;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 111
    :goto_0
    return-object v0

    .line 107
    :cond_0
    iget-object v1, p0, Lcom/android/volley/toolbox/l;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/android/volley/toolbox/l;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 108
    :catch_0
    move-exception v1

    .line 109
    const-string/jumbo v1, "Unsupported Encoding while trying to get the bytes of %s using %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/android/volley/toolbox/l;->b:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    .line 110
    invoke-virtual {p0}, Lcom/android/volley/toolbox/l;->o()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 109
    invoke-static {v1, v2}, Lcom/android/volley/n;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
