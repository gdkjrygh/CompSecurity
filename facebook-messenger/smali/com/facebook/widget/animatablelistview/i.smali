.class public final enum Lcom/facebook/widget/animatablelistview/i;
.super Ljava/lang/Enum;
.source "AnimatingListMutation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/animatablelistview/i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/animatablelistview/i;

.field public static final enum ADD:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum ADD_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum ADD_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum CUSTOM:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum MARKED_FOR_REPLACE:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum REMOVE:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum REMOVE_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum REMOVE_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

.field public static final enum REPLACE:Lcom/facebook/widget/animatablelistview/i;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 15
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "ADD"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->ADD:Lcom/facebook/widget/animatablelistview/i;

    .line 16
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "ADD_WITH_ANIMATION_UP"

    invoke-direct {v0, v1, v4}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    .line 17
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "ADD_WITH_ANIMATION_DOWN"

    invoke-direct {v0, v1, v5}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    .line 18
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "REMOVE"

    invoke-direct {v0, v1, v6}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->REMOVE:Lcom/facebook/widget/animatablelistview/i;

    .line 19
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "REMOVE_WITH_ANIMATION_UP"

    invoke-direct {v0, v1, v7}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    .line 20
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "REMOVE_WITH_ANIMATION_DOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    .line 21
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "REPLACE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->REPLACE:Lcom/facebook/widget/animatablelistview/i;

    .line 22
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "MARKED_FOR_REPLACE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->MARKED_FOR_REPLACE:Lcom/facebook/widget/animatablelistview/i;

    .line 23
    new-instance v0, Lcom/facebook/widget/animatablelistview/i;

    const-string v1, "CUSTOM"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/animatablelistview/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->CUSTOM:Lcom/facebook/widget/animatablelistview/i;

    .line 14
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/facebook/widget/animatablelistview/i;

    sget-object v1, Lcom/facebook/widget/animatablelistview/i;->ADD:Lcom/facebook/widget/animatablelistview/i;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/widget/animatablelistview/i;->REMOVE:Lcom/facebook/widget/animatablelistview/i;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->REPLACE:Lcom/facebook/widget/animatablelistview/i;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->MARKED_FOR_REPLACE:Lcom/facebook/widget/animatablelistview/i;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/widget/animatablelistview/i;->CUSTOM:Lcom/facebook/widget/animatablelistview/i;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/widget/animatablelistview/i;->$VALUES:[Lcom/facebook/widget/animatablelistview/i;

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
    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/animatablelistview/i;
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/facebook/widget/animatablelistview/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/i;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/animatablelistview/i;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/widget/animatablelistview/i;->$VALUES:[Lcom/facebook/widget/animatablelistview/i;

    invoke-virtual {v0}, [Lcom/facebook/widget/animatablelistview/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/animatablelistview/i;

    return-object v0
.end method
