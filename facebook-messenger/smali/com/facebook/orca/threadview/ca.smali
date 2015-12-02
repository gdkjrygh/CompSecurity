.class public final enum Lcom/facebook/orca/threadview/ca;
.super Ljava/lang/Enum;
.source "ThreadViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadview/ca;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadview/ca;

.field public static final enum CONTACTCARD:Lcom/facebook/orca/threadview/ca;

.field public static final enum GROUP_CONTACTCARD:Lcom/facebook/orca/threadview/ca;

.field public static final enum MAP:Lcom/facebook/orca/threadview/ca;

.field public static final enum MESSAGES:Lcom/facebook/orca/threadview/ca;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 138
    new-instance v0, Lcom/facebook/orca/threadview/ca;

    const-string v1, "MESSAGES"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/ca;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    new-instance v0, Lcom/facebook/orca/threadview/ca;

    const-string v1, "GROUP_CONTACTCARD"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadview/ca;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/ca;->GROUP_CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    new-instance v0, Lcom/facebook/orca/threadview/ca;

    const-string v1, "CONTACTCARD"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/threadview/ca;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    new-instance v0, Lcom/facebook/orca/threadview/ca;

    const-string v1, "MAP"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/threadview/ca;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    .line 137
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadview/ca;->GROUP_CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/orca/threadview/ca;->$VALUES:[Lcom/facebook/orca/threadview/ca;

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
    .line 137
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadview/ca;
    .locals 1

    .prologue
    .line 137
    const-class v0, Lcom/facebook/orca/threadview/ca;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ca;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadview/ca;
    .locals 1

    .prologue
    .line 137
    sget-object v0, Lcom/facebook/orca/threadview/ca;->$VALUES:[Lcom/facebook/orca/threadview/ca;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadview/ca;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadview/ca;

    return-object v0
.end method
