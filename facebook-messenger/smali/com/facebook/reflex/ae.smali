.class public Lcom/facebook/reflex/ae;
.super Ljava/lang/Object;
.source "ReflexPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;

.field public static final d:Lcom/facebook/prefs/shared/ae;

.field public static final e:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 9
    sget-object v0, Lcom/facebook/prefs/shared/aj;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "reflex"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/reflex/ae;->a:Lcom/facebook/prefs/shared/ae;

    .line 11
    sget-object v0, Lcom/facebook/reflex/ae;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "experiments"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/reflex/ae;->b:Lcom/facebook/prefs/shared/ae;

    .line 13
    sget-object v0, Lcom/facebook/reflex/ae;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "driverinfo"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/reflex/ae;->c:Lcom/facebook/prefs/shared/ae;

    .line 15
    sget-object v0, Lcom/facebook/reflex/ae;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "log_timestamp"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/reflex/ae;->d:Lcom/facebook/prefs/shared/ae;

    .line 17
    sget-object v0, Lcom/facebook/reflex/ae;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "checkerboard_log_timestamp"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/reflex/ae;->e:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
