.class public Lcom/facebook/http/f/c;
.super Ljava/lang/Object;
.source "InternalHttpPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;

.field public static final d:Lcom/facebook/prefs/shared/ae;

.field public static final e:Lcom/facebook/prefs/shared/ae;

.field public static final f:Lcom/facebook/prefs/shared/ae;

.field public static final g:Lcom/facebook/prefs/shared/ae;

.field public static final h:Lcom/facebook/prefs/shared/ae;

.field public static final i:Lcom/facebook/prefs/shared/ae;

.field public static final j:Lcom/facebook/prefs/shared/ae;

.field public static final k:Lcom/facebook/prefs/shared/ae;

.field public static final l:Lcom/facebook/prefs/shared/ae;

.field public static final m:Lcom/facebook/prefs/shared/ae;

.field public static final n:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "http/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->a:Lcom/facebook/prefs/shared/ae;

    .line 19
    sget-object v0, Lcom/facebook/http/f/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "php_profiling"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->b:Lcom/facebook/prefs/shared/ae;

    .line 21
    sget-object v0, Lcom/facebook/http/f/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "wirehog_profiling"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->c:Lcom/facebook/prefs/shared/ae;

    .line 23
    sget-object v0, Lcom/facebook/http/f/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "teak_profiling"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->d:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/http/f/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "carrier_id"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->e:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/http/f/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "check_certs"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->f:Lcom/facebook/prefs/shared/ae;

    .line 29
    sget-object v0, Lcom/facebook/http/f/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "http_proxy"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->g:Lcom/facebook/prefs/shared/ae;

    .line 34
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sandbox/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->h:Lcom/facebook/prefs/shared/ae;

    .line 35
    sget-object v0, Lcom/facebook/http/f/c;->h:Lcom/facebook/prefs/shared/ae;

    const-string v1, "web/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->i:Lcom/facebook/prefs/shared/ae;

    .line 36
    sget-object v0, Lcom/facebook/http/f/c;->i:Lcom/facebook/prefs/shared/ae;

    const-string v1, "server_tier"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->j:Lcom/facebook/prefs/shared/ae;

    .line 37
    sget-object v0, Lcom/facebook/http/f/c;->i:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sandbox"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->k:Lcom/facebook/prefs/shared/ae;

    .line 40
    sget-object v0, Lcom/facebook/http/f/c;->h:Lcom/facebook/prefs/shared/ae;

    const-string v1, "mqtt/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->l:Lcom/facebook/prefs/shared/ae;

    .line 41
    sget-object v0, Lcom/facebook/http/f/c;->l:Lcom/facebook/prefs/shared/ae;

    const-string v1, "server_tier"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->m:Lcom/facebook/prefs/shared/ae;

    .line 42
    sget-object v0, Lcom/facebook/http/f/c;->l:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sandbox"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/http/f/c;->n:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
