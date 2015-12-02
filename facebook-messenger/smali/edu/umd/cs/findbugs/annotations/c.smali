.class public final enum Ledu/umd/cs/findbugs/annotations/c;
.super Ljava/lang/Enum;
.source "When.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Ledu/umd/cs/findbugs/annotations/c;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ledu/umd/cs/findbugs/annotations/c;

.field public static final enum ANYTIME:Ledu/umd/cs/findbugs/annotations/c;

.field public static final enum FIRST:Ledu/umd/cs/findbugs/annotations/c;

.field public static final enum LAST:Ledu/umd/cs/findbugs/annotations/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27
    new-instance v0, Ledu/umd/cs/findbugs/annotations/c;

    const-string v1, "FIRST"

    invoke-direct {v0, v1, v2}, Ledu/umd/cs/findbugs/annotations/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ledu/umd/cs/findbugs/annotations/c;->FIRST:Ledu/umd/cs/findbugs/annotations/c;

    new-instance v0, Ledu/umd/cs/findbugs/annotations/c;

    const-string v1, "ANYTIME"

    invoke-direct {v0, v1, v3}, Ledu/umd/cs/findbugs/annotations/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ledu/umd/cs/findbugs/annotations/c;->ANYTIME:Ledu/umd/cs/findbugs/annotations/c;

    new-instance v0, Ledu/umd/cs/findbugs/annotations/c;

    const-string v1, "LAST"

    invoke-direct {v0, v1, v4}, Ledu/umd/cs/findbugs/annotations/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ledu/umd/cs/findbugs/annotations/c;->LAST:Ledu/umd/cs/findbugs/annotations/c;

    .line 25
    const/4 v0, 0x3

    new-array v0, v0, [Ledu/umd/cs/findbugs/annotations/c;

    sget-object v1, Ledu/umd/cs/findbugs/annotations/c;->FIRST:Ledu/umd/cs/findbugs/annotations/c;

    aput-object v1, v0, v2

    sget-object v1, Ledu/umd/cs/findbugs/annotations/c;->ANYTIME:Ledu/umd/cs/findbugs/annotations/c;

    aput-object v1, v0, v3

    sget-object v1, Ledu/umd/cs/findbugs/annotations/c;->LAST:Ledu/umd/cs/findbugs/annotations/c;

    aput-object v1, v0, v4

    sput-object v0, Ledu/umd/cs/findbugs/annotations/c;->$VALUES:[Ledu/umd/cs/findbugs/annotations/c;

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
    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ledu/umd/cs/findbugs/annotations/c;
    .locals 1

    .prologue
    .line 25
    const-class v0, Ledu/umd/cs/findbugs/annotations/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ledu/umd/cs/findbugs/annotations/c;

    return-object v0
.end method

.method public static values()[Ledu/umd/cs/findbugs/annotations/c;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Ledu/umd/cs/findbugs/annotations/c;->$VALUES:[Ledu/umd/cs/findbugs/annotations/c;

    invoke-virtual {v0}, [Ledu/umd/cs/findbugs/annotations/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ledu/umd/cs/findbugs/annotations/c;

    return-object v0
.end method
