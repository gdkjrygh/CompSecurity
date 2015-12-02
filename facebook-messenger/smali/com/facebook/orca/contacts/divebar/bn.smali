.class public Lcom/facebook/orca/contacts/divebar/bn;
.super Ljava/lang/Object;
.source "RichPresenceExperiment.java"


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
            "Lcom/facebook/orca/contacts/divebar/bp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/orca/contacts/divebar/bn;

    sput-object v0, Lcom/facebook/orca/contacts/divebar/bn;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/d/e;)V
    .locals 3

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    const-string v1, "android_messenger_rich_presence"

    new-instance v2, Lcom/facebook/orca/contacts/divebar/bo;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/bo;-><init>(Lcom/facebook/orca/contacts/divebar/bn;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/bn;->b:Lcom/facebook/abtest/qe/d/a;

    .line 52
    return-void
.end method

.method private a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/bp;
    .locals 3

    .prologue
    .line 64
    new-instance v0, Lcom/facebook/orca/contacts/divebar/bp;

    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/bn;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/contacts/divebar/bp;-><init>(ZLcom/facebook/orca/contacts/divebar/bo;)V

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/bn;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/bp;
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/bn;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/bp;

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
    .line 78
    invoke-virtual {p1}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {p1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    .line 82
    :goto_0
    return p2

    .line 81
    :cond_0
    sget-object v0, Lcom/facebook/orca/contacts/divebar/bn;->a:Ljava/lang/Class;

    const-string v1, "Experiment parameter not found! using the default value ..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 68
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v1

    if-nez v1, :cond_0

    .line 72
    :goto_0
    return v0

    :cond_0
    const-string v1, "text_context_presence"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/contacts/divebar/bn;->a(Lcom/google/common/base/Optional;Z)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/bp;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bn;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/bp;

    return-object v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bn;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->d()V

    .line 61
    return-void
.end method
