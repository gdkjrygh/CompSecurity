.class public final enum Lcom/roidapp/cloudlib/sns/g/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/cloudlib/sns/g/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/cloudlib/sns/g/e;

.field public static final enum b:Lcom/roidapp/cloudlib/sns/g/e;

.field public static final enum c:Lcom/roidapp/cloudlib/sns/g/e;

.field public static final enum d:Lcom/roidapp/cloudlib/sns/g/e;

.field public static final enum e:Lcom/roidapp/cloudlib/sns/g/e;

.field private static final synthetic f:[Lcom/roidapp/cloudlib/sns/g/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 7
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/e;

    const-string v1, "Follow"

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/g/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    .line 8
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/e;

    const-string v1, "Post"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/cloudlib/sns/g/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/e;->b:Lcom/roidapp/cloudlib/sns/g/e;

    .line 9
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/e;

    const-string v1, "PostDeleted"

    invoke-direct {v0, v1, v4}, Lcom/roidapp/cloudlib/sns/g/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    .line 10
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/e;

    const-string v1, "Profile"

    invoke-direct {v0, v1, v5}, Lcom/roidapp/cloudlib/sns/g/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    .line 11
    new-instance v0, Lcom/roidapp/cloudlib/sns/g/e;

    const-string v1, "Logout"

    invoke-direct {v0, v1, v6}, Lcom/roidapp/cloudlib/sns/g/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/e;->e:Lcom/roidapp/cloudlib/sns/g/e;

    .line 6
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v2

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->b:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v5

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->e:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v6

    sput-object v0, Lcom/roidapp/cloudlib/sns/g/e;->f:[Lcom/roidapp/cloudlib/sns/g/e;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/g/e;
    .locals 1

    .prologue
    .line 6
    const-class v0, Lcom/roidapp/cloudlib/sns/g/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/g/e;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/cloudlib/sns/g/e;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->f:[Lcom/roidapp/cloudlib/sns/g/e;

    invoke-virtual {v0}, [Lcom/roidapp/cloudlib/sns/g/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/cloudlib/sns/g/e;

    return-object v0
.end method
