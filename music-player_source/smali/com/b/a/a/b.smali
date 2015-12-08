.class public final Lcom/b/a/a/b;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private d:Lcom/b/a/a/a;

.field private e:Lcom/b/a/a/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "last_config_time"

    iput-object v0, p0, Lcom/b/a/a/b;->a:Ljava/lang/String;

    const-string v0, "report_policy"

    iput-object v0, p0, Lcom/b/a/a/b;->b:Ljava/lang/String;

    const-string v0, "online_config"

    iput-object v0, p0, Lcom/b/a/a/b;->c:Ljava/lang/String;

    iput-object v1, p0, Lcom/b/a/a/b;->d:Lcom/b/a/a/a;

    iput-object v1, p0, Lcom/b/a/a/b;->e:Lcom/b/a/a/c;

    return-void
.end method
