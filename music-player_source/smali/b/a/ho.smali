.class public final Lb/a/ho;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Z

.field private c:Landroid/content/SharedPreferences;

.field private d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "umeng_event_snapshot"

    iput-object v0, p0, Lb/a/ho;->a:Ljava/lang/String;

    iput-boolean v1, p0, Lb/a/ho;->b:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb/a/ho;->d:Ljava/util/Map;

    const-string v0, "umeng_event_snapshot"

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lb/a/ho;->c:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lb/a/ho;->b:Z

    return-void
.end method
