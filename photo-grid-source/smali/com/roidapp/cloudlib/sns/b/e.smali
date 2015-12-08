.class public final enum Lcom/roidapp/cloudlib/sns/b/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/cloudlib/sns/b/e;

.field public static final enum b:Lcom/roidapp/cloudlib/sns/b/e;

.field private static final synthetic d:[Lcom/roidapp/cloudlib/sns/b/e;


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 27
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/e;

    const-string v1, "GRADIENT"

    const-string v2, "gradient"

    invoke-direct {v0, v1, v3, v2}, Lcom/roidapp/cloudlib/sns/b/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/e;->a:Lcom/roidapp/cloudlib/sns/b/e;

    .line 28
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/e;

    const-string v1, "BACKGROUND"

    const-string v2, "background"

    invoke-direct {v0, v1, v4, v2}, Lcom/roidapp/cloudlib/sns/b/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/e;->b:Lcom/roidapp/cloudlib/sns/b/e;

    .line 26
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/b/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/e;->a:Lcom/roidapp/cloudlib/sns/b/e;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/e;->b:Lcom/roidapp/cloudlib/sns/b/e;

    aput-object v1, v0, v4

    sput-object v0, Lcom/roidapp/cloudlib/sns/b/e;->d:[Lcom/roidapp/cloudlib/sns/b/e;

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
    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/b/e;->c:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/b/e;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/roidapp/cloudlib/sns/b/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/e;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/cloudlib/sns/b/e;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/e;->d:[Lcom/roidapp/cloudlib/sns/b/e;

    invoke-virtual {v0}, [Lcom/roidapp/cloudlib/sns/b/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/cloudlib/sns/b/e;

    return-object v0
.end method


# virtual methods
.method final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/e;->c:Ljava/lang/String;

    return-object v0
.end method
