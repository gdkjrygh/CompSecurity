.class public Lcom/facebook/selfupdate/j;
.super Ljava/lang/Object;
.source "SelfUpdateConstants.java"


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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 9
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "selfupdate/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    .line 11
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "scheduled_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->b:Lcom/facebook/prefs/shared/ae;

    .line 12
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "schedule_interval"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->c:Lcom/facebook/prefs/shared/ae;

    .line 14
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "new_build"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    .line 15
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "new_build_url"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->e:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "new_version_notes"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->f:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "download_id"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->g:Lcom/facebook/prefs/shared/ae;

    .line 19
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "local_file"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->h:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "hard_nag"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->i:Lcom/facebook/prefs/shared/ae;

    .line 21
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "app_name"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->j:Lcom/facebook/prefs/shared/ae;

    .line 22
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "app_version"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->k:Lcom/facebook/prefs/shared/ae;

    .line 23
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "postponed_build"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->l:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "postponed_until"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->m:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "download_status"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->n:Lcom/facebook/prefs/shared/ae;

    .line 29
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "megaphone"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->o:Lcom/facebook/prefs/shared/ae;

    .line 30
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "mimetype"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->p:Lcom/facebook/prefs/shared/ae;

    .line 31
    sget-object v0, Lcom/facebook/selfupdate/j;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "file_size"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/selfupdate/j;->q:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
