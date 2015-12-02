.class public final enum Ledu/umd/cs/findbugs/annotations/b;
.super Ljava/lang/Enum;
.source "Priority.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Ledu/umd/cs/findbugs/annotations/b;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ledu/umd/cs/findbugs/annotations/b;

.field public static final enum HIGH:Ledu/umd/cs/findbugs/annotations/b;

.field public static final enum IGNORE:Ledu/umd/cs/findbugs/annotations/b;

.field public static final enum LOW:Ledu/umd/cs/findbugs/annotations/b;

.field public static final enum MEDIUM:Ledu/umd/cs/findbugs/annotations/b;


# instance fields
.field private final priorityValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 29
    new-instance v0, Ledu/umd/cs/findbugs/annotations/b;

    const-string v1, "HIGH"

    invoke-direct {v0, v1, v6, v3}, Ledu/umd/cs/findbugs/annotations/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ledu/umd/cs/findbugs/annotations/b;->HIGH:Ledu/umd/cs/findbugs/annotations/b;

    new-instance v0, Ledu/umd/cs/findbugs/annotations/b;

    const-string v1, "MEDIUM"

    invoke-direct {v0, v1, v3, v4}, Ledu/umd/cs/findbugs/annotations/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ledu/umd/cs/findbugs/annotations/b;->MEDIUM:Ledu/umd/cs/findbugs/annotations/b;

    new-instance v0, Ledu/umd/cs/findbugs/annotations/b;

    const-string v1, "LOW"

    invoke-direct {v0, v1, v4, v5}, Ledu/umd/cs/findbugs/annotations/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ledu/umd/cs/findbugs/annotations/b;->LOW:Ledu/umd/cs/findbugs/annotations/b;

    new-instance v0, Ledu/umd/cs/findbugs/annotations/b;

    const-string v1, "IGNORE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v5, v2}, Ledu/umd/cs/findbugs/annotations/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ledu/umd/cs/findbugs/annotations/b;->IGNORE:Ledu/umd/cs/findbugs/annotations/b;

    .line 27
    const/4 v0, 0x4

    new-array v0, v0, [Ledu/umd/cs/findbugs/annotations/b;

    sget-object v1, Ledu/umd/cs/findbugs/annotations/b;->HIGH:Ledu/umd/cs/findbugs/annotations/b;

    aput-object v1, v0, v6

    sget-object v1, Ledu/umd/cs/findbugs/annotations/b;->MEDIUM:Ledu/umd/cs/findbugs/annotations/b;

    aput-object v1, v0, v3

    sget-object v1, Ledu/umd/cs/findbugs/annotations/b;->LOW:Ledu/umd/cs/findbugs/annotations/b;

    aput-object v1, v0, v4

    sget-object v1, Ledu/umd/cs/findbugs/annotations/b;->IGNORE:Ledu/umd/cs/findbugs/annotations/b;

    aput-object v1, v0, v5

    sput-object v0, Ledu/umd/cs/findbugs/annotations/b;->$VALUES:[Ledu/umd/cs/findbugs/annotations/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    iput p3, p0, Ledu/umd/cs/findbugs/annotations/b;->priorityValue:I

    .line 40
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ledu/umd/cs/findbugs/annotations/b;
    .locals 1

    .prologue
    .line 27
    const-class v0, Ledu/umd/cs/findbugs/annotations/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ledu/umd/cs/findbugs/annotations/b;

    return-object v0
.end method

.method public static values()[Ledu/umd/cs/findbugs/annotations/b;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Ledu/umd/cs/findbugs/annotations/b;->$VALUES:[Ledu/umd/cs/findbugs/annotations/b;

    invoke-virtual {v0}, [Ledu/umd/cs/findbugs/annotations/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ledu/umd/cs/findbugs/annotations/b;

    return-object v0
.end method


# virtual methods
.method public getPriorityValue()I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Ledu/umd/cs/findbugs/annotations/b;->priorityValue:I

    return v0
.end method
