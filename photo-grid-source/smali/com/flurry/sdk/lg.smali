.class public Lcom/flurry/sdk/lg;
.super Lcom/flurry/sdk/lh;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Integer;

.field public static final b:Ljava/lang/Integer;

.field public static final c:Ljava/lang/Integer;

.field public static final d:Ljava/lang/Integer;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/Boolean;

.field public static final g:Ljava/lang/Boolean;

.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/Boolean;

.field public static final j:Landroid/location/Criteria;

.field public static final k:Landroid/location/Location;

.field public static final l:Ljava/lang/Long;

.field public static final m:Ljava/lang/Boolean;

.field public static final n:Ljava/lang/Long;

.field public static final o:Ljava/lang/Byte;

.field public static final p:Ljava/lang/Boolean;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/Boolean;

.field private static s:Lcom/flurry/sdk/lg;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 63
    const/16 v0, 0xd5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->a:Ljava/lang/Integer;

    .line 64
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->b:Ljava/lang/Integer;

    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->c:Ljava/lang/Integer;

    .line 66
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->d:Ljava/lang/Integer;

    .line 69
    sput-object v3, Lcom/flurry/sdk/lg;->e:Ljava/lang/String;

    .line 70
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->f:Ljava/lang/Boolean;

    .line 71
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->g:Ljava/lang/Boolean;

    .line 72
    sput-object v3, Lcom/flurry/sdk/lg;->h:Ljava/lang/String;

    .line 73
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->i:Ljava/lang/Boolean;

    .line 74
    sput-object v3, Lcom/flurry/sdk/lg;->j:Landroid/location/Criteria;

    .line 75
    sput-object v3, Lcom/flurry/sdk/lg;->k:Landroid/location/Location;

    .line 76
    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->l:Ljava/lang/Long;

    .line 77
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->m:Ljava/lang/Boolean;

    .line 78
    sput-object v3, Lcom/flurry/sdk/lg;->n:Ljava/lang/Long;

    .line 79
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->o:Ljava/lang/Byte;

    .line 82
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->p:Ljava/lang/Boolean;

    .line 83
    sput-object v3, Lcom/flurry/sdk/lg;->q:Ljava/lang/String;

    .line 84
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/lg;->r:Ljava/lang/Boolean;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0}, Lcom/flurry/sdk/lh;-><init>()V

    .line 87
    invoke-virtual {p0}, Lcom/flurry/sdk/lg;->c()V

    .line 88
    return-void
.end method

.method public static declared-synchronized a()Lcom/flurry/sdk/lg;
    .locals 2

    .prologue
    .line 24
    const-class v1, Lcom/flurry/sdk/lg;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/flurry/sdk/lg;->s:Lcom/flurry/sdk/lg;

    if-nez v0, :cond_0

    .line 25
    new-instance v0, Lcom/flurry/sdk/lg;

    invoke-direct {v0}, Lcom/flurry/sdk/lg;-><init>()V

    sput-object v0, Lcom/flurry/sdk/lg;->s:Lcom/flurry/sdk/lg;

    .line 28
    :cond_0
    sget-object v0, Lcom/flurry/sdk/lg;->s:Lcom/flurry/sdk/lg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 24
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized b()V
    .locals 2

    .prologue
    .line 32
    const-class v1, Lcom/flurry/sdk/lg;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/flurry/sdk/lg;->s:Lcom/flurry/sdk/lg;

    if-eqz v0, :cond_0

    .line 33
    sget-object v0, Lcom/flurry/sdk/lg;->s:Lcom/flurry/sdk/lg;

    invoke-virtual {v0}, Lcom/flurry/sdk/lg;->d()V

    .line 36
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/flurry/sdk/lg;->s:Lcom/flurry/sdk/lg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    monitor-exit v1

    return-void

    .line 32
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public c()V
    .locals 2

    .prologue
    .line 91
    const-string v0, "AgentVersion"

    sget-object v1, Lcom/flurry/sdk/lg;->a:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    const-string v0, "ReleaseMajorVersion"

    sget-object v1, Lcom/flurry/sdk/lg;->b:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    const-string v0, "ReleaseMinorVersion"

    sget-object v1, Lcom/flurry/sdk/lg;->c:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    const-string v0, "ReleasePatchVersion"

    sget-object v1, Lcom/flurry/sdk/lg;->d:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    const-string v0, "ReleaseBetaVersion"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    const-string v0, "VersionName"

    sget-object v1, Lcom/flurry/sdk/lg;->e:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    const-string v0, "CaptureUncaughtExceptions"

    sget-object v1, Lcom/flurry/sdk/lg;->f:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 101
    const-string v0, "UseHttps"

    sget-object v1, Lcom/flurry/sdk/lg;->g:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    const-string v0, "ReportUrl"

    sget-object v1, Lcom/flurry/sdk/lg;->h:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    const-string v0, "ReportLocation"

    sget-object v1, Lcom/flurry/sdk/lg;->i:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 105
    const-string v0, "ExplicitLocation"

    sget-object v1, Lcom/flurry/sdk/lg;->k:Landroid/location/Location;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    const-string v0, "ContinueSessionMillis"

    sget-object v1, Lcom/flurry/sdk/lg;->l:Ljava/lang/Long;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    const-string v0, "LogEvents"

    sget-object v1, Lcom/flurry/sdk/lg;->m:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    const-string v0, "Age"

    sget-object v1, Lcom/flurry/sdk/lg;->n:Ljava/lang/Long;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    const-string v0, "Gender"

    sget-object v1, Lcom/flurry/sdk/lg;->o:Ljava/lang/Byte;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 111
    const-string v0, "UserId"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    const-string v0, "ProtonEnabled"

    sget-object v1, Lcom/flurry/sdk/lg;->p:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    const-string v0, "ProtonConfigUrl"

    sget-object v1, Lcom/flurry/sdk/lg;->q:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    const-string v0, "analyticsEnabled"

    sget-object v1, Lcom/flurry/sdk/lg;->r:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/flurry/sdk/lg;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    return-void
.end method
