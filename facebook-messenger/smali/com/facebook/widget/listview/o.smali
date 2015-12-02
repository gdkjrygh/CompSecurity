.class public final enum Lcom/facebook/widget/listview/o;
.super Ljava/lang/Enum;
.source "ScrollState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/listview/o;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/listview/o;

.field public static final enum BOTTOM:Lcom/facebook/widget/listview/o;

.field public static final enum MIDDLE:Lcom/facebook/widget/listview/o;

.field public static final enum TOP:Lcom/facebook/widget/listview/o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lcom/facebook/widget/listview/o;

    const-string v1, "BOTTOM"

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/listview/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/listview/o;->BOTTOM:Lcom/facebook/widget/listview/o;

    .line 21
    new-instance v0, Lcom/facebook/widget/listview/o;

    const-string v1, "TOP"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/listview/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/listview/o;->TOP:Lcom/facebook/widget/listview/o;

    .line 22
    new-instance v0, Lcom/facebook/widget/listview/o;

    const-string v1, "MIDDLE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/widget/listview/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/listview/o;->MIDDLE:Lcom/facebook/widget/listview/o;

    .line 19
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/widget/listview/o;

    sget-object v1, Lcom/facebook/widget/listview/o;->BOTTOM:Lcom/facebook/widget/listview/o;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/widget/listview/o;->TOP:Lcom/facebook/widget/listview/o;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/listview/o;->MIDDLE:Lcom/facebook/widget/listview/o;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/widget/listview/o;->$VALUES:[Lcom/facebook/widget/listview/o;

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
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/listview/o;
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/widget/listview/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/o;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/listview/o;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/facebook/widget/listview/o;->$VALUES:[Lcom/facebook/widget/listview/o;

    invoke-virtual {v0}, [Lcom/facebook/widget/listview/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/listview/o;

    return-object v0
.end method
