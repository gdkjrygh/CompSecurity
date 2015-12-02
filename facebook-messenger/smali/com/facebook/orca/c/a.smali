.class public Lcom/facebook/orca/c/a;
.super Ljava/lang/Object;
.source "VersionChecker.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/appconfig/m;

.field private final c:Lcom/facebook/orca/common/a/d;

.field private final d:Lcom/facebook/config/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/orca/c/a;

    sput-object v0, Lcom/facebook/orca/c/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/appconfig/m;Lcom/facebook/orca/common/a/d;Lcom/facebook/config/b/a;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    .line 28
    iput-object p2, p0, Lcom/facebook/orca/c/a;->c:Lcom/facebook/orca/common/a/d;

    .line 29
    iput-object p3, p0, Lcom/facebook/orca/c/a;->d:Lcom/facebook/config/b/a;

    .line 30
    return-void
.end method

.method private a(Z)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 51
    sget-object v2, Lcom/facebook/orca/c/a;->a:Ljava/lang/Class;

    invoke-direct {p0}, Lcom/facebook/orca/c/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 52
    iget-object v2, p0, Lcom/facebook/orca/c/a;->d:Lcom/facebook/config/b/a;

    invoke-interface {v2}, Lcom/facebook/config/b/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/c/a;->b(Z)Ljava/lang/String;

    move-result-object v3

    .line 54
    if-nez v3, :cond_1

    .line 67
    :cond_0
    :goto_0
    return v0

    .line 58
    :cond_1
    iget-object v4, p0, Lcom/facebook/orca/c/a;->c:Lcom/facebook/orca/common/a/d;

    invoke-virtual {v4, v2, v3}, Lcom/facebook/orca/common/a/d;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_2

    move v0, v1

    .line 59
    goto :goto_0

    .line 62
    :cond_2
    iget-object v2, p0, Lcom/facebook/orca/c/a;->d:Lcom/facebook/config/b/a;

    invoke-interface {v2}, Lcom/facebook/config/b/a;->b()I

    move-result v2

    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/orca/c/a;->c(Z)I

    move-result v3

    .line 64
    if-ge v2, v3, :cond_0

    move v0, v1

    .line 65
    goto :goto_0
.end method

.method private b(Z)Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private c(Z)I
    .locals 1

    .prologue
    .line 77
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->c()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->d()I

    move-result v0

    goto :goto_0
.end method

.method private c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 83
    const-string v0, "AppConfig"

    invoke-static {v0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/String;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "minVersion"

    iget-object v2, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v2}, Lcom/facebook/appconfig/m;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "minVersionCode"

    iget-object v2, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v2}, Lcom/facebook/appconfig/m;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "currentVersion"

    iget-object v2, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v2}, Lcom/facebook/appconfig/m;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "currentVersionCode"

    iget-object v2, p0, Lcom/facebook/orca/c/a;->b:Lcom/facebook/appconfig/m;

    invoke-virtual {v2}, Lcom/facebook/appconfig/m;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/c/a;->a(Z)Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/c/a;->a(Z)Z

    move-result v0

    return v0
.end method
