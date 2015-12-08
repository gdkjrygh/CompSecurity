.class public enum Lcom/bumptech/glide/load/b/c/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/bumptech/glide/load/b/c/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/bumptech/glide/load/b/c/e;

.field public static final enum b:Lcom/bumptech/glide/load/b/c/e;

.field public static final enum c:Lcom/bumptech/glide/load/b/c/e;

.field private static final synthetic d:[Lcom/bumptech/glide/load/b/c/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 31
    new-instance v0, Lcom/bumptech/glide/load/b/c/e;

    const-string v1, "IGNORE"

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/b/c/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bumptech/glide/load/b/c/e;->a:Lcom/bumptech/glide/load/b/c/e;

    .line 33
    new-instance v0, Lcom/bumptech/glide/load/b/c/f;

    const-string v1, "LOG"

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/b/c/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/bumptech/glide/load/b/c/e;->b:Lcom/bumptech/glide/load/b/c/e;

    .line 42
    new-instance v0, Lcom/bumptech/glide/load/b/c/g;

    const-string v1, "THROW"

    invoke-direct {v0, v1}, Lcom/bumptech/glide/load/b/c/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/bumptech/glide/load/b/c/e;->c:Lcom/bumptech/glide/load/b/c/e;

    .line 29
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/bumptech/glide/load/b/c/e;

    sget-object v1, Lcom/bumptech/glide/load/b/c/e;->a:Lcom/bumptech/glide/load/b/c/e;

    aput-object v1, v0, v2

    const/4 v1, 0x1

    sget-object v2, Lcom/bumptech/glide/load/b/c/e;->b:Lcom/bumptech/glide/load/b/c/e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/bumptech/glide/load/b/c/e;->c:Lcom/bumptech/glide/load/b/c/e;

    aput-object v2, v0, v1

    sput-object v0, Lcom/bumptech/glide/load/b/c/e;->d:[Lcom/bumptech/glide/load/b/c/e;

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

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/load/b/c/e;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bumptech/glide/load/b/c/e;
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/bumptech/glide/load/b/c/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/b/c/e;

    return-object v0
.end method

.method public static values()[Lcom/bumptech/glide/load/b/c/e;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/bumptech/glide/load/b/c/e;->d:[Lcom/bumptech/glide/load/b/c/e;

    invoke-virtual {v0}, [Lcom/bumptech/glide/load/b/c/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bumptech/glide/load/b/c/e;

    return-object v0
.end method


# virtual methods
.method protected a(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 52
    return-void
.end method
