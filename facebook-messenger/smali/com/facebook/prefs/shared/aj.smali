.class public Lcom/facebook/prefs/shared/aj;
.super Ljava/lang/Object;
.source "SharedPrefKeys.java"


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
    .line 10
    new-instance v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/"

    invoke-direct {v0, v1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    .line 12
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "settings/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    .line 13
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "config/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->c:Lcom/facebook/prefs/shared/ae;

    .line 14
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "shared/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    .line 17
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "device_id"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->e:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "device_id_generate_timestamp"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->f:Lcom/facebook/prefs/shared/ae;

    .line 21
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "logged_in_after_last_auth"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->g:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "logging/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->h:Lcom/facebook/prefs/shared/ae;

    .line 26
    sget-object v0, Lcom/facebook/prefs/shared/aj;->h:Lcom/facebook/prefs/shared/ae;

    const-string v1, "logging_level"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->i:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/prefs/shared/aj;->h:Lcom/facebook/prefs/shared/ae;

    const-string v1, "debug_logs"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->j:Lcom/facebook/prefs/shared/ae;

    .line 30
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "analytics"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->k:Lcom/facebook/prefs/shared/ae;

    .line 31
    sget-object v0, Lcom/facebook/prefs/shared/aj;->k:Lcom/facebook/prefs/shared/ae;

    const-string v1, "device_stat_interval"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->l:Lcom/facebook/prefs/shared/ae;

    .line 33
    sget-object v0, Lcom/facebook/prefs/shared/aj;->k:Lcom/facebook/prefs/shared/ae;

    const-string v1, "batch_size"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->m:Lcom/facebook/prefs/shared/ae;

    .line 34
    sget-object v0, Lcom/facebook/prefs/shared/aj;->k:Lcom/facebook/prefs/shared/ae;

    const-string v1, "aggregation_interval"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->n:Lcom/facebook/prefs/shared/ae;

    .line 36
    sget-object v0, Lcom/facebook/prefs/shared/aj;->k:Lcom/facebook/prefs/shared/ae;

    const-string v1, "process_stat_interval"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->o:Lcom/facebook/prefs/shared/ae;

    .line 40
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "fps_controller/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->p:Lcom/facebook/prefs/shared/ae;

    .line 41
    sget-object v0, Lcom/facebook/prefs/shared/aj;->p:Lcom/facebook/prefs/shared/ae;

    const-string v1, "enable"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->q:Lcom/facebook/prefs/shared/ae;

    .line 42
    sget-object v0, Lcom/facebook/prefs/shared/aj;->p:Lcom/facebook/prefs/shared/ae;

    const-string v1, "logging"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->r:Lcom/facebook/prefs/shared/ae;

    .line 44
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "ui_thread_watchdog"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->s:Lcom/facebook/prefs/shared/ae;

    .line 46
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "imagecache/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->t:Lcom/facebook/prefs/shared/ae;

    .line 47
    sget-object v0, Lcom/facebook/prefs/shared/aj;->t:Lcom/facebook/prefs/shared/ae;

    const-string v1, "bitmap_purgeable"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->u:Lcom/facebook/prefs/shared/ae;

    .line 51
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "bug_reporting/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->v:Lcom/facebook/prefs/shared/ae;

    .line 53
    sget-object v0, Lcom/facebook/prefs/shared/aj;->v:Lcom/facebook/prefs/shared/ae;

    const-string v1, "rageshake/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->w:Lcom/facebook/prefs/shared/ae;

    .line 54
    sget-object v0, Lcom/facebook/prefs/shared/aj;->w:Lcom/facebook/prefs/shared/ae;

    const-string v1, "enable"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->x:Lcom/facebook/prefs/shared/ae;

    .line 57
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "new_tagging_interface"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->y:Lcom/facebook/prefs/shared/ae;

    .line 61
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "vault/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    .line 62
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "vault_blacklisted_sync_paths"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->A:Lcom/facebook/prefs/shared/ae;

    .line 64
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "device_fbid"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->B:Lcom/facebook/prefs/shared/ae;

    .line 65
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_synced_date"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->C:Lcom/facebook/prefs/shared/ae;

    .line 66
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "device_created_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->D:Lcom/facebook/prefs/shared/ae;

    .line 68
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sync_mode"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->E:Lcom/facebook/prefs/shared/ae;

    .line 69
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "retry_millis"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->F:Lcom/facebook/prefs/shared/ae;

    .line 70
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sync_old_photo"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->G:Lcom/facebook/prefs/shared/ae;

    .line 71
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "upload_state"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->H:Lcom/facebook/prefs/shared/ae;

    .line 72
    sget-object v0, Lcom/facebook/prefs/shared/aj;->z:Lcom/facebook/prefs/shared/ae;

    const-string v1, "vault_table_cutoff_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->I:Lcom/facebook/prefs/shared/ae;

    .line 77
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "dash/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->J:Lcom/facebook/prefs/shared/ae;

    .line 78
    sget-object v0, Lcom/facebook/prefs/shared/aj;->J:Lcom/facebook/prefs/shared/ae;

    const-string v1, "simulate_3G"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->K:Lcom/facebook/prefs/shared/ae;

    .line 83
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "platformads/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->L:Lcom/facebook/prefs/shared/ae;

    .line 84
    sget-object v0, Lcom/facebook/prefs/shared/aj;->L:Lcom/facebook/prefs/shared/ae;

    const-string v1, "tracked_packages/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/prefs/shared/aj;->M:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
