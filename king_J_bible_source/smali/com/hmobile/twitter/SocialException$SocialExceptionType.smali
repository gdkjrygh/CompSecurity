.class public final enum Lcom/hmobile/twitter/SocialException$SocialExceptionType;
.super Ljava/lang/Enum;
.source "SocialException.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/twitter/SocialException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SocialExceptionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/hmobile/twitter/SocialException$SocialExceptionType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum APP_IdNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

.field public static final enum ConsumerDataNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

.field public static final enum ContextNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

.field private static final synthetic ENUM$VALUES:[Lcom/hmobile/twitter/SocialException$SocialExceptionType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 17
    new-instance v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    const-string v1, "ContextNotSet"

    invoke-direct {v0, v1, v2}, Lcom/hmobile/twitter/SocialException$SocialExceptionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ContextNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    new-instance v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    const-string v1, "APP_IdNotSet"

    invoke-direct {v0, v1, v3}, Lcom/hmobile/twitter/SocialException$SocialExceptionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->APP_IdNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    new-instance v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    const-string v1, "ConsumerDataNotSet"

    invoke-direct {v0, v1, v4}, Lcom/hmobile/twitter/SocialException$SocialExceptionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ConsumerDataNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    .line 15
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    sget-object v1, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ContextNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->APP_IdNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ConsumerDataNotSet:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ENUM$VALUES:[Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/hmobile/twitter/SocialException$SocialExceptionType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    return-object v0
.end method

.method public static values()[Lcom/hmobile/twitter/SocialException$SocialExceptionType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/hmobile/twitter/SocialException$SocialExceptionType;->ENUM$VALUES:[Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    array-length v1, v0

    new-array v2, v1, [Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
