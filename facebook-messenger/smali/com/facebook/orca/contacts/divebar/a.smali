.class public Lcom/facebook/orca/contacts/divebar/a;
.super Ljava/lang/Object;
.source "DivebarBadgingExperiment.java"


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

.field private static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/facebook/abtest/qe/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/a",
            "<",
            "Lcom/facebook/orca/contacts/divebar/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/facebook/orca/contacts/divebar/a;

    sput-object v0, Lcom/facebook/orca/contacts/divebar/a;->a:Ljava/lang/Class;

    .line 31
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/contacts/divebar/a;->b:Ljava/util/Set;

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

    const-string v1, "android_divebar_badging"

    new-instance v2, Lcom/facebook/orca/contacts/divebar/b;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/b;-><init>(Lcom/facebook/orca/contacts/divebar/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/a;->c:Lcom/facebook/abtest/qe/d/a;

    .line 96
    return-void
.end method

.method private a(Lcom/google/common/base/Optional;J)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;J)J"
        }
    .end annotation

    .prologue
    .line 148
    invoke-virtual {p1}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    invoke-virtual {p1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    .line 152
    :goto_0
    return-wide p2

    .line 151
    :cond_0
    sget-object v0, Lcom/facebook/orca/contacts/divebar/a;->a:Ljava/lang/Class;

    const-string v1, "Experiment parameter not found! using the default value ..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/a;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/d;
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/a;->c(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/d;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/contacts/divebar/d;
    .locals 5

    .prologue
    .line 108
    new-instance v0, Lcom/facebook/orca/contacts/divebar/d;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/a;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/orca/contacts/divebar/d;-><init>(Ljava/util/Set;JLcom/facebook/orca/contacts/divebar/b;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/d;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/a;->c:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/d;

    return-object v0
.end method

.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ")",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 112
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    sget-object v0, Lcom/facebook/orca/contacts/divebar/a;->b:Ljava/util/Set;

    .line 136
    :goto_0
    return-object v0

    .line 116
    :cond_0
    const-string v0, "badge_type"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 119
    const-string v1, "on_open_count"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 120
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v2, [Lcom/facebook/orca/contacts/divebar/c;

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0

    .line 121
    :cond_1
    const-string v1, "on_open_and_transition_count"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 122
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_AND_TRANSITION_COUNT:Lcom/google/common/a/fi;

    goto :goto_0

    .line 123
    :cond_2
    const-string v1, "on_transition_count"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 124
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_TRANSITION_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v2, [Lcom/facebook/orca/contacts/divebar/c;

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0

    .line 125
    :cond_3
    const-string v1, "on_open_and_chat_head_roll"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 126
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT_AND_CHAT_HEAD_ROLL:Lcom/google/common/a/fi;

    goto :goto_0

    .line 127
    :cond_4
    const-string v1, "chathead_roll_favorites"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 128
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v2, [Lcom/facebook/orca/contacts/divebar/c;

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0

    .line 129
    :cond_5
    const-string v1, "steady_state_count"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 130
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v2, [Lcom/facebook/orca/contacts/divebar/c;

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0

    .line 131
    :cond_6
    const-string v1, "steady_state_green_dot"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 132
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_GREEN_DOT:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v2, [Lcom/facebook/orca/contacts/divebar/c;

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0

    .line 133
    :cond_7
    const-string v1, "give_me_everything"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 134
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ALL:Lcom/google/common/a/fi;

    goto/16 :goto_0

    .line 136
    :cond_8
    sget-object v0, Lcom/facebook/orca/contacts/divebar/a;->b:Ljava/util/Set;

    goto/16 :goto_0
.end method

.method public b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)J
    .locals 3

    .prologue
    const-wide/32 v0, 0xea60

    .line 141
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 142
    const-string v2, "transition_interval"

    invoke-virtual {p1, v2}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v2

    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/orca/contacts/divebar/a;->a(Lcom/google/common/base/Optional;J)J

    move-result-wide v0

    .line 144
    :cond_0
    return-wide v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/a;->c:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->d()V

    .line 105
    return-void
.end method
