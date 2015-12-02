.class public final enum Lcom/facebook/orca/contacts/divebar/c;
.super Ljava/lang/Enum;
.source "DivebarBadgingExperiment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/contacts/divebar/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/contacts/divebar/c;

.field public static final ALL:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

.field public static final enum MOVING_BAR:Lcom/facebook/orca/contacts/divebar/c;

.field public static final ON_OPEN_AND_TRANSITION_COUNT:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

.field public static final ON_OPEN_COUNT_AND_CHAT_HEAD_ROLL:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum ON_TRANSITION_COUNT:Lcom/facebook/orca/contacts/divebar/c;

.field public static final enum STEADY_STATE_COUNT:Lcom/facebook/orca/contacts/divebar/c;

.field public static final STEADY_STATE_COUNT_AND_CHAT_HEAD_ROLL:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum STEADY_STATE_GREEN_DOT:Lcom/facebook/orca/contacts/divebar/c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 61
    new-instance v0, Lcom/facebook/orca/contacts/divebar/c;

    const-string v1, "ON_OPEN_COUNT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/contacts/divebar/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    .line 62
    new-instance v0, Lcom/facebook/orca/contacts/divebar/c;

    const-string v1, "ON_TRANSITION_COUNT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/contacts/divebar/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_TRANSITION_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    .line 63
    new-instance v0, Lcom/facebook/orca/contacts/divebar/c;

    const-string v1, "STEADY_STATE_COUNT"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/contacts/divebar/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    .line 64
    new-instance v0, Lcom/facebook/orca/contacts/divebar/c;

    const-string v1, "STEADY_STATE_GREEN_DOT"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/contacts/divebar/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_GREEN_DOT:Lcom/facebook/orca/contacts/divebar/c;

    .line 65
    new-instance v0, Lcom/facebook/orca/contacts/divebar/c;

    const-string v1, "CHAT_HEAD_ROLL"

    invoke-direct {v0, v1, v7}, Lcom/facebook/orca/contacts/divebar/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

    .line 66
    new-instance v0, Lcom/facebook/orca/contacts/divebar/c;

    const-string v1, "MOVING_BAR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/contacts/divebar/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->MOVING_BAR:Lcom/facebook/orca/contacts/divebar/c;

    .line 59
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/orca/contacts/divebar/c;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/contacts/divebar/c;->ON_TRANSITION_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_GREEN_DOT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/contacts/divebar/c;->CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->MOVING_BAR:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->$VALUES:[Lcom/facebook/orca/contacts/divebar/c;

    .line 68
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v4, [Lcom/facebook/orca/contacts/divebar/c;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->ON_TRANSITION_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_AND_TRANSITION_COUNT:Lcom/google/common/a/fi;

    .line 70
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v4, [Lcom/facebook/orca/contacts/divebar/c;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT_AND_CHAT_HEAD_ROLL:Lcom/google/common/a/fi;

    .line 72
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    new-array v1, v4, [Lcom/facebook/orca/contacts/divebar/c;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_COUNT_AND_CHAT_HEAD_ROLL:Lcom/google/common/a/fi;

    .line 74
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    const/4 v1, 0x5

    new-array v1, v1, [Lcom/facebook/orca/contacts/divebar/c;

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->ON_TRANSITION_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v3

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v4

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_GREEN_DOT:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v5

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v6

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->MOVING_BAR:Lcom/facebook/orca/contacts/divebar/c;

    aput-object v2, v1, v7

    invoke-static {v0, v1}, Lcom/google/common/a/kl;->a(Ljava/lang/Enum;[Ljava/lang/Enum;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/contacts/divebar/c;->ALL:Lcom/google/common/a/fi;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/contacts/divebar/c;
    .locals 1

    .prologue
    .line 59
    const-class v0, Lcom/facebook/orca/contacts/divebar/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/contacts/divebar/c;
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lcom/facebook/orca/contacts/divebar/c;->$VALUES:[Lcom/facebook/orca/contacts/divebar/c;

    invoke-virtual {v0}, [Lcom/facebook/orca/contacts/divebar/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/divebar/c;

    return-object v0
.end method
