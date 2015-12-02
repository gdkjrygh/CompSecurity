.class public Lcom/facebook/orca/a/d;
.super Ljava/lang/Object;
.source "MessengerGroupNameUpsellInitializer.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/orca/a/b;

.field private static final c:Lcom/facebook/orca/a/a;


# instance fields
.field private final d:Lcom/facebook/abtest/qe/c;

.field private final e:Lcom/facebook/common/e/h;

.field private final f:Ljava/util/concurrent/Executor;

.field private g:Lcom/facebook/orca/a/a;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private h:Lcom/facebook/orca/a/g;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/a/d;

    sput-object v0, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    .line 36
    sget-object v0, Lcom/facebook/orca/a/b;->NONE:Lcom/facebook/orca/a/b;

    sput-object v0, Lcom/facebook/orca/a/d;->b:Lcom/facebook/orca/a/b;

    .line 39
    new-instance v0, Lcom/facebook/orca/a/a;

    sget-object v1, Lcom/facebook/orca/a/d;->b:Lcom/facebook/orca/a/b;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/a/a;-><init>(Lcom/facebook/orca/a/b;I)V

    sput-object v0, Lcom/facebook/orca/a/d;->c:Lcom/facebook/orca/a/a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/c;Lcom/facebook/common/e/h;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    sget-object v0, Lcom/facebook/orca/a/d;->c:Lcom/facebook/orca/a/a;

    iput-object v0, p0, Lcom/facebook/orca/a/d;->g:Lcom/facebook/orca/a/a;

    .line 58
    iput-object p1, p0, Lcom/facebook/orca/a/d;->d:Lcom/facebook/abtest/qe/c;

    .line 59
    iput-object p2, p0, Lcom/facebook/orca/a/d;->e:Lcom/facebook/common/e/h;

    .line 60
    iput-object p3, p0, Lcom/facebook/orca/a/d;->f:Ljava/util/concurrent/Executor;

    .line 61
    sget-object v0, Lcom/facebook/orca/a/g;->UNINITIALIZED:Lcom/facebook/orca/a/g;

    iput-object v0, p0, Lcom/facebook/orca/a/d;->h:Lcom/facebook/orca/a/g;

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/a/d;)Lcom/facebook/common/e/h;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/orca/a/d;->e:Lcom/facebook/common/e/h;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/a/d;Lcom/facebook/orca/a/g;)Lcom/facebook/orca/a/g;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/orca/a/d;->h:Lcom/facebook/orca/a/g;

    return-object p1
.end method

.method private a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 5
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation

    .prologue
    const/4 v2, 0x3

    .line 114
    const-string v0, "local_default_group"

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    :goto_0
    return-void

    .line 117
    :cond_0
    sget-object v0, Lcom/facebook/orca/a/d;->b:Lcom/facebook/orca/a/b;

    .line 118
    const-string v1, "upsell_type"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    .line 119
    invoke-virtual {v1}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 120
    invoke-virtual {v1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/orca/a/b;->lookup(Ljava/lang/String;)Lcom/facebook/orca/a/b;

    move-result-object v0

    .line 121
    if-nez v0, :cond_1

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "experiment info contains unexpected upsell_type: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", using default of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/a/d;->b:Lcom/facebook/orca/a/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 127
    sget-object v1, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 128
    iget-object v1, p0, Lcom/facebook/orca/a/d;->e:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    sget-object v0, Lcom/facebook/orca/a/d;->b:Lcom/facebook/orca/a/b;

    .line 133
    :cond_1
    sget-object v1, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Group name upsell type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v1, v0

    .line 144
    :goto_1
    const-string v0, "num_upsells"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v3

    .line 145
    invoke-virtual {v3}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 147
    :try_start_0
    invoke-virtual {v3}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 159
    :goto_2
    sget-object v2, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Num upsells: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 169
    :goto_3
    new-instance v2, Lcom/facebook/orca/a/a;

    invoke-direct {v2, v1, v0}, Lcom/facebook/orca/a/a;-><init>(Lcom/facebook/orca/a/b;I)V

    iput-object v2, p0, Lcom/facebook/orca/a/d;->g:Lcom/facebook/orca/a/a;

    goto/16 :goto_0

    .line 135
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "experiment info does not contain upsell_type, using default of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v3, Lcom/facebook/orca/a/d;->b:Lcom/facebook/orca/a/b;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 137
    sget-object v3, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-static {v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 138
    iget-object v3, p0, Lcom/facebook/orca/a/d;->e:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v0

    goto :goto_1

    .line 148
    :catch_0
    move-exception v0

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "experiment info contains unexpected num_upsells: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", using default of "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 154
    sget-object v3, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 155
    iget-object v3, p0, Lcom/facebook/orca/a/d;->e:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v2

    goto :goto_2

    .line 161
    :cond_3
    const-string v0, "experiment info does not contain num_upsells, using default of 3"

    .line 163
    sget-object v3, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 164
    iget-object v3, p0, Lcom/facebook/orca/a/d;->e:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v2

    goto :goto_3
.end method

.method static synthetic a(Lcom/facebook/orca/a/d;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/orca/a/d;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    return-void
.end method

.method static synthetic d()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic e()Lcom/facebook/orca/a/b;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/facebook/orca/a/d;->b:Lcom/facebook/orca/a/b;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/a/a;
    .locals 1
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/a/d;->g:Lcom/facebook/orca/a/a;

    return-object v0
.end method

.method public b()V
    .locals 3
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation

    .prologue
    .line 71
    sget-object v0, Lcom/facebook/orca/a/d;->a:Ljava/lang/Class;

    const-string v1, "Init MessengerGroupNameUpsellInitializer"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/a/d;->h:Lcom/facebook/orca/a/g;

    sget-object v1, Lcom/facebook/orca/a/g;->UNINITIALIZED:Lcom/facebook/orca/a/g;

    if-eq v0, v1, :cond_0

    .line 110
    :goto_0
    return-void

    .line 75
    :cond_0
    sget-object v0, Lcom/facebook/orca/a/g;->INITIALIZING:Lcom/facebook/orca/a/g;

    iput-object v0, p0, Lcom/facebook/orca/a/d;->h:Lcom/facebook/orca/a/g;

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/a/d;->d:Lcom/facebook/abtest/qe/c;

    const-string v1, "messenger_group_name_upsell"

    new-instance v2, Lcom/facebook/orca/a/e;

    invoke-direct {v2, p0}, Lcom/facebook/orca/a/e;-><init>(Lcom/facebook/orca/a/d;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/abtest/qe/c;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 88
    new-instance v1, Lcom/facebook/orca/a/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/a/f;-><init>(Lcom/facebook/orca/a/d;)V

    .line 109
    iget-object v2, p0, Lcom/facebook/orca/a/d;->f:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method

.method public c()Lcom/facebook/orca/a/g;
    .locals 1
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/a/d;->h:Lcom/facebook/orca/a/g;

    return-object v0
.end method
