.class public Lcom/google/android/gms/internal/zzja;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# static fields
.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;


# instance fields
.field protected a:Lcom/google/android/gms/internal/ry;

.field private final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/fz;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;

.field private f:Lcom/google/android/gms/ads/internal/client/zza;

.field private g:Lcom/google/android/gms/ads/internal/overlay/zzg;

.field private h:Lcom/google/android/gms/internal/sb;

.field private i:Lcom/google/android/gms/internal/fl;

.field private j:Lcom/google/android/gms/internal/sc;

.field private k:Z

.field private l:Lcom/google/android/gms/internal/gh;

.field private m:Lcom/google/android/gms/internal/gj;

.field private n:Z

.field private o:Z

.field private p:Lcom/google/android/gms/ads/internal/overlay/zzn;

.field private final q:Lcom/google/android/gms/internal/ko;

.field private r:Lcom/google/android/gms/ads/internal/zze;

.field private s:Lcom/google/android/gms/internal/kg;

.field private t:Lcom/google/android/gms/internal/kq;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "UNKNOWN"

    aput-object v1, v0, v3

    const-string v1, "HOST_LOOKUP"

    aput-object v1, v0, v4

    const-string v1, "UNSUPPORTED_AUTH_SCHEME"

    aput-object v1, v0, v5

    const-string v1, "AUTHENTICATION"

    aput-object v1, v0, v6

    const-string v1, "PROXY_AUTHENTICATION"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "CONNECT"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "IO"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "TIMEOUT"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "REDIRECT_LOOP"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "UNSUPPORTED_SCHEME"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "FAILED_SSL_HANDSHAKE"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "BAD_URL"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "FILE"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "FILE_NOT_FOUND"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "TOO_MANY_REQUESTS"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/zzja;->b:[Ljava/lang/String;

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "NOT_YET_VALID"

    aput-object v1, v0, v3

    const-string v1, "EXPIRED"

    aput-object v1, v0, v4

    const-string v1, "ID_MISMATCH"

    aput-object v1, v0, v5

    const-string v1, "UNTRUSTED"

    aput-object v1, v0, v6

    const-string v1, "DATE_INVALID"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "INVALID"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/zzja;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ry;Z)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ko;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ry;->f()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/cm;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ry;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/cm;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ko;-><init>(Lcom/google/android/gms/internal/ry;Landroid/content/Context;Lcom/google/android/gms/internal/cm;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/zzja;-><init>(Lcom/google/android/gms/internal/ry;ZLcom/google/android/gms/internal/ko;Lcom/google/android/gms/internal/kg;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ry;ZLcom/google/android/gms/internal/ko;Lcom/google/android/gms/internal/kg;)V
    .locals 1

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->d:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->k:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzja;->n:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzja;->q:Lcom/google/android/gms/internal/ko;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzja;Lcom/google/android/gms/internal/sc;)Lcom/google/android/gms/internal/sc;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzja;->j:Lcom/google/android/gms/internal/sc;

    return-object p1
.end method

.method private zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 0
    sget-object v0, Lcom/google/android/gms/internal/cy;->af:Lcom/google/android/gms/internal/cq;

    .line 1000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "err"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "code"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "host"

    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/zzja;->zzaK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzJu:Ljava/lang/String;

    const-string v2, "gmob-apps"

    const/4 v3, 0x1

    invoke-static {p1, v1, v2, v0, v3}, Lcom/google/android/gms/internal/qa;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    goto :goto_0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzja;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzja;->zzht()V

    return-void
.end method

.method private zzaK(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ""

    goto :goto_0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzja;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzja;->zzhu()V

    return-void
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/zzja;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzja;->zzhv()V

    return-void
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/zzja;)Lcom/google/android/gms/internal/sc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->j:Lcom/google/android/gms/internal/sc;

    return-object v0
.end method

