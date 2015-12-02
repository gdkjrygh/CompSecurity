.class public final enum Lcom/facebook/orca/a/b;
.super Ljava/lang/Enum;
.source "GroupNameUpsellType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/a/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/a/b;

.field public static final enum ANY_THREAD:Lcom/facebook/orca/a/b;

.field private static final LOOK_UP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/a/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum NEW_THREAD:Lcom/facebook/orca/a/b;

.field public static final enum NONE:Lcom/facebook/orca/a/b;


# instance fields
.field private final mValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 15
    new-instance v0, Lcom/facebook/orca/a/b;

    const-string v1, "NONE"

    const-string v2, "none"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/orca/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/a/b;->NONE:Lcom/facebook/orca/a/b;

    .line 16
    new-instance v0, Lcom/facebook/orca/a/b;

    const-string v1, "NEW_THREAD"

    const-string v2, "new_thread"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/orca/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/a/b;->NEW_THREAD:Lcom/facebook/orca/a/b;

    .line 17
    new-instance v0, Lcom/facebook/orca/a/b;

    const-string v1, "ANY_THREAD"

    const-string v2, "any_thread"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/orca/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/a/b;->ANY_THREAD:Lcom/facebook/orca/a/b;

    .line 14
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/a/b;

    sget-object v1, Lcom/facebook/orca/a/b;->NONE:Lcom/facebook/orca/a/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/a/b;->NEW_THREAD:Lcom/facebook/orca/a/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/a/b;->ANY_THREAD:Lcom/facebook/orca/a/b;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/orca/a/b;->$VALUES:[Lcom/facebook/orca/a/b;

    .line 24
    const-string v0, "none"

    sget-object v1, Lcom/facebook/orca/a/b;->NONE:Lcom/facebook/orca/a/b;

    const-string v2, "new_thread"

    sget-object v3, Lcom/facebook/orca/a/b;->NEW_THREAD:Lcom/facebook/orca/a/b;

    const-string v4, "any_thread"

    sget-object v5, Lcom/facebook/orca/a/b;->ANY_THREAD:Lcom/facebook/orca/a/b;

    invoke-static/range {v0 .. v5}, Lcom/google/common/a/ev;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/a/b;->LOOK_UP:Ljava/util/Map;

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
    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21
    iput-object p3, p0, Lcom/facebook/orca/a/b;->mValue:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public static lookup(Ljava/lang/String;)Lcom/facebook/orca/a/b;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/orca/a/b;->LOOK_UP:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/b;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/a/b;
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/facebook/orca/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/a/b;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/orca/a/b;->$VALUES:[Lcom/facebook/orca/a/b;

    invoke-virtual {v0}, [Lcom/facebook/orca/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/a/b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/a/b;->mValue:Ljava/lang/String;

    return-object v0
.end method
