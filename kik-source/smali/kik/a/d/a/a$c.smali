.class public final enum Lkik/a/d/a/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/d/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum a:Lkik/a/d/a/a$c;

.field public static final enum b:Lkik/a/d/a/a$c;

.field public static final enum c:Lkik/a/d/a/a$c;

.field public static final enum d:Lkik/a/d/a/a$c;

.field public static final enum e:Lkik/a/d/a/a$c;

.field public static final enum f:Lkik/a/d/a/a$c;

.field private static final synthetic g:[Lkik/a/d/a/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 64
    new-instance v0, Lkik/a/d/a/a$c;

    const-string v1, "WebM"

    invoke-direct {v0, v1, v3}, Lkik/a/d/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/a$c;->a:Lkik/a/d/a/a$c;

    .line 65
    new-instance v0, Lkik/a/d/a/a$c;

    const-string v1, "TinyWebM"

    invoke-direct {v0, v1, v4}, Lkik/a/d/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/a$c;->b:Lkik/a/d/a/a$c;

    .line 66
    new-instance v0, Lkik/a/d/a/a$c;

    const-string v1, "MP4"

    invoke-direct {v0, v1, v5}, Lkik/a/d/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/a$c;->c:Lkik/a/d/a/a$c;

    .line 67
    new-instance v0, Lkik/a/d/a/a$c;

    const-string v1, "TinyMP4"

    invoke-direct {v0, v1, v6}, Lkik/a/d/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/a$c;->d:Lkik/a/d/a/a$c;

    .line 68
    new-instance v0, Lkik/a/d/a/a$c;

    const-string v1, "NanoMP4"

    invoke-direct {v0, v1, v7}, Lkik/a/d/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/a$c;->e:Lkik/a/d/a/a$c;

    .line 69
    new-instance v0, Lkik/a/d/a/a$c;

    const-string v1, "NanoWebM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lkik/a/d/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/a$c;->f:Lkik/a/d/a/a$c;

    .line 63
    const/4 v0, 0x6

    new-array v0, v0, [Lkik/a/d/a/a$c;

    sget-object v1, Lkik/a/d/a/a$c;->a:Lkik/a/d/a/a$c;

    aput-object v1, v0, v3

    sget-object v1, Lkik/a/d/a/a$c;->b:Lkik/a/d/a/a$c;

    aput-object v1, v0, v4

    sget-object v1, Lkik/a/d/a/a$c;->c:Lkik/a/d/a/a$c;

    aput-object v1, v0, v5

    sget-object v1, Lkik/a/d/a/a$c;->d:Lkik/a/d/a/a$c;

    aput-object v1, v0, v6

    sget-object v1, Lkik/a/d/a/a$c;->e:Lkik/a/d/a/a$c;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lkik/a/d/a/a$c;->f:Lkik/a/d/a/a$c;

    aput-object v2, v0, v1

    sput-object v0, Lkik/a/d/a/a$c;->g:[Lkik/a/d/a/a$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/a/d/a/a$c;
    .locals 1

    .prologue
    .line 63
    const-class v0, Lkik/a/d/a/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a$c;

    return-object v0
.end method

.method public static values()[Lkik/a/d/a/a$c;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lkik/a/d/a/a$c;->g:[Lkik/a/d/a/a$c;

    invoke-virtual {v0}, [Lkik/a/d/a/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/a/d/a/a$c;

    return-object v0
.end method
