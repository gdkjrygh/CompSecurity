.class public final enum Lcom/roidapp/cloudlib/sns/b/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/cloudlib/sns/b/c;

.field public static final enum b:Lcom/roidapp/cloudlib/sns/b/c;

.field public static final enum c:Lcom/roidapp/cloudlib/sns/b/c;

.field private static final synthetic d:[Lcom/roidapp/cloudlib/sns/b/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 7
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/c;

    const-string v1, "FOLLOW_ING"

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/c;->a:Lcom/roidapp/cloudlib/sns/b/c;

    .line 8
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/c;

    const-string v1, "FOLLOW_YES"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/cloudlib/sns/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    .line 9
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/c;

    const-string v1, "FOLLOW_NO"

    invoke-direct {v0, v1, v4}, Lcom/roidapp/cloudlib/sns/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    .line 6
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/b/c;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->a:Lcom/roidapp/cloudlib/sns/b/c;

    aput-object v1, v0, v2

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    aput-object v1, v0, v4

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/c;->d:[Lcom/roidapp/cloudlib/sns/b/c;

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
    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/b/c;
    .locals 1

    .prologue
    .line 6
    const-class v0, Lcom/roidapp/cloudlib/sns/b/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/c;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/cloudlib/sns/b/c;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->d:[Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0}, [Lcom/roidapp/cloudlib/sns/b/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/cloudlib/sns/b/c;

    return-object v0
.end method
