.class final enum Lcom/facebook/orca/prefs/y;
.super Ljava/lang/Enum;
.source "OrcaContactsPreferenceActivity.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/prefs/y;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/prefs/y;

.field public static final enum FINISHED_ERROR:Lcom/facebook/orca/prefs/y;

.field public static final enum FINISHED_SUCCESS:Lcom/facebook/orca/prefs/y;

.field public static final enum IN_PROGRESS:Lcom/facebook/orca/prefs/y;

.field public static final enum NOT_STARTED:Lcom/facebook/orca/prefs/y;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 51
    new-instance v0, Lcom/facebook/orca/prefs/y;

    const-string v1, "NOT_STARTED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/prefs/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/prefs/y;->NOT_STARTED:Lcom/facebook/orca/prefs/y;

    .line 52
    new-instance v0, Lcom/facebook/orca/prefs/y;

    const-string v1, "IN_PROGRESS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/prefs/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/prefs/y;->IN_PROGRESS:Lcom/facebook/orca/prefs/y;

    .line 53
    new-instance v0, Lcom/facebook/orca/prefs/y;

    const-string v1, "FINISHED_SUCCESS"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/prefs/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/prefs/y;->FINISHED_SUCCESS:Lcom/facebook/orca/prefs/y;

    .line 54
    new-instance v0, Lcom/facebook/orca/prefs/y;

    const-string v1, "FINISHED_ERROR"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/prefs/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/prefs/y;->FINISHED_ERROR:Lcom/facebook/orca/prefs/y;

    .line 50
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/orca/prefs/y;

    sget-object v1, Lcom/facebook/orca/prefs/y;->NOT_STARTED:Lcom/facebook/orca/prefs/y;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/prefs/y;->IN_PROGRESS:Lcom/facebook/orca/prefs/y;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/prefs/y;->FINISHED_SUCCESS:Lcom/facebook/orca/prefs/y;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/prefs/y;->FINISHED_ERROR:Lcom/facebook/orca/prefs/y;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/orca/prefs/y;->$VALUES:[Lcom/facebook/orca/prefs/y;

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
    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/prefs/y;
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/facebook/orca/prefs/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/y;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/prefs/y;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/facebook/orca/prefs/y;->$VALUES:[Lcom/facebook/orca/prefs/y;

    invoke-virtual {v0}, [Lcom/facebook/orca/prefs/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/prefs/y;

    return-object v0
.end method
