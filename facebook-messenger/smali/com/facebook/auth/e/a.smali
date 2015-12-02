.class public Lcom/facebook/auth/e/a;
.super Ljava/lang/Object;
.source "AuthPrefKeys.java"


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

.field public static final o:Lcom/facebook/prefs/shared/ae;

.field public static final p:Lcom/facebook/prefs/shared/ae;

.field public static final q:Lcom/facebook/prefs/shared/ae;

.field public static final r:Lcom/facebook/prefs/shared/ae;

.field public static final s:Lcom/facebook/prefs/shared/ae;

.field public static final t:Lcom/facebook/prefs/shared/ae;

.field public static final u:Lcom/facebook/prefs/shared/ae;

.field public static final v:Lcom/facebook/prefs/shared/ae;

.field public static final w:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 17
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "auth/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->a:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/auth/e/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "user_data/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    .line 19
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_uid"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->c:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_token"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->d:Lcom/facebook/prefs/shared/ae;

    .line 21
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_expires"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->e:Lcom/facebook/prefs/shared/ae;

    .line 22
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_session_cookies_string"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->f:Lcom/facebook/prefs/shared/ae;

    .line 24
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_is_partial_account"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->g:Lcom/facebook/prefs/shared/ae;

    .line 26
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_logged_out"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->h:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/auth/e/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "auth_machine_id"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->i:Lcom/facebook/prefs/shared/ae;

    .line 28
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_session_secret"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->j:Lcom/facebook/prefs/shared/ae;

    .line 30
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_session_key"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->k:Lcom/facebook/prefs/shared/ae;

    .line 31
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_credentials_masked"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->l:Lcom/facebook/prefs/shared/ae;

    .line 33
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_username"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->m:Lcom/facebook/prefs/shared/ae;

    .line 40
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "auto_sso_login"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->n:Lcom/facebook/prefs/shared/ae;

    .line 43
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "reg/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->o:Lcom/facebook/prefs/shared/ae;

    .line 44
    sget-object v0, Lcom/facebook/auth/e/a;->o:Lcom/facebook/prefs/shared/ae;

    const-string v1, "reg_instance"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->p:Lcom/facebook/prefs/shared/ae;

    .line 45
    sget-object v0, Lcom/facebook/auth/e/a;->o:Lcom/facebook/prefs/shared/ae;

    const-string v1, "conf_code"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->q:Lcom/facebook/prefs/shared/ae;

    .line 46
    sget-object v0, Lcom/facebook/auth/e/a;->o:Lcom/facebook/prefs/shared/ae;

    const-string v1, "conf_code_phone"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->r:Lcom/facebook/prefs/shared/ae;

    .line 47
    sget-object v0, Lcom/facebook/auth/e/a;->o:Lcom/facebook/prefs/shared/ae;

    const-string v1, "conf_code_country"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->s:Lcom/facebook/prefs/shared/ae;

    .line 48
    sget-object v0, Lcom/facebook/auth/e/a;->o:Lcom/facebook/prefs/shared/ae;

    const-string v1, "conf_code_timestamp"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->t:Lcom/facebook/prefs/shared/ae;

    .line 50
    const-string v0, "messenger_auth_expire_session_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/auth/e/a;->u:Lcom/facebook/prefs/shared/ae;

    .line 52
    sget-object v0, Lcom/facebook/auth/e/a;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fb_me_user"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->v:Lcom/facebook/prefs/shared/ae;

    .line 54
    sget-object v0, Lcom/facebook/auth/e/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "me_user_version"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/auth/e/a;->w:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
