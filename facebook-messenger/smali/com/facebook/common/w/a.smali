.class public Lcom/facebook/common/w/a;
.super Ljava/lang/Object;
.source "BitmaskEnumUtil.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/common/w/a;

    sput-object v0, Lcom/facebook/common/w/a;->a:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Enum;)J
    .locals 2

    .prologue
    .line 50
    const/4 v0, 0x1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    shl-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public static a(Ljava/util/Set;)J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Enum",
            "<TT;>;>(",
            "Ljava/util/Set",
            "<TT;>;)J"
        }
    .end annotation

    .prologue
    .line 80
    const-wide/16 v0, 0x0

    .line 81
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-wide v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    .line 82
    invoke-static {v0}, Lcom/facebook/common/w/a;->a(Ljava/lang/Enum;)J

    move-result-wide v4

    or-long v0, v1, v4

    move-wide v1, v0

    goto :goto_0

    .line 84
    :cond_0
    return-wide v1
.end method
