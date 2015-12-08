.class public final enum Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;
.super Ljava/lang/Enum;
.source "DateFormatter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/util/DateFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DateFormatterType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

.field public static final enum EPOCH:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

.field public static final enum EPOCH_MILLISEC:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

.field public static final enum MINUTES_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

.field public static final enum MINUTE_DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

.field public static final enum OTHER:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

.field public static final enum SECONDS_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 15
    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    const-string v1, "DELAY"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    const-string v1, "MINUTE_DELAY"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTE_DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    const-string v1, "SECONDS_AGO"

    invoke-direct {v0, v1, v5}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->SECONDS_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    const-string v1, "MINUTES_AGO"

    invoke-direct {v0, v1, v6}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTES_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    const-string v1, "EPOCH"

    invoke-direct {v0, v1, v7}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    const-string v1, "EPOCH_MILLISEC"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH_MILLISEC:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    const-string v1, "OTHER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->OTHER:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    .line 14
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTE_DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->SECONDS_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTES_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH_MILLISEC:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->OTHER:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ENUM$VALUES:[Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ENUM$VALUES:[Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
