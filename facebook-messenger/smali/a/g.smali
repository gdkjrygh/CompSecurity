.class public La/g;
.super Ljava/lang/Object;
.source "DiffUtils.java"


# static fields
.field private static a:La/f;

.field private static b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, La/a/d;

    invoke-direct {v0}, La/a/d;-><init>()V

    sput-object v0, La/g;->a:La/f;

    .line 33
    const-string v0, "^@@\\s+-(?:(\\d+)(?:,(\\d+))?)\\s+\\+(?:(\\d+)(?:,(\\d+))?)\\s+@@$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La/g;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/List;)La/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<*>;",
            "Ljava/util/List",
            "<*>;)",
            "La/i;"
        }
    .end annotation

    .prologue
    .line 44
    sget-object v0, La/g;->a:La/f;

    invoke-static {p0, p1, v0}, La/g;->a(Ljava/util/List;Ljava/util/List;La/f;)La/i;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/List;Ljava/util/List;La/f;)La/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<*>;",
            "Ljava/util/List",
            "<*>;",
            "La/f;",
            ")",
            "La/i;"
        }
    .end annotation

    .prologue
    .line 56
    invoke-interface {p2, p0, p1}, La/f;->a(Ljava/util/List;Ljava/util/List;)La/i;

    move-result-object v0

    return-object v0
.end method
