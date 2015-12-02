.class public final enum Lcom/facebook/ui/media/a/d;
.super Ljava/lang/Enum;
.source "MediaDownloader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ui/media/a/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/ui/media/a/d;

.field public static final enum DECODE_ERROR:Lcom/facebook/ui/media/a/d;

.field public static final enum FORBIDDEN:Lcom/facebook/ui/media/a/d;

.field public static final enum IO_EXCEPTION:Lcom/facebook/ui/media/a/d;

.field public static final enum NOT_FOUND:Lcom/facebook/ui/media/a/d;

.field public static final enum OTHER:Lcom/facebook/ui/media/a/d;

.field public static final enum SUCCESS:Lcom/facebook/ui/media/a/d;

.field public static final enum UNSUPPORTED_URI:Lcom/facebook/ui/media/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 45
    new-instance v0, Lcom/facebook/ui/media/a/d;

    const-string v1, "SUCCESS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/ui/media/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/a/d;->SUCCESS:Lcom/facebook/ui/media/a/d;

    .line 46
    new-instance v0, Lcom/facebook/ui/media/a/d;

    const-string v1, "IO_EXCEPTION"

    invoke-direct {v0, v1, v4}, Lcom/facebook/ui/media/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/a/d;->IO_EXCEPTION:Lcom/facebook/ui/media/a/d;

    .line 47
    new-instance v0, Lcom/facebook/ui/media/a/d;

    const-string v1, "DECODE_ERROR"

    invoke-direct {v0, v1, v5}, Lcom/facebook/ui/media/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/a/d;->DECODE_ERROR:Lcom/facebook/ui/media/a/d;

    .line 48
    new-instance v0, Lcom/facebook/ui/media/a/d;

    const-string v1, "NOT_FOUND"

    invoke-direct {v0, v1, v6}, Lcom/facebook/ui/media/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/a/d;->NOT_FOUND:Lcom/facebook/ui/media/a/d;

    .line 49
    new-instance v0, Lcom/facebook/ui/media/a/d;

    const-string v1, "UNSUPPORTED_URI"

    invoke-direct {v0, v1, v7}, Lcom/facebook/ui/media/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/a/d;->UNSUPPORTED_URI:Lcom/facebook/ui/media/a/d;

    .line 50
    new-instance v0, Lcom/facebook/ui/media/a/d;

    const-string v1, "FORBIDDEN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/media/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/a/d;->FORBIDDEN:Lcom/facebook/ui/media/a/d;

    .line 51
    new-instance v0, Lcom/facebook/ui/media/a/d;

    const-string v1, "OTHER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/media/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/a/d;->OTHER:Lcom/facebook/ui/media/a/d;

    .line 44
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/ui/media/a/d;

    sget-object v1, Lcom/facebook/ui/media/a/d;->SUCCESS:Lcom/facebook/ui/media/a/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/ui/media/a/d;->IO_EXCEPTION:Lcom/facebook/ui/media/a/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/ui/media/a/d;->DECODE_ERROR:Lcom/facebook/ui/media/a/d;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/ui/media/a/d;->NOT_FOUND:Lcom/facebook/ui/media/a/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/ui/media/a/d;->UNSUPPORTED_URI:Lcom/facebook/ui/media/a/d;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/ui/media/a/d;->FORBIDDEN:Lcom/facebook/ui/media/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/ui/media/a/d;->OTHER:Lcom/facebook/ui/media/a/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/ui/media/a/d;->$VALUES:[Lcom/facebook/ui/media/a/d;

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
    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ui/media/a/d;
    .locals 1

    .prologue
    .line 44
    const-class v0, Lcom/facebook/ui/media/a/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/a/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ui/media/a/d;
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lcom/facebook/ui/media/a/d;->$VALUES:[Lcom/facebook/ui/media/a/d;

    invoke-virtual {v0}, [Lcom/facebook/ui/media/a/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ui/media/a/d;

    return-object v0
.end method
