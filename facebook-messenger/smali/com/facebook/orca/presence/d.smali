.class public Lcom/facebook/orca/presence/d;
.super Ljava/lang/Object;
.source "MobilePresenceIconExperiment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/orca/presence/g;


# instance fields
.field private final c:Lcom/facebook/abtest/qe/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/a",
            "<",
            "Lcom/facebook/orca/presence/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/orca/presence/d;

    sput-object v0, Lcom/facebook/orca/presence/d;->a:Ljava/lang/Class;

    .line 77
    sget-object v0, Lcom/facebook/orca/presence/g;->WHITE_PHONE:Lcom/facebook/orca/presence/g;

    sput-object v0, Lcom/facebook/orca/presence/d;->b:Lcom/facebook/orca/presence/g;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/d/e;)V
    .locals 3

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    const-string v1, "messenger_mobile_presence_icon_master"

    new-instance v2, Lcom/facebook/orca/presence/e;

    invoke-direct {v2, p0}, Lcom/facebook/orca/presence/e;-><init>(Lcom/facebook/orca/presence/d;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/presence/d;->c:Lcom/facebook/abtest/qe/d/a;

    .line 96
    return-void
.end method

.method private a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/presence/f;
    .locals 5

    .prologue
    .line 104
    new-instance v0, Lcom/facebook/orca/presence/f;

    invoke-direct {p0, p1}, Lcom/facebook/orca/presence/d;->c(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/presence/g;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/facebook/orca/presence/d;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z

    move-result v2

    invoke-direct {p0, p1}, Lcom/facebook/orca/presence/d;->d(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/orca/presence/f;-><init>(Lcom/facebook/orca/presence/g;ZZLcom/facebook/orca/presence/e;)V

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/presence/d;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/presence/f;
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/presence/d;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/presence/f;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/common/base/Optional;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;Z)Z"
        }
    .end annotation

    .prologue
    .line 133
    invoke-virtual {p1}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    invoke-virtual {p1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    .line 137
    :goto_0
    return p2

    .line 136
    :cond_0
    sget-object v0, Lcom/facebook/orca/presence/d;->a:Ljava/lang/Class;

    const-string v1, "Experiment parameter not found! using the default value ..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 108
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v1

    if-nez v1, :cond_0

    .line 111
    :goto_0
    return v0

    :cond_0
    const-string v1, "show_time_stamp"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/presence/d;->a(Lcom/google/common/base/Optional;Z)Z

    move-result v0

    goto :goto_0
.end method

.method private c(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/presence/g;
    .locals 2

    .prologue
    .line 115
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    sget-object v0, Lcom/facebook/orca/presence/d;->b:Lcom/facebook/orca/presence/g;

    .line 122
    :goto_0
    return-object v0

    .line 118
    :cond_0
    const-string v0, "mobile_icon"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/orca/presence/g;->fromName(Ljava/lang/String;)Lcom/facebook/orca/presence/g;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/facebook/orca/presence/g;->NOT_SPECIFIED:Lcom/facebook/orca/presence/g;

    goto :goto_0
.end method

.method private d(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 126
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v1

    if-nez v1, :cond_0

    .line 129
    :goto_0
    return v0

    :cond_0
    const-string v1, "fading_icon"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/presence/d;->a(Lcom/google/common/base/Optional;Z)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/presence/f;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/orca/presence/d;->c:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/presence/f;

    return-object v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/orca/presence/d;->c:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->d()V

    .line 143
    return-void
.end method
