.class public Lcom/google/android/gms/internal/qg;
.super Lcom/google/android/gms/internal/qf;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qf;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ry;)Landroid/webkit/WebChromeClient;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/st;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/st;-><init>(Lcom/google/android/gms/internal/ry;)V

    return-object v0
.end method

.method public final a(Landroid/net/http/SslError;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
