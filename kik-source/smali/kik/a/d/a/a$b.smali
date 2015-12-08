.class public final enum Lkik/a/d/a/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/d/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lkik/a/d/a/a$b;

.field public static final enum b:Lkik/a/d/a/a$b;

.field public static final enum c:Lkik/a/d/a/a$b;

.field public static final enum d:Lkik/a/d/a/a$b;

.field public static final enum e:Lkik/a/d/a/a$b;

.field public static final enum f:Lkik/a/d/a/a$b;

.field private static final synthetic h:[Lkik/a/d/a/a$b;


# instance fields
.field g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 89
    new-instance v0, Lkik/a/d/a/a$b;

    const-string v1, "CONTENT_LAYOUT_DEFAULT"

    const-string v2, ""

    invoke-direct {v0, v1, v4, v2}, Lkik/a/d/a/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/a/d/a/a$b;->a:Lkik/a/d/a/a$b;

    new-instance v0, Lkik/a/d/a/a$b;

    const-string v1, "CONTENT_LAYOUT_PHOTO"

    const-string v2, "photo"

    invoke-direct {v0, v1, v5, v2}, Lkik/a/d/a/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    new-instance v0, Lkik/a/d/a/a$b;

    const-string v1, "CONTENT_LAYOUT_ARTICLE"

    const-string v2, "article"

    invoke-direct {v0, v1, v6, v2}, Lkik/a/d/a/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    .line 90
    new-instance v0, Lkik/a/d/a/a$b;

    const-string v1, "CONTENT_LAYOUT_FULL_BLEED"

    const-string v2, "full_bleed"

    invoke-direct {v0, v1, v7, v2}, Lkik/a/d/a/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/a/d/a/a$b;->d:Lkik/a/d/a/a$b;

    new-instance v0, Lkik/a/d/a/a$b;

    const-string v1, "CONTENT_LAYOUT_VIDEO"

    const-string v2, "video"

    invoke-direct {v0, v1, v8, v2}, Lkik/a/d/a/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    new-instance v0, Lkik/a/d/a/a$b;

    const-string v1, "CONTENT_LAYOUT_BANNER"

    const/4 v2, 0x5

    const-string v3, "banner"

    invoke-direct {v0, v1, v2, v3}, Lkik/a/d/a/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/a/d/a/a$b;->f:Lkik/a/d/a/a$b;

    .line 88
    const/4 v0, 0x6

    new-array v0, v0, [Lkik/a/d/a/a$b;

    sget-object v1, Lkik/a/d/a/a$b;->a:Lkik/a/d/a/a$b;

    aput-object v1, v0, v4

    sget-object v1, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    aput-object v1, v0, v5

    sget-object v1, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    aput-object v1, v0, v6

    sget-object v1, Lkik/a/d/a/a$b;->d:Lkik/a/d/a/a$b;

    aput-object v1, v0, v7

    sget-object v1, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lkik/a/d/a/a$b;->f:Lkik/a/d/a/a$b;

    aput-object v2, v0, v1

    sput-object v0, Lkik/a/d/a/a$b;->h:[Lkik/a/d/a/a$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 95
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 96
    iput-object p3, p0, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/a/d/a/a$b;
    .locals 1

    .prologue
    .line 88
    const-class v0, Lkik/a/d/a/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a$b;

    return-object v0
.end method

.method public static values()[Lkik/a/d/a/a$b;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lkik/a/d/a/a$b;->h:[Lkik/a/d/a/a$b;

    invoke-virtual {v0}, [Lkik/a/d/a/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/a/d/a/a$b;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Lkik/a/d/a/a$b;)Z
    .locals 2

    .prologue
    .line 106
    if-nez p1, :cond_0

    .line 107
    const/4 v0, 0x0

    .line 110
    :goto_0
    return v0

    :cond_0
    iget-object v0, p1, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method
