.class public Lcom/facebook/push/c2dm/c;
.super Ljava/lang/Object;
.source "C2DMPrefKeys.java"


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

.field private static final m:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "messenger/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->m:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/push/c2dm/c;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "c2dm/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    .line 19
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "token"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->b:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "token_owner"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->c:Lcom/facebook/prefs/shared/ae;

    .line 21
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_register_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->d:Lcom/facebook/prefs/shared/ae;

    .line 22
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_change_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->e:Lcom/facebook/prefs/shared/ae;

    .line 23
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "backoff_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->f:Lcom/facebook/prefs/shared/ae;

    .line 24
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_push_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->g:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_service_attempt_type"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->h:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "service_type"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->i:Lcom/facebook/prefs/shared/ae;

    .line 29
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_server_registered"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->j:Lcom/facebook/prefs/shared/ae;

    .line 31
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_server_last_register_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->k:Lcom/facebook/prefs/shared/ae;

    .line 34
    sget-object v0, Lcom/facebook/push/c2dm/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_server_build"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/c2dm/c;->l:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
