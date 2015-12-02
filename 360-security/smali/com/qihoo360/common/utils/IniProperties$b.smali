.class final enum Lcom/qihoo360/common/utils/IniProperties$b;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/IniProperties;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo360/common/utils/IniProperties$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/qihoo360/common/utils/IniProperties$b;

.field public static final enum b:Lcom/qihoo360/common/utils/IniProperties$b;

.field public static final enum c:Lcom/qihoo360/common/utils/IniProperties$b;

.field public static final enum d:Lcom/qihoo360/common/utils/IniProperties$b;

.field private static final synthetic e:[Lcom/qihoo360/common/utils/IniProperties$b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    new-instance v0, Lcom/qihoo360/common/utils/IniProperties$b;

    const-string/jumbo v1, "NORMAL"

    invoke-direct {v0, v1, v2}, Lcom/qihoo360/common/utils/IniProperties$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/IniProperties$b;->a:Lcom/qihoo360/common/utils/IniProperties$b;

    new-instance v0, Lcom/qihoo360/common/utils/IniProperties$b;

    const-string/jumbo v1, "ESCAPE"

    invoke-direct {v0, v1, v3}, Lcom/qihoo360/common/utils/IniProperties$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/IniProperties$b;->b:Lcom/qihoo360/common/utils/IniProperties$b;

    new-instance v0, Lcom/qihoo360/common/utils/IniProperties$b;

    const-string/jumbo v1, "ESC_CRNL"

    invoke-direct {v0, v1, v4}, Lcom/qihoo360/common/utils/IniProperties$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/IniProperties$b;->c:Lcom/qihoo360/common/utils/IniProperties$b;

    new-instance v0, Lcom/qihoo360/common/utils/IniProperties$b;

    const-string/jumbo v1, "COMMENT"

    invoke-direct {v0, v1, v5}, Lcom/qihoo360/common/utils/IniProperties$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/IniProperties$b;->d:Lcom/qihoo360/common/utils/IniProperties$b;

    .line 24
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/qihoo360/common/utils/IniProperties$b;

    sget-object v1, Lcom/qihoo360/common/utils/IniProperties$b;->a:Lcom/qihoo360/common/utils/IniProperties$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo360/common/utils/IniProperties$b;->b:Lcom/qihoo360/common/utils/IniProperties$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo360/common/utils/IniProperties$b;->c:Lcom/qihoo360/common/utils/IniProperties$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo360/common/utils/IniProperties$b;->d:Lcom/qihoo360/common/utils/IniProperties$b;

    aput-object v1, v0, v5

    sput-object v0, Lcom/qihoo360/common/utils/IniProperties$b;->e:[Lcom/qihoo360/common/utils/IniProperties$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo360/common/utils/IniProperties$b;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/qihoo360/common/utils/IniProperties$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/IniProperties$b;

    return-object v0
.end method

.method public static values()[Lcom/qihoo360/common/utils/IniProperties$b;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/qihoo360/common/utils/IniProperties$b;->e:[Lcom/qihoo360/common/utils/IniProperties$b;

    array-length v1, v0

    new-array v2, v1, [Lcom/qihoo360/common/utils/IniProperties$b;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
