.class public final enum Lcom/qihoo/security/v5/UpdateHelper$UpdateType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/UpdateHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "UpdateType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/v5/UpdateHelper$UpdateType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ActionMode:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

.field public static final enum SettingAPP:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

.field public static final enum SettingOther:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

.field public static final enum Silent:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

.field private static final synthetic a:[Lcom/qihoo/security/v5/UpdateHelper$UpdateType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 36
    new-instance v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    const-string/jumbo v1, "Silent"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->Silent:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    .line 40
    new-instance v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    const-string/jumbo v1, "SettingAPP"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->SettingAPP:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    .line 44
    new-instance v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    const-string/jumbo v1, "ActionMode"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->ActionMode:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    .line 49
    new-instance v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    const-string/jumbo v1, "SettingOther"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->SettingOther:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    .line 32
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    sget-object v1, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->Silent:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->SettingAPP:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->ActionMode:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->SettingOther:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->a:[Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

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
    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/v5/UpdateHelper$UpdateType;
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/v5/UpdateHelper$UpdateType;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->a:[Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    invoke-virtual {v0}, [Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    return-object v0
.end method
