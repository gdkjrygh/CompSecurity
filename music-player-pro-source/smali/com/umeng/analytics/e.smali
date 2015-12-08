.class Lcom/umeng/analytics/e;
.super Ljava/lang/Object;


# static fields
.field static final A:Ljava/lang/String; = "umeng_net_report_policy"

.field static final B:Ljava/lang/String; = "umeng_last_config_time"

.field static final C:Ljava/lang/String; = "report_interval"

.field static final a:Ljava/lang/String; = "Android"

.field static final b:Ljava/lang/String; = "Android"

.field static final c:Ljava/lang/String; = "4.5"

.field static d:J = 0x0L

.field static final e:I = 0x8

.field static final f:I = 0xa

.field static g:Z = false

.field static h:Z = false

.field static i:Z = false

.field static j:Z = false

.field static k:Z = false

.field static final l:Ljava/lang/String; = "last_send_time"

.field static final m:Ljava/lang/String; = "cache_version"

.field static final n:Ljava/lang/Object;

.field static final o:Ljava/lang/String; = "MobclickAgent"

.field static final p:[Ljava/lang/String;

.field static final q:Ljava/lang/String; = "http://oc.umeng.com/check_config_update"

.field static final r:Ljava/lang/String; = "http://oc.umeng.co/check_config_update"

.field static s:Z = false

.field static final t:Ljava/lang/String; = "age"

.field static final u:Ljava/lang/String; = "gender"

.field static final v:Ljava/lang/String; = "user_id"

.field static final w:Ljava/lang/String; = "id_source"

.field static final x:Ljava/lang/String; = "traffics_up"

.field static final y:Ljava/lang/String; = "traffics_down"

.field static final z:Ljava/lang/String; = "umeng_local_report_policy"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const-wide/16 v0, 0x7530

    sput-wide v0, Lcom/umeng/analytics/e;->d:J

    sput-boolean v3, Lcom/umeng/analytics/e;->g:Z

    sput-boolean v3, Lcom/umeng/analytics/e;->h:Z

    sput-boolean v3, Lcom/umeng/analytics/e;->i:Z

    sput-boolean v3, Lcom/umeng/analytics/e;->j:Z

    sput-boolean v3, Lcom/umeng/analytics/e;->k:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/analytics/e;->n:Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "http://alog.umeng.com/app_logs"

    aput-object v2, v0, v1

    const-string v1, "http://alog.umeng.co/app_logs"

    aput-object v1, v0, v3

    sput-object v0, Lcom/umeng/analytics/e;->p:[Ljava/lang/String;

    sput-boolean v3, Lcom/umeng/analytics/e;->s:Z

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
