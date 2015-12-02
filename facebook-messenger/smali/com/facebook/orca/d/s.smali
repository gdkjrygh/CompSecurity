.class public Lcom/facebook/orca/d/s;
.super Lcom/facebook/inject/c;
.source "AudioModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 211
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 51
    const-class v0, Lcom/facebook/orca/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/u;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 54
    const-class v0, Lcom/facebook/orca/d/r;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/x;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/x;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 56
    const-class v0, Lcom/facebook/orca/d/az;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/ac;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/ac;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 59
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsAudioRecorderEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/d/be;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 62
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsAudioPlayerEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/d/bd;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 65
    const-class v0, Lcom/facebook/orca/d/ay;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/ab;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/ab;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 69
    const-class v0, Lcom/facebook/orca/d/aw;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/aa;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/aa;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 72
    const-class v0, Lcom/facebook/orca/d/ae;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/y;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/y;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 74
    const-class v0, Lcom/facebook/orca/d/af;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/z;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 76
    const-class v0, Lcom/facebook/orca/d/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/v;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 78
    const-class v0, Lcom/facebook/orca/d/m;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/w;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 82
    const-class v0, Lcom/facebook/orca/d/bf;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/d/ad;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/d/ad;-><init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 86
    const-class v0, Lcom/facebook/ui/media/cache/g;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/d/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 88
    const-class v0, Lcom/facebook/analytics/periodicreporters/l;

    const-class v1, Lcom/facebook/analytics/periodicreporters/ClientPeriodicReporters;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/d/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 90
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/d/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 92
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/cache/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 94
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/cache/IsAccessPatternLoggingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/f/d;

    const-string v2, "fb4a_enable_media_cache_logging"

    invoke-direct {v1, v2}, Lcom/facebook/f/d;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 97
    return-void
.end method
