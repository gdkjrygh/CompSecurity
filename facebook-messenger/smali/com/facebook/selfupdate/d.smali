.class public final enum Lcom/facebook/selfupdate/d;
.super Ljava/lang/Enum;
.source "AppServerResponse.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/selfupdate/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/selfupdate/d;

.field public static final enum DEFAULT:Lcom/facebook/selfupdate/d;

.field public static final enum FORCE_UPDATE_NOTIFY_USER:Lcom/facebook/selfupdate/d;

.field public static final enum FORCE_UPDATE_SILENT:Lcom/facebook/selfupdate/d;

.field public static final enum NOTIFY_USER:Lcom/facebook/selfupdate/d;


# instance fields
.field public final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 13
    new-instance v0, Lcom/facebook/selfupdate/d;

    const-string v1, "NOTIFY_USER"

    invoke-direct {v0, v1, v6, v3}, Lcom/facebook/selfupdate/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/selfupdate/d;->NOTIFY_USER:Lcom/facebook/selfupdate/d;

    new-instance v0, Lcom/facebook/selfupdate/d;

    const-string v1, "FORCE_UPDATE_NOTIFY_USER"

    invoke-direct {v0, v1, v3, v4}, Lcom/facebook/selfupdate/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/selfupdate/d;->FORCE_UPDATE_NOTIFY_USER:Lcom/facebook/selfupdate/d;

    .line 14
    new-instance v0, Lcom/facebook/selfupdate/d;

    const-string v1, "FORCE_UPDATE_SILENT"

    invoke-direct {v0, v1, v4, v5}, Lcom/facebook/selfupdate/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/selfupdate/d;->FORCE_UPDATE_SILENT:Lcom/facebook/selfupdate/d;

    new-instance v0, Lcom/facebook/selfupdate/d;

    const-string v1, "DEFAULT"

    sget-object v2, Lcom/facebook/selfupdate/d;->NOTIFY_USER:Lcom/facebook/selfupdate/d;

    iget v2, v2, Lcom/facebook/selfupdate/d;->value:I

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/selfupdate/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/selfupdate/d;->DEFAULT:Lcom/facebook/selfupdate/d;

    .line 12
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/selfupdate/d;

    sget-object v1, Lcom/facebook/selfupdate/d;->NOTIFY_USER:Lcom/facebook/selfupdate/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/selfupdate/d;->FORCE_UPDATE_NOTIFY_USER:Lcom/facebook/selfupdate/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/selfupdate/d;->FORCE_UPDATE_SILENT:Lcom/facebook/selfupdate/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/selfupdate/d;->DEFAULT:Lcom/facebook/selfupdate/d;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/selfupdate/d;->$VALUES:[Lcom/facebook/selfupdate/d;

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
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/facebook/selfupdate/d;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/selfupdate/d;
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/facebook/selfupdate/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/selfupdate/d;
    .locals 1

    .prologue
    .line 12
    sget-object v0, Lcom/facebook/selfupdate/d;->$VALUES:[Lcom/facebook/selfupdate/d;

    invoke-virtual {v0}, [Lcom/facebook/selfupdate/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/selfupdate/d;

    return-object v0
.end method
