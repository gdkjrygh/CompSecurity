.class public Lcom/facebook/orca/prefs/n;
.super Ljava/lang/Object;
.source "MessagesPrefKeys.java"


# static fields
.field public static final A:Lcom/facebook/prefs/shared/ae;

.field public static final B:Lcom/facebook/prefs/shared/ae;

.field public static final C:Lcom/facebook/prefs/shared/ae;

.field public static final D:Lcom/facebook/prefs/shared/ae;

.field public static final E:Lcom/facebook/prefs/shared/ae;

.field public static final F:Lcom/facebook/prefs/shared/ae;

.field public static final G:Lcom/facebook/prefs/shared/ae;

.field public static final H:Lcom/facebook/prefs/shared/ae;

.field public static final I:Lcom/facebook/prefs/shared/ae;

.field public static final J:Lcom/facebook/prefs/shared/ae;

.field public static final K:Lcom/facebook/prefs/shared/ae;

.field public static final L:Lcom/facebook/prefs/shared/ae;

.field public static final M:Lcom/facebook/prefs/shared/ae;

.field public static final N:Lcom/facebook/prefs/shared/ae;

.field public static final O:Lcom/facebook/prefs/shared/ae;

.field public static final P:Lcom/facebook/prefs/shared/ae;

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
    .line 18
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "messages/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    .line 19
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "messages/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->b:Lcom/facebook/prefs/shared/ae;

    .line 22
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sms/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    .line 23
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_push_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->d:Lcom/facebook/prefs/shared/ae;

    .line 24
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_seen_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->e:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sms_enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->f:Lcom/facebook/prefs/shared/ae;

    .line 26
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sms_beta_enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sms_nux_progress"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->h:Lcom/facebook/prefs/shared/ae;

    .line 28
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "use_as_main_app"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->i:Lcom/facebook/prefs/shared/ae;

    .line 29
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_logged_externally_sent_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->j:Lcom/facebook/prefs/shared/ae;

    .line 31
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_log_run_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->k:Lcom/facebook/prefs/shared/ae;

    .line 32
    sget-object v0, Lcom/facebook/orca/prefs/n;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "merged_thread_upsell_accept"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->l:Lcom/facebook/prefs/shared/ae;

    .line 36
    sget-object v0, Lcom/facebook/orca/prefs/n;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "notifications/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    .line 38
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->n:Lcom/facebook/prefs/shared/ae;

    .line 40
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "muted_until2"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    .line 42
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sound_enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->p:Lcom/facebook/prefs/shared/ae;

    .line 44
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "vibrate_enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->q:Lcom/facebook/prefs/shared/ae;

    .line 46
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "led_enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->r:Lcom/facebook/prefs/shared/ae;

    .line 48
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "chat_heads_enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->s:Lcom/facebook/prefs/shared/ae;

    .line 50
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "ringtone_uri"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->t:Lcom/facebook/prefs/shared/ae;

    .line 53
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "headcase/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->u:Lcom/facebook/prefs/shared/ae;

    .line 55
    sget-object v0, Lcom/facebook/orca/prefs/n;->u:Lcom/facebook/prefs/shared/ae;

    const-string v1, "active"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->v:Lcom/facebook/prefs/shared/ae;

    .line 57
    sget-object v0, Lcom/facebook/orca/prefs/n;->u:Lcom/facebook/prefs/shared/ae;

    const-string v1, "swipe_type"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->w:Lcom/facebook/prefs/shared/ae;

    .line 61
    sget-object v0, Lcom/facebook/orca/prefs/n;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "location_services"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    .line 65
    sget-object v0, Lcom/facebook/orca/prefs/n;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "threads/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->y:Lcom/facebook/prefs/shared/ae;

    .line 67
    sget-object v0, Lcom/facebook/orca/prefs/n;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "canonical_recipients/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->z:Lcom/facebook/prefs/shared/ae;

    .line 71
    sget-object v0, Lcom/facebook/orca/prefs/n;->m:Lcom/facebook/prefs/shared/ae;

    const-string v1, "threads/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->A:Lcom/facebook/prefs/shared/ae;

    .line 75
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "notifications/recent_threads/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->B:Lcom/facebook/prefs/shared/ae;

    .line 80
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "notifications/chat_heads"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->C:Lcom/facebook/prefs/shared/ae;

    .line 83
    sget-object v0, Lcom/facebook/orca/prefs/n;->C:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/dock_x_percentage"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->D:Lcom/facebook/prefs/shared/ae;

    .line 85
    sget-object v0, Lcom/facebook/orca/prefs/n;->C:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/dock_y_percentage"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->E:Lcom/facebook/prefs/shared/ae;

    .line 87
    sget-object v0, Lcom/facebook/orca/prefs/n;->C:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/inactive_translucent"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->F:Lcom/facebook/prefs/shared/ae;

    .line 89
    sget-object v0, Lcom/facebook/orca/prefs/n;->C:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/has_chat_head_settings_been_reported"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->G:Lcom/facebook/prefs/shared/ae;

    .line 92
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "notifications/headcase"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->H:Lcom/facebook/prefs/shared/ae;

    .line 95
    sget-object v0, Lcom/facebook/orca/prefs/n;->H:Lcom/facebook/prefs/shared/ae;

    const-string v1, "/dock_y_precentage"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->I:Lcom/facebook/prefs/shared/ae;

    .line 100
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "block_dialog_radio_selection"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->J:Lcom/facebook/prefs/shared/ae;

    .line 104
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "show_contacts_suggestion_grid"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->K:Lcom/facebook/prefs/shared/ae;

    .line 108
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "ui_counters/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->L:Lcom/facebook/prefs/shared/ae;

    .line 111
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "contacts/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->M:Lcom/facebook/prefs/shared/ae;

    .line 112
    sget-object v0, Lcom/facebook/orca/prefs/n;->M:Lcom/facebook/prefs/shared/ae;

    const-string v1, "upload_enabled"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->N:Lcom/facebook/prefs/shared/ae;

    .line 115
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "group_name_upsell/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->O:Lcom/facebook/prefs/shared/ae;

    .line 117
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "groups_megaphone_show_count"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/n;->P:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/user/UserKey;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 132
    sget-object v1, Lcom/facebook/orca/prefs/n;->z:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1, v0}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/share_location"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 121
    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 122
    sget-object v1, Lcom/facebook/orca/prefs/n;->A:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1, v0}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/muted_until2"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 126
    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 127
    sget-object v1, Lcom/facebook/orca/prefs/n;->y:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1, v0}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/share_location"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 141
    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 142
    sget-object v1, Lcom/facebook/orca/prefs/n;->B:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1, v0}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 153
    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 154
    sget-object v1, Lcom/facebook/orca/prefs/n;->O:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1, v0}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/shown_times"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method
