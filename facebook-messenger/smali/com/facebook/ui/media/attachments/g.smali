.class public final enum Lcom/facebook/ui/media/attachments/g;
.super Ljava/lang/Enum;
.source "MediaResource.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ui/media/attachments/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/ui/media/attachments/g;

.field public static final enum AUDIO:Lcom/facebook/ui/media/attachments/g;

.field public static final enum PHOTO:Lcom/facebook/ui/media/attachments/g;

.field public static final enum TEXT:Lcom/facebook/ui/media/attachments/g;

.field public static final enum VIDEO:Lcom/facebook/ui/media/attachments/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 31
    new-instance v0, Lcom/facebook/ui/media/attachments/g;

    const-string v1, "PHOTO"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/media/attachments/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    new-instance v0, Lcom/facebook/ui/media/attachments/g;

    const-string v1, "VIDEO"

    invoke-direct {v0, v1, v3}, Lcom/facebook/ui/media/attachments/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/attachments/g;->VIDEO:Lcom/facebook/ui/media/attachments/g;

    new-instance v0, Lcom/facebook/ui/media/attachments/g;

    const-string v1, "AUDIO"

    invoke-direct {v0, v1, v4}, Lcom/facebook/ui/media/attachments/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    new-instance v0, Lcom/facebook/ui/media/attachments/g;

    const-string v1, "TEXT"

    invoke-direct {v0, v1, v5}, Lcom/facebook/ui/media/attachments/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/media/attachments/g;->TEXT:Lcom/facebook/ui/media/attachments/g;

    .line 30
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/ui/media/attachments/g;

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->VIDEO:Lcom/facebook/ui/media/attachments/g;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/ui/media/attachments/g;->TEXT:Lcom/facebook/ui/media/attachments/g;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/ui/media/attachments/g;->$VALUES:[Lcom/facebook/ui/media/attachments/g;

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
    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/g;
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/ui/media/attachments/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ui/media/attachments/g;
    .locals 1

    .prologue
    .line 30
    sget-object v0, Lcom/facebook/ui/media/attachments/g;->$VALUES:[Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0}, [Lcom/facebook/ui/media/attachments/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ui/media/attachments/g;

    return-object v0
.end method
