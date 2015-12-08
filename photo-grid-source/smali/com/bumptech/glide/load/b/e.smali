.class public final enum Lcom/bumptech/glide/load/b/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/bumptech/glide/load/b/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/bumptech/glide/load/b/e;

.field public static final enum b:Lcom/bumptech/glide/load/b/e;

.field public static final enum c:Lcom/bumptech/glide/load/b/e;

.field public static final enum d:Lcom/bumptech/glide/load/b/e;

.field private static final synthetic g:[Lcom/bumptech/glide/load/b/e;


# instance fields
.field private final e:Z

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lcom/bumptech/glide/load/b/e;

    const-string v1, "ALL"

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/bumptech/glide/load/b/e;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lcom/bumptech/glide/load/b/e;->a:Lcom/bumptech/glide/load/b/e;

    .line 10
    new-instance v0, Lcom/bumptech/glide/load/b/e;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v3, v2, v2}, Lcom/bumptech/glide/load/b/e;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lcom/bumptech/glide/load/b/e;->b:Lcom/bumptech/glide/load/b/e;

    .line 12
    new-instance v0, Lcom/bumptech/glide/load/b/e;

    const-string v1, "SOURCE"

    invoke-direct {v0, v1, v4, v3, v2}, Lcom/bumptech/glide/load/b/e;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    .line 14
    new-instance v0, Lcom/bumptech/glide/load/b/e;

    const-string v1, "RESULT"

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/bumptech/glide/load/b/e;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lcom/bumptech/glide/load/b/e;->d:Lcom/bumptech/glide/load/b/e;

    .line 6
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/bumptech/glide/load/b/e;

    sget-object v1, Lcom/bumptech/glide/load/b/e;->a:Lcom/bumptech/glide/load/b/e;

    aput-object v1, v0, v2

    sget-object v1, Lcom/bumptech/glide/load/b/e;->b:Lcom/bumptech/glide/load/b/e;

    aput-object v1, v0, v3

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    aput-object v1, v0, v4

    sget-object v1, Lcom/bumptech/glide/load/b/e;->d:Lcom/bumptech/glide/load/b/e;

    aput-object v1, v0, v5

    sput-object v0, Lcom/bumptech/glide/load/b/e;->g:[Lcom/bumptech/glide/load/b/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    iput-boolean p3, p0, Lcom/bumptech/glide/load/b/e;->e:Z

    .line 21
    iput-boolean p4, p0, Lcom/bumptech/glide/load/b/e;->f:Z

    .line 22
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bumptech/glide/load/b/e;
    .locals 1

    .prologue
    .line 6
    const-class v0, Lcom/bumptech/glide/load/b/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/b/e;

    return-object v0
.end method

.method public static values()[Lcom/bumptech/glide/load/b/e;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/bumptech/glide/load/b/e;->g:[Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0}, [Lcom/bumptech/glide/load/b/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bumptech/glide/load/b/e;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 28
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/e;->e:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/e;->f:Z

    return v0
.end method
