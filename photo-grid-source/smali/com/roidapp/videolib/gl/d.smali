.class final enum Lcom/roidapp/videolib/gl/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/videolib/gl/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/videolib/gl/d;

.field public static final enum b:Lcom/roidapp/videolib/gl/d;

.field public static final enum c:Lcom/roidapp/videolib/gl/d;

.field public static final enum d:Lcom/roidapp/videolib/gl/d;

.field private static final synthetic e:[Lcom/roidapp/videolib/gl/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 135
    new-instance v0, Lcom/roidapp/videolib/gl/d;

    const-string v1, "init"

    invoke-direct {v0, v1, v2}, Lcom/roidapp/videolib/gl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/videolib/gl/d;->a:Lcom/roidapp/videolib/gl/d;

    new-instance v0, Lcom/roidapp/videolib/gl/d;

    const-string v1, "start"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/videolib/gl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    new-instance v0, Lcom/roidapp/videolib/gl/d;

    const-string v1, "pause"

    invoke-direct {v0, v1, v4}, Lcom/roidapp/videolib/gl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/videolib/gl/d;->c:Lcom/roidapp/videolib/gl/d;

    new-instance v0, Lcom/roidapp/videolib/gl/d;

    const-string v1, "stop"

    invoke-direct {v0, v1, v5}, Lcom/roidapp/videolib/gl/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/videolib/gl/d;->d:Lcom/roidapp/videolib/gl/d;

    .line 134
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/roidapp/videolib/gl/d;

    sget-object v1, Lcom/roidapp/videolib/gl/d;->a:Lcom/roidapp/videolib/gl/d;

    aput-object v1, v0, v2

    sget-object v1, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/videolib/gl/d;->c:Lcom/roidapp/videolib/gl/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/videolib/gl/d;->d:Lcom/roidapp/videolib/gl/d;

    aput-object v1, v0, v5

    sput-object v0, Lcom/roidapp/videolib/gl/d;->e:[Lcom/roidapp/videolib/gl/d;

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
    .line 134
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/videolib/gl/d;
    .locals 1

    .prologue
    .line 134
    const-class v0, Lcom/roidapp/videolib/gl/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/gl/d;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/videolib/gl/d;
    .locals 1

    .prologue
    .line 134
    sget-object v0, Lcom/roidapp/videolib/gl/d;->e:[Lcom/roidapp/videolib/gl/d;

    invoke-virtual {v0}, [Lcom/roidapp/videolib/gl/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/videolib/gl/d;

    return-object v0
.end method
