.class abstract enum Lcom/c/a/c/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/c/a/c/c$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/c/d$a;
    }
.end annotation


# static fields
.field public static final enum a:Lcom/c/a/c/d;

.field public static final enum b:Lcom/c/a/c/d;

.field private static final synthetic c:[Lcom/c/a/c/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 44
    new-instance v0, Lcom/c/a/c/e;

    const-string v1, "MURMUR128_MITZ_32"

    invoke-direct {v0, v1}, Lcom/c/a/c/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/c/d;->a:Lcom/c/a/c/d;

    .line 90
    new-instance v0, Lcom/c/a/c/f;

    const-string v1, "MURMUR128_MITZ_64"

    invoke-direct {v0, v1}, Lcom/c/a/c/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/c/d;->b:Lcom/c/a/c/d;

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/c/a/c/d;

    const/4 v1, 0x0

    sget-object v2, Lcom/c/a/c/d;->a:Lcom/c/a/c/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/c/a/c/d;->b:Lcom/c/a/c/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/c/a/c/d;->c:[Lcom/c/a/c/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 140
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/c/a/c/d;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/a/c/d;
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/c/a/c/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/a/c/d;

    return-object v0
.end method

.method public static values()[Lcom/c/a/c/d;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/c/a/c/d;->c:[Lcom/c/a/c/d;

    invoke-virtual {v0}, [Lcom/c/a/c/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/a/c/d;

    return-object v0
.end method
