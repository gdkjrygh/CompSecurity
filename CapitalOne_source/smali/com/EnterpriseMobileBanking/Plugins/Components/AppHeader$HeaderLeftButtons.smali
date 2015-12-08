.class public final enum Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;
.super Ljava/lang/Enum;
.source "AppHeader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HeaderLeftButtons"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

.field public static final enum BACK:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

.field public static final enum CLOSE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

.field public static final enum MENU:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 84
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    const-string v1, "BACK"

    invoke-direct {v0, v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->BACK:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    const-string v1, "MENU"

    invoke-direct {v0, v1, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->MENU:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    const-string v1, "CLOSE"

    invoke-direct {v0, v1, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->CLOSE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->BACK:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    aput-object v1, v0, v2

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->MENU:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    aput-object v1, v0, v3

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->CLOSE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    aput-object v1, v0, v4

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->$VALUES:[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

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
    .line 84
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 84
    const-class v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    return-object v0
.end method

.method public static values()[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;
    .locals 1

    .prologue
    .line 84
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->$VALUES:[Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    invoke-virtual {v0}, [Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;

    return-object v0
.end method
