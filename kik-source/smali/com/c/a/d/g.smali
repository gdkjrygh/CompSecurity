.class public final enum Lcom/c/a/d/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lcom/c/a/d/g;

.field private static final synthetic b:[Lcom/c/a/d/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 27
    new-instance v0, Lcom/c/a/d/g;

    const-string v1, "APPEND"

    invoke-direct {v0, v1}, Lcom/c/a/d/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/a/d/g;->a:Lcom/c/a/d/g;

    .line 25
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/c/a/d/g;

    const/4 v1, 0x0

    sget-object v2, Lcom/c/a/d/g;->a:Lcom/c/a/d/g;

    aput-object v2, v0, v1

    sput-object v0, Lcom/c/a/d/g;->b:[Lcom/c/a/d/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/a/d/g;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/c/a/d/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/a/d/g;

    return-object v0
.end method

.method public static values()[Lcom/c/a/d/g;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/c/a/d/g;->b:[Lcom/c/a/d/g;

    invoke-virtual {v0}, [Lcom/c/a/d/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/a/d/g;

    return-object v0
.end method
