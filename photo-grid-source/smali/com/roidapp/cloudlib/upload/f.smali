.class public final enum Lcom/roidapp/cloudlib/upload/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/cloudlib/upload/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/cloudlib/upload/f;

.field public static final enum b:Lcom/roidapp/cloudlib/upload/f;

.field public static final enum c:Lcom/roidapp/cloudlib/upload/f;

.field public static final enum d:Lcom/roidapp/cloudlib/upload/f;

.field private static final synthetic e:[Lcom/roidapp/cloudlib/upload/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    new-instance v0, Lcom/roidapp/cloudlib/upload/f;

    const-string v1, "WAITING"

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/upload/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/upload/f;->a:Lcom/roidapp/cloudlib/upload/f;

    .line 31
    new-instance v0, Lcom/roidapp/cloudlib/upload/f;

    const-string v1, "UPLOADING"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/cloudlib/upload/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/upload/f;->b:Lcom/roidapp/cloudlib/upload/f;

    .line 32
    new-instance v0, Lcom/roidapp/cloudlib/upload/f;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v4}, Lcom/roidapp/cloudlib/upload/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    .line 33
    new-instance v0, Lcom/roidapp/cloudlib/upload/f;

    const-string v1, "SUCCESSED"

    invoke-direct {v0, v1, v5}, Lcom/roidapp/cloudlib/upload/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    .line 29
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/roidapp/cloudlib/upload/f;

    sget-object v1, Lcom/roidapp/cloudlib/upload/f;->a:Lcom/roidapp/cloudlib/upload/f;

    aput-object v1, v0, v2

    sget-object v1, Lcom/roidapp/cloudlib/upload/f;->b:Lcom/roidapp/cloudlib/upload/f;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/cloudlib/upload/f;->c:Lcom/roidapp/cloudlib/upload/f;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/cloudlib/upload/f;->d:Lcom/roidapp/cloudlib/upload/f;

    aput-object v1, v0, v5

    sput-object v0, Lcom/roidapp/cloudlib/upload/f;->e:[Lcom/roidapp/cloudlib/upload/f;

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
    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/cloudlib/upload/f;
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/roidapp/cloudlib/upload/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/upload/f;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/cloudlib/upload/f;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/roidapp/cloudlib/upload/f;->e:[Lcom/roidapp/cloudlib/upload/f;

    invoke-virtual {v0}, [Lcom/roidapp/cloudlib/upload/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/cloudlib/upload/f;

    return-object v0
.end method
