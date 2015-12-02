.class public final enum Lcom/facebook/widget/text/d;
.super Ljava/lang/Enum;
.source "CustomFontHelper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/text/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/text/d;

.field public static final enum BUILTIN:Lcom/facebook/widget/text/d;

.field public static final enum HELVETICA_NEUE:Lcom/facebook/widget/text/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21
    new-instance v0, Lcom/facebook/widget/text/d;

    const-string v1, "BUILTIN"

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/text/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/text/d;->BUILTIN:Lcom/facebook/widget/text/d;

    .line 22
    new-instance v0, Lcom/facebook/widget/text/d;

    const-string v1, "HELVETICA_NEUE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/text/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/text/d;->HELVETICA_NEUE:Lcom/facebook/widget/text/d;

    .line 18
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/widget/text/d;

    sget-object v1, Lcom/facebook/widget/text/d;->BUILTIN:Lcom/facebook/widget/text/d;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/widget/text/d;->HELVETICA_NEUE:Lcom/facebook/widget/text/d;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/widget/text/d;->$VALUES:[Lcom/facebook/widget/text/d;

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
    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromIndex(I)Lcom/facebook/widget/text/d;
    .locals 1

    .prologue
    .line 25
    invoke-static {}, Lcom/facebook/widget/text/d;->values()[Lcom/facebook/widget/text/d;

    move-result-object v0

    aget-object v0, v0, p0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/text/d;
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/widget/text/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/text/d;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/widget/text/d;->$VALUES:[Lcom/facebook/widget/text/d;

    invoke-virtual {v0}, [Lcom/facebook/widget/text/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/text/d;

    return-object v0
.end method
