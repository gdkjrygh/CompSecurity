.class public final enum Lcom/qihoo360/common/utils/TLVBuilder$DataType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/TLVBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DataType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo360/common/utils/TLVBuilder$DataType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DT_BYTES:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

.field public static final enum DT_INT:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

.field public static final enum DT_LONG:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

.field public static final enum DT_STRING:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

.field private static final synthetic a:[Lcom/qihoo360/common/utils/TLVBuilder$DataType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 36
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    const-string/jumbo v1, "DT_INT"

    invoke-direct {v0, v1, v2}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_INT:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    const-string/jumbo v1, "DT_LONG"

    invoke-direct {v0, v1, v3}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_LONG:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    const-string/jumbo v1, "DT_STRING"

    invoke-direct {v0, v1, v4}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_STRING:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    const-string/jumbo v1, "DT_BYTES"

    invoke-direct {v0, v1, v5}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_BYTES:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    .line 35
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_INT:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_LONG:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_STRING:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_BYTES:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->a:[Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo360/common/utils/TLVBuilder$DataType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo360/common/utils/TLVBuilder$DataType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->a:[Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    array-length v1, v0

    new-array v2, v1, [Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
