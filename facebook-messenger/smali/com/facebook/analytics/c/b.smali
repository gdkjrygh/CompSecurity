.class public Lcom/facebook/analytics/c/b;
.super Ljava/lang/Object;
.source "AnalyticsDbProperties.java"


# static fields
.field public static final a:Lcom/facebook/analytics/c/c;

.field public static final b:Lcom/facebook/analytics/c/c;

.field public static final c:Lcom/facebook/analytics/c/c;

.field public static final d:Lcom/facebook/analytics/c/c;

.field public static final e:Lcom/facebook/analytics/c/c;

.field public static final f:Lcom/facebook/analytics/c/c;

.field public static final g:Lcom/facebook/analytics/c/c;

.field public static final h:Lcom/facebook/analytics/c/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 10
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/last_send_time"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->a:Lcom/facebook/analytics/c/c;

    .line 13
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/last_ui_event_time"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->b:Lcom/facebook/analytics/c/c;

    .line 16
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/last_event_time"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->c:Lcom/facebook/analytics/c/c;

    .line 19
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/session_id"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->d:Lcom/facebook/analytics/c/c;

    .line 22
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/session_user_id"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->e:Lcom/facebook/analytics/c/c;

    .line 25
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/session_batch_seq_id"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->f:Lcom/facebook/analytics/c/c;

    .line 28
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/last_device_info_sent_time"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->g:Lcom/facebook/analytics/c/c;

    .line 31
    new-instance v0, Lcom/facebook/analytics/c/c;

    const-string v1, "/last_cleanup_time"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/c/b;->h:Lcom/facebook/analytics/c/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
