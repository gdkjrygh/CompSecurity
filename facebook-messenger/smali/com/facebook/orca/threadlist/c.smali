.class public Lcom/facebook/orca/threadlist/c;
.super Ljava/lang/Object;
.source "ContextMenuEntryPointExperiment.java"


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


# instance fields
.field private final b:Lcom/facebook/abtest/qe/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/a",
            "<",
            "Lcom/facebook/orca/threadlist/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/orca/threadlist/c;

    sput-object v0, Lcom/facebook/orca/threadlist/c;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/d/e;)V
    .locals 3

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    const-string v1, "android_messenger_context_menu_entry_point"

    new-instance v2, Lcom/facebook/orca/threadlist/d;

    invoke-direct {v2, p0}, Lcom/facebook/orca/threadlist/d;-><init>(Lcom/facebook/orca/threadlist/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/c;->b:Lcom/facebook/abtest/qe/d/a;

    .line 55
    return-void
.end method

.method private a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadlist/e;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 67
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lcom/facebook/orca/threadlist/e;

    invoke-direct {v0, v2, v2, v2, v2}, Lcom/facebook/orca/threadlist/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/orca/threadlist/d;)V

    .line 89
    :goto_0
    return-object v0

    .line 72
    :cond_0
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 74
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    .line 78
    :goto_1
    const-string v0, "group"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 80
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v3, v0

    .line 84
    :goto_2
    const-string v0, "broadcast"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 86
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 89
    :goto_3
    new-instance v4, Lcom/facebook/orca/threadlist/e;

    invoke-direct {v4, v1, v3, v0, v2}, Lcom/facebook/orca/threadlist/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/orca/threadlist/d;)V

    move-object v0, v4

    goto :goto_0

    :cond_1
    move-object v0, v2

    goto :goto_3

    :cond_2
    move-object v3, v2

    goto :goto_2

    :cond_3
    move-object v1, v2

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/c;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadlist/e;
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/c;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadlist/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadlist/e;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/threadlist/c;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/e;

    return-object v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/threadlist/c;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->d()V

    .line 64
    return-void
.end method
