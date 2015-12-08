.class abstract enum Lcom/c/a/a/w$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/c/a/a/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/a/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4408
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lcom/c/a/a/w$b;

.field public static final enum b:Lcom/c/a/a/w$b;

.field public static final enum c:Lcom/c/a/a/w$b;

.field public static final enum d:Lcom/c/a/a/w$b;

.field private static final synthetic e:[Lcom/c/a/a/w$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 277
    new-instance v0, Lcom/c/a/a/x;

    const-string v1, "ALWAYS_TRUE"

    invoke-direct {v0, v1}, Lcom/c/a/a/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/w$b;->a:Lcom/c/a/a/w$b;

    .line 286
    new-instance v0, Lcom/c/a/a/y;

    const-string v1, "ALWAYS_FALSE"

    invoke-direct {v0, v1}, Lcom/c/a/a/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/w$b;->b:Lcom/c/a/a/w$b;

    .line 295
    new-instance v0, Lcom/c/a/a/z;

    const-string v1, "IS_NULL"

    invoke-direct {v0, v1}, Lcom/c/a/a/z;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/w$b;->c:Lcom/c/a/a/w$b;

    .line 304
    new-instance v0, Lcom/c/a/a/aa;

    const-string v1, "NOT_NULL"

    invoke-direct {v0, v1}, Lcom/c/a/a/aa;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/a/w$b;->d:Lcom/c/a/a/w$b;

    .line 275
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/c/a/a/w$b;

    const/4 v1, 0x0

    sget-object v2, Lcom/c/a/a/w$b;->a:Lcom/c/a/a/w$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/c/a/a/w$b;->b:Lcom/c/a/a/w$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/c/a/a/w$b;->c:Lcom/c/a/a/w$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/c/a/a/w$b;->d:Lcom/c/a/a/w$b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/c/a/a/w$b;->e:[Lcom/c/a/a/w$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 275
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 275
    invoke-direct {p0, p1, p2}, Lcom/c/a/a/w$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/a/a/w$b;
    .locals 1

    .prologue
    .line 275
    const-class v0, Lcom/c/a/a/w$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/a/a/w$b;

    return-object v0
.end method

.method public static values()[Lcom/c/a/a/w$b;
    .locals 1

    .prologue
    .line 275
    sget-object v0, Lcom/c/a/a/w$b;->e:[Lcom/c/a/a/w$b;

    invoke-virtual {v0}, [Lcom/c/a/a/w$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/a/a/w$b;

    return-object v0
.end method
