.class public Lcom/facebook/orca/app/fe;
.super Ljava/lang/Object;
.source "OrcaAnalyticsConfig.java"

# interfaces
.implements Lcom/facebook/analytics/ak;


# static fields
.field private static final a:Lcom/facebook/prefs/shared/ae;

.field private static final b:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/base/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-string v0, "messenger_client_analytics_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/app/fe;->a:Lcom/facebook/prefs/shared/ae;

    .line 18
    const-string v0, "messenger_client_core_analytics_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/app/fe;->b:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/base/a/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/base/a/d;",
            ")V"
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/orca/app/fe;->c:Ljavax/inject/a;

    .line 30
    iput-object p2, p0, Lcom/facebook/orca/app/fe;->d:Lcom/facebook/prefs/shared/d;

    .line 31
    iput-object p3, p0, Lcom/facebook/orca/app/fe;->e:Lcom/facebook/base/a/d;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/al;
    .locals 3

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/app/fe;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 36
    iget-object v1, p0, Lcom/facebook/orca/app/fe;->e:Lcom/facebook/base/a/d;

    invoke-virtual {v1}, Lcom/facebook/base/a/d;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_1

    .line 37
    :cond_0
    sget-object v0, Lcom/facebook/analytics/al;->UNSET:Lcom/facebook/analytics/al;

    .line 53
    :goto_0
    return-object v0

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/app/fe;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/app/fe;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 44
    sget-object v0, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    goto :goto_0

    .line 49
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/app/fe;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/app/fe;->b:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 50
    sget-object v0, Lcom/facebook/analytics/al;->CORE:Lcom/facebook/analytics/al;

    goto :goto_0

    .line 53
    :cond_3
    sget-object v0, Lcom/facebook/analytics/al;->NONE:Lcom/facebook/analytics/al;

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/orca/app/fe;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 59
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/User;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    const/4 v0, 0x1

    .line 62
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
