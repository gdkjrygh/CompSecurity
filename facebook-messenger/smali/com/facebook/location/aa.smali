.class public Lcom/facebook/location/aa;
.super Ljava/lang/Object;
.source "LocationSourcesUtil.java"


# static fields
.field private static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Landroid/location/LocationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 28
    const-string v0, "network"

    const-string v1, "gps"

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/location/aa;->a:Ljava/util/Set;

    .line 38
    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    const-string v1, "android.settings.SETTINGS"

    invoke-static {v0, v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/location/aa;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/facebook/location/aa;->c:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/facebook/location/aa;->d:Landroid/location/LocationManager;

    .line 51
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/location/aa;->d:Landroid/location/LocationManager;

    invoke-virtual {v0}, Landroid/location/LocationManager;->getAllProviders()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/location/aa;->d:Landroid/location/LocationManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/location/aa;->d:Landroid/location/LocationManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 88
    invoke-virtual {p0}, Lcom/facebook/location/aa;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/location/aa;->c()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/util/Set;Ljava/util/Set;)Lcom/google/common/a/kp;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 97
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 98
    sget-object v0, Lcom/facebook/location/aa;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 99
    iget-object v3, p0, Lcom/facebook/location/aa;->d:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 100
    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 114
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 115
    sget-object v0, Lcom/facebook/location/aa;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 116
    iget-object v3, p0, Lcom/facebook/location/aa;->d:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 117
    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 120
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
