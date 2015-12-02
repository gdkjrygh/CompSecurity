.class public final enum Lcom/facebook/auth/login/l;
.super Ljava/lang/Enum;
.source "AuthFragmentLogoViewGroup.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/auth/login/l;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/auth/login/l;

.field public static final enum LOGO_SLIDE:Lcom/facebook/auth/login/l;

.field public static final enum NONE:Lcom/facebook/auth/login/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 107
    new-instance v0, Lcom/facebook/auth/login/l;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/auth/login/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/auth/login/l;->NONE:Lcom/facebook/auth/login/l;

    .line 108
    new-instance v0, Lcom/facebook/auth/login/l;

    const-string v1, "LOGO_SLIDE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/auth/login/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/auth/login/l;->LOGO_SLIDE:Lcom/facebook/auth/login/l;

    .line 106
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/auth/login/l;

    sget-object v1, Lcom/facebook/auth/login/l;->NONE:Lcom/facebook/auth/login/l;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/auth/login/l;->LOGO_SLIDE:Lcom/facebook/auth/login/l;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/auth/login/l;->$VALUES:[Lcom/facebook/auth/login/l;

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
    .line 106
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/auth/login/l;
    .locals 1

    .prologue
    .line 106
    const-class v0, Lcom/facebook/auth/login/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/l;

    return-object v0
.end method

.method public static values()[Lcom/facebook/auth/login/l;
    .locals 1

    .prologue
    .line 106
    sget-object v0, Lcom/facebook/auth/login/l;->$VALUES:[Lcom/facebook/auth/login/l;

    invoke-virtual {v0}, [Lcom/facebook/auth/login/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/auth/login/l;

    return-object v0
.end method
