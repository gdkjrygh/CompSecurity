.class public final enum Lcom/facebook/widget/images/j;
.super Ljava/lang/Enum;
.source "UrlImage.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/images/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/images/j;

.field public static final enum FULL_RES:Lcom/facebook/widget/images/j;

.field public static final enum LOW_RES:Lcom/facebook/widget/images/j;

.field public static final enum NONE:Lcom/facebook/widget/images/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 67
    new-instance v0, Lcom/facebook/widget/images/j;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/images/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/images/j;->NONE:Lcom/facebook/widget/images/j;

    .line 68
    new-instance v0, Lcom/facebook/widget/images/j;

    const-string v1, "LOW_RES"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/images/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/images/j;->LOW_RES:Lcom/facebook/widget/images/j;

    .line 69
    new-instance v0, Lcom/facebook/widget/images/j;

    const-string v1, "FULL_RES"

    invoke-direct {v0, v1, v4}, Lcom/facebook/widget/images/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/images/j;->FULL_RES:Lcom/facebook/widget/images/j;

    .line 66
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/widget/images/j;

    sget-object v1, Lcom/facebook/widget/images/j;->NONE:Lcom/facebook/widget/images/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/widget/images/j;->LOW_RES:Lcom/facebook/widget/images/j;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/images/j;->FULL_RES:Lcom/facebook/widget/images/j;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/widget/images/j;->$VALUES:[Lcom/facebook/widget/images/j;

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
    .line 66
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/images/j;
    .locals 1

    .prologue
    .line 66
    const-class v0, Lcom/facebook/widget/images/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/images/j;
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lcom/facebook/widget/images/j;->$VALUES:[Lcom/facebook/widget/images/j;

    invoke-virtual {v0}, [Lcom/facebook/widget/images/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/images/j;

    return-object v0
.end method
