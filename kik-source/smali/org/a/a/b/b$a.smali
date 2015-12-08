.class final enum Lorg/a/a/b/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/a/a/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lorg/a/a/b/b$a;

.field private static final synthetic b:[Lorg/a/a/b/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 480
    new-instance v0, Lorg/a/a/b/b$a;

    const-string v1, "INSTANCE"

    invoke-direct {v0, v1}, Lorg/a/a/b/b$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/a/a/b/b$a;->a:Lorg/a/a/b/b$a;

    .line 479
    const/4 v0, 0x1

    new-array v0, v0, [Lorg/a/a/b/b$a;

    const/4 v1, 0x0

    sget-object v2, Lorg/a/a/b/b$a;->a:Lorg/a/a/b/b$a;

    aput-object v2, v0, v1

    sput-object v0, Lorg/a/a/b/b$a;->b:[Lorg/a/a/b/b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 479
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/a/a/b/b$a;
    .locals 1

    .prologue
    .line 479
    const-class v0, Lorg/a/a/b/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/b$a;

    return-object v0
.end method

.method public static final values()[Lorg/a/a/b/b$a;
    .locals 1

    .prologue
    .line 479
    sget-object v0, Lorg/a/a/b/b$a;->b:[Lorg/a/a/b/b$a;

    invoke-virtual {v0}, [Lorg/a/a/b/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/a/a/b/b$a;

    return-object v0
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 489
    check-cast p1, Ljava/lang/Comparable;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
