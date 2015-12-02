.class public Lcom/facebook/abtest/qe/data/a;
.super Ljava/lang/Object;
.source "QuickExperimentConfigPrefKeys.java"

# interfaces
.implements Lcom/facebook/prefs/shared/ad;


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
    .line 15
    sget-object v0, Lcom/facebook/prefs/shared/aj;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "qe/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/abtest/qe/data/a;->a:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/abtest/qe/data/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_fetch_time_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/abtest/qe/data/a;->b:Lcom/facebook/prefs/shared/ae;

    .line 17
    sget-object v0, Lcom/facebook/abtest/qe/data/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_fetch_locale"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/abtest/qe/data/a;->c:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/abtest/qe/data/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_foreground_time_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/abtest/qe/data/a;->d:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/abtest/qe/data/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "expire_ttl_ms_override"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/abtest/qe/data/a;->e:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            ">;"
        }
    .end annotation

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/abtest/qe/data/a;->b:Lcom/facebook/prefs/shared/ae;

    sget-object v1, Lcom/facebook/abtest/qe/data/a;->c:Lcom/facebook/prefs/shared/ae;

    sget-object v2, Lcom/facebook/abtest/qe/data/a;->e:Lcom/facebook/prefs/shared/ae;

    invoke-static {v0, v1, v2}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
