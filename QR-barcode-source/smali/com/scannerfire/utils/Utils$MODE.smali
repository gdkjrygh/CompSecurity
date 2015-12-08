.class public final enum Lcom/scannerfire/utils/Utils$MODE;
.super Ljava/lang/Enum;
.source "Utils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/utils/Utils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MODE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/scannerfire/utils/Utils$MODE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _calendar:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _contact:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _email:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _geo:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _isbn:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _phone:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _product:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _text:Lcom/scannerfire/utils/Utils$MODE;

.field public static final enum _url:Lcom/scannerfire/utils/Utils$MODE;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 65
    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_contact"

    invoke-direct {v0, v1, v3}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_contact:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_email"

    invoke-direct {v0, v1, v4}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_email:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_url"

    invoke-direct {v0, v1, v5}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_url:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_text"

    invoke-direct {v0, v1, v6}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_geo"

    invoke-direct {v0, v1, v7}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_geo:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_phone"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_phone:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_calendar"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_calendar:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_product"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_product:Lcom/scannerfire/utils/Utils$MODE;

    new-instance v0, Lcom/scannerfire/utils/Utils$MODE;

    const-string v1, "_isbn"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/scannerfire/utils/Utils$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->_isbn:Lcom/scannerfire/utils/Utils$MODE;

    .line 64
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/scannerfire/utils/Utils$MODE;

    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_contact:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v1, v0, v3

    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_email:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v1, v0, v4

    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_url:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v1, v0, v5

    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v1, v0, v6

    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_geo:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/scannerfire/utils/Utils$MODE;->_phone:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/scannerfire/utils/Utils$MODE;->_calendar:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/scannerfire/utils/Utils$MODE;->_product:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/scannerfire/utils/Utils$MODE;->_isbn:Lcom/scannerfire/utils/Utils$MODE;

    aput-object v2, v0, v1

    sput-object v0, Lcom/scannerfire/utils/Utils$MODE;->ENUM$VALUES:[Lcom/scannerfire/utils/Utils$MODE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/scannerfire/utils/Utils$MODE;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/utils/Utils$MODE;

    return-object v0
.end method

.method public static values()[Lcom/scannerfire/utils/Utils$MODE;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->ENUM$VALUES:[Lcom/scannerfire/utils/Utils$MODE;

    array-length v1, v0

    new-array v2, v1, [Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