.method private static zzg(Landroid/net/Uri;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "https"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private zzht()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->o:Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, p0, Lcom/google/android/gms/internal/zzja;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzja;->y:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzja;->zzhw()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private zzhu()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzja;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzja;->y:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzja;->zzhw()V

    return-void
.end method

.method private zzhv()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->x:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzja;->zzhw()V

    return-void
.end method


# virtual methods
.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Loading resource: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "gmsg"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "mobileads.google.com"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzja;->zzh(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->v:Z

    if-eqz v0, :cond_0

    const-string v0, "about:blank"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Blank page loaded, 1..."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->r()V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->w:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzja;->zzhw()V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    if-gez p2, :cond_0

    neg-int v0, p2

    add-int/lit8 v0, v0, -0x1

    sget-object v1, Lcom/google/android/gms/internal/zzja;->b:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/zzja;->b:[Ljava/lang/String;

    neg-int v1, p2

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "http_err"

    invoke-direct {p0, v1, v2, v0, p4}, Lcom/google/android/gms/internal/zzja;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 4

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result v0

    if-ltz v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/zzja;->c:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/zzja;->c:[Ljava/lang/String;

    aget-object v0, v1, v0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "ssl_err"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbx()Lcom/google/android/gms/internal/qd;

    move-result-object v3

    invoke-virtual {v3, p3}, Lcom/google/android/gms/internal/qd;->a(Landroid/net/http/SslError;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v1, v2, v0, v3}, Lcom/google/android/gms/internal/zzja;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    return-void

    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final reset()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->g:Lcom/google/android/gms/ads/internal/overlay/zzg;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->h:Lcom/google/android/gms/internal/sb;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->i:Lcom/google/android/gms/internal/fl;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->k:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->o:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->l:Lcom/google/android/gms/internal/gh;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->p:Lcom/google/android/gms/ads/internal/overlay/zzn;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->j:Lcom/google/android/gms/internal/sc;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/kg;->a(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->u:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :sswitch_0
    const/4 v0, 0x1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x4f -> :sswitch_0
        0x55 -> :sswitch_0
        0x56 -> :sswitch_0
        0x57 -> :sswitch_0
        0x58 -> :sswitch_0
        0x59 -> :sswitch_0
        0x5a -> :sswitch_0
        0x5b -> :sswitch_0
        0x7e -> :sswitch_0
        0x7f -> :sswitch_0
        0x80 -> :sswitch_0
        0x81 -> :sswitch_0
        0x82 -> :sswitch_0
        0xde -> :sswitch_0
    .end sparse-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v3, 0x0

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AdWebView shouldOverrideUrlLoading: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "gmsg"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "mobileads.google.com"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzja;->zzh(Landroid/net/Uri;)V

    :goto_0
    move v0, v8

    :goto_1
    return v0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzja;->k:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->a()Landroid/webkit/WebView;

    move-result-object v1

    if-ne p1, v1, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/zzja;->zzg(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->u:Z

    if-nez v0, :cond_1

    iput-boolean v8, p0, Lcom/google/android/gms/internal/zzja;->u:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/cy;->T:Lcom/google/android/gms/internal/cq;

    .line 2000
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbE()Lcom/google/android/gms/internal/cx;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/cx;->a(Lcom/google/android/gms/internal/cq;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zza;->onAdClicked()V

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->a()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->willNotDraw()Z

    move-result v1

    if-nez v1, :cond_6

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->m()Lcom/google/android/gms/internal/ad;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ad;->a(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ad;->a(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ae; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_3
    move-object v2, v0

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->r:Lcom/google/android/gms/ads/internal/zze;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->r:Lcom/google/android/gms/ads/internal/zze;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zze;->zzbe()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;)V

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to append parameter to URL: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    move-object v2, v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->r:Lcom/google/android/gms/ads/internal/zze;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/internal/zze;->zzp(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AdWebView unable to handle URL: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaH(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public zzF(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzja;->k:Z

    return-void
.end method

.method public zza(IIZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->q:Lcom/google/android/gms/internal/ko;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ko;->a(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/kg;->a(IIZ)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;)V
    .locals 6

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->o()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-nez v2, :cond_0

    move-object v2, v3

    :goto_0
    if-eqz v1, :cond_1

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/zzja;->p:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v5

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->g:Lcom/google/android/gms/ads/internal/overlay/zzg;

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 4

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->a()Z

    move-result v0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbt()Lcom/google/android/gms/ads/internal/overlay/zze;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ry;->getContext()Landroid/content/Context;

    move-result-object v3

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {v2, v3, p1, v1}, Lcom/google/android/gms/ads/internal/overlay/zze;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/sb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzja;->h:Lcom/google/android/gms/internal/sb;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/sc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzja;->j:Lcom/google/android/gms/internal/sc;

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->d:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zza(ZI)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->o()Z

    move-result v1

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->g:Lcom/google/android/gms/ads/internal/overlay/zzg;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->p:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ry;->n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v7

    move v5, p1

    move v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/internal/ry;ZILcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0
.end method

.method public final zza(ZILjava/lang/String;)V
    .locals 11

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->o()Z

    move-result v3

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-nez v1, :cond_0

    move-object v1, v2

    :goto_0
    if-eqz v3, :cond_1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->i:Lcom/google/android/gms/internal/fl;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzja;->p:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ry;->n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/zzja;->l:Lcom/google/android/gms/internal/gh;

    move v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/internal/ry;ZILjava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/gh;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/sd;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzja;->g:Lcom/google/android/gms/ads/internal/overlay/zzg;

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/sd;-><init>(Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/ads/internal/overlay/zzg;)V

    goto :goto_1
.end method

.method public final zza(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->o()Z

    move-result v2

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->j()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zztf:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->i:Lcom/google/android/gms/internal/fl;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzja;->p:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ry;->n()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v10

    iget-object v11, p0, Lcom/google/android/gms/internal/zzja;->l:Lcom/google/android/gms/internal/gh;

    move v6, p1

    move v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/internal/ry;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/gh;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/sd;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzja;->g:Lcom/google/android/gms/ads/internal/overlay/zzg;

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/sd;-><init>(Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/ads/internal/overlay/zzg;)V

    goto :goto_1
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzg;Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/ads/internal/overlay/zzn;ZLcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/gj;Lcom/google/android/gms/ads/internal/zze;Lcom/google/android/gms/internal/kq;)V
    .locals 4

    const/4 v3, 0x0

    if-nez p8, :cond_0

    new-instance p8, Lcom/google/android/gms/ads/internal/zze;

    invoke-direct {p8, v3}, Lcom/google/android/gms/ads/internal/zze;-><init>(Z)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/kg;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-direct {v0, v1, p9}, Lcom/google/android/gms/internal/kg;-><init>(Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/kq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    const-string v0, "/appEvent"

    new-instance v1, Lcom/google/android/gms/internal/fk;

    invoke-direct {v1, p3}, Lcom/google/android/gms/internal/fk;-><init>(Lcom/google/android/gms/internal/fl;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/backButton"

    sget-object v1, Lcom/google/android/gms/internal/fo;->j:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/canOpenURLs"

    sget-object v1, Lcom/google/android/gms/internal/fo;->b:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/canOpenIntents"

    sget-object v1, Lcom/google/android/gms/internal/fo;->c:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/click"

    sget-object v1, Lcom/google/android/gms/internal/fo;->d:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/close"

    sget-object v1, Lcom/google/android/gms/internal/fo;->e:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/customClose"

    sget-object v1, Lcom/google/android/gms/internal/fo;->f:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/instrument"

    sget-object v1, Lcom/google/android/gms/internal/fo;->m:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/delayPageLoaded"

    new-instance v1, Lcom/google/android/gms/internal/se;

    invoke-direct {v1, p0, v3}, Lcom/google/android/gms/internal/se;-><init>(Lcom/google/android/gms/internal/zzja;B)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/httpTrack"

    sget-object v1, Lcom/google/android/gms/internal/fo;->g:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/fo;->h:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/mraid"

    new-instance v1, Lcom/google/android/gms/internal/gl;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    invoke-direct {v1, p8, v2}, Lcom/google/android/gms/internal/gl;-><init>(Lcom/google/android/gms/ads/internal/zze;Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/mraidLoaded"

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->q:Lcom/google/android/gms/internal/ko;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/open"

    new-instance v1, Lcom/google/android/gms/internal/gm;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    invoke-direct {v1, p6, p8, v2}, Lcom/google/android/gms/internal/gm;-><init>(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/ads/internal/zze;Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/precache"

    sget-object v1, Lcom/google/android/gms/internal/fo;->l:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/touch"

    sget-object v1, Lcom/google/android/gms/internal/fo;->i:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/video"

    sget-object v1, Lcom/google/android/gms/internal/fo;->k:Lcom/google/android/gms/internal/fz;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    if-eqz p7, :cond_1

    const-string v0, "/setInterstitialProperties"

    new-instance v1, Lcom/google/android/gms/internal/gi;

    invoke-direct {v1, p7}, Lcom/google/android/gms/internal/gi;-><init>(Lcom/google/android/gms/internal/gj;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/zzja;->f:Lcom/google/android/gms/ads/internal/client/zza;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzja;->g:Lcom/google/android/gms/ads/internal/overlay/zzg;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzja;->i:Lcom/google/android/gms/internal/fl;

    iput-object p6, p0, Lcom/google/android/gms/internal/zzja;->l:Lcom/google/android/gms/internal/gh;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzja;->p:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iput-object p8, p0, Lcom/google/android/gms/internal/zzja;->r:Lcom/google/android/gms/ads/internal/zze;

    iput-object p9, p0, Lcom/google/android/gms/internal/zzja;->t:Lcom/google/android/gms/internal/kq;

    iput-object p7, p0, Lcom/google/android/gms/internal/zzja;->m:Lcom/google/android/gms/internal/gj;

    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/zzja;->zzF(Z)V

    iput-boolean v3, p0, Lcom/google/android/gms/internal/zzja;->u:Z

    return-void
.end method

.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzbY()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->n:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzd(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->s:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/kg;->a(II)V

    :cond_0
    return-void
.end method

.method public zze(Lcom/google/android/gms/internal/ry;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    return-void
.end method

.method public final zzeG()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->k:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->n:Z

    new-instance v0, Lcom/google/android/gms/internal/sa;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/sa;-><init>(Lcom/google/android/gms/internal/zzja;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->a(Ljava/lang/Runnable;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzh(Landroid/net/Uri;)V
    .locals 6

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->d:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbv()Lcom/google/android/gms/internal/qa;

    invoke-static {p1}, Lcom/google/android/gms/internal/qa;->a(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzN(I)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Received GMSG: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "  "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/fz;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0, v3, v2}, Lcom/google/android/gms/internal/fz;->zza(Lcom/google/android/gms/internal/ry;Ljava/util/Map;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No GMSG handler found for GMSG: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public zzhq()Lcom/google/android/gms/ads/internal/zze;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->r:Lcom/google/android/gms/ads/internal/zze;

    return-object v0
.end method

.method public zzhr()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->o:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzhs()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "Loading blank page in WebView, 2..."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->v:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    const-string v2, "about:blank"

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zzhw()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->h:Lcom/google/android/gms/internal/sb;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->w:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/zzja;->y:I

    if-lez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->x:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzja;->h:Lcom/google/android/gms/internal/sb;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzja;->x:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/sb;->a(Lcom/google/android/gms/internal/ry;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzja;->h:Lcom/google/android/gms/internal/sb;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzja;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->y()V

    return-void

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
