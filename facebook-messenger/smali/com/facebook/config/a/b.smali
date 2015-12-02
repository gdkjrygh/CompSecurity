.class public final enum Lcom/facebook/config/a/b;
.super Ljava/lang/Enum;
.source "IntendedAudience.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/config/a/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/config/a/b;

.field public static final enum DEVELOPMENT:Lcom/facebook/config/a/b;

.field public static final enum FACEBOOK:Lcom/facebook/config/a/b;

.field public static final enum PUBLIC:Lcom/facebook/config/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 9
    new-instance v0, Lcom/facebook/config/a/b;

    const-string v1, "PUBLIC"

    invoke-direct {v0, v1, v2}, Lcom/facebook/config/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    .line 10
    new-instance v0, Lcom/facebook/config/a/b;

    const-string v1, "FACEBOOK"

    invoke-direct {v0, v1, v3}, Lcom/facebook/config/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/b;->FACEBOOK:Lcom/facebook/config/a/b;

    .line 11
    new-instance v0, Lcom/facebook/config/a/b;

    const-string v1, "DEVELOPMENT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/config/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/b;->DEVELOPMENT:Lcom/facebook/config/a/b;

    .line 8
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/config/a/b;

    sget-object v1, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/config/a/b;->FACEBOOK:Lcom/facebook/config/a/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/config/a/b;->DEVELOPMENT:Lcom/facebook/config/a/b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/config/a/b;->$VALUES:[Lcom/facebook/config/a/b;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/config/a/b;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/config/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/config/a/b;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/config/a/b;->$VALUES:[Lcom/facebook/config/a/b;

    invoke-virtual {v0}, [Lcom/facebook/config/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/config/a/b;

    return-object v0
.end method
