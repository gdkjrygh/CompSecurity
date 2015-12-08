.class final enum Lcom/roidapp/photogrid/video/aa;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/photogrid/video/aa;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/photogrid/video/aa;

.field public static final enum b:Lcom/roidapp/photogrid/video/aa;

.field public static final enum c:Lcom/roidapp/photogrid/video/aa;

.field public static final enum d:Lcom/roidapp/photogrid/video/aa;

.field public static final enum e:Lcom/roidapp/photogrid/video/aa;

.field public static final enum f:Lcom/roidapp/photogrid/video/aa;

.field private static final synthetic g:[Lcom/roidapp/photogrid/video/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 80
    new-instance v0, Lcom/roidapp/photogrid/video/aa;

    const-string v1, "None"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/photogrid/video/aa;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    .line 81
    new-instance v0, Lcom/roidapp/photogrid/video/aa;

    const-string v1, "Preparing"

    invoke-direct {v0, v1, v4}, Lcom/roidapp/photogrid/video/aa;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/photogrid/video/aa;->b:Lcom/roidapp/photogrid/video/aa;

    .line 82
    new-instance v0, Lcom/roidapp/photogrid/video/aa;

    const-string v1, "Prepared"

    invoke-direct {v0, v1, v5}, Lcom/roidapp/photogrid/video/aa;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    .line 83
    new-instance v0, Lcom/roidapp/photogrid/video/aa;

    const-string v1, "Updating"

    invoke-direct {v0, v1, v6}, Lcom/roidapp/photogrid/video/aa;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/photogrid/video/aa;->d:Lcom/roidapp/photogrid/video/aa;

    .line 84
    new-instance v0, Lcom/roidapp/photogrid/video/aa;

    const-string v1, "Done"

    invoke-direct {v0, v1, v7}, Lcom/roidapp/photogrid/video/aa;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/photogrid/video/aa;->e:Lcom/roidapp/photogrid/video/aa;

    .line 85
    new-instance v0, Lcom/roidapp/photogrid/video/aa;

    const-string v1, "Error"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/video/aa;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    .line 79
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/roidapp/photogrid/video/aa;

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->b:Lcom/roidapp/photogrid/video/aa;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    aput-object v1, v0, v5

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->d:Lcom/roidapp/photogrid/video/aa;

    aput-object v1, v0, v6

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->e:Lcom/roidapp/photogrid/video/aa;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    aput-object v2, v0, v1

    sput-object v0, Lcom/roidapp/photogrid/video/aa;->g:[Lcom/roidapp/photogrid/video/aa;

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
    .line 79
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/photogrid/video/aa;
    .locals 1

    .prologue
    .line 79
    const-class v0, Lcom/roidapp/photogrid/video/aa;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/aa;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/photogrid/video/aa;
    .locals 1

    .prologue
    .line 79
    sget-object v0, Lcom/roidapp/photogrid/video/aa;->g:[Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v0}, [Lcom/roidapp/photogrid/video/aa;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/video/aa;

    return-object v0
.end method
