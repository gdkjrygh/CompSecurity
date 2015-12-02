.class public final enum Lcom/qihoo/security/gamebooster/LocalGamePkg$State;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/LocalGamePkg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/gamebooster/LocalGamePkg$State;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Add:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

.field public static final enum CleanRecmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

.field public static final enum UserAdd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

.field public static final enum V5Recmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

.field private static final synthetic b:[Lcom/qihoo/security/gamebooster/LocalGamePkg$State;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 63
    new-instance v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    const-string/jumbo v1, "V5Recmd"

    invoke-direct {v0, v1, v2, v2}, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->V5Recmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    new-instance v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    const-string/jumbo v1, "CleanRecmd"

    invoke-direct {v0, v1, v3, v3}, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->CleanRecmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    new-instance v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    const-string/jumbo v1, "UserAdd"

    invoke-direct {v0, v1, v4, v4}, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->UserAdd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    new-instance v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    const-string/jumbo v1, "Add"

    invoke-direct {v0, v1, v5, v6}, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->Add:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    .line 62
    new-array v0, v6, [Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->V5Recmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->CleanRecmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->UserAdd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->Add:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    aput-object v1, v0, v5

    sput-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->b:[Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 76
    iput p3, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->a:I

    .line 77
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg$State;
    .locals 1

    .prologue
    .line 62
    const-class v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/gamebooster/LocalGamePkg$State;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->b:[Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    invoke-virtual {v0}, [Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    return-object v0
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->a:I

    return v0
.end method

.method public setCode(I)V
    .locals 0

    .prologue
    .line 71
    iput p1, p0, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->a:I

    .line 72
    return-void
.end method
