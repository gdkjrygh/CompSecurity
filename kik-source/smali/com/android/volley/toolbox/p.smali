.class public abstract Lcom/android/volley/toolbox/p;
.super Lcom/android/volley/n;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/android/volley/r$b;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 40
    const-string v0, "application/json; charset=%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "utf-8"

    aput-object v3, v1, v2

    .line 41
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/android/volley/toolbox/p;->a:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1, p3}, Lcom/android/volley/n;-><init>(Ljava/lang/String;Lcom/android/volley/r$a;)V

    .line 62
    iput-object p2, p0, Lcom/android/volley/toolbox/p;->b:Lcom/android/volley/r$b;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/volley/toolbox/p;->c:Ljava/lang/String;

    .line 64
    return-void
.end method


# virtual methods
.method protected abstract a(Lcom/android/volley/k;)Lcom/android/volley/r;
.end method

.method protected b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/android/volley/toolbox/p;->b:Lcom/android/volley/r$b;

    invoke-interface {v0, p1}, Lcom/android/volley/r$b;->a(Ljava/lang/Object;)V

    .line 70
    return-void
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    sget-object v0, Lcom/android/volley/toolbox/p;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final k()[B
    .locals 1

    .prologue
    .line 90
    invoke-virtual {p0}, Lcom/android/volley/toolbox/p;->m()[B

    move-result-object v0

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    sget-object v0, Lcom/android/volley/toolbox/p;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final m()[B
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 103
    :try_start_0
    iget-object v1, p0, Lcom/android/volley/toolbox/p;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 108
    :goto_0
    return-object v0

    .line 103
    :cond_0
    iget-object v1, p0, Lcom/android/volley/toolbox/p;->c:Ljava/lang/String;

    const-string v2, "utf-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 106
    :catch_0
    move-exception v1

    const-string v1, "Unsupported Encoding while trying to get the bytes of %s using %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/android/volley/toolbox/p;->c:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "utf-8"

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/android/volley/x;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
