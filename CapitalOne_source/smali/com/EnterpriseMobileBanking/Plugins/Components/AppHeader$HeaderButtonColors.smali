.class public final enum Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;
.super Ljava/lang/Enum;
.source "AppHeader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HeaderButtonColors"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

.field public static final enum BLUE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

.field public static final enum RED:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 82
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    const-string v1, "RED"

    invoke-direct {v0, v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->RED:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    const-string v1, "BLUE"

    invoke-direct {v0, v1, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->BLUE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->RED:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    aput-object v1, v0, v2

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->BLUE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    aput-object v1, v0, v3

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->$VALUES:[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

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
    .line 82
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 82
    const-class v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    return-object v0
.end method

.method public static values()[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;
    .locals 1

    .prologue
    .line 82
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->$VALUES:[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    invoke-virtual {v0}, [Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    return-object v0
.end method
