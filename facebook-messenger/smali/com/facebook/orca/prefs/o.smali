.class public Lcom/facebook/orca/prefs/o;
.super Ljava/lang/Object;
.source "MessengerPrefKeys.java"


# static fields
.field public static final A:Lcom/facebook/prefs/shared/ae;

.field public static final B:Lcom/facebook/prefs/shared/ae;

.field public static final C:Lcom/facebook/prefs/shared/ae;

.field public static final D:Lcom/facebook/prefs/shared/ae;

.field public static final E:Lcom/facebook/prefs/shared/ae;

.field public static final F:Lcom/facebook/prefs/shared/ae;

.field public static final G:Lcom/facebook/prefs/shared/ae;

.field public static final H:Lcom/facebook/prefs/shared/ae;

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

.field public static final x:Lcom/facebook/prefs/shared/ae;

.field public static final y:Lcom/facebook/prefs/shared/ae;

.field public static final z:Lcom/facebook/prefs/shared/ae;


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

    sput-object v0, Lcom/facebook/orca/prefs/o;->a:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "messenger/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->b:Lcom/facebook/prefs/shared/ae;

    .line 19
    sget-object v0, Lcom/facebook/orca/prefs/o;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "first_install_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->c:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/orca/prefs/o;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "nux_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->d:Lcom/facebook/prefs/shared/ae;

    .line 21
    sget-object v0, Lcom/facebook/orca/prefs/o;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "login_reminder_trigger_state"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->e:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "nux/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    .line 26
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "version"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->g:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "is_upgrade_user"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->h:Lcom/facebook/prefs/shared/ae;

    .line 28
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "completed_version"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->i:Lcom/facebook/prefs/shared/ae;

    .line 29
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sms_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    .line 30
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sms_force"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->k:Lcom/facebook/prefs/shared/ae;

    .line 31
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sms_thread_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->l:Lcom/facebook/prefs/shared/ae;

    .line 33
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "chat_head_first_head_nux_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->m:Lcom/facebook/prefs/shared/ae;

    .line 35
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "chat_head_close_nux_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->n:Lcom/facebook/prefs/shared/ae;

    .line 38
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "compose_button_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->o:Lcom/facebook/prefs/shared/ae;

    .line 40
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "dive_bar_button_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->p:Lcom/facebook/prefs/shared/ae;

    .line 42
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "contacts_import_nux_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->q:Lcom/facebook/prefs/shared/ae;

    .line 44
    sget-object v0, Lcom/facebook/orca/prefs/o;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "audio_recordng_nux_completed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->r:Lcom/facebook/prefs/shared/ae;

    .line 48
    sget-object v0, Lcom/facebook/orca/prefs/o;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "phone_confirm/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->s:Lcom/facebook/prefs/shared/ae;

    .line 49
    sget-object v0, Lcom/facebook/orca/prefs/o;->s:Lcom/facebook/prefs/shared/ae;

    const-string v1, "skipped_phone_verification_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->t:Lcom/facebook/prefs/shared/ae;

    .line 51
    sget-object v0, Lcom/facebook/orca/prefs/o;->s:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_sent_confirmation_code_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->u:Lcom/facebook/prefs/shared/ae;

    .line 53
    sget-object v0, Lcom/facebook/orca/prefs/o;->s:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_sent_country_code"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->v:Lcom/facebook/prefs/shared/ae;

    .line 55
    sget-object v0, Lcom/facebook/orca/prefs/o;->s:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_sent_number"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->w:Lcom/facebook/prefs/shared/ae;

    .line 58
    sget-object v0, Lcom/facebook/orca/prefs/o;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "force_fb4a_look_and_feel"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->x:Lcom/facebook/prefs/shared/ae;

    .line 62
    sget-object v0, Lcom/facebook/orca/prefs/o;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "force_alternative_wildfire_start"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->y:Lcom/facebook/prefs/shared/ae;

    .line 64
    sget-object v0, Lcom/facebook/orca/prefs/o;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "force_wildfire_skip_start"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->z:Lcom/facebook/prefs/shared/ae;

    .line 68
    sget-object v0, Lcom/facebook/orca/prefs/o;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "version_promo/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->A:Lcom/facebook/prefs/shared/ae;

    .line 69
    sget-object v0, Lcom/facebook/orca/prefs/o;->A:Lcom/facebook/prefs/shared/ae;

    const-string v1, "dismissed_version"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->B:Lcom/facebook/prefs/shared/ae;

    .line 71
    sget-object v0, Lcom/facebook/orca/prefs/o;->A:Lcom/facebook/prefs/shared/ae;

    const-string v1, "dismissed_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->C:Lcom/facebook/prefs/shared/ae;

    .line 74
    sget-object v0, Lcom/facebook/orca/prefs/o;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "invite_all/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->D:Lcom/facebook/prefs/shared/ae;

    .line 75
    sget-object v0, Lcom/facebook/orca/prefs/o;->D:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/last_dismissed_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->E:Lcom/facebook/prefs/shared/ae;

    .line 77
    sget-object v0, Lcom/facebook/orca/prefs/o;->D:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/times_dismissed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->F:Lcom/facebook/prefs/shared/ae;

    .line 79
    sget-object v0, Lcom/facebook/orca/prefs/o;->D:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/has_converted"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->G:Lcom/facebook/prefs/shared/ae;

    .line 80
    sget-object v0, Lcom/facebook/orca/prefs/o;->D:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/last_converted"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/o;->H:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
