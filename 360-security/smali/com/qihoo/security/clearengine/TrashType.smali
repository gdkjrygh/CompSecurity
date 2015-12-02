.class public final enum Lcom/qihoo/security/clearengine/TrashType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/clearengine/TrashType;",
        ">;"
    }
.end annotation


# static fields
.field public static final ALL_TRASH_TYPES:[Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_APP_SYSTEM_CACHE:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_BIGFILE:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_MEMORY:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_SYSTEM:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_UNDEFINED_TYPE:Lcom/qihoo/security/clearengine/TrashType;

.field public static final enum CATE_UNINSTALLED:Lcom/qihoo/security/clearengine/TrashType;

.field private static final synthetic b:[Lcom/qihoo/security/clearengine/TrashType;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 9
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_UNDEFINED_TYPE"

    const/4 v2, -0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_UNDEFINED_TYPE:Lcom/qihoo/security/clearengine/TrashType;

    .line 10
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_CACHE"

    const/16 v2, 0x20

    invoke-direct {v0, v1, v5, v2}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    .line 11
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_APP_SYSTEM_CACHE"

    const/16 v2, 0x142

    invoke-direct {v0, v1, v6, v2}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_APP_SYSTEM_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    .line 12
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_ADPLUGIN"

    const/16 v2, 0x143

    invoke-direct {v0, v1, v7, v2}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

    .line 13
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_UNINSTALLED"

    const/16 v2, 0x21

    invoke-direct {v0, v1, v8, v2}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_UNINSTALLED:Lcom/qihoo/security/clearengine/TrashType;

    .line 14
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_APK"

    const/4 v2, 0x5

    const/16 v3, 0x22

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

    .line 15
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_BIGFILE"

    const/4 v2, 0x6

    const/16 v3, 0x23

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_BIGFILE:Lcom/qihoo/security/clearengine/TrashType;

    .line 16
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_SYSTEM"

    const/4 v2, 0x7

    const/16 v3, 0x24

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_SYSTEM:Lcom/qihoo/security/clearengine/TrashType;

    .line 17
    new-instance v0, Lcom/qihoo/security/clearengine/TrashType;

    const-string/jumbo v1, "CATE_MEMORY"

    const/16 v2, 0x8

    const/16 v3, 0x25

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/clearengine/TrashType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_MEMORY:Lcom/qihoo/security/clearengine/TrashType;

    const/16 v0, 0x9

    new-array v0, v0, [Lcom/qihoo/security/clearengine/TrashType;

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_UNDEFINED_TYPE:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_APP_SYSTEM_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_UNINSTALLED:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/clearengine/TrashType;->CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/clearengine/TrashType;->CATE_BIGFILE:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/qihoo/security/clearengine/TrashType;->CATE_SYSTEM:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/qihoo/security/clearengine/TrashType;->CATE_MEMORY:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->b:[Lcom/qihoo/security/clearengine/TrashType;

    .line 59
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/qihoo/security/clearengine/TrashType;

    .line 60
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v4

    .line 62
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v5

    .line 63
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_UNINSTALLED:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v6

    .line 64
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v7

    .line 65
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_BIGFILE:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    .line 66
    sget-object v2, Lcom/qihoo/security/clearengine/TrashType;->CATE_SYSTEM:Lcom/qihoo/security/clearengine/TrashType;

    aput-object v2, v0, v1

    .line 59
    sput-object v0, Lcom/qihoo/security/clearengine/TrashType;->ALL_TRASH_TYPES:[Lcom/qihoo/security/clearengine/TrashType;

    .line 67
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 22
    iput p3, p0, Lcom/qihoo/security/clearengine/TrashType;->a:I

    .line 23
    return-void
.end method

.method public static getTrashType(I)Lcom/qihoo/security/clearengine/TrashType;
    .locals 1

    .prologue
    .line 30
    sparse-switch p0, :sswitch_data_0

    .line 55
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_UNDEFINED_TYPE:Lcom/qihoo/security/clearengine/TrashType;

    :goto_0
    return-object v0

    .line 32
    :sswitch_0
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_CACHE:Lcom/qihoo/security/clearengine/TrashType;

    goto :goto_0

    .line 34
    :sswitch_1
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_UNINSTALLED:Lcom/qihoo/security/clearengine/TrashType;

    goto :goto_0

    .line 36
    :sswitch_2
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_ADPLUGIN:Lcom/qihoo/security/clearengine/TrashType;

    goto :goto_0

    .line 38
    :sswitch_3
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_BIGFILE:Lcom/qihoo/security/clearengine/TrashType;

    goto :goto_0

    .line 40
    :sswitch_4
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_APK:Lcom/qihoo/security/clearengine/TrashType;

    goto :goto_0

    .line 42
    :sswitch_5
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_MEMORY:Lcom/qihoo/security/clearengine/TrashType;

    goto :goto_0

    .line 53
    :sswitch_6
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->CATE_SYSTEM:Lcom/qihoo/security/clearengine/TrashType;

    goto :goto_0

    .line 30
    nop

    :sswitch_data_0
    .sparse-switch
        0x21 -> :sswitch_1
        0x22 -> :sswitch_4
        0x23 -> :sswitch_3
        0x25 -> :sswitch_5
        0x141 -> :sswitch_0
        0x142 -> :sswitch_6
        0x143 -> :sswitch_2
        0x169 -> :sswitch_6
        0x16a -> :sswitch_6
        0x16b -> :sswitch_6
        0x16c -> :sswitch_6
        0x16d -> :sswitch_6
        0x16e -> :sswitch_6
        0x16f -> :sswitch_6
        0x170 -> :sswitch_6
    .end sparse-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/clearengine/TrashType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/qihoo/security/clearengine/TrashType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/TrashType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/clearengine/TrashType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/qihoo/security/clearengine/TrashType;->b:[Lcom/qihoo/security/clearengine/TrashType;

    array-length v1, v0

    new-array v2, v1, [Lcom/qihoo/security/clearengine/TrashType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method public toEnv()I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/qihoo/security/clearengine/TrashType;->a:I

    return v0
.end method
