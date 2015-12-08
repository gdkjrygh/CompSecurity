.class public final enum Lcom/roidapp/cloudlib/sns/b/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/cloudlib/sns/b/i;

.field public static final enum b:Lcom/roidapp/cloudlib/sns/b/i;

.field public static final enum c:Lcom/roidapp/cloudlib/sns/b/i;

.field public static final enum d:Lcom/roidapp/cloudlib/sns/b/i;

.field public static final enum e:Lcom/roidapp/cloudlib/sns/b/i;

.field private static final synthetic g:[Lcom/roidapp/cloudlib/sns/b/i;


# instance fields
.field private f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 9
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/i;

    const-string v1, "LIKE"

    const-string v2, "like"

    invoke-direct {v0, v1, v3, v2}, Lcom/roidapp/cloudlib/sns/b/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/i;->a:Lcom/roidapp/cloudlib/sns/b/i;

    .line 10
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/i;

    const-string v1, "FOLLOW"

    const-string v2, "attion"

    invoke-direct {v0, v1, v4, v2}, Lcom/roidapp/cloudlib/sns/b/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    .line 11
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/i;

    const-string v1, "COMMENT"

    const-string v2, "comment"

    invoke-direct {v0, v1, v5, v2}, Lcom/roidapp/cloudlib/sns/b/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/i;->c:Lcom/roidapp/cloudlib/sns/b/i;

    .line 12
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/i;

    const-string v1, "MENTION"

    const-string v2, "mention"

    invoke-direct {v0, v1, v6, v2}, Lcom/roidapp/cloudlib/sns/b/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/i;->d:Lcom/roidapp/cloudlib/sns/b/i;

    .line 13
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/i;

    const-string v1, "CMENTION"

    const-string v2, "cmention"

    invoke-direct {v0, v1, v7, v2}, Lcom/roidapp/cloudlib/sns/b/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/i;->e:Lcom/roidapp/cloudlib/sns/b/i;

    .line 8
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->a:Lcom/roidapp/cloudlib/sns/b/i;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->c:Lcom/roidapp/cloudlib/sns/b/i;

    aput-object v1, v0, v5

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->d:Lcom/roidapp/cloudlib/sns/b/i;

    aput-object v1, v0, v6

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->e:Lcom/roidapp/cloudlib/sns/b/i;

    aput-object v1, v0, v7

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/i;->g:[Lcom/roidapp/cloudlib/sns/b/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/b/i;->f:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/b/i;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/roidapp/cloudlib/sns/b/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/i;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/cloudlib/sns/b/i;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/i;->g:[Lcom/roidapp/cloudlib/sns/b/i;

    invoke-virtual {v0}, [Lcom/roidapp/cloudlib/sns/b/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/cloudlib/sns/b/i;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/i;->f:Ljava/lang/String;

    return-object v0
.end method
