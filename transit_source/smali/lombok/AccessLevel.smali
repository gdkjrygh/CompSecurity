.class public final enum Llombok/AccessLevel;
.super Ljava/lang/Enum;
.source "AccessLevel.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Llombok/AccessLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Llombok/AccessLevel;

.field public static final enum MODULE:Llombok/AccessLevel;

.field public static final enum NONE:Llombok/AccessLevel;

.field public static final enum PACKAGE:Llombok/AccessLevel;

.field public static final enum PRIVATE:Llombok/AccessLevel;

.field public static final enum PROTECTED:Llombok/AccessLevel;

.field public static final enum PUBLIC:Llombok/AccessLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 28
    new-instance v0, Llombok/AccessLevel;

    const-string v1, "PUBLIC"

    invoke-direct {v0, v1, v3}, Llombok/AccessLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llombok/AccessLevel;->PUBLIC:Llombok/AccessLevel;

    new-instance v0, Llombok/AccessLevel;

    const-string v1, "MODULE"

    invoke-direct {v0, v1, v4}, Llombok/AccessLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llombok/AccessLevel;->MODULE:Llombok/AccessLevel;

    new-instance v0, Llombok/AccessLevel;

    const-string v1, "PROTECTED"

    invoke-direct {v0, v1, v5}, Llombok/AccessLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llombok/AccessLevel;->PROTECTED:Llombok/AccessLevel;

    new-instance v0, Llombok/AccessLevel;

    const-string v1, "PACKAGE"

    invoke-direct {v0, v1, v6}, Llombok/AccessLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llombok/AccessLevel;->PACKAGE:Llombok/AccessLevel;

    new-instance v0, Llombok/AccessLevel;

    const-string v1, "PRIVATE"

    invoke-direct {v0, v1, v7}, Llombok/AccessLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llombok/AccessLevel;->PRIVATE:Llombok/AccessLevel;

    .line 30
    new-instance v0, Llombok/AccessLevel;

    const-string v1, "NONE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llombok/AccessLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llombok/AccessLevel;->NONE:Llombok/AccessLevel;

    .line 27
    const/4 v0, 0x6

    new-array v0, v0, [Llombok/AccessLevel;

    sget-object v1, Llombok/AccessLevel;->PUBLIC:Llombok/AccessLevel;

    aput-object v1, v0, v3

    sget-object v1, Llombok/AccessLevel;->MODULE:Llombok/AccessLevel;

    aput-object v1, v0, v4

    sget-object v1, Llombok/AccessLevel;->PROTECTED:Llombok/AccessLevel;

    aput-object v1, v0, v5

    sget-object v1, Llombok/AccessLevel;->PACKAGE:Llombok/AccessLevel;

    aput-object v1, v0, v6

    sget-object v1, Llombok/AccessLevel;->PRIVATE:Llombok/AccessLevel;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Llombok/AccessLevel;->NONE:Llombok/AccessLevel;

    aput-object v2, v0, v1

    sput-object v0, Llombok/AccessLevel;->$VALUES:[Llombok/AccessLevel;

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
    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llombok/AccessLevel;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 27
    const-class v0, Llombok/AccessLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Llombok/AccessLevel;

    return-object v0
.end method

.method public static values()[Llombok/AccessLevel;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Llombok/AccessLevel;->$VALUES:[Llombok/AccessLevel;

    invoke-virtual {v0}, [Llombok/AccessLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llombok/AccessLevel;

    return-object v0
.end method
